//@author Kosei Matsuda & Kevin Nguyen
import org.junit.*;
import static org.junit.Assert.*;
public class conversionTest {
  public static void main (String args[])
  {
	  org.junit.runner.JUnitCore.main("conversionTester");
  }

  //These tests if the conversion formulas of each is correct
  @Test public void testF2C()
  {
	  assertEquals("Fahrenheit to Celcius: ",  37.7778f, conversion.convertF2C("100"), .10);
  } //The "expected", or second value of assertEquals method display observability, and the conversion methods used display controllability
  @Test public void testC2F()
  {
	  assertEquals("Celcius to Fahrenheit ",  212f, conversion.convertC2F("100"), .10);
  }
  @Test public void testIn2C()
  {
	  assertEquals("Inches to Centimeters",  254f, conversion.convertIn2Cm("100"), .10);
  }
  @Test public void testC2In()
  {
	  assertEquals("Centimeters to Inches ",  39.37f, conversion.convertCm2In("100"), .10);
  }
  @Test public void testF2M()
  {
	  assertEquals("Feet to Meters ",  30.48f, conversion.convertF2M("100"), .10);
  }
  @Test public void testM2F()
  {
	  assertEquals("Meters to Feet ",  328.084f, conversion.convertM2F("100"), .10);
  }
  @Test public void testM2K()
  {
	  assertEquals("Miles to Kilometers ",  160.9f, conversion.convertM2K("100"), .10);
  }
  @Test public void testK2M()
  {
	  assertEquals("Kilometers to Miles ",  62.14f, conversion.convertK2M("100"), .10);
  }
  @Test public void testG2L()
  {
	  assertEquals("Gallons to Liters ",  378.5f, conversion.convertG2L("100"), .10);
  }
  @Test public void testL2G()
  {
	  assertEquals("Liters to Gallons ",  26.42f, conversion.convertL2G("100"), .10);
  }
  @Test public void testOz2G(){
	  assertEquals("Ounces to Grams ",  2834.95f, conversion.convertOz2G("100"), .10);
  }
  @Test public void testG2Oz()
  {
	  assertEquals("Gram to Ounces ",  3.5274f, conversion.convertG2Oz("100"), .10);
  }
  @Test public void testLb2K()
  {
	  assertEquals("Pound to Kilograms",  45.3592f, conversion.convertLb2K("100"), .10);
  }
  @Test public void testK2Lb()
  {
	  assertEquals("Kilograms to Pound",  220.462f, conversion.convertK2Lb("100"), .10);
  }
  @Test public void testMph2Kph()
  {
	  assertEquals("Mph to Kph",  160.934f, conversion.convertMph2Kph("100"), .10);
  }
  @Test public void testKph2Mph()
  {
	  assertEquals("Kph to Mph",  62.1371f, conversion.convertKph2Mph("100"), .10);
  }


  //Test if decimalPlace will output is expected if the input is 4
  @Test public void DecimalPlace()
  {
	  assertEquals("Testing decimal place", "%.4f", conversion.decimalPlace());
  } //conversion.decimalPlace() shows difficult controllability,as scan.next() is hard to automate the %.4f show observability

  //Test if input for conversion is not a number
  @Test public void invalidStringTest()
  {
	  assertEquals("Testing proper string usage", null, conversion.convertF2C("HelloWorld"));
  }  //Controllability of inputting in values

  //Test for proper print menu
  @Test public void  testPrintMenu()
  {
	  assertEquals("Test print menu if input is 1.", "1", conversion.printMenu());
  }  //conversion.printMenu() shows difficult controllability, as scan.next() is hard to automate

}