package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (i < tabell.length - 1) {
                System.out.print(",");

            }
        }
        System.out.println();
    }


    // b)
    public static String tilStreng(int[] tabell) {

        StringBuilder strTab = new StringBuilder();
        strTab.append("[");
        for (int i = 0; i < tabell.length; i++) {
            strTab.append(tabell[i]);
            if (i < tabell.length - 1) {
                strTab.append(",");
            }
        }
        strTab.append("]");
        System.out.println("Tabell som string: " + strTab);
        return strTab.toString();

    }

    // c)
    public static int summer(int[] tabell) {

        int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        System.out.println("summen av talene er: " + sum);
        return sum;

    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        for (int element : tabell) {
            if (tall == element) {
                return true;
            }
        }
        System.out.println();

        return false;

    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                System.out.println("posision is: " + i);
                return i;
            }
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {

        int[] nyTab = new int[tabell.length];
        for (int i = tabell.length - 1, j = 0; i >= 0; i--, j++) {
            nyTab[j] = tabell[i];
        }
        return nyTab;
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            int minst = i;
            for (int j = i + 1; j < tabell.length; j++) {
                if (tabell[j] < tabell[minst]) {
                    return false;
                }
            }

        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int nytabell[] = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
            nytabell[i] = tabell1[i];
        }
        for (int i = 0; i < tabell2.length; i++) {
            nytabell[tabell1.length + i] = tabell2[i];
        }
        return nytabell;
    }
}