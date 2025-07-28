package singleton;

public class EstoqueTransporte {
    private static EstoqueTransporte instancia;
    private int totalPacotes;

    private EstoqueTransporte() {
        totalPacotes = 500; // Estoque inicial
    }

    public static EstoqueTransporte getInstancia() {
        if (instancia == null) {
            instancia = new EstoqueTransporte();
        }
        return instancia;
    }

    public int getTotalPacotes() {
        return totalPacotes;
    }

    public void adicionarPacotes(int quantidade) {
        totalPacotes += quantidade;
    }

    public void removerPacotes(int quantidade) {
        if (quantidade <= totalPacotes) {
            totalPacotes -= quantidade;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }
}
