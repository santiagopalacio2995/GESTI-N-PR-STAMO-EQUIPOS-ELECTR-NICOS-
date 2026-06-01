import modelos.EstudianteDiseno;
import validaciones.Validaciones;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class GestionDiseno {

    Validaciones v = new Validaciones();

    public LinkedList<EstudianteDiseno> llenarLista(LinkedList<EstudianteDiseno> lista, Scanner sc) {
        boolean pedir = true;
        while (pedir) {
            EstudianteDiseno o = new EstudianteDiseno();

            System.out.println("Ingrese la cedula");
            o.setCedula(String.valueOf(v.ValidarCedula(sc)));

            System.out.println("Ingrese el nombre");
            sc.nextLine();
            String nombre = sc.nextLine();
            while (!v.ValidarTexto(nombre)) {
                System.out.println("No se permiten caracteres especiales");
                nombre = sc.nextLine();
            }
            o.setNombre(nombre);

            System.out.println("Ingrese el apellido");
            String apellido = sc.nextLine();
            while (!v.ValidarTexto(apellido)) {
                System.out.println("No se permiten caracteres especiales");
                apellido = sc.nextLine();
            }
            o.setApellido(apellido);

            System.out.println("Ingrese el telefono");
            String telefono = sc.nextLine();
            o.setTelefono(telefono);

            System.out.println("Ingrese la modalidad (virtual/presencial)");
            String modalidad = sc.nextLine();
            while (!modalidad.equalsIgnoreCase("virtual") && !modalidad.equalsIgnoreCase("presencial")) {
                System.out.println("Solo se permite virtual o presencial");
                modalidad = sc.nextLine();
            }
            o.setModalidad(modalidad);

            System.out.println("Ingrese la cantidad de asignaturas");
            int asignaturas = v.ValidarEntero(sc);
            o.setCantidadAsignaturas(asignaturas);

            System.out.println("Ingrese el serial del equipo");
            int serial = v.ValidarEntero(sc);
            o.setSerialEquipo(serial);

            lista.add(o);

            System.out.println("Desea seguir ingresando? S/N");
            sc.nextLine();
            String opt = sc.nextLine();
            while (!v.ValidarDimension(opt)) {
                opt = sc.nextLine();
            }
            if (opt.equalsIgnoreCase("N")) {
                pedir = false;
            }
        }
        return lista;
    }

    public Stack<EstudianteDiseno> llenarPila(Stack<EstudianteDiseno> pila, Scanner sc) {
        boolean pedir = true;
        while (pedir) {
            EstudianteDiseno o = new EstudianteDiseno();

            System.out.println("Ingrese la cedula");
            o.setCedula(String.valueOf(v.ValidarCedula(sc)));

            System.out.println("Ingrese el nombre");
            sc.nextLine();
            String nombre = sc.nextLine();
            while (!v.ValidarTexto(nombre)) {
                System.out.println("No se permiten caracteres especiales");
                nombre = sc.nextLine();
            }
            o.setNombre(nombre);

            System.out.println("Ingrese el apellido");
            String apellido = sc.nextLine();
            while (!v.ValidarTexto(apellido)) {
                System.out.println("No se permiten caracteres especiales");
                apellido = sc.nextLine();
            }
            o.setApellido(apellido);

            System.out.println("Ingrese el serial del equipo");
            int serial = v.ValidarEntero(sc);
            o.setSerialEquipo(serial);

            pila.push(o);

            System.out.println("Desea seguir ingresando? S/N");
            String opt = sc.nextLine();
            while (!v.ValidarDimension(opt)) {
                opt = sc.nextLine();
            }
            if (opt.equalsIgnoreCase("N")) {
                pedir = false;
            }
        }
        return pila;
    }

    public Queue<EstudianteDiseno> llenarCola(Queue<EstudianteDiseno> cola, Scanner sc) {
        boolean pedir = true;
        while (pedir) {
            EstudianteDiseno o = new EstudianteDiseno();

            System.out.println("Ingrese la cedula");
            o.setCedula(String.valueOf(v.ValidarCedula(sc)));

            System.out.println("Ingrese el nombre");
            sc.nextLine();
            String nombre = sc.nextLine();
            while (!v.ValidarTexto(nombre)) {
                System.out.println("No se permiten caracteres especiales");
                nombre = sc.nextLine();
            }
            o.setNombre(nombre);

            System.out.println("Ingrese el apellido");
            String apellido = sc.nextLine();
            while (!v.ValidarTexto(apellido)) {
                System.out.println("No se permiten caracteres especiales");
                apellido = sc.nextLine();
            }
            o.setApellido(apellido);

            System.out.println("Ingrese el serial del equipo");
            int serial = v.ValidarEntero(sc);
            o.setSerialEquipo(serial);

            cola.offer(o);

            System.out.println("Desea seguir ingresando? S/N");
            String opt = sc.nextLine();
            while (!v.ValidarDimension(opt)) {
                opt = sc.nextLine();
            }
            if (opt.equalsIgnoreCase("N")) {
                pedir = false;
            }
        }
        return cola;
    }

    public void mostrarLista(LinkedList<EstudianteDiseno> lista) {
        for (EstudianteDiseno o : lista) {
            o.mostrarDatos();
        }
    }

    public void mostrarPila(Stack<EstudianteDiseno> pila) {
        for (EstudianteDiseno o : pila) {
            o.mostrarDatos();
        }
    }

    public void mostrarCola(Queue<EstudianteDiseno> cola) {
        for (EstudianteDiseno o : cola) {
            o.mostrarDatos();
        }
    }

    public LinkedList<EstudianteDiseno> modificar(LinkedList<EstudianteDiseno> lista, Scanner sc) {
        System.out.println("Ingrese la cedula a modificar");
        String cedula = String.valueOf(v.ValidarEntero(sc));
        for (EstudianteDiseno o : lista) {
            if (o.getCedula().equals(cedula)) {
                System.out.println("Ingrese el nuevo nombre");
                sc.nextLine();
                String nombre = sc.nextLine();
                while (!v.ValidarTexto(nombre)) {
                    System.out.println("No se permiten caracteres especiales");
                    nombre = sc.nextLine();
                }
                o.setNombre(nombre);

                System.out.println("Ingrese el nuevo apellido");
                String apellido = sc.nextLine();
                while (!v.ValidarTexto(apellido)) {
                    System.out.println("No se permiten caracteres especiales");
                    apellido = sc.nextLine();
                }
                o.setApellido(apellido);

                System.out.println("Ingrese el nuevo telefono");
                o.setTelefono(sc.nextLine());

                System.out.println("Ingrese la nueva modalidad (virtual/presencial)");
                String modalidad = sc.nextLine();
                while (!modalidad.equalsIgnoreCase("virtual") && !modalidad.equalsIgnoreCase("presencial")) {
                    System.out.println("Solo se permite virtual o presencial");
                    modalidad = sc.nextLine();
                }
                o.setModalidad(modalidad);

                System.out.println("Ingrese la nueva cantidad de asignaturas");
                o.setCantidadAsignaturas(v.ValidarEntero(sc));

                System.out.println("Registro actualizado");
            }
        }
        return lista;
    }

    public LinkedList<EstudianteDiseno> eliminar(LinkedList<EstudianteDiseno> lista, Scanner sc) {
        System.out.println("Ingrese la cedula a eliminar");
        String cedula = String.valueOf(v.ValidarEntero(sc));
        lista.removeIf(o -> o.getCedula().equals(cedula));
        System.out.println("Registro eliminado");
        return lista;
    }

    public void buscar(LinkedList<EstudianteDiseno> lista, Scanner sc) {
        System.out.println("Ingrese la cedula a buscar");
        String cedula = String.valueOf(v.ValidarEntero(sc));
        boolean encontrado = false;
        for (EstudianteDiseno o : lista) {
            if (o.getCedula().equals(cedula)) {
                o.mostrarDatos();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun registro con esa cedula");
        }
    }

    public void buscarPorSerial(LinkedList<EstudianteDiseno> lista, Scanner sc) {
        System.out.println("Ingrese el serial a buscar");
        int serial = v.ValidarEntero(sc);
        boolean encontrado = false;
        for (EstudianteDiseno o : lista) {
            if (o.getSerialEquipo() == serial) {
                o.mostrarDatos();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun registro con ese serial");
        }
    }
}
