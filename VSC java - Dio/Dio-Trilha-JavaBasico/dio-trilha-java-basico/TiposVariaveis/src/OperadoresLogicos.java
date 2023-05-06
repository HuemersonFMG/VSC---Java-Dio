public class OperadoresLogicos {
    public static void main(String[] args) {
        /* && = E -> || = OU */
        Boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.print("As duas condições são verdadeiras");
        }

        System.out.print(" / ");

        if (condicao1 || condicao2) {
            System.out.print("Uma das condições é verdadeiras");
        }
    }
}
