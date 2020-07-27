package com.jiankang.javacoretechnologythetenversion.dchapter10.v2;

/*
 *@create by jiankang
 *@date 2020/7/21 time 17:54
 * lambda 表达式研究
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        List<DataRecord> results = new ArrayList<>();
        List<DataRecord> list = DataUtils.getDatas();
        //根据tax documentProperty ,lecture 分组
        Map<Integer, Map<String, Map<String, List<DataRecord>>>> bigMap = list.stream().filter(it ->
                it.getDocument_property() != null && it.getLecture() != null && it.getTax_type() != null
        ).collect(Collectors.groupingBy(DataRecord::getLecture, Collectors.groupingBy(DataRecord::getDocument_property, Collectors.groupingBy(DataRecord::getTax_type))));

        Set<Integer> lectures = bigMap.keySet();
        for (Integer lecture : lectures) {
            Map<String, Map<String, List<DataRecord>>> document_propertyMap = bigMap.get(lecture);
            Set<String> document_propertys = document_propertyMap.keySet();
            for (String document_property : document_propertys) {
                Map<String, List<DataRecord>> tax_typeMap = document_propertyMap.get(document_property);
                Set<String> tax_types = tax_typeMap.keySet();
                for (String tax_type : tax_types) {
                    List<DataRecord> dataRecords = tax_typeMap.get(tax_type);
                    if (dataRecords != null && dataRecords.size() > 0) {
                        DataRecord result = new DataRecord(null, null, null, new BigDecimal(0), null);
                        for (DataRecord dataRecord : dataRecords) {
                            result.setSum_money(result.getSum_money().add(dataRecord.getSum_money()));
                        }
                        result.setDocument_property(document_property);
                        result.setLecture(lecture);
                        result.setTax_type(tax_type);
                        results.add(result);
                    }
                }
            }
        }

        results.forEach(it -> System.out.println(it.toString()));
        System.out.println(results.size());

        System.out.println(bigMap.toString());
    }




}
