public static int gcd(int a, int b) {
        if (b == 0) { // Базовый случай: gcd(a, 0) = a
        return a;
        }
        return gcd(b, a % b); // Рекурсивный случай: gcd(a, b) = gcd(b, a mod b)
        }

