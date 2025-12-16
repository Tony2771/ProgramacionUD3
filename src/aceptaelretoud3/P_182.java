package aceptaelretoud3;

import java.util.Scanner;

public class P_182 {
    
    private static int getSiguiente(int numero){
        int unidades;
        int multiplicacion=1;
        
        while(numero!=0){
            unidades=numero%10;
            numero/=10;
            multiplicacion*=unidades;
        }
        
        return multiplicacion;
    }
    
    private static int persistencia(int numero){
        int pasos=0;
        
        while(numero>=10){
            pasos++;
            numero=getSiguiente(numero);
        }
        
        return pasos;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=in.nextInt();
        
        while(casos-->0){
            System.out.println(persistencia(in.nextInt()));
        }
    }

}