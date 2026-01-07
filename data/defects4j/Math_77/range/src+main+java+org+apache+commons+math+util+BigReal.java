{
  "filepath": "/tmp/Math-77b/src/main/java/org/apache/commons/math/util/BigReal.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigReal",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.util.BigReal\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math.util.BigReal\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 288,
      "comment": "\n * Arbitrary precision decimal number.\n * \u003cp\u003e\n * This class is a simple wrapper around the standard \u003ccode\u003eBigDecimal\u003c/code\u003e\n * in order to implement the {@link FieldElement} interface.\n * \u003c/p\u003e\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " A big real representing 0. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " A big real representing 1. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Underlying BigDecimal. "
    },
    {
      "type": "field",
      "varNames": [
        "roundingMode"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Rounding mode for divisions. *"
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "* BigDecimal scale **"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigDecimal)",
      "begin_line": 61,
      "end_line": 63,
      "comment": " Build an instance from a BigDecimal.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, int)",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, int, java.math.MathContext)",
      "begin_line": 85,
      "end_line": 87,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     * @param mc to used\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, java.math.MathContext)",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[])",
      "begin_line": 100,
      "end_line": 102,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], int, int)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], int, int, java.math.MathContext)",
      "begin_line": 119,
      "end_line": 121,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], java.math.MathContext)",
      "begin_line": 127,
      "end_line": 129,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(double)",
      "begin_line": 134,
      "end_line": 136,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(double, java.math.MathContext)",
      "begin_line": 142,
      "end_line": 144,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(int)",
      "begin_line": 149,
      "end_line": 151,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(int, java.math.MathContext)",
      "begin_line": 157,
      "end_line": 159,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(long)",
      "begin_line": 164,
      "end_line": 166,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(long, java.math.MathContext)",
      "begin_line": 172,
      "end_line": 174,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.lang.String)",
      "begin_line": 179,
      "end_line": 181,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.lang.String, java.math.MathContext)",
      "begin_line": 187,
      "end_line": 189,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.getRoundingMode()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "*\n     * Gets the rounding mode for division operations\n     * The default is {@code RoundingMode.HALF_UP}\n     * @return the rounding mode.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.setRoundingMode(java.math.RoundingMode)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "*\n     * Sets the rounding mode for decimal divisions.\n     * @param roundingMode rounding mode for decimal divisions\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.getScale()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "*\n     * Sets the scale for division operations.\n     * The default is 64\n     * @return the scale\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.setScale(int)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "*\n     * Sets the scale for division operations.\n     * @param scale scale for division operations\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.add(org.apache.commons.math.util.BigReal)",
      "begin_line": 226,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.subtract(org.apache.commons.math.util.BigReal)",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.divide(org.apache.commons.math.util.BigReal)",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.multiply(org.apache.commons.math.util.BigReal)",
      "begin_line": 241,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.compareTo(org.apache.commons.math.util.BigReal)",
      "begin_line": 246,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.doubleValue()",
      "begin_line": 253,
      "end_line": 255,
      "comment": " Get the double value corresponding to the instance.\n     * @return double value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.bigDecimalValue()",
      "begin_line": 260,
      "end_line": 262,
      "comment": " Get the BigDecimal value corresponding to the instance.\n     * @return BigDecimal value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.equals(java.lang.Object)",
      "begin_line": 265,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.hashCode()",
      "begin_line": 278,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.getField()",
      "begin_line": 284,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 42)"
      ]
    }
  ]
}