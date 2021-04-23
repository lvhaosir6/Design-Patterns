package cn.lvhaosir.design.patterns.template.jdbc;

import java.sql.ResultSet;

/**
 * <p>RowMapper</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/21
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
