package LR2;
import java.util.Scanner;

// Класс ЛР№2
public class Lab2 {
    public static void main(String[] str) {

        // Создание трех объектов - точек
        Point3d firstPoint = new Point3d(),
                secondPoint = new Point3d(),
                thirdPoint = new Point3d();

        Scanner in = new Scanner(System.in);

        // Установка координат для трёх точек
        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите координату x для " + i +"-ой точки: ");
            double x = in.nextDouble();

            System.out.print("Введите координату y для " + i +"-ой точки: ");
            double y = in.nextDouble();

            System.out.print("Введите координату z для " + i +"-ой точки: ");
            double z = in.nextDouble();

            if (i == 1) {
                firstPoint.setX(x);
                firstPoint.setY(y);
                firstPoint.setZ(z);
            } else if (i == 2) {
                secondPoint.setX(x);
                secondPoint.setY(y);
                secondPoint.setZ(z);
            } else {
                thirdPoint.setX(x);
                thirdPoint.setY(y);
                thirdPoint.setZ(z);
            }
        }

        // Нахождение одинаковых точек
        if (
                firstPoint.comparePoints(secondPoint) |
                firstPoint.comparePoints(thirdPoint) |
                secondPoint.comparePoints(thirdPoint) ) {
            System.out.println("Одна из точек равна другой");
        } else {
            System.out.printf("%.2f", computeArea(firstPoint, secondPoint, thirdPoint));
        }
    }

    // Вычисление площади при помощи формулы Герона
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double a = p1.distanceTo(p2);
        double b = p1.distanceTo(p3);
        double c = p2.distanceTo(p3);

        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
