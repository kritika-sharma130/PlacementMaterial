/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 06-01-2022
 *   Time: 00:51
 *   File: PatternFour.java
 */

package immersionday1.patterns;

public class PatternFour {
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<2*n;r++){
            int totalColumnInRow=r>n?2*n-r:r;
            for(int c=0;c<totalColumnInRow;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
