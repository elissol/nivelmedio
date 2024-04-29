package exercicio1;



class Retangulo extends Poligono {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return comprimento * largura;
    }
}

