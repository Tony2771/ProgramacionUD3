package ejerciciosud3;

import java.util.Scanner;

public class Ejercicio15 {
    
    private static int inversionInterno(int n, int acumulado){
        if(n==0)
            return acumulado;
        return inversionInterno(n/10, acumulado*10+n%10);
    }
    
    private static int inversion(int n) {
        return inversionInterno(n, 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();

        System.out.println(inversion(numero));
    }
}