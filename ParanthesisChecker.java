import  java.util.Stack;
public class ParanthesisChecker {
    public static void main(String[] args) {
        String s = "{}[](";
        if(checkParanthesis(s)){
            System.out.println("yes it is");
        }
        else{
            System.out.println("no");
        }

    }
  static   boolean checkParanthesis(String s){
        Stack<Character>  s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(isOpening(curr)){
                s1.push(curr);
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
            else if(!isMatching(s1.peek(),curr)){
                return false;
            }
            else{
                s1.pop();
            }
            }

        }
        return s1.isEmpty();
    }
  static   boolean isOpening(char curr){
        return curr=='('||curr=='{'||curr=='[';
    }
   static boolean isMatching(char a,char b){
        return ((a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']'));
    }
}
