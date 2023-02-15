
/**
 * Classe abstrada que representa o conjunto comum de características
 * (atributos),
 * e métodos que dispôem os tipos de veículos que herdam desta.
 */

public abstract class Veiculo {
    private String marca;
    private String tipo;
    private String cambio;
    private String placa;
    private double valorFixo;

    public Veiculo(String marca, String tipo, String cambio, String placa, double valorFixo) {
        this.marca = marca;
        this.tipo = tipo;
        this.cambio = cambio;
        this.placa = placa;
        this.valorFixo = valorFixo;
    }

    public abstract double precoAluguel();

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCambio() {
        return cambio;
    }

    public String getPlaca() {
        return placa;
    }

    public double GetvalorFixo() {
        return valorFixo;
    }

    public String toString() {
        return "Marca: " + getMarca() + " \nTipo: " + getTipo() + " \nCambio: " + getCambio() + "\nPlaca: "
                + getPlaca();
    }
}
