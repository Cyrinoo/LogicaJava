public class CriarConta {
    public static void main (String[] args){
        Conta primeiraConta = new Conta ();

        primeiraConta.agencia=10;
        System.out.println("Número da agência: "+ primeiraConta.agencia);

        primeiraConta.numero=1010;
        System.out.println("Número da conta: "+ primeiraConta.numero);

        primeiraConta.titular= "Pedro Cyrino";
        System.out.println("Titular:  "+ primeiraConta.titular);

        System.out.println("");

        primeiraConta.saldo= 1000;
        System.out.println("O saldo da sua conta é: "+ primeiraConta.saldo);

        primeiraConta.saldo+=500;

        System.out.println("O valor atualizado da sua conta é: " + primeiraConta.saldo);
 
    }
}