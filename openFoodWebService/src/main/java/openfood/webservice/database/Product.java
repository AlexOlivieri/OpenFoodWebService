package openfood.webservice.database;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	 @Id
	 private String id;
	 private String name;
	 private String ingr;
	 private int quantity;
	 private String unit;
	 private int portion_quantity;
	 private String portion_unit;
//	 private ArrayList<Nutrients> nutrients;
//	 private JSONObject nutrients;
	 private Map<String, Nutrients> nutrients;
	 
//	 @Override
//	public String toString() {
//		return "name prdct "+name+" and various elements";
//	}
	 
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIngr() {
		return ingr;
	}
	public void setIngr(String ingrTrsl) {
		this.ingr = ingrTrsl;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getPortion_quantity() {
		return portion_quantity;
	}
	public void setPortion_quantity(int portionQuantity) {
		this.portion_quantity = portionQuantity;
	}
	public String getPortion_unit() {
		return portion_unit;
	}
	public void setPortion_unit(String portionUnit) {
		this.portion_unit = portionUnit;
	} 
	
	//TODO : the nutriment is an object that contains objects such as salt, proteins etc, if you map it in an ArrayList it will give a problem
//	public ArrayList<Nutrients> getNutrients() {
//		
//		return nutrients;
//	}
	
	
	public Map<String, Nutrients> getNutrients(){
		System.out.println(nutrients);
//		try {
//			System.out.println(nutrients.getJSONObject("nutrients").getString("name"));
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return nutrients;
	}
	
//	public void setNutrients(ArrayList<Nutrients> nutr) {
//		this.nutrients = nutr;
//	}
	
	public void setNutrients(Map<String, Nutrients> nutr) {
		this.nutrients = nutr;
	}
	
}
