package Encrypt;

public class EncryptionDriver {
    public static void main(String[] args) {

        System.out.println("Encrypt");

        String str = Encryption.encrypt("this is a secret message", 4);
        System.out.println(str);

        String str2 = Encryption.encrypt("this is a secret message yupp", 4);
        System.out.println(str2);


        System.out.println("Decrypt");


        String decrypt = Encryption.decrypt(str,4);
        System.out.println(decrypt);

        String decrypt2 = Encryption.decrypt(str2,4);
        System.out.println(decrypt2);
    }
}
