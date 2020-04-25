package features.records;

import java.util.Set;

public record Livro(String titulo, String isbn, String genero, Editora editora, Set<Autor>autores) {
}