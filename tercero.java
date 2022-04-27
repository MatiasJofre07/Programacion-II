import java.util.Scanner;

public class tercero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, menor, mayor;
       

            System.out.print("Ingrese el primer numero: ");
            numero1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero: ");              
            numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}