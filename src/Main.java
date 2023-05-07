import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String menu = """
                                
                **Digite sua opção**
                1- Consultar saldo
                2- Realizar tranferência
                3- Realizar depósito
                4- Encerrar
                """;
        int option = 0;
        Scanner account = new Scanner(System.in);
        Scanner typeOption = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = account.nextLine();
        System.out.println("Qual seu tipo de conta?");
        String accType = account.nextLine();
        double credit = 2500;
        System.out.println("******************************");
        System.out.println("Nome: " + name);
        System.out.println("Tipo de Conta: " + accType);
        System.out.println("Saldo Inicial: " + credit);
        System.out.println("******************************");

            while (option != 4) {
                System.out.println(menu);
                option = typeOption.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Seu saldo é: " + credit);
                        break;
                    case 2:
                        Scanner transfer = new Scanner(System.in);
                        System.out.println("Quanto você quer tranferir?");
                        double totalTransfer = transfer.nextDouble();
                        if (totalTransfer > credit) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            credit -= totalTransfer;
                            System.out.println("Saldo atual: " + credit);
                        }
                        break;
                    case 3:
                        Scanner deposit = new Scanner(System.in);
                        System.out.println("Quanto você depositará?");
                        double totalDeposit = deposit.nextDouble();
                        credit += totalDeposit;
                        System.out.println("Saldo atual: " + credit);
                        break;

                }
                if (option > 4) {
                    System.out.println("Opção inválida.");
                }
                if (option == 4) {
                    System.out.println("Operação encerrada.");
                }
            }
        }
    }