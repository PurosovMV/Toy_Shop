package controller;

import java.util.List;

import model.*;
import service.*;

public class Controller {
    ToyShopServiceImpl ToyShopService = new ToyShopServiceImpl();
    DataServiceImpl dataService = new DataServiceImpl();
    ToyShopLotteryServiceImpl toyShopLotteryService = new ToyShopLotteryServiceImpl();

    public ToyShop createToyShop(List<Toy> toyList) {
        return ToyShopService.createToyShop(toyList);
    }

    public Toy addToy(String name, int amount, int weight) {
        return this.ToyShopService.addToy(name, amount, weight);
    }

    public void readToyShop(ToyShop toys) {
        ToyShopService.readToyShop(toys);
    }

    public void saveInFile(String text) {
        dataService.saveInFile(text);

    }

    public void readFile() {
        dataService.readFile();
    }

    public void toyLottery(ToyShop toys) {
        toyShopLotteryService.toyLottery(toys);
    }
}
