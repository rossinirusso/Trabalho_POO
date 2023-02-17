/**
 * Classe abstrada que representa o conjunto comum de características
 * (atributos), e métodos que dispõem os tipos de Carros que herdam desta (e
 * esta, por sua vez, que herda de Veiculo).
 * 
 * @author: Rafael Santos
 * @version: versao 1.0
 */

public abstract class Carro extends Veiculo {
    private int qtdPortas;

    /**
     * Construtor da Classe Carro.
     * 
     * @param marca     - String Contendo a Marca do Carro.
     * @param tipo      - String Contendo o Tipo do Carro (Carro Sedam, Carro Hatch,
     *                  etc.).
     * @param cambio    - String Contendo a Tipo do Câmbio (Manual/Automático) do
     *                  Carro.
     * @param placa     - String Contendo a Placa do Carro.
     * @param valorFixo - double Contendo o Valor Fixo do Aluguel do Carro.
     * @param qtdPortas - Inteiro Contendo o Valor Referente a Quantidade de
     *                  Portas do Carro
     */
    public Carro(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas) {
        super(marca, tipo, cambio, placa, valorFixo);
        this.qtdPortas = qtdPortas;
    }

    /**
     * Método Abstrato para Retornar o Preço do Aluguel do Carro Específico.
     * 
     */
    public abstract double precoAluguel();

    /**
     * Método para Retornar a Quantidade de Portas do Carro Específico.
     * 
     * @return int - Inteiro Contendo a Quantidade de Portas do Carro.
     */
    public int getQtdPortas() {
        return qtdPortas;
    }

    /**
     * Método para Retornar Todas as Características (Atributos) do Carro
     * Específico.
     * 
     * @return String - Características (Atributos) do Carro Específico.
     */
    @Override
    public String toString() {
        return super.toString() + " \nQuantidade de Portas: " + getQtdPortas();
    }
}
