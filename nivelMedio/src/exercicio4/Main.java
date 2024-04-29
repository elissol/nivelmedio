package exercicio4;


//Classe principal para testar os métodos
public class Main {
 public static void main(String[] args) {
     // Criando objetos e testando os métodos
     Quadrado quadrado = new Quadrado(3);
     System.out.println("Área do Quadrado: " + quadrado.calcularArea());
     System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());

     Circulo circulo = new Circulo(2);
     System.out.println("Área do Círculo: " + circulo.calcularArea());
     System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

     Retangulo retangulo = new Retangulo(2, 3);
     System.out.println("Área do Retângulo: " + retangulo.calcularArea());
     System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
 }
}
