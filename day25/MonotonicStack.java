//Monotonic stack approach--We have to start from backward
//[5,7,4,6,3,0]--NGE
// 1. if stack is empty return -1;
// 2.push the 0 in stack
// 3.is 0 greater than 3 no so pop from stack and push 3 in stack.
// 4.is 3 greater than 6 no so pop it from stack and push 6 in stack.
// 5.is 6 greater than 4 yes so push 4 in stack. now stack has 6 4 and next greater for 4 is 6.
// 6.is 4 greater than 7 no so pop 4 again is 6 greater than 7 no so pop 7 also. and return -1.
// 7. is 7 greater than 5 yes so return 7.
import java.util.List;
import java.util.ArrayList;

class MonotonicStack {
    private static int arr[] = {5, 7, 2, 6, 10, 9};
    private static int[] stack = new int[arr.length];
    private static int top = -1;
    private static List<Integer> result = new ArrayList<>();

    public static void main(String args[]) {
        MonotonicStack.nextGreaterElement(arr);
    }

    public static void push(int data) {
        if (top >= stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void nextGreaterElement(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (isEmpty()) {
                result.add(-1);
                push(arr[i]);
            } else {
                while (top >= 0) { 
                    if (arr[i] > stack[top]) 
                    {
                        pop();
                        if (isEmpty()) {
                            result.add(-1);
                            push(arr[i]);
                            break;
                        }
                    } 
                    else
                     {
                        result.add(stack[top]); 
                        push(arr[i]);
                        break; 
                     }
                }
            }
        }

     
        for (int i = 0, j = result.size() - 1; i < j; i++, j--) {
            int temp = result.get(i);
            result.set(i, result.get(j));
            result.set(j, temp);
        }

        System.out.println(result);
    }
}