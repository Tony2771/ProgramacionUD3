package aceptaelretoud3;

import java.util.Scanner;

public class P_372 {
    
    private static String reverse(String palabra){
        
        String nueva="";
        
        for (int i = palabra.length()-1; i >=0; i--) {
            nueva+=palabra.charAt(i);
        }
        
        return nueva;
    }
    
    private static String resuelve(String palabra){
        boolean mayusculas = Character.isUpperCase(palabra.charAt(0));
        
        palabra=palabra.toLowerCase();
        String res= reverse(palabra);
        if(mayusculas)
            res=(char)(res.charAt(0) - 32) + res.substring(1);
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=in.nextInt();
        in.nextLine(); //Vaciado del Enter
        
        while(casos-->0){
            System.out.println(resuelve(in.nextLine()));
        }
    }
}