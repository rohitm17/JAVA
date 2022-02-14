//import java.util.*;
class String_Builder{

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // To get char at index 0
        System.out.println("First character: "+sb.charAt(0));
        // To set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        // To insert a char at index 0
        sb.insert(0, "S");
        System.out.println(sb);
        // TO delete a partiular char or substring
        sb.delete(1, 2);
        System.out.println(sb);
        // To add char at end
        sb.append('t');
        sb.append('v');
        System.out.println(sb);
        // Size of string
        int length = sb.length();
        System.out.println(length);
        
        
    }
}
