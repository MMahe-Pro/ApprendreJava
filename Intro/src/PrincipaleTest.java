// Import of junit, and of the assertions for testing
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrincipaleTest {
	
    // Method to test method Ajouter() with junit	
	@Test
	public void testAjouter() {
		Principale testIntro = new Principale();
		int somme = testIntro.ajouter(2, 3);
		assertEquals(5, somme);
	}

}
