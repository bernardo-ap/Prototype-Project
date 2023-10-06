public class Livro implements Cloneable{

    private int qntdPaginas;
    private String autor;
    private String nome;
    private String sumario;
    private Editora editora;

    public Livro(int qntdPaginas, String autor, String nome, String sumario, Editora editora){
        this.qntdPaginas = qntdPaginas;
        this.autor = autor;
        this.nome = nome;
        this.sumario = sumario;
        this.editora = editora;
    }

    public int getQntdPaginas() {
        return qntdPaginas;
    }

    public Livro setQntdPaginas(int qntdPaginas) {
        this.qntdPaginas = qntdPaginas;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Livro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSumario() {
        return sumario;
    }

    public Livro setSumario(String sumario) {
        this.sumario = sumario;
        return this;
    }

    public Editora getEditora() {
        return editora;
    }

    public Livro setEditora(Editora editora) {
        this.editora = editora;
        return this;
    }

    @Override
    public Livro clone() throws CloneNotSupportedException{
        Livro livroClone = (Livro) super.clone();
        livroClone.editora = (Editora) livroClone.editora.clone();
        return livroClone;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Paginas=" + qntdPaginas +
                ", nome='" + nome + '\'' +
                ", autor='" + autor +'\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
