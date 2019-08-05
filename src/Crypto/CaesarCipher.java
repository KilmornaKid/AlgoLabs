package Crypto;

public class CaesarCipher {
    public static String encryptCaesarCipher(String plaintext, int offset) {
        String s = "";
        int max = 'Z';
        plaintext = plaintext.toUpperCase();
        if (offset >= 26) {
            offset = offset % 26;
        }


        for (int i = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) != ' ') {
                int chnum = plaintext.charAt(i);
                int num = chnum + offset;
                if (num > max) {
                    num -= 26;
                }
                char ch = (char) num;
                s += ch;
            }else{

                s += ' ';
            }
        }
        return s;
    }

    public static String decryptCaesarCipher(String plaintext, int offset) {
        String s = "";
        int max = 'A';
        plaintext = plaintext.toUpperCase();
        if (offset >= 26) {
            offset = offset % 26;
        }


        for (int i = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) != ' ') {
                int chnum = plaintext.charAt(i);
                int num = chnum - offset;
                if (num < max) {
                    num -= 26;
                }
                char ch = (char) num;
                s += ch;

            } else {

                s += ' ';
            }
        }
        return s;
    }
}
