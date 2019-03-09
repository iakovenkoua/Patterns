package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Originator.Memento> mementoList = new ArrayList<Originator.Memento>();

    public void add(Originator.Memento state){
        mementoList.add(state);
    }

    Originator.Memento get(int index){
        return mementoList.get(index);
    }
}
