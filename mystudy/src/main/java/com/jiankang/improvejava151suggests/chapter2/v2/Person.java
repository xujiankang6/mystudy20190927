package com.jiankang.improvejava151suggests.chapter2.v2;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 15:55
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/13   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Person {
    private String name;
    private Home home;

    public Person(String name, Home home) {
        this.name = name;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public static class Home{
        private String address;
        private String tel;

        public Home(String address, String tel) {
            this.address = address;
            this.tel = tel;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }
}
