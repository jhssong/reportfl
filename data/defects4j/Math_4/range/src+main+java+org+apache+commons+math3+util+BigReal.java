{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/BigReal.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigReal",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.FieldElement\u003corg.apache.commons.math3.util.BigReal\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math3.util.BigReal\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 326,
      "comment": "\n * Arbitrary precision decimal number.\n * \u003cp\u003e\n * This class is a simple wrapper around the standard \u003ccode\u003eBigDecimal\u003c/code\u003e\n * in order to implement the {@link FieldElement} interface.\n * \u003c/p\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " A big real representing 0. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " A big real representing 1. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Underlying BigDecimal. "
    },
    {
      "type": "field",
      "varNames": [
        "roundingMode"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Rounding mode for divisions. *"
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "* BigDecimal scale **"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(java.math.BigDecimal)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Build an instance from a BigDecimal.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(java.math.BigInteger)",
      "begin_line": 70,
      "end_line": 72,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(java.math.BigInteger, int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(java.math.BigInteger, int, java.math.MathContext)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     * @param mc to used\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(java.math.BigInteger, java.math.MathContext)",
      "begin_line": 95,
      "end_line": 97,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(char[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(char[], int, int)",
      "begin_line": 111,
      "end_line": 113,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(char[], int, int, java.math.MathContext)",
      "begin_line": 121,
      "end_line": 123,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(char[], java.math.MathContext)",
      "begin_line": 129,
      "end_line": 131,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(double)",
      "begin_line": 136,
      "end_line": 138,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(double, java.math.MathContext)",
      "begin_line": 144,
      "end_line": 146,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(int, java.math.MathContext)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(long)",
      "begin_line": 166,
      "end_line": 168,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(long, java.math.MathContext)",
      "begin_line": 174,
      "end_line": 176,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(java.lang.String)",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.BigReal.BigReal(java.lang.String, java.math.MathContext)",
      "begin_line": 189,
      "end_line": 191,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.getRoundingMode()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "*\n     * Gets the rounding mode for division operations\n     * The default is {@code RoundingMode.HALF_UP}\n     * @return the rounding mode.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.setRoundingMode(java.math.RoundingMode)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "*\n     * Sets the rounding mode for decimal divisions.\n     * @param roundingMode rounding mode for decimal divisions\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.getScale()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "*\n     * Sets the scale for division operations.\n     * The default is 64\n     * @return the scale\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.setScale(int)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "*\n     * Sets the scale for division operations.\n     * @param scale scale for division operations\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.add(org.apache.commons.math3.util.BigReal)",
      "begin_line": 232,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.subtract(org.apache.commons.math3.util.BigReal)",
      "begin_line": 237,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.negate()",
      "begin_line": 242,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.divide(org.apache.commons.math3.util.BigReal)",
      "begin_line": 251,
      "end_line": 258,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathArithmeticException if {@code a} is zero\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.reciprocal()",
      "begin_line": 265,
      "end_line": 272,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathArithmeticException if {@code this} is zero\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.multiply(org.apache.commons.math3.util.BigReal)",
      "begin_line": 275,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.multiply(int)",
      "begin_line": 280,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.compareTo(org.apache.commons.math3.util.BigReal)",
      "begin_line": 285,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.doubleValue()",
      "begin_line": 292,
      "end_line": 294,
      "comment": " Get the double value corresponding to the instance.\n     * @return double value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.bigDecimalValue()",
      "begin_line": 299,
      "end_line": 301,
      "comment": " Get the BigDecimal value corresponding to the instance.\n     * @return BigDecimal value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.equals(java.lang.Object)",
      "begin_line": 304,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.hashCode()",
      "begin_line": 317,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.BigReal.getField()",
      "begin_line": 323,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 42)"
      ]
    }
  ]
}