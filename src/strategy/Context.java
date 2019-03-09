package strategy;

import java.util.List;

public class Context {
    private SortStrategy strategy;

    public Context(SortStrategy strategy){
        this.strategy = strategy;
    }

    public List<Integer> executeStrategy(List<Integer> list){
        return strategy.doOperation(list);
    }
}
