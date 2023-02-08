package com.techreturners.roman_numerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RomanNumeralsTest {

  RomanNumerals romanNumerals;

  @BeforeAll
  public void setUp() {
    romanNumerals = new RomanNumerals();
  }

  @Test
  public void checkRomanNumeralsForNegatives() {

    int negativeNumber = -1;
    Exception exception = assertThrows(IllegalArgumentException.class, () -> romanNumerals.toRoman(negativeNumber));
    
    assertEquals("Please provide input value greater than zero", exception.getMessage());
  }

  @Test
  public void checkRomanNumeralsForOutOfRangeInputs() {

    int negativeNumber = 3001;
    Exception exception = assertThrows(IllegalArgumentException.class, () -> romanNumerals.toRoman(negativeNumber));
    
    assertEquals("Please provide input value less than 3000", exception.getMessage());
  }

  @ParameterizedTest
  @MethodSource("provideInputsForStandardNumerals")
  public void checkRomanForStandardNumerals(int decimalInput, String expected) {
    assertEquals(romanNumerals.toRoman(decimalInput), expected);
  }

  private static Stream<Arguments> provideInputsForStandardNumerals() {
    return Stream.of(
      Arguments.of(1, "I"),
      Arguments.of(5, "V"),
      Arguments.of(10, "X"),
      Arguments.of(50, "L"),
      Arguments.of(100, "C"),
      Arguments.of(500, "D"),
      Arguments.of(1000, "M"));
  }

  @ParameterizedTest
  @MethodSource("provideNonStandardSingleInput")
  public void checkRomanForNonStandardSingleInput(int decimalInput, String expected) {
    assertEquals(romanNumerals.toRoman(decimalInput), expected);
  }

  private static Stream<Arguments> provideNonStandardSingleInput() {
    return Stream.of(
      Arguments.of(2, "II"),
      Arguments.of(3, "III"),
      Arguments.of(4, "IV"),
      Arguments.of(9, "IX"));
  }
  
}
