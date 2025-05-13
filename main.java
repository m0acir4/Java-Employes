import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Salário: R$ ");
        double salario = sc.nextDouble();

        Entities funcionario = new Entities(nome, idade, cargo, salario);

        System.out.println("\nCadastro do Funcionário:");
        System.out.println(funcionario);
        
        sc.close();
    }
}
