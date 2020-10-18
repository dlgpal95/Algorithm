public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(97<= (int)a && (int)a <=122
                    || 48<= (int)a && (int)a <=57 ){
                stringBuilder.append(Character.toString(a));
            }
        }

        String result =  stringBuilder.toString();
        String reverse = new StringBuilder(result).reverse().toString();

        if(result.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}
////
 class Solution2 {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}
