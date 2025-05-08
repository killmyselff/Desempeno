import java.util.Scanner;

public class contrasenaCorrectaIncorrecta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        String clave = scanner.nextLine();

        if (clave.equals("java123")) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        scanner.close();
    }
}
