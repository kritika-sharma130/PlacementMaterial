/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 06-01-2022
 *   Time: 00:49
 *   File: PatternThree.java
 */

package immersionday1.patterns;

public class PatternThree {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
