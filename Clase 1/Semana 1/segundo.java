import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Ingrese el primer numero: ");
            numero1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero: ");              
            numero2 = scanner.nextInt();

            System.out.println("Números desde " + numero1 + " hasta " + numero2 + " : ");
            for (int i = numero1; i <= numero2; i++) {
               System.out.println(i);
            }
        
    }
}
