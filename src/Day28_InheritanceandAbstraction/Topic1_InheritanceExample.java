package Day28_InheritanceandAbstraction;

import CustomClasses.RectangleClass;

public class Topic1_InheritanceExample {
    public static void main(String[] args) {
        RectangleClass MyRectangle = new RectangleClass(4,5);
        MyRectangle.PrintArea();
        MyRectangle.PrintPerimeter();
    }
}
