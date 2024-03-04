public class Caminhao extends Veiculo implements InterfaceTransporte{

    public Caminhao(String modelo, Integer ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando caminhao");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando caminhao");
    }
}
