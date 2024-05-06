import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeNumberMethodTest {
	
	PrimeNumberMethod primeNumberMethod;

	@BeforeEach
	void setUp() throws Exception {
		primeNumberMethod = new PrimeNumberMethod();
	}

	@AfterEach
	void tearDown() throws Exception {
		primeNumberMethod = null;
	}

	@Test
	void testIsPrime() {   
	// test prime
	assertTrue(primeNumberMethod.isPrime(2));
    assertTrue(primeNumberMethod.isPrime(3));
    assertTrue(primeNumberMethod.isPrime(5));
    assertTrue(primeNumberMethod.isPrime(7));
    assertTrue(primeNumberMethod.isPrime(11));
    assertTrue(primeNumberMethod.isPrime(13));
    assertTrue(primeNumberMethod.isPrime(17));
    assertTrue(primeNumberMethod.isPrime(19));
    assertTrue(primeNumberMethod.isPrime(23));
    
    assertFalse(primeNumberMethod.isPrime(4));
    assertFalse(primeNumberMethod.isPrime(6));
    assertFalse(primeNumberMethod.isPrime(8));
    assertFalse(primeNumberMethod.isPrime(9));
    assertFalse(primeNumberMethod.isPrime(10));
    assertFalse(primeNumberMethod.isPrime(15));
    assertFalse(primeNumberMethod.isPrime(21));
    assertFalse(primeNumberMethod.isPrime(25));
    
 // Test composite numbers
  
    assertFalse(primeNumberMethod.isPrime(4));  
    assertFalse(primeNumberMethod.isPrime(6));  
    assertFalse(primeNumberMethod.isPrime(8));  
    assertFalse(primeNumberMethod.isPrime(9));  
    assertFalse(primeNumberMethod.isPrime(10)); 
    assertFalse(primeNumberMethod.isPrime(15)); 
    assertFalse(primeNumberMethod.isPrime(21)); 
    assertFalse(primeNumberMethod.isPrime(25)); 
    
    
    // Test zero
    assertTrue(primeNumberMethod.isPrime(0)); 
	}

}
