package com.pannonia.execise.array;

public class ArraySum {

  public Integer sum(Integer[] array) {
    Integer sum = 0;
    if (array == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    for (Integer i : array) {
      if (i == null) {
        throw new IllegalArgumentException("Invalid input. Array element cannot be null");
      }
      Integer sumTmp = sum;
      sum += i;
      if (sum < sumTmp) {
        throw new IllegalArgumentException("Invalid input. Sum of array elements can't be bigger than MAX integer value.");
      }
    }
    return sum;

  }
}