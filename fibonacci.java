public static int fibonacci(int n) {
        if (n == 0) { // Базовый случай: F0 = 0
        return 0;
        } else if (n == 1) { // Базовый случай: F1 = 1
        return 1;
        } else { // Рекурсивный случай: Fn = Fn-1 + Fn-2
        return fibonacci(n - 1) + fibonacci(n - 2);
        }
        }

