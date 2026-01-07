{
  "filepath": "/tmp/Math-12b/src/main/java/org/apache/commons/math3/util/Decimal64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Decimal64",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "org.apache.commons.math3.FieldElement\u003corg.apache.commons.math3.util.Decimal64\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math3.util.Decimal64\u003e"
      ],
      "begin_line": 30,
      "end_line": 304,
      "comment": "\n * This class wraps a {@code double} value in an object. It is similar to the\n * standard class {@link Double}, while also implementing the\n * {@link FieldElement} interface.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The constant value of {@code 0d} as a {@code Decimal64}. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The constant value of {@code 1d} as a {@code Decimal64}. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The constant value of {@link Double#NEGATIVE_INFINITY} as a\n     * {@code Decimal64}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * The constant value of {@link Double#POSITIVE_INFINITY} as a\n     * {@code Decimal64}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NAN"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The constant value of {@link Double#NaN} as a {@code Decimal64}. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The primitive {@code double} value of this object. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Decimal64.Decimal64(double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param x the primitive {@code double} value of the object to be created\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.getField()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.add(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.add(a).equals(new Decimal64(this.doubleValue()\n     * + a.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.subtract(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.subtract(a).equals(new Decimal64(this.doubleValue()\n     * - a.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.negate()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.negate().equals(new Decimal64(-this.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.multiply(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.multiply(a).equals(new Decimal64(this.doubleValue()\n     * * a.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.multiply(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.multiply(n).equals(new Decimal64(n * this.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.divide(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.divide(a).equals(new Decimal64(this.doubleValue()\n     * / a.doubleValue()))}.\n     *\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.reciprocal()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.reciprocal().equals(new Decimal64(1.0\n     * / this.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.byteValue()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code byte}.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.shortValue()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code short}.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.intValue()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code int}.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.longValue()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code long}.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.floatValue()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code float}.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.doubleValue()",
      "begin_line": 217,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.compareTo(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation returns the same value as\n     * \u003ccenter\u003e {@code new Double(this.doubleValue()).compareTo(new\n     * Double(o.doubleValue()))} \u003c/center\u003e\n     *\n     * @see Double#compareTo(Double)\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.equals(java.lang.Object)",
      "begin_line": 244,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.hashCode()",
      "begin_line": 262,
      "end_line": 266,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation returns the same value as\n     * {@code new Double(this.doubleValue()).hashCode()}\n     *\n     * @see Double#hashCode()\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 48)",
        "(line 265,col 9)-(line 265,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.toString()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The returned {@code String} is equal to\n     * {@code Double.toString(this.doubleValue())}\n     *\n     * @see Double#toString(double)\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.isInfinite()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Returns {@code true} if {@code this} double precision number is infinite\n     * ({@link Double#POSITIVE_INFINITY} or {@link Double#NEGATIVE_INFINITY}).\n     *\n     * @return {@code true} if {@code this} number is infinite\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.isNaN()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * Returns {@code true} if {@code this} double precision number is\n     * Not-a-Number ({@code NaN}), false otherwise.\n     *\n     * @return {@code true} if {@code this} is {@code NaN}\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 35)"
      ]
    }
  ]
}