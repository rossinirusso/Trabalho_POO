public class Gas extends Carro {
    private int qtdeCilinidros;
    private double capacidadeCilinidro;

    public Gas(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas,
            int qtdeCilinidros,
            double capacidadeCilinidro) {
        super(marca, tipo, cambio, placa, valorFixo, qtdPortas);
        this.qtdeCilinidros = qtdeCilinidros;
        this.capacidadeCilinidro = capacidadeCilinidro;
    }

    @Override
    public double precoAluguel() {
        return qtdeCilinidros * (capacidadeCilinidro * 4.0);
    }

    public int getQtdeCilindros() {
        return qtdeCilinidros;
    }

    public double getcapacidadeCilinidro() {
        return capacidadeCilinidro;
    }

    @Override
    public String toString() {
        return super.toString() + " \nQuantidade de Cilindros: " + getQtdeCilindros() + " \nCapacidade do Cilindro: "
                + getcapacidadeCilinidro();
    }
}
