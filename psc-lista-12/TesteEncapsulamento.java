public class TesteEncapsulamento {
    public static void main(String[]args){
        ContaBancaria contaBancaria = new ContaBancaria();
        
        System.out.println("----Sistema Bancario----");
       
        contaBancaria.setNumeroConta("002134121921");
        contaBancaria.setTitular("Alex Vitor");

        contaBancaria.depositar(-1);//tentativa de erro!
        contaBancaria.depositar(250.00);

        contaBancaria.sacar(0);//tentativa de erro! 
        contaBancaria.sacar(500.00);//tentativa de erro!
        contaBancaria.sacar(100);
        
        System.out.println("\nSaldo final: "+contaBancaria.getSaldo());
    }
}
