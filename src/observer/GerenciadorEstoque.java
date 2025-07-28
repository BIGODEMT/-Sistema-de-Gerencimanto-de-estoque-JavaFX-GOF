package observer;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque {
    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (ObservadorEstoque obs : observadores) {
            obs.atualizar(mensagem);
        }
    }

    public void alterarEstoque(String operacao, int quantidade) {
        String mensagem = "Operação: " + operacao + ", Quantidade: " + quantidade;
        notificarObservadores(mensagem);
    }
}
