package de.lubowiecki.uebungen;

public class ArrayTest3 {

    public static void main(String[] args) {

        int a, b, c; // 3 Variablen vom gleichen Typ (int)

        int[] d, e, f; // 3 Variablen vom gleichen Typ (int-Array)

        int g, h[], i; // 2 Variablen vom Typ int und eine vom Typ int-Array

        int[] k, l[], m; // 2 Variablen vom Typ int-Array und eine vom Typ 2d-int-Array

        double[] arr = new double[4];

        /*
        {
            0: 0.0,
            1: 0.0,
            2: 0.0,
            3: 0.0
        }
        */

        arr = new double[]{20.5, 10.7, 18.0};

        /*
        {
            0: 20.5,
            1: 10.7,
            2: 18.0,
        }
        */

        // 2d-Array
        int[][] arr2d = new int[3][2];

        /*
        {
            0: {
                0: 0,
                1: 15
            },
            1: {
                0: 0,
                1: 0
            },
            2: {
                0: 0,
                1: 10
            }
        }
        */

        arr2d[0][1] = 15;
        arr2d[2][1] = 10;

        System.out.println(arr2d[0][0]);
        System.out.println(arr2d[0][1]);

        arr2d = new int[10][10]; // 100 x 32 Bit
    }
}
