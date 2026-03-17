import java.util.Scanner;

public class SistemaConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            exibirCabecalho();
            exibirMenu();

            System.out.print("Escolha uma opção » ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    exibirMensagem("Abrindo: Cadastro de Clientes...");
                    break;
                case "2":
                    exibirMensagem("Abrindo: Relatórios Financeiros...");
                    break;
                case "0":
                    System.out.println("\n[!] Encerrando o sistema...");
                    executando = false;
                    break;
                default:
                    exibirMensagem("[ERRO] Opção inválida! Tente novamente.");
            }

            if (executando) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    // --- MÉTODOS DE LAYOUT ---

    private static void exibirCabecalho() {
        // Limpa o console (funciona melhor em terminais reais)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("=======================================");
        System.out.println("       SISTEMA OPERACIONAL JAVA        ");
        System.out.println("          Versão 1.0 - 2026            ");
        System.out.println("=======================================");
    }

    private static void exibirMenu() {
        System.out.println("\n  (1) Novo Cadastro");
        System.out.println("  (2) Consultar Banco de Dados");
        System.out.println("  (3) Configurações");
        System.out.println("  (0) Sair");
        System.out.println("\n---------------------------------------");
    }

    private static void exibirMensagem(String msg) {

        System.out.println("\n>>> " + msg);
    }
}