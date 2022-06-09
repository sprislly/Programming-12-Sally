public class Main {
    public static void main(String[] args) {
        CaesarCipher code = new CaesarCipher();
        String a = code.encrypt("defend the east wall of the castle", 1);
        System.out.println(a);
        String b = code.decrypt(a, 1);
        System.out.println(b);

        String c = code.encrypt("abcdefghijklmnopqrstuvwxyz", 1);
        System.out.println(c);
        String d = code.decrypt(c, 1);
        System.out.println(d);

    }
}