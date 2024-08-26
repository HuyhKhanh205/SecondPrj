/* @ (#) $NAME.java  1.0 8/27/2024
 *
 *Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;


/**
 * @author : Huynh Minh Khanh
 * @version 1.0
 * @description
 * @created: 8/27/2024
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle();
        re1.setLength(10);
        re1.setWidth(5);

        Rectangle re2 = new Rectangle(20, 5);
        System.out.println("Area: " +re2.getArea());
        System.out.println("Perimeter: " +re2.getPerimeter());
    }
}
