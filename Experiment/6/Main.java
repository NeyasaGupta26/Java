abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int getBalance() { return 100; }
}

class BankB extends Bank {
    int getBalance() { return 150; }
}

class BankC extends Bank {
    int getBalance() { return 200; }
}

class Main {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        System.out.println("$" + a.getBalance());
        System.out.println("$" + b.getBalance());
        System.out.println("$" + c.getBalance());
        System.out.println("Neyasa Gupta 24csu280");
    }
}