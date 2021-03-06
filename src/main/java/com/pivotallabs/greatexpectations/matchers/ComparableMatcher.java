package com.pivotallabs.greatexpectations.matchers;

import com.pivotallabs.greatexpectations.MatcherOf;

@MatcherOf(Comparable.class)
public class ComparableMatcher<T extends Comparable, M extends ComparableMatcher<T, M>> extends ObjectMatcher<T, M> {
  public boolean toBeGreaterThan(T t) {
    return actual.compareTo(t) > 0;
  }

  public boolean toBeLessThan(T t) {
    return actual.compareTo(t) < 0;
  }
}
