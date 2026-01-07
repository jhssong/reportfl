{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 219,
      "comment": "\n * Base class for formatters of composite objects (complex numbers, vectors ...).\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.CompositeFormat.CompositeFormat()",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance()} with the only customizing that the\n     * maximum number of fraction digits is set to 10.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance(java.util.Locale)} with the only\n     * customizing that the maximum number of fraction digits is set to 10.\n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 65)",
        "(line 55,col 9)-(line 55,col 40)",
        "(line 56,col 9)-(line 56,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 40)",
        "(line 69,col 9)-(line 69,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 79,
      "end_line": 98,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 81,col 10)-(line 81,col 36)",
        "(line 82,col 10)-(line 82,col 39)",
        "(line 83,col 10)-(line 83,col 22)",
        "(line 85,col 10)-(line 95,col 10)",
        "(line 97,col 10)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.parseNumber(java.lang.String, double, java.text.ParsePosition)",
      "begin_line": 109,
      "end_line": 128,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for special double values.  These values\n     * include Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param value the special value to parse.\n     * @param pos input/output parsing parameter.\n     * @return the special number.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 26)",
        "(line 113,col 9)-(line 113,col 47)",
        "(line 114,col 9)-(line 114,col 23)",
        "(line 115,col 9)-(line 115,col 25)",
        "(line 116,col 9)-(line 116,col 23)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)",
      "begin_line": 140,
      "end_line": 161,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a number.  This method can parse normal,\n     * numeric values as well as special values.  These special values include\n     * Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param format the number format used to parse normal, numeric values.\n     * @param pos input/output parsing parameter.\n     * @return the parsed number.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 147,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.parseFixedstring(java.lang.String, java.lang.String, java.text.ParsePosition)",
      "begin_line": 170,
      "end_line": 188,
      "comment": "\n     * Parse \u003ccode\u003esource\u003c/code\u003e for an expected fixed string.\n     * @param source the string to parse\n     * @param expected expected string\n     * @param pos input/output parsing parameter.\n     * @return true if the expected string was there\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 46)",
        "(line 175,col 9)-(line 175,col 60)",
        "(line 176,col 9)-(line 183,col 9)",
        "(line 186,col 9)-(line 186,col 31)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CompositeFormat.formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 207,
      "end_line": 218,
      "comment": "\n     * Formats a double value to produce a string.  In general, the value is\n     * formatted using the formatting rules of \u003ccode\u003eformat\u003c/code\u003e.  There are\n     * three exceptions to this:\n     * \u003col\u003e\n     * \u003cli\u003eNaN is formatted as \u0027(NaN)\u0027\u003c/li\u003e\n     * \u003cli\u003ePositive infinity is formatted as \u0027(Infinity)\u0027\u003c/li\u003e\n     * \u003cli\u003eNegative infinity is formatted as \u0027(-Infinity)\u0027\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param value the double to format.\n     * @param format the format used.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 26)"
      ]
    }
  ]
}