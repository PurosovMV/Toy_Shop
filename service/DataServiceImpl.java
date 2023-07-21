package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;



public class DataServiceImpl implements DataService {

    @Override
    public void saveInFile(String text) {
        try (FileWriter writer = new FileWriter("winningToys.txt", true)) {
            
            writer.write("You won the " + text + ".\n");
            writer.close();
        } catch (Exception ex) {
            System.out.println("Ошибка записи файла");
        }
    }

    @Override
    public void readFile() {
        try {
            FileReader fr = new FileReader("winningToys.txt");
            try (BufferedReader reader = new BufferedReader(fr)) {
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            }

        } catch (Exception ex) {
            System.out.println("Ошибка чтения файла");
        }
    }

}
