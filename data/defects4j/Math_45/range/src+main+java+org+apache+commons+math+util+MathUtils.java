{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 2827,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Smallest positive number such that 1 - EPSILON is not numerically equal to 1. "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Safe minimum, such that 1 / SAFE_MIN does not overflow.\n     * \u003cp\u003eIn IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * 2 \u0026pi;.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK_FLOAT"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 86,
      "end_line": 93,
      "comment": " All long-representable factorials "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_FACTOR"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Factor used for splitting double numbers: n \u003d 2^27 + 1. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long, org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 148,
      "end_line": 181,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 17)",
        "(line 150,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 208,
      "end_line": 261,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws MathIllegalArgumentException if preconditions are not met.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 28)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 226,col 9)-(line 226,col 24)",
        "(line 227,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 285,
      "end_line": 306,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 28)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 27)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 326,
      "end_line": 371,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 28)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 358,col 9)-(line 358,col 26)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkBinomial(int, int)",
      "begin_line": 381,
      "end_line": 389,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, double)",
      "begin_line": 401,
      "end_line": 408,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, int)",
      "begin_line": 427,
      "end_line": 434,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, int) equals(x, y, maxUlps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     *\n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float, float)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(float,float,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float, float)",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(float,float) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float, float, float)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float, float, float)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float, float, int)",
      "begin_line": 519,
      "end_line": 534,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 43)",
        "(line 521,col 9)-(line 521,col 43)",
        "(line 524,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 531,col 69)",
        "(line 533,col 9)-(line 533,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float, float, int)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(float,float,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(float[], float[])",
      "begin_line": 562,
      "end_line": 575,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(float[], float[])",
      "begin_line": 588,
      "end_line": 601,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link #equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double)",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, double)",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\n     * Returns {@code true} if there is no double value strictly between the\n     * arguments or the difference between them is within the range of allowed\n     * error (inclusive).\n     *\n     * @param x First value.\n     * @param y Second value.\n     * @param eps Amount of allowed absolute error.\n     * @return {@code true} if the values are two adjacent floating point\n     * numbers or they are within range of each other.\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, double)",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, int)",
      "begin_line": 675,
      "end_line": 690,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 47)",
        "(line 677,col 9)-(line 677,col 47)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 685,col 9)",
        "(line 687,col 9)-(line 687,col 69)",
        "(line 689,col 9)-(line 689,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double, double, int)",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double[], double[])",
      "begin_line": 718,
      "end_line": 731,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link #equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equalsIncludingNaN(double[], double[])",
      "begin_line": 744,
      "end_line": 757,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link #equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 783,
      "end_line": 792,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 807,
      "end_line": 816,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 825,
      "end_line": 838,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 833,col 26)",
        "(line 834,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 869,
      "end_line": 925,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     * {@code gcd(Integer.MIN_VALUE, 0)} and\n     * {@code gcd(0, Integer.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     * {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     * {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 18)",
        "(line 871,col 9)-(line 871,col 18)",
        "(line 872,col 9)-(line 878,col 9)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 891,col 9)-(line 891,col 18)",
        "(line 892,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 901,col 9)",
        "(line 904,col 9)-(line 904,col 54)",
        "(line 907,col 9)-(line 923,col 25)",
        "(line 924,col 9)-(line 924,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(long, long)",
      "begin_line": 956,
      "end_line": 1012,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 19)",
        "(line 958,col 9)-(line 958,col 19)",
        "(line 959,col 9)-(line 965,col 9)",
        "(line 971,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 978,col 9)-(line 978,col 18)",
        "(line 979,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 988,col 9)",
        "(line 991,col 9)-(line 991,col 55)",
        "(line 994,col 9)-(line 1010,col 25)",
        "(line 1011,col 9)-(line 1011,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 1020,
      "end_line": 1022,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     *\n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 1031,
      "end_line": 1033,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     *\n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 1042,
      "end_line": 1044,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 1054,
      "end_line": 1059,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns {@code NaN} if {@code x} is\n     * {@code NaN}.\n     *\n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1058,col 9)-(line 1058,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 1068,
      "end_line": 1073,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns {@code NaN} if {@code x} is {@code NaN}.\n     *\n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1069,col 9)-(line 1071,col 9)",
        "(line 1072,col 9)-(line 1072,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 1081,
      "end_line": 1083,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     *\n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 1091,
      "end_line": 1093,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     *\n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 1102,
      "end_line": 1104,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     *\n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1103,col 9)-(line 1103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 1128,
      "end_line": 1138,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1132,col 62)",
        "(line 1133,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(long, long)",
      "begin_line": 1162,
      "end_line": 1172,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 63)",
        "(line 1167,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 1190,
      "end_line": 1192,
      "comment": "\n     * \u003cp\u003eReturns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base {@code b} of {@code x}.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns {@code NaN} if either argument is negative. If\n     * {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.  If both arguments\n     * are 0, the result is {@code NaN}.\u003c/p\u003e\n     *\n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1191,col 9)-(line 1191,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 1204,
      "end_line": 1210,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1205,col 39)",
        "(line 1206,col 9)-(line 1208,col 9)",
        "(line 1209,col 9)-(line 1209,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(long, long)",
      "begin_line": 1222,
      "end_line": 1264,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 17)",
        "(line 1224,col 9)-(line 1262,col 9)",
        "(line 1263,col 9)-(line 1263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 1285,
      "end_line": 1287,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, FastMath.PI);}\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, 0.0);}\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       {@code angle \u003d MathUtils.normalizeAngle(end, start) - start;}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1286,col 10)-(line 1286,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.reduce(double, double, double)",
      "begin_line": 1305,
      "end_line": 1310,
      "comment": "\n     * \u003cp\u003eReduce {@code |a - offset|} to the primary interval\n     * {@code [0, |period|)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, the value returned is \u003cbr/\u003e\n     * {@code a - |period| * floor((a - offset) / |period|) - offset}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the parameters are {@code NaN} or infinite, the result is\n     * {@code NaN}.\u003c/p\u003e\n     *\n     * @param a Value to reduce.\n     * @param period Period.\n     * @param offset Value that will be mapped to {@code 0}.\n     * @return the value, within the interval {@code [0 |period|)},\n     * that corresponds to {@code a}.\n     ",
      "child_ranges": [
        "(line 1308,col 9)-(line 1308,col 46)",
        "(line 1309,col 9)-(line 1309,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeArray(double[], double)",
      "begin_line": 1333,
      "end_line": 1362,
      "comment": "\n      * \u003cp\u003eNormalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values input array to be normalized\n      * @param normalizedSum target sum for the normalized array\n      * @return normalized array\n      * @throws MathArithmeticException if the input array contains infinite elements or sums to zero\n      * @throws MathIllegalArgumentException if the target sum is infinite or NaN\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1334,col 10)-(line 1336,col 10)",
        "(line 1337,col 10)-(line 1339,col 10)",
        "(line 1340,col 10)-(line 1340,col 25)",
        "(line 1341,col 10)-(line 1341,col 39)",
        "(line 1342,col 10)-(line 1342,col 40)",
        "(line 1343,col 10)-(line 1350,col 10)",
        "(line 1351,col 10)-(line 1353,col 10)",
        "(line 1354,col 10)-(line 1360,col 10)",
        "(line 1361,col 10)-(line 1361,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 1373,
      "end_line": 1375,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1374,col 9)-(line 1374,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 1396,
      "end_line": 1409,
      "comment": "\n     * \u003cp\u003eRound the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code x} is infinite or NaN, then the value of {@code x} is\n     * returned unchanged, regardless of the other parameters.\u003c/p\u003e\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws ArithmeticException if roundingMethod\u003d\u003dROUND_UNNECESSARY and the\n     * specified scaling operation would require rounding.\n     * @throws IllegalArgumentException if roundingMethod does not represent a\n     * valid rounding mode.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 1420,
      "end_line": 1422,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1421,col 9)-(line 1421,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 1436,
      "end_line": 1440,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     *\n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 34)",
        "(line 1438,col 9)-(line 1438,col 64)",
        "(line 1439,col 9)-(line 1439,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 1454,
      "end_line": 1533,
      "comment": "\n     * Round the given non-negative value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled Value to round.\n     * @param sign Sign of the original, scaled value.\n     * @param roundingMethod Rounding method, as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1457,col 9)-(line 1531,col 9)",
        "(line 1532,col 9)-(line 1532,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 1545,
      "end_line": 1547,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value {@code x}.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1546,col 9)-(line 1546,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 1561,
      "end_line": 1566,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision {@code x}.\n     * \u003cp\u003e\n     * For a double value {@code x}, this method returns\n     * {@code +1.0} if {@code x \u003e 0}, {@code 0.0} if\n     * {@code x \u003d 0.0}, and {@code -1.0} if {@code x \u003c 0}.\n     * Returns {@code NaN} if {@code x} is {@code NaN}.\u003c/p\u003e\n     *\n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1562,col 9)-(line 1564,col 9)",
        "(line 1565,col 9)-(line 1565,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 1579,
      "end_line": 1584,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value {@code x}.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns {@code NaN} if {@code x}\n     * is {@code NaN}.\u003c/p\u003e\n     *\n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1580,col 9)-(line 1582,col 9)",
        "(line 1583,col 9)-(line 1583,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 1596,
      "end_line": 1598,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value {@code x}.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1597,col 9)-(line 1597,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 1610,
      "end_line": 1612,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value {@code x}.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1611,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 1621,
      "end_line": 1623,
      "comment": "\n     * Compute the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003esign\u003c/a\u003e\n     * of the argument.\n     *\n     * @param x the value, a short\n     * @return 1 if {@code x \u003e 0}, 0 if {@code x \u003d\u003d 0}, and -1 if {@code x \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1622,col 9)-(line 1622,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 1632,
      "end_line": 1634,
      "comment": "\n     * Compute the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of the argument.\n     *\n     * @param x Value for which to find the hyperbolic sine.\n     * @return hyperbolic sine of {@code x}.\n     ",
      "child_ranges": [
        "(line 1633,col 9)-(line 1633,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 1646,
      "end_line": 1652,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1647,col 9)-(line 1647,col 35)",
        "(line 1648,col 9)-(line 1650,col 9)",
        "(line 1651,col 9)-(line 1651,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(long, long)",
      "begin_line": 1664,
      "end_line": 1677,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1665,col 9)-(line 1665,col 17)",
        "(line 1666,col 9)-(line 1675,col 9)",
        "(line 1676,col 9)-(line 1676,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, int)",
      "begin_line": 1687,
      "end_line": 1703,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1688,col 9)-(line 1690,col 9)",
        "(line 1692,col 9)-(line 1692,col 23)",
        "(line 1693,col 9)-(line 1693,col 23)",
        "(line 1694,col 9)-(line 1700,col 9)",
        "(line 1702,col 9)-(line 1702,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, long)",
      "begin_line": 1713,
      "end_line": 1729,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1714,col 9)-(line 1716,col 9)",
        "(line 1718,col 9)-(line 1718,col 23)",
        "(line 1719,col 9)-(line 1719,col 23)",
        "(line 1720,col 9)-(line 1726,col 9)",
        "(line 1728,col 9)-(line 1728,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, int)",
      "begin_line": 1739,
      "end_line": 1755,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1740,col 9)-(line 1742,col 9)",
        "(line 1744,col 9)-(line 1744,col 25)",
        "(line 1745,col 9)-(line 1745,col 24)",
        "(line 1746,col 9)-(line 1752,col 9)",
        "(line 1754,col 9)-(line 1754,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, long)",
      "begin_line": 1765,
      "end_line": 1781,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1770,col 9)-(line 1770,col 25)",
        "(line 1771,col 9)-(line 1771,col 24)",
        "(line 1772,col 9)-(line 1778,col 9)",
        "(line 1780,col 9)-(line 1780,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, int)",
      "begin_line": 1791,
      "end_line": 1797,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1792,col 9)-(line 1794,col 9)",
        "(line 1796,col 9)-(line 1796,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, long)",
      "begin_line": 1807,
      "end_line": 1824,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1808,col 9)-(line 1810,col 9)",
        "(line 1812,col 9)-(line 1812,col 43)",
        "(line 1813,col 9)-(line 1813,col 30)",
        "(line 1814,col 9)-(line 1820,col 9)",
        "(line 1822,col 9)-(line 1822,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 1834,
      "end_line": 1850,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 1835,col 9)-(line 1837,col 9)",
        "(line 1839,col 9)-(line 1839,col 43)",
        "(line 1840,col 9)-(line 1840,col 30)",
        "(line 1841,col 9)-(line 1847,col 9)",
        "(line 1849,col 9)-(line 1849,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(double[], double[])",
      "begin_line": 1859,
      "end_line": 1865,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1860,col 9)-(line 1860,col 23)",
        "(line 1861,col 9)-(line 1863,col 9)",
        "(line 1864,col 9)-(line 1864,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance1(int[], int[])",
      "begin_line": 1874,
      "end_line": 1880,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1875,col 7)-(line 1875,col 18)",
        "(line 1876,col 7)-(line 1878,col 7)",
        "(line 1879,col 7)-(line 1879,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(double[], double[])",
      "begin_line": 1889,
      "end_line": 1896,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1890,col 9)-(line 1890,col 23)",
        "(line 1891,col 9)-(line 1894,col 9)",
        "(line 1895,col 9)-(line 1895,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distance(int[], int[])",
      "begin_line": 1905,
      "end_line": 1912,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1906,col 7)-(line 1906,col 21)",
        "(line 1907,col 7)-(line 1910,col 7)",
        "(line 1911,col 7)-(line 1911,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(double[], double[])",
      "begin_line": 1921,
      "end_line": 1927,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1922,col 9)-(line 1922,col 23)",
        "(line 1923,col 9)-(line 1925,col 9)",
        "(line 1926,col 9)-(line 1926,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.distanceInf(int[], int[])",
      "begin_line": 1936,
      "end_line": 1942,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 1937,col 9)-(line 1937,col 20)",
        "(line 1938,col 9)-(line 1940,col 9)",
        "(line 1941,col 9)-(line 1941,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.isMonotone(java.lang.Comparable[], org.apache.commons.math.util.MathUtils.OrderDirection, boolean)",
      "begin_line": 1962,
      "end_line": 2002,
      "comment": "\n     * Check that an array is monotone increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 1965,col 9)-(line 1965,col 37)",
        "(line 1966,col 9)-(line 1966,col 35)",
        "(line 1967,col 9)-(line 1967,col 17)",
        "(line 1968,col 9)-(line 2000,col 9)",
        "(line 2001,col 9)-(line 2001,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.isMonotone(double[], org.apache.commons.math.util.MathUtils.OrderDirection, boolean)",
      "begin_line": 2012,
      "end_line": 2049,
      "comment": "\n     * Check that an array is monotone increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 2015,col 9)-(line 2015,col 33)",
        "(line 2016,col 9)-(line 2016,col 35)",
        "(line 2017,col 9)-(line 2046,col 9)",
        "(line 2048,col 9)-(line 2048,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[], org.apache.commons.math.util.MathUtils.OrderDirection, boolean, boolean)",
      "begin_line": 2062,
      "end_line": 2111,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 2064,col 9)-(line 2064,col 33)",
        "(line 2065,col 9)-(line 2065,col 35)",
        "(line 2067,col 9)-(line 2067,col 18)",
        "(line 2068,col 9)-(line 2098,col 9)",
        "(line 2100,col 9)-(line 2103,col 9)",
        "(line 2106,col 9)-(line 2110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[], org.apache.commons.math.util.MathUtils.OrderDirection, boolean)",
      "begin_line": 2122,
      "end_line": 2125,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 2124,col 9)-(line 2124,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkOrder(double[])",
      "begin_line": 2134,
      "end_line": 2136,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 2135,col 9)-(line 2135,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double)",
      "begin_line": 2145,
      "end_line": 2149,
      "comment": "\n     * Check that the argument is a real number.\n     *\n     * @param x Argument.\n     * @throws NotFiniteNumberException if {@code x} is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 2146,col 9)-(line 2148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double[])",
      "begin_line": 2158,
      "end_line": 2165,
      "comment": "\n     * Check that all the elements are real number.\n     *\n     * @param val Arguments.\n     * @throws NotFiniteNumberException if any values of the array is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 2159,col 9)-(line 2164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.safeNorm(double[])",
      "begin_line": 2227,
      "end_line": 2280,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available \u003ca\n     * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n     * is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v vector of doubles\n     * @return the 2-norm of the vector\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 2228,col 9)-(line 2228,col 34)",
        "(line 2229,col 9)-(line 2229,col 34)",
        "(line 2230,col 9)-(line 2230,col 22)",
        "(line 2231,col 9)-(line 2231,col 22)",
        "(line 2232,col 9)-(line 2232,col 22)",
        "(line 2233,col 9)-(line 2233,col 25)",
        "(line 2234,col 9)-(line 2234,col 25)",
        "(line 2235,col 9)-(line 2235,col 42)",
        "(line 2236,col 9)-(line 2236,col 40)",
        "(line 2237,col 9)-(line 2264,col 9)",
        "(line 2265,col 9)-(line 2265,col 20)",
        "(line 2266,col 9)-(line 2278,col 9)",
        "(line 2279,col 9)-(line 2279,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sortInPlace(double[], double[]...)",
      "begin_line": 2298,
      "end_line": 2301,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then \n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 2300,col 9)-(line 2300,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sortInPlace(double[], org.apache.commons.math.util.MathUtils.OrderDirection, double[]...)",
      "begin_line": 2319,
      "end_line": 2376,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as\n     * {@link #sortInPlace(double[], double[]...)}, but allows the order of the\n     * sort to be provided in the {@code dir} parameter.\n     * \n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 2322,col 9)-(line 2324,col 9)",
        "(line 2326,col 9)-(line 2326,col 33)",
        "(line 2327,col 9)-(line 2328,col 57)",
        "(line 2330,col 9)-(line 2330,col 42)",
        "(line 2331,col 9)-(line 2344,col 9)",
        "(line 2346,col 9)-(line 2364,col 10)",
        "(line 2366,col 9)-(line 2366,col 37)",
        "(line 2368,col 9)-(line 2375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.Anonymous-fb9619da-a5d0-495b-8f3e-afa2b6fde7f1.compare(org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 2348,
      "end_line": 2363,
      "comment": "",
      "child_ranges": [
        "(line 2350,col 17)-(line 2350,col 24)",
        "(line 2351,col 17)-(line 2361,col 17)",
        "(line 2362,col 17)-(line 2362,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(int[])",
      "begin_line": 2384,
      "end_line": 2386,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2385,col 10)-(line 2385,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(double[])",
      "begin_line": 2394,
      "end_line": 2396,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2395,col 10)-(line 2395,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(int[], int)",
      "begin_line": 2407,
      "end_line": 2411,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2408,col 10)-(line 2408,col 43)",
        "(line 2409,col 10)-(line 2409,col 82)",
        "(line 2410,col 10)-(line 2410,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copyOf(double[], int)",
      "begin_line": 2422,
      "end_line": 2426,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 2423,col 10)-(line 2423,col 49)",
        "(line 2424,col 10)-(line 2424,col 82)",
        "(line 2425,col 10)-(line 2425,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 2436,
      "end_line": 2442,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @param pattern Message pattern.\n     * @param args Arguments to replace the placeholders in {@code pattern}.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 2439,col 9)-(line 2441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object)",
      "begin_line": 2450,
      "end_line": 2455,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 2452,col 9)-(line 2454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.linearCombination(double, double, double, double)",
      "begin_line": 2478,
      "end_line": 2533,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 2493,col 9)-(line 2493,col 52)",
        "(line 2494,col 9)-(line 2494,col 51)",
        "(line 2495,col 9)-(line 2495,col 46)",
        "(line 2496,col 9)-(line 2496,col 52)",
        "(line 2497,col 9)-(line 2497,col 51)",
        "(line 2498,col 9)-(line 2498,col 46)",
        "(line 2501,col 9)-(line 2501,col 42)",
        "(line 2502,col 9)-(line 2502,col 118)",
        "(line 2505,col 9)-(line 2505,col 52)",
        "(line 2506,col 9)-(line 2506,col 51)",
        "(line 2507,col 9)-(line 2507,col 46)",
        "(line 2508,col 9)-(line 2508,col 52)",
        "(line 2509,col 9)-(line 2509,col 51)",
        "(line 2510,col 9)-(line 2510,col 46)",
        "(line 2513,col 9)-(line 2513,col 42)",
        "(line 2514,col 9)-(line 2514,col 118)",
        "(line 2517,col 9)-(line 2517,col 56)",
        "(line 2518,col 9)-(line 2518,col 54)",
        "(line 2519,col 9)-(line 2519,col 94)",
        "(line 2523,col 9)-(line 2523,col 65)",
        "(line 2525,col 9)-(line 2529,col 9)",
        "(line 2531,col 9)-(line 2531,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.linearCombination(double, double, double, double, double, double)",
      "begin_line": 2558,
      "end_line": 2631,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 2574,col 9)-(line 2574,col 52)",
        "(line 2575,col 9)-(line 2575,col 51)",
        "(line 2576,col 9)-(line 2576,col 46)",
        "(line 2577,col 9)-(line 2577,col 52)",
        "(line 2578,col 9)-(line 2578,col 51)",
        "(line 2579,col 9)-(line 2579,col 46)",
        "(line 2582,col 9)-(line 2582,col 42)",
        "(line 2583,col 9)-(line 2583,col 118)",
        "(line 2586,col 9)-(line 2586,col 52)",
        "(line 2587,col 9)-(line 2587,col 51)",
        "(line 2588,col 9)-(line 2588,col 46)",
        "(line 2589,col 9)-(line 2589,col 52)",
        "(line 2590,col 9)-(line 2590,col 51)",
        "(line 2591,col 9)-(line 2591,col 46)",
        "(line 2594,col 9)-(line 2594,col 42)",
        "(line 2595,col 9)-(line 2595,col 118)",
        "(line 2598,col 9)-(line 2598,col 52)",
        "(line 2599,col 9)-(line 2599,col 51)",
        "(line 2600,col 9)-(line 2600,col 46)",
        "(line 2601,col 9)-(line 2601,col 52)",
        "(line 2602,col 9)-(line 2602,col 51)",
        "(line 2603,col 9)-(line 2603,col 46)",
        "(line 2606,col 9)-(line 2606,col 42)",
        "(line 2607,col 9)-(line 2607,col 118)",
        "(line 2610,col 9)-(line 2610,col 56)",
        "(line 2611,col 9)-(line 2611,col 54)",
        "(line 2612,col 9)-(line 2612,col 94)",
        "(line 2615,col 9)-(line 2615,col 54)",
        "(line 2616,col 9)-(line 2616,col 55)",
        "(line 2617,col 9)-(line 2617,col 95)",
        "(line 2621,col 9)-(line 2621,col 87)",
        "(line 2623,col 9)-(line 2627,col 9)",
        "(line 2629,col 9)-(line 2629,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 2660,
      "end_line": 2751,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 2677,col 9)-(line 2677,col 52)",
        "(line 2678,col 9)-(line 2678,col 51)",
        "(line 2679,col 9)-(line 2679,col 46)",
        "(line 2680,col 9)-(line 2680,col 52)",
        "(line 2681,col 9)-(line 2681,col 51)",
        "(line 2682,col 9)-(line 2682,col 46)",
        "(line 2685,col 9)-(line 2685,col 42)",
        "(line 2686,col 9)-(line 2686,col 118)",
        "(line 2689,col 9)-(line 2689,col 52)",
        "(line 2690,col 9)-(line 2690,col 51)",
        "(line 2691,col 9)-(line 2691,col 46)",
        "(line 2692,col 9)-(line 2692,col 52)",
        "(line 2693,col 9)-(line 2693,col 51)",
        "(line 2694,col 9)-(line 2694,col 46)",
        "(line 2697,col 9)-(line 2697,col 42)",
        "(line 2698,col 9)-(line 2698,col 118)",
        "(line 2701,col 9)-(line 2701,col 52)",
        "(line 2702,col 9)-(line 2702,col 51)",
        "(line 2703,col 9)-(line 2703,col 46)",
        "(line 2704,col 9)-(line 2704,col 52)",
        "(line 2705,col 9)-(line 2705,col 51)",
        "(line 2706,col 9)-(line 2706,col 46)",
        "(line 2709,col 9)-(line 2709,col 42)",
        "(line 2710,col 9)-(line 2710,col 118)",
        "(line 2713,col 9)-(line 2713,col 52)",
        "(line 2714,col 9)-(line 2714,col 51)",
        "(line 2715,col 9)-(line 2715,col 46)",
        "(line 2716,col 9)-(line 2716,col 52)",
        "(line 2717,col 9)-(line 2717,col 51)",
        "(line 2718,col 9)-(line 2718,col 46)",
        "(line 2721,col 9)-(line 2721,col 42)",
        "(line 2722,col 9)-(line 2722,col 118)",
        "(line 2725,col 9)-(line 2725,col 56)",
        "(line 2726,col 9)-(line 2726,col 54)",
        "(line 2727,col 9)-(line 2727,col 94)",
        "(line 2730,col 9)-(line 2730,col 54)",
        "(line 2731,col 9)-(line 2731,col 55)",
        "(line 2732,col 9)-(line 2732,col 95)",
        "(line 2735,col 9)-(line 2735,col 55)",
        "(line 2736,col 9)-(line 2736,col 56)",
        "(line 2737,col 9)-(line 2737,col 99)",
        "(line 2741,col 9)-(line 2741,col 110)",
        "(line 2743,col 9)-(line 2747,col 9)",
        "(line 2749,col 9)-(line 2749,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.linearCombination(double[], double[])",
      "begin_line": 2769,
      "end_line": 2825,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 2770,col 9)-(line 2770,col 33)",
        "(line 2771,col 9)-(line 2773,col 9)",
        "(line 2775,col 9)-(line 2775,col 50)",
        "(line 2776,col 9)-(line 2776,col 30)",
        "(line 2778,col 9)-(line 2794,col 9)",
        "(line 2797,col 9)-(line 2797,col 47)",
        "(line 2798,col 9)-(line 2798,col 42)",
        "(line 2799,col 9)-(line 2799,col 54)",
        "(line 2800,col 9)-(line 2800,col 49)",
        "(line 2801,col 9)-(line 2801,col 88)",
        "(line 2803,col 9)-(line 2803,col 40)",
        "(line 2804,col 9)-(line 2810,col 9)",
        "(line 2812,col 9)-(line 2812,col 59)",
        "(line 2814,col 9)-(line 2821,col 9)",
        "(line 2823,col 9)-(line 2823,col 22)"
      ]
    }
  ]
}