package Personas;
public class Empleado extends Persona {
    public double salario;
    
    public Empleado(String nombre, int edad, boolean casado, double salario) {
        super(nombre, edad, casado); //llama al constructor de la clase padre
        this.salario = salario; 
    }

    public Empleado(String nombre, int edad, double salario) {
        this(nombre, edad, false, salario); //llama al constructor principal y le asigna un valor por defecto false a casado
    }
    
    //la sobreescritura de metodos permite a la clase hija modificar un metodo de la clase padre
    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.printf("Salario: $%,.0f%n", salario);
    }

    public void Renunciar() {
        System.out.println(getNombre() + " ha renunciado a su trabajo.");
    }
}
