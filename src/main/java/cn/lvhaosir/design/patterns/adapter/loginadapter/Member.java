package cn.lvhaosir.design.patterns.adapter.loginadapter;

/**
 * <p>
 * Member
 * </p>
 *
 * @author lvhao
 * @date 2021/5/12
 */
public class Member {

    private String username;

    private String password;

    private String info;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
