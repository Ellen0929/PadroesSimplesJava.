package singleton;

public class MinhaInstancia {
    private static MinhaInstancia instancia = new MinhaInstancia();

    private MinhaInstancia() { }

    public static MinhaInstancia getInstancia() {
        return instancia;
    }

    public void dizerOla() {
        System.out.println("Olá, eu sou a única instância!");
    }
}

