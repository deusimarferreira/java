package features.pojo;


import java.util.Objects;

public class Autor {
    private Long id;
    private String nome;

    public Autor(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Autor)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }

        Autor autor = (Autor) object;
        return getId().equals(autor.getId()) &&
                getNome().equals(autor.getNome());
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getNome());
    }

    @Override
    public String toString() {
        return String.format("""
                        Autor{
                            id:
                            nome:
                        }""",
                id,
                nome);
    }
}