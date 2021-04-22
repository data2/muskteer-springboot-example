package com.muskteer.mysql.jdbc.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by wanglei on 2018/2/26.
 */
@Repository
public class PersonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Person> getPersonList() {
        List<Person> people = jdbcTemplate.query(
                "select id, name from person", new RowPersonMapper());
        return people;
    }

    @Transactional
    public int savePerson(Person person) {
        return jdbcTemplate.update("insert into person(id,name) values(?,?)",
                new Object[]{person.getId(), person.getName()});
    }


    /**
     * 行映射
     */
    private class RowPersonMapper implements RowMapper<Person> {
        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            Person p = new Person();
            p.setId(resultSet.getInt("id"));
            p.setName(resultSet.getString("name"));
            return p;
        }
    }
}
