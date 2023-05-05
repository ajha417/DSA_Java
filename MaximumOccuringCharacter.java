public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String s = "hello@@@@@";
        int []arr = new int[127];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)] = arr[s.charAt(i)]+1;
        }
        int max=-1;
        char c=' ';
        for(int i=0;i<s.length();i++){
            if(max<arr[s.charAt(i)]){
                max=arr[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        System.out.println("The maximum occuring character is "+c);
//        intern method is way of making reference variable pointing to object which is at String constant pool
      /*  String s1 = new String("Amit");
        String s2 = "Amit";
        System.out.println(s1==s2);
        s1=s1.intern();
        System.out.println(s1==s2);*/
    }
}
