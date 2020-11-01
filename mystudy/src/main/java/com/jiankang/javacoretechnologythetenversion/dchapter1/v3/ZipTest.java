package com.jiankang.javacoretechnologythetenversion.dchapter1.v3;

/*
 *@create by jiankang
 *@date 2020/7/8 time 19:59
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class ZipTest {
    public static void main(String[] args) throws IOException {
        ZipFile zf = new ZipFile("C:\\Users\\ForceClouds\\Desktop\\bb.zip");
        ZipInputStream zin = new ZipInputStream(new FileInputStream("C:\\Users\\ForceClouds\\Desktop\\bb.zip"));
        ZipEntry ze;
        while ((ze = zin.getNextEntry()) != null) {
            if (ze.isDirectory()) {
            } else {
                System.err.println("file - " + ze.getName() + " : "
                        + ze.getSize() + " bytes");

                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(zf.getInputStream(ze), Charset.defaultCharset()));
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();

                System.out.println();
            }
            zin.closeEntry();
        }
        zin.close();
    }
}

