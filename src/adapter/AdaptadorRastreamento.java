package adapter;

public class AdaptadorRastreamento implements SistemaRastreamento {
    private ApiLegadaRastreamento apiLegada;

    public AdaptadorRastreamento(ApiLegadaRastreamento apiLegada) {
        this.apiLegada = apiLegada;
    }

    @Override
    public void rastrearPacote(String idPacote) {
        apiLegada.localizar(idPacote);
    }
}
