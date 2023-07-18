public static double power(double a, int n) {
        if (n == 0) { // Базовый случай: любое число в степени 0 равно 1
        return 1.0;
        } else if (n > 0) { // Рекурсивный случай: a^n = a * a^(n-1)
        return a * power(a, n - 1);
        } else { // Рекурсивный случай: a^(-n) = 1/a^n
        return 1.0 / power(a, -n);
        }
        }
