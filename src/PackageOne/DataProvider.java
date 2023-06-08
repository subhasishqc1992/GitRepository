package PackageOne;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider = "DataSet")
	public void Data(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	@org.testng.annotations.DataProvider
   public Object DataSet() {
	   Object [][] PassData = new Object [3][2];
	   //1st Set
	   PassData [0][0]="First Username";
	   PassData [0][1]="First Password";
	   
	   //2nd Set
	   PassData[1][0]="Second Username";
	   PassData[1][1]="Second Password";
	   
	   //3rd Set
	   PassData[2][0]="Third Username";
	   PassData[2][1]="Third Password";
	   
	   return PassData;
   }
}
