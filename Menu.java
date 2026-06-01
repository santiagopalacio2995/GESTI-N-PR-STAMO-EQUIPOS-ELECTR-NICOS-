import modelos.EstudianteIngenieria;
import modelos.EstudianteDiseno;
import validaciones.Validaciones;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void menuIngenieria(Scanner sc) {
        GestionIngenieria g = new GestionIngenieria();
        Validaciones v = new Validaciones();

        LinkedList<EstudianteIngenieria> lista = new LinkedList<>();
        Stack<EstudianteIngenieria>      pila  = new Stack<>();
        Queue<EstudianteIngenieria>      cola  = new LinkedList<>();

        boolean bandera = true;
        while (bandera) {
            System.out.println("--- ESTUDIANTES DE INGENIERIA ---");
            System.out.println("1. Llenar lista");
            System.out.println("2. Llenar pila");
            System.out.println("3. Llenar cola");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Mostrar pila");
            System.out.println("6. Mostrar cola");
            System.out.println("7. Modificar");
            System.out.println("8. Eliminar");
            System.out.println("9. Buscar por cedula");
            System.out.println("10. Buscar por serial");
            System.out.println("11. Volver al menu principal");

            int opt = v.ValidarEntero(sc);
            opt = v.ValidarRango(1, 11, opt, sc);

            switch (opt) {
                case 1:  lista = g.llenarLista(lista, sc);      break;
                case 2:  pila  = g.llenarPila(pila, sc);        break;
                case 3:  cola  = g.llenarCola(cola, sc);        break;
                case 4:  g.mostrarLista(lista);                  break;
                case 5:  g.mostrarPila(pila);                    break;
                case 6:  g.mostrarCola(cola);                    break;
                case 7:  lista = g.modificar(lista, sc);         break;
                case 8:  lista = g.eliminar(lista, sc);          break;
                case 9:  g.buscar(lista, sc);                    break;
                case 10: g.buscarPorSerial(lista, sc);           break;
                case 11: bandera = false;                        break;
                default: System.out.println("Opcion no valida"); break;
            }
        }
    }

    public static void menuDiseno(Scanner sc) {
        GestionDiseno g = new GestionDiseno();
        Validaciones v = new Validaciones();

        LinkedList<EstudianteDiseno> lista = new LinkedList<>();
        Stack<EstudianteDiseno>      pila  = new Stack<>();
        Queue<EstudianteDiseno>      cola  = new LinkedList<>();

        boolean bandera = true;
        while (bandera) {
            System.out.println("--- ESTUDIANTES DE DISENO ---");
            System.out.println("1. Llenar lista");
            System.out.println("2. Llenar pila");
            System.out.println("3. Llenar cola");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Mostrar pila");
            System.out.println("6. Mostrar cola");
            System.out.println("7. Modificar");
            System.out.println("8. Eliminar");
            System.out.println("9. Buscar por cedula");
            System.out.println("10. Buscar por serial");
            System.out.println("11. Volver al menu principal");

            int opt = v.ValidarEntero(sc);
            opt = v.ValidarRango(1, 11, opt, sc);

            switch (opt) {
                case 1:  lista = g.llenarLista(lista, sc);      break;
                case 2:  pila  = g.llenarPila(pila, sc);        break;
                case 3:  cola  = g.llenarCola(cola, sc);        break;
                case 4:  g.mostrarLista(lista);                  break;
                case 5:  g.mostrarPila(pila);                    break;
                case 6:  g.mostrarCola(cola);                    break;
                case 7:  lista = g.modificar(lista, sc);         break;
                case 8:  lista = g.eliminar(lista, sc);          break;
                case 9:  g.buscar(lista, sc);                    break;
                case 10: g.buscarPorSerial(lista, sc);           break;
                case 11: bandera = false;                        break;
                default: System.out.println("Opcion no valida"); break;
            }
        }
    }
}
