package operaciones;
public class OperacionesAritmeticas {
    //atributos
    public int num1;
    public int num2;
    public int num3;
    public double n1;
    public double n2;

    //metodos
    public int Sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    
    public double Sumar(double n1, double n2) {
        double suma = n1 + n2;
        return suma;
    }
    //otro metodo sumar con distinto numero de parametros:
    public int Sumar(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        return suma;
    }
    //dependiendo de los datos recibidos cuando se ejecute el metodo sumar el compilador seleccionara cual de los 3 sumar usar

    public int Multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public int Dividir(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

    public int Restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public void MostrarSuma() {
        int resultadoSuma = Sumar(num1, num2);
        System.out.println("Resultado operación: " + resultadoSuma);
    }

    public void MostrarMultiplicacion() {
        int resultadoMultiplicacion = Multiplicar(num1, num2);
        System.out.println("Resultado operación: " + resultadoMultiplicacion);
    }
    
    public void MostrarDivision() {
        int resultadoDivision = Dividir(num1, num2);
        System.out.println("Resultado operación: " + resultadoDivision);
    }

    public void MostrarResta() {
        int resultadoResta = Restar(num1, num2);
        System.out.println("Resultado operación: " + resultadoResta);
    }
}
