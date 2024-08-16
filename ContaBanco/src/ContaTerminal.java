import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //Exibir as mensagem para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        
        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite a sua Agência!");
        String agencia = sc.nextLine();
    
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da sua conta!");
        Double saldo = sc.nextDouble();

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
