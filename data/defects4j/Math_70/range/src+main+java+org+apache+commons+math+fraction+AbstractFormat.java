{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/fraction/AbstractFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 213,
      "comment": "\n * Common part shared by both {@link FractionFormat} and {@link BigFractionFormat}.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorFormat"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The format used for the denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorFormat"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The format used for the numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 49)",
        "(line 70,col 9)-(line 70,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDefaultNumberFormat()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of BigFraction digits, which is set to 0.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of BigFraction digits, which is set to 0.\n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 71)",
        "(line 92,col 9)-(line 92,col 39)",
        "(line 93,col 9)-(line 93,col 37)",
        "(line 94,col 9)-(line 94,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDenominatorFormat()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Access the denominator format.\n     * @return the denominator format.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getNumeratorFormat()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Access the numerator format.\n     * @return the numerator format.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.setDenominatorFormat(java.text.NumberFormat)",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n     * Modify the denominator format.\n     * @param format the new denominator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.setNumeratorFormat(java.text.NumberFormat)",
      "begin_line": 133,
      "end_line": 139,
      "comment": "\n     * Modify the numerator format.\n     * @param format the new numerator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 40)",
        "(line 150,col 9)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 159,
      "end_line": 178,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 161,col 10)-(line 161,col 36)",
        "(line 162,col 10)-(line 162,col 39)",
        "(line 163,col 10)-(line 163,col 22)",
        "(line 165,col 10)-(line 175,col 10)",
        "(line 177,col 10)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 190,
      "end_line": 194,
      "comment": "\n     * Formats a double value as a fraction and appends the result to a StringBuffer.\n     *\n     * @param value the double value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see #format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * Formats a long value as a fraction and appends the result to a StringBuffer.\n     *\n     * @param value the long value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see #format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 61)"
      ]
    }
  ]
}