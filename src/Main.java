// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bankaccount b1 =  new Bankaccount(1234,"Credit account",20000,04,8,2000);
        b1.display();

        Bankaccount b2 = new Bankaccount();
        b2.display();

    }
}