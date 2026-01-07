{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/util/ArithmeticUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 888,
      "comment": "\n * Some useful, arithmetics related, additions to the built-in functions in\n * {@link Math}.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.ArithmeticUtils()",
      "begin_line": 36,
      "end_line": 38,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(int, int)",
      "begin_line": 50,
      "end_line": 57,
      "comment": "\n     * Add two integers, checking for overflow.\n     *\n     * @param x an addend\n     * @param y an addend\n     * @return the sum {@code x+y}\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 35)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a an addend\n     * @param b an addend\n     * @return the sum {@code a+b}\n     * @throws MathArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(int, int)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     * @deprecated use {@link CombinatoricsUtils#binomialCoefficient(int, int)}\n     ",
      "child_ranges": [
        "(line 102,col 8)-(line 102,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     * @deprecated use {@link CombinatoricsUtils#binomialCoefficientDouble(int, int)}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(int, int)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     * @deprecated use {@link CombinatoricsUtils#binomialCoefficientLog(int, int)}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorial(int)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     * @deprecated use {@link CombinatoricsUtils#factorial(int)}\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(int)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @deprecated use {@link CombinatoricsUtils#factorialDouble(int)}\n     ",
      "child_ranges": [
        "(line 207,col 10)-(line 207,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.factorialLog(int)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @deprecated use {@link CombinatoricsUtils#factorialLog(int)}\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(int, int)",
      "begin_line": 250,
      "end_line": 307,
      "comment": "\n     * Computes the greatest common divisor of the absolute value of two\n     * numbers, using a modified version of the \"binary gcd\" method.\n     * See Knuth 4.5.2 algorithm B.\n     * The algorithm is due to Josef Stein (1961).\n     * \u003cbr/\u003e\n     * Special cases:\n     * \u003cul\u003e\n     *  \u003cli\u003eThe invocations\n     *   {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},\n     *   {@code gcd(Integer.MIN_VALUE, 0)} and\n     *   {@code gcd(0, Integer.MIN_VALUE)} throw an\n     *   {@code ArithmeticException}, because the result would be 2^31, which\n     *   is too large for an int value.\u003c/li\u003e\n     *  \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     *   {@code gcd(x, 0)} is the absolute value of {@code x}, except\n     *   for the special cases above.\u003c/li\u003e\n     *  \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     *   {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor (never negative).\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 18)",
        "(line 254,col 9)-(line 254,col 18)",
        "(line 255,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 20)",
        "(line 266,col 9)-(line 266,col 20)",
        "(line 267,col 9)-(line 267,col 32)",
        "(line 268,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcdPositive(int, int)",
      "begin_line": 329,
      "end_line": 362,
      "comment": "\n     * Computes the greatest common divisor of two \u003cem\u003epositive\u003c/em\u003e numbers\n     * (this precondition is \u003cem\u003enot\u003c/em\u003e checked and the result is undefined\n     * if not fulfilled) using the \"binary gcd\" method which avoids division\n     * and modulo operations.\n     * See Knuth 4.5.2 algorithm B.\n     * The algorithm is due to Josef Stein (1961).\n     * \u003cbr/\u003e\n     * Special cases:\n     * \u003cul\u003e\n     *  \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and\n     *   {@code gcd(x, 0)} is the value of {@code x}.\u003c/li\u003e\n     *  \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns\n     *   {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a Positive number.\n     * @param b Positive number.\n     * @return the greatest common divisor.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 336,col 9)",
        "(line 339,col 9)-(line 339,col 59)",
        "(line 340,col 9)-(line 340,col 20)",
        "(line 341,col 9)-(line 341,col 59)",
        "(line 342,col 9)-(line 342,col 20)",
        "(line 343,col 9)-(line 343,col 49)",
        "(line 351,col 9)-(line 358,col 9)",
        "(line 361,col 9)-(line 361,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.gcd(long, long)",
      "begin_line": 393,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},\n     * {@code gcd(Long.MIN_VALUE, 0L)} and\n     * {@code gcd(0L, Long.MIN_VALUE)} throw an\n     * {@code ArithmeticException}, because the result would be 2^63, which\n     * is too large for a long value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0L, x)} and\n     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation {@code gcd(0L, 0L)} is the only one which returns\n     * {@code 0L}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Number.\n     * @param q Number.\n     * @return the greatest common divisor, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 19)",
        "(line 395,col 9)-(line 395,col 19)",
        "(line 396,col 9)-(line 402,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 18)",
        "(line 416,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 425,col 9)",
        "(line 428,col 9)-(line 428,col 55)",
        "(line 431,col 9)-(line 447,col 25)",
        "(line 448,col 9)-(line 448,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(int, int)",
      "begin_line": 473,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Integer.MIN_VALUE, n)} and\n     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0, x)} and {@code lcm(x, 0)} is\n     * {@code 0} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented as\n     * a non-negative {@code int} value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 78)",
        "(line 478,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.lcm(long, long)",
      "begin_line": 507,
      "end_line": 517,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula {@code lcm(a,b) \u003d (a / gcd(a,b)) * b}.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations {@code lcm(Long.MIN_VALUE, n)} and\n     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a\n     * power of 2, throw an {@code ArithmeticException}, because the result\n     * would be 2^63, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is\n     * {@code 0L} for any {@code x}.\n     * \u003c/ul\u003e\n     *\n     * @param a Number.\n     * @param b Number.\n     * @return the least common multiple, never negative.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a non-negative {@code long} value.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 79)",
        "(line 512,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(int, int)",
      "begin_line": 529,
      "end_line": 535,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     *\n     * @param x Factor.\n     * @param y Factor.\n     * @return the product {@code x * y}.\n     * @throws MathArithmeticException if the result can not be\n     * represented as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 39)",
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(long, long)",
      "begin_line": 547,
      "end_line": 589,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     *\n     * @param a Factor.\n     * @param b Factor.\n     * @return the product {@code a * b}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 17)",
        "(line 549,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(int, int)",
      "begin_line": 601,
      "end_line": 607,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     *\n     * @param x Minuend.\n     * @param y Subtrahend.\n     * @return the difference {@code x - y}.\n     * @throws MathArithmeticException if the result can not be represented\n     * as an {@code int}.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 35)",
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(long, long)",
      "begin_line": 619,
      "end_line": 632,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     *\n     * @param a Value.\n     * @param b Value.\n     * @return the difference {@code a - b}.\n     * @throws MathArithmeticException if the result can not be represented as a\n     * {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 17)",
        "(line 621,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, int)",
      "begin_line": 642,
      "end_line": 658,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 645,col 9)",
        "(line 647,col 9)-(line 647,col 23)",
        "(line 648,col 9)-(line 648,col 23)",
        "(line 649,col 9)-(line 655,col 9)",
        "(line 657,col 9)-(line 657,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(int, long)",
      "begin_line": 668,
      "end_line": 684,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 9)",
        "(line 673,col 9)-(line 673,col 23)",
        "(line 674,col 9)-(line 674,col 23)",
        "(line 675,col 9)-(line 681,col 9)",
        "(line 683,col 9)-(line 683,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, int)",
      "begin_line": 694,
      "end_line": 710,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 697,col 9)",
        "(line 699,col 9)-(line 699,col 25)",
        "(line 700,col 9)-(line 700,col 24)",
        "(line 701,col 9)-(line 707,col 9)",
        "(line 709,col 9)-(line 709,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(long, long)",
      "begin_line": 720,
      "end_line": 736,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 25)",
        "(line 726,col 9)-(line 726,col 24)",
        "(line 727,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, int)",
      "begin_line": 746,
      "end_line": 752,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 751,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, long)",
      "begin_line": 762,
      "end_line": 779,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 767,col 43)",
        "(line 768,col 9)-(line 768,col 30)",
        "(line 769,col 9)-(line 775,col 9)",
        "(line 777,col 9)-(line 777,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 789,
      "end_line": 805,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 794,col 43)",
        "(line 795,col 9)-(line 795,col 30)",
        "(line 796,col 9)-(line 802,col 9)",
        "(line 804,col 9)-(line 804,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.stirlingS2(int, int)",
      "begin_line": 827,
      "end_line": 831,
      "comment": "\n     * Returns the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/StirlingNumberoftheSecondKind.html\"\u003e\n     * Stirling number of the second kind\u003c/a\u003e, \"{@code S(n,k)}\", the number of\n     * ways of partitioning an {@code n}-element set into {@code k} non-empty\n     * subsets.\n     * \u003cp\u003e\n     * The preconditions are {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code NotPositiveException} is thrown)\n     * \u003c/p\u003e\n     * @param n the size of the set\n     * @param k the number of non-empty subsets\n     * @return {@code S(n,k)}\n     * @throws NotPositiveException if {@code k \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if some overflow happens, typically for n exceeding 25 and\n     * k between 20 and n-2 (S(n,n-1) is handled specifically and does not overflow)\n     * @since 3.1\n     * @deprecated use {@link CombinatoricsUtils#stirlingS2(int, int)}\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(long, long, org.apache.commons.math3.exception.util.Localizable)",
      "begin_line": 844,
      "end_line": 877,
      "comment": "\n     * Add two long integers, checking for overflow.\n     *\n     * @param a Addend.\n     * @param b Addend.\n     * @param pattern Pattern to use for any thrown exception.\n     * @return the sum {@code a + b}.\n     * @throws MathArithmeticException if the result cannot be represented\n     * as a {@code long}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 17)",
        "(line 846,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(long)",
      "begin_line": 885,
      "end_line": 887,
      "comment": "\n     * Returns true if the argument is a power of two.\n     *\n     * @param n the number to test\n     * @return true if the argument is a power of two\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 47)"
      ]
    }
  ]
}