{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/Decimal64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Decimal64",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "org.apache.commons.math3.RealFieldElement\u003corg.apache.commons.math3.util.Decimal64\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math3.util.Decimal64\u003e"
      ],
      "begin_line": 31,
      "end_line": 696,
      "comment": "\n * This class wraps a {@code double} value in an object. It is similar to the\n * standard class {@link Double}, while also implementing the\n * {@link RealFieldElement} interface.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The constant value of {@code 0d} as a {@code Decimal64}. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The constant value of {@code 1d} as a {@code Decimal64}. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The constant value of {@link Double#NEGATIVE_INFINITY} as a\n     * {@code Decimal64}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The constant value of {@link Double#POSITIVE_INFINITY} as a\n     * {@code Decimal64}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NAN"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The constant value of {@link Double#NaN} as a {@code Decimal64}. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The primitive {@code double} value of this object. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Decimal64.Decimal64(double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param x the primitive {@code double} value of the object to be created\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.getField()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.add(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.add(a).equals(new Decimal64(this.doubleValue()\n     * + a.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.subtract(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.subtract(a).equals(new Decimal64(this.doubleValue()\n     * - a.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.negate()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.negate().equals(new Decimal64(-this.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.multiply(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.multiply(a).equals(new Decimal64(this.doubleValue()\n     * * a.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.multiply(int)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.multiply(n).equals(new Decimal64(n * this.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.divide(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.divide(a).equals(new Decimal64(this.doubleValue()\n     * / a.doubleValue()))}.\n     *\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.reciprocal()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation strictly enforces\n     * {@code this.reciprocal().equals(new Decimal64(1.0\n     * / this.doubleValue()))}.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.byteValue()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code byte}.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.shortValue()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code short}.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.intValue()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code int}.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.longValue()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code long}.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.floatValue()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation performs casting to a {@code float}.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.doubleValue()",
      "begin_line": 218,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.compareTo(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation returns the same value as\n     * \u003ccenter\u003e {@code new Double(this.doubleValue()).compareTo(new\n     * Double(o.doubleValue()))} \u003c/center\u003e\n     *\n     * @see Double#compareTo(Double)\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.hashCode()",
      "begin_line": 263,
      "end_line": 267,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The current implementation returns the same value as\n     * {@code new Double(this.doubleValue()).hashCode()}\n     *\n     * @see Double#hashCode()\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 48)",
        "(line 266,col 9)-(line 266,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.toString()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The returned {@code String} is equal to\n     * {@code Double.toString(this.doubleValue())}\n     *\n     * @see Double#toString(double)\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.isInfinite()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Returns {@code true} if {@code this} double precision number is infinite\n     * ({@link Double#POSITIVE_INFINITY} or {@link Double#NEGATIVE_INFINITY}).\n     *\n     * @return {@code true} if {@code this} number is infinite\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.isNaN()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Returns {@code true} if {@code this} double precision number is\n     * Not-a-Number ({@code NaN}), false otherwise.\n     *\n     * @return {@code true} if {@code this} is {@code NaN}\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.getReal()",
      "begin_line": 309,
      "end_line": 311,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.add(double)",
      "begin_line": 316,
      "end_line": 318,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.subtract(double)",
      "begin_line": 323,
      "end_line": 325,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.multiply(double)",
      "begin_line": 330,
      "end_line": 332,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.divide(double)",
      "begin_line": 337,
      "end_line": 339,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.remainder(double)",
      "begin_line": 344,
      "end_line": 346,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.remainder(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 351,
      "end_line": 353,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.abs()",
      "begin_line": 358,
      "end_line": 360,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.ceil()",
      "begin_line": 365,
      "end_line": 367,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.floor()",
      "begin_line": 372,
      "end_line": 374,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.rint()",
      "begin_line": 379,
      "end_line": 381,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.round()",
      "begin_line": 386,
      "end_line": 388,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.signum()",
      "begin_line": 393,
      "end_line": 395,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.copySign(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 400,
      "end_line": 402,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.copySign(double)",
      "begin_line": 407,
      "end_line": 409,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.scalb(int)",
      "begin_line": 414,
      "end_line": 416,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.hypot(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 421,
      "end_line": 423,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.sqrt()",
      "begin_line": 428,
      "end_line": 430,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.cbrt()",
      "begin_line": 435,
      "end_line": 437,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.rootN(int)",
      "begin_line": 442,
      "end_line": 448,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.pow(double)",
      "begin_line": 453,
      "end_line": 455,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.pow(int)",
      "begin_line": 460,
      "end_line": 462,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.pow(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 467,
      "end_line": 469,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.exp()",
      "begin_line": 474,
      "end_line": 476,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.expm1()",
      "begin_line": 481,
      "end_line": 483,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.log()",
      "begin_line": 488,
      "end_line": 490,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.log1p()",
      "begin_line": 495,
      "end_line": 497,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.log10()",
      "begin_line": 503,
      "end_line": 505,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.cos()",
      "begin_line": 510,
      "end_line": 512,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.sin()",
      "begin_line": 517,
      "end_line": 519,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.tan()",
      "begin_line": 524,
      "end_line": 526,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.acos()",
      "begin_line": 531,
      "end_line": 533,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.asin()",
      "begin_line": 538,
      "end_line": 540,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.atan()",
      "begin_line": 545,
      "end_line": 547,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.atan2(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 552,
      "end_line": 554,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.cosh()",
      "begin_line": 559,
      "end_line": 561,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.sinh()",
      "begin_line": 566,
      "end_line": 568,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.tanh()",
      "begin_line": 573,
      "end_line": 575,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.acosh()",
      "begin_line": 580,
      "end_line": 582,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.asinh()",
      "begin_line": 587,
      "end_line": 589,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.atanh()",
      "begin_line": 594,
      "end_line": 596,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64[], org.apache.commons.math3.util.Decimal64[])",
      "begin_line": 601,
      "end_line": 613,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 54)",
        "(line 607,col 9)-(line 607,col 54)",
        "(line 608,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double[], org.apache.commons.math3.util.Decimal64[])",
      "begin_line": 618,
      "end_line": 628,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 54)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 633,
      "end_line": 637,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 636,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 642,
      "end_line": 646,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 645,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 651,
      "end_line": 657,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 656,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 662,
      "end_line": 668,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 667,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 673,
      "end_line": 681,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 680,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 686,
      "end_line": 694,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 693,col 73)"
      ]
    }
  ]
}