public class Combustao extends Carro {
    private double tamanhoTanque;

    public Combustao(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas,
            double tamanhoTanque) {
        super(marca, tipo, cambio, placa, valorFixo, qtdPortas);
        this.tamanhoTanque = tamanhoTanque;
    }

    @Override
    public double precoAluguel() {
        return tamanhoTanque * 5.0;
    }

    public double getTamanhoTanque() {
        return tamanhoTanque;
    }

    @Override
    public String toString() {
        return super.toString() + " \nTamanho do Tanque: " + getTamanhoTanque();
    }
}
