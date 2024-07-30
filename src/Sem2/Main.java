package Sem2;


public class Main {
    public static void main(String[] args){
       Market market = new Market();

       Human actor1 = new Human("Igor");
       Human actor2 = new Human("Viktor");
       Human actor3 = new Human("Oleg");

       market.acceptToMarket(actor1);
       market.acceptToMarket(actor2);
       market.acceptToMarket(actor3);

       market.update();

        System.out.println();
    }
}
