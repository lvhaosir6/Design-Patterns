package cn.lvhaosir.design.patterns.template.jdbc;

/**
 * <p>Member</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/21
 */
public class Member {

    private String username;

    private String password;

    private String nickName;

    private int age;

    private String address;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
