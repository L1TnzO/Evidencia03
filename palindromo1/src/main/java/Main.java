
public class Main {

    public static void main(String[] args){

        inicio();
    }
    public static void inicio(){

        String original = "";
        String reversa = "";

       palindromo(original);
       esPalindormo(original, reversa);
    }
    public static String palindromo(String original){

        String reversa = "";

        int largo = original.length();
        for(int i = largo -1; i >= 0; i--) {

            reversa = reversa + original.charAt(i);

        }
        return reversa;
    }
    public static boolean esPalindormo(String original, String reversa){

        if(original.equals(reversa)){
            return true;
        }else{

            return false;
        }
    }
}
