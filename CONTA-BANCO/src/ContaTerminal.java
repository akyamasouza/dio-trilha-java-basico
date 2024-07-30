import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A classe {@code ContaTerminal} é um programa que solicita informações ao usuário,
 * como número da conta, código da agência, nome do cliente e saldo, e então exibe uma
 * mensagem de confirmação com os dados fornecidos.
 * 
 * <p>O programa usa a classe {@link Scanner} para ler entradas do usuário e trata
 * exceções relacionadas a entradas inválidas para garantir uma execução mais robusta.</p>
 * 
 * @author Akyama de Souza Vieira
 * @version 1.0
 * @since 2024-07-30
 */
public class ContaTerminal {

    /**
     * O ponto de entrada principal para o programa. Solicita informações do usuário,
     * processa as entradas e exibe uma mensagem com os dados fornecidos.
     *
     * <p>O método usa um bloco {@code try-catch-finally} para garantir que o recurso
     * {@link Scanner} seja fechado corretamente e para tratar exceções relacionadas a
     * entradas inválidas.</p>
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o número da Conta:");
            int numeroAgencia = scanner.nextInt();

            System.out.println("Por favor, digite o código da Agência:");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o nome do Cliente:");
            scanner.nextLine(); // Consumir a nova linha
            String cliente = scanner.nextLine();

            System.out.println("Por favor, digite o Saldo:");
            double saldo = scanner.nextDouble();

            String mensagem = "Olá ".concat(cliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ").concat(Integer.toString(numeroAgencia))
                .concat(" e seu saldo R$").concat(Double.toString(saldo))
                .concat(" já está disponível para saque!");

            System.out.println(mensagem);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir os tipos de dados corretos.");
        } finally {
            if (scanner != null) {
                scanner.close(); // Garante que o Scanner seja fechado
            }
        }
    }
}