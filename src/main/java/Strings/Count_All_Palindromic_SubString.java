package Strings;

public class Count_All_Palindromic_SubString
{
    public static void main(String[] args)
    {
        //Longest Palindromic SubString
        String s="bababd";
        System.out.println("Count: "+countPalindrome(s));
    }
    public static int countPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

       int ans=0;

        for (int i = 0; i < s.length() - 1; i++) {
            int odd = expandFromCenter(s, i-1, i+1);
            int even = expandFromCenter(s, i, i + 1);

            ans=ans+odd+even+1;
        }

        return ans;
    }

    private static int expandFromCenter(String s, int left, int right) {
        int count=0;
        while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
           count++;
        }
        return count;
    }

}
