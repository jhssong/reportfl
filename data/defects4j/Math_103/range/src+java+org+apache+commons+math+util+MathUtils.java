{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 827,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 63,
      "end_line": 69,
      "comment": "\n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 35)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 97,
      "end_line": 119,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are\n     * \u003ccode\u003e \u003c Long.MAX_VALUE\u003c/code\u003e is 66. If the computed value exceeds\n     * \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e an \u003ccode\u003eArithMeticException\n     *      \u003c/code\u003e is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 66)",
        "(line 114,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 136,
      "end_line": 138,
      "comment": " \n     * \u003cp\u003eReturns the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base \u003ccode\u003eb\u003c/code\u003e of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns \u003ccode\u003eNaN\u003ccode\u003e if either argument is negative.  If \n     * \u003ccode\u003ebase\u003c/code\u003e is 0 and \u003ccode\u003ex\u003c/code\u003e is positive, 0 is returned.\n     * If \u003ccode\u003ebase\u003c/code\u003e is positive and \u003ccode\u003ex\u003c/code\u003e is 0, \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e is returned.  If both arguments\n     * are 0, the result is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     ",
      "child_ranges": [
        "(line 137,col 6)-(line 137,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 184,
      "end_line": 212,
      "comment": "\n     * Returns the natural \u003ccode\u003elog\u003c/code\u003e of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 26)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Returns true iff both arguments are NaN or neither is NaN and they are\n     * equal\n     * \n     * @param x first value\n     * @param y second value\n     * @return true if the values are equal or both are NaN\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 259,
      "end_line": 266,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Long.MAX_VALUE\u003c/code\u003e is 20. If the computed value exceeds \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e\n     * an \u003ccode\u003eArithMeticException \u003c/code\u003e is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 53)",
        "(line 261,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 288,
      "end_line": 293,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e as a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Double.MAX_VALUE\u003c/code\u003e is 170. If the computed value exceeds\n     * Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 308,
      "end_line": 317,
      "comment": "\n     * Returns the natural logarithm of n!.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 26)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 332,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * \n     * @param u a non-zero number\n     * @param v a non-zero number\n     * @return the greatest common divisor, never zero\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 18)",
        "(line 349,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 54)",
        "(line 363,col 9)-(line 379,col 25)",
        "(line 380,col 9)-(line 380,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     * \n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 51)",
        "(line 391,col 9)-(line 391,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 413,
      "end_line": 418,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is\n     * \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 427,
      "end_line": 432,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     * \n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     * \n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     * \n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Returns the least common multiple between two integer values.\n     * \n     * @param a the first integer value.\n     * @param b the second integer value.\n     * @return the least common multiple between a and b.\n     * @throws ArithmeticException if the lcm is too large to store as an int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 488,
      "end_line": 494,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 39)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.nextAfter(double, double)",
      "begin_line": 512,
      "end_line": 550,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\n     * \n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 519,col 9)",
        "(line 524,col 9)-(line 524,col 51)",
        "(line 525,col 9)-(line 525,col 51)",
        "(line 526,col 9)-(line 526,col 51)",
        "(line 527,col 9)-(line 527,col 51)",
        "(line 529,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 577,
      "end_line": 590,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 589,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounding using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 617,
      "end_line": 621,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 34)",
        "(line 619,col 9)-(line 619,col 60)",
        "(line 620,col 9)-(line 620,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 635,
      "end_line": 703,
      "comment": "\n     * Round the given non-negative, value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     * \n     * @param unscaled the value to round.\n     * @param sign the sign of the original, scaled value.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 731,
      "end_line": 736,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a double value \u003ccode\u003ex\u003c/code\u003e, this method returns\n     * \u003ccode\u003e+1.0\u003c/code\u003e if \u003ccode\u003ex \u003e 0\u003c/code\u003e, \u003ccode\u003e0.0\u003c/code\u003e if\n     * \u003ccode\u003ex \u003d 0.0\u003c/code\u003e, and \u003ccode\u003e-1.0\u003c/code\u003e if \u003ccode\u003ex \u003c 0\u003c/code\u003e.\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 749,
      "end_line": 754,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\n     * \n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\n     * \n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for short value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a short value x, this method returns (short)(+1) if x \u003e 0, (short)(0)\n     * if x \u003d 0, and (short)(-1) if x \u003c 0.\n     * \n     * @param x the value, a short\n     * @return (short)(+1), (short)(0), or (short)(-1), depending on the sign of\n     *         x\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic sine\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 820,
      "end_line": 826,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 35)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 22)"
      ]
    }
  ]
}