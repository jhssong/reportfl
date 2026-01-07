{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 1986,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Smallest positive number such that 1 - EPSILON is not numerically equal to 1. "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Safe minimum, such that 1 / SAFE_MIN does not overflow.\n     * \u003cp\u003eIn IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * 2 \u0026pi;.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "NAN_GAP"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Gap between NaN and regular numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 75,
      "end_line": 82,
      "comment": " All long-representable factorials "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 35)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long, org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 134,
      "end_line": 167,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @param pattern the pattern to use for any thrown exception.\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 17)",
        "(line 136,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 194,
      "end_line": 246,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are\n     * \u003ccode\u003e \u003c Long.MAX_VALUE\u003c/code\u003e is 66. If the computed value exceeds\n     * \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e an \u003ccode\u003eArithMeticException\u003c/code\u003e is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 28)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 204,col 49)",
        "(line 211,col 9)-(line 211,col 24)",
        "(line 212,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 270,
      "end_line": 291,
      "comment": "\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 28)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 27)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 311,
      "end_line": 356,
      "comment": "\n     * Returns the natural \u003ccode\u003elog\u003c/code\u003e of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 28)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 343,col 9)-(line 343,col 26)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkBinomial(int, int)",
      "begin_line": 364,
      "end_line": 376,
      "comment": "\n     * Check binomial preconditions.\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @exception IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, double)",
      "begin_line": 388,
      "end_line": 395,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     *\n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) this method}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, double)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, double)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, int)",
      "begin_line": 476,
      "end_line": 495,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or less) floating point numbers between them (i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are less than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 48)",
        "(line 481,col 9)-(line 481,col 47)",
        "(line 482,col 9)-(line 482,col 47)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 69)",
        "(line 494,col 9)-(line 494,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, int)",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) this method}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double[], double[])",
      "begin_line": 522,
      "end_line": 535,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equals(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double[], double[])",
      "begin_line": 547,
      "end_line": 560,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 584,
      "end_line": 595,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Long.MAX_VALUE\u003c/code\u003e is 20. If the computed value exceeds \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e\n     * an \u003ccode\u003eArithMeticException \u003c/code\u003e is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 617,
      "end_line": 627,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e as a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Double.MAX_VALUE\u003c/code\u003e is 170. If the computed value exceeds\n     * Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 642,
      "end_line": 656,
      "comment": "\n     * Returns the natural logarithm of n!.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 26)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 687,
      "end_line": 745,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, Integer.MIN_VALUE)\u003c/code\u003e,\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, 0)\u003c/code\u003e and\n     * \u003ccode\u003egcd(0, Integer.MIN_VALUE)\u003c/code\u003e throw an\n     * \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003egcd(x, x)\u003c/code\u003e, \u003ccode\u003egcd(0, x)\u003c/code\u003e and\n     * \u003ccode\u003egcd(x, 0)\u003c/code\u003e is the absolute value of \u003ccode\u003ex\u003c/code\u003e, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation \u003ccode\u003egcd(0, 0)\u003c/code\u003e is the only one which returns\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p any number\n     * @param q any number\n     * @return the greatest common divisor, never negative\n     * @throws ArithmeticException if the result cannot be represented as a\n     * nonnegative int value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 18)",
        "(line 689,col 9)-(line 689,col 18)",
        "(line 690,col 9)-(line 697,col 9)",
        "(line 703,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 18)",
        "(line 711,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 721,col 9)",
        "(line 724,col 9)-(line 724,col 54)",
        "(line 727,col 9)-(line 743,col 25)",
        "(line 744,col 9)-(line 744,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(long, long)",
      "begin_line": 776,
      "end_line": 834,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * \u003ccode\u003egcd(Long.MIN_VALUE, Long.MIN_VALUE)\u003c/code\u003e,\n     * \u003ccode\u003egcd(Long.MIN_VALUE, 0L)\u003c/code\u003e and\n     * \u003ccode\u003egcd(0L, Long.MIN_VALUE)\u003c/code\u003e throw an\n     * \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003egcd(x, x)\u003c/code\u003e, \u003ccode\u003egcd(0L, x)\u003c/code\u003e and\n     * \u003ccode\u003egcd(x, 0L)\u003c/code\u003e is the absolute value of \u003ccode\u003ex\u003c/code\u003e, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation \u003ccode\u003egcd(0L, 0L)\u003c/code\u003e is the only one which returns\n     * \u003ccode\u003e0L\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p any number\n     * @param q any number\n     * @return the greatest common divisor, never negative\n     * @throws ArithmeticException if the result cannot be represented as a nonnegative long\n     * value\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 19)",
        "(line 778,col 9)-(line 778,col 19)",
        "(line 779,col 9)-(line 786,col 9)",
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 797,col 9)",
        "(line 799,col 9)-(line 799,col 18)",
        "(line 800,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 810,col 9)",
        "(line 813,col 9)-(line 813,col 55)",
        "(line 816,col 9)-(line 832,col 25)",
        "(line 833,col 9)-(line 833,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 842,
      "end_line": 844,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     *\n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 853,
      "end_line": 855,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     *\n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 876,
      "end_line": 881,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is\n     * \u003ccode\u003eNaN\u003c/code\u003e.\n     *\n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 890,
      "end_line": 895,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     *\n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 903,
      "end_line": 905,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     *\n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     *\n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 924,
      "end_line": 926,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     *\n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 951,
      "end_line": 962,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula \u003ccode\u003elcm(a,b) \u003d (a / gcd(a,b)) * b\u003c/code\u003e.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations \u003ccode\u003elcm(Integer.MIN_VALUE, n)\u003c/code\u003e and\n     * \u003ccode\u003elcm(n, Integer.MIN_VALUE)\u003c/code\u003e, where \u003ccode\u003eabs(n)\u003c/code\u003e is a\n     * power of 2, throw an \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003elcm(0, x)\u003c/code\u003e and \u003ccode\u003elcm(x, 0)\u003c/code\u003e is\n     * \u003ccode\u003e0\u003c/code\u003e for any \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/ul\u003e\n     *\n     * @param a any number\n     * @param b any number\n     * @return the least common multiple, never negative\n     * @throws ArithmeticException\n     *             if the result cannot be represented as a nonnegative int\n     *             value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 62)",
        "(line 956,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 961,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(long, long)",
      "begin_line": 986,
      "end_line": 997,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula \u003ccode\u003elcm(a,b) \u003d (a / gcd(a,b)) * b\u003c/code\u003e.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations \u003ccode\u003elcm(Long.MIN_VALUE, n)\u003c/code\u003e and\n     * \u003ccode\u003elcm(n, Long.MIN_VALUE)\u003c/code\u003e, where \u003ccode\u003eabs(n)\u003c/code\u003e is a\n     * power of 2, throw an \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003elcm(0L, x)\u003c/code\u003e and \u003ccode\u003elcm(x, 0L)\u003c/code\u003e is\n     * \u003ccode\u003e0L\u003c/code\u003e for any \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/ul\u003e\n     *\n     * @param a any number\n     * @param b any number\n     * @return the least common multiple, never negative\n     * @throws ArithmeticException if the result cannot be represented as a nonnegative long\n     * value\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 63)",
        "(line 991,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 996,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 1015,
      "end_line": 1017,
      "comment": "\n     * \u003cp\u003eReturns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base \u003ccode\u003eb\u003c/code\u003e of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns \u003ccode\u003eNaN\u003ccode\u003e if either argument is negative.  If\n     * \u003ccode\u003ebase\u003c/code\u003e is 0 and \u003ccode\u003ex\u003c/code\u003e is positive, 0 is returned.\n     * If \u003ccode\u003ebase\u003c/code\u003e is positive and \u003ccode\u003ex\u003c/code\u003e is 0,\n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e is returned.  If both arguments\n     * are 0, the result is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 1029,
      "end_line": 1035,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 39)",
        "(line 1031,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1034,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(long, long)",
      "begin_line": 1047,
      "end_line": 1090,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a first value\n     * @param b second value\n     * @return the product \u003ccode\u003ea * b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 17)",
        "(line 1049,col 9)-(line 1049,col 42)",
        "(line 1050,col 9)-(line 1088,col 9)",
        "(line 1089,col 9)-(line 1089,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.scalb(double, int)",
      "begin_line": 1101,
      "end_line": 1117,
      "comment": "\n     * Scale a number by 2\u003csup\u003escaleFactor\u003c/sup\u003e.\n     * \u003cp\u003eIf \u003ccode\u003ed\u003c/code\u003e is 0 or NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param scaleFactor power of two by which d sould be multiplied\n     * @return d \u0026times; 2\u003csup\u003escaleFactor\u003c/sup\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1106,col 9)",
        "(line 1109,col 9)-(line 1109,col 57)",
        "(line 1110,col 9)-(line 1110,col 57)",
        "(line 1111,col 9)-(line 1111,col 57)",
        "(line 1114,col 9)-(line 1114,col 78)",
        "(line 1115,col 9)-(line 1115,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 1138,
      "end_line": 1140,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, FastMath.PI);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, 0.0);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       \u003ccode\u003eangle \u003d MathUtils.normalizeAngle(end, start) - start;\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1139,col 10)-(line 1139,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeArray(double[], double)",
      "begin_line": 1163,
      "end_line": 1196,
      "comment": "\n      * \u003cp\u003eNormalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if \u003ccode\u003enormalizedSum\u003c/code\u003e is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values input array to be normalized\n      * @param normalizedSum target sum for the normalized array\n      * @return normalized array\n      * @throws ArithmeticException if the input array contains infinite elements or sums to zero\n      * @throws IllegalArgumentException if the target sum is infinite or NaN\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1165,col 10)-(line 1168,col 10)",
        "(line 1169,col 10)-(line 1172,col 10)",
        "(line 1173,col 10)-(line 1173,col 25)",
        "(line 1174,col 10)-(line 1174,col 39)",
        "(line 1175,col 10)-(line 1175,col 40)",
        "(line 1176,col 10)-(line 1184,col 10)",
        "(line 1185,col 10)-(line 1187,col 10)",
        "(line 1188,col 10)-(line 1194,col 10)",
        "(line 1195,col 10)-(line 1195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 1207,
      "end_line": 1209,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1208,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 1223,
      "end_line": 1236,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 1247,
      "end_line": 1249,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounding using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1248,col 9)-(line 1248,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 1263,
      "end_line": 1267,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 34)",
        "(line 1265,col 9)-(line 1265,col 64)",
        "(line 1266,col 9)-(line 1266,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 1281,
      "end_line": 1360,
      "comment": "\n     * Round the given non-negative, value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled the value to round.\n     * @param sign the sign of the original, scaled value.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1283,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1359,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 1372,
      "end_line": 1374,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 1388,
      "end_line": 1393,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a double value \u003ccode\u003ex\u003c/code\u003e, this method returns\n     * \u003ccode\u003e+1.0\u003c/code\u003e if \u003ccode\u003ex \u003e 0\u003c/code\u003e, \u003ccode\u003e0.0\u003c/code\u003e if\n     * \u003ccode\u003ex \u003d 0.0\u003c/code\u003e, and \u003ccode\u003e-1.0\u003c/code\u003e if \u003ccode\u003ex \u003c 0\u003c/code\u003e.\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1389,col 9)-(line 1391,col 9)",
        "(line 1392,col 9)-(line 1392,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 1406,
      "end_line": 1411,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1407,col 9)-(line 1409,col 9)",
        "(line 1410,col 9)-(line 1410,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 1423,
      "end_line": 1425,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1424,col 9)-(line 1424,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 1437,
      "end_line": 1439,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 1452,
      "end_line": 1454,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for short value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a short value x, this method returns (short)(+1) if x \u003e 0, (short)(0)\n     * if x \u003d 0, and (short)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a short\n     * @return (short)(+1), (short)(0), or (short)(-1), depending on the sign of\n     *         x\n     ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1453,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 1463,
      "end_line": 1465,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of x.\n     *\n     * @param x double value for which to find the hyperbolic sine\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 1464,col 9)-(line 1464,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 1477,
      "end_line": 1483,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1478,col 9)-(line 1478,col 35)",
        "(line 1479,col 9)-(line 1481,col 9)",
        "(line 1482,col 9)-(line 1482,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(long, long)",
      "begin_line": 1495,
      "end_line": 1509,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a first value\n     * @param b second value\n     * @return the difference \u003ccode\u003ea-b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1496,col 9)-(line 1496,col 17)",
        "(line 1497,col 9)-(line 1497,col 42)",
        "(line 1498,col 9)-(line 1507,col 9)",
        "(line 1508,col 9)-(line 1508,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, int)",
      "begin_line": 1518,
      "end_line": 1539,
      "comment": "\n     * Raise an int to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1521,col 9)-(line 1525,col 9)",
        "(line 1527,col 9)-(line 1527,col 23)",
        "(line 1528,col 9)-(line 1528,col 23)",
        "(line 1529,col 9)-(line 1535,col 9)",
        "(line 1537,col 9)-(line 1537,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, long)",
      "begin_line": 1548,
      "end_line": 1569,
      "comment": "\n     * Raise an int to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1551,col 9)-(line 1555,col 9)",
        "(line 1557,col 9)-(line 1557,col 23)",
        "(line 1558,col 9)-(line 1558,col 23)",
        "(line 1559,col 9)-(line 1565,col 9)",
        "(line 1567,col 9)-(line 1567,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, int)",
      "begin_line": 1578,
      "end_line": 1599,
      "comment": "\n     * Raise a long to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1585,col 9)",
        "(line 1587,col 9)-(line 1587,col 25)",
        "(line 1588,col 9)-(line 1588,col 24)",
        "(line 1589,col 9)-(line 1595,col 9)",
        "(line 1597,col 9)-(line 1597,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, long)",
      "begin_line": 1608,
      "end_line": 1629,
      "comment": "\n     * Raise a long to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1615,col 9)",
        "(line 1617,col 9)-(line 1617,col 25)",
        "(line 1618,col 9)-(line 1618,col 24)",
        "(line 1619,col 9)-(line 1625,col 9)",
        "(line 1627,col 9)-(line 1627,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, int)",
      "begin_line": 1638,
      "end_line": 1649,
      "comment": "\n     * Raise a BigInteger to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1641,col 9)-(line 1645,col 9)",
        "(line 1647,col 9)-(line 1647,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, long)",
      "begin_line": 1658,
      "end_line": 1679,
      "comment": "\n     * Raise a BigInteger to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1661,col 9)-(line 1665,col 9)",
        "(line 1667,col 9)-(line 1667,col 43)",
        "(line 1668,col 9)-(line 1668,col 30)",
        "(line 1669,col 9)-(line 1675,col 9)",
        "(line 1677,col 9)-(line 1677,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 1688,
      "end_line": 1709,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1691,col 9)-(line 1695,col 9)",
        "(line 1697,col 9)-(line 1697,col 43)",
        "(line 1698,col 9)-(line 1698,col 30)",
        "(line 1699,col 9)-(line 1705,col 9)",
        "(line 1707,col 9)-(line 1707,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(double[], double[])",
      "begin_line": 1718,
      "end_line": 1724,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1719,col 9)-(line 1719,col 23)",
        "(line 1720,col 9)-(line 1722,col 9)",
        "(line 1723,col 9)-(line 1723,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(int[], int[])",
      "begin_line": 1733,
      "end_line": 1739,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1734,col 7)-(line 1734,col 18)",
        "(line 1735,col 7)-(line 1737,col 7)",
        "(line 1738,col 7)-(line 1738,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(double[], double[])",
      "begin_line": 1748,
      "end_line": 1755,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1749,col 9)-(line 1749,col 23)",
        "(line 1750,col 9)-(line 1753,col 9)",
        "(line 1754,col 9)-(line 1754,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(int[], int[])",
      "begin_line": 1764,
      "end_line": 1771,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1765,col 7)-(line 1765,col 21)",
        "(line 1766,col 7)-(line 1769,col 7)",
        "(line 1770,col 7)-(line 1770,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(double[], double[])",
      "begin_line": 1780,
      "end_line": 1786,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1781,col 9)-(line 1781,col 23)",
        "(line 1782,col 9)-(line 1784,col 9)",
        "(line 1785,col 9)-(line 1785,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(int[], int[])",
      "begin_line": 1795,
      "end_line": 1801,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1796,col 9)-(line 1796,col 20)",
        "(line 1797,col 9)-(line 1799,col 9)",
        "(line 1800,col 9)-(line 1800,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[], org.apache.commons.math.util.MathUtils.OrderDirection, boolean)",
      "begin_line": 1821,
      "end_line": 1860,
      "comment": "\n     * Checks that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonousSequenceException if the array is not sorted.\n     ",
      "child_ranges": [
        "(line 1822,col 9)-(line 1822,col 33)",
        "(line 1823,col 9)-(line 1823,col 26)",
        "(line 1825,col 9)-(line 1825,col 29)",
        "(line 1826,col 9)-(line 1859,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[])",
      "begin_line": 1868,
      "end_line": 1870,
      "comment": "\n     * Checks that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonousSequenceException if the array is not sorted.\n     ",
      "child_ranges": [
        "(line 1869,col 9)-(line 1869,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.safeNorm(double[])",
      "begin_line": 1931,
      "end_line": 1984,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available \u003ca\n     * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n     * is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     \u003ccode\u003eThis product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v vector of doubles\n     * @return the 2-norm of the vector\n     ",
      "child_ranges": [
        "(line 1932,col 5)-(line 1932,col 30)",
        "(line 1933,col 5)-(line 1933,col 30)",
        "(line 1934,col 5)-(line 1934,col 18)",
        "(line 1935,col 5)-(line 1935,col 18)",
        "(line 1936,col 5)-(line 1936,col 18)",
        "(line 1937,col 5)-(line 1937,col 23)",
        "(line 1938,col 5)-(line 1938,col 23)",
        "(line 1939,col 5)-(line 1939,col 37)",
        "(line 1940,col 5)-(line 1940,col 34)",
        "(line 1941,col 5)-(line 1968,col 5)",
        "(line 1969,col 5)-(line 1969,col 16)",
        "(line 1970,col 5)-(line 1982,col 5)",
        "(line 1983,col 5)-(line 1983,col 16)"
      ]
    }
  ]
}