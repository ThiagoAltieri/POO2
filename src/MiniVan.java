public class MiniVan extends Veiculo implements InterfaceTransporte{

    public MiniVan(String modelo, Integer ano) {
        super(modelo, ano);
    }
    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando mini van");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando mini van");
    }
}
