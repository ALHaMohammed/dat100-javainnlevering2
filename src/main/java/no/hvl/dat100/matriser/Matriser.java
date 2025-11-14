package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        for (int[] rad : matrise) {

            for (int element : rad) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


    }

    // b)
    public static String tilStreng(int[][] matrise) {

        StringBuilder strMat = new StringBuilder();
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                strMat.append(matrise[i][j]);
                if (j < matrise[i].length - 1) {
                    strMat.append(" ");
                }

            }
            if (i < matrise.length) {
                strMat.append("\n");
            }
        }
        System.out.println(strMat);
        return strMat.toString();
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMat = new int[matrise.length][];

        for (int i = 0; i < matrise.length; i++) {


            nyMat[i] = new int[matrise[i].length];

            for (int j = 0; j < matrise[i].length; j++) {
                nyMat[i][j] = matrise[i][j] * tall;
            }
        }

        return nyMat;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {


        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }

        }

        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        // TODO

        throw new UnsupportedOperationException("Metoden speile ikke implementert");

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        // TODO
        throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

    }
}
