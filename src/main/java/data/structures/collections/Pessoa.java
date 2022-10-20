package data.structures.collections;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private Pessoa(Builder builder) {
        setNome(builder.nome);
        setIdade(builder.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }

    public static final class Builder {
        private String nome;
        private int idade;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder nome(String val) {
            nome = val;
            return this;
        }

        public Builder idade(int val) {
            idade = val;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
