package blococarnaval;
import java.util.ArrayList;
import java.util.List;

public class CadastroBlocos {
    private List<BlocoCarnaval> blocos;

    public CadastroBlocos() {
        this.blocos = new ArrayList<>();
    }

    public void adicionarBloco(BlocoCarnaval bloco) {
        blocos.add(bloco);
    }

    public void listarBlocos() {
        if (blocos.isEmpty()) {
            System.out.println("Nenhum bloco cadastrado.");
        } else {
            for (BlocoCarnaval bloco : blocos) {
                bloco.exibirInformacoes();
            }
        }
    }
}
