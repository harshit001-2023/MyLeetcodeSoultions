package Easy;

//Problem: URL=https://leetcode.com/problems/can-place-flowers/
//
//605. Can Place Flowers
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//You have a long flowerbed in which some of the plots are planted, and some are not. However,
//flowers cannot be planted in adjacent plots.
//
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
//and an integer n, return true if n new flowers can be planted in the flowerbed without violating the
//no-adjacent-flowers rule and false otherwise.
//
//Example 1:
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//
//Example 2:
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
//
//Constraints:
//1 <= flowerbed.length <= 2 * 104
//flowerbed[i] is 0 or 1.
//There are no two adjacent flowers in flowerbed.
//0 <= n <= flowerbed.length

public class CanPlaceFlower {
    static void main() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        IO.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){

                boolean leftEmpty = (i==0) || flowerbed[i-1] == 0;
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);

                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    n--;
                    i++;
                }
            }
            if(n<=0){
                return true;
            }
        }
        return false;
    }
}
