public static int factorial(int n) {
        if (n == 0 || n == 1) { // Базовый случай: 0! и 1! равны 1
        return 1;
        } else {
        return n * factorial(n - 1); // Рекурсивный случай: n! = n * (n-1)!
        }
        }

