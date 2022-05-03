import java.util.Scanner;

public class cuarto {
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
        
        do {
            if(menor%5!=0){
                System.out.println(menor);
            }
            menor = menor + 1;
        } while (menor <= mayor);
    }
}
