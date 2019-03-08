package command;

public class SeaProductsCommand implements Command {

    @Override
    public void cook() {
        System.out.println("Add sea products to pizza");
    }
}
