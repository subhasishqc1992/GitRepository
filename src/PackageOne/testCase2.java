package PackageOne;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testCase2 {
	

  @Test()
  public void day3() {
	  System.out.println("Day 3");
  }
  @Test()
  public void day4() {
	  System.out.println("Day 4");
	  Assert.assertTrue(false);
  }
  @Test()
  public void week5() {
	  System.out.println("week5");
  }
  @Test()
  public void week6() {
	  System.out.println("week6");
  }
}
