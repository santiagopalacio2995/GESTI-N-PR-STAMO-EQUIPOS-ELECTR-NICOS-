import modelos.EstudianteIngenieria;
import modelos.ComputadorPortatil;
import validaciones.Validaciones;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class GestionIngenieria {

    Validaciones v = new Validaciones();

    public LinkedList<EstudianteIngenieria> llenarLista(LinkedList<EstudianteIngenieria> lista, Scanner sc) {
        boolean pedir = true;
        while (pedir) {
            EstudianteIngenieria o = new EstudianteIngenieria();

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

            System.out.println("Ingrese el semestre");
            int semestre = v.ValidarEntero(sc);
            semestre = v.ValidarRango(1, 10, semestre, sc);
            o.setSemestre(semestre);

            System.out.println("Ingrese el promedio");
            double promedio = v.ValidarDecimal(sc);
            o.setPromedio(promedio);

            System.out.println("Ingrese el serial del equipo");
            sc.nextLine();
            String serial = sc.nextLine();
            o.setSerialEquipo(serial);

            lista.add(o);

            System.out.println("Desea seguir ingresando? S/N");
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

    public Stack<EstudianteIngenieria> llenarPila(Stack<EstudianteIngenieria> pila, Scanner sc) {
        boolean pedir = true;
        while (pedir) {
            EstudianteIngenieria o = new EstudianteIngenieria();

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
            String serial = sc.nextLine();
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

    public Queue<EstudianteIngenieria> llenarCola(Queue<EstudianteIngenieria> cola, Scanner sc) {
        boolean pedir = true;
        while (pedir) {
            EstudianteIngenieria o = new EstudianteIngenieria();

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
            String serial = sc.nextLine();
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

    public void mostrarLista(LinkedList<EstudianteIngenieria> lista) {
        for (EstudianteIngenieria o : lista) {
            o.mostrarDatos();
        }
    }

    public void mostrarPila(Stack<EstudianteIngenieria> pila) {
        for (EstudianteIngenieria o : pila) {
            o.mostrarDatos();
        }
    }

    public void mostrarCola(Queue<EstudianteIngenieria> cola) {
        for (EstudianteIngenieria o : cola) {
            o.mostrarDatos();
        }
    }

    public LinkedList<EstudianteIngenieria> modificar(LinkedList<EstudianteIngenieria> lista, Scanner sc) {
        System.out.println("Ingrese la cedula a modificar");
        String cedula = String.valueOf(v.ValidarEntero(sc));
        for (EstudianteIngenieria o : lista) {
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

                System.out.println("Ingrese el nuevo semestre");
                int semestre = v.ValidarEntero(sc);
                semestre = v.ValidarRango(1, 10, semestre, sc);
                o.setSemestre(semestre);

                System.out.println("Ingrese el nuevo promedio");
                o.setPromedio(v.ValidarDecimal(sc));

                System.out.println("Registro actualizado");
            }
        }
        return lista;
    }

    public LinkedList<EstudianteIngenieria> eliminar(LinkedList<EstudianteIngenieria> lista, Scanner sc) {
        System.out.println("Ingrese la cedula a eliminar");
        String cedula = String.valueOf(v.ValidarEntero(sc));
        lista.removeIf(o -> o.getCedula().equals(cedula));
        System.out.println("Registro eliminado");
        return lista;
    }

    public void buscar(LinkedList<EstudianteIngenieria> lista, Scanner sc) {
        System.out.println("Ingrese la cedula a buscar");
        String cedula = String.valueOf(v.ValidarEntero(sc));
        boolean encontrado = false;
        for (EstudianteIngenieria o : lista) {
            if (o.getCedula().equals(cedula)) {
                o.mostrarDatos();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun registro con esa cedula");
        }
    }

    public void buscarPorSerial(LinkedList<EstudianteIngenieria> lista, Scanner sc) {
        System.out.println("Ingrese el serial a buscar");
        sc.nextLine();
        String serial = sc.nextLine();
        boolean encontrado = false;
        for (EstudianteIngenieria o : lista) {
            if (o.getSerialEquipo().equalsIgnoreCase(serial)) {
                o.mostrarDatos();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun registro con ese serial");
        }
    }
}