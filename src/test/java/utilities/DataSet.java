package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	@DataProvider(name = "invalidCredentials")
	public static Object dataset() {
		Object[][] objects = {{"0177226427", "155555", "Please enter a valid phone number."},
				{"01772264280", "155555", "Please enter a valid phone number."}};
		
		return objects;
	}

}
