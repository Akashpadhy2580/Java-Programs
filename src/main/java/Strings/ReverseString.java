package Strings;

public class ReverseString
{
        public static void main(String[] args)
        {
            //Reverse a String
                //Way-1
                String str="Akash";
                String rev="";
                for (int i=str.length()-1;i>=0;i--)
                {
                        rev=rev+str.charAt(i);
                }
                System.out.println(rev);

                //way-2
                String rev1="";
                char[] s=str.toCharArray();
                for (int i=s.length-1;i>=0;i--)
                {
                        rev1=rev1+s[i];
                }
                System.out.println(rev1);

                //way-3
                StringBuffer sb1=new StringBuffer(str);
                System.out.println(sb1.reverse());

                //Way-4
                StringBuilder sb2=new StringBuilder();
                sb2.append(str);
                System.out.println(sb2.reverse());


        }
}
