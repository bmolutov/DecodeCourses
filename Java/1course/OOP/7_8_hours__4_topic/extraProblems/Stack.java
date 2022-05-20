import java.util.*;


public class Stack {
    private ArrayList<Integer> stack;
    private int size;
    private int mn;
    private int mx;
    
    public Stack() {
        this.stack = new ArrayList<>();
        this.size = 0;
        this.mn = Integer.MAX_VALUE; 
        this.mx = Integer.MIN_VALUE;
    }
    public void push(Integer newInt) {
        this.stack.add(newInt);
        this.size += 1;
        this.mn = Math.min(this.mn, newInt);
        this.mx = Math.max(this.mx, newInt);
    }
    public void pop() {
        int top = this.stack.get(this.size() - 1);

        this.stack.remove(this.size - 1);
        this.size -= 1;

        if(this.size() == 0) {
            this.mn = Integer.MAX_VALUE;
            this.mn = Integer.MIN_VALUE;
        }

        if(mn == top) {
            this.mn = this.stack.get(0);
            for(int i = 1; i < this.size(); i++) {
                this.mn = Math.min(this.mn, this.stack.get(i));
            }
        }
        if(mx == top) {
            this.mx = this.stack.get(0);
            for(int i = 1; i < this.size(); i++) {
                this.mx = Math.mmax(this.mx, this.stack.get(i));
            }
        }
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        if(this.size() == 0) {
            return true;
        }
        return false;
    }
}
