
package herencia;

public class Empleado extends Persona{
  
    private double sueldo;

    public Empleado(double sueldo, String nombre, String apellido, int codigo) {
        super(nombre, apellido, codigo);
        this.sueldo = sueldo;
    }
    
   public String mostrarEmpleado (){
       return getNombre()+"Apellido/n" +getApellido()+"Documento/n"+ getCodigo()+"Sueldo"+sueldo;
   } 
}
