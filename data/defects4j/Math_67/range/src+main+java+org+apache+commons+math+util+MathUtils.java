{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 1953,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Smallest positive number such that 1 - EPSILON is not numerically equal to 1. "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Safe minimum, such that 1 / SAFE_MIN does not overflow.\n     * \u003cp\u003eIn IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * 2 \u0026pi;.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "NAN_GAP"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Gap between NaN and regular numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 73,
      "end_line": 80,
      "comment": " All long-representable factorials "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long, java.lang.String)",
      "begin_line": 132,
      "end_line": 165,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @param msg the message to use for any thrown exception.\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 17)",
        "(line 134,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 192,
      "end_line": 244,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are\n     * \u003ccode\u003e \u003c Long.MAX_VALUE\u003c/code\u003e is 66. If the computed value exceeds\n     * \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e an \u003ccode\u003eArithMeticException\u003c/code\u003e is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 28)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 202,col 49)",
        "(line 209,col 9)-(line 209,col 24)",
        "(line 210,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 268,
      "end_line": 289,
      "comment": "\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 28)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 27)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 309,
      "end_line": 354,
      "comment": "\n     * Returns the natural \u003ccode\u003elog\u003c/code\u003e of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 28)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 341,col 9)-(line 341,col 26)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkBinomial(int, int)",
      "begin_line": 362,
      "end_line": 374,
      "comment": "\n     * Check binomial preconditions.\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @exception IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, double)",
      "begin_line": 386,
      "end_line": 393,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     *\n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) this method}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     * @deprecated This method considers that {@code NaN \u003d\u003d NaN}. In release\n     * 3.0, the semantics will change in order to comply with IEEE754 where it\n     * is specified that {@code NaN !\u003d NaN}.\n     * New methods have been added for those cases wher the old semantics is\n     * useful (see e.g. {@link #equalsIncludingNaN(double,double)\n     * equalsIncludingNaN}.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) this method}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, double)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, double)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, int)",
      "begin_line": 480,
      "end_line": 499,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or less) floating point numbers between them (i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are less than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 48)",
        "(line 485,col 9)-(line 485,col 47)",
        "(line 486,col 9)-(line 486,col 47)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 496,col 67)",
        "(line 498,col 9)-(line 498,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, int)",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) this method}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double[], double[])",
      "begin_line": 532,
      "end_line": 545,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equals(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     * @deprecated This method considers that {@code NaN \u003d\u003d NaN}. In release\n     * 3.0, the semantics will change in order to comply with IEEE754 where it\n     * is specified that {@code NaN !\u003d NaN}.\n     * New methods have been added for those cases wher the old semantics is\n     * useful (see e.g. {@link #equalsIncludingNaN(double[],double[])\n     * equalsIncludingNaN}.\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double[], double[])",
      "begin_line": 557,
      "end_line": 570,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 594,
      "end_line": 605,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Long.MAX_VALUE\u003c/code\u003e is 20. If the computed value exceeds \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e\n     * an \u003ccode\u003eArithMeticException \u003c/code\u003e is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 627,
      "end_line": 637,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e as a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Double.MAX_VALUE\u003c/code\u003e is 170. If the computed value exceeds\n     * Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 652,
      "end_line": 666,
      "comment": "\n     * Returns the natural logarithm of n!.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 26)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 697,
      "end_line": 755,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, Integer.MIN_VALUE)\u003c/code\u003e,\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, 0)\u003c/code\u003e and\n     * \u003ccode\u003egcd(0, Integer.MIN_VALUE)\u003c/code\u003e throw an\n     * \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003egcd(x, x)\u003c/code\u003e, \u003ccode\u003egcd(0, x)\u003c/code\u003e and\n     * \u003ccode\u003egcd(x, 0)\u003c/code\u003e is the absolute value of \u003ccode\u003ex\u003c/code\u003e, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation \u003ccode\u003egcd(0, 0)\u003c/code\u003e is the only one which returns\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p any number\n     * @param q any number\n     * @return the greatest common divisor, never negative\n     * @throws ArithmeticException if the result cannot be represented as a\n     * nonnegative int value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 18)",
        "(line 699,col 9)-(line 699,col 18)",
        "(line 700,col 9)-(line 707,col 9)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 18)",
        "(line 721,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 731,col 9)",
        "(line 734,col 9)-(line 734,col 54)",
        "(line 737,col 9)-(line 753,col 25)",
        "(line 754,col 9)-(line 754,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(long, long)",
      "begin_line": 786,
      "end_line": 844,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * \u003ccode\u003egcd(Long.MIN_VALUE, Long.MIN_VALUE)\u003c/code\u003e,\n     * \u003ccode\u003egcd(Long.MIN_VALUE, 0L)\u003c/code\u003e and\n     * \u003ccode\u003egcd(0L, Long.MIN_VALUE)\u003c/code\u003e throw an\n     * \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003egcd(x, x)\u003c/code\u003e, \u003ccode\u003egcd(0L, x)\u003c/code\u003e and\n     * \u003ccode\u003egcd(x, 0L)\u003c/code\u003e is the absolute value of \u003ccode\u003ex\u003c/code\u003e, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation \u003ccode\u003egcd(0L, 0L)\u003c/code\u003e is the only one which returns\n     * \u003ccode\u003e0L\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p any number\n     * @param q any number\n     * @return the greatest common divisor, never negative\n     * @throws ArithmeticException if the result cannot be represented as a nonnegative long\n     * value\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 19)",
        "(line 788,col 9)-(line 788,col 19)",
        "(line 789,col 9)-(line 796,col 9)",
        "(line 802,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 807,col 9)",
        "(line 809,col 9)-(line 809,col 18)",
        "(line 810,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 820,col 9)",
        "(line 823,col 9)-(line 823,col 55)",
        "(line 826,col 9)-(line 842,col 25)",
        "(line 843,col 9)-(line 843,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 852,
      "end_line": 854,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     *\n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     *\n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 874,
      "end_line": 876,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 886,
      "end_line": 891,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is\n     * \u003ccode\u003eNaN\u003c/code\u003e.\n     *\n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 900,
      "end_line": 905,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     *\n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 904,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     *\n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 923,
      "end_line": 925,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     *\n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     *\n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 961,
      "end_line": 972,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula \u003ccode\u003elcm(a,b) \u003d (a / gcd(a,b)) * b\u003c/code\u003e.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations \u003ccode\u003elcm(Integer.MIN_VALUE, n)\u003c/code\u003e and\n     * \u003ccode\u003elcm(n, Integer.MIN_VALUE)\u003c/code\u003e, where \u003ccode\u003eabs(n)\u003c/code\u003e is a\n     * power of 2, throw an \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003elcm(0, x)\u003c/code\u003e and \u003ccode\u003elcm(x, 0)\u003c/code\u003e is\n     * \u003ccode\u003e0\u003c/code\u003e for any \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/ul\u003e\n     *\n     * @param a any number\n     * @param b any number\n     * @return the least common multiple, never negative\n     * @throws ArithmeticException\n     *             if the result cannot be represented as a nonnegative int\n     *             value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 965,col 58)",
        "(line 966,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 971,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(long, long)",
      "begin_line": 996,
      "end_line": 1007,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula \u003ccode\u003elcm(a,b) \u003d (a / gcd(a,b)) * b\u003c/code\u003e.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations \u003ccode\u003elcm(Long.MIN_VALUE, n)\u003c/code\u003e and\n     * \u003ccode\u003elcm(n, Long.MIN_VALUE)\u003c/code\u003e, where \u003ccode\u003eabs(n)\u003c/code\u003e is a\n     * power of 2, throw an \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003elcm(0L, x)\u003c/code\u003e and \u003ccode\u003elcm(x, 0L)\u003c/code\u003e is\n     * \u003ccode\u003e0L\u003c/code\u003e for any \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/ul\u003e\n     *\n     * @param a any number\n     * @param b any number\n     * @return the least common multiple, never negative\n     * @throws ArithmeticException if the result cannot be represented as a nonnegative long\n     * value\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1000,col 59)",
        "(line 1001,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1006,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 1025,
      "end_line": 1027,
      "comment": "\n     * \u003cp\u003eReturns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base \u003ccode\u003eb\u003c/code\u003e of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns \u003ccode\u003eNaN\u003ccode\u003e if either argument is negative.  If\n     * \u003ccode\u003ebase\u003c/code\u003e is 0 and \u003ccode\u003ex\u003c/code\u003e is positive, 0 is returned.\n     * If \u003ccode\u003ebase\u003c/code\u003e is positive and \u003ccode\u003ex\u003c/code\u003e is 0,\n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e is returned.  If both arguments\n     * are 0, the result is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 1039,
      "end_line": 1045,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 39)",
        "(line 1041,col 9)-(line 1043,col 9)",
        "(line 1044,col 9)-(line 1044,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(long, long)",
      "begin_line": 1057,
      "end_line": 1100,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a first value\n     * @param b second value\n     * @return the product \u003ccode\u003ea * b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1058,col 9)-(line 1058,col 17)",
        "(line 1059,col 9)-(line 1059,col 42)",
        "(line 1060,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1099,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.nextAfter(double, double)",
      "begin_line": 1119,
      "end_line": 1157,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1126,col 9)",
        "(line 1131,col 9)-(line 1131,col 51)",
        "(line 1132,col 9)-(line 1132,col 51)",
        "(line 1133,col 9)-(line 1133,col 51)",
        "(line 1134,col 9)-(line 1134,col 51)",
        "(line 1136,col 9)-(line 1155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.scalb(double, int)",
      "begin_line": 1168,
      "end_line": 1184,
      "comment": "\n     * Scale a number by 2\u003csup\u003escaleFactor\u003c/sup\u003e.\n     * \u003cp\u003eIf \u003ccode\u003ed\u003c/code\u003e is 0 or NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param scaleFactor power of two by which d sould be multiplied\n     * @return d \u0026times; 2\u003csup\u003escaleFactor\u003c/sup\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1171,col 9)-(line 1173,col 9)",
        "(line 1176,col 9)-(line 1176,col 57)",
        "(line 1177,col 9)-(line 1177,col 57)",
        "(line 1178,col 9)-(line 1178,col 57)",
        "(line 1181,col 9)-(line 1181,col 78)",
        "(line 1182,col 9)-(line 1182,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 1205,
      "end_line": 1207,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, Math.PI);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, 0.0);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       \u003ccode\u003eangle \u003d MathUtils.normalizeAngle(end, start) - start;\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1206,col 10)-(line 1206,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeArray(double[], double)",
      "begin_line": 1230,
      "end_line": 1263,
      "comment": "\n      * \u003cp\u003eNormalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if \u003ccode\u003enormalizedSum\u003c/code\u003e is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values input array to be normalized\n      * @param normalizedSum target sum for the normalized array\n      * @return normalized array\n      * @throws ArithmeticException if the input array contains infinite elements or sums to zero\n      * @throws IllegalArgumentException if the target sum is infinite or NaN\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1232,col 10)-(line 1235,col 10)",
        "(line 1236,col 10)-(line 1239,col 10)",
        "(line 1240,col 10)-(line 1240,col 25)",
        "(line 1241,col 10)-(line 1241,col 39)",
        "(line 1242,col 10)-(line 1242,col 40)",
        "(line 1243,col 10)-(line 1251,col 10)",
        "(line 1252,col 10)-(line 1254,col 10)",
        "(line 1255,col 10)-(line 1261,col 10)",
        "(line 1262,col 10)-(line 1262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 1274,
      "end_line": 1276,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 1290,
      "end_line": 1303,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 1314,
      "end_line": 1316,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounding using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1315,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 1330,
      "end_line": 1334,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 34)",
        "(line 1332,col 9)-(line 1332,col 60)",
        "(line 1333,col 9)-(line 1333,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 1348,
      "end_line": 1427,
      "comment": "\n     * Round the given non-negative, value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled the value to round.\n     * @param sign the sign of the original, scaled value.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1350,col 9)-(line 1425,col 9)",
        "(line 1426,col 9)-(line 1426,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 1439,
      "end_line": 1441,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1440,col 9)-(line 1440,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 1455,
      "end_line": 1460,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a double value \u003ccode\u003ex\u003c/code\u003e, this method returns\n     * \u003ccode\u003e+1.0\u003c/code\u003e if \u003ccode\u003ex \u003e 0\u003c/code\u003e, \u003ccode\u003e0.0\u003c/code\u003e if\n     * \u003ccode\u003ex \u003d 0.0\u003c/code\u003e, and \u003ccode\u003e-1.0\u003c/code\u003e if \u003ccode\u003ex \u003c 0\u003c/code\u003e.\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1456,col 9)-(line 1458,col 9)",
        "(line 1459,col 9)-(line 1459,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 1473,
      "end_line": 1478,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1476,col 9)",
        "(line 1477,col 9)-(line 1477,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 1490,
      "end_line": 1492,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1491,col 9)-(line 1491,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 1504,
      "end_line": 1506,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1505,col 9)-(line 1505,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 1519,
      "end_line": 1521,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for short value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a short value x, this method returns (short)(+1) if x \u003e 0, (short)(0)\n     * if x \u003d 0, and (short)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a short\n     * @return (short)(+1), (short)(0), or (short)(-1), depending on the sign of\n     *         x\n     ",
      "child_ranges": [
        "(line 1520,col 9)-(line 1520,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 1530,
      "end_line": 1532,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of x.\n     *\n     * @param x double value for which to find the hyperbolic sine\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 1531,col 9)-(line 1531,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 1544,
      "end_line": 1550,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1545,col 9)-(line 1545,col 35)",
        "(line 1546,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1549,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(long, long)",
      "begin_line": 1562,
      "end_line": 1576,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a first value\n     * @param b second value\n     * @return the difference \u003ccode\u003ea-b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1563,col 9)-(line 1563,col 17)",
        "(line 1564,col 9)-(line 1564,col 42)",
        "(line 1565,col 9)-(line 1574,col 9)",
        "(line 1575,col 9)-(line 1575,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, int)",
      "begin_line": 1585,
      "end_line": 1606,
      "comment": "\n     * Raise an int to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1592,col 9)",
        "(line 1594,col 9)-(line 1594,col 23)",
        "(line 1595,col 9)-(line 1595,col 23)",
        "(line 1596,col 9)-(line 1602,col 9)",
        "(line 1604,col 9)-(line 1604,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, long)",
      "begin_line": 1615,
      "end_line": 1636,
      "comment": "\n     * Raise an int to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1622,col 9)",
        "(line 1624,col 9)-(line 1624,col 23)",
        "(line 1625,col 9)-(line 1625,col 23)",
        "(line 1626,col 9)-(line 1632,col 9)",
        "(line 1634,col 9)-(line 1634,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, int)",
      "begin_line": 1645,
      "end_line": 1666,
      "comment": "\n     * Raise a long to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1648,col 9)-(line 1652,col 9)",
        "(line 1654,col 9)-(line 1654,col 25)",
        "(line 1655,col 9)-(line 1655,col 24)",
        "(line 1656,col 9)-(line 1662,col 9)",
        "(line 1664,col 9)-(line 1664,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, long)",
      "begin_line": 1675,
      "end_line": 1696,
      "comment": "\n     * Raise a long to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1678,col 9)-(line 1682,col 9)",
        "(line 1684,col 9)-(line 1684,col 25)",
        "(line 1685,col 9)-(line 1685,col 24)",
        "(line 1686,col 9)-(line 1692,col 9)",
        "(line 1694,col 9)-(line 1694,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, int)",
      "begin_line": 1705,
      "end_line": 1716,
      "comment": "\n     * Raise a BigInteger to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1708,col 9)-(line 1712,col 9)",
        "(line 1714,col 9)-(line 1714,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, long)",
      "begin_line": 1725,
      "end_line": 1746,
      "comment": "\n     * Raise a BigInteger to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1728,col 9)-(line 1732,col 9)",
        "(line 1734,col 9)-(line 1734,col 43)",
        "(line 1735,col 9)-(line 1735,col 30)",
        "(line 1736,col 9)-(line 1742,col 9)",
        "(line 1744,col 9)-(line 1744,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 1755,
      "end_line": 1776,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1758,col 9)-(line 1762,col 9)",
        "(line 1764,col 9)-(line 1764,col 43)",
        "(line 1765,col 9)-(line 1765,col 30)",
        "(line 1766,col 9)-(line 1772,col 9)",
        "(line 1774,col 9)-(line 1774,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(double[], double[])",
      "begin_line": 1785,
      "end_line": 1791,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1786,col 9)-(line 1786,col 23)",
        "(line 1787,col 9)-(line 1789,col 9)",
        "(line 1790,col 9)-(line 1790,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(int[], int[])",
      "begin_line": 1800,
      "end_line": 1806,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1801,col 7)-(line 1801,col 18)",
        "(line 1802,col 7)-(line 1804,col 7)",
        "(line 1805,col 7)-(line 1805,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(double[], double[])",
      "begin_line": 1815,
      "end_line": 1822,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1816,col 23)",
        "(line 1817,col 9)-(line 1820,col 9)",
        "(line 1821,col 9)-(line 1821,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(int[], int[])",
      "begin_line": 1831,
      "end_line": 1838,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1832,col 7)-(line 1832,col 21)",
        "(line 1833,col 7)-(line 1836,col 7)",
        "(line 1837,col 7)-(line 1837,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(double[], double[])",
      "begin_line": 1847,
      "end_line": 1853,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1848,col 9)-(line 1848,col 23)",
        "(line 1849,col 9)-(line 1851,col 9)",
        "(line 1852,col 9)-(line 1852,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(int[], int[])",
      "begin_line": 1862,
      "end_line": 1868,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1863,col 9)-(line 1863,col 20)",
        "(line 1864,col 9)-(line 1866,col 9)",
        "(line 1867,col 9)-(line 1867,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Order",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1870,
      "end_line": 1875,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[], org.apache.commons.math.util.MathUtils.Order.Direction, boolean)",
      "begin_line": 1885,
      "end_line": 1924,
      "comment": "\n     * Checks that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Order direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonousSequenceException if the array is not sorted.\n     ",
      "child_ranges": [
        "(line 1886,col 9)-(line 1886,col 33)",
        "(line 1887,col 9)-(line 1887,col 26)",
        "(line 1889,col 9)-(line 1889,col 29)",
        "(line 1890,col 9)-(line 1923,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[])",
      "begin_line": 1932,
      "end_line": 1934,
      "comment": "\n     * Checks that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonousSequenceException if the array is not sorted.\n     ",
      "child_ranges": [
        "(line 1933,col 9)-(line 1933,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[], int, boolean)",
      "begin_line": 1946,
      "end_line": 1952,
      "comment": "\n     * Checks that the given array is sorted.\n     *\n     * @param val Values\n     * @param dir Order direction (-1 for decreasing, 1 for increasing)\n     * @param strict Whether the order should be strict\n     * @throws NonMonotonousSequenceException if the array is not sorted.\n     * @deprecated as of 2.2 (please use the new {@link #checkOrder(double[],Order.Direction,boolean)\n     * checkOrder} method). To be removed in 3.0.\n     ",
      "child_ranges": [
        "(line 1947,col 9)-(line 1951,col 9)"
      ]
    }
  ]
}