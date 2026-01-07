{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/util/FastMath.java",
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
        "LOG_MAX_VALUE"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " StrictMath.log(Double.MAX_VALUE): {@value} "
    },
    {
      "type": "field",
      "varNames": [
        "PI"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Archimede\u0027s constant PI, ratio of circle circumference to diameter. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Napier\u0027s constant e, base of the natural logarithm. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_MAX_INDEX"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Index of exp(0) in the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_LEN"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Length of the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT_LEN"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Logarithm table length. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_LEN"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " 0, 1/1024, ... 1024/1024"
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
        "F_1_3"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_5"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_7"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_9"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_11"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_13"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_15"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_17"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_3_4"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_15_16"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_13_14"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_11_12"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_9_10"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_7_8"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_5_6"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_2"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_4"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.FastMath()",
      "begin_line": 352,
      "end_line": 352,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.doubleHighPart(double)",
      "begin_line": 363,
      "end_line": 370,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 45)",
        "(line 368,col 9)-(line 368,col 30)",
        "(line 369,col 9)-(line 369,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sqrt(double)",
      "begin_line": 377,
      "end_line": 379,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosh(double)",
      "begin_line": 385,
      "end_line": 448,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 386,col 7)-(line 388,col 7)",
        "(line 395,col 7)-(line 411,col 7)",
        "(line 413,col 7)-(line 413,col 44)",
        "(line 414,col 7)-(line 416,col 7)",
        "(line 417,col 7)-(line 417,col 26)",
        "(line 419,col 7)-(line 419,col 40)",
        "(line 420,col 7)-(line 420,col 48)",
        "(line 422,col 7)-(line 422,col 38)",
        "(line 423,col 7)-(line 423,col 36)",
        "(line 424,col 7)-(line 424,col 28)",
        "(line 427,col 7)-(line 427,col 28)",
        "(line 428,col 7)-(line 428,col 34)",
        "(line 429,col 7)-(line 429,col 42)",
        "(line 430,col 7)-(line 430,col 37)",
        "(line 433,col 7)-(line 433,col 82)",
        "(line 435,col 7)-(line 435,col 36)",
        "(line 438,col 7)-(line 438,col 25)",
        "(line 439,col 7)-(line 439,col 34)",
        "(line 440,col 7)-(line 440,col 16)",
        "(line 441,col 7)-(line 441,col 25)",
        "(line 442,col 7)-(line 442,col 34)",
        "(line 443,col 7)-(line 443,col 16)",
        "(line 445,col 7)-(line 445,col 30)",
        "(line 446,col 7)-(line 446,col 20)",
        "(line 447,col 7)-(line 447,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinh(double)",
      "begin_line": 454,
      "end_line": 573,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 455,col 7)-(line 455,col 29)",
        "(line 456,col 7)-(line 458,col 7)",
        "(line 465,col 7)-(line 481,col 7)",
        "(line 483,col 7)-(line 485,col 7)",
        "(line 487,col 7)-(line 490,col 7)",
        "(line 492,col 7)-(line 492,col 20)",
        "(line 494,col 7)-(line 566,col 7)",
        "(line 568,col 7)-(line 570,col 7)",
        "(line 572,col 7)-(line 572,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanh(double)",
      "begin_line": 579,
      "end_line": 697,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 580,col 7)-(line 580,col 29)",
        "(line 582,col 7)-(line 584,col 7)",
        "(line 592,col 7)-(line 594,col 7)",
        "(line 596,col 7)-(line 598,col 7)",
        "(line 600,col 7)-(line 602,col 7)",
        "(line 604,col 7)-(line 607,col 7)",
        "(line 609,col 7)-(line 609,col 20)",
        "(line 610,col 7)-(line 690,col 7)",
        "(line 692,col 7)-(line 694,col 7)",
        "(line 696,col 7)-(line 696,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acosh(double)",
      "begin_line": 703,
      "end_line": 705,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asinh(double)",
      "begin_line": 711,
      "end_line": 735,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 33)",
        "(line 713,col 9)-(line 716,col 9)",
        "(line 718,col 9)-(line 718,col 24)",
        "(line 719,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atanh(double)",
      "begin_line": 741,
      "end_line": 765,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 33)",
        "(line 743,col 9)-(line 746,col 9)",
        "(line 748,col 9)-(line 748,col 24)",
        "(line 749,col 9)-(line 762,col 9)",
        "(line 764,col 9)-(line 764,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(double)",
      "begin_line": 772,
      "end_line": 774,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(float)",
      "begin_line": 781,
      "end_line": 783,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(double)",
      "begin_line": 789,
      "end_line": 791,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(float)",
      "begin_line": 797,
      "end_line": 799,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.random()",
      "begin_line": 805,
      "end_line": 807,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double)",
      "begin_line": 829,
      "end_line": 831,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double, double, double[])",
      "begin_line": 840,
      "end_line": 955,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 24)",
        "(line 842,col 9)-(line 842,col 24)",
        "(line 843,col 9)-(line 843,col 19)",
        "(line 849,col 9)-(line 899,col 9)",
        "(line 905,col 9)-(line 905,col 58)",
        "(line 906,col 9)-(line 906,col 72)",
        "(line 907,col 9)-(line 907,col 72)",
        "(line 913,col 9)-(line 913,col 63)",
        "(line 922,col 9)-(line 922,col 39)",
        "(line 923,col 9)-(line 923,col 45)",
        "(line 924,col 9)-(line 924,col 45)",
        "(line 925,col 9)-(line 925,col 30)",
        "(line 926,col 9)-(line 926,col 49)",
        "(line 933,col 9)-(line 933,col 44)",
        "(line 934,col 9)-(line 934,col 90)",
        "(line 940,col 9)-(line 940,col 43)",
        "(line 941,col 9)-(line 941,col 28)",
        "(line 942,col 9)-(line 946,col 9)",
        "(line 948,col 9)-(line 952,col 9)",
        "(line 954,col 9)-(line 954,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double)",
      "begin_line": 961,
      "end_line": 963,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 962,col 7)-(line 962,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double, double[])",
      "begin_line": 970,
      "end_line": 1110,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 973,col 9)",
        "(line 975,col 9)-(line 988,col 9)",
        "(line 990,col 9)-(line 990,col 21)",
        "(line 991,col 9)-(line 991,col 21)",
        "(line 992,col 9)-(line 992,col 23)",
        "(line 993,col 9)-(line 993,col 33)",
        "(line 995,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1014,col 9)",
        "(line 1018,col 9)-(line 1018,col 41)",
        "(line 1019,col 9)-(line 1019,col 49)",
        "(line 1020,col 9)-(line 1020,col 48)",
        "(line 1021,col 9)-(line 1021,col 48)",
        "(line 1022,col 9)-(line 1022,col 26)",
        "(line 1023,col 9)-(line 1023,col 26)",
        "(line 1025,col 9)-(line 1025,col 28)",
        "(line 1026,col 9)-(line 1026,col 30)",
        "(line 1027,col 9)-(line 1027,col 31)",
        "(line 1028,col 9)-(line 1028,col 18)",
        "(line 1030,col 9)-(line 1030,col 33)",
        "(line 1031,col 9)-(line 1031,col 32)",
        "(line 1032,col 9)-(line 1032,col 24)",
        "(line 1033,col 9)-(line 1033,col 18)",
        "(line 1036,col 9)-(line 1036,col 31)",
        "(line 1038,col 9)-(line 1038,col 31)",
        "(line 1039,col 9)-(line 1039,col 46)",
        "(line 1040,col 9)-(line 1040,col 18)",
        "(line 1042,col 9)-(line 1042,col 31)",
        "(line 1043,col 9)-(line 1043,col 40)",
        "(line 1044,col 9)-(line 1044,col 18)",
        "(line 1046,col 9)-(line 1046,col 31)",
        "(line 1047,col 9)-(line 1047,col 38)",
        "(line 1048,col 9)-(line 1048,col 18)",
        "(line 1052,col 9)-(line 1052,col 26)",
        "(line 1053,col 9)-(line 1053,col 35)",
        "(line 1054,col 9)-(line 1054,col 18)",
        "(line 1056,col 9)-(line 1056,col 23)",
        "(line 1058,col 9)-(line 1058,col 32)",
        "(line 1059,col 9)-(line 1059,col 18)",
        "(line 1061,col 9)-(line 1061,col 26)",
        "(line 1063,col 9)-(line 1063,col 35)",
        "(line 1064,col 9)-(line 1064,col 18)",
        "(line 1066,col 9)-(line 1066,col 23)",
        "(line 1068,col 9)-(line 1068,col 32)",
        "(line 1069,col 9)-(line 1069,col 18)",
        "(line 1071,col 9)-(line 1102,col 9)",
        "(line 1104,col 9)-(line 1107,col 9)",
        "(line 1109,col 9)-(line 1109,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double)",
      "begin_line": 1118,
      "end_line": 1120,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double[])",
      "begin_line": 1128,
      "end_line": 1352,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1132,col 47)",
        "(line 1135,col 9)-(line 1143,col 9)",
        "(line 1146,col 9)-(line 1152,col 9)",
        "(line 1155,col 9)-(line 1155,col 41)",
        "(line 1157,col 9)-(line 1174,col 9)",
        "(line 1177,col 9)-(line 1224,col 9)",
        "(line 1227,col 9)-(line 1227,col 87)",
        "(line 1238,col 9)-(line 1238,col 103)",
        "(line 1240,col 9)-(line 1240,col 26)",
        "(line 1241,col 9)-(line 1241,col 26)",
        "(line 1243,col 9)-(line 1303,col 9)",
        "(line 1319,col 9)-(line 1319,col 30)",
        "(line 1320,col 9)-(line 1320,col 23)",
        "(line 1321,col 9)-(line 1321,col 28)",
        "(line 1322,col 9)-(line 1322,col 33)",
        "(line 1323,col 9)-(line 1323,col 14)",
        "(line 1324,col 9)-(line 1324,col 18)",
        "(line 1326,col 9)-(line 1326,col 21)",
        "(line 1327,col 9)-(line 1327,col 28)",
        "(line 1328,col 9)-(line 1328,col 14)",
        "(line 1329,col 9)-(line 1329,col 18)",
        "(line 1331,col 9)-(line 1331,col 27)",
        "(line 1332,col 9)-(line 1332,col 34)",
        "(line 1333,col 9)-(line 1333,col 14)",
        "(line 1334,col 9)-(line 1334,col 18)",
        "(line 1336,col 9)-(line 1336,col 23)",
        "(line 1337,col 9)-(line 1337,col 30)",
        "(line 1338,col 9)-(line 1338,col 14)",
        "(line 1339,col 9)-(line 1339,col 18)",
        "(line 1341,col 9)-(line 1341,col 21)",
        "(line 1342,col 9)-(line 1342,col 28)",
        "(line 1343,col 9)-(line 1343,col 14)",
        "(line 1344,col 9)-(line 1344,col 18)",
        "(line 1346,col 9)-(line 1349,col 9)",
        "(line 1351,col 9)-(line 1351,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log1p(double)",
      "begin_line": 1360,
      "end_line": 1390,
      "comment": "\n     * Computes log(1 + x).\n     *\n     * @param x Number.\n     * @return {@code log(1 + x)}.\n     ",
      "child_ranges": [
        "(line 1361,col 9)-(line 1363,col 9)",
        "(line 1365,col 9)-(line 1367,col 9)",
        "(line 1369,col 9)-(line 1389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log10(double)",
      "begin_line": 1396,
      "end_line": 1412,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1397,col 46)",
        "(line 1399,col 9)-(line 1399,col 44)",
        "(line 1400,col 9)-(line 1402,col 9)",
        "(line 1404,col 9)-(line 1404,col 52)",
        "(line 1405,col 9)-(line 1405,col 49)",
        "(line 1406,col 9)-(line 1406,col 55)",
        "(line 1408,col 9)-(line 1408,col 49)",
        "(line 1409,col 9)-(line 1409,col 52)",
        "(line 1411,col 9)-(line 1411,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003e\n     * logarithm\u003c/a\u003e in a given base.\n     *\n     * Returns {@code NaN} if either argument is negative.\n     * If {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.\n     * If both arguments are 0, the result is {@code NaN}.\n     *\n     * @param base Base of the logarithm, must be greater than 0.\n     * @param x Argument, must be greater than 0.\n     * @return the value of the logarithm, i.e. the number {@code y} such that\n     * \u003ccode\u003ebase\u003csup\u003ey\u003c/sup\u003e \u003d x\u003c/code\u003e.\n     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, double)",
      "begin_line": 1441,
      "end_line": 1599,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1442,col 9)-(line 1442,col 43)",
        "(line 1444,col 9)-(line 1446,col 9)",
        "(line 1448,col 9)-(line 1450,col 9)",
        "(line 1453,col 9)-(line 1476,col 9)",
        "(line 1478,col 9)-(line 1487,col 9)",
        "(line 1489,col 9)-(line 1499,col 9)",
        "(line 1501,col 9)-(line 1523,col 9)",
        "(line 1525,col 9)-(line 1536,col 9)",
        "(line 1539,col 9)-(line 1551,col 9)",
        "(line 1554,col 9)-(line 1554,col 18)",
        "(line 1555,col 9)-(line 1555,col 18)",
        "(line 1556,col 9)-(line 1565,col 9)",
        "(line 1568,col 9)-(line 1568,col 41)",
        "(line 1569,col 9)-(line 1571,col 9)",
        "(line 1573,col 9)-(line 1573,col 28)",
        "(line 1574,col 9)-(line 1574,col 28)",
        "(line 1577,col 9)-(line 1577,col 41)",
        "(line 1578,col 9)-(line 1578,col 40)",
        "(line 1579,col 9)-(line 1579,col 26)",
        "(line 1580,col 9)-(line 1580,col 19)",
        "(line 1583,col 9)-(line 1583,col 35)",
        "(line 1584,col 9)-(line 1584,col 57)",
        "(line 1586,col 9)-(line 1586,col 20)",
        "(line 1587,col 9)-(line 1587,col 31)",
        "(line 1589,col 9)-(line 1589,col 31)",
        "(line 1590,col 9)-(line 1590,col 35)",
        "(line 1591,col 9)-(line 1591,col 34)",
        "(line 1592,col 9)-(line 1592,col 26)",
        "(line 1593,col 9)-(line 1593,col 26)",
        "(line 1594,col 9)-(line 1594,col 20)",
        "(line 1596,col 9)-(line 1596,col 48)",
        "(line 1598,col 9)-(line 1598,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, int)",
      "begin_line": 1609,
      "end_line": 1666,
      "comment": "\n     * Raise a double to an int power.\n     *\n     * @param d Number to raise.\n     * @param e Exponent.\n     * @return d\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1616,col 9)",
        "(line 1620,col 9)-(line 1620,col 42)",
        "(line 1621,col 9)-(line 1621,col 48)",
        "(line 1622,col 9)-(line 1622,col 46)",
        "(line 1623,col 9)-(line 1623,col 43)",
        "(line 1626,col 9)-(line 1626,col 30)",
        "(line 1627,col 9)-(line 1627,col 30)",
        "(line 1630,col 9)-(line 1630,col 27)",
        "(line 1631,col 9)-(line 1631,col 32)",
        "(line 1632,col 9)-(line 1632,col 31)",
        "(line 1634,col 9)-(line 1662,col 9)",
        "(line 1664,col 9)-(line 1664,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polySine(double)",
      "begin_line": 1674,
      "end_line": 1687,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1676,col 9)-(line 1676,col 24)",
        "(line 1678,col 9)-(line 1678,col 41)",
        "(line 1679,col 9)-(line 1679,col 44)",
        "(line 1680,col 9)-(line 1680,col 42)",
        "(line 1681,col 9)-(line 1681,col 42)",
        "(line 1684,col 9)-(line 1684,col 23)",
        "(line 1686,col 9)-(line 1686,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polyCosine(double)",
      "begin_line": 1695,
      "end_line": 1705,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1696,col 9)-(line 1696,col 24)",
        "(line 1698,col 9)-(line 1698,col 40)",
        "(line 1699,col 9)-(line 1699,col 44)",
        "(line 1700,col 9)-(line 1700,col 42)",
        "(line 1701,col 9)-(line 1701,col 42)",
        "(line 1702,col 9)-(line 1702,col 16)",
        "(line 1704,col 9)-(line 1704,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinQ(double, double)",
      "begin_line": 1714,
      "end_line": 1829,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1715,col 9)-(line 1715,col 43)",
        "(line 1716,col 9)-(line 1716,col 49)",
        "(line 1719,col 9)-(line 1719,col 47)",
        "(line 1720,col 9)-(line 1720,col 47)",
        "(line 1721,col 9)-(line 1721,col 49)",
        "(line 1722,col 9)-(line 1722,col 49)",
        "(line 1725,col 9)-(line 1725,col 33)",
        "(line 1726,col 9)-(line 1726,col 43)",
        "(line 1727,col 9)-(line 1727,col 35)",
        "(line 1728,col 9)-(line 1728,col 51)",
        "(line 1731,col 9)-(line 1731,col 51)",
        "(line 1732,col 9)-(line 1732,col 47)",
        "(line 1733,col 9)-(line 1733,col 36)",
        "(line 1734,col 9)-(line 1734,col 24)",
        "(line 1737,col 9)-(line 1737,col 22)",
        "(line 1760,col 9)-(line 1760,col 21)",
        "(line 1761,col 9)-(line 1761,col 21)",
        "(line 1763,col 9)-(line 1763,col 25)",
        "(line 1764,col 9)-(line 1764,col 25)",
        "(line 1765,col 9)-(line 1765,col 32)",
        "(line 1766,col 9)-(line 1766,col 14)",
        "(line 1767,col 9)-(line 1767,col 18)",
        "(line 1769,col 9)-(line 1769,col 28)",
        "(line 1770,col 9)-(line 1770,col 18)",
        "(line 1771,col 9)-(line 1771,col 25)",
        "(line 1772,col 9)-(line 1772,col 14)",
        "(line 1773,col 9)-(line 1773,col 18)",
        "(line 1775,col 9)-(line 1775,col 50)",
        "(line 1790,col 9)-(line 1790,col 76)",
        "(line 1817,col 9)-(line 1824,col 9)",
        "(line 1826,col 9)-(line 1826,col 23)",
        "(line 1828,col 9)-(line 1828,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosQ(double, double)",
      "begin_line": 1838,
      "end_line": 1847,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1839,col 9)-(line 1839,col 47)",
        "(line 1840,col 9)-(line 1840,col 50)",
        "(line 1842,col 9)-(line 1842,col 35)",
        "(line 1843,col 9)-(line 1843,col 36)",
        "(line 1844,col 9)-(line 1844,col 23)",
        "(line 1846,col 9)-(line 1846,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1857,
      "end_line": 1992,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1859,col 9)-(line 1859,col 43)",
        "(line 1860,col 9)-(line 1860,col 49)",
        "(line 1863,col 9)-(line 1863,col 47)",
        "(line 1864,col 9)-(line 1864,col 47)",
        "(line 1865,col 9)-(line 1865,col 49)",
        "(line 1866,col 9)-(line 1866,col 49)",
        "(line 1869,col 9)-(line 1869,col 33)",
        "(line 1870,col 9)-(line 1870,col 43)",
        "(line 1871,col 9)-(line 1871,col 35)",
        "(line 1872,col 9)-(line 1872,col 51)",
        "(line 1875,col 9)-(line 1875,col 45)",
        "(line 1876,col 9)-(line 1876,col 47)",
        "(line 1877,col 9)-(line 1877,col 36)",
        "(line 1878,col 9)-(line 1878,col 24)",
        "(line 1903,col 9)-(line 1903,col 21)",
        "(line 1904,col 9)-(line 1904,col 21)",
        "(line 1907,col 9)-(line 1907,col 25)",
        "(line 1908,col 9)-(line 1908,col 25)",
        "(line 1909,col 9)-(line 1909,col 32)",
        "(line 1910,col 9)-(line 1910,col 14)",
        "(line 1911,col 9)-(line 1911,col 18)",
        "(line 1913,col 9)-(line 1913,col 26)",
        "(line 1914,col 9)-(line 1914,col 18)",
        "(line 1915,col 9)-(line 1915,col 25)",
        "(line 1916,col 9)-(line 1916,col 14)",
        "(line 1917,col 9)-(line 1917,col 18)",
        "(line 1919,col 9)-(line 1919,col 46)",
        "(line 1920,col 9)-(line 1920,col 70)",
        "(line 1922,col 9)-(line 1922,col 28)",
        "(line 1923,col 9)-(line 1923,col 38)",
        "(line 1927,col 9)-(line 1927,col 28)",
        "(line 1929,col 9)-(line 1929,col 26)",
        "(line 1930,col 9)-(line 1930,col 18)",
        "(line 1931,col 9)-(line 1931,col 25)",
        "(line 1932,col 9)-(line 1932,col 14)",
        "(line 1933,col 9)-(line 1933,col 18)",
        "(line 1935,col 9)-(line 1935,col 27)",
        "(line 1936,col 9)-(line 1936,col 18)",
        "(line 1937,col 9)-(line 1937,col 25)",
        "(line 1938,col 9)-(line 1938,col 14)",
        "(line 1939,col 9)-(line 1939,col 18)",
        "(line 1941,col 9)-(line 1941,col 62)",
        "(line 1942,col 9)-(line 1942,col 64)",
        "(line 1944,col 9)-(line 1944,col 28)",
        "(line 1945,col 9)-(line 1945,col 38)",
        "(line 1947,col 9)-(line 1951,col 9)",
        "(line 1964,col 9)-(line 1964,col 31)",
        "(line 1967,col 9)-(line 1967,col 34)",
        "(line 1968,col 9)-(line 1968,col 42)",
        "(line 1969,col 9)-(line 1969,col 34)",
        "(line 1971,col 9)-(line 1971,col 35)",
        "(line 1972,col 9)-(line 1972,col 44)",
        "(line 1973,col 9)-(line 1973,col 37)",
        "(line 1976,col 9)-(line 1976,col 85)",
        "(line 1977,col 9)-(line 1977,col 25)",
        "(line 1978,col 9)-(line 1978,col 42)",
        "(line 1980,col 9)-(line 1989,col 9)",
        "(line 1991,col 9)-(line 1991,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 2005,
      "end_line": 2215,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 2008,col 9)-(line 2008,col 49)",
        "(line 2009,col 9)-(line 2009,col 61)",
        "(line 2012,col 9)-(line 2012,col 38)",
        "(line 2013,col 9)-(line 2013,col 38)",
        "(line 2016,col 9)-(line 2016,col 19)",
        "(line 2017,col 9)-(line 2017,col 22)",
        "(line 2020,col 9)-(line 2020,col 19)",
        "(line 2021,col 9)-(line 2021,col 19)",
        "(line 2022,col 9)-(line 2022,col 19)",
        "(line 2023,col 9)-(line 2023,col 32)",
        "(line 2024,col 9)-(line 2024,col 42)",
        "(line 2026,col 9)-(line 2035,col 9)",
        "(line 2038,col 9)-(line 2038,col 31)",
        "(line 2039,col 9)-(line 2039,col 38)",
        "(line 2041,col 9)-(line 2041,col 30)",
        "(line 2042,col 9)-(line 2042,col 37)",
        "(line 2044,col 9)-(line 2044,col 24)",
        "(line 2045,col 9)-(line 2045,col 24)",
        "(line 2046,col 9)-(line 2046,col 24)",
        "(line 2047,col 9)-(line 2047,col 24)",
        "(line 2049,col 9)-(line 2049,col 37)",
        "(line 2050,col 9)-(line 2050,col 38)",
        "(line 2052,col 9)-(line 2052,col 55)",
        "(line 2053,col 9)-(line 2053,col 48)",
        "(line 2054,col 9)-(line 2054,col 60)",
        "(line 2057,col 9)-(line 2060,col 9)",
        "(line 2062,col 9)-(line 2062,col 50)",
        "(line 2063,col 9)-(line 2063,col 40)",
        "(line 2065,col 9)-(line 2065,col 35)",
        "(line 2066,col 9)-(line 2066,col 36)",
        "(line 2068,col 9)-(line 2068,col 52)",
        "(line 2071,col 9)-(line 2074,col 9)",
        "(line 2077,col 9)-(line 2077,col 25)",
        "(line 2078,col 9)-(line 2078,col 32)",
        "(line 2079,col 9)-(line 2079,col 19)",
        "(line 2080,col 9)-(line 2080,col 19)",
        "(line 2081,col 9)-(line 2081,col 19)",
        "(line 2084,col 9)-(line 2084,col 37)",
        "(line 2086,col 9)-(line 2086,col 50)",
        "(line 2087,col 9)-(line 2087,col 48)",
        "(line 2088,col 9)-(line 2088,col 20)",
        "(line 2089,col 9)-(line 2089,col 52)",
        "(line 2091,col 9)-(line 2094,col 9)",
        "(line 2097,col 9)-(line 2097,col 25)",
        "(line 2098,col 9)-(line 2098,col 32)",
        "(line 2100,col 9)-(line 2100,col 19)",
        "(line 2101,col 9)-(line 2101,col 19)",
        "(line 2102,col 9)-(line 2102,col 19)",
        "(line 2104,col 9)-(line 2104,col 40)",
        "(line 2116,col 9)-(line 2116,col 42)",
        "(line 2119,col 9)-(line 2119,col 20)",
        "(line 2120,col 9)-(line 2120,col 30)",
        "(line 2121,col 9)-(line 2121,col 20)",
        "(line 2124,col 9)-(line 2124,col 25)",
        "(line 2125,col 9)-(line 2125,col 32)",
        "(line 2127,col 9)-(line 2127,col 34)",
        "(line 2128,col 9)-(line 2128,col 41)",
        "(line 2130,col 9)-(line 2130,col 19)",
        "(line 2131,col 9)-(line 2131,col 19)",
        "(line 2132,col 9)-(line 2132,col 19)",
        "(line 2133,col 9)-(line 2133,col 19)",
        "(line 2135,col 9)-(line 2135,col 38)",
        "(line 2136,col 9)-(line 2136,col 39)",
        "(line 2138,col 9)-(line 2138,col 47)",
        "(line 2139,col 9)-(line 2139,col 40)",
        "(line 2140,col 9)-(line 2140,col 53)",
        "(line 2143,col 9)-(line 2146,col 9)",
        "(line 2148,col 9)-(line 2148,col 51)",
        "(line 2149,col 9)-(line 2149,col 40)",
        "(line 2151,col 9)-(line 2151,col 37)",
        "(line 2152,col 9)-(line 2152,col 38)",
        "(line 2154,col 9)-(line 2154,col 53)",
        "(line 2157,col 9)-(line 2160,col 9)",
        "(line 2163,col 9)-(line 2163,col 34)",
        "(line 2164,col 9)-(line 2164,col 41)",
        "(line 2165,col 9)-(line 2165,col 19)",
        "(line 2166,col 9)-(line 2166,col 19)",
        "(line 2167,col 9)-(line 2167,col 19)",
        "(line 2170,col 9)-(line 2170,col 37)",
        "(line 2172,col 9)-(line 2172,col 51)",
        "(line 2173,col 9)-(line 2173,col 48)",
        "(line 2174,col 9)-(line 2174,col 21)",
        "(line 2175,col 9)-(line 2175,col 53)",
        "(line 2177,col 9)-(line 2180,col 9)",
        "(line 2183,col 9)-(line 2183,col 25)",
        "(line 2184,col 9)-(line 2184,col 32)",
        "(line 2185,col 9)-(line 2185,col 34)",
        "(line 2186,col 9)-(line 2186,col 41)",
        "(line 2187,col 9)-(line 2187,col 19)",
        "(line 2188,col 9)-(line 2188,col 19)",
        "(line 2189,col 9)-(line 2189,col 19)",
        "(line 2192,col 9)-(line 2192,col 37)",
        "(line 2194,col 9)-(line 2194,col 51)",
        "(line 2195,col 9)-(line 2195,col 48)",
        "(line 2196,col 9)-(line 2196,col 21)",
        "(line 2197,col 9)-(line 2197,col 53)",
        "(line 2199,col 9)-(line 2202,col 9)",
        "(line 2205,col 9)-(line 2205,col 53)",
        "(line 2206,col 9)-(line 2206,col 98)",
        "(line 2208,col 9)-(line 2208,col 34)",
        "(line 2209,col 9)-(line 2209,col 44)",
        "(line 2212,col 9)-(line 2212,col 28)",
        "(line 2213,col 9)-(line 2213,col 31)",
        "(line 2214,col 9)-(line 2214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sin(double)",
      "begin_line": 2223,
      "end_line": 2282,
      "comment": "\n     * Sine function.\n     *\n     * @param x Argument.\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 2224,col 9)-(line 2224,col 33)",
        "(line 2225,col 9)-(line 2225,col 25)",
        "(line 2226,col 9)-(line 2226,col 18)",
        "(line 2227,col 9)-(line 2227,col 24)",
        "(line 2230,col 9)-(line 2230,col 15)",
        "(line 2231,col 9)-(line 2234,col 9)",
        "(line 2237,col 9)-(line 2243,col 9)",
        "(line 2245,col 9)-(line 2247,col 9)",
        "(line 2250,col 9)-(line 2264,col 9)",
        "(line 2266,col 9)-(line 2268,col 9)",
        "(line 2270,col 9)-(line 2281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cos(double)",
      "begin_line": 2290,
      "end_line": 2336,
      "comment": "\n     * Cosine function.\n     *\n     * @param x Argument.\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 2291,col 9)-(line 2291,col 25)",
        "(line 2294,col 9)-(line 2294,col 22)",
        "(line 2295,col 9)-(line 2297,col 9)",
        "(line 2299,col 9)-(line 2301,col 9)",
        "(line 2304,col 9)-(line 2304,col 22)",
        "(line 2305,col 9)-(line 2319,col 9)",
        "(line 2324,col 9)-(line 2335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tan(double)",
      "begin_line": 2344,
      "end_line": 2413,
      "comment": "\n     * Tangent function.\n     *\n     * @param x Argument.\n     * @return tan(x)\n     ",
      "child_ranges": [
        "(line 2345,col 9)-(line 2345,col 33)",
        "(line 2346,col 9)-(line 2346,col 25)",
        "(line 2349,col 9)-(line 2349,col 22)",
        "(line 2350,col 9)-(line 2353,col 9)",
        "(line 2356,col 9)-(line 2362,col 9)",
        "(line 2364,col 9)-(line 2366,col 9)",
        "(line 2369,col 9)-(line 2369,col 22)",
        "(line 2370,col 9)-(line 2384,col 9)",
        "(line 2386,col 9)-(line 2399,col 9)",
        "(line 2401,col 9)-(line 2401,col 22)",
        "(line 2402,col 9)-(line 2406,col 9)",
        "(line 2408,col 9)-(line 2410,col 9)",
        "(line 2412,col 9)-(line 2412,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double)",
      "begin_line": 2420,
      "end_line": 2422,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2421,col 9)-(line 2421,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2430,
      "end_line": 2569,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2431,col 9)-(line 2431,col 31)",
        "(line 2432,col 9)-(line 2432,col 16)",
        "(line 2434,col 9)-(line 2436,col 9)",
        "(line 2438,col 9)-(line 2443,col 9)",
        "(line 2445,col 9)-(line 2447,col 9)",
        "(line 2450,col 9)-(line 2455,col 9)",
        "(line 2456,col 9)-(line 2456,col 48)",
        "(line 2457,col 9)-(line 2457,col 58)",
        "(line 2458,col 9)-(line 2458,col 42)",
        "(line 2460,col 9)-(line 2460,col 34)",
        "(line 2461,col 9)-(line 2461,col 37)",
        "(line 2462,col 9)-(line 2462,col 20)",
        "(line 2465,col 9)-(line 2465,col 33)",
        "(line 2466,col 9)-(line 2466,col 37)",
        "(line 2467,col 9)-(line 2467,col 33)",
        "(line 2468,col 9)-(line 2468,col 16)",
        "(line 2469,col 9)-(line 2469,col 17)",
        "(line 2472,col 9)-(line 2504,col 9)",
        "(line 2507,col 9)-(line 2507,col 18)",
        "(line 2508,col 9)-(line 2508,col 18)",
        "(line 2511,col 9)-(line 2511,col 41)",
        "(line 2522,col 9)-(line 2522,col 33)",
        "(line 2523,col 9)-(line 2523,col 47)",
        "(line 2524,col 9)-(line 2524,col 46)",
        "(line 2525,col 9)-(line 2525,col 46)",
        "(line 2526,col 9)-(line 2526,col 46)",
        "(line 2527,col 9)-(line 2527,col 47)",
        "(line 2528,col 9)-(line 2528,col 31)",
        "(line 2531,col 9)-(line 2531,col 18)",
        "(line 2533,col 9)-(line 2533,col 23)",
        "(line 2534,col 9)-(line 2534,col 31)",
        "(line 2535,col 9)-(line 2535,col 18)",
        "(line 2538,col 9)-(line 2538,col 40)",
        "(line 2541,col 9)-(line 2541,col 38)",
        "(line 2542,col 9)-(line 2542,col 46)",
        "(line 2543,col 9)-(line 2543,col 23)",
        "(line 2544,col 9)-(line 2544,col 32)",
        "(line 2545,col 9)-(line 2545,col 18)",
        "(line 2547,col 9)-(line 2547,col 32)",
        "(line 2548,col 9)-(line 2548,col 45)",
        "(line 2550,col 9)-(line 2561,col 9)",
        "(line 2564,col 9)-(line 2566,col 9)",
        "(line 2568,col 9)-(line 2568,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan2(double, double)",
      "begin_line": 2577,
      "end_line": 2692,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2578,col 9)-(line 2580,col 9)",
        "(line 2582,col 9)-(line 2604,col 9)",
        "(line 2608,col 9)-(line 2618,col 9)",
        "(line 2620,col 9)-(line 2630,col 9)",
        "(line 2632,col 9)-(line 2640,col 9)",
        "(line 2642,col 9)-(line 2651,col 9)",
        "(line 2655,col 9)-(line 2663,col 9)",
        "(line 2666,col 9)-(line 2666,col 31)",
        "(line 2667,col 9)-(line 2669,col 9)",
        "(line 2671,col 9)-(line 2671,col 38)",
        "(line 2672,col 9)-(line 2672,col 27)",
        "(line 2675,col 9)-(line 2675,col 44)",
        "(line 2676,col 9)-(line 2676,col 33)",
        "(line 2678,col 9)-(line 2678,col 62)",
        "(line 2680,col 9)-(line 2680,col 36)",
        "(line 2681,col 9)-(line 2681,col 31)",
        "(line 2682,col 9)-(line 2682,col 18)",
        "(line 2684,col 9)-(line 2686,col 9)",
        "(line 2689,col 9)-(line 2689,col 50)",
        "(line 2691,col 9)-(line 2691,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asin(double)",
      "begin_line": 2698,
      "end_line": 2768,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2699,col 7)-(line 2701,col 7)",
        "(line 2703,col 7)-(line 2705,col 7)",
        "(line 2707,col 7)-(line 2709,col 7)",
        "(line 2711,col 7)-(line 2713,col 7)",
        "(line 2715,col 7)-(line 2717,col 7)",
        "(line 2722,col 7)-(line 2722,col 37)",
        "(line 2723,col 7)-(line 2723,col 40)",
        "(line 2724,col 7)-(line 2724,col 31)",
        "(line 2727,col 7)-(line 2727,col 24)",
        "(line 2728,col 7)-(line 2728,col 36)",
        "(line 2731,col 7)-(line 2731,col 15)",
        "(line 2732,col 7)-(line 2732,col 15)",
        "(line 2734,col 7)-(line 2734,col 27)",
        "(line 2735,col 7)-(line 2735,col 35)",
        "(line 2737,col 7)-(line 2737,col 21)",
        "(line 2738,col 7)-(line 2738,col 30)",
        "(line 2739,col 7)-(line 2739,col 16)",
        "(line 2742,col 7)-(line 2742,col 15)",
        "(line 2743,col 7)-(line 2743,col 19)",
        "(line 2744,col 7)-(line 2744,col 30)",
        "(line 2745,col 7)-(line 2745,col 27)",
        "(line 2746,col 7)-(line 2746,col 18)",
        "(line 2749,col 7)-(line 2749,col 53)",
        "(line 2752,col 7)-(line 2752,col 31)",
        "(line 2755,col 7)-(line 2755,col 21)",
        "(line 2756,col 7)-(line 2756,col 30)",
        "(line 2757,col 7)-(line 2757,col 34)",
        "(line 2758,col 7)-(line 2758,col 25)",
        "(line 2760,col 7)-(line 2760,col 52)",
        "(line 2761,col 7)-(line 2761,col 28)",
        "(line 2763,col 7)-(line 2763,col 21)",
        "(line 2764,col 7)-(line 2764,col 29)",
        "(line 2765,col 7)-(line 2765,col 16)",
        "(line 2767,col 7)-(line 2767,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acos(double)",
      "begin_line": 2774,
      "end_line": 2850,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2775,col 7)-(line 2777,col 7)",
        "(line 2779,col 7)-(line 2781,col 7)",
        "(line 2783,col 7)-(line 2785,col 7)",
        "(line 2787,col 7)-(line 2789,col 7)",
        "(line 2791,col 7)-(line 2793,col 7)",
        "(line 2798,col 7)-(line 2798,col 37)",
        "(line 2799,col 7)-(line 2799,col 40)",
        "(line 2800,col 7)-(line 2800,col 31)",
        "(line 2803,col 7)-(line 2803,col 24)",
        "(line 2804,col 7)-(line 2804,col 36)",
        "(line 2807,col 7)-(line 2807,col 15)",
        "(line 2808,col 7)-(line 2808,col 15)",
        "(line 2810,col 7)-(line 2810,col 27)",
        "(line 2811,col 7)-(line 2811,col 35)",
        "(line 2813,col 7)-(line 2813,col 21)",
        "(line 2814,col 7)-(line 2814,col 30)",
        "(line 2815,col 7)-(line 2815,col 16)",
        "(line 2818,col 7)-(line 2818,col 26)",
        "(line 2819,col 7)-(line 2819,col 30)",
        "(line 2820,col 7)-(line 2820,col 27)",
        "(line 2821,col 7)-(line 2821,col 18)",
        "(line 2824,col 7)-(line 2824,col 53)",
        "(line 2827,col 7)-(line 2827,col 25)",
        "(line 2828,col 7)-(line 2828,col 16)",
        "(line 2829,col 7)-(line 2829,col 26)",
        "(line 2832,col 7)-(line 2832,col 21)",
        "(line 2835,col 7)-(line 2837,col 7)",
        "(line 2839,col 7)-(line 2839,col 36)",
        "(line 2840,col 7)-(line 2840,col 25)",
        "(line 2842,col 7)-(line 2842,col 52)",
        "(line 2843,col 7)-(line 2843,col 19)",
        "(line 2845,col 7)-(line 2845,col 21)",
        "(line 2846,col 7)-(line 2846,col 29)",
        "(line 2847,col 7)-(line 2847,col 16)",
        "(line 2849,col 7)-(line 2849,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cbrt(double)",
      "begin_line": 2856,
      "end_line": 2934,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2858,col 7)-(line 2858,col 47)",
        "(line 2859,col 7)-(line 2859,col 59)",
        "(line 2860,col 7)-(line 2860,col 32)",
        "(line 2862,col 7)-(line 2872,col 7)",
        "(line 2874,col 7)-(line 2877,col 7)",
        "(line 2880,col 7)-(line 2880,col 30)",
        "(line 2883,col 7)-(line 2884,col 81)",
        "(line 2887,col 7)-(line 2887,col 104)",
        "(line 2890,col 7)-(line 2890,col 41)",
        "(line 2891,col 7)-(line 2891,col 44)",
        "(line 2892,col 7)-(line 2892,col 45)",
        "(line 2893,col 7)-(line 2893,col 44)",
        "(line 2894,col 7)-(line 2894,col 44)",
        "(line 2896,col 7)-(line 2896,col 39)",
        "(line 2901,col 7)-(line 2901,col 39)",
        "(line 2902,col 7)-(line 2902,col 46)",
        "(line 2903,col 7)-(line 2903,col 46)",
        "(line 2906,col 7)-(line 2906,col 39)",
        "(line 2907,col 7)-(line 2907,col 36)",
        "(line 2908,col 7)-(line 2908,col 27)",
        "(line 2910,col 7)-(line 2910,col 26)",
        "(line 2911,col 7)-(line 2911,col 42)",
        "(line 2912,col 7)-(line 2912,col 31)",
        "(line 2913,col 7)-(line 2913,col 38)",
        "(line 2914,col 7)-(line 2914,col 23)",
        "(line 2915,col 7)-(line 2915,col 17)",
        "(line 2917,col 7)-(line 2917,col 39)",
        "(line 2918,col 7)-(line 2918,col 19)",
        "(line 2920,col 7)-(line 2920,col 26)",
        "(line 2921,col 7)-(line 2921,col 34)",
        "(line 2922,col 7)-(line 2922,col 15)",
        "(line 2924,col 7)-(line 2924,col 33)",
        "(line 2927,col 7)-(line 2927,col 16)",
        "(line 2929,col 7)-(line 2931,col 7)",
        "(line 2933,col 7)-(line 2933,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toRadians(double)",
      "begin_line": 2941,
      "end_line": 2959,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2943,col 9)-(line 2945,col 9)",
        "(line 2948,col 9)-(line 2948,col 49)",
        "(line 2949,col 9)-(line 2949,col 50)",
        "(line 2951,col 9)-(line 2951,col 38)",
        "(line 2952,col 9)-(line 2952,col 27)",
        "(line 2954,col 9)-(line 2954,col 74)",
        "(line 2955,col 9)-(line 2957,col 9)",
        "(line 2958,col 9)-(line 2958,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toDegrees(double)",
      "begin_line": 2966,
      "end_line": 2980,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2968,col 9)-(line 2970,col 9)",
        "(line 2973,col 9)-(line 2973,col 46)",
        "(line 2974,col 9)-(line 2974,col 50)",
        "(line 2976,col 9)-(line 2976,col 38)",
        "(line 2977,col 9)-(line 2977,col 27)",
        "(line 2979,col 9)-(line 2979,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(int)",
      "begin_line": 2987,
      "end_line": 2989,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2988,col 9)-(line 2988,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(long)",
      "begin_line": 2996,
      "end_line": 2998,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2997,col 9)-(line 2997,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(float)",
      "begin_line": 3005,
      "end_line": 3007,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3006,col 9)-(line 3006,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(double)",
      "begin_line": 3014,
      "end_line": 3016,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3015,col 9)-(line 3015,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(double)",
      "begin_line": 3023,
      "end_line": 3028,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3024,col 9)-(line 3026,col 9)",
        "(line 3027,col 9)-(line 3027,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(float)",
      "begin_line": 3035,
      "end_line": 3040,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3036,col 9)-(line 3038,col 9)",
        "(line 3039,col 9)-(line 3039,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(double, int)",
      "begin_line": 3048,
      "end_line": 3124,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3051,col 9)-(line 3053,col 9)",
        "(line 3056,col 9)-(line 3058,col 9)",
        "(line 3059,col 9)-(line 3061,col 9)",
        "(line 3062,col 9)-(line 3064,col 9)",
        "(line 3067,col 9)-(line 3067,col 53)",
        "(line 3068,col 9)-(line 3068,col 53)",
        "(line 3069,col 9)-(line 3069,col 56)",
        "(line 3070,col 9)-(line 3070,col 53)",
        "(line 3073,col 9)-(line 3073,col 42)",
        "(line 3075,col 9)-(line 3122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(float, int)",
      "begin_line": 3132,
      "end_line": 3208,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3135,col 9)-(line 3137,col 9)",
        "(line 3140,col 9)-(line 3142,col 9)",
        "(line 3143,col 9)-(line 3145,col 9)",
        "(line 3146,col 9)-(line 3148,col 9)",
        "(line 3151,col 9)-(line 3151,col 49)",
        "(line 3152,col 9)-(line 3152,col 43)",
        "(line 3153,col 9)-(line 3153,col 46)",
        "(line 3154,col 9)-(line 3154,col 43)",
        "(line 3157,col 9)-(line 3157,col 42)",
        "(line 3159,col 9)-(line 3206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(double, double)",
      "begin_line": 3241,
      "end_line": 3264,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3244,col 9)-(line 3252,col 9)",
        "(line 3256,col 9)-(line 3256,col 53)",
        "(line 3257,col 9)-(line 3257,col 53)",
        "(line 3258,col 9)-(line 3262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(float, double)",
      "begin_line": 3297,
      "end_line": 3320,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3300,col 9)-(line 3308,col 9)",
        "(line 3312,col 9)-(line 3312,col 49)",
        "(line 3313,col 9)-(line 3313,col 43)",
        "(line 3314,col 9)-(line 3318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.floor(double)",
      "begin_line": 3326,
      "end_line": 3347,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3327,col 9)-(line 3327,col 15)",
        "(line 3329,col 9)-(line 3331,col 9)",
        "(line 3333,col 9)-(line 3335,col 9)",
        "(line 3337,col 9)-(line 3337,col 21)",
        "(line 3338,col 9)-(line 3340,col 9)",
        "(line 3342,col 9)-(line 3344,col 9)",
        "(line 3346,col 9)-(line 3346,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ceil(double)",
      "begin_line": 3353,
      "end_line": 3372,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3354,col 9)-(line 3354,col 17)",
        "(line 3356,col 9)-(line 3358,col 9)",
        "(line 3360,col 9)-(line 3360,col 21)",
        "(line 3361,col 9)-(line 3363,col 9)",
        "(line 3365,col 9)-(line 3365,col 17)",
        "(line 3367,col 9)-(line 3369,col 9)",
        "(line 3371,col 9)-(line 3371,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.rint(double)",
      "begin_line": 3378,
      "end_line": 3395,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3379,col 9)-(line 3379,col 28)",
        "(line 3380,col 9)-(line 3380,col 25)",
        "(line 3382,col 9)-(line 3387,col 9)",
        "(line 3388,col 9)-(line 3390,col 9)",
        "(line 3393,col 9)-(line 3393,col 26)",
        "(line 3394,col 9)-(line 3394,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(double)",
      "begin_line": 3401,
      "end_line": 3403,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3402,col 9)-(line 3402,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(float)",
      "begin_line": 3409,
      "end_line": 3411,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3410,col 9)-(line 3410,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(int, int)",
      "begin_line": 3418,
      "end_line": 3420,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3419,col 9)-(line 3419,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(long, long)",
      "begin_line": 3427,
      "end_line": 3429,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3428,col 9)-(line 3428,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(float, float)",
      "begin_line": 3436,
      "end_line": 3454,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3437,col 9)-(line 3439,col 9)",
        "(line 3440,col 9)-(line 3442,col 9)",
        "(line 3444,col 9)-(line 3446,col 9)",
        "(line 3449,col 9)-(line 3449,col 46)",
        "(line 3450,col 9)-(line 3452,col 9)",
        "(line 3453,col 9)-(line 3453,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(double, double)",
      "begin_line": 3461,
      "end_line": 3479,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3462,col 9)-(line 3464,col 9)",
        "(line 3465,col 9)-(line 3467,col 9)",
        "(line 3469,col 9)-(line 3471,col 9)",
        "(line 3474,col 9)-(line 3474,col 50)",
        "(line 3475,col 9)-(line 3477,col 9)",
        "(line 3478,col 9)-(line 3478,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(int, int)",
      "begin_line": 3486,
      "end_line": 3488,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3487,col 9)-(line 3487,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(long, long)",
      "begin_line": 3495,
      "end_line": 3497,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3496,col 9)-(line 3496,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(float, float)",
      "begin_line": 3504,
      "end_line": 3522,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3505,col 9)-(line 3507,col 9)",
        "(line 3508,col 9)-(line 3510,col 9)",
        "(line 3512,col 9)-(line 3514,col 9)",
        "(line 3517,col 9)-(line 3517,col 46)",
        "(line 3518,col 9)-(line 3520,col 9)",
        "(line 3521,col 9)-(line 3521,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(double, double)",
      "begin_line": 3529,
      "end_line": 3547,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3530,col 9)-(line 3532,col 9)",
        "(line 3533,col 9)-(line 3535,col 9)",
        "(line 3537,col 9)-(line 3539,col 9)",
        "(line 3542,col 9)-(line 3542,col 50)",
        "(line 3543,col 9)-(line 3545,col 9)",
        "(line 3546,col 9)-(line 3546,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.hypot(double, double)",
      "begin_line": 3563,
      "end_line": 3596,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3564,col 9)-(line 3595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3618,
      "end_line": 3620,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3619,col 9)-(line 3619,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(double, double)",
      "begin_line": 3630,
      "end_line": 3637,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3631,col 9)-(line 3631,col 52)",
        "(line 3632,col 9)-(line 3632,col 47)",
        "(line 3633,col 9)-(line 3635,col 9)",
        "(line 3636,col 9)-(line 3636,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(float, float)",
      "begin_line": 3647,
      "end_line": 3654,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3648,col 9)-(line 3648,col 48)",
        "(line 3649,col 9)-(line 3649,col 43)",
        "(line 3650,col 9)-(line 3652,col 9)",
        "(line 3653,col 9)-(line 3653,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(double)",
      "begin_line": 3665,
      "end_line": 3667,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3666,col 9)-(line 3666,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(float)",
      "begin_line": 3678,
      "end_line": 3680,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3679,col 9)-(line 3679,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.main(java.lang.String[])",
      "begin_line": 3687,
      "end_line": 3700,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3688,col 9)-(line 3688,col 37)",
        "(line 3689,col 9)-(line 3689,col 104)",
        "(line 3690,col 9)-(line 3690,col 104)",
        "(line 3691,col 9)-(line 3691,col 108)",
        "(line 3692,col 9)-(line 3692,col 108)",
        "(line 3693,col 9)-(line 3693,col 76)",
        "(line 3694,col 9)-(line 3694,col 83)",
        "(line 3695,col 9)-(line 3695,col 83)",
        "(line 3696,col 9)-(line 3696,col 87)",
        "(line 3697,col 9)-(line 3697,col 87)",
        "(line 3698,col 9)-(line 3698,col 89)",
        "(line 3699,col 9)-(line 3699,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3703,
      "end_line": 3739,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3707,
      "end_line": 3707,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3711,
      "end_line": 3711,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3742,
      "end_line": 3772,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3747,
      "end_line": 3747,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3751,
      "end_line": 3751,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3775,
      "end_line": 3792,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3777,
      "end_line": 3777,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "class_interface",
      "name": "CodyWaite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3795,
      "end_line": 3864,
      "comment": " Enclose the Cody/Waite reduction (used in \"sin\", \"cos\" and \"tan\"). "
    },
    {
      "type": "field",
      "varNames": [
        "finalK"
      ],
      "begin_line": 3797,
      "end_line": 3797,
      "comment": " k "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemA"
      ],
      "begin_line": 3799,
      "end_line": 3799,
      "comment": " remA "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemB"
      ],
      "begin_line": 3801,
      "end_line": 3801,
      "comment": " remB "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.CodyWaite(double, double)",
      "begin_line": 3807,
      "end_line": 3844,
      "comment": "\n         * @param xa Argument.\n         * @param xb Argument.\n         ",
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