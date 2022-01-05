/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 06-01-2022
 *   Time: 00:22
 *   File: FindSecondMaximumElement.java
 */

package immersionday1;

public class FindSecondMaximumElement {
    public static void main(String[] args) {
        int[]res1={1,8,4,20,3,4,5};
        System.out.println(findSecondMaximum(res1));
        System.out.println(findSecondMaximum(new int[]{1,9,4,6,80}));
    }

    public static int findSecondMaximum(int[]arr) {
       int max=Integer.MIN_VALUE;
       int secondMax=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               secondMax=max;
               max=arr[i];
           }
           else if(arr[i]>secondMax&&arr[i]!=max){
              secondMax=arr[i];
           }
       }
        return secondMax;
    }
}
