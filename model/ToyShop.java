package model;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {
    static Integer idGenerator = 0;
    List<Toy> toyList;
    private Integer id;

    public ToyShop() {
        this.toyList = new ArrayList<>();
    }

    public static Integer getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(Integer idGenerator) {
        ToyShop.idGenerator = idGenerator;
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
