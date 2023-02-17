/**
 * Classe que representa o conjunto comum de características
 * (atributos), e métodos que dispõem Moto que herdam da Classe
 * Veiculo.
 * 
 * @author: Rafael Santos
 * @version: versao 1.0
 */

public class Moto extends Veiculo {
    private String estilo;

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
     * @param estilo    - String Contendo o Valor Referente a Quantidade de
     *                  Portas do Carro
     */
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
