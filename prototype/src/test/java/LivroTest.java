import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Livro livro = new Livro(123, "Autor Original", "Nome Original", "Sumario Original", new Editora("Nome Empresa Original", "NomeCeo Original", 10));

        Livro livroClone = livro.clone();
        livroClone.setQntdPaginas(1234);
        livroClone.setNome("Nome Clonado");
        livroClone.setAutor("Autor Clonado");
        livroClone.getEditora().setNomeEmpresa("Nome Empresa Clonado");

        assertEquals("Livro{Paginas=123, nome='Nome Original', autor='Autor Original', editora='Editora{Nome Empresa='Nome Empresa Original', Nome Ceo='NomeCeo Original'}'}", livro.toString());
        assertEquals("Livro{Paginas=1234, nome='Nome Clonado', autor='Autor Clonado', editora='Editora{Nome Empresa='Nome Empresa Clonado', Nome Ceo='NomeCeo Original'}'}", livroClone.toString());
    }
}