public class Moto extends Veiculo {
    private String estilo;

    public Moto(String marca, String tipo, String cambio, String placa, double valorFixo, String estilo) {
        super(marca, tipo, cambio, placa, valorFixo);
        this.estilo = estilo;
    }

    @Override
    public double precoAluguel() {

        if (getEstilo().equals("Custom")) {
            return 30;
        }

        return 0;
    }

    public String getEstilo() {
        return estilo;
    }

    @Override
    public String toString() {
        return super.toString() + " \nEstilo: " + getEstilo();
    }
}
