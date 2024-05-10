
public class Rectangulo {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Métodos para obtener y establecer el largo
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    // Métodos para obtener y establecer el ancho
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    // Método para devolver todos los atributos en una cadena de texto
    public String toString() {
        return "Rectangulo { largo = " + largo + ", ancho = " + ancho + " }";
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return largo * ancho;
        
        
        
    }
}
