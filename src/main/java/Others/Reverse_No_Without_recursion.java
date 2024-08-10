package Others;

public class Reverse_No_Without_recursion
{
        public static void main(String[] args)
        {
                //Reverse a Number
                //Way-1
                int num=1895;
                int rev=0;
                while(num>0)
                {
                       rev=rev*10+num%10;
                       num=num/10;
                }
               System.out.println(rev);

               //Way-2
                int num1=182675;
                StringBuffer sb1=new StringBuffer(String.valueOf(num1));
                System.out.println(sb1.reverse());

                //Way-3
                int num2=182675;
                StringBuilder sb2=new StringBuilder();
                sb2.append(num2);
                System.out.println(sb2.reverse());




        }
}
