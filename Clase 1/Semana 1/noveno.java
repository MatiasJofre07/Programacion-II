import java.util.Scanner;

public class noveno {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        String palabra;
        int contador;

        System.out.println("Ingrese una frase o alguna palabra para contar: ");
        palabra = entrada.nextLine();

        contador = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'A'|palabra.charAt(i) == 'E'|palabra.charAt(i) == 'I'|palabra.charAt(i) == 'O'|palabra.charAt(i) == 'U'|palabra.charAt(i) == 'a'|palabra.charAt(i) == 'e'|palabra.charAt(i) == 'i'|palabra.charAt(i) == 'o'|palabra.charAt(i) == 'u') {
                contador = contador+1;
            }
        }
        System.out.println("La cantidad de vocales que tiene son: " + contador);
    }
}
