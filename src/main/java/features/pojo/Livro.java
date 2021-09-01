package features.pojo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Livro {
    private Long id;
    private String titulo;
    private String isbn;
    private String genero;
    private Editora editora;
    private Set<Autor> autores = new HashSet<>();

    public Livro(Long id, String titulo, String isbn, String genero, Editora editora, Set<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.genero = genero;
        this.editora = editora;
        this.autores = autores;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenero() {
        return genero;
    }

    public Editora getEditora() {
        return editora;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Livro)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }

        Livro livro = (Livro) object;
        return getId().equals(livro.getId()) &&
                getTitulo().equals(livro.getTitulo()) &&
                getIsbn().equals(livro.getIsbn()) &&
                getGenero().equals(livro.getGenero()) &&
                getEditora().equals(livro.getEditora()) &&
                getAutores().equals(livro.getAutores());
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(
                        super.hashCode(),
                        getId(), getTitulo(),
                        getIsbn(),
                        getGenero(),
                        getEditora(),
                        getAutores()
                );
    }

    @Override
    public String toString() {
        return String.format("""
                        Livro{
                            id: %s,
                            titulo: %s,
                            isbn: %s,
                            genero: %s,
                            editora: %s,
                            autores: %s,
                        }""",
                id,
                titulo,
                isbn,
                genero,
                editora,
                autores);
    }
}