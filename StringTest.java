import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringTest {
	
	private String testString;

	@BeforeEach
	void setUp() throws Exception {
		testString = "Crunch time!";
	}

	@AfterEach
	void tearDown() throws Exception {
		testString = null;
	}

	@Test
	void testLength() {
		assertEquals(12, testString.length());
	}
	
	@Test
	void testCharAt() {
		assertEquals('C', testString.charAt(0));
		assertEquals('h', testString.charAt(5));
		assertEquals('!', testString.charAt(11));
		try
		{
			testString.charAt(13);
			fail("Expected IndexOutOfBoundsException was not thrown");
		} catch (IndexOutOfBoundsException e)
		{
			//Expected exception
		}
	}

	@Test
	void testSubstring() {
		assertEquals("Crunch", testString.substring(0,6));
		assertEquals("time!", testString.substring(7));
		try
		{
			testString.substring(0,13);
			fail("Expected IndexOutOfBoundsException was not thrown");
		} catch (IndexOutOfBoundsException e)
		{
			//Expected exception
		}
		
	}
	
	@Test
	void testIndex() {
		assertEquals(7, testString.indexOf("time"));
		assertEquals(-1, testString.indexOf("Unreal"));
	}
}
