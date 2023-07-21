package service;

import java.util.Random;
import java.util.Scanner;

import model.*;

public class ToyShopLotteryServiceImpl implements ToyShopLotteryService {

    @Override
    public void toyLottery(ToyShop toys) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите испытать удачу? напиши [yes/no]");
        String choice = scan.next();
        scan.close();
        if (choice.equals("yes")) {
            System.out.println("Желаю удачи!");
            Random rand = new Random();
            int prize = rand.nextInt(0, 10);
            
            if (prize <= toys.getToyList().get(rand.nextInt(toys.getToyList().size())).getId()) {
                String text = toys.getToyList().get(prize).getName().toString();
                System.out.println("Поздравляю, вы выйграли " + text);
                DataServiceImpl dataService = new DataServiceImpl();
                dataService.saveInFile(text);
                int amount = toys.getToyList().get(prize).getAmount();
                toys.getToyList().get(prize).setAmount(amount - 1);
            } else {
                System.out.println("Вы проиграли, попробуйте cнова");
                
            }

        }

        else {
            System.out.println("Жаль, ждём Вас снова. До свидания!");
        }
    }
    
}
