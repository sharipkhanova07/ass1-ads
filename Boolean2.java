public static boolean isAllDigits(String s) {
        if (s.length() == 0) { // Базовый случай: пустая строка считается состоящей только из цифр
        return true;
        }
        if (!Character.isDigit(s.charAt(0))) { // Базовый случай: первый символ не является цифрой
        return false;
        }
        // Рекурсивно проверяем оставшуюся подстроку
        return isAllDigits(s.substring(1));
        }
