{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/util/ArithmeticUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 771,
      "comment": "\n * Some useful, arithmetics related, additions to the built-in functions in\n * {@link Math}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 34,
      "end_line": 41,
      "comment": " All long-representable factorials "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.ArithmeticUtils()",
      "begin_line": 44,
      "end_line": 46,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.addAndCheck(int, int)",
      "begin_line": 58,
      "end_line": 64,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 35)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.addAndCheck(long, long)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.binomialCoefficient(int, int)",
      "begin_line": 105,
      "end_line": 158,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws MathIllegalArgumentException if preconditions are not met.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 44)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 123,col 9)-(line 123,col 24)",
        "(line 124,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 182,
      "end_line": 203,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 44)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 27)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientLog(int, int)",
      "begin_line": 223,
      "end_line": 268,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 44)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 255,col 9)-(line 255,col 26)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.factorial(int)",
      "begin_line": 294,
      "end_line": 303,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.factorialDouble(int)",
      "begin_line": 318,
      "end_line": 327,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.factorialLog(int)",
      "begin_line": 336,
      "end_line": 349,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 26)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.gcd(int, int)",
      "begin_line": 380,
      "end_line": 436,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     * {@code gcd(Integer.MIN_VALUE, 0)} and\n     * {@code gcd(0, Integer.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     * {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     * {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 18)",
        "(line 382,col 9)-(line 382,col 18)",
        "(line 383,col 9)-(line 389,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 402,col 18)",
        "(line 403,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 412,col 9)",
        "(line 415,col 9)-(line 415,col 54)",
        "(line 418,col 9)-(line 434,col 25)",
        "(line 435,col 9)-(line 435,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.gcd(long, long)",
      "begin_line": 467,
      "end_line": 523,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 19)",
        "(line 469,col 9)-(line 469,col 19)",
        "(line 470,col 9)-(line 476,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 489,col 18)",
        "(line 490,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 499,col 9)",
        "(line 502,col 9)-(line 502,col 55)",
        "(line 505,col 9)-(line 521,col 25)",
        "(line 522,col 9)-(line 522,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.lcm(int, int)",
      "begin_line": 547,
      "end_line": 557,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 78)",
        "(line 552,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.lcm(long, long)",
      "begin_line": 581,
      "end_line": 591,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 79)",
        "(line 586,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.mulAndCheck(int, int)",
      "begin_line": 603,
      "end_line": 609,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 39)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.mulAndCheck(long, long)",
      "begin_line": 621,
      "end_line": 663,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 17)",
        "(line 623,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.subAndCheck(int, int)",
      "begin_line": 675,
      "end_line": 681,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 35)",
        "(line 677,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.subAndCheck(long, long)",
      "begin_line": 693,
      "end_line": 706,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 17)",
        "(line 695,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.addAndCheck(long, long, org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 719,
      "end_line": 752,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 17)",
        "(line 721,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtils.checkBinomial(int, int)",
      "begin_line": 762,
      "end_line": 770,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 769,col 9)"
      ]
    }
  ]
}