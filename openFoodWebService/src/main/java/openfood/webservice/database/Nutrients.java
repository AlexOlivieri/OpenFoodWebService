package openfood.webservice.database;

/*
 * Décaillet Benjamin nutrients informations
 * 11.05.2016 
 */

public class Nutrients {
	
	String name;
	String unit;
	int per_hundred;
	int per_portion;
	int per_day;
	String id;
	Boolean disp=true;
	
	public Nutrients(){
		
	}
	
	public Nutrients(String id){
		this.id=id;
	}
	
//	public Nutrients(String name, String unit, int per_day, int per_hundred, int per_portion){
//		this.name = name;
//		this.unit = unit;
//		this.per_day = per_day;
//		this.per_hundred = per_hundred;
//		this.per_portion = per_portion;
//	}


	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return name + ", "+"unité \""+unit+"\", per hundred: "+per_hundred+
			", per portion: "+per_portion+", per day: "+per_day;
	}
	
//	public Boolean getDisp() {
//		return disp;
//	}
//	public void setDisp(Boolean disp) {
//		this.disp = disp;
//	}
//	public String getid() {
//		return id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getPer_hundred() {
		return per_hundred;
	}
	public void setPer_hundred(int per_hundred) {
		this.per_hundred = per_hundred;
	}
	public int getPer_portion() {
		return per_portion;
	}
	public void setPer_portion(int per_portion) {
		this.per_portion = per_portion;
	}
	public int getPer_day() {
		return per_day;
	}
	public void setPer_day(int per_day) {
		this.per_day = per_day;
	}
}
