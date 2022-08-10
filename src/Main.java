public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] numbers = {1.57, 7.654, 9.986};
        String[] words = {"a", "b", "c"};

        System.out.println("Задание 2:");
        // Task 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1]) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[numbers.length - 1]) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i] == words[words.length - 1]) {
                System.out.println(words[i]);
            } else {
                System.out.print(words[i] + ", ");
            }
        }

        System.out.println();
        System.out.println("Задание 3:");
        // Task 3
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == arr[0]) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == numbers[0]) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] == words[0]) {
                System.out.println(words[i]);
            } else {
                System.out.print(words[i] + ", ");
            }
        }

        System.out.println();
        System.out.println("Задание 4:");
        // Task 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}