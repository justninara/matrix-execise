package com.pannonia.execise.array;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.Assertions.shouldHaveThrown;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ArraySumTest {

  private ArraySum arraySum;

  @BeforeEach
  public void beforeEach() {
    // mock dependent components if needed
    // and initialize components here
    arraySum = new ArraySum();
  }

  @Test
  public void testSumIllegalArgumentException1() {

    // GIVEN
    Integer[] numbers =  new Integer[] { 1, 2, null, 4, 5 };

    // WHEN
    Throwable ex = catchThrowable(() -> arraySum.sum(numbers));

    // THEN
    assertThat(ex)//
        .isInstanceOf(IllegalArgumentException.class)//
        .hasMessage("Invalid input. Array element cannot be null");
  }

  /**
   * <b>GIVEN</b> array of integer values</br>
   * <b>WHEN</b> sum is calculated</br>
   * <b>THEN</b> sum value is as expected</br>
   */
  @Test
//  @Disabled // TODO remove @Disabled annotation in order to enable the test
  public void testSum() {

    // GIVEN
    Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5 };

    // WHEN
    Integer sum = arraySum.sum(numbers);

    // THEN
    assertThat(sum).isEqualTo(15);
  }

  @Test
  public void testSum1() {

    // GIVEN
    Integer[] numbers = new Integer[]{};

    // WHEN
    Integer sum = arraySum.sum(numbers);

    // THEN
    assertThat(sum).isEqualTo(0);
  }
  @Test
  public void testSumIllegalArgumentException() {

    // GIVEN
    Integer[] numbers = null;

    // WHEN
    Throwable ex = catchThrowable(() -> arraySum.sum(numbers));

    // THEN
    assertThat(ex)//
     .isInstanceOf(IllegalArgumentException.class)//
    .hasMessage("Array cannot be null");
  }

  @Test
  public void testSumElementIllegalArgumentException() {

    // GIVEN
    Integer[] numbers =  new Integer[] { 1, null, 3, 4, 5 };

    // WHEN
    Throwable ex = catchThrowable(() -> arraySum.sum(numbers));

    // THEN
    assertThat(ex)//
        .isInstanceOf(IllegalArgumentException.class)//
        .hasMessage("Invalid input. Array element cannot be null");
  }

  @Test
  public void testSumMaxValue() {

    // GIVEN
    Integer[] numbers =  new Integer[] {Integer.MAX_VALUE, 1, 3, 4, 5 };

    // WHEN
    Throwable ex = catchThrowable(() -> arraySum.sum(numbers));

    // THEN
    assertThat(ex)//
        .isInstanceOf(IllegalArgumentException.class)//
        .hasMessage("Invalid input. Sum of array elements can't be bigger than MAX integer value.");
  }








  @AfterEach
  public void afterEach() {
    // release resources that are used by the tests
    // e.g. clear system properties if set or changed during the test
    System.clearProperty("property.used.in.the.test");
  }
}
