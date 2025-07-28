package observer;

public class EquipeMotoristas implements ObservadorEstoque {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Equipe Motoristas: " + mensagem);
    }
}
