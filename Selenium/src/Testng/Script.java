package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script {
  @Test(enabled=true)
  public void f1() {
	  Reporter.log("1",true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("2",true);
  }
}

