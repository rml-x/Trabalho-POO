class Main {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();

        // Testes básicos
        System.out.println(conta.consulta() == 0); // true
        conta.depositar(10);
        System.out.println(conta.consulta() == 10); // true
        conta.sacar(120); // saldo insuficiente
        
        conta.depositar(500);
        conta.depositar(300);
        conta.sacar(200);
        
        //historico
        for (Transacao t : conta.getHistorico()) {
            System.out.println(t);
        }
    }

}