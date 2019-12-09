package com.jiankang.designismethod2.visitorpattern;

/*
 *@create by jiankang
 *@date 2019/12/4 time 17:54
 */

public abstract class Employee {
    // 0 代表男性 1 代表女性
    public final static int MALE = 0;
    public final static int FEMALE = 1;
    private String name;
    private int salary;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //打印出员工的信息
    public final void report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("姓名：" + this.name + "\t")
                .append("薪水：" + this.salary + "\t")
                .append("性别： " + (this.sex == FEMALE ? "女" : "男")).append(this.getOtherInfo());
        System.out.println(stringBuilder);
    }

    protected abstract String getOtherInfo();
}
