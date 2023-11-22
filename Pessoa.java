import java.util.Objects;

public class Pessoa {
    private String email;
    private RG identidade;
    private Telefone telefone;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(String email, RG identidade, Telefone telefone) {
        this.email = email;
        this.identidade = identidade;
        this.telefone = telefone;
    }

    // Métodos de acesso (getters e setters)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RG getIdentidade() {
        return identidade;
    }

    public void setIdentidade(RG identidade) {
        this.identidade = identidade;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pessoa{" +
                "email='" + email + '\'' +
                ", identidade=" + identidade +
                ", telefone=" + telefone +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(email, pessoa.email) &&
                Objects.equals(identidade, pessoa.identidade) &&
                Objects.equals(telefone, pessoa.telefone);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(email, identidade, telefone);
    }
}
