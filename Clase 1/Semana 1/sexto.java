import java.util.Scanner;

public class sexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2, numero3, menor, mayor, resultado;

        System.out.print("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        System.out.print("Ingrese el numero de los multiplos que no desea imprimir: ");
        numero3 = sc.nextInt();

        if (numero1 < numero2) {
            mayor = numero2;
            menor = numero1;
        } else {
            mayor = numero1;
            menor = numero2;
        }

        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");

        resultado = mayor - menor;

        if (resultado <= numero3) {
            System.out.println("El numero " + numero3 + " es un número no permitido porque es mayor o menor que los numero ingresados.");
        } else {
            do {
                if (menor % numero3 != 0) {
                    System.out.println(menor);
                }
                menor = menor + 1;
            } while (menor <= mayor);
        }
    }
}