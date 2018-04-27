package com.muskteer;

import com.muskteer.multi.template.DataSourceConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataSourceConfig.class)
public class MultiJdbctemplateApplication {

	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate primaryJdbcTemplate;

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate secondaryJdbcTemplate;

	@Test
	public void test() throws Exception {
		primaryJdbcTemplate.update("select 1 from dual ");

	}


}

