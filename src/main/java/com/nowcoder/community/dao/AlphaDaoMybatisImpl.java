package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao{
    // 同一个接口下有多个method，加 Primary 的 method 可以被优先返回
    @Override
    public String select() {
        return "MyBatis";
    }
}
