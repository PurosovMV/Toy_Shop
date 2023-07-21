import controller.Controller;
import model.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Toy toy1 = new Toy("Bear", 5, 50);
        Toy toy2 = new Toy("Ball", 10, 40);
        Toy toy3 = new Toy("Lion", 2, 30);
        Toy toy4 = new Toy("Giraffe", 20, 20);
        Toy toy5 = new Toy("Car", 7, 10);
        Toy toy6 = new Toy("Rabbit", 11, 5);

        List<Toy> toyList = new ArrayList<>(Arrays.asList(toy1, toy2, toy3, toy4, toy5, toy6));
        ToyShop toyShop = controller.createToyShop(toyList);
        controller.readToyShop(toyShop);        
        controller.toyLottery(toyShop);
        controller.readFile();
        System.out.println("Остаышиеся призы:");
        controller.readToyShop(toyShop); 
    }

}
