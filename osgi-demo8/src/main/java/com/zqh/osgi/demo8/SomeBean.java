package com.zqh.osgi.demo8;

/**
 * @discription:
 * @date: 2019/08/28 11:42
 */
public class SomeBean {

    private String user;

    private String info;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        System.out.println("set user: " + user);
        this.user = user;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        System.out.println("set info: " + info);
        this.info = info;
    }
}
