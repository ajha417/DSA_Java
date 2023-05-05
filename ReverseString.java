public class ReverseString {
    public static void main(String[] args) {
        String s=" hello world ";
        String result=reverseWords(s);
        System.out.println(result);
    }
    static String reverseWords(String s){
        s=s.trim();


        String str[]=s.split(" ");

        int n=s.length();
        String result="";
        System.out.println(n);

        for(int i= str.length-1;i>=0;i--){
            result=result+str[i]+" ";
        }

        return result.trim();
    }
}
