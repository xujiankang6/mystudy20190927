package com.jiankang.javacoretechnologythetenversion.dchapter4.v1;

/*
 *@create by jiankang
 *@date 2020/7/10 time 17:56
 */

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class TestDB {
    public static void main(String[] args) {

        try {
            runTest();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void runTest() throws SQLException, IOException {
        try (Connection conn = getConnection()) {
            Statement stat = conn.createStatement();
            stat.executeUpdate("create table Greetings(Message char(20))");
            stat.executeUpdate("insert into Greetings values('Hello,World!')");
            try ( ResultSet result = stat.executeQuery("select * from Greetings")){
                if(result.next()){
                    System.out.println(result.getString(1));
                }
            }
            stat.executeUpdate("drop table Greetings");
        }
    }


    public static Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\javacoretechnologythetenversion\\dchapter4\\db.properties"))) {
            props.load(in);
        }
        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) System.setProperty("jdbc.drivers", drivers);
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        return DriverManager.getConnection(url, username, password);
    }
}
