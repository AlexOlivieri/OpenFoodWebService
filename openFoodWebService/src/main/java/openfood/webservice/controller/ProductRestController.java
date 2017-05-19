package openfood.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import openfood.webservice.database.FoodRepository;
import openfood.webservice.database.Product;

@RestController
@RequestMapping("/products")
public class ProductRestController {

	@Autowired
	private FoodRepository repo;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String getHello() {
		return "Hello";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Product> getAll() {
		return repo.findAll();
	}
	

	  @RequestMapping(method=RequestMethod.POST)
	  public Product create(@RequestBody Product prdct) {
		  System.out.println(prdct.getName());
		  System.out.println(prdct.getIngr());
		  System.out.println(prdct.getQuantity());
		  System.out.println(prdct.getUnit());
		  System.out.println(prdct.getPortion_unit());
		  System.out.println(prdct.getNutrients());
		  System.out.println(prdct.getId());
		  return repo.save(prdct);
	  }
	  
	  @RequestMapping(method=RequestMethod.DELETE, value="{id}")
	  public void delete(@PathVariable String id) {
		  repo.delete(id);
	  }
	  
	  @RequestMapping(method=RequestMethod.PUT, value="{id}")
	  public Product update(@PathVariable String id, @RequestBody Product prdct) {
		  Product update = repo.findOne(id);
		    update.setName(prdct.getName());
		    update.setIngr(prdct.getIngr());
		    update.setPortion_quantity(prdct.getPortion_quantity());
		    update.setPortion_unit(prdct.getPortion_unit());
		    update.setQuantity(prdct.getQuantity());
		    update.setUnit(prdct.getUnit());
		    update.setNutrients(prdct.getNutrients());
		    return repo.save(update);
	  }
	  
	  @RequestMapping(value = "/deleteAll", method=RequestMethod.GET)
	  public String deleteAll() {
		  return "Hello";
	  }
}
