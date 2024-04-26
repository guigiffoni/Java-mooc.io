package Objectception;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        if (stack.size() > 0) {
            return false;
        }

        return true;
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        String foo = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);

        return foo;
    }
}
