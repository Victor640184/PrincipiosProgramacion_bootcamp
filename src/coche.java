import java.util.Scanner;

public class coche {

    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        System.out.println("ingreso el numero de puertas de su vehiculo");
        int numerodePuertas = entradas.nextInt();
        System.out.println ( "Tu carro tiene:" + numerodePuertas + " puertas" );


        IncrementoPuertas(numerodePuertas);

    }               

        static void IncrementoPuertas(int numerodePuertas){
        int incrementer1 = numerodePuertas ++;
        System.out.println("se incrementaron puertas, tu carro tiene:"+ incrementer1 );


}


}
