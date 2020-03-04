//Names : Kevin Nguyen and Kosei Matsuda
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Scanner;
public class TddTest {
	
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

    float testVal;
    @Test
    public void testmpg2kpl()
    {
        testVal = 50f;
        float converted = testVal*.425144f; //verifying the correct value of 50 converted to kpl
        assertEquals("Converting Miles Per Gallon to Kilometers per liter", converted, conversion.convertMpg2Kpl("50"), .10);
    }
    @Test
    public void testNegMpg2Kpl()
    {
        testVal = -50f;
        float converted = testVal*.425144f;
        assertEquals("Converting a negative value from Miles Per Gallon to Kilometers per liter", converted, conversion.convertMpg2Kpl("-50"), .10);
    }
    @Test
    public void testZeroMpg2Kpl()
    {
        testVal = 0;
        assertEquals("Converting a zero value from miles per gallon to Kilometers per liter", testVal, conversion.convertMpg2Kpl("0"), .10);
    }
    @Test
    public void testkpl2mpg()
    {
        testVal= 50f;
        float converted =testVal*2.35215f;
        assertEquals("Converting Kilometers per Liter to Miles per Gallon", converted, conversion.convertKpl2Mpg("50"), .10);
    }
    @Test
    public void testNegKpl2Mpg()
    {
        testVal = -50f;
        float converted = testVal*2.35215f;
        assertEquals("Converting a negative value from Miles Per Gallon to Kilometers per liter", converted, conversion.convertKpl2Mpg("-50"), .10);
    }
    @Test
    public void testZeroKpl2Mpg()
    {
        testVal = 0;
        assertEquals("Converting a zero value from miles per gallon to Kilometers per liter", testVal, conversion.convertKpl2Mpg("0"), .10);
    }
}
