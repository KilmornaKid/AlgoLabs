package Encrypt;

public class Encryption {
    public static String encrypt (String str, int numColumns)
    {
        String str2 = "";
        for(int i = 0; i < str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                str2 += str.charAt(i);
            }
        }

        String str3 = str2.toUpperCase();

        char c = 'X';
        int j = str3.length() % numColumns;
        int k = 0;

        if(j != 0) {
            j = numColumns - j;
        }
        for (int i = 1; i <= j; i++) {
            str3 += c;
        }

        System.out.println(str3);
        int rows= str3.length() / numColumns;
        String ciphertext = "";

        for(int i = 0; i < numColumns; i++)
        {
            int index = i;
            for(int counter = 0; counter < rows ; counter ++)
            {
                ciphertext += str3.charAt(index);
                index += numColumns;
            }
        }
        return ciphertext;
    }

    public static  String decrypt( String plaintext, int numColumns)
    {
        int noRows = plaintext.length() / numColumns;
        return encrypt(plaintext,noRows);
    }
}
