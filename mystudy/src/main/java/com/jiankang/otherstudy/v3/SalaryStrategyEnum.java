package com.jiankang.otherstudy.v3;

/**
 * SalaryStrategyEnum
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public enum SalaryStrategyEnum {
    BOSS(0) {
        @Override
        double getSalary() {
            return 10000;
        }
    }, LEADER(1) {
        @Override
        double getSalary() {
            return 6000;
        }
    }, STAFF(0) {
        @Override
        double getSalary() {
            return 3000;
        }
    };

    private final int position;

    SalaryStrategyEnum(int position) {
        this.position = position;
    }

    abstract double getSalary();

    public static SalaryStrategyEnum valueOf(int position) {
        for (SalaryStrategyEnum salaryStrategyEnum : SalaryStrategyEnum.values()) {
            if (salaryStrategyEnum.position == position) {
                return salaryStrategyEnum;
            }
        }
        return null;
    }
}
