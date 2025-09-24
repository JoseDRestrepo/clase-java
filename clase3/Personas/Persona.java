package Personas;
public class Persona {
    //atributos
    private String nombre;
    public int edad;
    public boolean casado;
    protected static final int EDAD_MAXIMA = 120;
    //el modificador de acceso provate hace que el atributo solo sea accesible dentro de la misma clase
    //static hace que sea una unica variable compartida x todas las instancias de la clase, es decir, es una unica copia 
    //final que no se pueda cambiar luego de la inicializacion
    //protected que solo sea accesieble dentro del mismo paquete o subclases

    //constructor
    public Persona(String nombre, int edad, boolean casado) {
        setNombre(nombre); //la palabra clave "this" se refiere a la instancia actual, se usa para asignar los valores del objeto
        this.casado = false;
        setEdad(edad);
    }

    //sobrecarga de metodos: un metodo con el mismo nombre en una misma clase pero con diferentes parametros
    public Persona(String nombre, int edad) {
        this(nombre, edad, false); 
        //Llama al constructor principal y le asigna un valor por defecto false a casado
    } //dependiendo de los parametros, el compilador de Java sabra que constructor usar

    //metodos
    public void MostrarInformacion () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (casado == true) {
            System.out.println("Está casado");
        } else {
            System.out.println("Es soltero");
        }
    }

    //metodo setter con validación que la edad no sea < 0 ni > a EDAD_MAXIMA
    public void setEdad( int edad) {
        if (edad < 0 || edad > EDAD_MAXIMA) {
            throw new IllegalArgumentException("ingrese un numero para la edad valido");
        }
        this.edad = edad; 
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    //luego de poner a un atributo private, para controlar el acceso a este se debe usar un metodo getter, como el siguiente:
    public String getNombre() {
        return nombre;
    }
    //sin el metodo getter se podria acceder al atributo de manera directa y este tendria que ser public
    //los metodos getter y setter permiten controlar el acceso a los atributos de la clase 

    //metodo toString() que devuelve una representacion en forma de cadena de texto del objeto
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", casado=" + casado + "]";
    } //es util porque permite imprimir el objeto de manera legible

    //metodos hashCode() y equals() para comparar objetos de la clase Persona
    //hashCode() devuelve un valor entero que representa el objeto
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
        result = prime * result + (casado ? 1231 : 1237);
        return result;
    } //es necesario para usar objetos de la clase Persona en estructuras de datos como HashMap o HashSet
    //genera un valor numerico para organizar y buscar objetos rapidamente

    //equals() compara dos objetos de la clase Persona y devuelve true si son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        if (casado != other.casado)
            return false;
        return true;
    } //es util para comparar que objetos de la clase Persona no sean logicamente iguales
    //esto es importante porque si dos objetos tienen un mismo codigo hash se causa una colision
    //para esto equals realiza la comparacion final
    //si dos objetos son iguales segun equals deben tener el mismo hashCode
}
