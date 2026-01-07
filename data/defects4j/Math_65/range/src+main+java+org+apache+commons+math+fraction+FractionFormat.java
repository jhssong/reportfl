{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/fraction/FractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.fraction.AbstractFormat"
      ],
      "begin_line": 38,
      "end_line": 274,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat()",
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.FractionFormat.FractionFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getAvailableLocales()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set.\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.formatFraction(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * This static method calls formatFraction() on a default instance of\n     * FractionFormat.\n     *\n     * @param f Fraction object to format\n     * @return A formatted fraction in proper form.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getImproperInstance(java.util.Locale)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getProperInstance(java.util.Locale)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 0.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(org.apache.commons.math.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 144,
      "end_line": 156,
      "comment": "\n     * Formats a {@link Fraction} object to produce a string.  The fraction is\n     * output in improper format.\n     *\n     * @param fraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 29)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 150,col 9)-(line 150,col 78)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 153,col 17)",
        "(line 155,col 9)-(line 155,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 171,
      "end_line": 193,
      "comment": "\n     * Formats an object and appends the result to a StringBuffer. \u003ccode\u003eobj\u003c/code\u003e must be either a\n     * {@link Fraction} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 32)",
        "(line 176,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String)",
      "begin_line": 202,
      "end_line": 212,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.\n     * @param source the string to parse\n     * @return the parsed {@link Fraction} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 65)",
        "(line 205,col 9)-(line 205,col 61)",
        "(line 206,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.FractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 221,
      "end_line": 272,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.  This method\n     * expects the string to be formatted as an improper fraction.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Fraction} object.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 48)",
        "(line 226,col 9)-(line 226,col 46)",
        "(line 229,col 9)-(line 229,col 67)",
        "(line 230,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 239,col 46)",
        "(line 240,col 9)-(line 240,col 55)",
        "(line 241,col 9)-(line 256,col 9)",
        "(line 259,col 9)-(line 259,col 46)",
        "(line 262,col 9)-(line 262,col 69)",
        "(line 263,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 60)"
      ]
    }
  ]
}