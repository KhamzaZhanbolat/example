package com.springboot.lecture;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = "/index")
    public String indexPage(Model model){

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1l,"Mac Book Pro", "8 GB RAM 255 GB SSD Intel Core i7", 1199.99));
        items.add(new Item(2l,"Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
        items.add(new Item(3l,"Mac Book Pro", "16 GB RAM 1 TB SSD Apple M1", 1799.99));
        items.add(new Item(4l,"ASUS Tuf Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        items.add(new Item(5l,"HP Laser Pro", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
        items.add(new Item(6l,"Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));

        model.addAttribute("goods",items);

        return "index";

    }
}
