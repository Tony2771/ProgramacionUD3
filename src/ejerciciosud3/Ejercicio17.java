package ejerciciosud3;

public class Ejercicio17 {
    
    private static int mcd(int n,int m){
        if(n<=m&&m%n==0)
            return n;
        
        if(m<n)
            return mcd(n,m);
        
        return mcd(n, m%n);
    }
    
    public static void main(String[] args) {
       int a=18;
       int b=24;
       
        System.out.println(mcd(a, b));
    }

}