package teachclasses;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("masdzam",0));
    }

    public static boolean isPalindrom(String word, int i){
        if(word.charAt(i) == word.charAt(word.length() - 1 - i)){
            if((word.length() - 1 - i) - i == 1 || (word.length() - 1 - i) == i) {
                return true;
            }
            return isPalindrom(word, ++i);
        } else
            return false;
    }
}
