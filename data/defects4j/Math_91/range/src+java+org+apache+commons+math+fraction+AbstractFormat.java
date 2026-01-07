{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/fraction/AbstractFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorFormat"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The format used for the denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorFormat"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The format used for the numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Create an improper formatting instance with the default number format\n     * for the numerator and denominator.  \n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * both the numerator and denominator.\n     * @param format the custom format for both the numerator and denominator.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.AbstractFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Create an improper formatting instance with a custom number format for\n     * the numerator and a custom number format for the denominator.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 49)",
        "(line 65,col 9)-(line 65,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDefaultNumberFormat()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of BigFraction digits, which is set to 0.  \n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getNumberInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of BigFraction digits, which is set to 0.  \n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 71)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 89,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getDenominatorFormat()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Access the denominator format.\n     * @return the denominator format.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.getNumeratorFormat()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Access the numerator format.\n     * @return the numerator format.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.setDenominatorFormat(java.text.NumberFormat)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     * Modify the denominator format.\n     * @param format the new denominator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.setNumeratorFormat(java.text.NumberFormat)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Modify the numerator format.\n     * @param format the new numerator format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 40)",
        "(line 145,col 9)-(line 145,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 154,
      "end_line": 173,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 156,col 10)-(line 156,col 36)",
        "(line 157,col 10)-(line 157,col 39)",
        "(line 158,col 10)-(line 158,col 22)",
        "(line 160,col 10)-(line 170,col 10)",
        "(line 172,col 10)-(line 172,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * Formats a double value as a fraction and appends the result to a StringBuffer. \n     *\n     * @param value the double value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see {@link #format(Object, StringBuffer, FieldPosition)}\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.AbstractFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Formats a long value as a fraction and appends the result to a StringBuffer. \n     *\n     * @param value the long value to format\n     * @param buffer StringBuffer to append to\n     * @param position On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return a reference to the appended buffer\n     * @see {@link #format(Object, StringBuffer, FieldPosition)}\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 61)"
      ]
    }
  ]
}