{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/util/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 30,
      "end_line": 220,
      "comment": "\n * Base class for formatters of composite objects (complex numbers, vectors ...).\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance()} with the only customizing that the\n     * maximum number of fraction digits is set to 2.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance(java.util.Locale)} with the only\n     * customizing that the maximum number of fraction digits is set to 2.\n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 65)",
        "(line 54,col 9)-(line 54,col 39)",
        "(line 55,col 9)-(line 55,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 40)",
        "(line 68,col 9)-(line 68,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 78,
      "end_line": 97,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 80,col 10)-(line 80,col 36)",
        "(line 81,col 10)-(line 81,col 39)",
        "(line 82,col 10)-(line 82,col 22)",
        "(line 84,col 10)-(line 94,col 10)",
        "(line 96,col 10)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNumber(java.lang.String, double, java.text.ParsePosition)",
      "begin_line": 108,
      "end_line": 128,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for special double values.  These values\n     * include Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param value the special value to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the special number.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 26)",
        "(line 112,col 9)-(line 112,col 45)",
        "(line 113,col 9)-(line 113,col 23)",
        "(line 114,col 9)-(line 114,col 25)",
        "(line 115,col 9)-(line 115,col 23)",
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 46)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)",
      "begin_line": 140,
      "end_line": 161,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a number.  This method can parse normal,\n     * numeric values as well as special values.  These special values include\n     * Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param format the number format used to parse normal, numeric values.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed number.\n     ",
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
      "signature": "org.apache.commons.math.util.CompositeFormat.parseFixedstring(java.lang.String, java.lang.String, java.text.ParsePosition)",
      "begin_line": 170,
      "end_line": 188,
      "comment": "\n     * Parse \u003ccode\u003esource\u003c/code\u003e for an expected fixed string.\n     * @param source the string to parse\n     * @param expected expected string\n     * @param pos input/ouput parsing parameter.\n     * @return true if the expected string was there\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 174,col 60)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 185,col 9)-(line 185,col 31)",
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)",
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