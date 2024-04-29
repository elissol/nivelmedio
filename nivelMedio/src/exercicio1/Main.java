package exercicio1;


public class Main {
    public static void main(String[] args) {
        // Criando objetos e testando o método area()
        Retangulo retangulo = new Retangulo(5, 10);
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(4, 6);

        System.out.println("Área do Retângulo: " + retangulo.area());
        System.out.println("Área do Círculo: " + circulo.area());
        System.out.println("Área do Triângulo: " + triangulo.area());
    }
}
