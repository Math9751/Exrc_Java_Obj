import java.time.LocalDate;
import java.util.Objects;

public class RG {
    private String nome;
    private LocalDate nascimento;

    // Construtor padrão
    public RG() {
    }

    // Construtor com parâmetros
    public RG(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    // Método toString
    @Override
    public String toString() {
        return "RG{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RG rg = (RG) o;
        return Objects.equals(nome, rg.nome) && Objects.equals(nascimento, rg.nascimento);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nome, nascimento);
    }
}
