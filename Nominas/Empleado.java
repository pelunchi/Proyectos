

public class Empleado 
{
    private String Nombre_del_empleado;
    private int Horas_trabajadas;
    private int Hrs_extras;
    private String telefono;
    private String Fecha_de_nacimiento;
    private Categoria categoria = new Categoria("","", 0.0, 0.0);
    
    
    public Empleado() {
        Categoria categoria = new Categoria("","", 0.0, 0.0);
        Nombre_del_empleado = "";
        Horas_trabajadas = 0;
        Hrs_extras = 0;
        this.telefono = "";
        Fecha_de_nacimiento = "";
        this.categoria = categoria;
    }
    public Empleado(String nombre_del_empleado, int horas_trabajadas, int hrs_extras, String telefono,
            String fecha_de_nacimiento, Categoria categoria) {        
        Nombre_del_empleado = nombre_del_empleado;
        Horas_trabajadas = horas_trabajadas;
        Hrs_extras = hrs_extras;
        this.telefono = telefono;
        Fecha_de_nacimiento = fecha_de_nacimiento;
        this.categoria = categoria;
    }


    public String getNombre_del_empleado() {
        return Nombre_del_empleado;
    }


    public void setNombre_del_empleado(String nombre_del_empleado) {
        Nombre_del_empleado = nombre_del_empleado;
    }


    public int getHoras_trabajadas() {
        return Horas_trabajadas;
    }


    public void setHoras_trabajadas(int horas_trabajadas) {
        Horas_trabajadas = horas_trabajadas;
    }


    public int getHrs_extras() {
        return Hrs_extras;
    }


    public void setHrs_extras(int hrs_extras) {
        Hrs_extras = hrs_extras;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }


    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        Fecha_de_nacimiento = fecha_de_nacimiento;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
