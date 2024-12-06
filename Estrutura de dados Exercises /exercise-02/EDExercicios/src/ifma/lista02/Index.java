package ifma.lista02;

public class Index {
    public static void main(String[] args) {

        int matriz[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        //q01(matriz);

        //q02(matriz);

        //q03(matriz);

        //q04(matriz);

        //q05(matriz);

        //q06(matriz);

        //q07(matriz);

        q08(matriz);

        //q09(matriz);
    }

    static void q01(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.err.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    static void q02(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    static void q03(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q04(int[][] matriz) {
        int somaDS = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    somaDS += matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal S: " + somaDS);

    }

    static void q05(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.err.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");

                }
            }
        }

    }

    static void q06(int[][] matriz) {
        int Elementos = 0;
        double somar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    Elementos++;
                    somar += matriz[i][j];
                }
            }
        }
        System.out.printf("Media: %.2f", somar / Elementos);

    }

    static void q07(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q08(int[][] matriz) {// bug resolvido
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }
        }
        System.out.printf(String.valueOf(maior));
    }

    static void q09(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");

                }
            }
        }
    }

    // incompleto. Terminar depois

}



