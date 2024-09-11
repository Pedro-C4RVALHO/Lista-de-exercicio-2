package listas.lista01.retangulo;

public class RetanguloTest {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
