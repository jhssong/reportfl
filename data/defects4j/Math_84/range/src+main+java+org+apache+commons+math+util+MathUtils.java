{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 1598,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Smallest positive number such that 1 - EPSILON is not numerically equal to 1. "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Safe minimum, such that 1 / SAFE_MIN does not overflow.\n     * \u003cp\u003eIn IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " 2 \u0026pi;. "
    },
    {
      "type": "field",
      "varNames": [
        "NAN_GAP"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Gap between NaN and regular numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Add two long integers, checking for overflow.\n     * \n     * @param a an addend\n     * @param b an addend\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long, java.lang.String)",
      "begin_line": 118,
      "end_line": 151,
      "comment": "\n     * Add two long integers, checking for overflow.\n     * \n     * @param a an addend\n     * @param b an addend\n     * @param msg the message to use for any thrown exception.\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 17)",
        "(line 120,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 178,
      "end_line": 224,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are\n     * \u003ccode\u003e \u003c Long.MAX_VALUE\u003c/code\u003e is 66. If the computed value exceeds\n     * \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e an \u003ccode\u003eArithMeticException\u003c/code\u003e is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 28)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 188,col 49)",
        "(line 195,col 9)-(line 195,col 24)",
        "(line 196,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 248,
      "end_line": 269,
      "comment": "\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 28)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 27)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 289,
      "end_line": 334,
      "comment": "\n     * Returns the natural \u003ccode\u003elog\u003c/code\u003e of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 28)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 321,col 9)-(line 321,col 26)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkBinomial(int, int)",
      "begin_line": 342,
      "end_line": 354,
      "comment": "\n     * Check binomial preconditions.\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @exception IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, double)",
      "begin_line": 366,
      "end_line": 373,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * \n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n     * Returns true iff both arguments are NaN or neither is NaN and they are\n     * equal\n     * \n     * @param x first value\n     * @param y second value\n     * @return true if the values are equal or both are NaN\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, double)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Returns true iff both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * \u003cp\u003e\n     * Two NaNs are considered equals, as are two infinities with same sign.\n     * \u003c/p\u003e\n     * \n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow\n     * @return true if the values are equal or within range of each other\n     ",
      "child_ranges": [
        "(line 411,col 7)-(line 411,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, int)",
      "begin_line": 428,
      "end_line": 445,
      "comment": "\n     * Returns true iff both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are less than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 48)",
        "(line 433,col 9)-(line 433,col 47)",
        "(line 434,col 9)-(line 434,col 47)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double[], double[])",
      "begin_line": 457,
      "end_line": 470,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions\n     * and all their elements are {@link #equals(double,double) equals}\n     * \n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factorials"
      ],
      "begin_line": 473,
      "end_line": 477,
      "comment": " All long-representable factorials "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 501,
      "end_line": 512,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Long.MAX_VALUE\u003c/code\u003e is 20. If the computed value exceeds \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e\n     * an \u003ccode\u003eArithMeticException \u003c/code\u003e is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 534,
      "end_line": 544,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e as a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Double.MAX_VALUE\u003c/code\u003e is 170. If the computed value exceeds\n     * Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 559,
      "end_line": 573,
      "comment": "\n     * Returns the natural logarithm of n!.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 26)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 605,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, Integer.MIN_VALUE)\u003c/code\u003e,\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, 0)\u003c/code\u003e and\n     * \u003ccode\u003egcd(0, Integer.MIN_VALUE)\u003c/code\u003e throw an\n     * \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003egcd(x, x)\u003c/code\u003e, \u003ccode\u003egcd(0, x)\u003c/code\u003e and\n     * \u003ccode\u003egcd(x, 0)\u003c/code\u003e is the absolute value of \u003ccode\u003ex\u003c/code\u003e, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation \u003ccode\u003egcd(0, 0)\u003c/code\u003e is the only one which returns\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param p any number\n     * @param q any number\n     * @return the greatest common divisor, never negative\n     * @throws ArithmeticException\n     *             if the result cannot be represented as a nonnegative int\n     *             value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 18)",
        "(line 607,col 9)-(line 607,col 18)",
        "(line 608,col 9)-(line 615,col 9)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 628,col 18)",
        "(line 629,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 639,col 9)",
        "(line 642,col 9)-(line 642,col 54)",
        "(line 645,col 9)-(line 661,col 25)",
        "(line 662,col 9)-(line 662,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 671,
      "end_line": 673,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     * \n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 682,
      "end_line": 684,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     * \n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 705,
      "end_line": 710,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is\n     * \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 719,
      "end_line": 724,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 723,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 732,
      "end_line": 734,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     * \n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 742,
      "end_line": 744,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     * \n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     * \n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 780,
      "end_line": 789,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula \u003ccode\u003elcm(a,b) \u003d (a / gcd(a,b)) * b\u003c/code\u003e.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations \u003ccode\u003elcm(Integer.MIN_VALUE, n)\u003c/code\u003e and\n     * \u003ccode\u003elcm(n, Integer.MIN_VALUE)\u003c/code\u003e, where \u003ccode\u003eabs(n)\u003c/code\u003e is a\n     * power of 2, throw an \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003elcm(0, x)\u003c/code\u003e and \u003ccode\u003elcm(x, 0)\u003c/code\u003e is\n     * \u003ccode\u003e0\u003c/code\u003e for any \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/ul\u003e\n     * \n     * @param a any number\n     * @param b any number\n     * @return the least common multiple, never negative\n     * @throws ArithmeticException\n     *             if the result cannot be represented as a nonnegative int\n     *             value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 58)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 807,
      "end_line": 809,
      "comment": " \n     * \u003cp\u003eReturns the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base \u003ccode\u003eb\u003c/code\u003e of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns \u003ccode\u003eNaN\u003ccode\u003e if either argument is negative.  If \n     * \u003ccode\u003ebase\u003c/code\u003e is 0 and \u003ccode\u003ex\u003c/code\u003e is positive, 0 is returned.\n     * If \u003ccode\u003ebase\u003c/code\u003e is positive and \u003ccode\u003ex\u003c/code\u003e is 0, \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e is returned.  If both arguments\n     * are 0, the result is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 821,
      "end_line": 827,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 39)",
        "(line 823,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 826,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(long, long)",
      "begin_line": 839,
      "end_line": 882,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     * \n     * @param a first value\n     * @param b second value\n     * @return the product \u003ccode\u003ea * b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 17)",
        "(line 841,col 9)-(line 841,col 42)",
        "(line 842,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.nextAfter(double, double)",
      "begin_line": 901,
      "end_line": 939,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     * \n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 908,col 9)",
        "(line 913,col 9)-(line 913,col 51)",
        "(line 914,col 9)-(line 914,col 51)",
        "(line 915,col 9)-(line 915,col 51)",
        "(line 916,col 9)-(line 916,col 51)",
        "(line 918,col 9)-(line 937,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.scalb(double, int)",
      "begin_line": 950,
      "end_line": 966,
      "comment": "\n     * Scale a number by 2\u003csup\u003escaleFactor\u003c/sup\u003e.\n     * \u003cp\u003eIf \u003ccode\u003ed\u003c/code\u003e is 0 or NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     * \n     * @param d base number\n     * @param scaleFactor power of two by which d sould be multiplied\n     * @return d \u0026times; 2\u003csup\u003escaleFactor\u003c/sup\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 955,col 9)",
        "(line 958,col 9)-(line 958,col 57)",
        "(line 959,col 9)-(line 959,col 57)",
        "(line 960,col 9)-(line 960,col 57)",
        "(line 963,col 9)-(line 963,col 78)",
        "(line 964,col 9)-(line 964,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 987,
      "end_line": 989,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, Math.PI);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, 0.0);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       \u003ccode\u003eangle \u003d MathUtils.normalizeAngle(end, start) - start;\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 988,col 10)-(line 988,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 1016,
      "end_line": 1029,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1028,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 1040,
      "end_line": 1042,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounding using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 1056,
      "end_line": 1060,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 34)",
        "(line 1058,col 9)-(line 1058,col 60)",
        "(line 1059,col 9)-(line 1059,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 1074,
      "end_line": 1154,
      "comment": "\n     * Round the given non-negative, value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     * \n     * @param unscaled the value to round.\n     * @param sign the sign of the original, scaled value.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1152,col 9)",
        "(line 1153,col 9)-(line 1153,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 1166,
      "end_line": 1168,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1167,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 1182,
      "end_line": 1187,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a double value \u003ccode\u003ex\u003c/code\u003e, this method returns\n     * \u003ccode\u003e+1.0\u003c/code\u003e if \u003ccode\u003ex \u003e 0\u003c/code\u003e, \u003ccode\u003e0.0\u003c/code\u003e if\n     * \u003ccode\u003ex \u003d 0.0\u003c/code\u003e, and \u003ccode\u003e-1.0\u003c/code\u003e if \u003ccode\u003ex \u003c 0\u003c/code\u003e.\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 1200,
      "end_line": 1205,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 1217,
      "end_line": 1219,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 1231,
      "end_line": 1233,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1232,col 9)-(line 1232,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 1246,
      "end_line": 1248,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for short value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a short value x, this method returns (short)(+1) if x \u003e 0, (short)(0)\n     * if x \u003d 0, and (short)(-1) if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a short\n     * @return (short)(+1), (short)(0), or (short)(-1), depending on the sign of\n     *         x\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 1257,
      "end_line": 1259,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic sine\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 1271,
      "end_line": 1277,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 35)",
        "(line 1273,col 9)-(line 1275,col 9)",
        "(line 1276,col 9)-(line 1276,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(long, long)",
      "begin_line": 1289,
      "end_line": 1303,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     * \n     * @param a first value\n     * @param b second value\n     * @return the difference \u003ccode\u003ea-b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 17)",
        "(line 1291,col 9)-(line 1291,col 42)",
        "(line 1292,col 9)-(line 1301,col 9)",
        "(line 1302,col 9)-(line 1302,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, int)",
      "begin_line": 1312,
      "end_line": 1333,
      "comment": "\n     * Raise an int to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1319,col 9)",
        "(line 1321,col 9)-(line 1321,col 23)",
        "(line 1322,col 9)-(line 1322,col 23)",
        "(line 1323,col 9)-(line 1329,col 9)",
        "(line 1331,col 9)-(line 1331,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, long)",
      "begin_line": 1342,
      "end_line": 1363,
      "comment": "\n     * Raise an int to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1345,col 9)-(line 1349,col 9)",
        "(line 1351,col 9)-(line 1351,col 23)",
        "(line 1352,col 9)-(line 1352,col 23)",
        "(line 1353,col 9)-(line 1359,col 9)",
        "(line 1361,col 9)-(line 1361,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, int)",
      "begin_line": 1372,
      "end_line": 1393,
      "comment": "\n     * Raise a long to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1379,col 9)",
        "(line 1381,col 9)-(line 1381,col 25)",
        "(line 1382,col 9)-(line 1382,col 24)",
        "(line 1383,col 9)-(line 1389,col 9)",
        "(line 1391,col 9)-(line 1391,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, long)",
      "begin_line": 1402,
      "end_line": 1423,
      "comment": "\n     * Raise a long to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1405,col 9)-(line 1409,col 9)",
        "(line 1411,col 9)-(line 1411,col 25)",
        "(line 1412,col 9)-(line 1412,col 24)",
        "(line 1413,col 9)-(line 1419,col 9)",
        "(line 1421,col 9)-(line 1421,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, int)",
      "begin_line": 1432,
      "end_line": 1443,
      "comment": "\n     * Raise a BigInteger to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1435,col 9)-(line 1439,col 9)",
        "(line 1441,col 9)-(line 1441,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, long)",
      "begin_line": 1452,
      "end_line": 1473,
      "comment": "\n     * Raise a BigInteger to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1455,col 9)-(line 1459,col 9)",
        "(line 1461,col 9)-(line 1461,col 43)",
        "(line 1462,col 9)-(line 1462,col 30)",
        "(line 1463,col 9)-(line 1469,col 9)",
        "(line 1471,col 9)-(line 1471,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 1482,
      "end_line": 1503,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1489,col 9)",
        "(line 1491,col 9)-(line 1491,col 43)",
        "(line 1492,col 9)-(line 1492,col 30)",
        "(line 1493,col 9)-(line 1499,col 9)",
        "(line 1501,col 9)-(line 1501,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(double[], double[])",
      "begin_line": 1512,
      "end_line": 1518,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1513,col 23)",
        "(line 1514,col 9)-(line 1516,col 9)",
        "(line 1517,col 9)-(line 1517,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(int[], int[])",
      "begin_line": 1527,
      "end_line": 1533,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1528,col 7)-(line 1528,col 18)",
        "(line 1529,col 7)-(line 1531,col 7)",
        "(line 1532,col 7)-(line 1532,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(double[], double[])",
      "begin_line": 1542,
      "end_line": 1549,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1543,col 9)-(line 1543,col 23)",
        "(line 1544,col 9)-(line 1547,col 9)",
        "(line 1548,col 9)-(line 1548,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(int[], int[])",
      "begin_line": 1558,
      "end_line": 1565,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1559,col 7)-(line 1559,col 18)",
        "(line 1560,col 7)-(line 1563,col 7)",
        "(line 1564,col 7)-(line 1564,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(double[], double[])",
      "begin_line": 1574,
      "end_line": 1580,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1575,col 9)-(line 1575,col 23)",
        "(line 1576,col 9)-(line 1578,col 9)",
        "(line 1579,col 9)-(line 1579,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(int[], int[])",
      "begin_line": 1589,
      "end_line": 1595,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1590,col 9)-(line 1590,col 20)",
        "(line 1591,col 9)-(line 1593,col 9)",
        "(line 1594,col 9)-(line 1594,col 19)"
      ]
    }
  ]
}