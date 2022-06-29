package com.qa.morsecodetranslator.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MorseTranslatorTest {
	private static MorseTranslator translator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		translator = new MorseTranslator();
	}

	@Test
	void test() {
		String input = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";
		String expected = "hello world";
		assertEquals(expected, translator.translate(input));
	}

}
