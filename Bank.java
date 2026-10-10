public class Bank {
    private String noRekening;
    private String nama;
    private double balance;

    public Bank(String noRekening, String nama, double balanceAwal) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.balance = balanceAwal;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public String getNoRekening() {
        return this.noRekening;
    }

    public String getNama() {
        return this.nama;
    }

    public double getBalance() {
        return this.balance;
    }
}

