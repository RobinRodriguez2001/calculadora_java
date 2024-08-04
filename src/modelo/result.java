package modelo;

/**
 * Clase que almacena dos números como cadenas de texto.
 */
public class result {
    private String num1;
    private String num2;

    // Constructor sin parámetros
    public result() {}

    // Constructor con parámetros
    public result(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters y Setters
    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
    
    // Método que se puede sobrescribir en subclases
    protected void agregar() {}
}