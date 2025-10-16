package ejercicios.depuracion;

import java.util.Scanner;
public class Ejemplo1While {
    public static void main(String[] args) {
        private int suma, num;
        public Ejemplo1While(){
            this.suma=0;
            this.numero=0;
        }
        int suma = 0, numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número, por favor: ");
        num = sc.nextInt();
        while (num>= 0){
               suma = suma + num;
               System.out.print("Introduzca un número, por favor: ");
               num = sc.nextInt();
        }
        System.out.println("La suma es: " + suma );
    }
}

