import java.util.ArrayList;


public class Nomina 
{
    public obtencion_datos datos = new obtencion_datos();
    public int total_salarios = 0;
    public int salios_sin_extra = 0;
    public int pago_horas_extra = 0;
    public int contador_horas_extra_con = 0;
    public int contador_horas_extra_sin = 0;
    public int horas_laboradas = 0;
    public int horas_extra_laboradas = 0;


    public void Reporte()
    {
        ArrayList<Empleado> empleados = datos.agregarEmpleado();
        System.out.println("--------Reporte de nomina--------");
        System.out.println("Cantidad de empleados:"+ empleados.size());
        System.out.println("--------Datos de los empleados--------");
        int contador = 0;
    
        for (Empleado empleado : empleados)
        {
            Categoria categoria = empleado.getCategoria();
            contador ++;
            System.out.println(contador + "--" + empleado.getNombre_del_empleado());
            System.out.println("Sueldo base: "+ categoria.getSueldo_base());
            System.out.println("Horas trabajadas:" + empleado.getHoras_trabajadas());
            System.out.println("Horas extra trabajadas:" + empleado.getHrs_extras());
            System.out.println("Pago total:"+ (empleado.getHoras_trabajadas()*categoria.getSueldo_base()) + empleado.getHrs_extras()*categoria.getSueldo_extra());
            System.out.println(("-").repeat(120));
            total_salarios += (empleado.getHoras_trabajadas()*categoria.getSueldo_base()) + (empleado.getHrs_extras()*categoria.getSueldo_extra());
            salios_sin_extra += empleado.getHoras_trabajadas()*categoria.getSueldo_base();
            pago_horas_extra += empleado.getHrs_extras()*categoria.getSueldo_extra();
            horas_laboradas += empleado.getHrs_extras()+empleado.getHoras_trabajadas();
            horas_extra_laboradas += empleado.getHrs_extras();

            if (empleado.getHrs_extras() == 0)
            {
                contador_horas_extra_sin += 1;
            }else
            {
                contador_horas_extra_con += 1;
            }
 
        }
        System.out.println("Pago total de nomina: " + total_salarios);
        System.out.println("pago de horas laborales estandar: " + salios_sin_extra);
        System.out.println("Pago de horas extras: " + pago_horas_extra);
        System.out.println("total de horas laboradas: "+ horas_laboradas);
        System.out.println("Empleados con horas extras: " + contador_horas_extra_con);
        System.out.println("Empleados sin horas extras: " + contador_horas_extra_sin);
        System.out.println("Total de horas extras trabajadas: "+ horas_extra_laboradas);
        System.out.println("------Fin-------");

    }

    

}
