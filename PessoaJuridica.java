public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome, 0); // Idade não é necessária para Pessoa Jurídica
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + cnpj;
    }
}
