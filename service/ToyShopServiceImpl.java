package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ToyShopServiceImpl implements ToyShopService {
    List<Toy> toyList;
    static Integer idGenerator = 1;

    public ToyShopServiceImpl() {
        this.toyList = new ArrayList<>();
    }

    @Override
    public Toy addToy(String name, int amount, int weight) {
        return new Toy(name, amount, weight);

    }

    @Override
    public ToyShop createToyShop(List<Toy> toys) {
        ToyShop toyShop = new ToyShop();
        toyShop.setToyList(toys);
        toyShop.setId(idGenerator++);
        return toyShop;
    }

    @Override
    public void readToyShop(ToyShop toys) {
        System.out.println("Призы: ");
        for (Toy s : toys.getToyList()) {
            System.out.println("\t" + s);
        }
        System.out.println();
    }

    
}
