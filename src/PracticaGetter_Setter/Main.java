package PracticaGetter_Setter;

public class Main {

    public static void main(String[] args) {

        Persona objecto1 = new Persona () ;

        objecto1.setEdad ( 15 );
        System.out.println ("la Edad es:" +objecto1.getEdad ());

        objecto1.setNombre ("Juanma" );
        System.out.println ("El nombre es:"+objecto1.getNombre ());

        objecto1.setTelefono ("0573114130932" +objecto1.getTelefono ());
        System.out.println ("El telefono es:"+ objecto1.getTelefono ());

    }

}
