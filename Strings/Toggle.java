// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.

import java.util.*;


public class Toggle {
    public static String toggleCase(String str){
        StringBuilder sb =new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            char ch=str.charAt(index);
            if(ch>='A' && ch<='Z'){
                char lc=(char)(ch -'A'+'a');
                sb.append(lc);
            }
            else{
                char uc=(char)(ch-'a'+'A');
                sb.append(uc);
            }
        }
		//write your code here

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
        scn.close();
	}
    
}
