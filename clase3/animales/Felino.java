package animales;
public interface Felino {
    //una interfaz funciona como un contrato, el cual las clases que implementen la interfaz deben cumplir
    //aunque no define como se deben implementar los metodos
    //es mas flexible que una clase abstracta, ya que una clase puede implementar varias interfaces
    //mientras que una clase solo puede heredar de una clase padre en Java
    abstract void Cazar();

    //normalmente los metodos de una interface son abstractos, pero con default se pueden hacer metodos predefinidos
    default void Acicalar() {
        System.out.println("Se acicala");
    }
}
