{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 3883,
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
        "MASK_NON_SIGN_INT"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Mask used to clear the non-sign part of an int. "
    },
    {
      "type": "field",
      "varNames": [
        "MASK_NON_SIGN_LONG"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Mask used to clear the non-sign part of a long. "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_52"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_53"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " 2^53 - double numbers this large must be even. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_3"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_5"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_7"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_9"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_11"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_13"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_15"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_17"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_3_4"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_15_16"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_13_14"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_11_12"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_9_10"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_7_8"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_5_6"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_2"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_4"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.FastMath()",
      "begin_line": 359,
      "end_line": 359,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.doubleHighPart(double)",
      "begin_line": 370,
      "end_line": 377,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 48)",
        "(line 375,col 9)-(line 375,col 30)",
        "(line 376,col 9)-(line 376,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sqrt(double)",
      "begin_line": 384,
      "end_line": 386,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosh(double)",
      "begin_line": 392,
      "end_line": 455,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 393,col 7)-(line 395,col 7)",
        "(line 402,col 7)-(line 418,col 7)",
        "(line 420,col 7)-(line 420,col 44)",
        "(line 421,col 7)-(line 423,col 7)",
        "(line 424,col 7)-(line 424,col 26)",
        "(line 426,col 7)-(line 426,col 40)",
        "(line 427,col 7)-(line 427,col 48)",
        "(line 429,col 7)-(line 429,col 38)",
        "(line 430,col 7)-(line 430,col 36)",
        "(line 431,col 7)-(line 431,col 28)",
        "(line 434,col 7)-(line 434,col 28)",
        "(line 435,col 7)-(line 435,col 34)",
        "(line 436,col 7)-(line 436,col 42)",
        "(line 437,col 7)-(line 437,col 37)",
        "(line 440,col 7)-(line 440,col 82)",
        "(line 442,col 7)-(line 442,col 36)",
        "(line 445,col 7)-(line 445,col 25)",
        "(line 446,col 7)-(line 446,col 34)",
        "(line 447,col 7)-(line 447,col 16)",
        "(line 448,col 7)-(line 448,col 25)",
        "(line 449,col 7)-(line 449,col 34)",
        "(line 450,col 7)-(line 450,col 16)",
        "(line 452,col 7)-(line 452,col 30)",
        "(line 453,col 7)-(line 453,col 20)",
        "(line 454,col 7)-(line 454,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinh(double)",
      "begin_line": 461,
      "end_line": 580,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 462,col 7)-(line 462,col 29)",
        "(line 463,col 7)-(line 465,col 7)",
        "(line 472,col 7)-(line 488,col 7)",
        "(line 490,col 7)-(line 492,col 7)",
        "(line 494,col 7)-(line 497,col 7)",
        "(line 499,col 7)-(line 499,col 20)",
        "(line 501,col 7)-(line 573,col 7)",
        "(line 575,col 7)-(line 577,col 7)",
        "(line 579,col 7)-(line 579,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanh(double)",
      "begin_line": 586,
      "end_line": 704,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 587,col 7)-(line 587,col 29)",
        "(line 589,col 7)-(line 591,col 7)",
        "(line 599,col 7)-(line 601,col 7)",
        "(line 603,col 7)-(line 605,col 7)",
        "(line 607,col 7)-(line 609,col 7)",
        "(line 611,col 7)-(line 614,col 7)",
        "(line 616,col 7)-(line 616,col 20)",
        "(line 617,col 7)-(line 697,col 7)",
        "(line 699,col 7)-(line 701,col 7)",
        "(line 703,col 7)-(line 703,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acosh(double)",
      "begin_line": 710,
      "end_line": 712,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asinh(double)",
      "begin_line": 718,
      "end_line": 742,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 33)",
        "(line 720,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 24)",
        "(line 726,col 9)-(line 739,col 9)",
        "(line 741,col 9)-(line 741,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atanh(double)",
      "begin_line": 748,
      "end_line": 772,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 33)",
        "(line 750,col 9)-(line 753,col 9)",
        "(line 755,col 9)-(line 755,col 24)",
        "(line 756,col 9)-(line 769,col 9)",
        "(line 771,col 9)-(line 771,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(double)",
      "begin_line": 779,
      "end_line": 781,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(float)",
      "begin_line": 788,
      "end_line": 790,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(double)",
      "begin_line": 796,
      "end_line": 798,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(float)",
      "begin_line": 804,
      "end_line": 806,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.random()",
      "begin_line": 812,
      "end_line": 814,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double)",
      "begin_line": 836,
      "end_line": 838,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double, double, double[])",
      "begin_line": 847,
      "end_line": 962,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 24)",
        "(line 849,col 9)-(line 849,col 24)",
        "(line 850,col 9)-(line 850,col 19)",
        "(line 856,col 9)-(line 906,col 9)",
        "(line 912,col 9)-(line 912,col 58)",
        "(line 913,col 9)-(line 913,col 72)",
        "(line 914,col 9)-(line 914,col 72)",
        "(line 920,col 9)-(line 920,col 63)",
        "(line 929,col 9)-(line 929,col 39)",
        "(line 930,col 9)-(line 930,col 45)",
        "(line 931,col 9)-(line 931,col 45)",
        "(line 932,col 9)-(line 932,col 30)",
        "(line 933,col 9)-(line 933,col 49)",
        "(line 940,col 9)-(line 940,col 44)",
        "(line 941,col 9)-(line 941,col 90)",
        "(line 947,col 9)-(line 947,col 43)",
        "(line 948,col 9)-(line 948,col 28)",
        "(line 949,col 9)-(line 953,col 9)",
        "(line 955,col 9)-(line 959,col 9)",
        "(line 961,col 9)-(line 961,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double)",
      "begin_line": 968,
      "end_line": 970,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 969,col 7)-(line 969,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double, double[])",
      "begin_line": 977,
      "end_line": 1117,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 980,col 9)",
        "(line 982,col 9)-(line 995,col 9)",
        "(line 997,col 9)-(line 997,col 21)",
        "(line 998,col 9)-(line 998,col 21)",
        "(line 999,col 9)-(line 999,col 23)",
        "(line 1000,col 9)-(line 1000,col 33)",
        "(line 1002,col 9)-(line 1005,col 9)",
        "(line 1007,col 9)-(line 1021,col 9)",
        "(line 1025,col 9)-(line 1025,col 41)",
        "(line 1026,col 9)-(line 1026,col 49)",
        "(line 1027,col 9)-(line 1027,col 48)",
        "(line 1028,col 9)-(line 1028,col 48)",
        "(line 1029,col 9)-(line 1029,col 26)",
        "(line 1030,col 9)-(line 1030,col 26)",
        "(line 1032,col 9)-(line 1032,col 28)",
        "(line 1033,col 9)-(line 1033,col 30)",
        "(line 1034,col 9)-(line 1034,col 31)",
        "(line 1035,col 9)-(line 1035,col 18)",
        "(line 1037,col 9)-(line 1037,col 33)",
        "(line 1038,col 9)-(line 1038,col 32)",
        "(line 1039,col 9)-(line 1039,col 24)",
        "(line 1040,col 9)-(line 1040,col 18)",
        "(line 1043,col 9)-(line 1043,col 31)",
        "(line 1045,col 9)-(line 1045,col 31)",
        "(line 1046,col 9)-(line 1046,col 46)",
        "(line 1047,col 9)-(line 1047,col 18)",
        "(line 1049,col 9)-(line 1049,col 31)",
        "(line 1050,col 9)-(line 1050,col 40)",
        "(line 1051,col 9)-(line 1051,col 18)",
        "(line 1053,col 9)-(line 1053,col 31)",
        "(line 1054,col 9)-(line 1054,col 38)",
        "(line 1055,col 9)-(line 1055,col 18)",
        "(line 1059,col 9)-(line 1059,col 26)",
        "(line 1060,col 9)-(line 1060,col 35)",
        "(line 1061,col 9)-(line 1061,col 18)",
        "(line 1063,col 9)-(line 1063,col 23)",
        "(line 1065,col 9)-(line 1065,col 32)",
        "(line 1066,col 9)-(line 1066,col 18)",
        "(line 1068,col 9)-(line 1068,col 26)",
        "(line 1070,col 9)-(line 1070,col 35)",
        "(line 1071,col 9)-(line 1071,col 18)",
        "(line 1073,col 9)-(line 1073,col 23)",
        "(line 1075,col 9)-(line 1075,col 32)",
        "(line 1076,col 9)-(line 1076,col 18)",
        "(line 1078,col 9)-(line 1109,col 9)",
        "(line 1111,col 9)-(line 1114,col 9)",
        "(line 1116,col 9)-(line 1116,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double)",
      "begin_line": 1125,
      "end_line": 1127,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double[])",
      "begin_line": 1135,
      "end_line": 1355,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1138,col 9)",
        "(line 1139,col 9)-(line 1139,col 50)",
        "(line 1142,col 9)-(line 1148,col 9)",
        "(line 1151,col 9)-(line 1157,col 9)",
        "(line 1160,col 9)-(line 1160,col 41)",
        "(line 1162,col 9)-(line 1179,col 9)",
        "(line 1182,col 9)-(line 1227,col 9)",
        "(line 1230,col 9)-(line 1230,col 87)",
        "(line 1241,col 9)-(line 1241,col 103)",
        "(line 1243,col 9)-(line 1243,col 26)",
        "(line 1244,col 9)-(line 1244,col 26)",
        "(line 1246,col 9)-(line 1306,col 9)",
        "(line 1322,col 9)-(line 1322,col 30)",
        "(line 1323,col 9)-(line 1323,col 23)",
        "(line 1324,col 9)-(line 1324,col 28)",
        "(line 1325,col 9)-(line 1325,col 33)",
        "(line 1326,col 9)-(line 1326,col 14)",
        "(line 1327,col 9)-(line 1327,col 18)",
        "(line 1329,col 9)-(line 1329,col 21)",
        "(line 1330,col 9)-(line 1330,col 28)",
        "(line 1331,col 9)-(line 1331,col 14)",
        "(line 1332,col 9)-(line 1332,col 18)",
        "(line 1334,col 9)-(line 1334,col 27)",
        "(line 1335,col 9)-(line 1335,col 34)",
        "(line 1336,col 9)-(line 1336,col 14)",
        "(line 1337,col 9)-(line 1337,col 18)",
        "(line 1339,col 9)-(line 1339,col 23)",
        "(line 1340,col 9)-(line 1340,col 30)",
        "(line 1341,col 9)-(line 1341,col 14)",
        "(line 1342,col 9)-(line 1342,col 18)",
        "(line 1344,col 9)-(line 1344,col 21)",
        "(line 1345,col 9)-(line 1345,col 28)",
        "(line 1346,col 9)-(line 1346,col 14)",
        "(line 1347,col 9)-(line 1347,col 18)",
        "(line 1349,col 9)-(line 1352,col 9)",
        "(line 1354,col 9)-(line 1354,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log1p(double)",
      "begin_line": 1363,
      "end_line": 1393,
      "comment": "\n     * Computes log(1 + x).\n     *\n     * @param x Number.\n     * @return {@code log(1 + x)}.\n     ",
      "child_ranges": [
        "(line 1364,col 9)-(line 1366,col 9)",
        "(line 1368,col 9)-(line 1370,col 9)",
        "(line 1372,col 9)-(line 1392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log10(double)",
      "begin_line": 1399,
      "end_line": 1415,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1400,col 46)",
        "(line 1402,col 9)-(line 1402,col 44)",
        "(line 1403,col 9)-(line 1405,col 9)",
        "(line 1407,col 9)-(line 1407,col 52)",
        "(line 1408,col 9)-(line 1408,col 49)",
        "(line 1409,col 9)-(line 1409,col 55)",
        "(line 1411,col 9)-(line 1411,col 49)",
        "(line 1412,col 9)-(line 1412,col 52)",
        "(line 1414,col 9)-(line 1414,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double)",
      "begin_line": 1433,
      "end_line": 1435,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003e\n     * logarithm\u003c/a\u003e in a given base.\n     *\n     * Returns {@code NaN} if either argument is negative.\n     * If {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.\n     * If both arguments are 0, the result is {@code NaN}.\n     *\n     * @param base Base of the logarithm, must be greater than 0.\n     * @param x Argument, must be greater than 0.\n     * @return the value of the logarithm, i.e. the number {@code y} such that\n     * \u003ccode\u003ebase\u003csup\u003ey\u003c/sup\u003e \u003d x\u003c/code\u003e.\n     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 1434,col 9)-(line 1434,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, double)",
      "begin_line": 1444,
      "end_line": 1602,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1445,col 43)",
        "(line 1447,col 9)-(line 1449,col 9)",
        "(line 1451,col 9)-(line 1453,col 9)",
        "(line 1456,col 9)-(line 1479,col 9)",
        "(line 1481,col 9)-(line 1490,col 9)",
        "(line 1492,col 9)-(line 1502,col 9)",
        "(line 1504,col 9)-(line 1526,col 9)",
        "(line 1528,col 9)-(line 1539,col 9)",
        "(line 1542,col 9)-(line 1554,col 9)",
        "(line 1557,col 9)-(line 1557,col 18)",
        "(line 1558,col 9)-(line 1558,col 18)",
        "(line 1559,col 9)-(line 1568,col 9)",
        "(line 1571,col 9)-(line 1571,col 41)",
        "(line 1572,col 9)-(line 1574,col 9)",
        "(line 1576,col 9)-(line 1576,col 28)",
        "(line 1577,col 9)-(line 1577,col 28)",
        "(line 1580,col 9)-(line 1580,col 41)",
        "(line 1581,col 9)-(line 1581,col 40)",
        "(line 1582,col 9)-(line 1582,col 26)",
        "(line 1583,col 9)-(line 1583,col 19)",
        "(line 1586,col 9)-(line 1586,col 35)",
        "(line 1587,col 9)-(line 1587,col 57)",
        "(line 1589,col 9)-(line 1589,col 20)",
        "(line 1590,col 9)-(line 1590,col 31)",
        "(line 1592,col 9)-(line 1592,col 31)",
        "(line 1593,col 9)-(line 1593,col 35)",
        "(line 1594,col 9)-(line 1594,col 34)",
        "(line 1595,col 9)-(line 1595,col 26)",
        "(line 1596,col 9)-(line 1596,col 26)",
        "(line 1597,col 9)-(line 1597,col 20)",
        "(line 1599,col 9)-(line 1599,col 48)",
        "(line 1601,col 9)-(line 1601,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, int)",
      "begin_line": 1613,
      "end_line": 1670,
      "comment": "\n     * Raise a double to an int power.\n     *\n     * @param d Number to raise.\n     * @param e Exponent.\n     * @return d\u003csup\u003ee\u003c/sup\u003e\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1615,col 9)-(line 1620,col 9)",
        "(line 1624,col 9)-(line 1624,col 42)",
        "(line 1625,col 9)-(line 1625,col 48)",
        "(line 1626,col 9)-(line 1626,col 46)",
        "(line 1627,col 9)-(line 1627,col 43)",
        "(line 1630,col 9)-(line 1630,col 30)",
        "(line 1631,col 9)-(line 1631,col 30)",
        "(line 1634,col 9)-(line 1634,col 27)",
        "(line 1635,col 9)-(line 1635,col 32)",
        "(line 1636,col 9)-(line 1636,col 31)",
        "(line 1638,col 9)-(line 1666,col 9)",
        "(line 1668,col 9)-(line 1668,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polySine(double)",
      "begin_line": 1678,
      "end_line": 1691,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1680,col 9)-(line 1680,col 24)",
        "(line 1682,col 9)-(line 1682,col 41)",
        "(line 1683,col 9)-(line 1683,col 44)",
        "(line 1684,col 9)-(line 1684,col 42)",
        "(line 1685,col 9)-(line 1685,col 42)",
        "(line 1688,col 9)-(line 1688,col 23)",
        "(line 1690,col 9)-(line 1690,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polyCosine(double)",
      "begin_line": 1699,
      "end_line": 1709,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1700,col 9)-(line 1700,col 24)",
        "(line 1702,col 9)-(line 1702,col 40)",
        "(line 1703,col 9)-(line 1703,col 44)",
        "(line 1704,col 9)-(line 1704,col 42)",
        "(line 1705,col 9)-(line 1705,col 42)",
        "(line 1706,col 9)-(line 1706,col 16)",
        "(line 1708,col 9)-(line 1708,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinQ(double, double)",
      "begin_line": 1718,
      "end_line": 1833,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1719,col 9)-(line 1719,col 43)",
        "(line 1720,col 9)-(line 1720,col 49)",
        "(line 1723,col 9)-(line 1723,col 47)",
        "(line 1724,col 9)-(line 1724,col 47)",
        "(line 1725,col 9)-(line 1725,col 49)",
        "(line 1726,col 9)-(line 1726,col 49)",
        "(line 1729,col 9)-(line 1729,col 33)",
        "(line 1730,col 9)-(line 1730,col 43)",
        "(line 1731,col 9)-(line 1731,col 35)",
        "(line 1732,col 9)-(line 1732,col 51)",
        "(line 1735,col 9)-(line 1735,col 51)",
        "(line 1736,col 9)-(line 1736,col 47)",
        "(line 1737,col 9)-(line 1737,col 36)",
        "(line 1738,col 9)-(line 1738,col 24)",
        "(line 1741,col 9)-(line 1741,col 22)",
        "(line 1764,col 9)-(line 1764,col 21)",
        "(line 1765,col 9)-(line 1765,col 21)",
        "(line 1767,col 9)-(line 1767,col 25)",
        "(line 1768,col 9)-(line 1768,col 25)",
        "(line 1769,col 9)-(line 1769,col 32)",
        "(line 1770,col 9)-(line 1770,col 14)",
        "(line 1771,col 9)-(line 1771,col 18)",
        "(line 1773,col 9)-(line 1773,col 28)",
        "(line 1774,col 9)-(line 1774,col 18)",
        "(line 1775,col 9)-(line 1775,col 25)",
        "(line 1776,col 9)-(line 1776,col 14)",
        "(line 1777,col 9)-(line 1777,col 18)",
        "(line 1779,col 9)-(line 1779,col 50)",
        "(line 1794,col 9)-(line 1794,col 76)",
        "(line 1821,col 9)-(line 1828,col 9)",
        "(line 1830,col 9)-(line 1830,col 23)",
        "(line 1832,col 9)-(line 1832,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosQ(double, double)",
      "begin_line": 1842,
      "end_line": 1851,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1843,col 9)-(line 1843,col 47)",
        "(line 1844,col 9)-(line 1844,col 50)",
        "(line 1846,col 9)-(line 1846,col 35)",
        "(line 1847,col 9)-(line 1847,col 36)",
        "(line 1848,col 9)-(line 1848,col 23)",
        "(line 1850,col 9)-(line 1850,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1861,
      "end_line": 1996,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1863,col 9)-(line 1863,col 43)",
        "(line 1864,col 9)-(line 1864,col 49)",
        "(line 1867,col 9)-(line 1867,col 47)",
        "(line 1868,col 9)-(line 1868,col 47)",
        "(line 1869,col 9)-(line 1869,col 49)",
        "(line 1870,col 9)-(line 1870,col 49)",
        "(line 1873,col 9)-(line 1873,col 33)",
        "(line 1874,col 9)-(line 1874,col 43)",
        "(line 1875,col 9)-(line 1875,col 35)",
        "(line 1876,col 9)-(line 1876,col 51)",
        "(line 1879,col 9)-(line 1879,col 45)",
        "(line 1880,col 9)-(line 1880,col 47)",
        "(line 1881,col 9)-(line 1881,col 36)",
        "(line 1882,col 9)-(line 1882,col 24)",
        "(line 1907,col 9)-(line 1907,col 21)",
        "(line 1908,col 9)-(line 1908,col 21)",
        "(line 1911,col 9)-(line 1911,col 25)",
        "(line 1912,col 9)-(line 1912,col 25)",
        "(line 1913,col 9)-(line 1913,col 32)",
        "(line 1914,col 9)-(line 1914,col 14)",
        "(line 1915,col 9)-(line 1915,col 18)",
        "(line 1917,col 9)-(line 1917,col 26)",
        "(line 1918,col 9)-(line 1918,col 18)",
        "(line 1919,col 9)-(line 1919,col 25)",
        "(line 1920,col 9)-(line 1920,col 14)",
        "(line 1921,col 9)-(line 1921,col 18)",
        "(line 1923,col 9)-(line 1923,col 46)",
        "(line 1924,col 9)-(line 1924,col 70)",
        "(line 1926,col 9)-(line 1926,col 28)",
        "(line 1927,col 9)-(line 1927,col 38)",
        "(line 1931,col 9)-(line 1931,col 28)",
        "(line 1933,col 9)-(line 1933,col 26)",
        "(line 1934,col 9)-(line 1934,col 18)",
        "(line 1935,col 9)-(line 1935,col 25)",
        "(line 1936,col 9)-(line 1936,col 14)",
        "(line 1937,col 9)-(line 1937,col 18)",
        "(line 1939,col 9)-(line 1939,col 27)",
        "(line 1940,col 9)-(line 1940,col 18)",
        "(line 1941,col 9)-(line 1941,col 25)",
        "(line 1942,col 9)-(line 1942,col 14)",
        "(line 1943,col 9)-(line 1943,col 18)",
        "(line 1945,col 9)-(line 1945,col 62)",
        "(line 1946,col 9)-(line 1946,col 64)",
        "(line 1948,col 9)-(line 1948,col 28)",
        "(line 1949,col 9)-(line 1949,col 38)",
        "(line 1951,col 9)-(line 1955,col 9)",
        "(line 1968,col 9)-(line 1968,col 31)",
        "(line 1971,col 9)-(line 1971,col 34)",
        "(line 1972,col 9)-(line 1972,col 42)",
        "(line 1973,col 9)-(line 1973,col 34)",
        "(line 1975,col 9)-(line 1975,col 35)",
        "(line 1976,col 9)-(line 1976,col 44)",
        "(line 1977,col 9)-(line 1977,col 37)",
        "(line 1980,col 9)-(line 1980,col 85)",
        "(line 1981,col 9)-(line 1981,col 25)",
        "(line 1982,col 9)-(line 1982,col 42)",
        "(line 1984,col 9)-(line 1993,col 9)",
        "(line 1995,col 9)-(line 1995,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 2009,
      "end_line": 2219,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 2012,col 9)-(line 2012,col 52)",
        "(line 2013,col 9)-(line 2013,col 61)",
        "(line 2016,col 9)-(line 2016,col 38)",
        "(line 2017,col 9)-(line 2017,col 38)",
        "(line 2020,col 9)-(line 2020,col 19)",
        "(line 2021,col 9)-(line 2021,col 22)",
        "(line 2024,col 9)-(line 2024,col 19)",
        "(line 2025,col 9)-(line 2025,col 19)",
        "(line 2026,col 9)-(line 2026,col 19)",
        "(line 2027,col 9)-(line 2027,col 32)",
        "(line 2028,col 9)-(line 2028,col 42)",
        "(line 2030,col 9)-(line 2039,col 9)",
        "(line 2042,col 9)-(line 2042,col 31)",
        "(line 2043,col 9)-(line 2043,col 38)",
        "(line 2045,col 9)-(line 2045,col 30)",
        "(line 2046,col 9)-(line 2046,col 37)",
        "(line 2048,col 9)-(line 2048,col 24)",
        "(line 2049,col 9)-(line 2049,col 24)",
        "(line 2050,col 9)-(line 2050,col 24)",
        "(line 2051,col 9)-(line 2051,col 24)",
        "(line 2053,col 9)-(line 2053,col 37)",
        "(line 2054,col 9)-(line 2054,col 38)",
        "(line 2056,col 9)-(line 2056,col 55)",
        "(line 2057,col 9)-(line 2057,col 48)",
        "(line 2058,col 9)-(line 2058,col 60)",
        "(line 2061,col 9)-(line 2064,col 9)",
        "(line 2066,col 9)-(line 2066,col 50)",
        "(line 2067,col 9)-(line 2067,col 40)",
        "(line 2069,col 9)-(line 2069,col 35)",
        "(line 2070,col 9)-(line 2070,col 36)",
        "(line 2072,col 9)-(line 2072,col 52)",
        "(line 2075,col 9)-(line 2078,col 9)",
        "(line 2081,col 9)-(line 2081,col 25)",
        "(line 2082,col 9)-(line 2082,col 32)",
        "(line 2083,col 9)-(line 2083,col 19)",
        "(line 2084,col 9)-(line 2084,col 19)",
        "(line 2085,col 9)-(line 2085,col 19)",
        "(line 2088,col 9)-(line 2088,col 37)",
        "(line 2090,col 9)-(line 2090,col 50)",
        "(line 2091,col 9)-(line 2091,col 48)",
        "(line 2092,col 9)-(line 2092,col 20)",
        "(line 2093,col 9)-(line 2093,col 52)",
        "(line 2095,col 9)-(line 2098,col 9)",
        "(line 2101,col 9)-(line 2101,col 25)",
        "(line 2102,col 9)-(line 2102,col 32)",
        "(line 2104,col 9)-(line 2104,col 19)",
        "(line 2105,col 9)-(line 2105,col 19)",
        "(line 2106,col 9)-(line 2106,col 19)",
        "(line 2108,col 9)-(line 2108,col 40)",
        "(line 2120,col 9)-(line 2120,col 42)",
        "(line 2123,col 9)-(line 2123,col 20)",
        "(line 2124,col 9)-(line 2124,col 30)",
        "(line 2125,col 9)-(line 2125,col 20)",
        "(line 2128,col 9)-(line 2128,col 25)",
        "(line 2129,col 9)-(line 2129,col 32)",
        "(line 2131,col 9)-(line 2131,col 34)",
        "(line 2132,col 9)-(line 2132,col 41)",
        "(line 2134,col 9)-(line 2134,col 19)",
        "(line 2135,col 9)-(line 2135,col 19)",
        "(line 2136,col 9)-(line 2136,col 19)",
        "(line 2137,col 9)-(line 2137,col 19)",
        "(line 2139,col 9)-(line 2139,col 38)",
        "(line 2140,col 9)-(line 2140,col 39)",
        "(line 2142,col 9)-(line 2142,col 47)",
        "(line 2143,col 9)-(line 2143,col 40)",
        "(line 2144,col 9)-(line 2144,col 53)",
        "(line 2147,col 9)-(line 2150,col 9)",
        "(line 2152,col 9)-(line 2152,col 51)",
        "(line 2153,col 9)-(line 2153,col 40)",
        "(line 2155,col 9)-(line 2155,col 37)",
        "(line 2156,col 9)-(line 2156,col 38)",
        "(line 2158,col 9)-(line 2158,col 53)",
        "(line 2161,col 9)-(line 2164,col 9)",
        "(line 2167,col 9)-(line 2167,col 34)",
        "(line 2168,col 9)-(line 2168,col 41)",
        "(line 2169,col 9)-(line 2169,col 19)",
        "(line 2170,col 9)-(line 2170,col 19)",
        "(line 2171,col 9)-(line 2171,col 19)",
        "(line 2174,col 9)-(line 2174,col 37)",
        "(line 2176,col 9)-(line 2176,col 51)",
        "(line 2177,col 9)-(line 2177,col 48)",
        "(line 2178,col 9)-(line 2178,col 21)",
        "(line 2179,col 9)-(line 2179,col 53)",
        "(line 2181,col 9)-(line 2184,col 9)",
        "(line 2187,col 9)-(line 2187,col 25)",
        "(line 2188,col 9)-(line 2188,col 32)",
        "(line 2189,col 9)-(line 2189,col 34)",
        "(line 2190,col 9)-(line 2190,col 41)",
        "(line 2191,col 9)-(line 2191,col 19)",
        "(line 2192,col 9)-(line 2192,col 19)",
        "(line 2193,col 9)-(line 2193,col 19)",
        "(line 2196,col 9)-(line 2196,col 37)",
        "(line 2198,col 9)-(line 2198,col 51)",
        "(line 2199,col 9)-(line 2199,col 48)",
        "(line 2200,col 9)-(line 2200,col 21)",
        "(line 2201,col 9)-(line 2201,col 53)",
        "(line 2203,col 9)-(line 2206,col 9)",
        "(line 2209,col 9)-(line 2209,col 53)",
        "(line 2210,col 9)-(line 2210,col 98)",
        "(line 2212,col 9)-(line 2212,col 34)",
        "(line 2213,col 9)-(line 2213,col 44)",
        "(line 2216,col 9)-(line 2216,col 28)",
        "(line 2217,col 9)-(line 2217,col 31)",
        "(line 2218,col 9)-(line 2218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sin(double)",
      "begin_line": 2227,
      "end_line": 2286,
      "comment": "\n     * Sine function.\n     *\n     * @param x Argument.\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 2228,col 9)-(line 2228,col 33)",
        "(line 2229,col 9)-(line 2229,col 25)",
        "(line 2230,col 9)-(line 2230,col 18)",
        "(line 2231,col 9)-(line 2231,col 24)",
        "(line 2234,col 9)-(line 2234,col 15)",
        "(line 2235,col 9)-(line 2238,col 9)",
        "(line 2241,col 9)-(line 2247,col 9)",
        "(line 2249,col 9)-(line 2251,col 9)",
        "(line 2254,col 9)-(line 2268,col 9)",
        "(line 2270,col 9)-(line 2272,col 9)",
        "(line 2274,col 9)-(line 2285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cos(double)",
      "begin_line": 2294,
      "end_line": 2340,
      "comment": "\n     * Cosine function.\n     *\n     * @param x Argument.\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 2295,col 9)-(line 2295,col 25)",
        "(line 2298,col 9)-(line 2298,col 22)",
        "(line 2299,col 9)-(line 2301,col 9)",
        "(line 2303,col 9)-(line 2305,col 9)",
        "(line 2308,col 9)-(line 2308,col 22)",
        "(line 2309,col 9)-(line 2323,col 9)",
        "(line 2328,col 9)-(line 2339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tan(double)",
      "begin_line": 2348,
      "end_line": 2417,
      "comment": "\n     * Tangent function.\n     *\n     * @param x Argument.\n     * @return tan(x)\n     ",
      "child_ranges": [
        "(line 2349,col 9)-(line 2349,col 33)",
        "(line 2350,col 9)-(line 2350,col 25)",
        "(line 2353,col 9)-(line 2353,col 22)",
        "(line 2354,col 9)-(line 2357,col 9)",
        "(line 2360,col 9)-(line 2366,col 9)",
        "(line 2368,col 9)-(line 2370,col 9)",
        "(line 2373,col 9)-(line 2373,col 22)",
        "(line 2374,col 9)-(line 2388,col 9)",
        "(line 2390,col 9)-(line 2403,col 9)",
        "(line 2405,col 9)-(line 2405,col 22)",
        "(line 2406,col 9)-(line 2410,col 9)",
        "(line 2412,col 9)-(line 2414,col 9)",
        "(line 2416,col 9)-(line 2416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double)",
      "begin_line": 2424,
      "end_line": 2426,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2425,col 9)-(line 2425,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2434,
      "end_line": 2573,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2435,col 9)-(line 2435,col 31)",
        "(line 2436,col 9)-(line 2436,col 16)",
        "(line 2438,col 9)-(line 2440,col 9)",
        "(line 2442,col 9)-(line 2447,col 9)",
        "(line 2449,col 9)-(line 2451,col 9)",
        "(line 2454,col 9)-(line 2459,col 9)",
        "(line 2460,col 9)-(line 2460,col 48)",
        "(line 2461,col 9)-(line 2461,col 58)",
        "(line 2462,col 9)-(line 2462,col 42)",
        "(line 2464,col 9)-(line 2464,col 34)",
        "(line 2465,col 9)-(line 2465,col 37)",
        "(line 2466,col 9)-(line 2466,col 20)",
        "(line 2469,col 9)-(line 2469,col 33)",
        "(line 2470,col 9)-(line 2470,col 37)",
        "(line 2471,col 9)-(line 2471,col 33)",
        "(line 2472,col 9)-(line 2472,col 16)",
        "(line 2473,col 9)-(line 2473,col 17)",
        "(line 2476,col 9)-(line 2508,col 9)",
        "(line 2511,col 9)-(line 2511,col 18)",
        "(line 2512,col 9)-(line 2512,col 18)",
        "(line 2515,col 9)-(line 2515,col 41)",
        "(line 2526,col 9)-(line 2526,col 33)",
        "(line 2527,col 9)-(line 2527,col 47)",
        "(line 2528,col 9)-(line 2528,col 46)",
        "(line 2529,col 9)-(line 2529,col 46)",
        "(line 2530,col 9)-(line 2530,col 46)",
        "(line 2531,col 9)-(line 2531,col 47)",
        "(line 2532,col 9)-(line 2532,col 31)",
        "(line 2535,col 9)-(line 2535,col 18)",
        "(line 2537,col 9)-(line 2537,col 23)",
        "(line 2538,col 9)-(line 2538,col 31)",
        "(line 2539,col 9)-(line 2539,col 18)",
        "(line 2542,col 9)-(line 2542,col 40)",
        "(line 2545,col 9)-(line 2545,col 38)",
        "(line 2546,col 9)-(line 2546,col 46)",
        "(line 2547,col 9)-(line 2547,col 23)",
        "(line 2548,col 9)-(line 2548,col 32)",
        "(line 2549,col 9)-(line 2549,col 18)",
        "(line 2551,col 9)-(line 2551,col 32)",
        "(line 2552,col 9)-(line 2552,col 45)",
        "(line 2554,col 9)-(line 2565,col 9)",
        "(line 2568,col 9)-(line 2570,col 9)",
        "(line 2572,col 9)-(line 2572,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan2(double, double)",
      "begin_line": 2581,
      "end_line": 2696,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2582,col 9)-(line 2584,col 9)",
        "(line 2586,col 9)-(line 2608,col 9)",
        "(line 2612,col 9)-(line 2622,col 9)",
        "(line 2624,col 9)-(line 2634,col 9)",
        "(line 2636,col 9)-(line 2644,col 9)",
        "(line 2646,col 9)-(line 2655,col 9)",
        "(line 2659,col 9)-(line 2667,col 9)",
        "(line 2670,col 9)-(line 2670,col 31)",
        "(line 2671,col 9)-(line 2673,col 9)",
        "(line 2675,col 9)-(line 2675,col 38)",
        "(line 2676,col 9)-(line 2676,col 27)",
        "(line 2679,col 9)-(line 2679,col 44)",
        "(line 2680,col 9)-(line 2680,col 33)",
        "(line 2682,col 9)-(line 2682,col 62)",
        "(line 2684,col 9)-(line 2684,col 36)",
        "(line 2685,col 9)-(line 2685,col 31)",
        "(line 2686,col 9)-(line 2686,col 18)",
        "(line 2688,col 9)-(line 2690,col 9)",
        "(line 2693,col 9)-(line 2693,col 50)",
        "(line 2695,col 9)-(line 2695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asin(double)",
      "begin_line": 2702,
      "end_line": 2772,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2703,col 7)-(line 2705,col 7)",
        "(line 2707,col 7)-(line 2709,col 7)",
        "(line 2711,col 7)-(line 2713,col 7)",
        "(line 2715,col 7)-(line 2717,col 7)",
        "(line 2719,col 7)-(line 2721,col 7)",
        "(line 2726,col 7)-(line 2726,col 37)",
        "(line 2727,col 7)-(line 2727,col 40)",
        "(line 2728,col 7)-(line 2728,col 31)",
        "(line 2731,col 7)-(line 2731,col 24)",
        "(line 2732,col 7)-(line 2732,col 36)",
        "(line 2735,col 7)-(line 2735,col 15)",
        "(line 2736,col 7)-(line 2736,col 15)",
        "(line 2738,col 7)-(line 2738,col 27)",
        "(line 2739,col 7)-(line 2739,col 35)",
        "(line 2741,col 7)-(line 2741,col 21)",
        "(line 2742,col 7)-(line 2742,col 30)",
        "(line 2743,col 7)-(line 2743,col 16)",
        "(line 2746,col 7)-(line 2746,col 15)",
        "(line 2747,col 7)-(line 2747,col 19)",
        "(line 2748,col 7)-(line 2748,col 30)",
        "(line 2749,col 7)-(line 2749,col 27)",
        "(line 2750,col 7)-(line 2750,col 18)",
        "(line 2753,col 7)-(line 2753,col 53)",
        "(line 2756,col 7)-(line 2756,col 31)",
        "(line 2759,col 7)-(line 2759,col 21)",
        "(line 2760,col 7)-(line 2760,col 30)",
        "(line 2761,col 7)-(line 2761,col 34)",
        "(line 2762,col 7)-(line 2762,col 25)",
        "(line 2764,col 7)-(line 2764,col 52)",
        "(line 2765,col 7)-(line 2765,col 28)",
        "(line 2767,col 7)-(line 2767,col 21)",
        "(line 2768,col 7)-(line 2768,col 29)",
        "(line 2769,col 7)-(line 2769,col 16)",
        "(line 2771,col 7)-(line 2771,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acos(double)",
      "begin_line": 2778,
      "end_line": 2854,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2779,col 7)-(line 2781,col 7)",
        "(line 2783,col 7)-(line 2785,col 7)",
        "(line 2787,col 7)-(line 2789,col 7)",
        "(line 2791,col 7)-(line 2793,col 7)",
        "(line 2795,col 7)-(line 2797,col 7)",
        "(line 2802,col 7)-(line 2802,col 37)",
        "(line 2803,col 7)-(line 2803,col 40)",
        "(line 2804,col 7)-(line 2804,col 31)",
        "(line 2807,col 7)-(line 2807,col 24)",
        "(line 2808,col 7)-(line 2808,col 36)",
        "(line 2811,col 7)-(line 2811,col 15)",
        "(line 2812,col 7)-(line 2812,col 15)",
        "(line 2814,col 7)-(line 2814,col 27)",
        "(line 2815,col 7)-(line 2815,col 35)",
        "(line 2817,col 7)-(line 2817,col 21)",
        "(line 2818,col 7)-(line 2818,col 30)",
        "(line 2819,col 7)-(line 2819,col 16)",
        "(line 2822,col 7)-(line 2822,col 26)",
        "(line 2823,col 7)-(line 2823,col 30)",
        "(line 2824,col 7)-(line 2824,col 27)",
        "(line 2825,col 7)-(line 2825,col 18)",
        "(line 2828,col 7)-(line 2828,col 53)",
        "(line 2831,col 7)-(line 2831,col 25)",
        "(line 2832,col 7)-(line 2832,col 16)",
        "(line 2833,col 7)-(line 2833,col 26)",
        "(line 2836,col 7)-(line 2836,col 21)",
        "(line 2839,col 7)-(line 2841,col 7)",
        "(line 2843,col 7)-(line 2843,col 36)",
        "(line 2844,col 7)-(line 2844,col 25)",
        "(line 2846,col 7)-(line 2846,col 52)",
        "(line 2847,col 7)-(line 2847,col 19)",
        "(line 2849,col 7)-(line 2849,col 21)",
        "(line 2850,col 7)-(line 2850,col 29)",
        "(line 2851,col 7)-(line 2851,col 16)",
        "(line 2853,col 7)-(line 2853,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cbrt(double)",
      "begin_line": 2860,
      "end_line": 2938,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2862,col 7)-(line 2862,col 50)",
        "(line 2863,col 7)-(line 2863,col 59)",
        "(line 2864,col 7)-(line 2864,col 32)",
        "(line 2866,col 7)-(line 2876,col 7)",
        "(line 2878,col 7)-(line 2881,col 7)",
        "(line 2884,col 7)-(line 2884,col 30)",
        "(line 2887,col 7)-(line 2888,col 81)",
        "(line 2891,col 7)-(line 2891,col 104)",
        "(line 2894,col 7)-(line 2894,col 41)",
        "(line 2895,col 7)-(line 2895,col 44)",
        "(line 2896,col 7)-(line 2896,col 45)",
        "(line 2897,col 7)-(line 2897,col 44)",
        "(line 2898,col 7)-(line 2898,col 44)",
        "(line 2900,col 7)-(line 2900,col 39)",
        "(line 2905,col 7)-(line 2905,col 39)",
        "(line 2906,col 7)-(line 2906,col 46)",
        "(line 2907,col 7)-(line 2907,col 46)",
        "(line 2910,col 7)-(line 2910,col 39)",
        "(line 2911,col 7)-(line 2911,col 36)",
        "(line 2912,col 7)-(line 2912,col 27)",
        "(line 2914,col 7)-(line 2914,col 26)",
        "(line 2915,col 7)-(line 2915,col 42)",
        "(line 2916,col 7)-(line 2916,col 31)",
        "(line 2917,col 7)-(line 2917,col 38)",
        "(line 2918,col 7)-(line 2918,col 23)",
        "(line 2919,col 7)-(line 2919,col 17)",
        "(line 2921,col 7)-(line 2921,col 39)",
        "(line 2922,col 7)-(line 2922,col 19)",
        "(line 2924,col 7)-(line 2924,col 26)",
        "(line 2925,col 7)-(line 2925,col 34)",
        "(line 2926,col 7)-(line 2926,col 15)",
        "(line 2928,col 7)-(line 2928,col 33)",
        "(line 2931,col 7)-(line 2931,col 16)",
        "(line 2933,col 7)-(line 2935,col 7)",
        "(line 2937,col 7)-(line 2937,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toRadians(double)",
      "begin_line": 2945,
      "end_line": 2963,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2947,col 9)-(line 2949,col 9)",
        "(line 2952,col 9)-(line 2952,col 49)",
        "(line 2953,col 9)-(line 2953,col 50)",
        "(line 2955,col 9)-(line 2955,col 38)",
        "(line 2956,col 9)-(line 2956,col 27)",
        "(line 2958,col 9)-(line 2958,col 74)",
        "(line 2959,col 9)-(line 2961,col 9)",
        "(line 2962,col 9)-(line 2962,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toDegrees(double)",
      "begin_line": 2970,
      "end_line": 2984,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2972,col 9)-(line 2974,col 9)",
        "(line 2977,col 9)-(line 2977,col 46)",
        "(line 2978,col 9)-(line 2978,col 50)",
        "(line 2980,col 9)-(line 2980,col 38)",
        "(line 2981,col 9)-(line 2981,col 27)",
        "(line 2983,col 9)-(line 2983,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(int)",
      "begin_line": 2991,
      "end_line": 2994,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2992,col 9)-(line 2992,col 31)",
        "(line 2993,col 9)-(line 2993,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(long)",
      "begin_line": 3001,
      "end_line": 3008,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3002,col 9)-(line 3002,col 32)",
        "(line 3007,col 9)-(line 3007,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(float)",
      "begin_line": 3015,
      "end_line": 3017,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3016,col 9)-(line 3016,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(double)",
      "begin_line": 3024,
      "end_line": 3026,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3025,col 9)-(line 3025,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(double)",
      "begin_line": 3033,
      "end_line": 3038,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3034,col 9)-(line 3036,col 9)",
        "(line 3037,col 9)-(line 3037,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(float)",
      "begin_line": 3045,
      "end_line": 3050,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3046,col 9)-(line 3048,col 9)",
        "(line 3049,col 9)-(line 3049,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(double, int)",
      "begin_line": 3058,
      "end_line": 3134,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3061,col 9)-(line 3063,col 9)",
        "(line 3066,col 9)-(line 3068,col 9)",
        "(line 3069,col 9)-(line 3071,col 9)",
        "(line 3072,col 9)-(line 3074,col 9)",
        "(line 3077,col 9)-(line 3077,col 56)",
        "(line 3078,col 9)-(line 3078,col 53)",
        "(line 3079,col 9)-(line 3079,col 56)",
        "(line 3080,col 9)-(line 3080,col 53)",
        "(line 3083,col 9)-(line 3083,col 42)",
        "(line 3085,col 9)-(line 3132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(float, int)",
      "begin_line": 3142,
      "end_line": 3218,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3145,col 9)-(line 3147,col 9)",
        "(line 3150,col 9)-(line 3152,col 9)",
        "(line 3153,col 9)-(line 3155,col 9)",
        "(line 3156,col 9)-(line 3158,col 9)",
        "(line 3161,col 9)-(line 3161,col 49)",
        "(line 3162,col 9)-(line 3162,col 43)",
        "(line 3163,col 9)-(line 3163,col 46)",
        "(line 3164,col 9)-(line 3164,col 43)",
        "(line 3167,col 9)-(line 3167,col 42)",
        "(line 3169,col 9)-(line 3216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(double, double)",
      "begin_line": 3251,
      "end_line": 3274,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3254,col 9)-(line 3262,col 9)",
        "(line 3266,col 9)-(line 3266,col 56)",
        "(line 3267,col 9)-(line 3267,col 53)",
        "(line 3268,col 9)-(line 3272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(float, double)",
      "begin_line": 3307,
      "end_line": 3330,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3310,col 9)-(line 3318,col 9)",
        "(line 3322,col 9)-(line 3322,col 49)",
        "(line 3323,col 9)-(line 3323,col 43)",
        "(line 3324,col 9)-(line 3328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.floor(double)",
      "begin_line": 3336,
      "end_line": 3357,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3337,col 9)-(line 3337,col 15)",
        "(line 3339,col 9)-(line 3341,col 9)",
        "(line 3343,col 9)-(line 3345,col 9)",
        "(line 3347,col 9)-(line 3347,col 21)",
        "(line 3348,col 9)-(line 3350,col 9)",
        "(line 3352,col 9)-(line 3354,col 9)",
        "(line 3356,col 9)-(line 3356,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ceil(double)",
      "begin_line": 3363,
      "end_line": 3382,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3364,col 9)-(line 3364,col 17)",
        "(line 3366,col 9)-(line 3368,col 9)",
        "(line 3370,col 9)-(line 3370,col 21)",
        "(line 3371,col 9)-(line 3373,col 9)",
        "(line 3375,col 9)-(line 3375,col 17)",
        "(line 3377,col 9)-(line 3379,col 9)",
        "(line 3381,col 9)-(line 3381,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.rint(double)",
      "begin_line": 3388,
      "end_line": 3405,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3389,col 9)-(line 3389,col 28)",
        "(line 3390,col 9)-(line 3390,col 25)",
        "(line 3392,col 9)-(line 3397,col 9)",
        "(line 3398,col 9)-(line 3400,col 9)",
        "(line 3403,col 9)-(line 3403,col 26)",
        "(line 3404,col 9)-(line 3404,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(double)",
      "begin_line": 3411,
      "end_line": 3413,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3412,col 9)-(line 3412,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(float)",
      "begin_line": 3419,
      "end_line": 3421,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3420,col 9)-(line 3420,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(int, int)",
      "begin_line": 3428,
      "end_line": 3430,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3429,col 9)-(line 3429,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(long, long)",
      "begin_line": 3437,
      "end_line": 3439,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3438,col 9)-(line 3438,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(float, float)",
      "begin_line": 3446,
      "end_line": 3464,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3447,col 9)-(line 3449,col 9)",
        "(line 3450,col 9)-(line 3452,col 9)",
        "(line 3454,col 9)-(line 3456,col 9)",
        "(line 3459,col 9)-(line 3459,col 46)",
        "(line 3460,col 9)-(line 3462,col 9)",
        "(line 3463,col 9)-(line 3463,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(double, double)",
      "begin_line": 3471,
      "end_line": 3489,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3472,col 9)-(line 3474,col 9)",
        "(line 3475,col 9)-(line 3477,col 9)",
        "(line 3479,col 9)-(line 3481,col 9)",
        "(line 3484,col 9)-(line 3484,col 50)",
        "(line 3485,col 9)-(line 3487,col 9)",
        "(line 3488,col 9)-(line 3488,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(int, int)",
      "begin_line": 3496,
      "end_line": 3498,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3497,col 9)-(line 3497,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(long, long)",
      "begin_line": 3505,
      "end_line": 3507,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3506,col 9)-(line 3506,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(float, float)",
      "begin_line": 3514,
      "end_line": 3532,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3515,col 9)-(line 3517,col 9)",
        "(line 3518,col 9)-(line 3520,col 9)",
        "(line 3522,col 9)-(line 3524,col 9)",
        "(line 3527,col 9)-(line 3527,col 46)",
        "(line 3528,col 9)-(line 3530,col 9)",
        "(line 3531,col 9)-(line 3531,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(double, double)",
      "begin_line": 3539,
      "end_line": 3557,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3540,col 9)-(line 3542,col 9)",
        "(line 3543,col 9)-(line 3545,col 9)",
        "(line 3547,col 9)-(line 3549,col 9)",
        "(line 3552,col 9)-(line 3552,col 50)",
        "(line 3553,col 9)-(line 3555,col 9)",
        "(line 3556,col 9)-(line 3556,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.hypot(double, double)",
      "begin_line": 3573,
      "end_line": 3606,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3574,col 9)-(line 3605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3628,
      "end_line": 3630,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3629,col 9)-(line 3629,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(double, double)",
      "begin_line": 3640,
      "end_line": 3651,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3645,col 9)-(line 3645,col 61)",
        "(line 3646,col 9)-(line 3646,col 56)",
        "(line 3647,col 9)-(line 3649,col 9)",
        "(line 3650,col 9)-(line 3650,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(float, float)",
      "begin_line": 3661,
      "end_line": 3672,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3666,col 9)-(line 3666,col 57)",
        "(line 3667,col 9)-(line 3667,col 52)",
        "(line 3668,col 9)-(line 3670,col 9)",
        "(line 3671,col 9)-(line 3671,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(double)",
      "begin_line": 3683,
      "end_line": 3686,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3685,col 9)-(line 3685,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(float)",
      "begin_line": 3697,
      "end_line": 3700,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3699,col 9)-(line 3699,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.main(java.lang.String[])",
      "begin_line": 3707,
      "end_line": 3720,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3708,col 9)-(line 3708,col 37)",
        "(line 3709,col 9)-(line 3709,col 104)",
        "(line 3710,col 9)-(line 3710,col 104)",
        "(line 3711,col 9)-(line 3711,col 108)",
        "(line 3712,col 9)-(line 3712,col 108)",
        "(line 3713,col 9)-(line 3713,col 76)",
        "(line 3714,col 9)-(line 3714,col 83)",
        "(line 3715,col 9)-(line 3715,col 83)",
        "(line 3716,col 9)-(line 3716,col 87)",
        "(line 3717,col 9)-(line 3717,col 87)",
        "(line 3718,col 9)-(line 3718,col 89)",
        "(line 3719,col 9)-(line 3719,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3723,
      "end_line": 3759,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3727,
      "end_line": 3727,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3731,
      "end_line": 3731,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3762,
      "end_line": 3792,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3767,
      "end_line": 3767,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3771,
      "end_line": 3771,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3795,
      "end_line": 3812,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3797,
      "end_line": 3797,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "class_interface",
      "name": "CodyWaite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3815,
      "end_line": 3882,
      "comment": " Enclose the Cody/Waite reduction (used in \"sin\", \"cos\" and \"tan\"). "
    },
    {
      "type": "field",
      "varNames": [
        "finalK"
      ],
      "begin_line": 3817,
      "end_line": 3817,
      "comment": " k "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemA"
      ],
      "begin_line": 3819,
      "end_line": 3819,
      "comment": " remA "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemB"
      ],
      "begin_line": 3821,
      "end_line": 3821,
      "comment": " remB "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.CodyWaite(double)",
      "begin_line": 3826,
      "end_line": 3862,
      "comment": "\n         * @param xa Argument.\n         ",
      "child_ranges": [
        "(line 3829,col 13)-(line 3829,col 51)",
        "(line 3832,col 13)-(line 3832,col 24)",
        "(line 3833,col 13)-(line 3833,col 24)",
        "(line 3834,col 13)-(line 3857,col 13)",
        "(line 3859,col 13)-(line 3859,col 28)",
        "(line 3860,col 13)-(line 3860,col 34)",
        "(line 3861,col 13)-(line 3861,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getK()",
      "begin_line": 3867,
      "end_line": 3869,
      "comment": "\n         * @return k\n         ",
      "child_ranges": [
        "(line 3868,col 13)-(line 3868,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemA()",
      "begin_line": 3873,
      "end_line": 3875,
      "comment": "\n         * @return remA\n         ",
      "child_ranges": [
        "(line 3874,col 13)-(line 3874,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemB()",
      "begin_line": 3879,
      "end_line": 3881,
      "comment": "\n         * @return remB\n         ",
      "child_ranges": [
        "(line 3880,col 13)-(line 3880,col 29)"
      ]
    }
  ]
}