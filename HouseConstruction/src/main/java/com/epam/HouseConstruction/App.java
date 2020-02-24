package com.epam.HouseConstruction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	int cost(String standard_of_material,int total_area,char automated) {
		
		if(standard_of_material=="standard"&&automated=='N') {
			LOGGER.info("If standard of material is 'standard' and anot automated house");
			return total_area*1200;
		}
		else if(standard_of_material=="above standard"&&automated=='N') {
			LOGGER.info("If standard of material is 'above standard' and not an automated house");
			return total_area*1500;
		}
		else if(standard_of_material=="high standard" && automated=='N') {
			LOGGER.info("If standard of material is 'high standard' and is not an automated house");
			return total_area*1800;
		}
		else {
			LOGGER.info("If standard of material is an automated house");
			return total_area*2500;
		}
			
	}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	App a=new App();
    	LOGGER.info(a.cost("above standard", 15, 'N'));
    	
    		
    }
}
