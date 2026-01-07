{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/fraction/ProperFractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProperFractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.fraction.FractionFormat"
      ],
      "begin_line": 36,
      "end_line": 230,
      "comment": "\n * Formats a Fraction number in proper format.  The number format for each of\n * the whole number, numerator and, denominator can be configured.\n * \u003cp\u003e\n * Minus signs are only allowed in the whole number part - i.e.,\n * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\n * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\u003c/p\u003e\n * \n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "wholeFormat"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The format used for the whole number. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.ProperFractionFormat()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Create a proper formatting instance with the default number format for\n     * the whole, numerator, and denominator.  \n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.ProperFractionFormat(java.text.NumberFormat)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create a proper formatting instance with a custom number format for the\n     * whole, numerator, and denominator.\n     * @param format the custom format for the whole, numerator, and\n     *        denominator.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.ProperFractionFormat(java.text.NumberFormat, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * Create a proper formatting instance with a custom number format for each\n     * of the whole, numerator, and denominator.\n     * @param wholeFormat the custom format for the whole.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 50)",
        "(line 74,col 9)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.format(org.apache.commons.math.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 87,
      "end_line": 109,
      "comment": "\n     * Formats a {@link Fraction} object to produce a string.  The fraction\n     * is output in proper format.\n     *\n     * @param fraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 29)",
        "(line 91,col 9)-(line 91,col 27)",
        "(line 93,col 9)-(line 93,col 42)",
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 95,col 30)",
        "(line 96,col 9)-(line 96,col 24)",
        "(line 98,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 58)",
        "(line 104,col 9)-(line 104,col 33)",
        "(line 105,col 9)-(line 106,col 17)",
        "(line 108,col 9)-(line 108,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.getWholeFormat()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Access the whole format.\n     * @return the whole format.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 131,
      "end_line": 215,
      "comment": "\n     * Parses a string to produce a {@link Fraction} object.  This method\n     * expects the string to be formatted as a proper fraction.\n     * \u003cp\u003e\n     * Minus signs are only allowed in the whole number part - i.e.,\n     * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\n     * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Fraction} object.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 48)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 42)",
        "(line 141,col 9)-(line 141,col 46)",
        "(line 144,col 9)-(line 144,col 59)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 154,col 46)",
        "(line 157,col 9)-(line 157,col 61)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 170,col 9)",
        "(line 173,col 9)-(line 173,col 40)",
        "(line 174,col 9)-(line 174,col 49)",
        "(line 175,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 193,col 46)",
        "(line 196,col 9)-(line 196,col 63)",
        "(line 197,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 33)",
        "(line 212,col 9)-(line 212,col 31)",
        "(line 213,col 9)-(line 213,col 31)",
        "(line 214,col 9)-(line 214,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.ProperFractionFormat.setWholeFormat(java.text.NumberFormat)",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * Modify the whole format.\n     * @param format The new whole format value.\n     * @throws IllegalArgumentException if \u003ccode\u003eformat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 34)"
      ]
    }
  ]
}