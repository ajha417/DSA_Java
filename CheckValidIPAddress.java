public class CheckValidIPAddress {
    public static void main(String[] args) {
        String s="255.13.1.4";
        if(isValid(s)==true){
            System.out.println("it is valid ip address");
        }
        else{
            System.out.println("it is not");
        }

    }
    static boolean isValid(String s){
        if(s.charAt(0)=='.'||s.charAt(s.length()-1)=='.')
            return false;
        String str[] = s.split("\\.");
        if(str.length!=4)
            return false;
        for(String s1:str){
            if(s1.length()>3 ||s1.length()<0)
                return false;
            if(s1.length()>1 && s1.charAt(0)=='0')
                return false;
            try {
                int x=Integer.parseInt(s1);
                if(x<0 || x>255)
                    return false;
            }
            catch (Exception e){
                return false;
            }

        }
        return true;
    }
}
