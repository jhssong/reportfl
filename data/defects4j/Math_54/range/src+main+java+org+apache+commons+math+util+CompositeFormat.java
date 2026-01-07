{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/util/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 222,
      "comment": "\n * Base class for formatters of composite objects (complex numbers, vectors ...).\n *\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.util.CompositeFormat.CompositeFormat()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance()} with the only customizing that the\n     * maximum number of fraction digits is set to 2.\n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance(java.util.Locale)} with the only\n     * customizing that the maximum number of fraction digits is set to 2.\n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 65)",
        "(line 57,col 9)-(line 57,col 39)",
        "(line 58,col 9)-(line 58,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 40)",
        "(line 71,col 9)-(line 71,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 81,
      "end_line": 100,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 83,col 10)-(line 83,col 36)",
        "(line 84,col 10)-(line 84,col 39)",
        "(line 85,col 10)-(line 85,col 22)",
        "(line 87,col 10)-(line 97,col 10)",
        "(line 99,col 10)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNumber(java.lang.String, double, java.text.ParsePosition)",
      "begin_line": 111,
      "end_line": 131,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for special double values.  These values\n     * include Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param value the special value to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the special number.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 26)",
        "(line 115,col 9)-(line 115,col 47)",
        "(line 116,col 9)-(line 116,col 23)",
        "(line 117,col 9)-(line 117,col 25)",
        "(line 118,col 9)-(line 118,col 23)",
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 121,col 46)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)",
      "begin_line": 143,
      "end_line": 164,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a number.  This method can parse normal,\n     * numeric values as well as special values.  These special values include\n     * Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param format the number format used to parse normal, numeric values.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed number.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 46)",
        "(line 146,col 9)-(line 146,col 50)",
        "(line 147,col 9)-(line 147,col 44)",
        "(line 150,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseFixedstring(java.lang.String, java.lang.String, java.text.ParsePosition)",
      "begin_line": 173,
      "end_line": 191,
      "comment": "\n     * Parse \u003ccode\u003esource\u003c/code\u003e for an expected fixed string.\n     * @param source the string to parse\n     * @param expected expected string\n     * @param pos input/ouput parsing parameter.\n     * @return true if the expected string was there\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 60)",
        "(line 179,col 9)-(line 186,col 9)",
        "(line 189,col 9)-(line 189,col 31)",
        "(line 190,col 9)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 210,
      "end_line": 221,
      "comment": "\n     * Formats a double value to produce a string.  In general, the value is\n     * formatted using the formatting rules of \u003ccode\u003eformat\u003c/code\u003e.  There are\n     * three exceptions to this:\n     * \u003col\u003e\n     * \u003cli\u003eNaN is formatted as \u0027(NaN)\u0027\u003c/li\u003e\n     * \u003cli\u003ePositive infinity is formatted as \u0027(Infinity)\u0027\u003c/li\u003e\n     * \u003cli\u003eNegative infinity is formatted as \u0027(-Infinity)\u0027\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param value the double to format.\n     * @param format the format used.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 26)"
      ]
    }
  ]
}