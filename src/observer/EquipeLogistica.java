package observer;

public class EquipeLogistica implements ObservadorEstoque {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Equipe Logística: " + mensagem);
    }
}
