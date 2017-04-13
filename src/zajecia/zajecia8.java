package zajecia;

/**
 * Created by RENT on 2017-04-13.
 */
public class zajecia8 {
    public static void main(String[] args) {
        String message = "Ala ma kota";
//        System.out.println(countCharInText(message,'a'));
        System.out.println(countWords("Ala ma kota a kot ma AIDS"));
        System.out.println(switchCase("AbCdEfGh"));
    }
    //**********************************************************************
    public static boolean isPalindrome(String message){
        char [] charArray=message.toCharArray();
        boolean palindrome=true;
//        for (int i = 0; i <charArray.length/2 ; i++){
//            if (charArray[i]!=charArray[charArray.length-1-i]){
//                palindrome=false;
//                break;
//            }
//        }
        int i=0;
        while(palindrome&& i<charArray.length/2){
            if (charArray[i]!=charArray[charArray.length-1-i]){
                palindrome=false;
            }
            i++;
        }
        //return palindrome;
        return  message.equals(ananimOf(message));      // do porównywania obiektów używamy .equals()
    }

    //**********************************************************************
    public static String ananimOf(String message){
        char [] charArray=message.toCharArray();
        //char [] resultArray= new char[charArray.length];
        for (int i = 0; i <charArray.length/2 ; i++) {
            //resultArray[i]=charArray[charArray.length-i-1];
            char tmp = charArray[i];
            charArray[i]=charArray[charArray.length-i-1];
            charArray[charArray.length-1-i]=tmp;
        }
        //return String.valueOf(resultArray);
        return String.valueOf(charArray);
    }

    //*********************************************************************
    public static String switchCase(String message){
        char [] charArray=message.toCharArray();
        for (int i = 0; i <charArray.length ; i++) {
            if(charArray[i]>=65&&charArray[i]<=90){
                charArray[i]+=32;
            }else if(charArray[i]>=97&&charArray[i]<=122 ){
                charArray[i]-=32;
            }

        }
        String newString= String.valueOf(charArray);
        return newString;
    }

    //*********************************************
    public static int countWords(String message){
        char[] charArray=message.toCharArray();

        int counter=1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]==32){
                counter++;
            }

        }
       // return message.split(" ").length;
        return counter;
    }


    //**************************************************
    public static int countCapitalLetters(String message){
        char[] charArray=message.toCharArray();

        int counter=0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]>= 65 && charArray[i]<=90){
                counter++;
            }

        }
        return counter;
    }
    //*******************************************************
    public static int countSmallLetters(String message){
        char[] charArray=message.toCharArray();
        int counter=0;
        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i]>= 97 && charArray[i]<=122){
//                counter++;
//            }
            boolean statement= (charArray[i]>=97&&charArray[i]<=122);
            counter +=statement?1:0;  // (charArray[i]>=97&&charArray[i]<=122) ? 1: 0;
        }
        return counter;
    }


    //****************************************************
    public static int countCharInText(String message, char character) {

       // char[] charArray = message.toCharArray();
        int counter = 0;
        char znak = 'a';
        for (int i = 0; i < message.length(); i++) {

            if (message.charAt(i) == character) {
                counter++;
            }
        }

        return counter;


    }
}
