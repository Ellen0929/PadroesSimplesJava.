import singleton.MinhaInstancia;
import strategy.*;
import facade.FacadeSimples;

public class Main {
    public static void main(String[] args) {

        // Testando Singleton
        MinhaInstancia unica = MinhaInstancia.getInstancia();
        unica.dizerOla();

        // Testando Strategy
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoNormal());
        robo.mover();

        // Testando Facade
        FacadeSimples facade = new FacadeSimples();
        facade.processarPedido("João");
    }
}
