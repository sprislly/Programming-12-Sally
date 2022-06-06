import java.util.HashMap;
import java.util.Iterator;

public class Cipher {
    String message;
    int shift;
    String alpha = "abcdefghijklmnopqrstuvwxyz";

    Cipher(String message, int shift){
        this.message = message;
        this.shift = shift;
    }

    HashMap<String, String> map = new HashMap<>();
    map.put(message)



    public String Encrypt(){
        Iterator<String> encryption = map.keySet().iterator();
        String a = encryption.next();
        //shift;
        return a;
    }
    public String Decrypt(){
        Iterator<String> decryption = map.keySet().iterator();
        String b = decryption.next();
        //- shift;
        return b;
    }



}




