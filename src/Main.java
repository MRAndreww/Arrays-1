import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1();
        // task2();
        //task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] flat = new int[3];
        flat[0] = 1;
        flat[1] = 2;
        flat[2] = 3;

        double[] apricot = {1.57, 7.654, 9.986};

        int[] shop = {12, 3, 5, 34, 67};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] flat = new int[3];
        flat[0] = 1;
        flat[1] = 2;
        flat[2] = 3;
        System.out.println(Arrays.toString(flat));

        double[] apricot = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(apricot));

        int[] shop = {12, 3, 5, 34, 67};
        System.out.println(Arrays.toString(shop));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] flat = new int[3];
        flat[0] = 1;
        flat[1] = 2;
        flat[2] = 3;
        for (int i = flat.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(flat[i] + " ");
                break;
            }

            System.out.print(flat[i] + ", ");
        }

        System.out.println();
        double[] apricot = {1.57, 7.654, 9.986};
        for (int i = apricot.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(apricot[i] + " ");
                break;
            }
            System.out.print(apricot[i] + ", ");
        }

        System.out.println();
        int[] shop = {12, 3, 5, 34, 67};
        for (int i = shop.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(shop[i] + " ");
                break;
            }
            System.out.print(shop[i] + ", ");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] flat = new int[3];
        flat[0] = 1;
        flat[1] = 2;
        flat[2] = 3;
        //flat[3] = 4;
        //flat[4] = 5;
        for (int i = 0; i < flat.length; i++) {
            //System.out.print(flat[i]);
            //if (i != flat.length-1 ) {
                //System.out.print(", ");
            if (flat[i] % 2 != 0) {
                flat[i] += 1; }
                        }
        System.out.println(Arrays.toString(flat));
        }
    }




