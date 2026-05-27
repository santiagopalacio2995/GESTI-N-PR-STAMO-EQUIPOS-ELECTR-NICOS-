
import validaciones.Validaciones;


public class Menu {

  
    public static void menuIngenieria() {
        int opcion;
        do {
            System.out.println("\n");
            System.out.println(" ESTUDIANTES DE INGENIERÍA ");
            System.out.println(" ");
            System.out.println(" 1. Registrar préstamo");
            System.out.println(" 2. Modificar préstamo");
            System.out.println(" 3. Devolución de equipo ");
            System.out.println(" 4. Buscar préstamo ");
            System.out.println(" 5. Volver al menú principal");
            System.out.println(" ");

            opcion = Validaciones.leerOpcionMenu("  Seleccione una opción: ", 1, 5);

            switch (opcion) {
                case 1: GestionIngenieria.registrarPrestamo(); break;
                case 2: GestionIngenieria.modificarPrestamo(); break;
                case 3: GestionIngenieria.devolverEquipo();    break;
                case 4: GestionIngenieria.buscarPrestamo();    break;
                case 5: System.out.println("  Volviendo al menú principal..."); break;
            }
        } while (opcion != 5);
    }

    
    public static void menuDiseno() {
        int opcion;
        do {
           
            System.out.println("   ESTUDIANTES DE DISEÑO ");
            System.out.println("  ");
            System.out.println("  1. Registrar préstamo ");
            System.out.println("  2. Modificar préstamo ");
            System.out.println("  3. Devolución de equipo");
            System.out.println("  4. Buscar préstamo ");
            System.out.println("  5. Volver al menú principal");
            System.out.println(" ");

            opcion = Validaciones.leerOpcionMenu("  Seleccione una opción: ", 1, 5);

            switch (opcion) {
                case 1: GestionDiseno.registrarPrestamo(); break;
                case 2: GestionDiseno.modificarPrestamo(); break;
                case 3: GestionDiseno.devolverEquipo();    break;
                case 4: GestionDiseno.buscarPrestamo();    break;
                case 5: System.out.println("  ↩ Volviendo al menú principal..."); break;
            }
        } while (opcion != 5);
    }
}
