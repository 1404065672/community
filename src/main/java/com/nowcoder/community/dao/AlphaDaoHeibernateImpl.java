package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alpha")
public class AlphaDaoHeibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
