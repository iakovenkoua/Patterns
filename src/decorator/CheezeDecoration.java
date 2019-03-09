package decorator;

public class CheezeDecoration extends BaseDecoration{
    public CheezeDecoration(CurrentPizza pizza) {
       // this.createPizza = pizza;
    }


    @Override
    public void coockes() {
        createPizza.coockes();
        System.out.println("With bacon");
    }

}
