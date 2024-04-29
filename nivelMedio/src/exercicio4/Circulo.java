package exercicio4;

//Classe Circulo que implementa a interface FormaGeometrica
class Circulo implements FormaGeometrica {
 private double raio;

 public Circulo(double raio) {
     this.raio = raio;
 }

 @Override
 public double calcularArea() {
     return Math.PI * raio * raio;
 }

 @Override
 public double calcularPerimetro() {
     return 2 * Math.PI * raio;
 }
}

