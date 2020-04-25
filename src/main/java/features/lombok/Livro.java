package features.lombok;

import features.pojo.Autor;
import features.pojo.Editora;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
public class Livro {
    private Long id;
    private String titulo;
    private String isbn;
    private String genero;
    private Editora editora;
    private Set<Autor> autores = new HashSet<>();

}