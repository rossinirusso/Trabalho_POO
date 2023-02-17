/**
 * Classe que representa o conjunto comum de características
 * (atributos), e métodos que dispõem os tipos Eletrico (Carro Eletrico)
 * que herdam da Classe Carro, e que por sua vez, também herdam da Classe
 * Veiculo.
 * 
 * @author: Rafael Santos
 * @version: versao 1.0
 */

public class Eletrico extends Carro {
    private double capacidadeBateria;

    /**
     * Construtor da Classe Eletrico.
     * 
     * @param marca             - String Contendo a Marca do Eletrico (Carro
     *                          Eletrico)
     * @param tipo              - String Contendo o Tipo do Eletrico (Carro
     *                          Eletrico)
     * @param cambio            - String Contendo o Tipo do Câmbio
     *                          (Manual/Automático) do Eletrico (Carro Eletrico)
     * @param placa             - String Contendo a Placa do Eletrico (Carro
     *                          Eletrico)
     * @param valorFixo         - double Contendo o Valor Fixo do Aluguel do
     *                          Eletrico (Carro Eletrico)
     * @param qtdPortas         - Inteiro Contendo o Valor Referente a Quantidade de
     *                          Portas do Eletrico (Carro Eletrico)
     * @param capacidadeBateria - double Contendo o Valor Referente ao Tamanho do
     *                          Tanque do Eletrico (Carro Eletrico)
     */
    public Eletrico(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas,
            double capacidadeBateria) {
        super(marca, tipo, cambio, placa, valorFixo, qtdPortas);
        this.capacidadeBateria = capacidadeBateria;
    }

    /**
     * Método para Retornar o Preço do Aluguel do Eletrico (Carro Eletrico).
     * 
     * @return double - Preço do Aluguel do Eletrico (Carro Eletrico).
     */
    @Override
    public double precoAluguel() {
        return capacidadeBateria * 0.84;
    }

    /**
     * Método para Retornar o Tamanho do Tanque do Eletrico (Carro Eletrico).
     * 
     * @return double - double Contendo o Valor Referente ao Tamanho do Tanque do
     *         Eletrico (Carro Eletrico).
     */
    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    /**
     * Método para Retornar Todas as Características (Atributos) do Eletrico (Carro
     * Eletrico).
     * 
     * @return String - Características (Atributos) do Eletrico (Carro Eletrico).
     */
    @Override
    public String toString() {
        return super.toString() + " \nCapacidade da Bateria: " + getCapacidadeBateria();
    }
}
