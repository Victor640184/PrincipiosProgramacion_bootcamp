package PracticaGetter_Setter;

public class Persona {

    private int edad;
    private String Nombre;
    private String telefono;

    public void setEdad(int edad) {///metodo setter establemos los parametros
        this.edad = edad;}

    public void setNombre(String nombre) {
       this.Nombre = nombre;}

    public void setTelefono(String telefono){
         this.telefono = telefono;}


    public int getEdad() {///metodo Getter mostramos las variables
        return edad;}

    public String getNombre() {
        return Nombre;}

    public String getTelefono() {
        return telefono;}

}

