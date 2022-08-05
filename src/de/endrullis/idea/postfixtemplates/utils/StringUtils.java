package de.endrullis.idea.postfixtemplates.utils;

import lombok.experimental.UtilityClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String utilities.
 *
 * @author Stefan Endrullis &lt;stefan@endrullis.de&gt;
 */
@UtilityClass
public class StringUtils {

	public static String replace(String input, String from, String to) {
		return input.replaceAll(Pattern.quote(from), Matcher.quoteReplacement(to));
	}

}
