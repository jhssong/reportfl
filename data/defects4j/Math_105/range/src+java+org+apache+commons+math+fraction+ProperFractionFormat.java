{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/fraction/ProperFractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProperFractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.fraction.FractionFormat"
      ],
      "begin_line": 35,
      "end_line": 229,
      "comment": "\r\n * Formats a Fraction number in proper format.  The number format for each of\r\n * the whole number, numerator and, denominator can be configured.\r\n * \u003cp\u003e\r\n * Minus signs are only allowed in the whole number part - i.e.,\r\n * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\r\n * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\r\n * \r\n * @since 1.1\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "wholeFormat"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The format used for the whole number. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.ProperFractionFormat()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\r\n     * Create a proper formatting instance with the default number format for\r\n     * the whole, numerator, and denominator.  \r\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.ProperFractionFormat(java.text.NumberFormat)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\r\n     * Create a proper formatting instance with a custom number format for the\r\n     * whole, numerator, and denominator.\r\n     * @param format the custom format for the whole, numerator, and\r\n     *        denominator.\r\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.ProperFractionFormat(java.text.NumberFormat, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 68,
      "end_line": 74,
      "comment": "\r\n     * Create a proper formatting instance with a custom number format for each\r\n     * of the whole, numerator, and denominator.\r\n     * @param wholeFormat the custom format for the whole.\r\n     * @param numeratorFormat the custom format for the numerator.\r\n     * @param denominatorFormat the custom format for the denominator.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 50)",
        "(line 73,col 9)-(line 73,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.format(org.apache.commons.math.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 86,
      "end_line": 108,
      "comment": "\r\n     * Formats a {@link Fraction} object to produce a string.  The fraction\r\n     * is output in proper format.\r\n     *\r\n     * @param fraction the object to format.\r\n     * @param toAppendTo where the text is to be appended\r\n     * @param pos On input: an alignment field, if desired. On output: the\r\n     *            offsets of the alignment field\r\n     * @return the value passed in as toAppendTo.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 29)",
        "(line 90,col 9)-(line 90,col 27)",
        "(line 92,col 9)-(line 92,col 42)",
        "(line 93,col 9)-(line 93,col 44)",
        "(line 94,col 9)-(line 94,col 30)",
        "(line 95,col 9)-(line 95,col 24)",
        "(line 97,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 58)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 105,col 17)",
        "(line 107,col 9)-(line 107,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.getWholeFormat()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Access the whole format.\r\n     * @return the whole format.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 130,
      "end_line": 214,
      "comment": "\r\n     * Parses a string to produce a {@link Fraction} object.  This method\r\n     * expects the string to be formatted as a proper fraction.\r\n     * \u003cp\u003e\r\n     * Minus signs are only allowed in the whole number part - i.e.,\r\n     * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\r\n     * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\r\n     * \r\n     * @param source the string to parse\r\n     * @param pos input/ouput parsing parameter.\r\n     * @return the parsed {@link Fraction} object.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 48)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 42)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 143,col 9)-(line 143,col 59)",
        "(line 144,col 9)-(line 150,col 9)",
        "(line 153,col 9)-(line 153,col 46)",
        "(line 156,col 9)-(line 156,col 61)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 40)",
        "(line 173,col 9)-(line 173,col 49)",
        "(line 174,col 9)-(line 189,col 9)",
        "(line 192,col 9)-(line 192,col 46)",
        "(line 195,col 9)-(line 195,col 63)",
        "(line 196,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 33)",
        "(line 211,col 9)-(line 211,col 31)",
        "(line 212,col 9)-(line 212,col 31)",
        "(line 213,col 9)-(line 213,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.setWholeFormat(java.text.NumberFormat)",
      "begin_line": 222,
      "end_line": 228,
      "comment": "\r\n     * Modify the whole format.\r\n     * @param format The new whole format value.\r\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\r\n     *         \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 34)"
      ]
    }
  ]
}