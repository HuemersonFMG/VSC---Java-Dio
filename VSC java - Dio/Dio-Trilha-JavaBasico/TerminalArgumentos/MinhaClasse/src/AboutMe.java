import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura [Em metros]:");
        double altura = scanner.nextDouble();

        System.out.println(" ");

        System.out.println("------------------------------------------");

        System.out.println(" ");

        // Imprimindo os dados obtidos do Usuário
        System.out.println("Olá, meu nome é " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos de idade.");
        System.out.println("Minha altura é " + altura + " metros.");

        // Fechando o objeto Scanner
        scanner.close();
    }
}