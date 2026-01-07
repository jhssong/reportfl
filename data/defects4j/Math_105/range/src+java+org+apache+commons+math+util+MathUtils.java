{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 807,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 62,
      "end_line": 68,
      "comment": "\n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 35)",
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 96,
      "end_line": 118,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are\n     * \u003ccode\u003e \u003c Long.MAX_VALUE\u003c/code\u003e is 66. If the computed value exceeds\n     * \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e an \u003ccode\u003eArithMeticException\n     *      \u003c/code\u003e is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 66)",
        "(line 113,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 164,
      "end_line": 192,
      "comment": "\n     * Returns the natural \u003ccode\u003elog\u003c/code\u003e of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 26)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Returns true iff both arguments are NaN or neither is NaN and they are\n     * equal\n     * \n     * @param x first value\n     * @param y second value\n     * @return true if the values are equal or both are NaN\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Long.MAX_VALUE\u003c/code\u003e is 20. If the computed value exceeds \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e\n     * an \u003ccode\u003eArithMeticException \u003c/code\u003e is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 268,
      "end_line": 273,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e as a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Double.MAX_VALUE\u003c/code\u003e is 170. If the computed value exceeds\n     * Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 288,
      "end_line": 297,
      "comment": "\n     * Returns the natural logarithm of n!.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 26)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 312,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * \n     * @param u a non-zero number\n     * @param v a non-zero number\n     * @return the greatest common divisor, never zero\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 18)",
        "(line 329,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 340,col 9)-(line 340,col 54)",
        "(line 343,col 9)-(line 359,col 25)",
        "(line 360,col 9)-(line 360,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     * \n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 51)",
        "(line 371,col 9)-(line 371,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 393,
      "end_line": 398,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is\n     * \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 407,
      "end_line": 412,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     * \n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     * \n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     * \n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\n     * Returns the least common multiple between two integer values.\n     * \n     * @param a the first integer value.\n     * @param b the second integer value.\n     * @return the least common multiple between a and b.\n     * @throws ArithmeticException if the lcm is too large to store as an int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 468,
      "end_line": 474,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 39)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.nextAfter(double, double)",
      "begin_line": 492,
      "end_line": 530,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\n     * \n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 499,col 9)",
        "(line 504,col 9)-(line 504,col 51)",
        "(line 505,col 9)-(line 505,col 51)",
        "(line 506,col 9)-(line 506,col 51)",
        "(line 507,col 9)-(line 507,col 51)",
        "(line 509,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 557,
      "end_line": 570,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 569,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounding using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 597,
      "end_line": 601,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 34)",
        "(line 599,col 9)-(line 599,col 60)",
        "(line 600,col 9)-(line 600,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 615,
      "end_line": 683,
      "comment": "\n     * Round the given non-negative, value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     * \n     * @param unscaled the value to round.\n     * @param sign the sign of the original, scaled value.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 711,
      "end_line": 716,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a double value \u003ccode\u003ex\u003c/code\u003e, this method returns\n     * \u003ccode\u003e+1.0\u003c/code\u003e if \u003ccode\u003ex \u003e 0\u003c/code\u003e, \u003ccode\u003e0.0\u003c/code\u003e if\n     * \u003ccode\u003ex \u003d 0.0\u003c/code\u003e, and \u003ccode\u003e-1.0\u003c/code\u003e if \u003ccode\u003ex \u003c 0\u003c/code\u003e.\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 729,
      "end_line": 734,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 746,
      "end_line": 748,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\n     * \n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\n     * \n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for short value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a short value x, this method returns (short)(+1) if x \u003e 0, (short)(0)\n     * if x \u003d 0, and (short)(-1) if x \u003c 0.\n     * \n     * @param x the value, a short\n     * @return (short)(+1), (short)(0), or (short)(-1), depending on the sign of\n     *         x\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 786,
      "end_line": 788,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic sine\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 800,
      "end_line": 806,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 35)",
        "(line 802,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 22)"
      ]
    }
  ]
}