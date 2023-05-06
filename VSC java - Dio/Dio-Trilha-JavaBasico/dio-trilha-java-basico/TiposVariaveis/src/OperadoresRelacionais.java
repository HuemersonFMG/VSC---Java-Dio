public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        String nomeUm = "Huemerson";
        String nomeDois = "Huemerson";

        System.out.print(" / ");

        System.out.print("nomeUm é igual a nomeDois? ");
        System.out.print(nomeUm.equals(nomeDois));

        System.out.print(" / ");

        boolean simNao = numero1 == numero2;
        System.out.print("numero1 é igual a numero2? " + simNao);

        System.out.print(" / ");

        simNao = numero1 != numero2;
        System.out.print("numero1 é diferente a numero2? " + simNao);

        System.out.print(" / ");

        simNao = numero1 > numero2;
        System.out.print("numero1 é maior que a numero2? " + simNao);
    }
}
