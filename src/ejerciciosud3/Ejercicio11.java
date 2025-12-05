package ejerciciosud3;

public class Ejercicio11 {
    
    private static boolean esPerfecto(int n){
        int suma=0;
        
        for (int i = 1; i < n; i++) {
            if(n%i==0)
                suma+=i;
        }
        
        return suma==n;
    }
    
    public static void main(String[] args) {
        final int MAX=4;
        int contador=0;
        int n=1;
        
        while(contador<MAX){
            if(esPerfecto(n)){
                System.out.println(n);
                contador++;
            }
            n++;
        }
        
        
    }

}