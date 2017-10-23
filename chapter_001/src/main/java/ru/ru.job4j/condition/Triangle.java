package ru.ru.job4j.condition;

/**
 * Tringle.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

/**
 * Triangle atribute.
 *
 */

public class Triangle {
    /**
     *
     * determine a, b, c.
     */
    private Point a, b, c;
    /**
     * @param a координата точки
     * @param b координата точки
     * @param c координата точки
     * @param lineAtoB отрезок
     * @param lineAtoC отрезок
     * @param lineBtoC отрезок
     */
    public Triangle(Point a, Point b, Point c) {

        lineAtoB = distance(a, b);
        lineAtoC = distance(a, c);
        lineBtoC = distance(b, c);
    }

    /**
     * Метод должен вычислять расстояние между точками left и right.
     *
     * Для вычисления расстояния использовать формулу.
     * √(xb - xa)^2 + (yb - ya)^2
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * ^ - степень.
     *
     * @param left Точка слева
     * @param right Точка с права.
     * @return расстояние между точками left и right.
     */


    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Перимент.

    public double period(double ab, double ac, double bc) {
        return -1;
    }*/

    /**
     * Метод должен вычислить прощадь треугольканива.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    /**public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            // написать формулу для расчета площади треугольника.
            //rsl = ...
        }
        return rsl;
    }*/

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return false
     */
    /**private boolean exist(double ab, double ac, double bc) {
        return false;
    }*/
}