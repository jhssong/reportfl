{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/fraction/FractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FractionFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 389,
      "comment": "\n * Formats a Fraction number in proper format or improper format.  The number\n * format for each of the whole number, numerator and, denominator can be\n * configured.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorFormat"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The format used for the denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorFormat"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The format used for the numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.  \n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 47)",
        "(line 77,col 9)-(line 77,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.formatFraction(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * This static method calls formatFraction() on a default instance of\n     * FractionFormat.\n     *\n     * @param f Fraction object to format\n     * @return A formatted fraction in proper form.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getAvailableLocales()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set. \n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance(java.util.Locale)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 56)",
        "(line 115,col 9)-(line 115,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance(java.util.Locale)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 56)",
        "(line 133,col 9)-(line 133,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 0.  \n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 0.  \n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 65)",
        "(line 155,col 9)-(line 155,col 39)",
        "(line 156,col 9)-(line 156,col 37)",
        "(line 157,col 9)-(line 157,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(org.apache.commons.math.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 170,
      "end_line": 182,
      "comment": "\n     * Formats a {@link Fraction} object to produce a string.  The fraction is\n     * output in improper format.\n     *\n     * @param fraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 29)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 176,col 9)-(line 176,col 78)",
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 179,col 17)",
        "(line 181,col 9)-(line 181,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 197,
      "end_line": 218,
      "comment": "\n     * Formats a object to produce a string.  \u003ccode\u003eobj\u003c/code\u003e must be either a \n     * {@link Fraction} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 32)",
        "(line 202,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDenominatorFormat()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Access the denominator format.\n     * @return the denominator format.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getNumeratorFormat()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Access the numerator format.\n     * @return the numerator format.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String)",
      "begin_line": 243,
      "end_line": 251,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.\n     * @param source the string to parse\n     * @return the parsed {@link Fraction} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 59)",
        "(line 245,col 9)-(line 245,col 55)",
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 260,
      "end_line": 310,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.  This method\n     * expects the string to be formatted as an improper fraction.  \n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Fraction} object.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 42)",
        "(line 264,col 9)-(line 264,col 46)",
        "(line 267,col 9)-(line 267,col 61)",
        "(line 268,col 9)-(line 274,col 9)",
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 278,col 49)",
        "(line 279,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 297,col 46)",
        "(line 300,col 9)-(line 300,col 63)",
        "(line 301,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.setDenominatorFormat(java.text.NumberFormat)",
      "begin_line": 329,
      "end_line": 335,
      "comment": "\n     * Modify the denominator format.\n     * @param format the new denominator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.setNumeratorFormat(java.text.NumberFormat)",
      "begin_line": 343,
      "end_line": 349,
      "comment": "\n     * Modify the numerator format.\n     * @param format the new numerator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 357,
      "end_line": 362,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 40)",
        "(line 361,col 9)-(line 361,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 370,
      "end_line": 388,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 371,col 10)-(line 371,col 36)",
        "(line 372,col 10)-(line 372,col 33)",
        "(line 373,col 10)-(line 373,col 22)",
        "(line 375,col 10)-(line 385,col 10)",
        "(line 387,col 10)-(line 387,col 20)"
      ]
    }
  ]
}