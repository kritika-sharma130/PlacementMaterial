/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 06-01-2022
 *   Time: 00:15
 *   File: checkPalindromeString.java
 */

package immersionday1;

public class CheckPalindromeString {
    public static void main(String[] args) {
        CheckPalindromeString obj = new CheckPalindromeString();
        System.out.println(obj.checkString("kritika"));
        System.out.println(obj.checkString("madam"));
    }
    public boolean checkString(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        return (s1.equals(s));
    }
}
