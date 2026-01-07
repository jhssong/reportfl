{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fraction/AbstractFormat.java",
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
      "end_line": 210,
      "comment": "\n * Common part shared by both {@link FractionFormat} and {@link BigFractionFormat}.\n * @version $Id$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.AbstractFormat()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat, java.text.NumberFormat)",
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
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.getDefaultNumberFormat()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)}. The only\n     * customization is the maximum number of BigFraction digits, which is set to 0.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)}. The only\n     * customization is the maximum number of BigFraction digits, which is set to 0.\n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 71)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 94,col 37)",
        "(line 95,col 9)-(line 95,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.getDenominatorFormat()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Access the denominator format.\n     * @return the denominator format.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.getNumeratorFormat()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Access the numerator format.\n     * @return the numerator format.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.setDenominatorFormat(java.text.NumberFormat)",
      "begin_line": 119,
      "end_line": 124,
      "comment": "\n     * Modify the denominator format.\n     * @param format the new denominator format value.\n     * @throws NullArgumentException if {@code format} is {@code null}.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.setNumeratorFormat(java.text.NumberFormat)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\n     * Modify the numerator format.\n     * @param format the new numerator format value.\n     * @throws NullArgumentException if {@code format} is {@code null}.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 40)",
        "(line 147,col 9)-(line 147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 156,
      "end_line": 175,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 158,col 10)-(line 158,col 36)",
        "(line 159,col 10)-(line 159,col 39)",
        "(line 160,col 10)-(line 160,col 22)",
        "(line 162,col 10)-(line 172,col 10)",
        "(line 174,col 10)-(line 174,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * Formats a double value as a fraction and appends the result to a StringBuffer.\n     *\n     * @param value the double value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see #format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.AbstractFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n     * Formats a long value as a fraction and appends the result to a StringBuffer.\n     *\n     * @param value the long value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see #format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 61)"
      ]
    }
  ]
}