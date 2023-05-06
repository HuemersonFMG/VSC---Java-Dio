public class Conta {
    // variavel da classe conta
    double saldo = 10.0;

    public void sacar(double valor) {
        // variavel local do metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirsaldo() {
        // Disponível em toda a classe
        System.out.println(saldo);
        // somente o metodo sacar conhece esta variável
        //System.out.println(novoSaldo);

    }

    public double calcularDividaExponencial(){
        //variavel local de metodo
        double valorParcela = 50.00;
        double valorMontante = 0.00;
        
        for (int x = 1; x <= 5; x++) {
            //esta variável será executada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis fora deste bloco.
        return valorMontante;
    }
}
