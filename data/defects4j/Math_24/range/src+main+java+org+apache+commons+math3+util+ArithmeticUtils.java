{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/util/ArithmeticUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 1048,
      "comment": "\n * Some useful, arithmetics related, additions to the built-in functions in\n * {@link Math}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 37,
      "end_line": 44,
      "comment": " All long-representable factorials "
    },
    {
      "type": "field",
      "varNames": [
        "STIRLING_S2"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Stirling numbers of the second kind. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.ArithmeticUtils()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(int, int)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 35)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(int, int)",
      "begin_line": 112,
      "end_line": 165,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 190,
      "end_line": 211,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 27)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(int, int)",
      "begin_line": 232,
      "end_line": 277,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 44)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 264,col 9)-(line 264,col 26)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorial(int)",
      "begin_line": 303,
      "end_line": 312,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(int)",
      "begin_line": 327,
      "end_line": 336,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialLog(int)",
      "begin_line": 345,
      "end_line": 358,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 26)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(int, int)",
      "begin_line": 389,
      "end_line": 445,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     * {@code gcd(Integer.MIN_VALUE, 0)} and\n     * {@code gcd(0, Integer.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     * {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     * {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 18)",
        "(line 391,col 9)-(line 391,col 18)",
        "(line 392,col 9)-(line 398,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 18)",
        "(line 412,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 421,col 9)",
        "(line 424,col 9)-(line 424,col 54)",
        "(line 427,col 9)-(line 443,col 25)",
        "(line 444,col 9)-(line 444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(long, long)",
      "begin_line": 476,
      "end_line": 532,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 19)",
        "(line 478,col 9)-(line 478,col 19)",
        "(line 479,col 9)-(line 485,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 498,col 18)",
        "(line 499,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 508,col 9)",
        "(line 511,col 9)-(line 511,col 55)",
        "(line 514,col 9)-(line 530,col 25)",
        "(line 531,col 9)-(line 531,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(int, int)",
      "begin_line": 556,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 78)",
        "(line 561,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(long, long)",
      "begin_line": 590,
      "end_line": 600,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 79)",
        "(line 595,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(int, int)",
      "begin_line": 612,
      "end_line": 618,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 39)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(long, long)",
      "begin_line": 630,
      "end_line": 672,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 17)",
        "(line 632,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(int, int)",
      "begin_line": 684,
      "end_line": 690,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 35)",
        "(line 686,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(long, long)",
      "begin_line": 702,
      "end_line": 715,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 17)",
        "(line 704,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, int)",
      "begin_line": 725,
      "end_line": 741,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 23)",
        "(line 731,col 9)-(line 731,col 23)",
        "(line 732,col 9)-(line 738,col 9)",
        "(line 740,col 9)-(line 740,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, long)",
      "begin_line": 751,
      "end_line": 767,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 23)",
        "(line 757,col 9)-(line 757,col 23)",
        "(line 758,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 766,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, int)",
      "begin_line": 777,
      "end_line": 793,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 780,col 9)",
        "(line 782,col 9)-(line 782,col 25)",
        "(line 783,col 9)-(line 783,col 24)",
        "(line 784,col 9)-(line 790,col 9)",
        "(line 792,col 9)-(line 792,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, long)",
      "begin_line": 803,
      "end_line": 819,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 806,col 9)",
        "(line 808,col 9)-(line 808,col 25)",
        "(line 809,col 9)-(line 809,col 24)",
        "(line 810,col 9)-(line 816,col 9)",
        "(line 818,col 9)-(line 818,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, int)",
      "begin_line": 829,
      "end_line": 835,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 832,col 9)",
        "(line 834,col 9)-(line 834,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, long)",
      "begin_line": 845,
      "end_line": 862,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 848,col 9)",
        "(line 850,col 9)-(line 850,col 43)",
        "(line 851,col 9)-(line 851,col 30)",
        "(line 852,col 9)-(line 858,col 9)",
        "(line 860,col 9)-(line 860,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 872,
      "end_line": 888,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 875,col 9)",
        "(line 877,col 9)-(line 877,col 43)",
        "(line 878,col 9)-(line 878,col 30)",
        "(line 879,col 9)-(line 885,col 9)",
        "(line 887,col 9)-(line 887,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(int, int)",
      "begin_line": 908,
      "end_line": 973,
      "comment": "\n     * Returns the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/StirlingNumberoftheSecondKind.html\"\u003e\n     * Stirling number of the second kind\u003c/a\u003e, \"{@code S(n,k)}\", the number of\n     * ways of partitioning an {@code n}-element set into {@code k} non-empty\n     * subsets.\n     * \u003cp\u003e\n     * The preconditions are {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code NotPositiveException} is thrown)\n     * \u003c/p\u003e\n     * @param n the size of the set\n     * @param k the number of non-empty subsets\n     * @return {@code S(n,k)}\n     * @throws NotPositiveException if {@code k \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if some overflow happens, typically for n exceeding 25 and\n     * k between 20 and n-2 (S(n,n-1) is handled specifically and does not overflow)\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 917,col 48)",
        "(line 919,col 9)-(line 941,col 9)",
        "(line 943,col 9)-(line 971,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long, org.apache.commons.math3.exception.util.Localizable)",
      "begin_line": 986,
      "end_line": 1019,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 17)",
        "(line 988,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1018,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.checkBinomial(int, int)",
      "begin_line": 1029,
      "end_line": 1037,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1036,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(long)",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "\n     * Returns true if the argument is a power of two.\n     *\n     * @param n the number to test\n     * @return true if the argument is a power of two\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 47)"
      ]
    }
  ]
}