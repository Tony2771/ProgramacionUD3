package aceptaelretoud3;

import java.util.Scanner;

public class P_523 {
    private static final Scanner in = new Scanner(System.in);
    
    private static void resuelveCaso(){
        String matricula;
        int Antiguos=0;
        int Modernos=0;
        int comparacion;
        
        int eduNumeros;
        String eduLetras;
        
        int otroNumeros;
        String otroLetras;
        
        matricula=in.next();
        eduNumeros= Integer.parseInt(matricula.substring(0,4));
        eduLetras=matricula.substring(4);
        
        while(!(matricula=in.next()).equals("0")){
            otroNumeros= Integer.parseInt(matricula.substring(0,4));
            otroLetras=matricula.substring(4);
            
            comparacion=eduLetras.compareTo(otroLetras);
            if(comparacion<0)
                Modernos++;
            else if (comparacion>0)
                Antiguos++;
            else if (eduNumeros<otroNumeros)
                Modernos++;
            else
                Antiguos++;
        }
        System.out.println(Antiguos + " " + Modernos);
    }
    
    public static void main(String[] args) {
        int casos=in.nextInt();
        
        while(casos-->0){
            resuelveCaso();
        }
    }

}