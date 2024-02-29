import java.util.Arrays;
import java.util.Scanner;
public class IsUnique {

    static Scanner scnr = new Scanner(System.in);

    public static void main (String[] args){
        IsUnique check = new IsUnique();
        System.out.println("Please enter a unique string");
        String words = scnr.next();


        /* if(check.isUnique(words)){
            System.out.println(words + " is unique");
        }
        else {
        System.out.println(words + " is not unique");
        }
         */

        if(check.isUnique2(words)){
            System.out.println(words + " is unique");
        }
        else {
            System.out.println(words + " is not unique");
        }
    }

    // O(N)

    public boolean isUnique(String str) {
        if (str.length() > 128) { // if Ascii set, if A-Z then 28
            return false;
        }

        boolean[] arr = new boolean[128];     // size of char in strings
        for (int i = 0; i < str.length(); i++) { // iterate through all char
            if (!arr[str.charAt(i)]) {           // if this char has not been seen set true
                arr[str.charAt(i)] = true;
            } else {                             // else this char has been seen
                return false;
            }

        }
        return true;                           // pass the check
    }

    // O(n log n)
    public boolean isUnique2(String str){
        // Take advantage of the array collection and its calls
        Arrays.sort(str.toCharArray());
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                return false;
            }
        }

        return true;
    }


}
