package domain;

public class BankAccount {
    private Integer number;
    private String agency;
    private String name;
    private Double balance;

    public BankAccount(Integer number, String agency, String name, Double balance) {
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agency + " conta " + number + " e seu saldo "
                + balance + " já esta disponível para saque";
    }
}
