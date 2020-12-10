//package com.javarush.task.task24.task2413;

/**
 * Класс для объекта "кирпич".
 */
public class Brick extends BaseObject {
    //картинка для отрисовки
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Brick(final double x, final double y) {
        super(x, y, 3);
    }

    /**
     * Рисуем себя на холсте
     */
    @Override
    void draw(final Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'H');
    }

    /**
     * Ничего не делаем - кирпич неподвижен
     */
    @Override
    void move() {
        //do nothing
    }
}
