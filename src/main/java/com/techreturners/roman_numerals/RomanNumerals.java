package com.techreturners.roman_numerals;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

  private final Map<Integer, String> Roman_Numeral_Mapping;

  public RomanNumerals() {
    Roman_Numeral_Mapping = new LinkedHashMap<>();
    Roman_Numeral_Mapping.put(1000, "M");
    Roman_Numeral_Mapping.put(900, "CM");
    Roman_Numeral_Mapping.put(500, "D");
    Roman_Numeral_Mapping.put(400, "CD");
    Roman_Numeral_Mapping.put(100, "C");
    Roman_Numeral_Mapping.put(90, "XC");
    Roman_Numeral_Mapping.put(50, "L");
    Roman_Numeral_Mapping.put(40, "XL");
    Roman_Numeral_Mapping.put(10, "X");
    Roman_Numeral_Mapping.put(9, "IX");
    Roman_Numeral_Mapping.put(5, "V");
    Roman_Numeral_Mapping.put(4, "IV");
    Roman_Numeral_Mapping.put(1, "I");
  }

  
  public String toRoman(int decimalInput) {

    isValidInput(decimalInput);

    StringBuilder sb = new StringBuilder();

    for (int key : Roman_Numeral_Mapping.keySet()) {

      if (decimalInput <= 0)
        break;

      while (key <= decimalInput) {
        decimalInput -= key;
        sb.append(Roman_Numeral_Mapping.get(key));
      }
    }

    return sb.toString();
  }

  private void isValidInput(int decimalInput) throws IllegalArgumentException {

    if (decimalInput <= 0 || decimalInput > 3000) {
      String message = (decimalInput <= 0) ? "Please provide input value greater than zero"
          : "Please provide input value less than 3000";

      throw new IllegalArgumentException(message);
    }

  }

}
