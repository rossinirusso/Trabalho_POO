public class Eletrico extends Carro {
    private double capacidadeBateria;

    public Eletrico(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas,
            double capacidadeBateria) {
        super(marca, tipo, cambio, placa, valorFixo, qtdPortas);
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double precoAluguel() {
        return capacidadeBateria * 0.84;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    @Override
    public String toString() {
        return super.toString() + " \nCapacidade da Bateria: " + getCapacidadeBateria();
    }
}
