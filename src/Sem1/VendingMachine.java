package Sem1;

public interface VendingMachine {

    Product getProduct(String name);
    HotDrinks getProduct(String name, int volume, int temperature);



//    public Sem1.VendingMachine() {
//        this.productList = initProduct();
//        this.money = 0;
//    }
//
//    private List<Sem1.Product> productList;
//
//    private Integer money;
//
//    public Sem1.Product getProduct(String name) {
//
//    }
//
//    private List<Sem1.Product> initProduct(){
//        List<Sem1.Product> products = new ArrayList<>();
//        products.add(new Sem1.Product("Chocolate",150));
//        products.add(new Sem1.Product("Water",50));
//        products.add(new Sem1.Product("Cookie",100));
//        return products;
//    }
}
