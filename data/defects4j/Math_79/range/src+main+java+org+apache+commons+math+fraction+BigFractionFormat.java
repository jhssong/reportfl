{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/fraction/BigFractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigFractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.fraction.AbstractFormat",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 290,
      "comment": "\n * Formats a BigFraction number in proper format or improper format.\n * \u003cp\u003e\n * The number format for each of the whole number, numerator and,\n * denominator can be configured.\n * \u003c/p\u003e\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.BigFractionFormat()",
      "begin_line": 49,
      "end_line": 50,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.BigFractionFormat(java.text.NumberFormat)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.BigFractionFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.getAvailableLocales()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set.\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.formatBigFraction(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * This static method calls formatBigFraction() on a default instance of\n     * BigFractionFormat.\n     *\n     * @param f BigFraction object to format\n     * @return A formatted BigFraction in proper form.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.getImproperInstance()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.getImproperInstance(java.util.Locale)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.getProperInstance()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.getProperInstance(java.util.Locale)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.format(org.apache.commons.math.fraction.BigFraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 136,
      "end_line": 147,
      "comment": "\n     * Formats a {@link BigFraction} object to produce a string.  The BigFraction is\n     * output in improper format.\n     *\n     * @param BigFraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 140,col 27)",
        "(line 142,col 9)-(line 142,col 81)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 85)",
        "(line 146,col 9)-(line 146,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 163,
      "end_line": 181,
      "comment": "\n     * Formats an object and appends the result to a StringBuffer.\n     * \u003ccode\u003eobj\u003c/code\u003e must be either a  {@link BigFraction} object or a\n     * {@link BigInteger} object or a {@link Number} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 31)",
        "(line 168,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.parse(java.lang.String)",
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n     * Parses a string to produce a {@link BigFraction} object.\n     * @param source the string to parse\n     * @return the parsed {@link BigFraction} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 65)",
        "(line 193,col 9)-(line 193,col 64)",
        "(line 194,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 209,
      "end_line": 260,
      "comment": "\n     * Parses a string to produce a {@link BigFraction} object.\n     * This method expects the string to be formatted as an improper BigFraction.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link BigFraction} object.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 214,col 9)-(line 214,col 46)",
        "(line 217,col 9)-(line 217,col 64)",
        "(line 218,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 46)",
        "(line 228,col 9)-(line 228,col 55)",
        "(line 229,col 9)-(line 244,col 9)",
        "(line 247,col 9)-(line 247,col 46)",
        "(line 250,col 9)-(line 250,col 64)",
        "(line 251,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFractionFormat.parseNextBigInteger(java.lang.String, java.text.ParsePosition)",
      "begin_line": 269,
      "end_line": 288,
      "comment": "\n     * Parses a string to produce a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return a parsed \u003ccode\u003eBigInteger\u003c/code\u003e or null if string does not\n     * contain a BigInteger at the specified position\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 41)",
        "(line 273,col 10)-(line 273,col 71)",
        "(line 274,col 10)-(line 277,col 10)",
        "(line 279,col 10)-(line 286,col 10)"
      ]
    }
  ]
}