package l10q1;

public class Tester {

    public static void main(String[] args) {
        PermanentEmployee a = new PermanentEmployee("Alice", "A");
        System.out.println(a);
        ContractStaff b = new ContractStaff("Bob", 2000);
        System.out.println(b);
        TemporaryStaff c = new TemporaryStaff("Cindy", 100);
        System.out.println(c);
    }
}