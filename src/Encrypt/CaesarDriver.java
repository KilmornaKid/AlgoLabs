package Encrypt;

public class CaesarDriver {
    public static void main(String[] args) {
        String plaintext = "Kerry";
        String ciphertext = "";

        String str = CaesarCipher.encryptCaesarCipher("df r",1);
        System.out.println(str); //EG S

        String str2 = CaesarCipher.encryptCaesarCipher("Kerry",1);
        System.out.println(str2);//LFSSZ

        String str3 = CaesarCipher.decryptCaesarCipher("LFSSZ",1);
        System.out.println(str3);//Kerry

        System.out.println((int)'&');
        System.out.println((int)'A');
    }
}
