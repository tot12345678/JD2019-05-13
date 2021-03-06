package by.it.buymistrov.jd01_03;

class InOut {
    /**
     * ввод массива из консоли
     *
     * @param line входные значения массива
     * @return возвращает массив
     */
    static double[] getArray(String line) {

        String[] strArray = line.trim().split(" ");


        double[] array = new double[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]);
        }


        return array;

    }

    /**
     * печать массива
     *
     * @param array массив типа double
     */
    static void printArray(double[] array) {


        for (double e : array) {
            System.out.print(e + " ");

        }
        System.out.println();

    }

    /**
     * печать массива по-хитрому
     *
     * @param array       массив типа double
     * @param name        название масива
     * @param columnCount колличество столбцов
     */
    static void printArray(double[] array, String name, int columnCount) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-7.3f ", name, i, array[i]);
            if ((i + 1) % columnCount == 0)
                System.out.println();
        }

    }

    /**
     * печать двумерного масива
     *
     * @param mas двумерный массив типа double
     */
     static void printmas(double[][] mas) {

        for (double[] ma : mas) {

            for (double v : ma) {

                System.out.print(v + " ");


            }
            System.out.println();
        }
        System.out.println();
    }


}
