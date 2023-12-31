package generics.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(this.list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!this.list.isEmpty()){
            System.out.print(this.list.get(0));
            for(int index=1; index<this.list.size(); index++){
                System.out.print(", "+this.list.get(index));
            }
        }
        System.out.println("]");
    }
}
