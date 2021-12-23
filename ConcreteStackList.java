package TD1;


import java.util.ArrayList;

public class ConcreteStackList implements Astack{
    private ArrayList<Object> ListObj ;


    public ConcreteStackList() {
        ListObj = new ArrayList<Object>();
    }
    @Override
    public boolean isEmpty() {
        return ListObj.isEmpty();
    }

    @Override
    public void push(Object obj) {
        ListObj.add(obj);
    }

    @Override
    public Object peek() {
        Object res = null;
        if (!this.isEmpty()){
            res = ListObj.get(ListObj.size()-1);
        }
        return res;
    }

    @Override
    public Object pop() {
        Object res = null;
        if (!this.isEmpty()){
            res = ListObj.remove(ListObj.size()-1);
        }return res;
    }
	
}
