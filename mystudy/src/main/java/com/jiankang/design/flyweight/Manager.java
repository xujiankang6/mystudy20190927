package com.jiankang.design.flyweight;

public class Manager implements Employee {

    private String deportment;

    private String reportContent;

    public Manager(String deportment) {
        this.deportment = deportment;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }


    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }


}
