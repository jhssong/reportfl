{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 1041,
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
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " 2 \u0026pi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 66,
      "end_line": 72,
      "comment": "\n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Add two long integers, checking for overflow.\n     * \n     * @param a an addend\n     * @param b an addend\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long, java.lang.String)",
      "begin_line": 99,
      "end_line": 132,
      "comment": "\n     * Add two long integers, checking for overflow.\n     * \n     * @param a an addend\n     * @param b an addend\n     * @param msg the message to use for any thrown exception.\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 17)",
        "(line 101,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 160,
      "end_line": 182,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are\n     * \u003ccode\u003e \u003c Long.MAX_VALUE\u003c/code\u003e is 66. If the computed value exceeds\n     * \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e an \u003ccode\u003eArithMeticException\n     *      \u003c/code\u003e is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 66)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 228,
      "end_line": 256,
      "comment": "\n     * Returns the natural \u003ccode\u003elog\u003c/code\u003e of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns true iff both arguments are NaN or neither is NaN and they are\n     * equal\n     * \n     * @param x first value\n     * @param y second value\n     * @return true if the values are equal or both are NaN\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double[], double[])",
      "begin_line": 291,
      "end_line": 304,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions\n     * and all their elements are {@link #equals(double,double) equals}\n     * \n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 328,
      "end_line": 335,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Long.MAX_VALUE\u003c/code\u003e is 20. If the computed value exceeds \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e\n     * an \u003ccode\u003eArithMeticException \u003c/code\u003e is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 53)",
        "(line 330,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 357,
      "end_line": 362,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e as a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Double.MAX_VALUE\u003c/code\u003e is 170. If the computed value exceeds\n     * Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 377,
      "end_line": 386,
      "comment": "\n     * Returns the natural logarithm of n!.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 26)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 401,
      "end_line": 450,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * \n     * @param u a non-zero number\n     * @param v a non-zero number\n     * @return the greatest common divisor, never zero\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 417,col 18)",
        "(line 418,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 429,col 9)-(line 429,col 54)",
        "(line 432,col 9)-(line 448,col 25)",
        "(line 449,col 9)-(line 449,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 458,
      "end_line": 461,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     * \n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 51)",
        "(line 460,col 9)-(line 460,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 470,
      "end_line": 479,
      "comment": "\n     * Returns an integer hash code representing the given double array value.\n     * \n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 34)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 500,
      "end_line": 505,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is\n     * \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 514,
      "end_line": 519,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     * \n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     * \n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     * \n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Returns the least common multiple between two integer values.\n     * \n     * @param a the first integer value.\n     * @param b the second integer value.\n     * @return the least common multiple between a and b.\n     * @throws ArithmeticException if the lcm is too large to store as an int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 581,
      "end_line": 583,
      "comment": " \n     * \u003cp\u003eReturns the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base \u003ccode\u003eb\u003c/code\u003e of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns \u003ccode\u003eNaN\u003ccode\u003e if either argument is negative.  If \n     * \u003ccode\u003ebase\u003c/code\u003e is 0 and \u003ccode\u003ex\u003c/code\u003e is positive, 0 is returned.\n     * If \u003ccode\u003ebase\u003c/code\u003e is positive and \u003ccode\u003ex\u003c/code\u003e is 0, \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e is returned.  If both arguments\n     * are 0, the result is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 595,
      "end_line": 601,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 39)",
        "(line 597,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(long, long)",
      "begin_line": 613,
      "end_line": 656,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     * \n     * @param a first value\n     * @param b second value\n     * @return the product \u003ccode\u003ea * b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 17)",
        "(line 615,col 9)-(line 615,col 42)",
        "(line 616,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.nextAfter(double, double)",
      "begin_line": 675,
      "end_line": 713,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     * \n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 682,col 9)",
        "(line 687,col 9)-(line 687,col 51)",
        "(line 688,col 9)-(line 688,col 51)",
        "(line 689,col 9)-(line 689,col 51)",
        "(line 690,col 9)-(line 690,col 51)",
        "(line 692,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, Math.PI);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, 0.0);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       \u003ccode\u003eangle \u003d MathUtils.normalizeAngle(end, start) - start;\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 735,col 10)-(line 735,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 763,
      "end_line": 776,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 775,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 787,
      "end_line": 789,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounding using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 803,
      "end_line": 807,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 34)",
        "(line 805,col 9)-(line 805,col 60)",
        "(line 806,col 9)-(line 806,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 821,
      "end_line": 890,
      "comment": "\n     * Round the given non-negative, value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     * \n     * @param unscaled the value to round.\n     * @param sign the sign of the original, scaled value.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 902,
      "end_line": 904,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 918,
      "end_line": 923,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a double value \u003ccode\u003ex\u003c/code\u003e, this method returns\n     * \u003ccode\u003e+1.0\u003c/code\u003e if \u003ccode\u003ex \u003e 0\u003c/code\u003e, \u003ccode\u003e0.0\u003c/code\u003e if\n     * \u003ccode\u003ex \u003d 0.0\u003c/code\u003e, and \u003ccode\u003e-1.0\u003c/code\u003e if \u003ccode\u003ex \u003c 0\u003c/code\u003e.\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 922,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 936,
      "end_line": 941,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 953,
      "end_line": 955,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 967,
      "end_line": 969,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 982,
      "end_line": 984,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for short value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a short value x, this method returns (short)(+1) if x \u003e 0, (short)(0)\n     * if x \u003d 0, and (short)(-1) if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a short\n     * @return (short)(+1), (short)(0), or (short)(-1), depending on the sign of\n     *         x\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 993,
      "end_line": 995,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic sine\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 1007,
      "end_line": 1013,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 35)",
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(long, long)",
      "begin_line": 1025,
      "end_line": 1039,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     * \n     * @param a first value\n     * @param b second value\n     * @return the difference \u003ccode\u003ea-b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 17)",
        "(line 1027,col 9)-(line 1027,col 42)",
        "(line 1028,col 9)-(line 1037,col 9)",
        "(line 1038,col 9)-(line 1038,col 19)"
      ]
    }
  ]
}