import java.util.Scanner;

/**
 * A classe {@code Contador} é responsável por ler dois parâmetros do usuário,
 * validar se o segundo parâmetro é maior que o primeiro e, caso seja, imprimir
 * uma sequência de números até a diferença entre os parâmetros.
 * Caso contrário, lança uma exceção {@link ParametrosInvalidosException}.
 * <p>
 * <strong>Exemplo de Uso:</strong>
 * <pre>
 * {@code
 *  Contador.main(new String[]{});
 * }
 * </pre>
 * </p>
 * 
 * @author Akyama
 * @date 31 de julho de 2024
 */
public class Contador {

    /**
     * O método principal (main) é o ponto de entrada do programa.
     * Ele lê dois parâmetros inteiros do usuário e chama o método {@link #contar(int, int)}.
     * Se o segundo parâmetro for menor ou igual ao primeiro, lança uma exceção.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     * @throws ParametrosInvalidosException 
     */
    public static void main(String[] args) throws ParametrosInvalidosException {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     * O método {@code contar} valida se o segundo parâmetro é maior que o primeiro.
     * Se o segundo parâmetro for menor ou igual ao primeiro, lança uma exceção.
     * Caso contrário, imprime uma sequência de números de 1 até a diferença entre
     * os dois parâmetros.
     *
     * @param parametroUm   O primeiro parâmetro (deve ser menor que o segundo).
     * @param parametroDois O segundo parâmetro (deve ser maior que o primeiro).
     * @throws ParametrosInvalidosException Se {@code parametroUm} for maior que {@code parametroDois}.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            // Realizar o for para imprimir os números com base na variável contagem
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}