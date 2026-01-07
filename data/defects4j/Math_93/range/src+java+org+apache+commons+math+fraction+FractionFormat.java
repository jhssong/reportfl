{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/fraction/FractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FractionFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 391,
      "comment": "\n * Formats a Fraction number in proper format or improper format.  The number\n * format for each of the whole number, numerator and, denominator can be\n * configured.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorFormat"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The format used for the denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorFormat"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The format used for the numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.  \n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 73,
      "end_line": 79,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.formatFraction(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * This static method calls formatFraction() on a default instance of\n     * FractionFormat.\n     *\n     * @param f Fraction object to format\n     * @return A formatted fraction in proper form.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getAvailableLocales()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set. \n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance(java.util.Locale)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 56)",
        "(line 116,col 9)-(line 116,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance(java.util.Locale)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 56)",
        "(line 134,col 9)-(line 134,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 0.  \n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 154,
      "end_line": 159,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 0.  \n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 65)",
        "(line 156,col 9)-(line 156,col 39)",
        "(line 157,col 9)-(line 157,col 37)",
        "(line 158,col 9)-(line 158,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(org.apache.commons.math.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 171,
      "end_line": 183,
      "comment": "\n     * Formats a {@link Fraction} object to produce a string.  The fraction is\n     * output in improper format.\n     *\n     * @param fraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 29)",
        "(line 175,col 9)-(line 175,col 27)",
        "(line 177,col 9)-(line 177,col 78)",
        "(line 178,col 9)-(line 178,col 33)",
        "(line 179,col 9)-(line 180,col 17)",
        "(line 182,col 9)-(line 182,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 198,
      "end_line": 219,
      "comment": "\n     * Formats a object to produce a string.  \u003ccode\u003eobj\u003c/code\u003e must be either a \n     * {@link Fraction} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 32)",
        "(line 203,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDenominatorFormat()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Access the denominator format.\n     * @return the denominator format.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getNumeratorFormat()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Access the numerator format.\n     * @return the numerator format.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String)",
      "begin_line": 244,
      "end_line": 253,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.\n     * @param source the string to parse\n     * @return the parsed {@link Fraction} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 59)",
        "(line 246,col 9)-(line 246,col 55)",
        "(line 247,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 262,
      "end_line": 312,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.  This method\n     * expects the string to be formatted as an improper fraction.  \n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Fraction} object.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 42)",
        "(line 266,col 9)-(line 266,col 46)",
        "(line 269,col 9)-(line 269,col 61)",
        "(line 270,col 9)-(line 276,col 9)",
        "(line 279,col 9)-(line 279,col 40)",
        "(line 280,col 9)-(line 280,col 49)",
        "(line 281,col 9)-(line 296,col 9)",
        "(line 299,col 9)-(line 299,col 46)",
        "(line 302,col 9)-(line 302,col 63)",
        "(line 303,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.setDenominatorFormat(java.text.NumberFormat)",
      "begin_line": 331,
      "end_line": 337,
      "comment": "\n     * Modify the denominator format.\n     * @param format the new denominator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.setNumeratorFormat(java.text.NumberFormat)",
      "begin_line": 345,
      "end_line": 351,
      "comment": "\n     * Modify the numerator format.\n     * @param format the new numerator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 359,
      "end_line": 364,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 40)",
        "(line 363,col 9)-(line 363,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 372,
      "end_line": 390,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 373,col 10)-(line 373,col 36)",
        "(line 374,col 10)-(line 374,col 33)",
        "(line 375,col 10)-(line 375,col 22)",
        "(line 377,col 10)-(line 387,col 10)",
        "(line 389,col 10)-(line 389,col 20)"
      ]
    }
  ]
}