package StringPractices;

public class ReveseString {

    //using StringBuilder
    public static String revSB(String str){

        String sb = new StringBuilder(str).reverse().toString();

        return sb;
    }

    // for loop
    public static String revLoop(String str){

        String rev ="";

        for(int i = str.length()-1; i >=0 ; i-- ){

            rev += str.charAt(i);
        }
        return rev;

    }

    // Array
    public static String revArr(String str){

        char[] eachChar = str.toCharArray(); 
        String rev ="";
        for (int i = eachChar.length-1; i >= 0; i--) {
            rev += eachChar[i];
        }
        return rev;
    }
    
    public static void main(String[] args) {
        
        String str = "Hello java";

        System.out.println("revese String with StringBuilder :"+ revSB(str));

        System.out.println("Revese String with loop: "+revLoop(str));

        System.out.println("revse String with Array : "+revArr(str));
    }
}
