{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/fraction/ProperBigFractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProperBigFractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.fraction.BigFractionFormat"
      ],
      "begin_line": 37,
      "end_line": 241,
      "comment": "\n * Formats a BigFraction number in proper format.  The number format for each of\n * the whole number, numerator and, denominator can be configured.\n * \u003cp\u003e\n * Minus signs are only allowed in the whole number part - i.e.,\n * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\n * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\u003c/p\u003e\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "wholeFormat"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The format used for the whole number. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperBigFractionFormat.ProperBigFractionFormat()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Create a proper formatting instance with the default number format for\n     * the whole, numerator, and denominator.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperBigFractionFormat.ProperBigFractionFormat(java.text.NumberFormat)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Create a proper formatting instance with a custom number format for the\n     * whole, numerator, and denominator.\n     * @param format the custom format for the whole, numerator, and\n     *        denominator.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperBigFractionFormat.ProperBigFractionFormat(java.text.NumberFormat, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * Create a proper formatting instance with a custom number format for each\n     * of the whole, numerator, and denominator.\n     * @param wholeFormat the custom format for the whole.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 50)",
        "(line 74,col 9)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperBigFractionFormat.format(org.apache.commons.math.fraction.BigFraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 87,
      "end_line": 111,
      "comment": "\n     * Formats a {@link BigFraction} object to produce a string.  The BigFraction\n     * is output in proper format.\n     *\n     * @param fraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 29)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 94,col 9)-(line 94,col 49)",
        "(line 95,col 9)-(line 95,col 51)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 99,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 60)",
        "(line 110,col 9)-(line 110,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperBigFractionFormat.getWholeFormat()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Access the whole format.\n     * @return the whole format.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperBigFractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 133,
      "end_line": 225,
      "comment": "\n     * Parses a string to produce a {@link BigFraction} object.  This method\n     * expects the string to be formatted as a proper BigFraction.\n     * \u003cp\u003e\n     * Minus signs are only allowed in the whole number part - i.e.,\n     * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\n     * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link BigFraction} object.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 51)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 48)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 147,col 9)-(line 147,col 60)",
        "(line 148,col 9)-(line 154,col 9)",
        "(line 157,col 9)-(line 157,col 46)",
        "(line 160,col 9)-(line 160,col 58)",
        "(line 161,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 173,col 9)",
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 55)",
        "(line 178,col 9)-(line 193,col 9)",
        "(line 196,col 9)-(line 196,col 46)",
        "(line 199,col 9)-(line 199,col 64)",
        "(line 200,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 66)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 43)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperBigFractionFormat.setWholeFormat(java.text.NumberFormat)",
      "begin_line": 233,
      "end_line": 239,
      "comment": "\n     * Modify the whole format.\n     * @param format The new whole format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 34)"
      ]
    }
  ]
}