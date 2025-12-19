package aceptaelretoud3;

import java.util.Scanner;

public class P_334 {

    private static String getOrigen(String cadena) {
        int contador = 0;
        
        if(esPicto(cadena)&&(esGalo(cadena)||esBreton(cadena)||esRomano(cadena)||esGodo(cadena)||esGriego(cadena)||esNormando(cadena)||esHispano(cadena)||esIndio(cadena))){
            return "MULATO";
        }
        else if (esGalo(cadena)) {
            return "GALO";
        } else if (esRomano(cadena)) {
            return "ROMANO";
        } else if (esGodo(cadena)) {
            return "GODO";
        } else if (esGriego(cadena)) {
            return "GRIEGO";
        } else if (esNormando(cadena)) {
            return "NORMANDO";
        } else if (esBreton(cadena)) {
            return "BRETON";
        } else if (esHispano(cadena)) {
            return "HISPANO";
        } else if (esIndio(cadena)) {
            return "INDIO";
        } else if (esPicto(cadena)) {
            return "PICTO";
        } else {
            return "PLUS ULTRA";
        }
        
    }
    
    private static boolean esGalo(String cadena) {
        return cadena.endsWith("IX");
    }

    private static boolean esRomano(String cadena) {
        return cadena.endsWith("US") || cadena.endsWith("UM");
    }

    private static boolean esGodo(String cadena) {
        return cadena.endsWith("IC");
    }

    private static boolean esGriego(String cadena) {
        return cadena.endsWith("AS");
    }

    private static boolean esNormando(String cadena) {
        return cadena.endsWith("AF");
    }

    private static boolean esBreton(String cadena) {
        return cadena.endsWith("IS") || cadena.endsWith("AX") || cadena.endsWith("OS");
    }

    private static boolean esHispano(String cadena) {
        return cadena.endsWith("EZ");
    }

    private static boolean esIndio(String cadena) {
        return cadena.endsWith("A");
    }

    private static boolean esPicto(String cadena) {
        return cadena.startsWith("MAC");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        in.nextLine(); //Vaciado del Enter.

        while (casos-- > 0) {
            System.out.println(getOrigen(in.nextLine()));
        }
    }

}
