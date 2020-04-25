package features.pojo;

import java.util.Objects;

public class Editora {
    private Long id;
    private String nome;
    private String endereco;

    public Editora(Long id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Editora)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }

        Editora editora = (Editora) object;
        return getId().equals(editora.getId()) &&
                getNome().equals(editora.getNome()) &&
                getEndereco().equals(editora.getEndereco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getNome(), getEndereco());
    }

    @Override
    public String toString() {
        return "Editora{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}