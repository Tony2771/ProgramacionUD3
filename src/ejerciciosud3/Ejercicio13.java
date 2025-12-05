package ejerciciosud3;

import java.util.Scanner;

public class Ejercicio13 {
    
    private static double getPotencia(double base,double potencia){
        if (potencia==1)
            return base;
        return base*getPotencia(base, potencia-1);
    }
    
    private static double getPotenciaAbsoluta(double base,double potencia){
        if(potencia==0)
            return 1;
        if(potencia<0)
            return 1/getPotencia(base, -potencia);
        return getPotencia(base, potencia);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base=in.nextInt();
        int potencia=in.nextInt();
        
        System.out.println(getPotenciaAbsoluta(base, potencia));
    }

}