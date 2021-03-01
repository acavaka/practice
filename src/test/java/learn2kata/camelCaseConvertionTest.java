package learn2kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class camelCaseConvertionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", camelCaseConvertion.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", camelCaseConvertion.toCamelCase(input));
    }

    @Test
    public void testAllLowerCase() {
        String input = "the-stealth-warrior-goes-lower";
        System.out.println("input: " + input);
        assertEquals("theStealthWarriorGoesLower", camelCaseConvertion.toCamelCase(input));
    }

    @Test
    public void testSomeLowerCase() {
        String input = "the-stealth-Warrior-says-Hi";
        System.out.println("input: " + input);
        assertEquals("theStealthWarriorSaysHi", camelCaseConvertion.toCamelCase(input));
    }

    @Test
    public void testEmptyString() {
        String input = "";
        System.out.println("input: " + input);
        assertEquals("", camelCaseConvertion.toCamelCase(input));
    }

    @Test
    public void testSpecialCharacter() {
        String input = "the*stealth&Warrior-Is_Special";
        System.out.println("input: " + input);
        assertEquals("theStealthWarriorIsSpecial", camelCaseConvertion.toCamelCase(input));
    }
}