import org.testng.Assert;

import org.testng.annotations.Test;



public class NewTest2 {

	int a=10,b=20,c;

  @Test(priority=1)

  public void add() {

	  c=a+b;

	  Assert.assertEquals(c, 30);

  }

  @Test(priority=2)

  public void sub() {

	  c=b-a;

	  Assert.assertEquals(c, 10);

  }

  @Test(priority=3)

  public void multiply() {

	  c=a*b;

	  Assert.assertEquals(c, 200);

  }

  @Test(priority=4)

  public void div() {

	  c=b/a;

	  Assert.assertEquals(c, 2);

  }

}