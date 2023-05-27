import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void compareToTest() {
		String str = "hello";
		assertEquals(0, str.compareTo("hello"));
		assertEquals(-3, str.compareTo("helo"));
		assertEquals(-1, str.compareTo("helloo"));
	}

	@Test
	void compareToIgnoreCaseTest() {
		String str = "hello";
		assertEquals(0, str.compareToIgnoreCase("HeLlO"));
		assertEquals(-3, str.compareToIgnoreCase("Helo"));
		assertEquals(-1, str.compareToIgnoreCase("Helloo"));

	}

	@Test
	void concatTest() {
		String str1 = "hello1";
		String str2 = "hello2";
		String str3 = "hello1hello2;";
		assertTrue(str3.contains(str1.concat(str2)));
		assertEquals("hello1hello2", str1.concat(str2));

	}

	@Test
	void startsWithTest() {
		String str = "hello";
		assertTrue(str.startsWith("h"));
		assertTrue(str.startsWith("he"));
		assertFalse(str.startsWith("H"));
	}

	@Test
	void endsWithTest() {
		String str = "hello";
		assertTrue(str.endsWith("o"));
		assertTrue(str.endsWith("lo"));
		assertFalse(str.endsWith("H"));
	}

	@Test
	void equalsIgnoreCaseTest() {
		String str = "hello";
		assertTrue(str.equalsIgnoreCase("HELLO"));
		assertTrue(str.equalsIgnoreCase("hello"));
		assertFalse(str.equalsIgnoreCase("hella"));
		assertEquals(true, str.equalsIgnoreCase("hello"));

	}

	@Test
	void indexOfTest() {
		String str = "hello";
		assertEquals(4, str.indexOf("o"));
		assertTrue(4 == (str.indexOf("o")));
		assertTrue(4 != (str.indexOf("t")));
		assertFalse(4 == (str.indexOf("t")));
	}

	@Test
	void lastIndexOfTest() {
		String str = "hello";
		assertEquals(3, str.lastIndexOf("l"));
		assertTrue(3 == str.lastIndexOf("l"));
		assertFalse(3 != str.lastIndexOf("l"));
	}
}
