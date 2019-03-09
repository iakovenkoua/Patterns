package strategy;

import java.util.ArrayList;

public class StrategyDemoPattern {

    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList();

        //TODO вынести в отдельный метод "context.executeStrategy(arrayList))"

        Context context = new Context(new QuickSort());
        System.out.println("QuickSort " + context.executeStrategy(arrayList));

        context = new Context(new LoopSort());
        System.out.println("LoopSort " + context.executeStrategy(arrayList));

    }
}
