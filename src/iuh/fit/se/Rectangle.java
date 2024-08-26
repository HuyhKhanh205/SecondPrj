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
public class Rectangle {
        private double length;
        private double width;


        public Rectangle() {
            length = 0.0 ;
            width = 0.0 ;

        }
        public Rectangle(double l, double w) {
            if(l<0 || w<0)
                throw new IllegalArgumentException("Length and Width must be greater than 0.");
            length = l ;
            width = w ;
        }
        public double getLength() {
            return length;
        }
        public double getWidth() {
            return width;
        }
        /**
         * Set the length of the rectangle
         */

        public void setLength(double length) {
            if(length < 0.0)
                throw new IllegalArgumentException("Length must be greater than 0");
            this.length = length;
        }

        public void setWidth(double width) {
            if(width < 0.0)
                throw new IllegalArgumentException("Width must be greater than 0");
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }
        public double getPerimeter() {
            return 2 * length + 2 * width;
        }
    }


