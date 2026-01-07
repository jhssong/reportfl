{
  "filepath": "/tmp/Math-5b/src/main/java/org/apache/commons/math3/util/Decimal64.java",
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
      "end_line": 599,
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
      "begin_line": 307,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.add(double)",
      "begin_line": 312,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.subtract(double)",
      "begin_line": 317,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.multiply(double)",
      "begin_line": 322,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.divide(double)",
      "begin_line": 327,
      "end_line": 329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.remainder(double)",
      "begin_line": 332,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.remainder(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 337,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.abs()",
      "begin_line": 342,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.ceil()",
      "begin_line": 347,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.floor()",
      "begin_line": 352,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.rint()",
      "begin_line": 357,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.round()",
      "begin_line": 362,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.signum()",
      "begin_line": 367,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.copySign(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 372,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.copySign(double)",
      "begin_line": 377,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.scalb(int)",
      "begin_line": 382,
      "end_line": 384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.hypot(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 387,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.sqrt()",
      "begin_line": 392,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.cbrt()",
      "begin_line": 397,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.rootN(int)",
      "begin_line": 402,
      "end_line": 408,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.pow(double)",
      "begin_line": 411,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.pow(int)",
      "begin_line": 416,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.pow(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 421,
      "end_line": 423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.exp()",
      "begin_line": 426,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.expm1()",
      "begin_line": 431,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.log()",
      "begin_line": 436,
      "end_line": 438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.log1p()",
      "begin_line": 441,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.log10()",
      "begin_line": 448,
      "end_line": 450,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.cos()",
      "begin_line": 453,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.sin()",
      "begin_line": 458,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.tan()",
      "begin_line": 463,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.acos()",
      "begin_line": 468,
      "end_line": 470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.asin()",
      "begin_line": 473,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.atan()",
      "begin_line": 478,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.atan2(org.apache.commons.math3.util.Decimal64)",
      "begin_line": 483,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.cosh()",
      "begin_line": 488,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.sinh()",
      "begin_line": 493,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.tanh()",
      "begin_line": 498,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.acosh()",
      "begin_line": 503,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.asinh()",
      "begin_line": 508,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.atanh()",
      "begin_line": 513,
      "end_line": 515,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64[], org.apache.commons.math3.util.Decimal64[])",
      "begin_line": 518,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 54)",
        "(line 524,col 9)-(line 524,col 54)",
        "(line 525,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double[], org.apache.commons.math3.util.Decimal64[])",
      "begin_line": 533,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 54)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 546,
      "end_line": 550,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 549,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 553,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 556,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 560,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 563,col 9)-(line 565,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 569,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 578,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 582,col 9)-(line 585,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Decimal64.linearCombination(double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64, double, org.apache.commons.math3.util.Decimal64)",
      "begin_line": 589,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 596,col 73)"
      ]
    }
  ]
}