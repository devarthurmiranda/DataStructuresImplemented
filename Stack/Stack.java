package Stack;

public class Stack {
    public int top;
    Character[] stack;

    public Stack(int size) {
        this.top = -1;
        this.stack = new Character[size];
    }

    public void push(Character item) {
        if (this.top < this.stack.length - 1){
            this.top++;
            this.stack[this.top] = item;
        } else {
            System.out.println("Stack is full");
        }
    }

    public Character pop() {
        if(this.top >= 0){
            Character item = this.stack[this.top];
            this.top--;
            return item;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public Character peek() {
        if(this.top >= 0){
            return this.stack[this.top];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public Character clean(){
        if(this.top >= 0){
            Character item = this.stack[this.top];
            this.top = -1;
            return item;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public void print() {
        if(this.top >= 0){
            for(int i = this.top; i >= 0; i--){
                System.out.println(this.stack[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }
}
