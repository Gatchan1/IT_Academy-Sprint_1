package n2exercici1;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matcher;
import org.hamcrest.FeatureMatcher;
import static org.hamcrest.Matchers.*;

class ExerciciTest {

	@Test
	void testLength() {
		String str = "Mordor";
		assertThat(str, length(equalTo(8)));
	}
	
	
	Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher,
	            "a String with length", "length") {
	    	
	        @Override
	        protected Integer featureValueOf(String str) {
	            return str.length();
	        }
	    };
	}
}
