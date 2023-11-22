import java.util.Objects;

public class Aluno extends Pessoa {
    private String prontuario;

    // Construtor padrão
    public Aluno() {
        super(); // Chama o construtor da classe pai (Pessoa)
    }

    // Construtor com parâmetros
    public Aluno(String email, RG identidade, Telefone telefone, String prontuario) {
        super(email, identidade, telefone); // Chama o construtor da classe pai (Pessoa)
        this.prontuario = prontuario;
    }

    // Métodos de acesso (getters e setters)
    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Aluno{" +
                "prontuario='" + prontuario + '\'' +
                ", " + super.toString() +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(prontuario, aluno.prontuario) && super.equals(o);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(prontuario, super.hashCode());
    }
}
