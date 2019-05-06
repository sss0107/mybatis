package com.sss.mybatis.v1;

/**
 * Created by Pactera on 2019/5/6.
 */
public class SZSqlSession {

    private SZConfiguration configuration;

    private SZExcutor excutor;

    public SZSqlSession(SZConfiguration configuration, SZExcutor excutor) {
        this.configuration = configuration;
        this.excutor = excutor;
    }

    public <T> T selectOne(String statementId, Object param) {
        // 根据statementId获取SQL
        String sql = SZConfiguration.sqlMappings.getString(statementId);
        if (null != sql && !"".equals(sql)) {
            return excutor.query(sql, param);
        }
        return null;
    }

    public <T> T getMapper(Class clazz) {
        return configuration.getMapper(clazz, this);
    }
}
