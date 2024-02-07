import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = terminal.nextInt();

        System.out.println("Digite da agência: ");
        String numeroAgencia = terminal.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = terminal.next();

        System.out.println("Digite seu saldo: ");
        double saldo;
        
        while (true) {
            try {
                saldo = Double.parseDouble(terminal.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor válido para o saldo.");
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo é " + saldo + ", já está disponível.");
    }
}
