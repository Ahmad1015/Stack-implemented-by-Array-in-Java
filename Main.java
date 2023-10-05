public class Main{
    public static void main(String[] args){
        List s = new Stack(2);
        s.push(100);
        s.push(200);
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}
abstract class List{
    abstract boolean push(int element);
    abstract int pop();
    abstract boolean isEmpty();
    abstract boolean isFull();
}
class Stack extends List{
    int top;
    int N;                  // Total Size of Array;
    int arr[];
    public Stack(){
        top=0;
        N=5;
        arr = new int[N];
    }
    public Stack(int size){
        top = 0;
        N = size;
        arr = new int[N];
    }
    public boolean push(int element){
        if(top==N){
            System.out.println("Stack is Full- Cannot Push");
            return false;
        }
        else{
            arr[top]=element;
            top++;
            return true;
        }
    }
    public int pop(){
        int element_to_return = arr[top-1];
        top--;
        return element_to_return;
    }
    public boolean isEmpty(){
        if(top == 0)
            return true;
        else
            return false;
    }
    public boolean isFull(){
            return top==N;
    }
    @Override
    public String toString(){
        String stringElement = "";
        for(int i=0;i<top;i++){
            stringElement = stringElement+" "+String.valueOf(arr[i]);
        }
        return stringElement+=" -> null";
    }

}