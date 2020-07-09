package com.jiankang.javacoretechnologythetenversion.dchapter1.v4;

/*
 *@create by jiankang
 *@date 2020/7/9 time 10:48
 */



import java.io.*;

public class Test {
    public static void main(String[] args) {
        Employee e =new Employee("aa",2000);

        Manager m = new Manager("bb",1000);
        Manager m2 = new Manager("cc",1000);
        m.setSecretary(e);
        m2.setSecretary(e);
        Employee[] employees = new Employee[3];
        employees[0]=m;
        employees[1]=e;
        employees[2]=m2;


        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("employee.dat")));
            out.writeObject(employees);

        } catch (IOException ex) {
            ex.printStackTrace();
        }


        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
            Employee[] newstaff = (Employee[]) in.readObject();

            newstaff[1].setName("aaaa");
            newstaff[2].setBonus(11);
            for (Employee employee : newstaff) {
                System.out.println(employee);
            }
            System.out.println(((Manager) newstaff[2]).getSecretary());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
