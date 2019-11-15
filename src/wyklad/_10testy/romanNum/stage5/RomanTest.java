package wyklad._10testy.romanNum.stage5;

import org.junit.Test;
import wyklad._10testy.romanNum.InvalidRomanNumeralException;
import wyklad._10testy.romanNum.OutOfRangeException;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class RomanTest {

	private static final Map<Integer, String> KNOWN_VAL = createMap();

	private static Map<Integer, String> createMap() {
		Map<Integer, String> result = new HashMap<Integer, String>();
		result.put(1, "I");
		result.put(2, "II");
		result.put(3, "III");
		result.put(4, "IV");
		result.put(5, "V");
		result.put(6, "VI");
		result.put(7, "VII");
		result.put(8, "VIII");
		result.put(9, "IX");
		result.put(10, "X");
		result.put(50, "L");
		result.put(100, "C");
		result.put(500, "D");
		result.put(1000, "M");
		result.put(31, "XXXI");
		result.put(148, "CXLVIII");
		result.put(294, "CCXCIV");
		result.put(312, "CCCXII");
		result.put(421, "CDXXI");
		result.put(528, "DXXVIII");
		result.put(621, "DCXXI");
		result.put(782, "DCCLXXXII");
		result.put(870, "DCCCLXX");
		result.put(941, "CMXLI");
		result.put(1043, "MXLIII");
		result.put(1110, "MCX");
		result.put(1226, "MCCXXVI");
		result.put(1301, "MCCCI");
		result.put(1485, "MCDLXXXV");
		result.put(1509, "MDIX");
		result.put(1607, "MDCVII");
		result.put(1754, "MDCCLIV");
		result.put(1832, "MDCCCXXXII");
		result.put(1993, "MCMXCIII");
		result.put(2074, "MMLXXIV");
		result.put(2152, "MMCLII");
		result.put(2212, "MMCCXII");
		result.put(2343, "MMCCCXLIII");
		result.put(2499, "MMCDXCIX");
		result.put(2574, "MMDLXXIV");
		result.put(2646, "MMDCXLVI");
		result.put(2723, "MMDCCXXIII");
		result.put(2892, "MMDCCCXCII");
		result.put(2975, "MMCMLXXV");
		result.put(3051, "MMMLI");
		result.put(3185, "MMMCLXXXV");
		result.put(3250, "MMMCCL");
		result.put(3313, "MMMCCCXIII");
		result.put(3408, "MMMCDVIII");
		result.put(3501, "MMMDI");
		result.put(3610, "MMMDCX");
		result.put(3743, "MMMDCCXLIII");
		result.put(3844, "MMMDCCCXLIV");
		result.put(3888, "MMMDCCCLXXXVIII");
		result.put(3940, "MMMCMXL");
		result.put(3999, "MMMCMXCIX");
		return Collections.unmodifiableMap(result);
	}

	// toRoman should give known result with known input
	@Test
	public void testToRomanKnownValues() {
		for (Map.Entry<Integer, String> pair : KNOWN_VAL.entrySet())
			try {
				assertEquals("ToRoman: ", pair.getValue(),
						Roman.toRoman(pair.getKey()));
			} catch (Exception e) {
			}
	}

	// fromRoman should give known result with known input
	@Test
	public void testFromRomanKnownValues() {
		for (Map.Entry<Integer, String> pair : KNOWN_VAL.entrySet())
			try {
				assertEquals("FromRoman: ", pair.getKey(),
						Roman.fromRoman(pair.getValue()));
			} catch (Exception e) {
			}
	}

	// toRoman should fail with large input
	@Test(expected = OutOfRangeException.class)
	public void testToRomanBadInputTooLarge() throws Exception {
		Roman.toRoman(4000);
	}

	// toRoman should fail with 0 input
	@Test(expected = OutOfRangeException.class)
	public void testToRomanBadInputZero() throws Exception {
		Roman.toRoman(0);
	}

	// toRoman should fail with negative input
	@Test(expected = OutOfRangeException.class)
	public void testToRomanNegative() throws Exception {
		Roman.toRoman(-1);
	}

	// fromRoman should fail with too many repeated numerals
	@Test(expected = OutOfRangeException.class)
	public void testFromRomanBadInputTooManyRepeatedNumerals() throws Exception {
		List<String> romanList = Arrays.asList("MMMM", "DD", "CCCC", "LL",
				"XXXX", "VV", "IIII");
		for (String s : romanList)
			Roman.fromRoman(s);
	}

	// fromRoman should fail with repeated pairs of numerals
	@Test(expected = InvalidRomanNumeralException.class)
	public void testFromRomanBadInputRepeatedPairs() throws Exception {
		List<String> romanList = Arrays.asList("CMCM", "CDCD", "XCXC", "XLXL",
				"IXIX", "IVIV");
		for (String s : romanList)
			Roman.fromRoman(s);
	}

	// fromRoman should fail with malformed antecedents
	@Test(expected = InvalidRomanNumeralException.class)
	public void testFromRomanBadInputMalformedAntecedent() throws Exception {
		List<String> romanList = Arrays.asList("IIMXCC", "VX", "DCM", "CMM",
				"IXIV", "MCMC", "XCX", "IVI", "LM", "LD", "LC");
		for (String s : romanList)
			Roman.fromRoman(s);
	}

	// fromRoman(toRoman(n))==n for all n
	@Test
	public void testSanityCheck() {
		String numeral;
		for (int i = 1; i < 4000; i++) {
			try {
				numeral = Roman.toRoman(i);
				assertEquals("SanityCheck: ", new Integer(i),
						Roman.fromRoman(numeral));
			} catch (Exception e) {
			}
		}
	}

	// toRoman should always return uppercase
	@Test
	public void testToRomanCase() {
		String numeral;
		for (int i = 1; i < 4000; i++) {
			try {
				numeral = Roman.toRoman(i);
				assertEquals("ToRomanCase: ", numeral, numeral.toUpperCase());
			} catch (Exception e) {
			}
		}
	}

	// fromRoman should only accept uppercase input
	@Test(expected = InvalidRomanNumeralException.class)
	public void testFromRomanCase() throws Exception {
		String numeral;
		for (int i = 1; i < 4000; i++) {
			numeral = Roman.toRoman(i);
			Roman.fromRoman(numeral.toLowerCase());
		}
	}
}
