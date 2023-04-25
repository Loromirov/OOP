import Classes.Market;
import Classes.OrdinareClient;
import Classes.VipClients;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        // Market market = new Market();
        // OrdinareClient client1 = new OrdinareClient("Boris");
        // OrdinareClient client2 = new OrdinareClient("Daria");
        // VipClients client3 = new VipClients("Dima", 1101);
        // market.acceptToMarket(client1);
        // market.acceptToMarket(client2);
        // market.acceptToMarket(client3);
        // market.update();

        Market market1 = new Market();
        iActorBehaviour item1 = new OrdinareClient("Boris");
        iActorBehaviour item2 = new OrdinareClient("Daria");
        iActorBehaviour item3 = new OrdinareClient("Stepan");
        iActorBehaviour item4 = new VipClients("Dima", 1101);

        market1.acceptToMarket(item1);
        market1.acceptToMarket(item2);
        market1.acceptToMarket(item3);
        market1.acceptToMarket(item4);
        market1.update();        
        
    }
}
