package com.jiankang.javacoretechnologythetenversion.chapter13.v1;

import javax.swing.*;
import java.awt.*;

/**
 * ResourceTest
 *
 * @author jiankang.xu
 * @date 2020/6/9
 */
public class ResourceTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ResourceTestFrame frame = new ResourceTestFrame();
            frame.setTitle("ResourceTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
