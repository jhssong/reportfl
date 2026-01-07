{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/util/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 31,
      "end_line": 218,
      "comment": "\n * Base class for formatters of composite objects (complex numbers, vectors ...).\n *\n * @author Apache Software Foundation\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance()} with the only customizing that the\n     * maximum number of fraction digits is set to 2.  \n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance(java.util.Locale)} with the only\n     * customizing that the maximum number of fraction digits is set to 2.  \n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 65)",
        "(line 52,col 9)-(line 52,col 39)",
        "(line 53,col 9)-(line 53,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 40)",
        "(line 66,col 9)-(line 66,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 76,
      "end_line": 95,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 78,col 10)-(line 78,col 36)",
        "(line 79,col 10)-(line 79,col 39)",
        "(line 80,col 10)-(line 80,col 22)",
        "(line 82,col 10)-(line 92,col 10)",
        "(line 94,col 10)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNumber(java.lang.String, double, java.text.ParsePosition)",
      "begin_line": 106,
      "end_line": 126,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for special double values.  These values\n     * include Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param value the special value to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the special number.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 26)",
        "(line 110,col 9)-(line 110,col 45)",
        "(line 111,col 9)-(line 111,col 23)",
        "(line 112,col 9)-(line 112,col 25)",
        "(line 113,col 9)-(line 113,col 23)",
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 46)",
        "(line 117,col 9)-(line 117,col 44)",
        "(line 118,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)",
      "begin_line": 138,
      "end_line": 159,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a number.  This method can parse normal,\n     * numeric values as well as special values.  These special values include\n     * Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param format the number format used to parse normal, numeric values.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed number.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 44)",
        "(line 145,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.parseFixedstring(java.lang.String, java.lang.String, java.text.ParsePosition)",
      "begin_line": 168,
      "end_line": 186,
      "comment": "\n     * Parse \u003ccode\u003esource\u003c/code\u003e for an expected fixed string.\n     * @param source the string to parse\n     * @param expected expected string\n     * @param pos input/ouput parsing parameter.\n     * @return true if the expected string was there\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 60)",
        "(line 173,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 183,col 31)",
        "(line 184,col 9)-(line 184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.CompositeFormat.formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 205,
      "end_line": 216,
      "comment": "\n     * Formats a double value to produce a string.  In general, the value is\n     * formatted using the formatting rules of \u003ccode\u003eformat\u003c/code\u003e.  There are\n     * three exceptions to this:\n     * \u003col\u003e\n     * \u003cli\u003eNaN is formatted as \u0027(NaN)\u0027\u003c/li\u003e\n     * \u003cli\u003ePositive infinity is formatted as \u0027(Infinity)\u0027\u003c/li\u003e\n     * \u003cli\u003eNegative infinity is formatted as \u0027(-Infinity)\u0027\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param value the double to format.\n     * @param format the format used.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 26)"
      ]
    }
  ]
}