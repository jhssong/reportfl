{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/fraction/AbstractFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 214,
      "comment": "\n * Common part shared by both {@link FractionFormat} and {@link BigFractionFormat}.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorFormat"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The format used for the denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorFormat"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The format used for the numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 49)",
        "(line 71,col 9)-(line 71,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDefaultNumberFormat()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of BigFraction digits, which is set to 0.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of BigFraction digits, which is set to 0.\n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 71)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 94,col 37)",
        "(line 95,col 9)-(line 95,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDenominatorFormat()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Access the denominator format.\n     * @return the denominator format.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getNumeratorFormat()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Access the numerator format.\n     * @return the numerator format.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.setDenominatorFormat(java.text.NumberFormat)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * Modify the denominator format.\n     * @param format the new denominator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.setNumeratorFormat(java.text.NumberFormat)",
      "begin_line": 134,
      "end_line": 140,
      "comment": "\n     * Modify the numerator format.\n     * @param format the new numerator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 148,
      "end_line": 152,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 40)",
        "(line 151,col 9)-(line 151,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 160,
      "end_line": 179,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 162,col 10)-(line 162,col 36)",
        "(line 163,col 10)-(line 163,col 39)",
        "(line 164,col 10)-(line 164,col 22)",
        "(line 166,col 10)-(line 176,col 10)",
        "(line 178,col 10)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * Formats a double value as a fraction and appends the result to a StringBuffer.\n     *\n     * @param value the double value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see #format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * Formats a long value as a fraction and appends the result to a StringBuffer.\n     *\n     * @param value the long value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see #format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 61)"
      ]
    }
  ]
}