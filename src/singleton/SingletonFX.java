package singleton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SingletonFX extends Application {
    @Override
    public void start(Stage palco) {
        EstoqueTransporte estoque = EstoqueTransporte.getInstancia();

        Label lblEstoque = new Label("Estoque atual: " + estoque.getTotalPacotes() + " pacotes");

        Button btnAdicionar = new Button("Adicionar 10 Pacotes");
        btnAdicionar.setOnAction(e -> {
            estoque.adicionarPacotes(10);
            lblEstoque.setText("Estoque atual: " + estoque.getTotalPacotes() + " pacotes");
        });

        Button btnRemover = new Button("Remover 20 Pacotes");
        btnRemover.setOnAction(e -> {
            estoque.removerPacotes(20);
            lblEstoque.setText("Estoque atual: " + estoque.getTotalPacotes() + " pacotes");
        });

        VBox layout = new VBox(10, lblEstoque, btnAdicionar, btnRemover);
        Scene cena = new Scene(layout, 300, 200);

        palco.setTitle("Gerenciamento de Estoque - Singleton");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
