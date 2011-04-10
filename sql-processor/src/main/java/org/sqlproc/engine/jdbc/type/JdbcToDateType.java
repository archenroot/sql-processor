package org.sqlproc.engine.jdbc.type;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

import org.sqlproc.engine.type.SqlToDateType;

/**
 * The JDBC META type TODATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcToDateType extends SqlToDateType implements JdbcSqlType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return Types.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        return rs.getDate(columnLabel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        if (value instanceof java.sql.Date) {
            st.setDate(index, (java.sql.Date) value);
        } else if (value instanceof Date) {
            st.setDate(index, new java.sql.Date(((java.util.Date) value).getTime()));
        }
    }
}