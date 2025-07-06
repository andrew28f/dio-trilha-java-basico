public class ContaBancaria {

    private final int numeroConta;
    private double saldo;
    private double chequeEspecial;
    private double taxa = 0;
    private boolean usandoChequeEspecial = false;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;

        if (saldo <= 500) chequeEspecial = 50;
        else chequeEspecial = saldo*0.5;
    }

    public void depositarDinheiro(double valor) {
        this.saldo += valor;

        if (usandoChequeEspecial) usandoChequeEspecial = false;

        System.out.printf("Depósito no valor de R$ %.2f realizado com sucesso.\n", valor);
    }

    public void sacarDinheiro(double valor) {
        if (saldo == 0) {
            if (chequeEspecial >= valor) {
                this.chequeEspecial -= valor;
                usandoChequeEspecial = true;
                taxa += valor*0.2;
                System.out.println("Você está utilizando o cheque especial.");
                System.out.printf("Saque no valor de R$ %.2f realizado com sucesso.\n", valor);
                return;
            } else {
                System.out.printf("Seu saldo e cheque especial são insuficientes para saque no valor de R$ %.2f.\n", valor);
                return;
            }
        } else if (saldo < valor) {
            System.out.printf(
                "Seu saldo de R$ %.2f é insuficiente para saque no valor de R$ %.2f.\n",
                saldo, valor
            );
            return;
        }

        this.saldo -= valor;
        System.out.printf("Saque no valor de R$ %.2f realizado com sucesso.\n", valor);
    }

    public void pagarBoleto() {
        if (taxa == 0) {
            System.out.println("Não há boletos para serem pagos.");
            return;
        }

        if (saldo < taxa) {
            System.out.printf(
                "Seu saldo de R$ %.2f é insuficiente para pagamento no valor de R$ %.2f.\n",
                saldo, taxa
            );
            return;
        }

        this.saldo -= taxa;
        System.out.printf("Pagamento no valor de R$ %.2f realizado com sucesso.\n", taxa);
    }

    public void consultarSaldo() {
        System.out.printf(
                "Número da Conta: %d\nSaldo Bancário: R$ %.2f\n",
                numeroConta, saldo
        );
    }

    public void consultarChequeEspecial() {
        System.out.printf(
                "Número da Conta: %d\nValor do Cheque Especial: R$ %.2f\n",
                numeroConta, chequeEspecial
        );
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
        this.usandoChequeEspecial = usandoChequeEspecial;
    }

    @Override
    public String toString() {
        return String.format(
            "Número da Conta: %d\nSaldo Bancário: R$ %.2f\nValor do Cheque Especial: R$ %.2f\n",
            numeroConta, saldo, chequeEspecial
        );
    }
}
