package com.jiankang.improvejava151suggests.chapter5.v3;

/*
 *@create by jiankang
 *@date 2020/11/10 @time 18:04
 */

import java.util.Arrays;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/10   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Client {
    public static void main(String[] args) {
        int ballonNum = 7;
        Balloon[] box1 = new Balloon[ballonNum];
        for (int i = 0; i<ballonNum;i++){
            box1[i] = new Balloon(i,Color.values()[i]);
        }
        Balloon[] box2 = Arrays.copyOf(box1,box1.length);
        box2[6].setColor(Color.Blue);
        for (Balloon b : box1) {
            System.out.println(b);
        }
        Balloon[] box3 = new Balloon[ballonNum];
        for (int i = 0; i<ballonNum;i++){
            box3[i] = new Balloon(i,Color.values()[i]);
        }
        Balloon[] box4= new Balloon[ballonNum];
        for (int i = 0; i < box3.length; i++) {
            box4[i] = new Balloon(i,box3[i].getColor());
        }
        box4[6].setColor(Color.Blue);
        System.out.println("-----------------");
        for (Balloon b : box3) {
            System.out.println(b);
        }

    }


}
enum Color {
    Red, Orange, Yellow, Green, Indigo, Blue, Violet;
}

class Balloon{
    private int id;
    private Color color;


    public Balloon(int id, Color color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "id=" + id +
                ", color=" + color +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}