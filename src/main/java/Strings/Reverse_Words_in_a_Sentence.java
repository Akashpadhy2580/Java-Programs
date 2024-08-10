package Strings;

public class Reverse_Words_in_a_Sentence
{

    public static void main(String[] args)
    {
        String str="Akash Kumar Padhy";
        String[] words=str.split("\\s");
        for (String word:words){
            StringBuilder sb=new StringBuilder();
            sb.append(word);
            System.out.print(sb.reverse()+" ");
        }
    }
}
