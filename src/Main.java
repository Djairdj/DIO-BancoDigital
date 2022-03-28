import Modelos.*;

public class Main {
    public static void main(String[] args) {
        Cliente djair = new Cliente();
        djair.setNome("Djair");
        Cliente julyh = new Cliente();
        julyh.setNome("Julyh");
        Conta cCorrente = new ContaCorrente(djair);
        cCorrente.depositar(100);

        Conta cPoupanca = new ContaPoupanca(julyh);
        cPoupanca.depositar(50);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();

        cCorrente.transferir(25, cPoupanca);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();

        Banco b1 = new Banco();
        b1.setNome("Modelos.Banco de Todos");
        System.out.println(b1.getContas());
        var contas = b1.getContas();
        contas.add(cCorrente);
        b1.setContas(contas);
        System.out.println(b1.getContas());
    }
}