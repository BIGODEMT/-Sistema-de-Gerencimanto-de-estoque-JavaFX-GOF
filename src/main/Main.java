package main;

import singleton.EstoqueTransporte;
import adapter.ApiLegadaRastreamento;
import adapter.AdaptadorRastreamento;
import observer.GerenciadorEstoque;
import observer.EquipeLogistica;
import observer.EquipeMotoristas;

public class Main {
    public static void main(String[] args) {
        // Padrão Singleton: Gerenciamento de Estoque
        EstoqueTransporte estoque = EstoqueTransporte.getInstancia();
        System.out.println("Estoque inicial: " + estoque.getTotalPacotes() + " pacotes");
        estoque.adicionarPacotes(50);
        System.out.println("Estoque após adição: " + estoque.getTotalPacotes() + " pacotes");

        // Padrão Adapter: Rastreamento de Pacotes
        ApiLegadaRastreamento apiLegada = new ApiLegadaRastreamento();
        AdaptadorRastreamento adaptador = new AdaptadorRastreamento(apiLegada);
        System.out.println("\n=== Rastreamento ===");
        adaptador.rastrearPacote("12345");
        adaptador.rastrearPacote("67890");

        // Padrão Observer: Notificações de Estoque
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        gerenciador.adicionarObservador(new EquipeLogistica());
        gerenciador.adicionarObservador(new EquipeMotoristas());

        System.out.println("\n=== Notificações ===");
        gerenciador.alterarEstoque("Adição", 20);
        gerenciador.alterarEstoque("Remoção", 10);

        // Conclusão
        System.out.println("\nEstoque final: " + estoque.getTotalPacotes() + " pacotes");
    }
}
