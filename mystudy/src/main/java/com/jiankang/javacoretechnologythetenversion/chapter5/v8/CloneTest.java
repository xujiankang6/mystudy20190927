package com.jiankang.javacoretechnologythetenversion.chapter5.v8;

/**
 * CloneTest
 *
 * @author jiankang.xu
 * @date 2020/6/7
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee origin = new Employee("jiankang",4000);
            origin.setHireDay(2020,6,7);
            Employee clone = origin.clone();
            clone.raiseSalary(10);
            clone.setHireDay(2010,1,2);
            System.out.println(" orlgin :"+origin);
            System.out.println(" clone :"+clone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
