package openfood.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//import openfood.webservice.database.dataTreatment;

@SpringBootApplication
public class Application {

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
		System.out.println("Hello Spring");
	}
}
