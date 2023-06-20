import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipaleTest {

	@Test
	public void testAjouter() {
		Principale testIntro = new Principale();
		int somme = testIntro.ajouter(2, 3);
		assertEquals(5, somme);
	}

}
