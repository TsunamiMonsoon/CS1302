//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice 9

package Practice;


public class Rectangle {
    double width;
    double height;


    Rectangle() {
        width = 1;
        height = 1;
    }


    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }


    double getArea() {
        return width * height;
    }


    double getPerimeter() {
        return 2 * (width + height);
    }
}
