package observer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ObserverFX extends Application {
    @Override
    public void start(Stage palco) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        gerenciador.adicionarObservador(new EquipeLogistica());
        gerenciador.adicionarObservador(new EquipeMotoristas());

        Button btnAdicionar = new Button("Adicionar Estoque");
        btnAdicionar.setOnAction(e -> gerenciador.alterarEstoque("Adição", 10));

        Button btnRemover = new Button("Remover Estoque");
        btnRemover.setOnAction(e -> gerenciador.alterarEstoque("Remoção", 5));

        VBox layout = new VBox(10, btnAdicionar, btnRemover);
        Scene cena = new Scene(layout, 300, 150);

        palco.setTitle("Notificações de Estoque - Observer");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
