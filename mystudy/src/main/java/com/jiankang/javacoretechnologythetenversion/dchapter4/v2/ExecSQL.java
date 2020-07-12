package com.jiankang.javacoretechnologythetenversion.dchapter4.v2;

/*
 *@create by jiankang
 *@date 2020/7/12 time 12:33
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class ExecSQL {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String fliePath = scanner.nextLine();
            if (fliePath.equalsIgnoreCase("exit")) return;

            try {
                execSqlFile(fliePath);
            } catch (FileNotFoundException e) {

            }

        }


    }

    public static void execSqlFile(String filePath) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader(new File(filePath)));
        try (Connection conn = getConnection()) {
            Statement stat = conn.createStatement();
            String line;
            while ((line = in.readLine()) != null) {
                if (line.trim().endsWith(";")) {
                    line = line.trim();
                    line = line.substring(0, line.length() - 1);
                }
                try {
                    boolean isResult = stat.execute(line);
                    if (isResult) {
                        ResultSet rs = stat.getResultSet();
                        showResultSet(rs);
                    } else {
                        int updateCount = stat.getUpdateCount();
                        System.out.println(updateCount + " rows updated");
                    }
                } catch (SQLException ex) {
                    for (Throwable e : ex) {
                        e.printStackTrace();
                    }
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void showResultSet(ResultSet result) throws SQLException {
        ResultSetMetaData metaData = result.getMetaData();
        final int columnCount = metaData.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (i > 1) System.out.print(", ");
            System.out.print(metaData.getColumnLabel(i));
        }
        System.out.println();
        while (result.next()) {
            for (int i = 0; i < columnCount; i++) {
                if (i > 1) System.out.print(", ");
                System.out.print(result.getString(i));
            }
            System.out.println();
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
