package ejerciciosud3;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static boolean esTriangulo(int ladoA,int ladoB, int ladoC){
        return ladoA+ladoB>ladoC&&ladoA+ladoC>ladoB&&ladoB+ladoC>ladoA;
    }
    
    public static String tipoTriangulo(int ladoA,int ladoB, int ladoC){
        if(esTriangulo(ladoA, ladoB, ladoC)) {
            if(ladoA==ladoB&&ladoA==ladoC)
                return "Equilatero";
            else if((ladoA!=ladoB&&ladoA==ladoC)||(ladoA==ladoB&&ladoA!=ladoC))
                return "Isosceles";
            return "Escaleno";
        }
        return "Los lados no forman un trángulo válido";
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ladoA=in.nextInt();
        int ladoB=in.nextInt();
        int ladoC=in.nextInt();
        
        System.out.println(tipoTriangulo(ladoA, ladoB, ladoC));
        
    }

}