package ch.bfh.swos.bookapp.controller;

import ch.bfh.swos.bookapp.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class StockController {

    @Autowired
    private StockService storeService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<String> listProducts(){
        return storeService.listProducts();
    }

    @RequestMapping(value = "{position}", method = RequestMethod.GET)
    public @ResponseBody String getProduct(@PathVariable int position){
        return storeService.getProduct(position);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String addProduct(@RequestBody String todo){
        return storeService.addProduct(todo);
    }

    @RequestMapping(value = "{position}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteProduct(@PathVariable int position){
        storeService.deleteProduct(position);
    }

    @RequestMapping(value = "{position}", method = RequestMethod.PUT)
    public @ResponseBody void updateProduct(@PathVariable int position, @RequestBody String todo){
        storeService.updateProduct(position, todo);
    }
}
