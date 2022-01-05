package immersionday1;/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 06-01-2022
 *   Time: 00:06
 *   File: RemoveEvenPlacesElements.java
 */

import java.util.Arrays;

public class RemoveEvenElements {
    public static void main(String[] args) {
        int[]arr={1,10,23,7,8,9,30};
        int c=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                c=c+1;
            }
        }
        int[]newarr=new int[c];
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2!=0){
                newarr[k]=arr[j];
                k++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
