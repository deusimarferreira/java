package features.records;

import java.util.Set;

public record Livro(Long id, String titulo, String isbn, String genero, Editora editora, Set<Autor>autores) {
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