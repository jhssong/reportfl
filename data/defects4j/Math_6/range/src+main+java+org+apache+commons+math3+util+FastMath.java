{
  "filepath": "/tmp/Math-6b/src/main/java/org/apache/commons/math3/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 3865,
      "comment": "\n * Faster, more accurate, portable alternative to {@link Math} and\n * {@link StrictMath} for large scale computation.\n * \u003cp\u003e\n * FastMath is a drop-in replacement for both Math and StrictMath. This\n * means that for any method in Math (say {@code Math.sin(x)} or\n * {@code Math.cbrt(y)}), user can directly change the class and use the\n * methods as is (using {@code FastMath.sin(x)} or {@code FastMath.cbrt(y)}\n * in the previous example).\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath speed is achieved by relying heavily on optimizing compilers\n * to native code present in many JVMs today and use of large tables.\n * The larger tables are lazily initialised on first use, so that the setup\n * time does not penalise methods that don\u0027t need them.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note that FastMath is\n * extensively used inside Apache Commons Math, so by calling some algorithms,\n * the overhead when the the tables need to be intialised will occur\n * regardless of the end-user calling FastMath methods directly or not.\n * Performance figures for a specific JVM and hardware can be evaluated by\n * running the FastMathTestPerformance tests in the test directory of the source\n * distribution.\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath accuracy should be mostly independent of the JVM as it relies only\n * on IEEE-754 basic operations and on embedded tables. Almost all operations\n * are accurate to about 0.5 ulp throughout the domain range. This statement,\n * of course is only a rough global observed behavior, it is \u003cem\u003enot\u003c/em\u003e a\n * guarantee for \u003cem\u003eevery\u003c/em\u003e double numbers input (see William Kahan\u0027s \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Rounding#The_table-maker.27s_dilemma\"\u003eTable\n * Maker\u0027s Dilemma\u003c/a\u003e).\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath additionally implements the following methods not found in Math/StrictMath:\n * \u003cul\u003e\n * \u003cli\u003e{@link #asinh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #acosh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #atanh(double)}\u003c/li\u003e\n * \u003c/ul\u003e\n * The following methods are found in Math/StrictMath since 1.6 only, they are provided\n * by FastMath even in 1.5 Java virtual machines\n * \u003cul\u003e\n * \u003cli\u003e{@link #copySign(double, double)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(double,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(double, int)}\u003c/li\u003e\n * \u003cli\u003e{@link #copySign(float, float)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(float,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(float, int)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "PI"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Archimede\u0027s constant PI, ratio of circle circumference to diameter. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Napier\u0027s constant e, base of the natural logarithm. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_MAX_INDEX"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Index of exp(0) in the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_LEN"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Length of the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT_LEN"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Logarithm table length. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_LEN"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " 0, 1/1024, ... 1024/1024"
    },
    {
      "type": "field",
      "varNames": [
        "LOG_MAX_VALUE"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " StrictMath.log(Double.MAX_VALUE): {@value} "
    },
    {
      "type": "field",
      "varNames": [
        "RECOMPUTE_TABLES_AT_RUNTIME"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Indicator for tables initialization.\n     * \u003cp\u003e\n     * This compile-time constant should be set to true only if one explicitly\n     * wants to compute the tables at class loading time instead of using the\n     * already computed ones provided as literal arrays below.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_A"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " log(2) (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_B"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " log(2) (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_QUICK_COEF"
      ],
      "begin_line": 115,
      "end_line": 125,
      "comment": " Coefficients for log, when input 0.99 \u003c x \u003c 1.01. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_HI_PREC_COEF"
      ],
      "begin_line": 128,
      "end_line": 135,
      "comment": " Coefficients for log in the range of 1.0 \u003c x \u003c 1.0 + 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_LEN"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Sine, Cosine, Tangent tables are for 0, 1/8, 2/8, ... 13/8 \u003d PI/2 approx. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_A"
      ],
      "begin_line": 141,
      "end_line": 157,
      "comment": " Sine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_B"
      ],
      "begin_line": 160,
      "end_line": 176,
      "comment": " Sine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_A"
      ],
      "begin_line": 179,
      "end_line": 195,
      "comment": " Cosine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_B"
      ],
      "begin_line": 198,
      "end_line": 214,
      "comment": " Cosine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_A"
      ],
      "begin_line": 218,
      "end_line": 234,
      "comment": " Tangent table, used by atan() (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_B"
      ],
      "begin_line": 237,
      "end_line": 253,
      "comment": " Tangent table, used by atan() (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "RECIP_2PI"
      ],
      "begin_line": 256,
      "end_line": 274,
      "comment": " Bits of 1/(2*pi), need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "PI_O_4_BITS"
      ],
      "begin_line": 277,
      "end_line": 279,
      "comment": " Bits of pi/4, need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "EIGHTHS"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " Eighths.\n     * This is used by sinQ, because its faster to do a table lookup than\n     * a multiply in this time-critical routine\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CBRTTWO"
      ],
      "begin_line": 288,
      "end_line": 292,
      "comment": " Table of 2^((n+2)/3) "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_40000000"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " 1073741824L"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_30BITS"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " 0xFFFFFFFFC0000000L;"
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_52"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_53"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " 2^53 - double numbers this large must be even. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_3"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_5"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_7"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_9"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_11"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_13"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_15"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_17"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_3_4"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_15_16"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_13_14"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_11_12"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_9_10"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_7_8"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_5_6"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_2"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_4"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.FastMath()",
      "begin_line": 353,
      "end_line": 353,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.doubleHighPart(double)",
      "begin_line": 364,
      "end_line": 371,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 45)",
        "(line 369,col 9)-(line 369,col 30)",
        "(line 370,col 9)-(line 370,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sqrt(double)",
      "begin_line": 378,
      "end_line": 380,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosh(double)",
      "begin_line": 386,
      "end_line": 449,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 387,col 7)-(line 389,col 7)",
        "(line 396,col 7)-(line 412,col 7)",
        "(line 414,col 7)-(line 414,col 44)",
        "(line 415,col 7)-(line 417,col 7)",
        "(line 418,col 7)-(line 418,col 26)",
        "(line 420,col 7)-(line 420,col 40)",
        "(line 421,col 7)-(line 421,col 48)",
        "(line 423,col 7)-(line 423,col 38)",
        "(line 424,col 7)-(line 424,col 36)",
        "(line 425,col 7)-(line 425,col 28)",
        "(line 428,col 7)-(line 428,col 28)",
        "(line 429,col 7)-(line 429,col 34)",
        "(line 430,col 7)-(line 430,col 42)",
        "(line 431,col 7)-(line 431,col 37)",
        "(line 434,col 7)-(line 434,col 82)",
        "(line 436,col 7)-(line 436,col 36)",
        "(line 439,col 7)-(line 439,col 25)",
        "(line 440,col 7)-(line 440,col 34)",
        "(line 441,col 7)-(line 441,col 16)",
        "(line 442,col 7)-(line 442,col 25)",
        "(line 443,col 7)-(line 443,col 34)",
        "(line 444,col 7)-(line 444,col 16)",
        "(line 446,col 7)-(line 446,col 30)",
        "(line 447,col 7)-(line 447,col 20)",
        "(line 448,col 7)-(line 448,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinh(double)",
      "begin_line": 455,
      "end_line": 574,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 456,col 7)-(line 456,col 29)",
        "(line 457,col 7)-(line 459,col 7)",
        "(line 466,col 7)-(line 482,col 7)",
        "(line 484,col 7)-(line 486,col 7)",
        "(line 488,col 7)-(line 491,col 7)",
        "(line 493,col 7)-(line 493,col 20)",
        "(line 495,col 7)-(line 567,col 7)",
        "(line 569,col 7)-(line 571,col 7)",
        "(line 573,col 7)-(line 573,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanh(double)",
      "begin_line": 580,
      "end_line": 698,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 581,col 7)-(line 581,col 29)",
        "(line 583,col 7)-(line 585,col 7)",
        "(line 593,col 7)-(line 595,col 7)",
        "(line 597,col 7)-(line 599,col 7)",
        "(line 601,col 7)-(line 603,col 7)",
        "(line 605,col 7)-(line 608,col 7)",
        "(line 610,col 7)-(line 610,col 20)",
        "(line 611,col 7)-(line 691,col 7)",
        "(line 693,col 7)-(line 695,col 7)",
        "(line 697,col 7)-(line 697,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acosh(double)",
      "begin_line": 704,
      "end_line": 706,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asinh(double)",
      "begin_line": 712,
      "end_line": 736,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 33)",
        "(line 714,col 9)-(line 717,col 9)",
        "(line 719,col 9)-(line 719,col 24)",
        "(line 720,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atanh(double)",
      "begin_line": 742,
      "end_line": 766,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 33)",
        "(line 744,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 24)",
        "(line 750,col 9)-(line 763,col 9)",
        "(line 765,col 9)-(line 765,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(double)",
      "begin_line": 773,
      "end_line": 775,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(float)",
      "begin_line": 782,
      "end_line": 784,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(double)",
      "begin_line": 790,
      "end_line": 792,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(float)",
      "begin_line": 798,
      "end_line": 800,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.random()",
      "begin_line": 806,
      "end_line": 808,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double)",
      "begin_line": 830,
      "end_line": 832,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double, double, double[])",
      "begin_line": 841,
      "end_line": 956,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 24)",
        "(line 843,col 9)-(line 843,col 24)",
        "(line 844,col 9)-(line 844,col 19)",
        "(line 850,col 9)-(line 900,col 9)",
        "(line 906,col 9)-(line 906,col 58)",
        "(line 907,col 9)-(line 907,col 72)",
        "(line 908,col 9)-(line 908,col 72)",
        "(line 914,col 9)-(line 914,col 63)",
        "(line 923,col 9)-(line 923,col 39)",
        "(line 924,col 9)-(line 924,col 45)",
        "(line 925,col 9)-(line 925,col 45)",
        "(line 926,col 9)-(line 926,col 30)",
        "(line 927,col 9)-(line 927,col 49)",
        "(line 934,col 9)-(line 934,col 44)",
        "(line 935,col 9)-(line 935,col 90)",
        "(line 941,col 9)-(line 941,col 43)",
        "(line 942,col 9)-(line 942,col 28)",
        "(line 943,col 9)-(line 947,col 9)",
        "(line 949,col 9)-(line 953,col 9)",
        "(line 955,col 9)-(line 955,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double)",
      "begin_line": 962,
      "end_line": 964,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 963,col 7)-(line 963,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double, double[])",
      "begin_line": 971,
      "end_line": 1111,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 974,col 9)",
        "(line 976,col 9)-(line 989,col 9)",
        "(line 991,col 9)-(line 991,col 21)",
        "(line 992,col 9)-(line 992,col 21)",
        "(line 993,col 9)-(line 993,col 23)",
        "(line 994,col 9)-(line 994,col 33)",
        "(line 996,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1015,col 9)",
        "(line 1019,col 9)-(line 1019,col 41)",
        "(line 1020,col 9)-(line 1020,col 49)",
        "(line 1021,col 9)-(line 1021,col 48)",
        "(line 1022,col 9)-(line 1022,col 48)",
        "(line 1023,col 9)-(line 1023,col 26)",
        "(line 1024,col 9)-(line 1024,col 26)",
        "(line 1026,col 9)-(line 1026,col 28)",
        "(line 1027,col 9)-(line 1027,col 30)",
        "(line 1028,col 9)-(line 1028,col 31)",
        "(line 1029,col 9)-(line 1029,col 18)",
        "(line 1031,col 9)-(line 1031,col 33)",
        "(line 1032,col 9)-(line 1032,col 32)",
        "(line 1033,col 9)-(line 1033,col 24)",
        "(line 1034,col 9)-(line 1034,col 18)",
        "(line 1037,col 9)-(line 1037,col 31)",
        "(line 1039,col 9)-(line 1039,col 31)",
        "(line 1040,col 9)-(line 1040,col 46)",
        "(line 1041,col 9)-(line 1041,col 18)",
        "(line 1043,col 9)-(line 1043,col 31)",
        "(line 1044,col 9)-(line 1044,col 40)",
        "(line 1045,col 9)-(line 1045,col 18)",
        "(line 1047,col 9)-(line 1047,col 31)",
        "(line 1048,col 9)-(line 1048,col 38)",
        "(line 1049,col 9)-(line 1049,col 18)",
        "(line 1053,col 9)-(line 1053,col 26)",
        "(line 1054,col 9)-(line 1054,col 35)",
        "(line 1055,col 9)-(line 1055,col 18)",
        "(line 1057,col 9)-(line 1057,col 23)",
        "(line 1059,col 9)-(line 1059,col 32)",
        "(line 1060,col 9)-(line 1060,col 18)",
        "(line 1062,col 9)-(line 1062,col 26)",
        "(line 1064,col 9)-(line 1064,col 35)",
        "(line 1065,col 9)-(line 1065,col 18)",
        "(line 1067,col 9)-(line 1067,col 23)",
        "(line 1069,col 9)-(line 1069,col 32)",
        "(line 1070,col 9)-(line 1070,col 18)",
        "(line 1072,col 9)-(line 1103,col 9)",
        "(line 1105,col 9)-(line 1108,col 9)",
        "(line 1110,col 9)-(line 1110,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double)",
      "begin_line": 1119,
      "end_line": 1121,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double[])",
      "begin_line": 1129,
      "end_line": 1353,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1133,col 47)",
        "(line 1136,col 9)-(line 1144,col 9)",
        "(line 1147,col 9)-(line 1153,col 9)",
        "(line 1156,col 9)-(line 1156,col 41)",
        "(line 1158,col 9)-(line 1175,col 9)",
        "(line 1178,col 9)-(line 1225,col 9)",
        "(line 1228,col 9)-(line 1228,col 87)",
        "(line 1239,col 9)-(line 1239,col 103)",
        "(line 1241,col 9)-(line 1241,col 26)",
        "(line 1242,col 9)-(line 1242,col 26)",
        "(line 1244,col 9)-(line 1304,col 9)",
        "(line 1320,col 9)-(line 1320,col 30)",
        "(line 1321,col 9)-(line 1321,col 23)",
        "(line 1322,col 9)-(line 1322,col 28)",
        "(line 1323,col 9)-(line 1323,col 33)",
        "(line 1324,col 9)-(line 1324,col 14)",
        "(line 1325,col 9)-(line 1325,col 18)",
        "(line 1327,col 9)-(line 1327,col 21)",
        "(line 1328,col 9)-(line 1328,col 28)",
        "(line 1329,col 9)-(line 1329,col 14)",
        "(line 1330,col 9)-(line 1330,col 18)",
        "(line 1332,col 9)-(line 1332,col 27)",
        "(line 1333,col 9)-(line 1333,col 34)",
        "(line 1334,col 9)-(line 1334,col 14)",
        "(line 1335,col 9)-(line 1335,col 18)",
        "(line 1337,col 9)-(line 1337,col 23)",
        "(line 1338,col 9)-(line 1338,col 30)",
        "(line 1339,col 9)-(line 1339,col 14)",
        "(line 1340,col 9)-(line 1340,col 18)",
        "(line 1342,col 9)-(line 1342,col 21)",
        "(line 1343,col 9)-(line 1343,col 28)",
        "(line 1344,col 9)-(line 1344,col 14)",
        "(line 1345,col 9)-(line 1345,col 18)",
        "(line 1347,col 9)-(line 1350,col 9)",
        "(line 1352,col 9)-(line 1352,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log1p(double)",
      "begin_line": 1361,
      "end_line": 1391,
      "comment": "\n     * Computes log(1 + x).\n     *\n     * @param x Number.\n     * @return {@code log(1 + x)}.\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1364,col 9)",
        "(line 1366,col 9)-(line 1368,col 9)",
        "(line 1370,col 9)-(line 1390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log10(double)",
      "begin_line": 1397,
      "end_line": 1413,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1398,col 9)-(line 1398,col 46)",
        "(line 1400,col 9)-(line 1400,col 44)",
        "(line 1401,col 9)-(line 1403,col 9)",
        "(line 1405,col 9)-(line 1405,col 52)",
        "(line 1406,col 9)-(line 1406,col 49)",
        "(line 1407,col 9)-(line 1407,col 55)",
        "(line 1409,col 9)-(line 1409,col 49)",
        "(line 1410,col 9)-(line 1410,col 52)",
        "(line 1412,col 9)-(line 1412,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double)",
      "begin_line": 1431,
      "end_line": 1433,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003e\n     * logarithm\u003c/a\u003e in a given base.\n     *\n     * Returns {@code NaN} if either argument is negative.\n     * If {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.\n     * If both arguments are 0, the result is {@code NaN}.\n     *\n     * @param base Base of the logarithm, must be greater than 0.\n     * @param x Argument, must be greater than 0.\n     * @return the value of the logarithm, i.e. the number {@code y} such that\n     * \u003ccode\u003ebase\u003csup\u003ey\u003c/sup\u003e \u003d x\u003c/code\u003e.\n     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, double)",
      "begin_line": 1442,
      "end_line": 1600,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1443,col 9)-(line 1443,col 43)",
        "(line 1445,col 9)-(line 1447,col 9)",
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1454,col 9)-(line 1477,col 9)",
        "(line 1479,col 9)-(line 1488,col 9)",
        "(line 1490,col 9)-(line 1500,col 9)",
        "(line 1502,col 9)-(line 1524,col 9)",
        "(line 1526,col 9)-(line 1537,col 9)",
        "(line 1540,col 9)-(line 1552,col 9)",
        "(line 1555,col 9)-(line 1555,col 18)",
        "(line 1556,col 9)-(line 1556,col 18)",
        "(line 1557,col 9)-(line 1566,col 9)",
        "(line 1569,col 9)-(line 1569,col 41)",
        "(line 1570,col 9)-(line 1572,col 9)",
        "(line 1574,col 9)-(line 1574,col 28)",
        "(line 1575,col 9)-(line 1575,col 28)",
        "(line 1578,col 9)-(line 1578,col 41)",
        "(line 1579,col 9)-(line 1579,col 40)",
        "(line 1580,col 9)-(line 1580,col 26)",
        "(line 1581,col 9)-(line 1581,col 19)",
        "(line 1584,col 9)-(line 1584,col 35)",
        "(line 1585,col 9)-(line 1585,col 57)",
        "(line 1587,col 9)-(line 1587,col 20)",
        "(line 1588,col 9)-(line 1588,col 31)",
        "(line 1590,col 9)-(line 1590,col 31)",
        "(line 1591,col 9)-(line 1591,col 35)",
        "(line 1592,col 9)-(line 1592,col 34)",
        "(line 1593,col 9)-(line 1593,col 26)",
        "(line 1594,col 9)-(line 1594,col 26)",
        "(line 1595,col 9)-(line 1595,col 20)",
        "(line 1597,col 9)-(line 1597,col 48)",
        "(line 1599,col 9)-(line 1599,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, int)",
      "begin_line": 1611,
      "end_line": 1668,
      "comment": "\n     * Raise a double to an int power.\n     *\n     * @param d Number to raise.\n     * @param e Exponent.\n     * @return d\u003csup\u003ee\u003c/sup\u003e\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1613,col 9)-(line 1618,col 9)",
        "(line 1622,col 9)-(line 1622,col 42)",
        "(line 1623,col 9)-(line 1623,col 48)",
        "(line 1624,col 9)-(line 1624,col 46)",
        "(line 1625,col 9)-(line 1625,col 43)",
        "(line 1628,col 9)-(line 1628,col 30)",
        "(line 1629,col 9)-(line 1629,col 30)",
        "(line 1632,col 9)-(line 1632,col 27)",
        "(line 1633,col 9)-(line 1633,col 32)",
        "(line 1634,col 9)-(line 1634,col 31)",
        "(line 1636,col 9)-(line 1664,col 9)",
        "(line 1666,col 9)-(line 1666,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polySine(double)",
      "begin_line": 1676,
      "end_line": 1689,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1678,col 9)-(line 1678,col 24)",
        "(line 1680,col 9)-(line 1680,col 41)",
        "(line 1681,col 9)-(line 1681,col 44)",
        "(line 1682,col 9)-(line 1682,col 42)",
        "(line 1683,col 9)-(line 1683,col 42)",
        "(line 1686,col 9)-(line 1686,col 23)",
        "(line 1688,col 9)-(line 1688,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polyCosine(double)",
      "begin_line": 1697,
      "end_line": 1707,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1698,col 9)-(line 1698,col 24)",
        "(line 1700,col 9)-(line 1700,col 40)",
        "(line 1701,col 9)-(line 1701,col 44)",
        "(line 1702,col 9)-(line 1702,col 42)",
        "(line 1703,col 9)-(line 1703,col 42)",
        "(line 1704,col 9)-(line 1704,col 16)",
        "(line 1706,col 9)-(line 1706,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinQ(double, double)",
      "begin_line": 1716,
      "end_line": 1831,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 43)",
        "(line 1718,col 9)-(line 1718,col 49)",
        "(line 1721,col 9)-(line 1721,col 47)",
        "(line 1722,col 9)-(line 1722,col 47)",
        "(line 1723,col 9)-(line 1723,col 49)",
        "(line 1724,col 9)-(line 1724,col 49)",
        "(line 1727,col 9)-(line 1727,col 33)",
        "(line 1728,col 9)-(line 1728,col 43)",
        "(line 1729,col 9)-(line 1729,col 35)",
        "(line 1730,col 9)-(line 1730,col 51)",
        "(line 1733,col 9)-(line 1733,col 51)",
        "(line 1734,col 9)-(line 1734,col 47)",
        "(line 1735,col 9)-(line 1735,col 36)",
        "(line 1736,col 9)-(line 1736,col 24)",
        "(line 1739,col 9)-(line 1739,col 22)",
        "(line 1762,col 9)-(line 1762,col 21)",
        "(line 1763,col 9)-(line 1763,col 21)",
        "(line 1765,col 9)-(line 1765,col 25)",
        "(line 1766,col 9)-(line 1766,col 25)",
        "(line 1767,col 9)-(line 1767,col 32)",
        "(line 1768,col 9)-(line 1768,col 14)",
        "(line 1769,col 9)-(line 1769,col 18)",
        "(line 1771,col 9)-(line 1771,col 28)",
        "(line 1772,col 9)-(line 1772,col 18)",
        "(line 1773,col 9)-(line 1773,col 25)",
        "(line 1774,col 9)-(line 1774,col 14)",
        "(line 1775,col 9)-(line 1775,col 18)",
        "(line 1777,col 9)-(line 1777,col 50)",
        "(line 1792,col 9)-(line 1792,col 76)",
        "(line 1819,col 9)-(line 1826,col 9)",
        "(line 1828,col 9)-(line 1828,col 23)",
        "(line 1830,col 9)-(line 1830,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosQ(double, double)",
      "begin_line": 1840,
      "end_line": 1849,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1841,col 9)-(line 1841,col 47)",
        "(line 1842,col 9)-(line 1842,col 50)",
        "(line 1844,col 9)-(line 1844,col 35)",
        "(line 1845,col 9)-(line 1845,col 36)",
        "(line 1846,col 9)-(line 1846,col 23)",
        "(line 1848,col 9)-(line 1848,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1859,
      "end_line": 1994,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1861,col 9)-(line 1861,col 43)",
        "(line 1862,col 9)-(line 1862,col 49)",
        "(line 1865,col 9)-(line 1865,col 47)",
        "(line 1866,col 9)-(line 1866,col 47)",
        "(line 1867,col 9)-(line 1867,col 49)",
        "(line 1868,col 9)-(line 1868,col 49)",
        "(line 1871,col 9)-(line 1871,col 33)",
        "(line 1872,col 9)-(line 1872,col 43)",
        "(line 1873,col 9)-(line 1873,col 35)",
        "(line 1874,col 9)-(line 1874,col 51)",
        "(line 1877,col 9)-(line 1877,col 45)",
        "(line 1878,col 9)-(line 1878,col 47)",
        "(line 1879,col 9)-(line 1879,col 36)",
        "(line 1880,col 9)-(line 1880,col 24)",
        "(line 1905,col 9)-(line 1905,col 21)",
        "(line 1906,col 9)-(line 1906,col 21)",
        "(line 1909,col 9)-(line 1909,col 25)",
        "(line 1910,col 9)-(line 1910,col 25)",
        "(line 1911,col 9)-(line 1911,col 32)",
        "(line 1912,col 9)-(line 1912,col 14)",
        "(line 1913,col 9)-(line 1913,col 18)",
        "(line 1915,col 9)-(line 1915,col 26)",
        "(line 1916,col 9)-(line 1916,col 18)",
        "(line 1917,col 9)-(line 1917,col 25)",
        "(line 1918,col 9)-(line 1918,col 14)",
        "(line 1919,col 9)-(line 1919,col 18)",
        "(line 1921,col 9)-(line 1921,col 46)",
        "(line 1922,col 9)-(line 1922,col 70)",
        "(line 1924,col 9)-(line 1924,col 28)",
        "(line 1925,col 9)-(line 1925,col 38)",
        "(line 1929,col 9)-(line 1929,col 28)",
        "(line 1931,col 9)-(line 1931,col 26)",
        "(line 1932,col 9)-(line 1932,col 18)",
        "(line 1933,col 9)-(line 1933,col 25)",
        "(line 1934,col 9)-(line 1934,col 14)",
        "(line 1935,col 9)-(line 1935,col 18)",
        "(line 1937,col 9)-(line 1937,col 27)",
        "(line 1938,col 9)-(line 1938,col 18)",
        "(line 1939,col 9)-(line 1939,col 25)",
        "(line 1940,col 9)-(line 1940,col 14)",
        "(line 1941,col 9)-(line 1941,col 18)",
        "(line 1943,col 9)-(line 1943,col 62)",
        "(line 1944,col 9)-(line 1944,col 64)",
        "(line 1946,col 9)-(line 1946,col 28)",
        "(line 1947,col 9)-(line 1947,col 38)",
        "(line 1949,col 9)-(line 1953,col 9)",
        "(line 1966,col 9)-(line 1966,col 31)",
        "(line 1969,col 9)-(line 1969,col 34)",
        "(line 1970,col 9)-(line 1970,col 42)",
        "(line 1971,col 9)-(line 1971,col 34)",
        "(line 1973,col 9)-(line 1973,col 35)",
        "(line 1974,col 9)-(line 1974,col 44)",
        "(line 1975,col 9)-(line 1975,col 37)",
        "(line 1978,col 9)-(line 1978,col 85)",
        "(line 1979,col 9)-(line 1979,col 25)",
        "(line 1980,col 9)-(line 1980,col 42)",
        "(line 1982,col 9)-(line 1991,col 9)",
        "(line 1993,col 9)-(line 1993,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 2007,
      "end_line": 2217,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 2010,col 9)-(line 2010,col 49)",
        "(line 2011,col 9)-(line 2011,col 61)",
        "(line 2014,col 9)-(line 2014,col 38)",
        "(line 2015,col 9)-(line 2015,col 38)",
        "(line 2018,col 9)-(line 2018,col 19)",
        "(line 2019,col 9)-(line 2019,col 22)",
        "(line 2022,col 9)-(line 2022,col 19)",
        "(line 2023,col 9)-(line 2023,col 19)",
        "(line 2024,col 9)-(line 2024,col 19)",
        "(line 2025,col 9)-(line 2025,col 32)",
        "(line 2026,col 9)-(line 2026,col 42)",
        "(line 2028,col 9)-(line 2037,col 9)",
        "(line 2040,col 9)-(line 2040,col 31)",
        "(line 2041,col 9)-(line 2041,col 38)",
        "(line 2043,col 9)-(line 2043,col 30)",
        "(line 2044,col 9)-(line 2044,col 37)",
        "(line 2046,col 9)-(line 2046,col 24)",
        "(line 2047,col 9)-(line 2047,col 24)",
        "(line 2048,col 9)-(line 2048,col 24)",
        "(line 2049,col 9)-(line 2049,col 24)",
        "(line 2051,col 9)-(line 2051,col 37)",
        "(line 2052,col 9)-(line 2052,col 38)",
        "(line 2054,col 9)-(line 2054,col 55)",
        "(line 2055,col 9)-(line 2055,col 48)",
        "(line 2056,col 9)-(line 2056,col 60)",
        "(line 2059,col 9)-(line 2062,col 9)",
        "(line 2064,col 9)-(line 2064,col 50)",
        "(line 2065,col 9)-(line 2065,col 40)",
        "(line 2067,col 9)-(line 2067,col 35)",
        "(line 2068,col 9)-(line 2068,col 36)",
        "(line 2070,col 9)-(line 2070,col 52)",
        "(line 2073,col 9)-(line 2076,col 9)",
        "(line 2079,col 9)-(line 2079,col 25)",
        "(line 2080,col 9)-(line 2080,col 32)",
        "(line 2081,col 9)-(line 2081,col 19)",
        "(line 2082,col 9)-(line 2082,col 19)",
        "(line 2083,col 9)-(line 2083,col 19)",
        "(line 2086,col 9)-(line 2086,col 37)",
        "(line 2088,col 9)-(line 2088,col 50)",
        "(line 2089,col 9)-(line 2089,col 48)",
        "(line 2090,col 9)-(line 2090,col 20)",
        "(line 2091,col 9)-(line 2091,col 52)",
        "(line 2093,col 9)-(line 2096,col 9)",
        "(line 2099,col 9)-(line 2099,col 25)",
        "(line 2100,col 9)-(line 2100,col 32)",
        "(line 2102,col 9)-(line 2102,col 19)",
        "(line 2103,col 9)-(line 2103,col 19)",
        "(line 2104,col 9)-(line 2104,col 19)",
        "(line 2106,col 9)-(line 2106,col 40)",
        "(line 2118,col 9)-(line 2118,col 42)",
        "(line 2121,col 9)-(line 2121,col 20)",
        "(line 2122,col 9)-(line 2122,col 30)",
        "(line 2123,col 9)-(line 2123,col 20)",
        "(line 2126,col 9)-(line 2126,col 25)",
        "(line 2127,col 9)-(line 2127,col 32)",
        "(line 2129,col 9)-(line 2129,col 34)",
        "(line 2130,col 9)-(line 2130,col 41)",
        "(line 2132,col 9)-(line 2132,col 19)",
        "(line 2133,col 9)-(line 2133,col 19)",
        "(line 2134,col 9)-(line 2134,col 19)",
        "(line 2135,col 9)-(line 2135,col 19)",
        "(line 2137,col 9)-(line 2137,col 38)",
        "(line 2138,col 9)-(line 2138,col 39)",
        "(line 2140,col 9)-(line 2140,col 47)",
        "(line 2141,col 9)-(line 2141,col 40)",
        "(line 2142,col 9)-(line 2142,col 53)",
        "(line 2145,col 9)-(line 2148,col 9)",
        "(line 2150,col 9)-(line 2150,col 51)",
        "(line 2151,col 9)-(line 2151,col 40)",
        "(line 2153,col 9)-(line 2153,col 37)",
        "(line 2154,col 9)-(line 2154,col 38)",
        "(line 2156,col 9)-(line 2156,col 53)",
        "(line 2159,col 9)-(line 2162,col 9)",
        "(line 2165,col 9)-(line 2165,col 34)",
        "(line 2166,col 9)-(line 2166,col 41)",
        "(line 2167,col 9)-(line 2167,col 19)",
        "(line 2168,col 9)-(line 2168,col 19)",
        "(line 2169,col 9)-(line 2169,col 19)",
        "(line 2172,col 9)-(line 2172,col 37)",
        "(line 2174,col 9)-(line 2174,col 51)",
        "(line 2175,col 9)-(line 2175,col 48)",
        "(line 2176,col 9)-(line 2176,col 21)",
        "(line 2177,col 9)-(line 2177,col 53)",
        "(line 2179,col 9)-(line 2182,col 9)",
        "(line 2185,col 9)-(line 2185,col 25)",
        "(line 2186,col 9)-(line 2186,col 32)",
        "(line 2187,col 9)-(line 2187,col 34)",
        "(line 2188,col 9)-(line 2188,col 41)",
        "(line 2189,col 9)-(line 2189,col 19)",
        "(line 2190,col 9)-(line 2190,col 19)",
        "(line 2191,col 9)-(line 2191,col 19)",
        "(line 2194,col 9)-(line 2194,col 37)",
        "(line 2196,col 9)-(line 2196,col 51)",
        "(line 2197,col 9)-(line 2197,col 48)",
        "(line 2198,col 9)-(line 2198,col 21)",
        "(line 2199,col 9)-(line 2199,col 53)",
        "(line 2201,col 9)-(line 2204,col 9)",
        "(line 2207,col 9)-(line 2207,col 53)",
        "(line 2208,col 9)-(line 2208,col 98)",
        "(line 2210,col 9)-(line 2210,col 34)",
        "(line 2211,col 9)-(line 2211,col 44)",
        "(line 2214,col 9)-(line 2214,col 28)",
        "(line 2215,col 9)-(line 2215,col 31)",
        "(line 2216,col 9)-(line 2216,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sin(double)",
      "begin_line": 2225,
      "end_line": 2284,
      "comment": "\n     * Sine function.\n     *\n     * @param x Argument.\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 2226,col 9)-(line 2226,col 33)",
        "(line 2227,col 9)-(line 2227,col 25)",
        "(line 2228,col 9)-(line 2228,col 18)",
        "(line 2229,col 9)-(line 2229,col 24)",
        "(line 2232,col 9)-(line 2232,col 15)",
        "(line 2233,col 9)-(line 2236,col 9)",
        "(line 2239,col 9)-(line 2245,col 9)",
        "(line 2247,col 9)-(line 2249,col 9)",
        "(line 2252,col 9)-(line 2266,col 9)",
        "(line 2268,col 9)-(line 2270,col 9)",
        "(line 2272,col 9)-(line 2283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cos(double)",
      "begin_line": 2292,
      "end_line": 2338,
      "comment": "\n     * Cosine function.\n     *\n     * @param x Argument.\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 2293,col 9)-(line 2293,col 25)",
        "(line 2296,col 9)-(line 2296,col 22)",
        "(line 2297,col 9)-(line 2299,col 9)",
        "(line 2301,col 9)-(line 2303,col 9)",
        "(line 2306,col 9)-(line 2306,col 22)",
        "(line 2307,col 9)-(line 2321,col 9)",
        "(line 2326,col 9)-(line 2337,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tan(double)",
      "begin_line": 2346,
      "end_line": 2415,
      "comment": "\n     * Tangent function.\n     *\n     * @param x Argument.\n     * @return tan(x)\n     ",
      "child_ranges": [
        "(line 2347,col 9)-(line 2347,col 33)",
        "(line 2348,col 9)-(line 2348,col 25)",
        "(line 2351,col 9)-(line 2351,col 22)",
        "(line 2352,col 9)-(line 2355,col 9)",
        "(line 2358,col 9)-(line 2364,col 9)",
        "(line 2366,col 9)-(line 2368,col 9)",
        "(line 2371,col 9)-(line 2371,col 22)",
        "(line 2372,col 9)-(line 2386,col 9)",
        "(line 2388,col 9)-(line 2401,col 9)",
        "(line 2403,col 9)-(line 2403,col 22)",
        "(line 2404,col 9)-(line 2408,col 9)",
        "(line 2410,col 9)-(line 2412,col 9)",
        "(line 2414,col 9)-(line 2414,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double)",
      "begin_line": 2422,
      "end_line": 2424,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2423,col 9)-(line 2423,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2432,
      "end_line": 2571,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2433,col 9)-(line 2433,col 31)",
        "(line 2434,col 9)-(line 2434,col 16)",
        "(line 2436,col 9)-(line 2438,col 9)",
        "(line 2440,col 9)-(line 2445,col 9)",
        "(line 2447,col 9)-(line 2449,col 9)",
        "(line 2452,col 9)-(line 2457,col 9)",
        "(line 2458,col 9)-(line 2458,col 48)",
        "(line 2459,col 9)-(line 2459,col 58)",
        "(line 2460,col 9)-(line 2460,col 42)",
        "(line 2462,col 9)-(line 2462,col 34)",
        "(line 2463,col 9)-(line 2463,col 37)",
        "(line 2464,col 9)-(line 2464,col 20)",
        "(line 2467,col 9)-(line 2467,col 33)",
        "(line 2468,col 9)-(line 2468,col 37)",
        "(line 2469,col 9)-(line 2469,col 33)",
        "(line 2470,col 9)-(line 2470,col 16)",
        "(line 2471,col 9)-(line 2471,col 17)",
        "(line 2474,col 9)-(line 2506,col 9)",
        "(line 2509,col 9)-(line 2509,col 18)",
        "(line 2510,col 9)-(line 2510,col 18)",
        "(line 2513,col 9)-(line 2513,col 41)",
        "(line 2524,col 9)-(line 2524,col 33)",
        "(line 2525,col 9)-(line 2525,col 47)",
        "(line 2526,col 9)-(line 2526,col 46)",
        "(line 2527,col 9)-(line 2527,col 46)",
        "(line 2528,col 9)-(line 2528,col 46)",
        "(line 2529,col 9)-(line 2529,col 47)",
        "(line 2530,col 9)-(line 2530,col 31)",
        "(line 2533,col 9)-(line 2533,col 18)",
        "(line 2535,col 9)-(line 2535,col 23)",
        "(line 2536,col 9)-(line 2536,col 31)",
        "(line 2537,col 9)-(line 2537,col 18)",
        "(line 2540,col 9)-(line 2540,col 40)",
        "(line 2543,col 9)-(line 2543,col 38)",
        "(line 2544,col 9)-(line 2544,col 46)",
        "(line 2545,col 9)-(line 2545,col 23)",
        "(line 2546,col 9)-(line 2546,col 32)",
        "(line 2547,col 9)-(line 2547,col 18)",
        "(line 2549,col 9)-(line 2549,col 32)",
        "(line 2550,col 9)-(line 2550,col 45)",
        "(line 2552,col 9)-(line 2563,col 9)",
        "(line 2566,col 9)-(line 2568,col 9)",
        "(line 2570,col 9)-(line 2570,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan2(double, double)",
      "begin_line": 2579,
      "end_line": 2694,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2580,col 9)-(line 2582,col 9)",
        "(line 2584,col 9)-(line 2606,col 9)",
        "(line 2610,col 9)-(line 2620,col 9)",
        "(line 2622,col 9)-(line 2632,col 9)",
        "(line 2634,col 9)-(line 2642,col 9)",
        "(line 2644,col 9)-(line 2653,col 9)",
        "(line 2657,col 9)-(line 2665,col 9)",
        "(line 2668,col 9)-(line 2668,col 31)",
        "(line 2669,col 9)-(line 2671,col 9)",
        "(line 2673,col 9)-(line 2673,col 38)",
        "(line 2674,col 9)-(line 2674,col 27)",
        "(line 2677,col 9)-(line 2677,col 44)",
        "(line 2678,col 9)-(line 2678,col 33)",
        "(line 2680,col 9)-(line 2680,col 62)",
        "(line 2682,col 9)-(line 2682,col 36)",
        "(line 2683,col 9)-(line 2683,col 31)",
        "(line 2684,col 9)-(line 2684,col 18)",
        "(line 2686,col 9)-(line 2688,col 9)",
        "(line 2691,col 9)-(line 2691,col 50)",
        "(line 2693,col 9)-(line 2693,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asin(double)",
      "begin_line": 2700,
      "end_line": 2770,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2701,col 7)-(line 2703,col 7)",
        "(line 2705,col 7)-(line 2707,col 7)",
        "(line 2709,col 7)-(line 2711,col 7)",
        "(line 2713,col 7)-(line 2715,col 7)",
        "(line 2717,col 7)-(line 2719,col 7)",
        "(line 2724,col 7)-(line 2724,col 37)",
        "(line 2725,col 7)-(line 2725,col 40)",
        "(line 2726,col 7)-(line 2726,col 31)",
        "(line 2729,col 7)-(line 2729,col 24)",
        "(line 2730,col 7)-(line 2730,col 36)",
        "(line 2733,col 7)-(line 2733,col 15)",
        "(line 2734,col 7)-(line 2734,col 15)",
        "(line 2736,col 7)-(line 2736,col 27)",
        "(line 2737,col 7)-(line 2737,col 35)",
        "(line 2739,col 7)-(line 2739,col 21)",
        "(line 2740,col 7)-(line 2740,col 30)",
        "(line 2741,col 7)-(line 2741,col 16)",
        "(line 2744,col 7)-(line 2744,col 15)",
        "(line 2745,col 7)-(line 2745,col 19)",
        "(line 2746,col 7)-(line 2746,col 30)",
        "(line 2747,col 7)-(line 2747,col 27)",
        "(line 2748,col 7)-(line 2748,col 18)",
        "(line 2751,col 7)-(line 2751,col 53)",
        "(line 2754,col 7)-(line 2754,col 31)",
        "(line 2757,col 7)-(line 2757,col 21)",
        "(line 2758,col 7)-(line 2758,col 30)",
        "(line 2759,col 7)-(line 2759,col 34)",
        "(line 2760,col 7)-(line 2760,col 25)",
        "(line 2762,col 7)-(line 2762,col 52)",
        "(line 2763,col 7)-(line 2763,col 28)",
        "(line 2765,col 7)-(line 2765,col 21)",
        "(line 2766,col 7)-(line 2766,col 29)",
        "(line 2767,col 7)-(line 2767,col 16)",
        "(line 2769,col 7)-(line 2769,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acos(double)",
      "begin_line": 2776,
      "end_line": 2852,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2777,col 7)-(line 2779,col 7)",
        "(line 2781,col 7)-(line 2783,col 7)",
        "(line 2785,col 7)-(line 2787,col 7)",
        "(line 2789,col 7)-(line 2791,col 7)",
        "(line 2793,col 7)-(line 2795,col 7)",
        "(line 2800,col 7)-(line 2800,col 37)",
        "(line 2801,col 7)-(line 2801,col 40)",
        "(line 2802,col 7)-(line 2802,col 31)",
        "(line 2805,col 7)-(line 2805,col 24)",
        "(line 2806,col 7)-(line 2806,col 36)",
        "(line 2809,col 7)-(line 2809,col 15)",
        "(line 2810,col 7)-(line 2810,col 15)",
        "(line 2812,col 7)-(line 2812,col 27)",
        "(line 2813,col 7)-(line 2813,col 35)",
        "(line 2815,col 7)-(line 2815,col 21)",
        "(line 2816,col 7)-(line 2816,col 30)",
        "(line 2817,col 7)-(line 2817,col 16)",
        "(line 2820,col 7)-(line 2820,col 26)",
        "(line 2821,col 7)-(line 2821,col 30)",
        "(line 2822,col 7)-(line 2822,col 27)",
        "(line 2823,col 7)-(line 2823,col 18)",
        "(line 2826,col 7)-(line 2826,col 53)",
        "(line 2829,col 7)-(line 2829,col 25)",
        "(line 2830,col 7)-(line 2830,col 16)",
        "(line 2831,col 7)-(line 2831,col 26)",
        "(line 2834,col 7)-(line 2834,col 21)",
        "(line 2837,col 7)-(line 2839,col 7)",
        "(line 2841,col 7)-(line 2841,col 36)",
        "(line 2842,col 7)-(line 2842,col 25)",
        "(line 2844,col 7)-(line 2844,col 52)",
        "(line 2845,col 7)-(line 2845,col 19)",
        "(line 2847,col 7)-(line 2847,col 21)",
        "(line 2848,col 7)-(line 2848,col 29)",
        "(line 2849,col 7)-(line 2849,col 16)",
        "(line 2851,col 7)-(line 2851,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cbrt(double)",
      "begin_line": 2858,
      "end_line": 2936,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2860,col 7)-(line 2860,col 47)",
        "(line 2861,col 7)-(line 2861,col 59)",
        "(line 2862,col 7)-(line 2862,col 32)",
        "(line 2864,col 7)-(line 2874,col 7)",
        "(line 2876,col 7)-(line 2879,col 7)",
        "(line 2882,col 7)-(line 2882,col 30)",
        "(line 2885,col 7)-(line 2886,col 81)",
        "(line 2889,col 7)-(line 2889,col 104)",
        "(line 2892,col 7)-(line 2892,col 41)",
        "(line 2893,col 7)-(line 2893,col 44)",
        "(line 2894,col 7)-(line 2894,col 45)",
        "(line 2895,col 7)-(line 2895,col 44)",
        "(line 2896,col 7)-(line 2896,col 44)",
        "(line 2898,col 7)-(line 2898,col 39)",
        "(line 2903,col 7)-(line 2903,col 39)",
        "(line 2904,col 7)-(line 2904,col 46)",
        "(line 2905,col 7)-(line 2905,col 46)",
        "(line 2908,col 7)-(line 2908,col 39)",
        "(line 2909,col 7)-(line 2909,col 36)",
        "(line 2910,col 7)-(line 2910,col 27)",
        "(line 2912,col 7)-(line 2912,col 26)",
        "(line 2913,col 7)-(line 2913,col 42)",
        "(line 2914,col 7)-(line 2914,col 31)",
        "(line 2915,col 7)-(line 2915,col 38)",
        "(line 2916,col 7)-(line 2916,col 23)",
        "(line 2917,col 7)-(line 2917,col 17)",
        "(line 2919,col 7)-(line 2919,col 39)",
        "(line 2920,col 7)-(line 2920,col 19)",
        "(line 2922,col 7)-(line 2922,col 26)",
        "(line 2923,col 7)-(line 2923,col 34)",
        "(line 2924,col 7)-(line 2924,col 15)",
        "(line 2926,col 7)-(line 2926,col 33)",
        "(line 2929,col 7)-(line 2929,col 16)",
        "(line 2931,col 7)-(line 2933,col 7)",
        "(line 2935,col 7)-(line 2935,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toRadians(double)",
      "begin_line": 2943,
      "end_line": 2961,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2945,col 9)-(line 2947,col 9)",
        "(line 2950,col 9)-(line 2950,col 49)",
        "(line 2951,col 9)-(line 2951,col 50)",
        "(line 2953,col 9)-(line 2953,col 38)",
        "(line 2954,col 9)-(line 2954,col 27)",
        "(line 2956,col 9)-(line 2956,col 74)",
        "(line 2957,col 9)-(line 2959,col 9)",
        "(line 2960,col 9)-(line 2960,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toDegrees(double)",
      "begin_line": 2968,
      "end_line": 2982,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2970,col 9)-(line 2972,col 9)",
        "(line 2975,col 9)-(line 2975,col 46)",
        "(line 2976,col 9)-(line 2976,col 50)",
        "(line 2978,col 9)-(line 2978,col 38)",
        "(line 2979,col 9)-(line 2979,col 27)",
        "(line 2981,col 9)-(line 2981,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(int)",
      "begin_line": 2989,
      "end_line": 2991,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2990,col 9)-(line 2990,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(long)",
      "begin_line": 2998,
      "end_line": 3000,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2999,col 9)-(line 2999,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(float)",
      "begin_line": 3007,
      "end_line": 3009,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3008,col 9)-(line 3008,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(double)",
      "begin_line": 3016,
      "end_line": 3018,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3017,col 9)-(line 3017,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(double)",
      "begin_line": 3025,
      "end_line": 3030,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3026,col 9)-(line 3028,col 9)",
        "(line 3029,col 9)-(line 3029,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(float)",
      "begin_line": 3037,
      "end_line": 3042,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3038,col 9)-(line 3040,col 9)",
        "(line 3041,col 9)-(line 3041,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(double, int)",
      "begin_line": 3050,
      "end_line": 3126,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3053,col 9)-(line 3055,col 9)",
        "(line 3058,col 9)-(line 3060,col 9)",
        "(line 3061,col 9)-(line 3063,col 9)",
        "(line 3064,col 9)-(line 3066,col 9)",
        "(line 3069,col 9)-(line 3069,col 53)",
        "(line 3070,col 9)-(line 3070,col 53)",
        "(line 3071,col 9)-(line 3071,col 56)",
        "(line 3072,col 9)-(line 3072,col 53)",
        "(line 3075,col 9)-(line 3075,col 42)",
        "(line 3077,col 9)-(line 3124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(float, int)",
      "begin_line": 3134,
      "end_line": 3210,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3137,col 9)-(line 3139,col 9)",
        "(line 3142,col 9)-(line 3144,col 9)",
        "(line 3145,col 9)-(line 3147,col 9)",
        "(line 3148,col 9)-(line 3150,col 9)",
        "(line 3153,col 9)-(line 3153,col 49)",
        "(line 3154,col 9)-(line 3154,col 43)",
        "(line 3155,col 9)-(line 3155,col 46)",
        "(line 3156,col 9)-(line 3156,col 43)",
        "(line 3159,col 9)-(line 3159,col 42)",
        "(line 3161,col 9)-(line 3208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(double, double)",
      "begin_line": 3243,
      "end_line": 3266,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3246,col 9)-(line 3254,col 9)",
        "(line 3258,col 9)-(line 3258,col 53)",
        "(line 3259,col 9)-(line 3259,col 53)",
        "(line 3260,col 9)-(line 3264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(float, double)",
      "begin_line": 3299,
      "end_line": 3322,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3302,col 9)-(line 3310,col 9)",
        "(line 3314,col 9)-(line 3314,col 49)",
        "(line 3315,col 9)-(line 3315,col 43)",
        "(line 3316,col 9)-(line 3320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.floor(double)",
      "begin_line": 3328,
      "end_line": 3349,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3329,col 9)-(line 3329,col 15)",
        "(line 3331,col 9)-(line 3333,col 9)",
        "(line 3335,col 9)-(line 3337,col 9)",
        "(line 3339,col 9)-(line 3339,col 21)",
        "(line 3340,col 9)-(line 3342,col 9)",
        "(line 3344,col 9)-(line 3346,col 9)",
        "(line 3348,col 9)-(line 3348,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ceil(double)",
      "begin_line": 3355,
      "end_line": 3374,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3356,col 9)-(line 3356,col 17)",
        "(line 3358,col 9)-(line 3360,col 9)",
        "(line 3362,col 9)-(line 3362,col 21)",
        "(line 3363,col 9)-(line 3365,col 9)",
        "(line 3367,col 9)-(line 3367,col 17)",
        "(line 3369,col 9)-(line 3371,col 9)",
        "(line 3373,col 9)-(line 3373,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.rint(double)",
      "begin_line": 3380,
      "end_line": 3397,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3381,col 9)-(line 3381,col 28)",
        "(line 3382,col 9)-(line 3382,col 25)",
        "(line 3384,col 9)-(line 3389,col 9)",
        "(line 3390,col 9)-(line 3392,col 9)",
        "(line 3395,col 9)-(line 3395,col 26)",
        "(line 3396,col 9)-(line 3396,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(double)",
      "begin_line": 3403,
      "end_line": 3405,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3404,col 9)-(line 3404,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(float)",
      "begin_line": 3411,
      "end_line": 3413,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3412,col 9)-(line 3412,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(int, int)",
      "begin_line": 3420,
      "end_line": 3422,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3421,col 9)-(line 3421,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(long, long)",
      "begin_line": 3429,
      "end_line": 3431,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3430,col 9)-(line 3430,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(float, float)",
      "begin_line": 3438,
      "end_line": 3456,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3439,col 9)-(line 3441,col 9)",
        "(line 3442,col 9)-(line 3444,col 9)",
        "(line 3446,col 9)-(line 3448,col 9)",
        "(line 3451,col 9)-(line 3451,col 46)",
        "(line 3452,col 9)-(line 3454,col 9)",
        "(line 3455,col 9)-(line 3455,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(double, double)",
      "begin_line": 3463,
      "end_line": 3481,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3464,col 9)-(line 3466,col 9)",
        "(line 3467,col 9)-(line 3469,col 9)",
        "(line 3471,col 9)-(line 3473,col 9)",
        "(line 3476,col 9)-(line 3476,col 50)",
        "(line 3477,col 9)-(line 3479,col 9)",
        "(line 3480,col 9)-(line 3480,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(int, int)",
      "begin_line": 3488,
      "end_line": 3490,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3489,col 9)-(line 3489,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(long, long)",
      "begin_line": 3497,
      "end_line": 3499,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3498,col 9)-(line 3498,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(float, float)",
      "begin_line": 3506,
      "end_line": 3524,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3507,col 9)-(line 3509,col 9)",
        "(line 3510,col 9)-(line 3512,col 9)",
        "(line 3514,col 9)-(line 3516,col 9)",
        "(line 3519,col 9)-(line 3519,col 46)",
        "(line 3520,col 9)-(line 3522,col 9)",
        "(line 3523,col 9)-(line 3523,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(double, double)",
      "begin_line": 3531,
      "end_line": 3549,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3532,col 9)-(line 3534,col 9)",
        "(line 3535,col 9)-(line 3537,col 9)",
        "(line 3539,col 9)-(line 3541,col 9)",
        "(line 3544,col 9)-(line 3544,col 50)",
        "(line 3545,col 9)-(line 3547,col 9)",
        "(line 3548,col 9)-(line 3548,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.hypot(double, double)",
      "begin_line": 3565,
      "end_line": 3598,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3566,col 9)-(line 3597,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3620,
      "end_line": 3622,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3621,col 9)-(line 3621,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(double, double)",
      "begin_line": 3632,
      "end_line": 3639,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3633,col 9)-(line 3633,col 52)",
        "(line 3634,col 9)-(line 3634,col 47)",
        "(line 3635,col 9)-(line 3637,col 9)",
        "(line 3638,col 9)-(line 3638,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(float, float)",
      "begin_line": 3649,
      "end_line": 3656,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3650,col 9)-(line 3650,col 48)",
        "(line 3651,col 9)-(line 3651,col 43)",
        "(line 3652,col 9)-(line 3654,col 9)",
        "(line 3655,col 9)-(line 3655,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(double)",
      "begin_line": 3667,
      "end_line": 3669,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3668,col 9)-(line 3668,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(float)",
      "begin_line": 3680,
      "end_line": 3682,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3681,col 9)-(line 3681,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.main(java.lang.String[])",
      "begin_line": 3689,
      "end_line": 3702,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3690,col 9)-(line 3690,col 37)",
        "(line 3691,col 9)-(line 3691,col 104)",
        "(line 3692,col 9)-(line 3692,col 104)",
        "(line 3693,col 9)-(line 3693,col 108)",
        "(line 3694,col 9)-(line 3694,col 108)",
        "(line 3695,col 9)-(line 3695,col 76)",
        "(line 3696,col 9)-(line 3696,col 83)",
        "(line 3697,col 9)-(line 3697,col 83)",
        "(line 3698,col 9)-(line 3698,col 87)",
        "(line 3699,col 9)-(line 3699,col 87)",
        "(line 3700,col 9)-(line 3700,col 89)",
        "(line 3701,col 9)-(line 3701,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3705,
      "end_line": 3741,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3709,
      "end_line": 3709,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3713,
      "end_line": 3713,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3744,
      "end_line": 3774,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3749,
      "end_line": 3749,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3753,
      "end_line": 3753,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3777,
      "end_line": 3794,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3779,
      "end_line": 3779,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "class_interface",
      "name": "CodyWaite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3797,
      "end_line": 3864,
      "comment": " Enclose the Cody/Waite reduction (used in \"sin\", \"cos\" and \"tan\"). "
    },
    {
      "type": "field",
      "varNames": [
        "finalK"
      ],
      "begin_line": 3799,
      "end_line": 3799,
      "comment": " k "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemA"
      ],
      "begin_line": 3801,
      "end_line": 3801,
      "comment": " remA "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemB"
      ],
      "begin_line": 3803,
      "end_line": 3803,
      "comment": " remB "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.CodyWaite(double)",
      "begin_line": 3808,
      "end_line": 3844,
      "comment": "\n         * @param xa Argument.\n         ",
      "child_ranges": [
        "(line 3811,col 13)-(line 3811,col 51)",
        "(line 3814,col 13)-(line 3814,col 24)",
        "(line 3815,col 13)-(line 3815,col 24)",
        "(line 3816,col 13)-(line 3839,col 13)",
        "(line 3841,col 13)-(line 3841,col 28)",
        "(line 3842,col 13)-(line 3842,col 34)",
        "(line 3843,col 13)-(line 3843,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getK()",
      "begin_line": 3849,
      "end_line": 3851,
      "comment": "\n         * @return k\n         ",
      "child_ranges": [
        "(line 3850,col 13)-(line 3850,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemA()",
      "begin_line": 3855,
      "end_line": 3857,
      "comment": "\n         * @return remA\n         ",
      "child_ranges": [
        "(line 3856,col 13)-(line 3856,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemB()",
      "begin_line": 3861,
      "end_line": 3863,
      "comment": "\n         * @return remB\n         ",
      "child_ranges": [
        "(line 3862,col 13)-(line 3862,col 29)"
      ]
    }
  ]
}