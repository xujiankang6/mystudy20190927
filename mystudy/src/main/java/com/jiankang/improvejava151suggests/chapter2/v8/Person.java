package com.jiankang.improvejava151suggests.chapter2.v8;

/*
 *@create by jiankang
 *@date 2020/11/15 @time 12:08
*/

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/15   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Person p = (Person) obj;
            if (p.getName() == null || name == null) {
                return false;
            }
            return name.equalsIgnoreCase(p.getName().trim());
        }
        return false;
    }
}
