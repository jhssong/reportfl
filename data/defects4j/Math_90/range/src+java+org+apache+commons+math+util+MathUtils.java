{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 1450,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Smallest positive number such that 1 - EPSILON is not numerically equal to 1. "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Safe minimum, such that 1 / SAFE_MIN does not overflow.\n     * \u003cp\u003eIn IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " 2 \u0026pi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(int, int)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 35)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Add two long integers, checking for overflow.\n     * \n     * @param a an addend\n     * @param b an addend\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.addAndCheck(long, long, java.lang.String)",
      "begin_line": 112,
      "end_line": 145,
      "comment": "\n     * Add two long integers, checking for overflow.\n     * \n     * @param a an addend\n     * @param b an addend\n     * @param msg the message to use for any thrown exception.\n     * @return the sum \u003ccode\u003ea+b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 17)",
        "(line 114,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficient(int, int)",
      "begin_line": 172,
      "end_line": 225,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are\n     * \u003ccode\u003e \u003c Long.MAX_VALUE\u003c/code\u003e is 66. If the computed value exceeds\n     * \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e an \u003ccode\u003eArithMeticException\u003c/code\u003e is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 189,col 49)",
        "(line 196,col 9)-(line 196,col 24)",
        "(line 197,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 249,
      "end_line": 277,
      "comment": "\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 27)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.binomialCoefficientLog(int, int)",
      "begin_line": 297,
      "end_line": 349,
      "comment": "\n     * Returns the natural \u003ccode\u003elog\u003c/code\u003e of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"\u003ccode\u003en choose k\u003c/code\u003e\", the number of\n     * \u003ccode\u003ek\u003c/code\u003e-element subsets that can be selected from an\n     * \u003ccode\u003en\u003c/code\u003e-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e0 \u003c\u003d k \u003c\u003d n \u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return \u003ccode\u003en choose k\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 336,col 9)-(line 336,col 26)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.compareTo(double, double, double)",
      "begin_line": 361,
      "end_line": 368,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * \n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.cosh(double)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic cosine\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Returns true iff both arguments are NaN or neither is NaN and they are\n     * equal\n     * \n     * @param x first value\n     * @param y second value\n     * @return true if the values are equal or both are NaN\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double, double, double)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * Returns true iff both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * \u003cp\u003e\n     * Two NaNs are considered equals, as are two infinities with same sign.\n     * \u003c/p\u003e\n     * \n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow\n     * @return true if the values are equal or within range of each other\n     ",
      "child_ranges": [
        "(line 406,col 7)-(line 406,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.equals(double[], double[])",
      "begin_line": 419,
      "end_line": 432,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions\n     * and all their elements are {@link #equals(double,double) equals}\n     * \n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factorials"
      ],
      "begin_line": 435,
      "end_line": 439,
      "comment": " All long-representable factorials "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorial(int)",
      "begin_line": 463,
      "end_line": 472,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003elong\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Long.MAX_VALUE\u003c/code\u003e is 20. If the computed value exceeds \u003ccode\u003eLong.MAX_VALUE\u003c/code\u003e\n     * an \u003ccode\u003eArithMeticException \u003c/code\u003e is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws ArithmeticException if the result is too large to be represented\n     *         by a long integer.\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialDouble(int)",
      "begin_line": 494,
      "end_line": 502,
      "comment": "\n     * Returns n!. Shorthand for \u003ccode\u003en\u003c/code\u003e \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers \u003ccode\u003e1,...,n\u003c/code\u003e as a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a \u003ccode\u003edouble\u003c/code\u003e. The\n     * largest value of \u003ccode\u003en\u003c/code\u003e for which \u003ccode\u003en!\u003c/code\u003e \u003c\n     * Double.MAX_VALUE\u003c/code\u003e is 170. If the computed value exceeds\n     * Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if n \u003c 0\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.factorialLog(int)",
      "begin_line": 517,
      "end_line": 529,
      "comment": "\n     * Returns the natural logarithm of n!.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e\u003d 0\u003c/code\u003e (otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param n argument\n     * @return \u003ccode\u003en!\u003c/code\u003e\n     * @throws IllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 26)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.gcd(int, int)",
      "begin_line": 561,
      "end_line": 619,
      "comment": "\n     * \u003cp\u003e\n     * Gets the greatest common divisor of the absolute value of two numbers,\n     * using the \"binary gcd\" method which avoids division and modulo\n     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef\n     * Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, Integer.MIN_VALUE)\u003c/code\u003e,\n     * \u003ccode\u003egcd(Integer.MIN_VALUE, 0)\u003c/code\u003e and\n     * \u003ccode\u003egcd(0, Integer.MIN_VALUE)\u003c/code\u003e throw an\n     * \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result would be 2^31, which\n     * is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003egcd(x, x)\u003c/code\u003e, \u003ccode\u003egcd(0, x)\u003c/code\u003e and\n     * \u003ccode\u003egcd(x, 0)\u003c/code\u003e is the absolute value of \u003ccode\u003ex\u003c/code\u003e, except\n     * for the special cases above.\n     * \u003cli\u003eThe invocation \u003ccode\u003egcd(0, 0)\u003c/code\u003e is the only one which returns\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param p any number\n     * @param q any number\n     * @return the greatest common divisor, never negative\n     * @throws ArithmeticException\n     *             if the result cannot be represented as a nonnegative int\n     *             value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 18)",
        "(line 563,col 9)-(line 563,col 18)",
        "(line 564,col 9)-(line 571,col 9)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 584,col 9)-(line 584,col 18)",
        "(line 585,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 595,col 9)",
        "(line 598,col 9)-(line 598,col 54)",
        "(line 601,col 9)-(line 617,col 25)",
        "(line 618,col 9)-(line 618,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     * \n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     * \n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 661,
      "end_line": 666,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is\n     * \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 675,
      "end_line": 680,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 688,
      "end_line": 690,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     * \n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 698,
      "end_line": 700,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     * \n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     * \n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.lcm(int, int)",
      "begin_line": 736,
      "end_line": 745,
      "comment": "\n     * \u003cp\u003e\n     * Returns the least common multiple of the absolute value of two numbers,\n     * using the formula \u003ccode\u003elcm(a,b) \u003d (a / gcd(a,b)) * b\u003c/code\u003e.\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe invocations \u003ccode\u003elcm(Integer.MIN_VALUE, n)\u003c/code\u003e and\n     * \u003ccode\u003elcm(n, Integer.MIN_VALUE)\u003c/code\u003e, where \u003ccode\u003eabs(n)\u003c/code\u003e is a\n     * power of 2, throw an \u003ccode\u003eArithmeticException\u003c/code\u003e, because the result\n     * would be 2^31, which is too large for an int value.\u003c/li\u003e\n     * \u003cli\u003eThe result of \u003ccode\u003elcm(0, x)\u003c/code\u003e and \u003ccode\u003elcm(x, 0)\u003c/code\u003e is\n     * \u003ccode\u003e0\u003c/code\u003e for any \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/ul\u003e\n     * \n     * @param a any number\n     * @param b any number\n     * @return the least common multiple, never negative\n     * @throws ArithmeticException\n     *             if the result cannot be represented as a nonnegative int\n     *             value\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 58)",
        "(line 741,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.log(double, double)",
      "begin_line": 763,
      "end_line": 765,
      "comment": " \n     * \u003cp\u003eReturns the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003elogarithm\u003c/a\u003e\n     * for base \u003ccode\u003eb\u003c/code\u003e of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eReturns \u003ccode\u003eNaN\u003ccode\u003e if either argument is negative.  If \n     * \u003ccode\u003ebase\u003c/code\u003e is 0 and \u003ccode\u003ex\u003c/code\u003e is positive, 0 is returned.\n     * If \u003ccode\u003ebase\u003c/code\u003e is positive and \u003ccode\u003ex\u003c/code\u003e is 0, \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e is returned.  If both arguments\n     * are 0, the result is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param base the base of the logarithm, must be greater than 0\n     * @param x argument, must be greater than 0\n     * @return the value of the logarithm - the number y such that base^y \u003d x.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(int, int)",
      "begin_line": 777,
      "end_line": 783,
      "comment": "\n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 39)",
        "(line 779,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.mulAndCheck(long, long)",
      "begin_line": 795,
      "end_line": 838,
      "comment": "\n     * Multiply two long integers, checking for overflow.\n     * \n     * @param a first value\n     * @param b second value\n     * @return the product \u003ccode\u003ea * b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 17)",
        "(line 797,col 9)-(line 797,col 42)",
        "(line 798,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.nextAfter(double, double)",
      "begin_line": 857,
      "end_line": 895,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     * \n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 864,col 9)",
        "(line 869,col 9)-(line 869,col 51)",
        "(line 870,col 9)-(line 870,col 51)",
        "(line 871,col 9)-(line 871,col 51)",
        "(line 872,col 9)-(line 872,col 51)",
        "(line 874,col 9)-(line 893,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.scalb(double, int)",
      "begin_line": 906,
      "end_line": 922,
      "comment": "\n     * Scale a number by 2\u003csup\u003escaleFactor\u003c/sup\u003e.\n     * \u003cp\u003eIf \u003ccode\u003ed\u003c/code\u003e is 0 or NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     * \n     * @param d base number\n     * @param scaleFactor power of two by which d sould be multiplied\n     * @return d \u0026times; 2\u003csup\u003escaleFactor\u003c/sup\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 911,col 9)",
        "(line 914,col 9)-(line 914,col 57)",
        "(line 915,col 9)-(line 915,col 57)",
        "(line 916,col 9)-(line 916,col 57)",
        "(line 919,col 9)-(line 919,col 78)",
        "(line 920,col 9)-(line 920,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, Math.PI);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       \u003ccode\u003ea \u003d MathUtils.normalizeAngle(a, 0.0);\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       \u003ccode\u003eangle \u003d MathUtils.normalizeAngle(end, start) - start;\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 944,col 10)-(line 944,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int)",
      "begin_line": 956,
      "end_line": 958,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(double, int, int)",
      "begin_line": 972,
      "end_line": 985,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 984,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int)",
      "begin_line": 996,
      "end_line": 998,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounding using the {@link BigDecimal#ROUND_HALF_UP} method.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.round(float, int, int)",
      "begin_line": 1012,
      "end_line": 1016,
      "comment": "\n     * Round the given value to the specified number of decimal places. The\n     * value is rounded using the given method which is any method defined in\n     * {@link BigDecimal}.\n     * \n     * @param x the value to round.\n     * @param scale the number of digits to the right of the decimal point.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 34)",
        "(line 1014,col 9)-(line 1014,col 60)",
        "(line 1015,col 9)-(line 1015,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.roundUnscaled(double, double, int)",
      "begin_line": 1030,
      "end_line": 1099,
      "comment": "\n     * Round the given non-negative, value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     * \n     * @param unscaled the value to round.\n     * @param sign the sign of the original, scaled value.\n     * @param roundingMethod the rounding method as defined in\n     *        {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1098,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 1111,
      "end_line": 1113,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(double)",
      "begin_line": 1127,
      "end_line": 1132,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for double precision \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a double value \u003ccode\u003ex\u003c/code\u003e, this method returns\n     * \u003ccode\u003e+1.0\u003c/code\u003e if \u003ccode\u003ex \u003e 0\u003c/code\u003e, \u003ccode\u003e0.0\u003c/code\u003e if\n     * \u003ccode\u003ex \u003d 0.0\u003c/code\u003e, and \u003ccode\u003e-1.0\u003c/code\u003e if \u003ccode\u003ex \u003c 0\u003c/code\u003e.\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param x the value, a double\n     * @return +1.0, 0.0, or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1128,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1131,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(float)",
      "begin_line": 1145,
      "end_line": 1150,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for float value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a float value x, this method returns +1.0F if x \u003e 0, 0.0F if x \u003d\n     * 0.0F, and -1.0F if x \u003c 0. Returns \u003ccode\u003eNaN\u003c/code\u003e if \u003ccode\u003ex\u003c/code\u003e\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param x the value, a float\n     * @return +1.0F, 0.0F, or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1149,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 1162,
      "end_line": 1164,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 1176,
      "end_line": 1178,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 1191,
      "end_line": 1193,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for short value \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * For a short value x, this method returns (short)(+1) if x \u003e 0, (short)(0)\n     * if x \u003d 0, and (short)(-1) if x \u003c 0.\u003c/p\u003e\n     * \n     * @param x the value, a short\n     * @return (short)(+1), (short)(0), or (short)(-1), depending on the sign of\n     *         x\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1192,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sinh(double)",
      "begin_line": 1202,
      "end_line": 1204,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\"\u003e\n     * hyperbolic sine\u003c/a\u003e of x.\n     * \n     * @param x double value for which to find the hyperbolic sine\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 1203,col 9)-(line 1203,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(int, int)",
      "begin_line": 1216,
      "end_line": 1222,
      "comment": "\n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         int\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 35)",
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.subAndCheck(long, long)",
      "begin_line": 1234,
      "end_line": 1248,
      "comment": "\n     * Subtract two long integers, checking for overflow.\n     * \n     * @param a first value\n     * @param b second value\n     * @return the difference \u003ccode\u003ea-b\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as an\n     *         long\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1235,col 9)-(line 1235,col 17)",
        "(line 1236,col 9)-(line 1236,col 42)",
        "(line 1237,col 9)-(line 1246,col 9)",
        "(line 1247,col 9)-(line 1247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, int)",
      "begin_line": 1257,
      "end_line": 1278,
      "comment": "\n     * Raise an int to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1264,col 9)",
        "(line 1266,col 9)-(line 1266,col 23)",
        "(line 1267,col 9)-(line 1267,col 23)",
        "(line 1268,col 9)-(line 1274,col 9)",
        "(line 1276,col 9)-(line 1276,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, long)",
      "begin_line": 1287,
      "end_line": 1308,
      "comment": "\n     * Raise an int to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1294,col 9)",
        "(line 1296,col 9)-(line 1296,col 23)",
        "(line 1297,col 9)-(line 1297,col 23)",
        "(line 1298,col 9)-(line 1304,col 9)",
        "(line 1306,col 9)-(line 1306,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, int)",
      "begin_line": 1317,
      "end_line": 1338,
      "comment": "\n     * Raise a long to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1324,col 9)",
        "(line 1326,col 9)-(line 1326,col 25)",
        "(line 1327,col 9)-(line 1327,col 24)",
        "(line 1328,col 9)-(line 1334,col 9)",
        "(line 1336,col 9)-(line 1336,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, long)",
      "begin_line": 1347,
      "end_line": 1368,
      "comment": "\n     * Raise a long to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1350,col 9)-(line 1354,col 9)",
        "(line 1356,col 9)-(line 1356,col 25)",
        "(line 1357,col 9)-(line 1357,col 24)",
        "(line 1358,col 9)-(line 1364,col 9)",
        "(line 1366,col 9)-(line 1366,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, int)",
      "begin_line": 1377,
      "end_line": 1388,
      "comment": "\n     * Raise a BigInteger to an int power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1384,col 9)",
        "(line 1386,col 9)-(line 1386,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, long)",
      "begin_line": 1397,
      "end_line": 1418,
      "comment": "\n     * Raise a BigInteger to a long power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1404,col 9)",
        "(line 1406,col 9)-(line 1406,col 43)",
        "(line 1407,col 9)-(line 1407,col 30)",
        "(line 1408,col 9)-(line 1414,col 9)",
        "(line 1416,col 9)-(line 1416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 1427,
      "end_line": 1448,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     * @param k number to raise\n     * @param e exponent (must be positive or null)\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @exception IllegalArgumentException if e is negative\n     ",
      "child_ranges": [
        "(line 1430,col 9)-(line 1434,col 9)",
        "(line 1436,col 9)-(line 1436,col 43)",
        "(line 1437,col 9)-(line 1437,col 30)",
        "(line 1438,col 9)-(line 1444,col 9)",
        "(line 1446,col 9)-(line 1446,col 22)"
      ]
    }
  ]
}