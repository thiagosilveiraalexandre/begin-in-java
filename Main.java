import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pessoa Física
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        PessoaFisica pessoaFisica1 = new PessoaFisica(nome, cpf);

        // Pessoa Jurídica
        System.out.println("Digite o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();

        System.out.println("Digite o CNPJ da empresa: ");
        String cnpj = scanner.nextLine();

        PessoaJuridica empresa1 = new PessoaJuridica(nomeEmpresa, cnpj);

        // Funcionario (exemplo completo)
        System.out.println("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario1 = new Funcionario(nome, cargo, salario, pessoaFisica1);

        System.out.println("Pessoa Física: " + pessoaFisica1.toString());
        System.out.println("Pessoa Jurídica: " + empresa1.toString());
        System.out.println("Funcionário: " + funcionario1.toString());

        scanner.close();
    }
}

class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private PessoaFisica pessoaFisica;

    public Funcionario(String nome, String cargo, double salario, PessoaFisica pessoaFisica) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.pessoaFisica = pessoaFisica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCargo: " + cargo + "\nSalário: R$" + salario + "\nPessoa Física: " + pessoaFisica.toString();
    }
}
