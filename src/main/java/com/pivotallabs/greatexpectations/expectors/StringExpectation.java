package com.pivotallabs.greatexpectations.expectors;

import com.pivotallabs.greatexpectations.ExpectationOn;
import org.junit.ComparisonFailure;

@ExpectationOn(String.class)
public class StringExpectation<T extends String, M extends StringExpectation<T, M>> extends ObjectExpectation<T, M> {
  public void toContain(String expected) {
//        match(Matchers.containsString(expected));
  }

  public boolean toEqual(String expected) {
    if (!GreatExpectations.equalsSafely(expected, actual) && !inverted) {
      GreatExpectations.lastExpectTrace = null;
      throw new ComparisonFailure("Expected strings to be equal to each other", expected, actual); // Shows friendly diff
    }
    return actual.equals(expected);
  }
}