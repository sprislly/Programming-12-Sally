public class Main {
    public static void main(String[] args) {
        Cipher code = new Cipher("defend the east wall of the castle", 1);
        System.out.println(code.Encrypt());
        System.out.println(code.Decrypt());
    }

}
