package ejerciciosud3;

import java.util.Scanner;

public class Ejercicio14 {
    
    private static int fibonacci(int n){
        if(n==1||n==0)
            return 1;
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=in.nextInt();
        
        for (int i = 0; i < casos; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
        System.out.println(fibonacci(casos));
    }

}