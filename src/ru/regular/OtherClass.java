package ru.regular;

/**
 * Другой очень полезный класс приложения. Здесь мы можем описать
 * его основное назначение  способы взаимодействия с ним
 */
public class OtherClass {
    /**
     * Функция суммирования двух чисел
     *
     * @param a первое слагаемое
     * @param b второе слогаемое
     * @return сумма a и b, без проверки переполнения переменной
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Функция разности двух чисел
     *
     * @param a уменьшаемое число
     * @param b вычетаемое число
     * @return Разность a и b
     */
    public static int div(int a, int b) {
        return a - b;
    }

    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой "Вот такое число"
     *
     * @param a число требующее декорации
     * @return отформатированная строка
     */

    public static String decorate(int a) {
        /**
         * Метод декорирует число, добавляя к нему строку
         * При помощи функции форматирования строк
         */
        return String.format("Here is your number: %d", a);
    }

}
