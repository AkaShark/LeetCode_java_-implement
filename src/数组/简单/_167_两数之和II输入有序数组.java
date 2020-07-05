package 数组.简单;

public class _167_两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length-1;
        while (left<right){
            int sum = numbers[left]+numbers[right];
            if (sum>target) right--;
            else if (sum<target) left++;
            else return new int[]{left,right};
        }
        return null;
    }
}
