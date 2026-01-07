{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/util/BigReal.java",
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
      "end_line": 235,
      "comment": "\n * Arbitrary precision decimal number.\n * \u003cp\u003e\n * This class is a simple wrapper around the standard \u003ccode\u003eBigDecimal\u003c/code\u003e\n * in order to implement the {@link FieldElement} interface.\n * \u003c/p\u003e\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " A big real representing 0. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " A big real representing 1. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Underlying BigDecimal. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigDecimal)",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Build an instance from a BigDecimal.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, int, java.math.MathContext)",
      "begin_line": 80,
      "end_line": 82,
      "comment": " Build an instance from an unscaled BigInteger.\n     * @param unscaledVal unscaled value\n     * @param scale scale to use\n     * @param mc to used\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.math.BigInteger, java.math.MathContext)",
      "begin_line": 88,
      "end_line": 90,
      "comment": " Build an instance from a BigInteger.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[])",
      "begin_line": 95,
      "end_line": 97,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], int, int)",
      "begin_line": 104,
      "end_line": 106,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], int, int, java.math.MathContext)",
      "begin_line": 114,
      "end_line": 116,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param offset offset of the first character to analyze\n     * @param len length of the array slice to analyze\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(char[], java.math.MathContext)",
      "begin_line": 122,
      "end_line": 124,
      "comment": " Build an instance from a characters representation.\n     * @param in character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(double)",
      "begin_line": 129,
      "end_line": 131,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(double, java.math.MathContext)",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Build an instance from a double.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(int)",
      "begin_line": 144,
      "end_line": 146,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(int, java.math.MathContext)",
      "begin_line": 152,
      "end_line": 154,
      "comment": " Build an instance from an int.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(long)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(long, java.math.MathContext)",
      "begin_line": 167,
      "end_line": 169,
      "comment": " Build an instance from a long.\n     * @param val value of the instance\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.lang.String)",
      "begin_line": 174,
      "end_line": 176,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.BigReal.BigReal(java.lang.String, java.math.MathContext)",
      "begin_line": 182,
      "end_line": 184,
      "comment": " Build an instance from a String representation.\n     * @param val character representation of the value\n     * @param mc context to use\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.add(org.apache.commons.math.util.BigReal)",
      "begin_line": 187,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.subtract(org.apache.commons.math.util.BigReal)",
      "begin_line": 192,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.divide(org.apache.commons.math.util.BigReal)",
      "begin_line": 197,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.multiply(org.apache.commons.math.util.BigReal)",
      "begin_line": 202,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.compareTo(org.apache.commons.math.util.BigReal)",
      "begin_line": 207,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.equals(java.lang.Object)",
      "begin_line": 212,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.hashCode()",
      "begin_line": 225,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.BigReal.getField()",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 42)"
      ]
    }
  ]
}