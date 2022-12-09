package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
//@Repository
public class AlphaDaoHibernateImpl implements AlphaDao{
    // 使用 Hibernate 技术实现的查询

    @Override
    public String select() {
        return "Hibernate";
    }

}
