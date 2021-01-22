package com.jiankang.improvejava151suggests.chapter2.v8;

/*
 *@create by jiankang
 *@date 2020/11/15 @time 12:15
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


public class Employee extends Person {
    private int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj!=null && obj.getClass()==this.getClass()) {
            Employee e = (Employee) obj;
            return super.equals(obj) && e.getId() == id;
        }
        return false;
    }
}
