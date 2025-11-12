public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;
    
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        if(numeroConta.equals(null) || numeroConta.equals("")){
            System.out.println("Número da conta inválido. ");
        }
        this.numeroConta = numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        if(titular.equals("") || titular.equals(null)){
            System.out.println("Número da conta inválido. ");
        }
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDepositado){
        if(valorDepositado > 0){
            saldo += valorDepositado;
        }else{
            System.out.println("Valor depositado precisa ser maior que 0");
        }
    }
   
    public void sacar(double valorSacar){
        if(valorSacar>0 && valorSacar<=saldo){
            saldo -= valorSacar;
            System.out.println("Operação realizada com sucesso.");
        }else{
            System.out.println("Operação invalida.");
            if(valorSacar<=0){
                System.out.println("Valor de saque invalido.");
            }else if(valorSacar>saldo){
                System.out.println("Saldo insuficiente.");
            }
        }
   }
}
