{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/fraction/FractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FractionFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 388,
      "comment": "\r\n * Formats a Fraction number in proper format or improper format.  The number\r\n * format for each of the whole number, numerator and, denominator can be\r\n * configured.\r\n *\r\n * @since 1.1\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorFormat"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The format used for the denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorFormat"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The format used for the numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\r\n     * Create an improper formatting instance with the default number format\r\n     * for the numerator and denominator.  \r\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\r\n     * Create an improper formatting instance with a custom number format for\r\n     * both the numerator and denominator.\r\n     * @param format the custom format for both the numerator and denominator.\r\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\r\n     * Create an improper formatting instance with a custom number format for\r\n     * the numerator and a custom number format for the denominator.\r\n     * @param numeratorFormat the custom format for the numerator.\r\n     * @param denominatorFormat the custom format for the denominator.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)",
        "(line 75,col 9)-(line 75,col 47)",
        "(line 76,col 9)-(line 76,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.formatFraction(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * This static method calls formatFraction() on a default instance of\r\n     * FractionFormat.\r\n     *\r\n     * @param f Fraction object to format\r\n     * @return A formatted fraction in proper form.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getAvailableLocales()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Get the set of locales for which complex formats are available.  This\r\n     * is the same set as the {@link NumberFormat} set. \r\n     * @return available complex format locales.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the default complex format for the current locale.\r\n     * @return the default complex format.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance(java.util.Locale)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\r\n     * Returns the default complex format for the given locale.\r\n     * @param locale the specific locale used by the format.\r\n     * @return the complex format specific to the given locale.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 56)",
        "(line 114,col 9)-(line 114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the default complex format for the current locale.\r\n     * @return the default complex format.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance(java.util.Locale)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\r\n     * Returns the default complex format for the given locale.\r\n     * @param locale the specific locale used by the format.\r\n     * @return the complex format specific to the given locale.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 56)",
        "(line 132,col 9)-(line 132,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Create a default number format.  The default number format is based on\r\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\r\n     * customizing is the maximum number of fraction digits, which is set to 0.  \r\n     * @return the default number format.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 152,
      "end_line": 157,
      "comment": "\r\n     * Create a default number format.  The default number format is based on\r\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\r\n     * customizing is the maximum number of fraction digits, which is set to 0.  \r\n     * @param locale the specific locale used by the format.\r\n     * @return the default number format specific to the given locale.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 65)",
        "(line 154,col 9)-(line 154,col 39)",
        "(line 155,col 9)-(line 155,col 37)",
        "(line 156,col 9)-(line 156,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(org.apache.commons.math.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 169,
      "end_line": 181,
      "comment": "\r\n     * Formats a {@link Fraction} object to produce a string.  The fraction is\r\n     * output in improper format.\r\n     *\r\n     * @param fraction the object to format.\r\n     * @param toAppendTo where the text is to be appended\r\n     * @param pos On input: an alignment field, if desired. On output: the\r\n     *            offsets of the alignment field\r\n     * @return the value passed in as toAppendTo.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 175,col 9)-(line 175,col 78)",
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 178,col 17)",
        "(line 180,col 9)-(line 180,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 196,
      "end_line": 217,
      "comment": "\r\n     * Formats a object to produce a string.  \u003ccode\u003eobj\u003c/code\u003e must be either a \r\n     * {@link Fraction} object or a {@link Number} object.  Any other type of\r\n     * object will result in an {@link IllegalArgumentException} being thrown.\r\n     *\r\n     * @param obj the object to format.\r\n     * @param toAppendTo where the text is to be appended\r\n     * @param pos On input: an alignment field, if desired. On output: the\r\n     *            offsets of the alignment field\r\n     * @return the value passed in as toAppendTo.\r\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\r\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 32)",
        "(line 201,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDenominatorFormat()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Access the denominator format.\r\n     * @return the denominator format.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getNumeratorFormat()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Access the numerator format.\r\n     * @return the numerator format.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String)",
      "begin_line": 242,
      "end_line": 250,
      "comment": "\r\n     * Parses a string to produce a {@link Fraction} object.\r\n     * @param source the string to parse\r\n     * @return the parsed {@link Fraction} object.\r\n     * @exception ParseException if the beginning of the specified string\r\n     *            cannot be parsed.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 59)",
        "(line 244,col 9)-(line 244,col 55)",
        "(line 245,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 259,
      "end_line": 309,
      "comment": "\r\n     * Parses a string to produce a {@link Fraction} object.  This method\r\n     * expects the string to be formatted as an improper fraction.  \r\n     * @param source the string to parse\r\n     * @param pos input/ouput parsing parameter.\r\n     * @return the parsed {@link Fraction} object.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 42)",
        "(line 263,col 9)-(line 263,col 46)",
        "(line 266,col 9)-(line 266,col 61)",
        "(line 267,col 9)-(line 273,col 9)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 277,col 49)",
        "(line 278,col 9)-(line 293,col 9)",
        "(line 296,col 9)-(line 296,col 46)",
        "(line 299,col 9)-(line 299,col 63)",
        "(line 300,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\r\n     * Parses a string to produce a object.\r\n     * @param source the string to parse\r\n     * @param pos input/ouput parsing parameter.\r\n     * @return the parsed object.\r\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.setDenominatorFormat(java.text.NumberFormat)",
      "begin_line": 328,
      "end_line": 334,
      "comment": "\r\n     * Modify the denominator format.\r\n     * @param format the new denominator format value.\r\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\r\n     *         \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.setNumeratorFormat(java.text.NumberFormat)",
      "begin_line": 342,
      "end_line": 348,
      "comment": "\r\n     * Modify the numerator format.\r\n     * @param format the new numerator format value.\r\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\r\n     *         \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 356,
      "end_line": 361,
      "comment": "\r\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\r\n     * @param source the string to parse\r\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\r\n     *        holds the index of the next non-whitespace character.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 40)",
        "(line 360,col 9)-(line 360,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 369,
      "end_line": 387,
      "comment": "\r\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\r\n     * @param source the string to parse\r\n     * @param pos input/ouput parsing parameter.\r\n     * @return the first non-whitespace character.\r\n     ",
      "child_ranges": [
        "(line 370,col 10)-(line 370,col 36)",
        "(line 371,col 10)-(line 371,col 33)",
        "(line 372,col 10)-(line 372,col 22)",
        "(line 374,col 10)-(line 384,col 10)",
        "(line 386,col 10)-(line 386,col 20)"
      ]
    }
  ]
}