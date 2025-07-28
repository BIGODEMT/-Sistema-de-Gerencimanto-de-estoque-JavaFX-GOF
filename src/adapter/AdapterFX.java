package adapter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdapterFX extends Application {
    @Override
    public void start(Stage palco) {
        ApiLegadaRastreamento apiLegada = new ApiLegadaRastreamento();
        SistemaRastreamento adaptador = new AdaptadorRastreamento(apiLegada);

        TextField txtPacote = new TextField();
        txtPacote.setPromptText("Digite o ID do pacote");

        Button btnRastrear = new Button("Rastrear Pacote");
        btnRastrear.setOnAction(e -> {
            String idPacote = txtPacote.getText();
            adaptador.rastrearPacote(idPacote);
        });

        VBox layout = new VBox(10, txtPacote, btnRastrear);
        Scene cena = new Scene(layout, 300, 150);

        palco.setTitle("Sistema de Rastreamento - Adapter");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
