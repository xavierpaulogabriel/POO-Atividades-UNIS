
package blococarnaval;


public class Main {
    public static void main(String[] args) {
        CadastroBlocos cadastro = new CadastroBlocos();

        BlocoCarnaval bloco1 = new BlocoCarnaval("Bloco da Liberdade", "João Silva", "10/02/2025", "15:00", "Praça da Liberdade", 2000);
        BlocoCarnaval bloco2 = new BlocoCarnaval("Alegria de BH", "Maria Souza", "12/02/2025", "17:30", "Rua da Bahia", 3500);

        cadastro.adicionarBloco(bloco1);
        cadastro.adicionarBloco(bloco2);

        System.out.println("Lista de Blocos de Carnaval:");
        cadastro.listarBlocos();
    }
}

    

