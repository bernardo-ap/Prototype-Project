public class Editora implements Cloneable{

    private String nomeEmpresa;
    private String nomeCeo;
    private int qntdFuncionarios;

    public Editora(String nomeEmpresa, String nomeCeo, int qntdFuncionarios){
        this.nomeEmpresa = nomeEmpresa;
        this.nomeCeo = nomeCeo;
        this.qntdFuncionarios = qntdFuncionarios;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public Editora setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        return this;
    }

    public String getNomeCeo() {
        return nomeCeo;
    }

    public Editora setNomeCeo(String nomeCeo) {
        this.nomeCeo = nomeCeo;
        return this;
    }

    public int getQntdFuncionarios() {
        return qntdFuncionarios;
    }

    public Editora setQntdFuncionarios(int qntdFuncionarios) {
        this.qntdFuncionarios = qntdFuncionarios;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Editora{" +
                "Nome Empresa='" + nomeEmpresa + '\'' +
                ", Nome Ceo='" + nomeCeo + '\'' +
                '}';
    }
}
