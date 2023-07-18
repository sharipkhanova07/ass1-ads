public static void reverseArrayInPlace(int[] arr, int start, int end) {
        if (start >= end) { // Базовый случай: прекратить рекурсию, когда start и end сходятся или пересекаются
        return;
        }
        // Обменять элементы с индексами start и end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Рекурсивно перевернуть оставшуюся подмассив
        reverseArrayInPlace(arr, start + 1, end - 1);
        }

