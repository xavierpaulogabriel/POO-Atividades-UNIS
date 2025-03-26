package blococarnaval;

public class BlocoCarnaval {
    private String nome;
    private String responsavel;
    private String data;
    private String horario;
    private String local;
    private int quantidadePessoas;

    public BlocoCarnaval(String nome, String responsavel, String data, String horario, String local, int quantidadePessoas) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public void exibirInformacoes() {
        System.out.println("Bloco: " + nome);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);
        System.out.println("Local: " + local);
        System.out.println("Quantidade de Pessoas: " + quantidadePessoas);
        System.out.println("------------------------------------");
    }
}