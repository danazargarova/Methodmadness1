public class DZargarovaLib {

    public static void test(){
        System.out.println("Hello, Mr. Levin");
        //just to check how to use testfiles
    }

    public static boolean isPalindrome(String word){
        /**
         * input is a word
         * output is a boolean: true if palindrome, false if not palindrome
         */
        int n= word.length();
        for (int i=0; i<(n/2); i++) {
            if (word.charAt(i) != word.charAt(n - i-1))
                //goes thru letter at each i value to check if it matches the corresponding letter on the other half of the word
                return false;
        }
        return true;
    }
    public static String dateStr(String date) {
        /**
         * input is a date in the format mm/dd/yy
         * output is a date in the format dd-mm-yy
         */
        String month = date.substring(0, 2);
        String day= date.substring(3,5);
        String year= date.substring(6,date.length());
        return (day + "-" + month + "-" + year);
    }

    public static String cutOut(String mainStr, String subStr){
        /**
         * mainStr is the word that gets cut
         * subStr is the word that gets removed from mainStr
         * output is new string consisting of mainStr with the subStr removed
         */
        String newStr1= mainStr.substring(0,mainStr.indexOf(subStr)); //first part of mainStr before subStr
        int length= newStr1.length()+subStr.length(); // index of the last letter in subStr
        String newStr2=mainStr.substring(length, mainStr.length()); // last part of mainStr after subStr
        return newStr1 + newStr2; //adds the two strings to make the outputs
    }

    public static boolean isFibbnacci(int num){
        /**
         * input is a number
         * output is true if number is fibonacci, false if not
         */
        int a=0;
        int b=0;
        for  (int c=1; c <= num; c= a+b) {
            a = b;
            b = c;
            // finds fibonacci number closest to num

            if (num == c)
                return true;
        }
            return false;
        }

    public static int sumUpTo(int num){
        /**
         * input is an integer
         * output is sum of all integers from 0 to input
         */
        int sum = 0;
        int n = 1;
        while(n<=num) {
            sum += n;
            n++;
            // adds all numbers from 0 to input to variable sum
        }
        return sum;
        }
    }


