import java.util.HashSet;
public class LaegestSting {
   public static int lengthOfLongestSubstring(String s){
HashSet<Character> set = new HashSet<>();

int left =0, right=0, maxVlaue = 0;
while (right < s.length()) {
    char current=s.charAt(maxVlaue);
     while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

    
}
return maxVlaue;
    }
    public static void main(String[] args) {
        String s = "aabssbaaahhhhaamjjjjjj";
    System.out.println(lengthOfLongestSubstring(s));
    }
}
