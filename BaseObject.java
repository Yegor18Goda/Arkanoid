

/**
 * Базовый класс для всех объектов игры.
 */
public abstract class BaseObject {
    //координаты
    protected double x;
    protected double y;
    //радиус объекта
    protected double radius;

    protected BaseObject(final double x, final double y, final double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    /**
     * Метод рисует свой объект на "канвасе".
     */
    abstract void draw(Canvas canvas);

    /**
     * Двигаем себя на один ход.
     */
    abstract void move();

    /**
     * Проверяем - не выходит ли (x,y) за границы.
     */
    void checkBorders(final double minx, final double maxx, final double miny, final double maxy) {
        if (x < minx)
            x = minx;
        if (x > maxx)
            x = maxx;
        if (y < miny)
            y = miny;
        if (y > maxy)
            y = maxy;
    }

    /**
     * Проверяем - пересекаются ли переданный(o) и наш(this) объекты.
     */
    boolean isIntersec(final BaseObject o) {
        final double dx = x - o.x;
        final double dy = y - o.y;
        final double destination = Math.sqrt(dx * dx + dy * dy);
        final double destination2 = Math.max(radius, o.radius);
        return destination <= destination2;
    }
}
