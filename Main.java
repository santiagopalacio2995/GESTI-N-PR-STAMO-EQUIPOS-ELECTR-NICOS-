import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();
        boolean bandera = true;
        while (bandera) {
            System.out.println("Bienvenido - Gestion Prestamo Equipos San Juan de Dios");
            System.out.println("Que accion desea realizar");
            System.out.println("1. Estudiantes de Ingenieria");
            System.out.println("2. Estudiantes de Diseno");
            System.out.println("3. Salir");
            int opt = v.ValidarEntero(sc);
            opt = v.ValidarRango(1, 3, opt, sc);
            switch (opt) {
                case 1: Menu.menuIngenieria(sc); break;
                case 2: Menu.menuDiseno(sc);     break;
                case 3:
                    System.out.println("Hasta luego");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}

}
