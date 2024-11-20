
import java.util.ArrayList;
import java.util.Scanner;
public class obtencion_datos
{
    

    ArrayList<Empleado> listaEmpleados  = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Empleado> agregarEmpleado() 
    {
        System.out.println("Ingrese la cantidad de empleados que serán registrados:");
        int Empleados_a_registrar = scanner.nextInt();

        for (int i=0 ; i < Empleados_a_registrar;i++)
        {
            Empleado empleado = new Empleado();
            Categoria categoria = new Categoria(null, null, i, i);
            
            try {
                System.out.println("\nIngrese el nombre del empleado a agregar:");
                empleado.setNombre_del_empleado(scanner.next());

                System.out.println("\nIngrese las horas trabajadas:");
                empleado.setHoras_trabajadas(scanner.nextInt());
                System.out.println("\nIngrese las horas extras:");
                empleado.setHrs_extras(scanner.nextInt());
                scanner.nextLine();  // Consume the newline character

                System.out.println("\nIngrese el número de teléfono del trabajador:");
                empleado.setTelefono(scanner.nextLine());

                System.out.println("Ingrese la fecha de nacimiento del trabajador en formato dd/mm/aaaa: ");
                empleado.setFecha_de_nacimiento(scanner.next() + "/" + scanner.next() + "/" + scanner.next());
                scanner.nextLine(); // Consume the newline character
                System.out.println(" \nNombre de la categoría: Ventas, Administrador, Gerente");
                String nombre_categoria = scanner.next();
                scanner.nextLine();
                
                while (!nombre_categoria.equals("Ventas") && !nombre_categoria.equals("Administrador") && !nombre_categoria.equals("Gerente")) {
                    System.out.println(" \nVuelve a intentarlo nombre de la categoría: Ventas de ventas, Administrador, Gerente");
                    nombre_categoria = scanner.nextLine();
                }
                categoria.setNombre_de_la_categoria(nombre_categoria);
                System.out.println(" \nClave de la categoría: ");
                categoria.setClave_categoria(scanner.next());

                empleado.setCategoria(categoria);
            } catch (Exception e) {
                System.out.println("\nfavor de ingresar un valor correcto");
            } 
            System.out.println(("-").repeat(60));
            categoria = empleado.getCategoria();
            switch (categoria.getNombre_de_la_categoria()) {
                case "Ventas":
                    categoria.setSueldo_base(100.0);
                    categoria.setSueldo_extra(50.0);
                    break;
                case "Administrador":
                    categoria.setSueldo_base(180.00);
                    categoria.setSueldo_extra(100.0);
                case "Gerente":
                    categoria.setSueldo_base(250.00);
                    categoria.setSueldo_extra(150.0);

                    break;
            }

            System.out.println("Categoría: " + categoria.getNombre_de_la_categoria());
            System.out.println("Clave: " + categoria.getClave_categoria());
            System.out.println("Sueldo Base: " + categoria.getSueldo_base());
            System.out.println(("-").repeat(60));
            listaEmpleados.add(empleado);
        }
        scanner.close();
        return listaEmpleados;
    }
}
