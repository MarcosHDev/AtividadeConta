
import java.nio.charset.StandardCharsets;

class Pricipal {

    String titular;
    int conta;
    String agencia;

    double saldo;

    String creationDate;

    public Pricipal(String titular, int conta, String agencia, double saldo, String creationDate) {
        this.titular = titular;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.creationDate = creationDate;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public void deposito(double depositar){
        if(depositar > 0) {
            saldo = saldo + depositar;
            System.out.println("Deposito efetuado com sucesso!");
            System.out.print(fixUtf8(String.format("\nSeu saldo é de: %1$s ", saldo)));
            return;
        }
        System.out.print(fixUtf8("\nVocê não pode depositar valores negativos."));
    }

    public void redimentoMensal(){
        if(saldo > 0){
            double calc = (1.0024  * saldo);

            saldo = calc;
            System.out.println(fixUtf8("\nO rendimento desse mês foi 0.24%, saldo atual: " + saldo));
            return;
        }
        System.out.print(fixUtf8("\nVocê não tem saldo pra calcular o rendimento."));
    }

    public void sacar(double retirada){
        if(retirada > saldo){
            System.out.print(fixUtf8("\nNão há saldo suficiente na conta."));
            return;
        }
        if(retirada > 0) {
            saldo = saldo - retirada;

            System.out.println("\nSaque efetuado com sucesso!");
            System.out.print(fixUtf8(String.format("\nSeu saldo atual é de: %1$s ", saldo)));
            return;
        }

        System.out.print(fixUtf8("\nSua conta não foi movimentada."));
    }

    private static String fixUtf8(String message) {
        return new String(message.getBytes(StandardCharsets.UTF_8));
    }

}
