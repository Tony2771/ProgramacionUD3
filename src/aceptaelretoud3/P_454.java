package aceptaelretoud3;

import java.util.Scanner;

public class P_454 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia,desnivel;// Nivel de aguante que tienen en distancia y desnivel
        int recorrido,pendiente;//Distancia que recorren y pendientes que cojen
        int maxRecorrido;
        int maxPendiente;
        boolean destituido;
        int numJornadas;
        int distanciaAcumulado;
        int desnivelAcumulado;
        
        
        while(in.hasNext()){
            destituido=false;
            numJornadas=0;
            distancia=in.nextInt();
            desnivel=in.nextInt();
            do{
                recorrido=in.nextInt();
                pendiente=in.nextInt();
                
                if(maxRecorrido<distancia||maxPendiente<desnivel){
                    destituido=true;
                    in.nextLine();
                    break;
                }
                
                if()
                
            }while(recorrido!=0||pendiente!=0);
            if(destituido)
                System.out.println("DESTITUIDO");
        }
    }
}