/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 06-01-2022
 *   Time: 00:44
 *   File: PatternTwo.java
 */

package immersionday1.patterns;

public class PatternTwo {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
