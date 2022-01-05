/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 06-01-2022
 *   Time: 00:41
 *   File: PatternOne.java
 */

package immersionday1.patterns;

public class PatternOne {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
