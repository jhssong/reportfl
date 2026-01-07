{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/ArithmeticUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 1112,
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
      "end_line": 71,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 35)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(int, int)",
      "begin_line": 113,
      "end_line": 167,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 44)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 132,col 9)-(line 132,col 24)",
        "(line 133,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 194,
      "end_line": 216,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 44)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 27)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(int, int)",
      "begin_line": 239,
      "end_line": 285,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 44)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 272,col 9)-(line 272,col 26)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorial(int)",
      "begin_line": 311,
      "end_line": 320,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(int)",
      "begin_line": 335,
      "end_line": 344,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialLog(int)",
      "begin_line": 353,
      "end_line": 366,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(int, int)",
      "begin_line": 396,
      "end_line": 453,
      "comment": "\n     * Computes the greatest common divisor of the absolute value of two\n     * numbers, using a modified version of the \"binary gcd\" method.\n     * See Knuth 4.5.2 algorithm B.\n     * The algorithm is due to Josef Stein (1961).\n     * \u003cbr/\u003e\n     * Special cases:\n     * \u003cul\u003e\n     *  \u003cli\u003eThe invocations\n     *   {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     *   {@code gcd(Integer.MIN_VALUE, 0)} and\n     *   {@code gcd(0, Integer.MIN_VALUE)} throw an\n     *   {@code ArithmeticException}, because the result would be 2^31, which\n     *   is too large for an int value.\u003c/li\u003e\n     *  \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     *   {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     *   for the special cases above.\u003c/li\u003e\n     *  \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     *   {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor (never negative).\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 18)",
        "(line 400,col 9)-(line 400,col 18)",
        "(line 401,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 20)",
        "(line 412,col 9)-(line 412,col 20)",
        "(line 413,col 9)-(line 413,col 32)",
        "(line 414,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcdPositive(int, int)",
      "begin_line": 475,
      "end_line": 508,
      "comment": "\n     * Computes the greatest common divisor of two \u003cem\u003epositive\u003c/em\u003e numbers\n     * (this precondition is \u003cem\u003enot\u003c/em\u003e checked and the result is undefined\n     * if not fulfilled) using the \"binary gcd\" method which avoids division\n     * and modulo operations.\n     * See Knuth 4.5.2 algorithm B.\n     * The algorithm is due to Josef Stein (1961).\n     * \u003cbr/\u003e\n     * Special cases:\n     * \u003cul\u003e\n     *  \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     *   {@code gcd(x, 0)} is the value of {@code x}.\u003c/li\u003e\n     *  \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     *   {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a Positive number.\n     * @param b Positive number.\n     * @return the greatest common divisor.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 482,col 9)",
        "(line 485,col 9)-(line 485,col 59)",
        "(line 486,col 9)-(line 486,col 20)",
        "(line 487,col 9)-(line 487,col 59)",
        "(line 488,col 9)-(line 488,col 20)",
        "(line 489,col 9)-(line 489,col 49)",
        "(line 497,col 9)-(line 504,col 9)",
        "(line 507,col 9)-(line 507,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(long, long)",
      "begin_line": 539,
      "end_line": 595,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 19)",
        "(line 541,col 9)-(line 541,col 19)",
        "(line 542,col 9)-(line 548,col 9)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 561,col 9)-(line 561,col 18)",
        "(line 562,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 571,col 9)",
        "(line 574,col 9)-(line 574,col 55)",
        "(line 577,col 9)-(line 593,col 25)",
        "(line 594,col 9)-(line 594,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(int, int)",
      "begin_line": 619,
      "end_line": 629,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 78)",
        "(line 624,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(long, long)",
      "begin_line": 653,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 79)",
        "(line 658,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(int, int)",
      "begin_line": 675,
      "end_line": 681,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 39)",
        "(line 677,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(long, long)",
      "begin_line": 693,
      "end_line": 735,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 17)",
        "(line 695,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(int, int)",
      "begin_line": 747,
      "end_line": 753,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 35)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(long, long)",
      "begin_line": 765,
      "end_line": 778,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 17)",
        "(line 767,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, int)",
      "begin_line": 788,
      "end_line": 804,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)",
        "(line 793,col 9)-(line 793,col 23)",
        "(line 794,col 9)-(line 794,col 23)",
        "(line 795,col 9)-(line 801,col 9)",
        "(line 803,col 9)-(line 803,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, long)",
      "begin_line": 814,
      "end_line": 830,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 817,col 9)",
        "(line 819,col 9)-(line 819,col 23)",
        "(line 820,col 9)-(line 820,col 23)",
        "(line 821,col 9)-(line 827,col 9)",
        "(line 829,col 9)-(line 829,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, int)",
      "begin_line": 840,
      "end_line": 856,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 845,col 25)",
        "(line 846,col 9)-(line 846,col 24)",
        "(line 847,col 9)-(line 853,col 9)",
        "(line 855,col 9)-(line 855,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, long)",
      "begin_line": 866,
      "end_line": 882,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 869,col 9)",
        "(line 871,col 9)-(line 871,col 25)",
        "(line 872,col 9)-(line 872,col 24)",
        "(line 873,col 9)-(line 879,col 9)",
        "(line 881,col 9)-(line 881,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, int)",
      "begin_line": 892,
      "end_line": 898,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 895,col 9)",
        "(line 897,col 9)-(line 897,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, long)",
      "begin_line": 908,
      "end_line": 925,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 913,col 43)",
        "(line 914,col 9)-(line 914,col 30)",
        "(line 915,col 9)-(line 921,col 9)",
        "(line 923,col 9)-(line 923,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 935,
      "end_line": 951,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 938,col 9)",
        "(line 940,col 9)-(line 940,col 43)",
        "(line 941,col 9)-(line 941,col 30)",
        "(line 942,col 9)-(line 948,col 9)",
        "(line 950,col 9)-(line 950,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(int, int)",
      "begin_line": 972,
      "end_line": 1037,
      "comment": "\n     * Returns the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/StirlingNumberoftheSecondKind.html\"\u003e\n     * Stirling number of the second kind\u003c/a\u003e, \"{@code S(n,k)}\", the number of\n     * ways of partitioning an {@code n}-element set into {@code k} non-empty\n     * subsets.\n     * \u003cp\u003e\n     * The preconditions are {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code NotPositiveException} is thrown)\n     * \u003c/p\u003e\n     * @param n the size of the set\n     * @param k the number of non-empty subsets\n     * @return {@code S(n,k)}\n     * @throws NotPositiveException if {@code k \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if some overflow happens, typically for n exceeding 25 and\n     * k between 20 and n-2 (S(n,n-1) is handled specifically and does not overflow)\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 981,col 9)-(line 981,col 48)",
        "(line 983,col 9)-(line 1005,col 9)",
        "(line 1007,col 9)-(line 1035,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long, org.apache.commons.math3.exception.util.Localizable)",
      "begin_line": 1050,
      "end_line": 1083,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 17)",
        "(line 1052,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1082,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.checkBinomial(int, int)",
      "begin_line": 1093,
      "end_line": 1101,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(long)",
      "begin_line": 1109,
      "end_line": 1111,
      "comment": "\n     * Returns true if the argument is a power of two.\n     *\n     * @param n the number to test\n     * @return true if the argument is a power of two\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 47)"
      ]
    }
  ]
}