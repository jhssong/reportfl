{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fraction/FractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fraction.AbstractFormat"
      ],
      "begin_line": 37,
      "end_line": 265,
      "comment": "\n * Formats a Fraction number in proper format or improper format.  The number\n * format for each of the whole number, numerator and, denominator can be\n * configured.\n *\n * @since 1.1\n * @version $Id$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.FractionFormat()",
      "begin_line": 46,
      "end_line": 47,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.FractionFormat(java.text.NumberFormat)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.FractionFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.getAvailableLocales()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set.\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.formatFraction(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * This static method calls formatFraction() on a default instance of\n     * FractionFormat.\n     *\n     * @param f Fraction object to format\n     * @return a formatted fraction in proper form.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.getImproperInstance()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.getImproperInstance(java.util.Locale)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.getProperInstance()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.getProperInstance(java.util.Locale)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.getDefaultNumberFormat()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 0.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.format(org.apache.commons.math3.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 143,
      "end_line": 155,
      "comment": "\n     * Formats a {@link Fraction} object to produce a string.  The fraction is\n     * output in improper format.\n     *\n     * @param fraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 29)",
        "(line 147,col 9)-(line 147,col 27)",
        "(line 149,col 9)-(line 149,col 78)",
        "(line 150,col 9)-(line 150,col 33)",
        "(line 151,col 9)-(line 152,col 17)",
        "(line 154,col 9)-(line 154,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 171,
      "end_line": 186,
      "comment": "\n     * Formats an object and appends the result to a StringBuffer. \u003ccode\u003eobj\u003c/code\u003e must be either a\n     * {@link Fraction} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws FractionConversionException if the number cannot be converted to a fraction\n     * @throws MathIllegalArgumentException if \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 32)",
        "(line 177,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.parse(java.lang.String)",
      "begin_line": 195,
      "end_line": 203,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.\n     * @param source the string to parse\n     * @return the parsed {@link Fraction} object.\n     * @exception MathParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 65)",
        "(line 198,col 9)-(line 198,col 61)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.FractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 212,
      "end_line": 263,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.  This method\n     * expects the string to be formatted as an improper fraction.\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return the parsed {@link Fraction} object.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 48)",
        "(line 217,col 9)-(line 217,col 46)",
        "(line 220,col 9)-(line 220,col 67)",
        "(line 221,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 230,col 46)",
        "(line 231,col 9)-(line 231,col 55)",
        "(line 232,col 9)-(line 247,col 9)",
        "(line 250,col 9)-(line 250,col 46)",
        "(line 253,col 9)-(line 253,col 69)",
        "(line 254,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 60)"
      ]
    }
  ]
}