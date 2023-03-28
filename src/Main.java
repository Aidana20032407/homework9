public class Main {
    public static void main(String[] args) {
        System.out.println(min(new int[]{22, 44, 68, 77}));
        System.out.println(max(new int[]{33, 6, 55, 4, 23, 2}));
    }

    static int min(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }

        return min;
    }
    static int max(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }
}