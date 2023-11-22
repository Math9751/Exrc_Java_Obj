import java.util.Objects;

public class Telefone {
    private String area;
    private String numero;

    // Construtor padrão
    public Telefone() {
    }

    // Construtor com parâmetros
    public Telefone(String area, String numero) {
        this.area = area;
        this.numero = numero;
    }

    // Métodos de acesso (getters e setters)
    public String getarea() {
        return area;
    }

    public void setarea(String area) {
        this.area = area;
    }

    public String getnumero() {
        return numero;
    }

    public void setnumero(String numero) {
        this.numero = numero;
    }

    // Método toString
    @Override
    public String toString() {
        return "Telefone{" +
                "area='" + area + '\'' +
                ", numero=" + numero +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone Telefone = (Telefone) o;
        return Objects.equals(area, Telefone.area) && Objects.equals(numero, Telefone.numero);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(area, numero);
    }
}
