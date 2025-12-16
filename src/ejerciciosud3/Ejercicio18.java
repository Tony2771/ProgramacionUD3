package ejerciciosud3;

public class Ejercicio18 {
    
    private static boolean esPalindromo(String cadena){
        if(cadena.length()==0||cadena.length()==1)
            return true;
        if(cadena.charAt(0)!=cadena.charAt(cadena.length()-1))
            return false;
        
        return esPalindromo(cadena.substring(1,cadena.length()-1));
    }
    
    public static void main(String[] args) {
       String cadena="reconocer";
       
        if(esPalindromo(cadena))
            System.out.println("Es palindromo");
        else
            System.out.println("No es palindromo");
    }

}