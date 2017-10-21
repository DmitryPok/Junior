package ru.ru.job4j.point;
/**
 * Point.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Point {

    /**
     *
     * determine x.
     */

    private int x;

    /**
     * determine y.
     *
     */

    private int y;

    /**
     * @param x x.
     * @param y y.
     */

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * @return x.
     */
    public int getX() {
        return this.x;
    }
    /**
     * @return y.
     */
    public int getY() {
        return this.y;
    }
    /**
     * @param a a
     * @param b b
     * @return true or false
     */
    public boolean is(int a, int b) {
        y = a * x + b;
        boolean tr = true;
        boolean fl = false;
        if ((a * x + b - y) == 0) {
            return tr;
        } else {
            return fl;
            }

    }
}