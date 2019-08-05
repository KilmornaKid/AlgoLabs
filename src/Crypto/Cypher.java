package Crypto;

public class Cypher {


    public static String encryptCaeser(String plainText, int shift){
        String result = "";
        for(int i = 0; i < plainText.length(); i++){
            char ch = plainText.charAt(i);
            if(ch == ' '){
                result += ch;
            }else{
                int chNum = ch - 'A';
                chNum = 'A' + ((chNum + shift) % 26);
                result += (char) chNum;
            }
        }

        return result;
    }


   /* public static String encryptRowColumn(String plainText, int numColumns, int numRows){
        String cipherText = "";
        int col = 0;
        for(int i =0; i < numColumns; i++){
            int index = col;
            for(int j = 0; j < numRows; j++){
                int row = 0;
                cipherText = cipherText + plainText[col, row];
                row++;
            }
        col++;
        }
        return cipherText;
    }*/

   public static int noName(int[] a, int pos, int currentSize)
   {
       for (int i = pos; i < currentSize-1; i++){
           a[i] = a[i+1];
       }
       currentSize--;
       return currentSize;
   }

}
