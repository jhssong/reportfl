{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/util/ArithmeticUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 946,
      "comment": "\n * Some useful, arithmetics related, additions to the built-in functions in\n * {@link Math}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 36,
      "end_line": 43,
      "comment": " All long-representable factorials "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.ArithmeticUtils()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.addAndCheck(int, int)",
      "begin_line": 60,
      "end_line": 66,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 35)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.addAndCheck(long, long)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.binomialCoefficient(int, int)",
      "begin_line": 107,
      "end_line": 160,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws MathIllegalNumberException if preconditions are not met.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
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
      "signature": "org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 184,
      "end_line": 205,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 44)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 27)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientLog(int, int)",
      "begin_line": 225,
      "end_line": 270,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 44)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 257,col 9)-(line 257,col 26)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.factorial(int)",
      "begin_line": 296,
      "end_line": 305,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.factorialDouble(int)",
      "begin_line": 320,
      "end_line": 329,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.factorialLog(int)",
      "begin_line": 338,
      "end_line": 351,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 26)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.gcd(int, int)",
      "begin_line": 382,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     * {@code gcd(Integer.MIN_VALUE, 0)} and\n     * {@code gcd(0, Integer.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     * {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     * {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 18)",
        "(line 384,col 9)-(line 384,col 18)",
        "(line 385,col 9)-(line 391,col 9)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 18)",
        "(line 405,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 414,col 9)",
        "(line 417,col 9)-(line 417,col 54)",
        "(line 420,col 9)-(line 436,col 25)",
        "(line 437,col 9)-(line 437,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.gcd(long, long)",
      "begin_line": 469,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 19)",
        "(line 471,col 9)-(line 471,col 19)",
        "(line 472,col 9)-(line 478,col 9)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 18)",
        "(line 492,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 501,col 9)",
        "(line 504,col 9)-(line 504,col 55)",
        "(line 507,col 9)-(line 523,col 25)",
        "(line 524,col 9)-(line 524,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.lcm(int, int)",
      "begin_line": 549,
      "end_line": 559,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 78)",
        "(line 554,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.lcm(long, long)",
      "begin_line": 583,
      "end_line": 593,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 79)",
        "(line 588,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.mulAndCheck(int, int)",
      "begin_line": 605,
      "end_line": 611,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 39)",
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.mulAndCheck(long, long)",
      "begin_line": 623,
      "end_line": 665,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 17)",
        "(line 625,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.subAndCheck(int, int)",
      "begin_line": 677,
      "end_line": 683,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 35)",
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.subAndCheck(long, long)",
      "begin_line": 695,
      "end_line": 708,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 17)",
        "(line 697,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.pow(int, int)",
      "begin_line": 718,
      "end_line": 734,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 721,col 9)",
        "(line 723,col 9)-(line 723,col 23)",
        "(line 724,col 9)-(line 724,col 23)",
        "(line 725,col 9)-(line 731,col 9)",
        "(line 733,col 9)-(line 733,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.pow(int, long)",
      "begin_line": 744,
      "end_line": 760,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 23)",
        "(line 750,col 9)-(line 750,col 23)",
        "(line 751,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.pow(long, int)",
      "begin_line": 770,
      "end_line": 786,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 775,col 9)-(line 775,col 25)",
        "(line 776,col 9)-(line 776,col 24)",
        "(line 777,col 9)-(line 783,col 9)",
        "(line 785,col 9)-(line 785,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.pow(long, long)",
      "begin_line": 796,
      "end_line": 812,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 799,col 9)",
        "(line 801,col 9)-(line 801,col 25)",
        "(line 802,col 9)-(line 802,col 24)",
        "(line 803,col 9)-(line 809,col 9)",
        "(line 811,col 9)-(line 811,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.pow(java.math.BigInteger, int)",
      "begin_line": 822,
      "end_line": 828,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 825,col 9)",
        "(line 827,col 9)-(line 827,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.pow(java.math.BigInteger, long)",
      "begin_line": 838,
      "end_line": 855,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 841,col 9)",
        "(line 843,col 9)-(line 843,col 43)",
        "(line 844,col 9)-(line 844,col 30)",
        "(line 845,col 9)-(line 851,col 9)",
        "(line 853,col 9)-(line 853,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 865,
      "end_line": 881,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 868,col 9)",
        "(line 870,col 9)-(line 870,col 43)",
        "(line 871,col 9)-(line 871,col 30)",
        "(line 872,col 9)-(line 878,col 9)",
        "(line 880,col 9)-(line 880,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.addAndCheck(long, long, org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 894,
      "end_line": 927,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 17)",
        "(line 896,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 926,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.checkBinomial(int, int)",
      "begin_line": 937,
      "end_line": 945,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 944,col 9)"
      ]
    }
  ]
}