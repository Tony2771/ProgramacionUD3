package ejerciciosud3;

import java.util.Scanner;

public class Ejercicio04 {
    
    private static String esVocal(String a){
        if(a.charAt(0)>=65 && a.charAt(0)<=90){
            if(a.charAt(0)==65||a.charAt(0)==69||a.charAt(0)==73||a.charAt(0)==79||a.charAt(0)==85)
                return "Vocal mayúscula";
        }else if(a.charAt(0)>=97 && a.charAt(0)<=122){
            if(a.charAt(0)==97||a.charAt(0)==101||a.charAt(0)==105||a.charAt(0)==111||a.charAt(0)==117)
                return "Vocal minúscula";
        }
        return "No es una vocal";
    }
    private static String esConsonante(String a){
        if(a.charAt(0)>=65 && a.charAt(0)<=90){
            if(!(a.charAt(0)==65||a.charAt(0)==69||a.charAt(0)==73||a.charAt(0)==79||a.charAt(0)==85))
                return "Consonante mayúscula";
        }else if(a.charAt(0)>=97 && a.charAt(0)<=122){
            if(!(a.charAt(0)==97||a.charAt(0)==101||a.charAt(0)==105||a.charAt(0)==111||a.charAt(0)==117))
                return "Consonante minúscula";
        }
        return "No es una consonante";
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String caracter=in.next();
        
        System.out.println(esVocal(caracter));
        System.out.println(esConsonante(caracter));
    }

}