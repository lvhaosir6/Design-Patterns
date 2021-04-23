package cn.lvhaosir.design.patterns.template.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * <p>MemberDao</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/23
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddress(rs.getString("address"));
                return member;
            }
        }, null);
    }

}
