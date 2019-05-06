package com.sss.mtbatis.test;

import com.sss.mybatis.v1.SZConfiguration;
import com.sss.mybatis.v1.SZExcutor;
import com.sss.mybatis.v1.SZSqlSession;
import com.sss.mybatis.v1.mapper.BlogMapper;

/**
 * Created by Pactera on 2019/5/6.
 */
public class TestV1 {

    public static void main(String[] args) {
        SZSqlSession sqlSession = new SZSqlSession(new SZConfiguration(),new SZExcutor());
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        blogMapper.selectBlogById(1);
    }
}
