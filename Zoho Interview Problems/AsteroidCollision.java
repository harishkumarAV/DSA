// We are given an array asteroids of integers representing asteroids in a row.

// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

// Example 1:

// Input: asteroids = [5,10,-5]
// Output: [5,10]
// Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
// Example 2:

// Input: asteroids = [8,-8]
// Output: []
// Explanation: The 8 and -8 collide exploding each other.
// Example 3:

// Input: asteroids = [10,2,-5]
// Output: [10]
// Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 

// Constraints:

// 2 <= asteroids.length <= 104
// -1000 <= asteroids[i] <= 1000
// asteroids[i] != 0





import java.util.*;
class sample{
    public static void main(String args[]){
        int arr[] = {5 , 10 , -5};
        find(arr);
        System.out.println();
        int arr3[] = {8 , -8};
        find(arr3);
        System.out.println();
        int arr2[] = {5 ,-6 ,3};
        find(arr2);
    }
    public static void find(int arr[]){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        int index = arr.length-1;
        while(index>0){
            if(stack.isEmpty()){
                index=0;
                continue;
            }else{

                int x = stack.pop();
                int y = stack.pop();
                String sign_val_one = findsign(x);
                String sign_val_two = findsign(y);
                if(!sign_val_one.equals(sign_val_two)){
                    if(x+y ==0){
                        continue;
                    }else if(findsign(x).equals("Positive")){
                        if(x > -1*y){
                            stack.push(x);
                        }else{
                            stack.push(y);
                        }
                    }else{
                        if(-1* x > y){
                            stack.push(x);
                        }else{
                            stack.push(y);
                        }
                    }
                }else{
                    stack.push(y);
                    stack.push(x);
                }
            }
            index--;
        }
        List<Integer> l =new ArrayList<>();
        for(int i=0;i<stack.size();i++){
            l.add(stack.get(i));
        }
        System.out.print(l);

    }
    public static String findsign(int val){
        if(val >=0){
            return "Positive";
        }
        return "Negative";
    }
}
