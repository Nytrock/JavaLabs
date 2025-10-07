package Task1;

public class Main2 {
    public static void main(String[] args) {
        BagStruct b1 = new BagStruct(100);
        b1.Mint(60);
        BagStruct b2 = new BagStruct(90);
        b2.Mint(70);
        b1.Transfer(b2);
        System.out.println("Баланс b1: " + b1.Balance()); // 40
        System.out.println("Баланс b2: " + b2.Balance()); // 90
    }
}
