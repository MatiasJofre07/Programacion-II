import java.util.Scanner;

public class octava {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean bandera = false;
        int opc, contrasena = 4321, decicion;
        String usuario = "Enzo";

        do {

            System.out.println("1. Ingresar al login.");
            System.out.println("2. Cambiar de contraseña.");
            System.out.println("0. Salir.");
            System.out.println("Introduce un numero: ");
            opc = entrada.nextInt();

        } while (opc > 2);

        switch (opc) {

            case 1:
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
                break;

            case 2:
                do {
                    bandera = true;
                    System.out.println("Desea modificar la contraseña:");
                    System.out.println("1. Si.");
                    System.out.println("2. No.");
                    decicion = entrada.nextInt();
                    if (decicion < 1 | decicion > 2) {
                        System.out.println("Numero equivocado");
                        bandera = false;
                    }
                } while (bandera == false);
                if (decicion == 1) {
                    System.out.print("Ingrese la nueva contraseña:");
                    int nuevaContra = entrada.nextInt();
                    contrasena = nuevaContra;
                    System.out.println("Se ha cambiado la contraseña");
                } else if (decicion == 2) {
                    System.out.println("Fin del programa");
                }
                break;

            case 0:
                System.out.println("Salio del login.");
                break;
            default:
        }
    }
}
