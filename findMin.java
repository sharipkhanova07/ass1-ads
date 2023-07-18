public static int findMinimum(int[] arr) {
        int min = arr[0]; // Инициализируем переменную для хранения минимального значения
        for (int i = 1; i < arr.length; i++) { // Итерируемся по массиву
        if (arr[i] < min) { // Если текущий элемент меньше `min`
        min = arr[i]; // Обновляем минимальное значение
        }
        }
        return min; // Возвращаем минимальное значение
        }

public static double findAverage(int[] arr) {
        int sum = 0; // Инициализируем переменную для хранения суммы элементов
        for (int i = 0; i < arr.length; i++) { // Итерируемся по массиву
        sum += arr[i]; // Добавляем текущий элемент к сумме
        }
        double average = (double) sum / arr.length; // Вычисляем среднее значение
        return average; // Возвращаем среднее значение
        }

