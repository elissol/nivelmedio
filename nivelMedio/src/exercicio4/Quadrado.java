package exercicio4;

//Interface FormaGeometrica
interface FormaGeometrica {
 double calcularArea();
 double calcularPerimetro();
}

//Classe Quadrado que implementa a interface FormaGeometrica
class Quadrado implements FormaGeometrica {
 private double lado;

 public Quadrado(double lado) {
     this.lado = lado;
 }

 @Override
 public double calcularArea() {
     return lado * lado;
 }

 @Override
 public double calcularPerimetro() {
     return 4 * lado;
 }
}

