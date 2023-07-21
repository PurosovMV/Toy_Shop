package service;

import java.util.List;

import model.Toy;
import model.ToyShop;

public interface ToyShopService {

    public Toy addToy(String name, int amount, int weight);

    public ToyShop createToyShop(List<Toy> toys);

    public void readToyShop(ToyShop toys);

   
}
