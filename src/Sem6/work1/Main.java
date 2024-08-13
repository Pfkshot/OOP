package Sem6.work1;

public class Main {
    public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            rectangle.setHeight(5);
            rectangle.setWidth(10);

            System.out.println(rectangle.getHeight()+ " " + rectangle.getWidth());

            Rectangle square = new Square();
            square.setHeight(5);
            square.setWidth(5);

            System.out.println(square.getHeight()+ " " + square.getWidth());
    }
}
