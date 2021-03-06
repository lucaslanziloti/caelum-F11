/**
 * @author lucas
 */
class Cliente {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudaCPF(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }

        this.cpf = cpf;
    }

}
