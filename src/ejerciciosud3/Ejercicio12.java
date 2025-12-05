package ejerciciosud3;

public class Ejercicio12 {

    private static int getDigitos(int n) {
        //Caso base
        if (n < 10)
            return 1;
        //Caso recursivo
        return 1 + getDigitos(n / 10);
    }
    
    public static void main(String[] args) {
        int n = 1234;

        System.out.println(getDigitos(n));
    }

}
