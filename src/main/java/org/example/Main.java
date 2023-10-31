package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][] matrice = creatTab(3,3);
        displayPlateau(matrice);
    }
    public static int[][] creatTab(int x, int  y){
            int [][] tab = new int [x][y];
            return tab;
    }

    public static void displayPlateau(int [][] plateau ){
            System.out.print("  ");
            for( int nbColonne =0 ; nbColonne <  3; nbColonne++){
                System.out.print(nbColonne+" ");
            }
            System.out.println();
            for (int nbLigne=0 ; nbLigne < plateau.length ; nbLigne++){
                System.out.print(nbLigne+" ");
                for(int nbColon=0; nbColon < plateau[nbLigne].length; nbColon++ ) {
                    switch (plateau[nbLigne][nbColon]){
                        case 0:
                            System.out.print("- ");
                            break;
                        case 1:
                            System.out.print("0 ");
                            break;
                        case 2:
                            System.out.print("x ");
                            break;
                        default:
                            break;
                    }
                }
                System.out.println();
            }
    }
//    cette fonction est pour verifier si le plateau de jeu est totalement remplie
    public static  boolean plateauFull(int[][] plateau ){
        for (int nbLigne=0 ; nbLigne < plateau.length ; nbLigne++){

            for(int nbColon=0; nbColon < plateau[nbLigne].length; nbColon++ ) {
                if (plateau[nbLigne][nbColon]==0){return false;}
            }
        }
        return true;
    }

//    cette fonction verifie si la case est libre :
    public static boolean checkPlateau (int [][] plateau, int numLigne, int numcolonne){
        boolean check = false;
        if (numLigne>=0 && numLigne< plateau.length && numcolonne>= 0 && numcolonne< plateau[numLigne].length){
            if (plateau[numLigne][numcolonne]==0){check= true;}
        }
        return check;
    }


    public static void fillCase




}