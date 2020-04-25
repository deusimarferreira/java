package features.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Editora {
    private Long id;
    private String nome;
    private String endereco;
}