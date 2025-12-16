package ejerciciosud3;

import java.util.Scanner;

public class Ejercicio16 {

    private static int sumaDigitos(int n) {
        if (n < 10)
            return n;
        
        return n%10 +sumaDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();

        System.out.println(sumaDigitos(numero));
    }

}
