{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fraction/ProperBigFractionFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProperBigFractionFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fraction.BigFractionFormat"
      ],
      "begin_line": 38,
      "end_line": 239,
      "comment": "\n * Formats a BigFraction number in proper format.  The number format for each of\n * the whole number, numerator and, denominator can be configured.\n * \u003cp\u003e\n * Minus signs are only allowed in the whole number part - i.e.,\n * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\n * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\u003c/p\u003e\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "wholeFormat"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The format used for the whole number. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.ProperBigFractionFormat.ProperBigFractionFormat()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Create a proper formatting instance with the default number format for\n     * the whole, numerator, and denominator.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.ProperBigFractionFormat.ProperBigFractionFormat(java.text.NumberFormat)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Create a proper formatting instance with a custom number format for the\n     * whole, numerator, and denominator.\n     * @param format the custom format for the whole, numerator, and\n     *        denominator.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.ProperBigFractionFormat.ProperBigFractionFormat(java.text.NumberFormat, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * Create a proper formatting instance with a custom number format for each\n     * of the whole, numerator, and denominator.\n     * @param wholeFormat the custom format for the whole.\n     * @param numeratorFormat the custom format for the numerator.\n     * @param denominatorFormat the custom format for the denominator.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 50)",
        "(line 75,col 9)-(line 75,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.ProperBigFractionFormat.format(org.apache.commons.math3.fraction.BigFraction, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 88,
      "end_line": 112,
      "comment": "\n     * Formats a {@link BigFraction} object to produce a string.  The BigFraction\n     * is output in proper format.\n     *\n     * @param fraction the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 29)",
        "(line 93,col 9)-(line 93,col 27)",
        "(line 95,col 9)-(line 95,col 49)",
        "(line 96,col 9)-(line 96,col 51)",
        "(line 97,col 9)-(line 97,col 43)",
        "(line 98,col 9)-(line 98,col 33)",
        "(line 100,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 58)",
        "(line 108,col 9)-(line 108,col 33)",
        "(line 109,col 9)-(line 109,col 60)",
        "(line 111,col 9)-(line 111,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.ProperBigFractionFormat.getWholeFormat()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Access the whole format.\n     * @return the whole format.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.ProperBigFractionFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 134,
      "end_line": 226,
      "comment": "\n     * Parses a string to produce a {@link BigFraction} object.  This method\n     * expects the string to be formatted as a proper BigFraction.\n     * \u003cp\u003e\n     * Minus signs are only allowed in the whole number part - i.e.,\n     * \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and\n     * will result in a \u003ccode\u003eParseException\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link BigFraction} object.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 51)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 48)",
        "(line 145,col 9)-(line 145,col 46)",
        "(line 148,col 9)-(line 148,col 60)",
        "(line 149,col 9)-(line 155,col 9)",
        "(line 158,col 9)-(line 158,col 46)",
        "(line 161,col 9)-(line 161,col 58)",
        "(line 162,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 174,col 9)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 55)",
        "(line 179,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 46)",
        "(line 200,col 9)-(line 200,col 64)",
        "(line 201,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 66)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 43)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.ProperBigFractionFormat.setWholeFormat(java.text.NumberFormat)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n     * Modify the whole format.\n     * @param format The new whole format value.\n     * @throws NullArgumentException if {@code format} is {@code null}.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 34)"
      ]
    }
  ]
}