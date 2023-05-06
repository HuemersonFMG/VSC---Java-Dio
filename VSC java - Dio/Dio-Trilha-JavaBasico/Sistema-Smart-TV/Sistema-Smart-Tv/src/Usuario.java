public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada?" + " " + smartTv.ligada);
        System.out.println("Canal atual?" + " " + smartTv.canal);
        System.out.println("Nivel volume?" + " " + smartTv.volume);
        System.out.println("aumentando o volume:" + " " + ++smartTv.volume);
    }
}