public class Main {
    public static void main(String[] args) {
        CaesarCipher code = new CaesarCipher();
        String c = code.encrypt("defend the east wall of the castle", 1);
        System.out.println(c);
        String d = code.decrypt(c, 1);
        System.out.println(d);
    }
}
