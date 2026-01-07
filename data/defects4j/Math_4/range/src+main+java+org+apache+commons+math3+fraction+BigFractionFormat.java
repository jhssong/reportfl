{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fraction/BigFractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigFractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fraction.AbstractFormat",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 288,
      "comment": "\n * Formats a BigFraction number in proper format or improper format.\n * \u003cp\u003e\n * The number format for each of the whole number, numerator and,\n * denominator can be configured.\n * \u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.BigFractionFormat()",
      "begin_line": 50,
      "end_line": 51,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.BigFractionFormat(java.text.NumberFormat)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.BigFractionFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.getAvailableLocales()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set.\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.formatBigFraction(org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * This static method calls formatBigFraction() on a default instance of\n     * BigFractionFormat.\n     *\n     * @param f BigFraction object to format\n     * @return A formatted BigFraction in proper form.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.getImproperInstance()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.getImproperInstance(java.util.Locale)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.getProperInstance()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.getProperInstance(java.util.Locale)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.format(org.apache.commons.math3.fraction.BigFraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 137,
      "end_line": 148,
      "comment": "\n     * Formats a {@link BigFraction} object to produce a string.  The BigFraction is\n     * output in improper format.\n     *\n     * @param BigFraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 29)",
        "(line 141,col 9)-(line 141,col 27)",
        "(line 143,col 9)-(line 143,col 81)",
        "(line 144,col 9)-(line 144,col 33)",
        "(line 145,col 9)-(line 145,col 85)",
        "(line 147,col 9)-(line 147,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 164,
      "end_line": 181,
      "comment": "\n     * Formats an object and appends the result to a StringBuffer.\n     * \u003ccode\u003eobj\u003c/code\u003e must be either a  {@link BigFraction} object or a\n     * {@link BigInteger} object or a {@link Number} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws MathIllegalArgumentException if \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.parse(java.lang.String)",
      "begin_line": 190,
      "end_line": 198,
      "comment": "\n     * Parses a string to produce a {@link BigFraction} object.\n     * @param source the string to parse\n     * @return the parsed {@link BigFraction} object.\n     * @exception MathParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 65)",
        "(line 193,col 9)-(line 193,col 64)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 207,
      "end_line": 258,
      "comment": "\n     * Parses a string to produce a {@link BigFraction} object.\n     * This method expects the string to be formatted as an improper BigFraction.\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return the parsed {@link BigFraction} object.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 48)",
        "(line 212,col 9)-(line 212,col 46)",
        "(line 215,col 9)-(line 215,col 64)",
        "(line 216,col 9)-(line 222,col 9)",
        "(line 225,col 9)-(line 225,col 46)",
        "(line 226,col 9)-(line 226,col 55)",
        "(line 227,col 9)-(line 242,col 9)",
        "(line 245,col 9)-(line 245,col 46)",
        "(line 248,col 9)-(line 248,col 64)",
        "(line 249,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFractionFormat.parseNextBigInteger(java.lang.String, java.text.ParsePosition)",
      "begin_line": 267,
      "end_line": 286,
      "comment": "\n     * Parses a string to produce a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return a parsed \u003ccode\u003eBigInteger\u003c/code\u003e or null if string does not\n     * contain a BigInteger at the specified position\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 41)",
        "(line 271,col 10)-(line 271,col 71)",
        "(line 272,col 10)-(line 275,col 10)",
        "(line 277,col 10)-(line 284,col 10)"
      ]
    }
  ]
}