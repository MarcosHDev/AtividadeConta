public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta("Marcos" , 001, "Bla", 30.0, "Hoje");

        conta.deposito(100.50);

        conta.sacar(20.40);

        conta.redimentoMensal();
    }
}
