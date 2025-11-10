//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );

    public static void assegnaMatrice( int[][]M,int nR,int nC ,int v) {
     int i=0;
     int j=0;
     for(i=0; i<=nR-1,++i){
        for(j=0; j<=nC-1; ++J){
            M[i][j]=V;
        }
     }
    }

    public static void azzeraMatrice( int[][]M,int nR,int nC ) {
       assegnaMatrice(M,nR,nC,0);
    }

    public static void riempiCasuale( int[][]M,int nR,int nC, int valM,int valMa ) {
        Random rand = new Random();
        int i=0;
        while(i<=nR-1){
            int j=0;
            while(j<=nC-1){
                int r=rand.nextInt(valMA+1-)
            }
        }
    }
  public static void main(String args[]) {

        System.out.println("---------------------------------------Esercizio1---------------------------------------");

        int[][] M = new int[3][5];
        int nR = 3; 
        int nC = 5;

        int num;

        System.out.print("Inserire valore da inserire nella matrice: ");
        num = Integer.parseInt(in.nextLine());

        assegnaMatrice(M, nR, nC, num);
        UtilsMatrice.visualizza(M);

        System.out.println("---------------------------------------Esercizio2---------------------------------------");

        int[][] M2 = new int[3][5];
        int nR2 = 3; 
        int nC2 = 5;

        azzeraMatrice(M2, nR2, nC2);
        UtilsMatrice.visualizza(M2);

    }
}
