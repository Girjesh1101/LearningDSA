package StringPractices;

public class UpperString {
    
    // first word should be uppercase
    public static String firstWordUpper(String str){

        StringBuilder sb = new StringBuilder();

        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i = 1; i < str.length() ; i++){

            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // count all the small case character
    public static int countSmallString(String str){

        String[] words = str.split("\\s+");
        int count = 0;

        for(String word : words){

            if(word.equals(word.toLowerCase())){
                count ++;
            }

            System.out.println(word + " ");
        }
        return count;
    }

    //remove special character from String
    public static String removeSpecialCharacter(String str){

        String newStr = str.replaceAll("[^a-zA-Z]", "");

        return newStr;
    }

    //count of String
    public static int countString(String str){

        String arr[] = str.split(" ");
        return arr.length;
    }


    public static void main(String[] args) {
        
        String str = "hi there ! I am learning String";

        System.out.println("first word should be upper case : "+firstWordUpper(str));

        System.out.println("Count lower string words : "+countSmallString(str));

        System.out.println("remove Special character : "+removeSpecialCharacter(str));

        System.out.println("Count of String : "+countString(str));
    }
}
