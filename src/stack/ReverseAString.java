/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 15-11-2021
 *   Time: 11:39
 *   File: ReverseAString.java
 */

package stack;
import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCDE"));
    }
    public static String reverseString(String str){
        Stack<Character>stack=new Stack<>();
        char[]chars= str.toString().toCharArray();
        for(char c:chars){
            stack.push(c);
        }
        for(int i=0;i<str.length();i++){
            chars[i]=stack.pop();
        }
        return new String(chars);

    }
}
