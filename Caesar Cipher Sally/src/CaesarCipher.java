import java.util.HashMap;

public class CaesarCipher {
    private final HashMap<Character, Integer> charMap;
    private final static char[] encryptionArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

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
        String encryptedText = "";
        //Make sure the key is valid.
        if(key < 0 || key > 25 || message.length() <= 0){
            return null;
        }
        //Eliminates any whitespace and non alpha char's.
        message = message.trim();
        message = message.replaceAll("\\W", "");

        //Makes sure that all the letters are uppercase.
        message = message.toLowerCase();
        for(int i = 0; i < message.length(); i++){
            char letter = message.charAt(i);
            int lookUp = (charMap.get(letter) + key) % 26;
            encryptedText += encryptionArr[lookUp];

        }
        return encryptedText;
    }

    /*
     * Decrypts using the formula: (c(i) – k) mod 26.
     * Returns plain text or null if an error occurred.
     */
    public String decrypt(String code, int key){
        String decryptedText = "";
        //Make sure the key is valid.
        if(key < 0 || key > 25){
            return null;
        }
        //Eliminates any whitespace and non alpha char's.
        code = code.trim();
        code = code.replaceAll("\\W", "");
        if(code.contains(" ")){
            code = code.replaceAll(" ", "");
        }
        //Makes sure that all the letters are lowercase.
        code = code.toLowerCase();
        for(int i = 0; i < code.length(); i++){
            char letter = code.charAt(i);
            int lookUp = (charMap.get(letter) - key) % 26;
            //Returns a positive number on negative input.
            if (lookUp < 0){
                lookUp += 26;
            }
            decryptedText += encryptionArr[lookUp];
        }
        return decryptedText;
    }

}
