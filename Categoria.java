public class Categoria {
    private String Nombre_de_la_categoria;
    private String Clave_categoria;
    private double Sueldo_base;
    private double Sueldo_extra;
    
    //Constructor de la clase
    public String getNombre_de_la_categoria() {
        return Nombre_de_la_categoria;
    }
    public Categoria(String nombre_de_la_categoria, String clave_categoria, double sueldo_base, double sueldo_extra) {
        Nombre_de_la_categoria = nombre_de_la_categoria;
        Clave_categoria = clave_categoria;
        Sueldo_base = sueldo_base;
        Sueldo_extra = sueldo_extra;
    }
    public void setNombre_de_la_categoria(String nombre_de_la_categoria) {
        Nombre_de_la_categoria = nombre_de_la_categoria;
    }
    public String getClave_categoria() {
        return Clave_categoria;
    }
    public void setClave_categoria(String clave_categoria) {
        Clave_categoria = clave_categoria;
    }
    public double getSueldo_base() {
        return Sueldo_base;
    }
    public void setSueldo_base(double sueldo_base) {
        Sueldo_base = sueldo_base;
    }
    public double getSueldo_extra() {
        return Sueldo_extra;
    }
    public void setSueldo_extra(double sueldo_extra) {
        Sueldo_extra = sueldo_extra;
    }

    

}
