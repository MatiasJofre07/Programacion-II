import java.util.Scanner;

public class septimo {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        String usuario = "Enzo";
        int contrasena = 4321;

            System.out.print("Ingrese el usuario: ");
            usuario = entrada.nextLine();
            if (usuario.equals("Enzo")) {
                System.out.print("Ingrese la contraseña: ");
                contrasena = entrada.nextInt();
                if (contrasena == 4321) {
                    System.out.print("¡A ingresado corectamente!");
                } else {
                    System.out.print("Contraseña incorecta.");
                }
            } else {
                System.out.print("Usario incorrecto.");
            }
    }
}