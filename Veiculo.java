/**
 * Classe abstrada que representa o conjunto comum de características
 * (atributos), e métodos que dispõem os tipos de veículos que herdam desta.
 * 
 * @author: Rafael Santos
 * @version: versao 1.0
 */

public abstract class Veiculo {
    private String marca;
    private String tipo;
    private String cambio;
    private String placa;
    private double valorFixo;

    /**
     * Construtor da Classe Veiculo.
     * 
     * @param marca     - String Contendo a Marca do Veículo.
     * @param tipo      - String Contendo o Tipo do Veículo (Motoclicleta, Carro
     *                  Sedam, Carro Hatch, etc.).
     * @param cambio    - String Contendo a Tipo do Câmbio (Manual/Automático) do
     *                  Veículo.
     * @param placa     - String Contendo a Placa do Veículo.
     * @param valorFixo - double Contendo o Valor Fixo do Aluguel do Veículo.
     */
    public Veiculo(String marca, String tipo, String cambio, String placa, double valorFixo) {
        this.marca = marca;
        this.tipo = tipo;
        this.cambio = cambio;
        this.placa = placa;
        this.valorFixo = valorFixo;
    }

    /**
     * Método Abstrato para Retornar o Preço do Aluguel do Veiculo Específico.
     * 
     */
    public abstract double precoAluguel();

    /**
     * Método para Retornar a Marca do Veiculo Específico.
     * 
     * @return String - Marca do Veiculo Específico.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para Retornar o Tipo do Veículo (Motoclicleta, Carro Sedam, Carro
     * Hatch, etc.).
     * 
     * @return String - Tipo do Veiculo Específico.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método para Retornar o Tipo do Câmbio do Veiculo Específico.
     * 
     * @return String - Tipo do Câmbio do Veiculo Específico.
     */
    public String getCambio() {
        return cambio;
    }

    /**
     * Método para Retornar a Placa do Veiculo Específico.
     * 
     * @return String - Placa do Veiculo Específico.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método para Retornar o Valor Fixo do Aluguel do Veiculo Específico.
     * 
     * @return double - Valor Fixo do Aluguel do Veiculo Específico.
     */
    public double GetvalorFixo() {
        return valorFixo;
    }

    /**
     * Método para Retornar Todas as Características (Atributos) do Veiculo
     * Específico.
     * 
     * @return String - Características (Atributos) do Veiculo Específico.
     */
    public String toString() {
        return "Marca: " + getMarca() + " \nTipo: " + getTipo() + " \nCambio: " + getCambio() + "\nPlaca: "
                + getPlaca();
    }
}
