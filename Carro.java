public abstract class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas) {
        super(marca, tipo, cambio, placa, valorFixo);
        this.qtdPortas = qtdPortas;
    }

    public abstract double precoAluguel();

    public int getQtdPortas() {
        return qtdPortas;
    }

    @Override
    public String toString() {
        return super.toString() + " \nQuantidade de Portas: " + getQtdPortas();
    }
}
