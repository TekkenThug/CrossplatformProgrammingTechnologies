package LR2;


// Класс трехмерной точки
public class Point3d extends Point2d {

    // Координаты точки
    private double zCoord;

    // Конструктор
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    // Конструктор по умолчанию
    public Point3d(){
        this(0.0, 0.0, 0.0);
    }

    // Получение значения Z
    public double getZ() {
        return zCoord;
    }

    // Установка значения Z
    public void setZ(double val) {
        zCoord = val;
    }

    // Вычисление расстояния между двумя точками
    public double distanceTo(Point3d point) {
        return (double)

                Math.sqrt(Math.pow(this.getX() - point.getX(), 2) +
                Math.pow(this.getY() - point.getY(), 2) +
                Math.pow(this.getZ() - point.getZ(), 2));
    }

    // Сравнение двух точек
    public boolean comparePoints(Point3d point) {
        if (this.getX() == point.getX() & this.getY() == point.getY() & this.getZ() == point.getZ()) {
            return true;
        } else return false;
    }
}
