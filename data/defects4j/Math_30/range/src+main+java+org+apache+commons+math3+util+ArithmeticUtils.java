{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/util/ArithmeticUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 958,
      "comment": "\n * Some useful, arithmetics related, additions to the built-in functions in\n * {@link Math}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 35,
      "end_line": 42,
      "comment": " All long-representable factorials "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.ArithmeticUtils()",
      "begin_line": 45,
      "end_line": 47,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(int, int)",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 35)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(int, int)",
      "begin_line": 107,
      "end_line": 160,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 125,col 9)-(line 125,col 24)",
        "(line 126,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 185,
      "end_line": 206,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 27)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(int, int)",
      "begin_line": 227,
      "end_line": 272,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 44)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 259,col 9)-(line 259,col 26)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorial(int)",
      "begin_line": 298,
      "end_line": 307,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(int)",
      "begin_line": 322,
      "end_line": 331,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialLog(int)",
      "begin_line": 340,
      "end_line": 353,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 26)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(int, int)",
      "begin_line": 384,
      "end_line": 440,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     * {@code gcd(Integer.MIN_VALUE, 0)} and\n     * {@code gcd(0, Integer.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     * {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     * {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 18)",
        "(line 386,col 9)-(line 386,col 18)",
        "(line 387,col 9)-(line 393,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 18)",
        "(line 407,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 416,col 9)",
        "(line 419,col 9)-(line 419,col 54)",
        "(line 422,col 9)-(line 438,col 25)",
        "(line 439,col 9)-(line 439,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(long, long)",
      "begin_line": 471,
      "end_line": 527,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 19)",
        "(line 473,col 9)-(line 473,col 19)",
        "(line 474,col 9)-(line 480,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 493,col 9)-(line 493,col 18)",
        "(line 494,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 503,col 9)",
        "(line 506,col 9)-(line 506,col 55)",
        "(line 509,col 9)-(line 525,col 25)",
        "(line 526,col 9)-(line 526,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(int, int)",
      "begin_line": 551,
      "end_line": 561,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 78)",
        "(line 556,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(long, long)",
      "begin_line": 585,
      "end_line": 595,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 79)",
        "(line 590,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(int, int)",
      "begin_line": 607,
      "end_line": 613,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 39)",
        "(line 609,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(long, long)",
      "begin_line": 625,
      "end_line": 667,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 17)",
        "(line 627,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(int, int)",
      "begin_line": 679,
      "end_line": 685,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 35)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(long, long)",
      "begin_line": 697,
      "end_line": 710,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 17)",
        "(line 699,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, int)",
      "begin_line": 720,
      "end_line": 736,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 23)",
        "(line 726,col 9)-(line 726,col 23)",
        "(line 727,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, long)",
      "begin_line": 746,
      "end_line": 762,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 751,col 23)",
        "(line 752,col 9)-(line 752,col 23)",
        "(line 753,col 9)-(line 759,col 9)",
        "(line 761,col 9)-(line 761,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, int)",
      "begin_line": 772,
      "end_line": 788,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 775,col 9)",
        "(line 777,col 9)-(line 777,col 25)",
        "(line 778,col 9)-(line 778,col 24)",
        "(line 779,col 9)-(line 785,col 9)",
        "(line 787,col 9)-(line 787,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, long)",
      "begin_line": 798,
      "end_line": 814,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 801,col 9)",
        "(line 803,col 9)-(line 803,col 25)",
        "(line 804,col 9)-(line 804,col 24)",
        "(line 805,col 9)-(line 811,col 9)",
        "(line 813,col 9)-(line 813,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, int)",
      "begin_line": 824,
      "end_line": 830,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 827,col 9)",
        "(line 829,col 9)-(line 829,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, long)",
      "begin_line": 840,
      "end_line": 857,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 845,col 43)",
        "(line 846,col 9)-(line 846,col 30)",
        "(line 847,col 9)-(line 853,col 9)",
        "(line 855,col 9)-(line 855,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 867,
      "end_line": 883,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 870,col 9)",
        "(line 872,col 9)-(line 872,col 43)",
        "(line 873,col 9)-(line 873,col 30)",
        "(line 874,col 9)-(line 880,col 9)",
        "(line 882,col 9)-(line 882,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long, org.apache.commons.math3.exception.util.Localizable)",
      "begin_line": 896,
      "end_line": 929,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 17)",
        "(line 898,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.checkBinomial(int, int)",
      "begin_line": 939,
      "end_line": 947,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 946,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(long)",
      "begin_line": 955,
      "end_line": 957,
      "comment": "\n     * Returns true if the argument is a power of two.\n     *\n     * @param n the number to test\n     * @return true if the argument is a power of two\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 47)"
      ]
    }
  ]
}