{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/BigReal.java",
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
      "end_line": 292,
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
      "begin_line": 197,
      "end_line": 199,
      "comment": "*\n     * Gets the rounding mode for division operations\n     * The default is {@code RoundingMode.HALF_UP}\n     * @return the rounding mode.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.setRoundingMode(java.math.RoundingMode)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "*\n     * Sets the rounding mode for decimal divisions.\n     * @param roundingMode rounding mode for decimal divisions\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.getScale()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "*\n     * Sets the scale for division operations.\n     * The default is 64\n     * @return the scale\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.setScale(int)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "*\n     * Sets the scale for division operations.\n     * @param scale scale for division operations\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.add(org.apache.commons.math.util.BigReal)",
      "begin_line": 230,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.subtract(org.apache.commons.math.util.BigReal)",
      "begin_line": 235,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.divide(org.apache.commons.math.util.BigReal)",
      "begin_line": 240,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.multiply(org.apache.commons.math.util.BigReal)",
      "begin_line": 245,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.compareTo(org.apache.commons.math.util.BigReal)",
      "begin_line": 250,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.doubleValue()",
      "begin_line": 257,
      "end_line": 259,
      "comment": " Get the double value corresponding to the instance.\n     * @return double value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.bigDecimalValue()",
      "begin_line": 264,
      "end_line": 266,
      "comment": " Get the BigDecimal value corresponding to the instance.\n     * @return BigDecimal value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.equals(java.lang.Object)",
      "begin_line": 269,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.hashCode()",
      "begin_line": 282,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.getField()",
      "begin_line": 288,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 42)"
      ]
    }
  ]
}