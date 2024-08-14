import java.util.Scanner;

public class ContaTerminal {
    
    // numero da conta
    int Numero;
    // saldo da conta
    double Saldo;
    // nome do titular da conta
    String NomeTitular;
    // agencia da conta
    String Agencia;

    // construtor da classe
    public ContaTerminal(int numero, double saldo, String nomeTitular, String agencia) {
        Numero = numero;
        Saldo = saldo;
        NomeTitular = nomeTitular;
        Agencia = agencia;
    }

    // construtor da classe
    public ContaTerminal() {
        Numero = -1;
        Saldo = 0;
        NomeTitular = "";
        Agencia = "";
    }

    // metodo para inserir os dados
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a agencia da conta: ");
        Agencia = scanner.next();
        System.out.println("Digite o numero da conta: ");
        Numero = scanner.nextInt();
        System.out.println("Digite o nome do titular da conta: ");
        NomeTitular = scanner.next();
        System.out.println("Digite o saldo da conta: ");
        Saldo = scanner.nextDouble();
        scanner.close();
    }
    
    
    // imprime os dados da conta
    void imprime() {
        System.out.println("Olá " + NomeTitular + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + 
        " já está disponível para saque");
    }


}
