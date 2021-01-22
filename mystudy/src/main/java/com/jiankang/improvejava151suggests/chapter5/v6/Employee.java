package com.jiankang.improvejava151suggests.chapter5.v6;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 18:33
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/11   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private Position position;

    public Employee(int id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public int compareTo(Employee o) {
        return id - o.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}

enum Position {
    Boss, Manager, Staff
}
