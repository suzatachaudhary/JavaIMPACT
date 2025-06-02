import java.util.Arrays;

class Stack {
    private static int[] arr = new int[5]; 
    private static int top = -1;

    public static void main(String[] args) {
        System.out.println(isEmpty()); 
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        System.out.println(isFull()); 
        int a = pop();
        int b = pop();
        System.out.println("Deleted Elements: " + a + " " + b);
        display(); 
        System.out.println("Stack size: " + size());
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == arr.length - 1;
    }

    public static void push(int data) {
        if (!isFull()) {
            arr[++top] = data;
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public static int pop() {
        if (!isEmpty()) {
            return arr[top--]; 
        } else {
            System.out.println("Stack Underflow!");
            return -1;
        }
    }

    public static int peek() { 
        return isEmpty() ? -1 : arr[top];
    }

    public static void display() {
        if (!isEmpty()) {
            System.out.println("Stack: " + Arrays.toString(Arrays.copyOfRange(arr, 0, top + 1))); 
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public static int size() {
        return top + 1;
    }
}