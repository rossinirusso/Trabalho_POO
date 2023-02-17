/**
 * Classe que representa o conjunto comum de características
 * (atributos), e métodos que dispõem os tipos Combustao (Carro à Combustao)
 * que herdam da Classe Carro, e que por sua vez, também herdam da Classe
 * Veiculo.
 * 
 * @author: Rafael Santos
 * @version: versao 1.0
 */

public class Combustao extends Carro {
    private double tamanhoTanque;

    /**
     * Construtor da Classe Combustao.
     * 
     * @param marca         - String Contendo a Marca do Combustao (Carro à
     *                      Combustao).
     * @param tipo          - String Contendo o Tipo do Combustao (Carro Sedam,
     *                      Carro Hatch, etc.).
     * @param cambio        - String Contendo o Tipo do Câmbio (Manual/Automático)
     *                      do Combustao (Carro à Combustao)
     * @param placa         - String Contendo a Placa do Combustao (Carro à
     *                      Combustao).
     * @param valorFixo     - double Contendo o Valor Fixo do Aluguel do Combustao
     *                      (Carro à Combustao)
     * @param qtdPortas     - Inteiro Contendo o Valor Referente a Quantidade de
     *                      Portas do Combustao (Carro à Combustao).
     * @param tamanhoTanque - double Contendo o Valor Referente ao Tamanho do Tanque
     *                      do Combustao (Carro à Combustao).
     */
    public Combustao(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas,
            double tamanhoTanque) {
        super(marca, tipo, cambio, placa, valorFixo, qtdPortas);
        this.tamanhoTanque = tamanhoTanque;
    }

    /**
     * Método para Retornar o Preço do Aluguel do Combustao (Carro à Combustao).
     * 
     * @return double - Preço do Aluguel do Combustao (Carro à Combustao).
     */
    @Override
    public double precoAluguel() {
        return tamanhoTanque * 5.0;
    }

    /**
     * Método para Retornar o Preço do Aluguel do Combustao (Carro à Combustao).
     * 
     * @return double - double Contendo Tamanho do Tanque do Combustao (Carro à
     *         Combustao).
     */
    public double getTamanhoTanque() {
        return tamanhoTanque;
    }

    /**
     * Método para Retornar Todas as Características (Atributos) do Combustao (Carro
     * à Combustao).
     * 
     * @return String - Características (Atributos) do Combustao (Carro à
     *         Combustao).
     */
    @Override
    public String toString() {
        return super.toString() + " \ntamanho do Tanque: " + getTamanhoTanque();
    }
}
