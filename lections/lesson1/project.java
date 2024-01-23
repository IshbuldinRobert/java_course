package lections.lesson1;

public class project {
    public static void main(String[] args) {
        // System.out.println("Bay, world");


        // char a = '3';
        // System.out.println(a);


        // float key = 67.8f;
        // double dab = 67.82;
        // System.out.println(key);
        // System.out.println(dab);


        // boolean b = true && false;
        // System.out.println(b);
        // boolean c = true ^ true;
        // System.out.println(c);


        // var ass = 123;
        // System.out.println(Integer.MAX_VALUE);
        // String str = "Beach";
        // System.out.println(str.charAt(1));


        // int num = 123;
        // System.out.println(num++);
        // System.out.println(--num-num--);


        // int number = 7;
        // // 1000
        // // number = number << 1;
        // System.out.println(number << 1);


        // int a = 5;
        // int b = 2;
        // System.out.println(a | b);
        // // 101
        // // 010
        // // 111
        // System.out.println(a & b);
        // // 101
        // // 010
        // // 000
        // System.out.println(a ^ b);
        // // 101
        // // 010
        // // 111

        
        // String str = "qwer1";
        // boolean boo = str.length() >= 5 && str.charAt(4) == '1';
        // System.out.println(boo);

        
        /*
         * МАССИВЫ
         */

        /*
        int[] arr = new int[] {1, 2, 3, 4};
        // arr[3] = 13;
        System.out.println(arr.length);
        System.out.println(arr[3]);

        // System.out.println(Byte.MAX_VALUE);
        
        // Многомерные массивы

        // #1

        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item: line) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
        System.out.println("\n");


        // #2

        int[][] arr3 = new int[3][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d\t", arr3[i][j]);
            }
            System.out.println();
        }
        */

        // Преобразования

        /*int a = 45;
        byte bt = Byte.parseByte("45");
        double db = a;
        System.out.println(bt);
        System.out.println(db);*/

        // int[] array = new int[10];
        // double[] array1 = array; // ковариантность и контрвариантность
    }
}