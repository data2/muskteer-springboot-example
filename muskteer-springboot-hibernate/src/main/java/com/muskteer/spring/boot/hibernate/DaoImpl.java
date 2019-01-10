package com.muskteer.spring.boot.hibernate;

import com.linkage.UDPBusiness.po.UdpOrderInfo;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;


public class DaoImpl {
    private HibernateTemplate hibernateTemplate;

    public void test() {
        System.out.println(hibernateTemplate.get(UdpOrderInfo.class, "UDP1701010000126466111").getPayorderid());
        List<UdpOrderInfo> orders = (List<UdpOrderInfo>) hibernateTemplate.findByNamedParam(
                "from UdpOrderInfo where payorderid = :payorderid",
                new String[]{"payorderid"}, new String[]{"UDP1701010000126466111"});
        System.out.println(orders.size());
        System.out.println(orders.get(0).getServiceorderid());
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
