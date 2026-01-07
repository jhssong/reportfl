{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 2326,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Smallest positive number such that 1 - EPSILON is not numerically equal to 1. "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Safe minimum, such that 1 / SAFE_MIN does not overflow.\n     * \u003cp\u003eIn IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * 2 \u0026pi;.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK_FLOAT"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 85,
      "end_line": 92,
      "comment": " All long-representable factorials "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 35)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long, org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 144,
      "end_line": 177,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 17)",
        "(line 146,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 204,
      "end_line": 256,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws MathIllegalArgumentException if preconditions are not met.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 28)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 214,col 49)",
        "(line 221,col 9)-(line 221,col 24)",
        "(line 222,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 280,
      "end_line": 301,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 28)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 27)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 321,
      "end_line": 366,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 28)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 353,col 9)-(line 353,col 26)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkBinomial(int, int)",
      "begin_line": 376,
      "end_line": 384,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, double)",
      "begin_line": 396,
      "end_line": 403,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, int)",
      "begin_line": 422,
      "end_line": 429,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, int) equals(x, y, maxUlps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     *\n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float, float)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(float,float,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float, float)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(float,float) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float, float, float)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float, float, float)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float, float, int)",
      "begin_line": 514,
      "end_line": 529,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 43)",
        "(line 516,col 9)-(line 516,col 43)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 69)",
        "(line 528,col 9)-(line 528,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float, float, int)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(float,float,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float[], float[])",
      "begin_line": 557,
      "end_line": 570,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float[], float[])",
      "begin_line": 583,
      "end_line": 596,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double)",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, double)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n     * Returns {@code true} if there is no double value strictly between the\n     * arguments or the difference between them is within the range of allowed\n     * error (inclusive).\n     *\n     * @param x First value.\n     * @param y Second value.\n     * @param eps Amount of allowed absolute error.\n     * @return {@code true} if the values are two adjacent floating point\n     * numbers or they are within range of each other.\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, double)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, int)",
      "begin_line": 670,
      "end_line": 685,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 47)",
        "(line 672,col 9)-(line 672,col 47)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 682,col 9)-(line 682,col 69)",
        "(line 684,col 9)-(line 684,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, int)",
      "begin_line": 699,
      "end_line": 701,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double[], double[])",
      "begin_line": 713,
      "end_line": 726,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link #equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double[], double[])",
      "begin_line": 739,
      "end_line": 752,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link #equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 778,
      "end_line": 787,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 802,
      "end_line": 811,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 820,
      "end_line": 833,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 26)",
        "(line 829,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 832,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 864,
      "end_line": 920,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     * {@code gcd(Integer.MIN_VALUE, 0)} and\n     * {@code gcd(0, Integer.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     * {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     * {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 18)",
        "(line 866,col 9)-(line 866,col 18)",
        "(line 867,col 9)-(line 873,col 9)",
        "(line 879,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 884,col 9)",
        "(line 886,col 9)-(line 886,col 18)",
        "(line 887,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 896,col 9)",
        "(line 899,col 9)-(line 899,col 54)",
        "(line 902,col 9)-(line 918,col 25)",
        "(line 919,col 9)-(line 919,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(long, long)",
      "begin_line": 951,
      "end_line": 1007,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 19)",
        "(line 953,col 9)-(line 953,col 19)",
        "(line 954,col 9)-(line 960,col 9)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 973,col 9)-(line 973,col 18)",
        "(line 974,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 983,col 9)",
        "(line 986,col 9)-(line 986,col 55)",
        "(line 989,col 9)-(line 1005,col 25)",
        "(line 1006,col 9)-(line 1006,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 1015,
      "end_line": 1017,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     *\n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 1026,
      "end_line": 1028,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     *\n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 1037,
      "end_line": 1039,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 1049,
      "end_line": 1054,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns {@code NaN} if {@code x} is\n     * {@code NaN}.\n     *\n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1053,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 1063,
      "end_line": 1068,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns {@code NaN} if {@code x} is {@code NaN}.\n     *\n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 1076,
      "end_line": 1078,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     *\n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 1086,
      "end_line": 1088,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     *\n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     *\n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 1123,
      "end_line": 1133,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1126,col 9)",
        "(line 1127,col 9)-(line 1127,col 62)",
        "(line 1128,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1132,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(long, long)",
      "begin_line": 1157,
      "end_line": 1167,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1160,col 9)",
        "(line 1161,col 9)-(line 1161,col 63)",
        "(line 1162,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 1185,
      "end_line": 1187,
      "comment": "\n     * \u003cp\u003eReturns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base {@code b} of {@code x}.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns {@code NaN} if either argument is negative. If\n     * {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.  If both arguments\n     * are 0, the result is {@code NaN}.\u003c/p\u003e\n     *\n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1186,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 1199,
      "end_line": 1205,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 39)",
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(long, long)",
      "begin_line": 1217,
      "end_line": 1259,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 17)",
        "(line 1219,col 9)-(line 1257,col 9)",
        "(line 1258,col 9)-(line 1258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 1280,
      "end_line": 1282,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, FastMath.PI);}\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, 0.0);}\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       {@code angle \u003d MathUtils.normalizeAngle(end, start) - start;}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1281,col 10)-(line 1281,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.reduce(double, double, double)",
      "begin_line": 1293,
      "end_line": 1298,
      "comment": "\n     * Reduce to the primary interval {@code [0 period)}.\n     *\n     * @param a Value to reduce.\n     * @param period Period.\n     * @param offset Value that will be mapped to {@code 0}.\n     * @return the value, within the interval {@code [0 period)},\n     * that corresponds to {@code a}.\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1296,col 46)",
        "(line 1297,col 9)-(line 1297,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeArray(double[], double)",
      "begin_line": 1321,
      "end_line": 1350,
      "comment": "\n      * \u003cp\u003eNormalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values input array to be normalized\n      * @param normalizedSum target sum for the normalized array\n      * @return normalized array\n      * @throws MathArithmeticException if the input array contains infinite elements or sums to zero\n      * @throws MathIllegalArgumentException if the target sum is infinite or NaN\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1322,col 10)-(line 1324,col 10)",
        "(line 1325,col 10)-(line 1327,col 10)",
        "(line 1328,col 10)-(line 1328,col 25)",
        "(line 1329,col 10)-(line 1329,col 39)",
        "(line 1330,col 10)-(line 1330,col 40)",
        "(line 1331,col 10)-(line 1338,col 10)",
        "(line 1339,col 10)-(line 1341,col 10)",
        "(line 1342,col 10)-(line 1348,col 10)",
        "(line 1349,col 10)-(line 1349,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 1384,
      "end_line": 1397,
      "comment": "\n     * \u003cp\u003eRound the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code x} is infinite or NaN, then the value of {@code x} is\n     * returned unchanged, regardless of the other parameters.\u003c/p\u003e\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws ArithmeticException if roundingMethod\u003d\u003dROUND_UNNECESSARY and the\n     * specified scaling operation would require rounding.\n     * @throws IllegalArgumentException if roundingMethod does not represent a\n     * valid rounding mode.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1385,col 9)-(line 1396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 1408,
      "end_line": 1410,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1409,col 9)-(line 1409,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 1424,
      "end_line": 1428,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 34)",
        "(line 1426,col 9)-(line 1426,col 64)",
        "(line 1427,col 9)-(line 1427,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 1442,
      "end_line": 1521,
      "comment": "\n     * Round the given non-negative value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled Value to round.\n     * @param sign Sign of the original, scaled value.\n     * @param roundingMethod Rounding method, as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1519,col 9)",
        "(line 1520,col 9)-(line 1520,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value {@code x}.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 1549,
      "end_line": 1554,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision {@code x}.\n     * \u003cp\u003e\n     * For a double value {@code x}, this method returns\n     * {@code +1.0} if {@code x \u003e 0}, {@code 0.0} if\n     * {@code x \u003d 0.0}, and {@code -1.0} if {@code x \u003c 0}.\n     * Returns {@code NaN} if {@code x} is {@code NaN}.\u003c/p\u003e\n     *\n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1553,col 9)-(line 1553,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 1567,
      "end_line": 1572,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value {@code x}.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns {@code NaN} if {@code x}\n     * is {@code NaN}.\u003c/p\u003e\n     *\n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1570,col 9)",
        "(line 1571,col 9)-(line 1571,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 1584,
      "end_line": 1586,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value {@code x}.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1585,col 9)-(line 1585,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value {@code x}.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1599,col 9)-(line 1599,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 1609,
      "end_line": 1611,
      "comment": "\n     * Compute the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003esign\u003c/a\u003e\n     * of the argument.\n     *\n     * @param x the value, a short\n     * @return 1 if {@code x \u003e 0}, 0 if {@code x \u003d\u003d 0}, and -1 if {@code x \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1610,col 9)-(line 1610,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 1620,
      "end_line": 1622,
      "comment": "\n     * Compute the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of the argument.\n     *\n     * @param x Value for which to find the hyperbolic sine.\n     * @return hyperbolic sine of {@code x}.\n     ",
      "child_ranges": [
        "(line 1621,col 9)-(line 1621,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 1634,
      "end_line": 1640,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 35)",
        "(line 1636,col 9)-(line 1638,col 9)",
        "(line 1639,col 9)-(line 1639,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(long, long)",
      "begin_line": 1652,
      "end_line": 1665,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1653,col 9)-(line 1653,col 17)",
        "(line 1654,col 9)-(line 1663,col 9)",
        "(line 1664,col 9)-(line 1664,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, int)",
      "begin_line": 1675,
      "end_line": 1691,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1676,col 9)-(line 1678,col 9)",
        "(line 1680,col 9)-(line 1680,col 23)",
        "(line 1681,col 9)-(line 1681,col 23)",
        "(line 1682,col 9)-(line 1688,col 9)",
        "(line 1690,col 9)-(line 1690,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, long)",
      "begin_line": 1701,
      "end_line": 1717,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1702,col 9)-(line 1704,col 9)",
        "(line 1706,col 9)-(line 1706,col 23)",
        "(line 1707,col 9)-(line 1707,col 23)",
        "(line 1708,col 9)-(line 1714,col 9)",
        "(line 1716,col 9)-(line 1716,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, int)",
      "begin_line": 1727,
      "end_line": 1743,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1728,col 9)-(line 1730,col 9)",
        "(line 1732,col 9)-(line 1732,col 25)",
        "(line 1733,col 9)-(line 1733,col 24)",
        "(line 1734,col 9)-(line 1740,col 9)",
        "(line 1742,col 9)-(line 1742,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, long)",
      "begin_line": 1753,
      "end_line": 1769,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1756,col 9)",
        "(line 1758,col 9)-(line 1758,col 25)",
        "(line 1759,col 9)-(line 1759,col 24)",
        "(line 1760,col 9)-(line 1766,col 9)",
        "(line 1768,col 9)-(line 1768,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, int)",
      "begin_line": 1779,
      "end_line": 1785,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1780,col 9)-(line 1782,col 9)",
        "(line 1784,col 9)-(line 1784,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, long)",
      "begin_line": 1795,
      "end_line": 1812,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1796,col 9)-(line 1798,col 9)",
        "(line 1800,col 9)-(line 1800,col 43)",
        "(line 1801,col 9)-(line 1801,col 30)",
        "(line 1802,col 9)-(line 1808,col 9)",
        "(line 1810,col 9)-(line 1810,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 1822,
      "end_line": 1838,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1823,col 9)-(line 1825,col 9)",
        "(line 1827,col 9)-(line 1827,col 43)",
        "(line 1828,col 9)-(line 1828,col 30)",
        "(line 1829,col 9)-(line 1835,col 9)",
        "(line 1837,col 9)-(line 1837,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(double[], double[])",
      "begin_line": 1847,
      "end_line": 1853,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1848,col 9)-(line 1848,col 23)",
        "(line 1849,col 9)-(line 1851,col 9)",
        "(line 1852,col 9)-(line 1852,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(int[], int[])",
      "begin_line": 1862,
      "end_line": 1868,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1863,col 7)-(line 1863,col 18)",
        "(line 1864,col 7)-(line 1866,col 7)",
        "(line 1867,col 7)-(line 1867,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(double[], double[])",
      "begin_line": 1877,
      "end_line": 1884,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1878,col 9)-(line 1878,col 23)",
        "(line 1879,col 9)-(line 1882,col 9)",
        "(line 1883,col 9)-(line 1883,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(int[], int[])",
      "begin_line": 1893,
      "end_line": 1900,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1894,col 7)-(line 1894,col 21)",
        "(line 1895,col 7)-(line 1898,col 7)",
        "(line 1899,col 7)-(line 1899,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(double[], double[])",
      "begin_line": 1909,
      "end_line": 1915,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1910,col 9)-(line 1910,col 23)",
        "(line 1911,col 9)-(line 1913,col 9)",
        "(line 1914,col 9)-(line 1914,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(int[], int[])",
      "begin_line": 1924,
      "end_line": 1930,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1925,col 9)-(line 1925,col 20)",
        "(line 1926,col 9)-(line 1928,col 9)",
        "(line 1929,col 9)-(line 1929,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[], org.apache.commons.math.util.MathUtils.OrderDirection, boolean, boolean)",
      "begin_line": 1953,
      "end_line": 1996,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonousSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 1955,col 9)-(line 1955,col 33)",
        "(line 1956,col 9)-(line 1956,col 26)",
        "(line 1958,col 9)-(line 1958,col 29)",
        "(line 1959,col 9)-(line 1993,col 9)",
        "(line 1995,col 9)-(line 1995,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[], org.apache.commons.math.util.MathUtils.OrderDirection, boolean)",
      "begin_line": 2007,
      "end_line": 2010,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonousSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 2009,col 9)-(line 2009,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[])",
      "begin_line": 2019,
      "end_line": 2021,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonousSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 2020,col 9)-(line 2020,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double)",
      "begin_line": 2030,
      "end_line": 2034,
      "comment": "\n     * Check that the argument is a real number.\n     *\n     * @param x Argument.\n     * @throws NotFiniteNumberException if {@code x} is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 2031,col 9)-(line 2033,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double[])",
      "begin_line": 2043,
      "end_line": 2050,
      "comment": "\n     * Check that all the elements are real number.\n     *\n     * @param val Arguments.\n     * @throws NotFiniteNumberException if any values of the array is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 2044,col 9)-(line 2049,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.safeNorm(double[])",
      "begin_line": 2112,
      "end_line": 2165,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available \u003ca\n     * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n     * is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v vector of doubles\n     * @return the 2-norm of the vector\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 2113,col 9)-(line 2113,col 34)",
        "(line 2114,col 9)-(line 2114,col 34)",
        "(line 2115,col 9)-(line 2115,col 22)",
        "(line 2116,col 9)-(line 2116,col 22)",
        "(line 2117,col 9)-(line 2117,col 22)",
        "(line 2118,col 9)-(line 2118,col 25)",
        "(line 2119,col 9)-(line 2119,col 25)",
        "(line 2120,col 9)-(line 2120,col 42)",
        "(line 2121,col 9)-(line 2121,col 40)",
        "(line 2122,col 9)-(line 2149,col 9)",
        "(line 2150,col 9)-(line 2150,col 20)",
        "(line 2151,col 9)-(line 2163,col 9)",
        "(line 2164,col 9)-(line 2164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sortInPlace(double[], double[]...)",
      "begin_line": 2177,
      "end_line": 2180,
      "comment": "\n     * Sort an array in increasing order, performing the same reordering of\n     * entries on other arrays.\n     *\n     * @param x Array to be sorted.\n     * @param yList Set of arrays whose permutations of entries must follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} has not the same\n     * size as {@code x}.\n     ",
      "child_ranges": [
        "(line 2179,col 9)-(line 2179,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sortInPlace(double[], org.apache.commons.math.util.MathUtils.OrderDirection, double[]...)",
      "begin_line": 2192,
      "end_line": 2247,
      "comment": "\n     * Sort an array, performing the same reordering of entries on other arrays.\n     *\n     * @param x Array to be sorted.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries must follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} has not the same\n     * size as {@code x}.\n     ",
      "child_ranges": [
        "(line 2195,col 9)-(line 2198,col 9)",
        "(line 2200,col 9)-(line 2200,col 33)",
        "(line 2201,col 9)-(line 2202,col 57)",
        "(line 2204,col 9)-(line 2204,col 42)",
        "(line 2205,col 9)-(line 2215,col 9)",
        "(line 2217,col 9)-(line 2235,col 10)",
        "(line 2237,col 9)-(line 2237,col 37)",
        "(line 2239,col 9)-(line 2246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.Anonymous-7170e367-b7d9-4003-adf4-9462d8ca4a13.compare(org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 2219,
      "end_line": 2234,
      "comment": "",
      "child_ranges": [
        "(line 2221,col 17)-(line 2221,col 24)",
        "(line 2222,col 17)-(line 2232,col 17)",
        "(line 2233,col 17)-(line 2233,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(int[])",
      "begin_line": 2255,
      "end_line": 2257,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2256,col 10)-(line 2256,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(double[])",
      "begin_line": 2265,
      "end_line": 2267,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2266,col 10)-(line 2266,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(int[], int)",
      "begin_line": 2278,
      "end_line": 2282,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2279,col 10)-(line 2279,col 43)",
        "(line 2280,col 10)-(line 2280,col 82)",
        "(line 2281,col 10)-(line 2281,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(double[], int)",
      "begin_line": 2293,
      "end_line": 2297,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2294,col 10)-(line 2294,col 49)",
        "(line 2295,col 10)-(line 2295,col 82)",
        "(line 2296,col 10)-(line 2296,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 2307,
      "end_line": 2313,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @param pattern Message pattern.\n     * @param args Arguments to replace the placeholders in {@code pattern}.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 2310,col 9)-(line 2312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object)",
      "begin_line": 2321,
      "end_line": 2325,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 2322,col 9)-(line 2324,col 9)"
      ]
    }
  ]
}