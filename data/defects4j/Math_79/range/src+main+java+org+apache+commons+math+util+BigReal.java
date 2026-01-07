{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/util/BigReal.java",
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
      "begin_line": 37,
      "end_line": 247,
      "comment": "\n * Arbitrary precision decimal number.\n * \u003cp\u003e\n * This class is a simple wrapper around the standard \u003ccode\u003eBigDecimal\u003c/code\u003e\n * in order to implement the {@link FieldElement} interface.\n * \u003c/p\u003e\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " A big real representing 0. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " A big real representing 1. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Underlying BigDecimal. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigDecimal)",
      "begin_line": 54,
      "end_line": 56,
      "comment": " Build an instance from a BigDecimal.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger)",
      "begin_line": 61,
      "end_line": 63,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, int, java.math.MathContext)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     * @param mc to used\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, java.math.MathContext)",
      "begin_line": 86,
      "end_line": 88,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[])",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], int, int)",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], int, int, java.math.MathContext)",
      "begin_line": 112,
      "end_line": 114,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], java.math.MathContext)",
      "begin_line": 120,
      "end_line": 122,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(double)",
      "begin_line": 127,
      "end_line": 129,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(double, java.math.MathContext)",
      "begin_line": 135,
      "end_line": 137,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(int, java.math.MathContext)",
      "begin_line": 150,
      "end_line": 152,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(long)",
      "begin_line": 157,
      "end_line": 159,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(long, java.math.MathContext)",
      "begin_line": 165,
      "end_line": 167,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.lang.String)",
      "begin_line": 172,
      "end_line": 174,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.lang.String, java.math.MathContext)",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.add(org.apache.commons.math.util.BigReal)",
      "begin_line": 185,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.subtract(org.apache.commons.math.util.BigReal)",
      "begin_line": 190,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.divide(org.apache.commons.math.util.BigReal)",
      "begin_line": 195,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.multiply(org.apache.commons.math.util.BigReal)",
      "begin_line": 200,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.compareTo(org.apache.commons.math.util.BigReal)",
      "begin_line": 205,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.doubleValue()",
      "begin_line": 212,
      "end_line": 214,
      "comment": " Get the double value corresponding to the instance.\n     * @return double value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.bigDecimalValue()",
      "begin_line": 219,
      "end_line": 221,
      "comment": " Get the BigDecimal value corresponding to the instance.\n     * @return BigDecimal value corresponding to the instance\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.equals(java.lang.Object)",
      "begin_line": 224,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.hashCode()",
      "begin_line": 237,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.getField()",
      "begin_line": 243,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 42)"
      ]
    }
  ]
}