package com.jiankang.javacoretechnologythetenversion.dchapter10.v2;

/*
 *@create by jiankang
 *@date 2020/7/21 time 17:52
 */

import java.math.BigDecimal;

public class DataRecord {
    private Integer id;
    private String tax_type;
    private String document_property;
    private BigDecimal sum_money;
    private Integer lecture;

    public DataRecord(Integer id, String tax_type, String document_property, BigDecimal sum_money, Integer lecture) {
        this.id = id;
        this.tax_type = tax_type;
        this.document_property = document_property;
        this.sum_money = sum_money;
        this.lecture = lecture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTax_type() {
        return tax_type;
    }

    public void setTax_type(String tax_type) {
        this.tax_type = tax_type;
    }

    public String getDocument_property() {
        return document_property;
    }

    public void setDocument_property(String document_property) {
        this.document_property = document_property;
    }

    public BigDecimal getSum_money() {
        return sum_money;
    }

    public void setSum_money(BigDecimal sum_money) {
        this.sum_money = sum_money;
    }

    public Integer getLecture() {
        return lecture;
    }

    public void setLecture(int lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "DataRecord{" +
                "id=" + id +
                ", tax_type='" + tax_type + '\'' +
                ", document_property='" + document_property + '\'' +
                ", sum_money=" + sum_money +
                ", lecture=" + lecture +
                '}';
    }
}
