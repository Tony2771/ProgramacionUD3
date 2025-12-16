package aceptaelretoud3;

import java.util.Scanner;

public class P_694 {
    
    private static String acronimo(String cadena){
        Scanner in = new Scanner(cadena);
        StringBuilder sb = new StringBuilder();
        
        String palabra;
        
        while(in.hasNext()){
            palabra=in.next();
            if(Character.isUpperCase(palabra.charAt(0)))
                sb.append(palabra.charAt(0));
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int casos=in.nextInt();
       in.nextLine();
       
       while(casos-->0){
           System.out.println(acronimo(in.nextLine()));
       }
    }
}