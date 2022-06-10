import java.util.HashMap;

public class CaesarCipher {
    private final HashMap<Character, Integer> charMap;
    private final static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public CaesarCipher(){
        charMap = new HashMap<>();
        charMap.put('a', 0);
        charMap.put('b', 1);
        charMap.put('c', 2);
        charMap.put('d', 3);
        charMap.put('e', 4);
        charMap.put('f', 5);
        charMap.put('g', 6);
        charMap.put('h', 7);
        charMap.put('i', 8);
        charMap.put('j', 9);
        charMap.put('k', 10);
        charMap.put('l', 11);
        charMap.put('m', 12);
        charMap.put('n', 13);
        charMap.put('o', 14);
        charMap.put('p', 15);
        charMap.put('q', 16);
        charMap.put('r', 17);
        charMap.put('s', 18);
        charMap.put('t', 19);
        charMap.put('u', 20);
        charMap.put('v', 21);
        charMap.put('w', 22);
        charMap.put('x', 23);
        charMap.put('y', 24);
        charMap.put('z', 25);
    }
    public String encrypt(String message, int key){
        StringBuilder encryptedText = new StringBuilder();
        //Make sure the key is valid.
        if(key < 0 || key > 25 || message.length() <= 0){
            return null;
        }

        message = message.toLowerCase();
        for(int i = 0; i < message.length(); i++){
            char letter = message.charAt(i);
            if(charMap.get(letter) == null){
                encryptedText.append(" ");
            }else {
                int lookUp = (charMap.get(letter) + key) % 26;
                encryptedText.append(alphabet[lookUp]);
            }
        }
        return encryptedText.toString();
    }

    /*
     * Decrypts using the formula: (c(i) – k) mod 26.
     * Returns plain text or null if an error occurred.
     */
    public String decrypt(String code, int key){
        StringBuilder decryptedText = new StringBuilder();
        if(key < 0 || key > 25){
            return null;
        }

        code = code.toLowerCase();
        for(int i = 0; i < code.length(); i++){
            char letter = code.charAt(i);
            if(charMap.get(letter) == null){
                decryptedText.append(" ");
            } else {
                int lookUp = (charMap.get(letter) - key) % 26;
                //Returns a positive number on negative input.
                if (lookUp < 0) {
                    lookUp += 26;
                }
                decryptedText.append(alphabet[lookUp]);
            }
        }
        return decryptedText.toString();
    }

}
