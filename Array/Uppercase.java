public class Uppercase {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        String s= "hello, my name is atirek";
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else{
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb.toString());
    }
}
