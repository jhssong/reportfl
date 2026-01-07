{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 3810,
      "comment": "\n * Faster, more accurate, portable alternative to {@link Math} and\n * {@link StrictMath} for large scale computation.\n * \u003cp\u003e\n * FastMath is a drop-in replacement for both Math and StrictMath. This\n * means that for any method in Math (say {@code Math.sin(x)} or\n * {@code Math.cbrt(y)}), user can directly change the class and use the\n * methods as is (using {@code FastMath.sin(x)} or {@code FastMath.cbrt(y)}\n * in the previous example).\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath speed is achieved by relying heavily on optimizing compilers\n * to native code present in many JVMs today and use of large tables.\n * The larger tables are lazily initialised on first use, so that the setup\n * time does not penalise methods that don\u0027t need them.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note that FastMath is\n * extensively used inside Apache Commons Math, so by calling some algorithms,\n * the overhead when the the tables need to be intialised will occur\n * regardless of the end-user calling FastMath methods directly or not.\n * Performance figures for a specific JVM and hardware can be evaluated by\n * running the FastMathTestPerformance tests in the test directory of the source\n * distribution.\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath accuracy should be mostly independent of the JVM as it relies only\n * on IEEE-754 basic operations and on embedded tables. Almost all operations\n * are accurate to about 0.5 ulp throughout the domain range. This statement,\n * of course is only a rough global observed behavior, it is \u003cem\u003enot\u003c/em\u003e a\n * guarantee for \u003cem\u003eevery\u003c/em\u003e double numbers input (see William Kahan\u0027s \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Rounding#The_table-maker.27s_dilemma\"\u003eTable\n * Maker\u0027s Dilemma\u003c/a\u003e).\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath additionally implements the following methods not found in Math/StrictMath:\n * \u003cul\u003e\n * \u003cli\u003e{@link #asinh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #acosh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #atanh(double)}\u003c/li\u003e\n * \u003c/ul\u003e\n * The following methods are found in Math/StrictMath since 1.6 only, they are provided\n * by FastMath even in 1.5 Java virtual machines\n * \u003cul\u003e\n * \u003cli\u003e{@link #copySign(double, double)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(double,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(double, int)}\u003c/li\u003e\n * \u003cli\u003e{@link #copySign(float, float)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(float,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(float, int)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "PI"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Archimede\u0027s constant PI, ratio of circle circumference to diameter. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Napier\u0027s constant e, base of the natural logarithm. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_MAX_INDEX"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Index of exp(0) in the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_LEN"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Length of the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT_LEN"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Logarithm table length. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_LEN"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " 0, 1/1024, ... 1024/1024"
    },
    {
      "type": "field",
      "varNames": [
        "RECOMPUTE_TABLES_AT_RUNTIME"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Indicator for tables initialization.\n     * \u003cp\u003e\n     * This compile-time constant should be set to true only if one explicitly\n     * wants to compute the tables at class loading time instead of using the\n     * already computed ones provided as literal arrays below.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_RESOURCES"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Indicator for loading big tables from \"resource\" files. "
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
      "begin_line": 314,
      "end_line": 314,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_5"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_7"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_9"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_11"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_13"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_15"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_17"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_3_4"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_15_16"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_13_14"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_11_12"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_9_10"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_7_8"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_5_6"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_2"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_4"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.FastMath.FastMath()",
      "begin_line": 351,
      "end_line": 351,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.doubleHighPart(double)",
      "begin_line": 362,
      "end_line": 369,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 45)",
        "(line 367,col 9)-(line 367,col 30)",
        "(line 368,col 9)-(line 368,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sqrt(double)",
      "begin_line": 376,
      "end_line": 378,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosh(double)",
      "begin_line": 384,
      "end_line": 437,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 385,col 7)-(line 387,col 7)",
        "(line 394,col 7)-(line 396,col 7)",
        "(line 398,col 7)-(line 400,col 7)",
        "(line 402,col 7)-(line 402,col 38)",
        "(line 403,col 7)-(line 405,col 7)",
        "(line 406,col 7)-(line 406,col 26)",
        "(line 408,col 7)-(line 408,col 40)",
        "(line 409,col 7)-(line 409,col 48)",
        "(line 411,col 7)-(line 411,col 38)",
        "(line 412,col 7)-(line 412,col 36)",
        "(line 413,col 7)-(line 413,col 28)",
        "(line 416,col 7)-(line 416,col 28)",
        "(line 417,col 7)-(line 417,col 34)",
        "(line 418,col 7)-(line 418,col 42)",
        "(line 419,col 7)-(line 419,col 37)",
        "(line 422,col 7)-(line 422,col 82)",
        "(line 424,col 7)-(line 424,col 36)",
        "(line 427,col 7)-(line 427,col 25)",
        "(line 428,col 7)-(line 428,col 34)",
        "(line 429,col 7)-(line 429,col 16)",
        "(line 430,col 7)-(line 430,col 25)",
        "(line 431,col 7)-(line 431,col 34)",
        "(line 432,col 7)-(line 432,col 16)",
        "(line 434,col 7)-(line 434,col 30)",
        "(line 435,col 7)-(line 435,col 20)",
        "(line 436,col 7)-(line 436,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinh(double)",
      "begin_line": 443,
      "end_line": 552,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 444,col 7)-(line 444,col 29)",
        "(line 445,col 7)-(line 447,col 7)",
        "(line 454,col 7)-(line 456,col 7)",
        "(line 458,col 7)-(line 460,col 7)",
        "(line 462,col 7)-(line 464,col 7)",
        "(line 466,col 7)-(line 469,col 7)",
        "(line 471,col 7)-(line 471,col 20)",
        "(line 473,col 7)-(line 545,col 7)",
        "(line 547,col 7)-(line 549,col 7)",
        "(line 551,col 7)-(line 551,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanh(double)",
      "begin_line": 558,
      "end_line": 676,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 559,col 7)-(line 559,col 29)",
        "(line 561,col 7)-(line 563,col 7)",
        "(line 571,col 7)-(line 573,col 7)",
        "(line 575,col 7)-(line 577,col 7)",
        "(line 579,col 7)-(line 581,col 7)",
        "(line 583,col 7)-(line 586,col 7)",
        "(line 588,col 7)-(line 588,col 20)",
        "(line 589,col 7)-(line 669,col 7)",
        "(line 671,col 7)-(line 673,col 7)",
        "(line 675,col 7)-(line 675,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acosh(double)",
      "begin_line": 682,
      "end_line": 684,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asinh(double)",
      "begin_line": 690,
      "end_line": 714,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 33)",
        "(line 692,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 697,col 24)",
        "(line 698,col 9)-(line 711,col 9)",
        "(line 713,col 9)-(line 713,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atanh(double)",
      "begin_line": 720,
      "end_line": 744,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 33)",
        "(line 722,col 9)-(line 725,col 9)",
        "(line 727,col 9)-(line 727,col 24)",
        "(line 728,col 9)-(line 741,col 9)",
        "(line 743,col 9)-(line 743,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(double)",
      "begin_line": 751,
      "end_line": 753,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(float)",
      "begin_line": 760,
      "end_line": 762,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(double)",
      "begin_line": 768,
      "end_line": 770,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(float)",
      "begin_line": 776,
      "end_line": 778,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.random()",
      "begin_line": 784,
      "end_line": 786,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double)",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double, double, double[])",
      "begin_line": 819,
      "end_line": 934,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 24)",
        "(line 821,col 9)-(line 821,col 24)",
        "(line 822,col 9)-(line 822,col 19)",
        "(line 828,col 9)-(line 878,col 9)",
        "(line 884,col 9)-(line 884,col 58)",
        "(line 885,col 9)-(line 885,col 72)",
        "(line 886,col 9)-(line 886,col 72)",
        "(line 892,col 9)-(line 892,col 63)",
        "(line 901,col 9)-(line 901,col 39)",
        "(line 902,col 9)-(line 902,col 45)",
        "(line 903,col 9)-(line 903,col 45)",
        "(line 904,col 9)-(line 904,col 30)",
        "(line 905,col 9)-(line 905,col 49)",
        "(line 912,col 9)-(line 912,col 44)",
        "(line 913,col 9)-(line 913,col 90)",
        "(line 919,col 9)-(line 919,col 43)",
        "(line 920,col 9)-(line 920,col 28)",
        "(line 921,col 9)-(line 925,col 9)",
        "(line 927,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 933,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double)",
      "begin_line": 940,
      "end_line": 942,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 941,col 7)-(line 941,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double, double[])",
      "begin_line": 949,
      "end_line": 1089,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 952,col 9)",
        "(line 954,col 9)-(line 967,col 9)",
        "(line 969,col 9)-(line 969,col 21)",
        "(line 970,col 9)-(line 970,col 21)",
        "(line 971,col 9)-(line 971,col 23)",
        "(line 972,col 9)-(line 972,col 33)",
        "(line 974,col 9)-(line 977,col 9)",
        "(line 979,col 9)-(line 993,col 9)",
        "(line 997,col 9)-(line 997,col 41)",
        "(line 998,col 9)-(line 998,col 49)",
        "(line 999,col 9)-(line 999,col 48)",
        "(line 1000,col 9)-(line 1000,col 48)",
        "(line 1001,col 9)-(line 1001,col 26)",
        "(line 1002,col 9)-(line 1002,col 26)",
        "(line 1004,col 9)-(line 1004,col 28)",
        "(line 1005,col 9)-(line 1005,col 30)",
        "(line 1006,col 9)-(line 1006,col 31)",
        "(line 1007,col 9)-(line 1007,col 18)",
        "(line 1009,col 9)-(line 1009,col 33)",
        "(line 1010,col 9)-(line 1010,col 32)",
        "(line 1011,col 9)-(line 1011,col 24)",
        "(line 1012,col 9)-(line 1012,col 18)",
        "(line 1015,col 9)-(line 1015,col 31)",
        "(line 1017,col 9)-(line 1017,col 31)",
        "(line 1018,col 9)-(line 1018,col 46)",
        "(line 1019,col 9)-(line 1019,col 18)",
        "(line 1021,col 9)-(line 1021,col 31)",
        "(line 1022,col 9)-(line 1022,col 40)",
        "(line 1023,col 9)-(line 1023,col 18)",
        "(line 1025,col 9)-(line 1025,col 31)",
        "(line 1026,col 9)-(line 1026,col 38)",
        "(line 1027,col 9)-(line 1027,col 18)",
        "(line 1031,col 9)-(line 1031,col 26)",
        "(line 1032,col 9)-(line 1032,col 35)",
        "(line 1033,col 9)-(line 1033,col 18)",
        "(line 1035,col 9)-(line 1035,col 23)",
        "(line 1037,col 9)-(line 1037,col 32)",
        "(line 1038,col 9)-(line 1038,col 18)",
        "(line 1040,col 9)-(line 1040,col 26)",
        "(line 1042,col 9)-(line 1042,col 35)",
        "(line 1043,col 9)-(line 1043,col 18)",
        "(line 1045,col 9)-(line 1045,col 23)",
        "(line 1047,col 9)-(line 1047,col 32)",
        "(line 1048,col 9)-(line 1048,col 18)",
        "(line 1050,col 9)-(line 1081,col 9)",
        "(line 1083,col 9)-(line 1086,col 9)",
        "(line 1088,col 9)-(line 1088,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double)",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double[])",
      "begin_line": 1107,
      "end_line": 1327,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 47)",
        "(line 1114,col 9)-(line 1122,col 9)",
        "(line 1125,col 9)-(line 1131,col 9)",
        "(line 1134,col 9)-(line 1134,col 41)",
        "(line 1136,col 9)-(line 1153,col 9)",
        "(line 1156,col 9)-(line 1201,col 9)",
        "(line 1204,col 9)-(line 1204,col 81)",
        "(line 1215,col 9)-(line 1215,col 97)",
        "(line 1217,col 9)-(line 1217,col 26)",
        "(line 1218,col 9)-(line 1218,col 26)",
        "(line 1220,col 9)-(line 1278,col 9)",
        "(line 1294,col 9)-(line 1294,col 30)",
        "(line 1295,col 9)-(line 1295,col 23)",
        "(line 1296,col 9)-(line 1296,col 28)",
        "(line 1297,col 9)-(line 1297,col 33)",
        "(line 1298,col 9)-(line 1298,col 14)",
        "(line 1299,col 9)-(line 1299,col 18)",
        "(line 1301,col 9)-(line 1301,col 21)",
        "(line 1302,col 9)-(line 1302,col 28)",
        "(line 1303,col 9)-(line 1303,col 14)",
        "(line 1304,col 9)-(line 1304,col 18)",
        "(line 1306,col 9)-(line 1306,col 27)",
        "(line 1307,col 9)-(line 1307,col 34)",
        "(line 1308,col 9)-(line 1308,col 14)",
        "(line 1309,col 9)-(line 1309,col 18)",
        "(line 1311,col 9)-(line 1311,col 23)",
        "(line 1312,col 9)-(line 1312,col 30)",
        "(line 1313,col 9)-(line 1313,col 14)",
        "(line 1314,col 9)-(line 1314,col 18)",
        "(line 1316,col 9)-(line 1316,col 21)",
        "(line 1317,col 9)-(line 1317,col 28)",
        "(line 1318,col 9)-(line 1318,col 14)",
        "(line 1319,col 9)-(line 1319,col 18)",
        "(line 1321,col 9)-(line 1324,col 9)",
        "(line 1326,col 9)-(line 1326,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log1p(double)",
      "begin_line": 1333,
      "end_line": 1370,
      "comment": " Compute log(1 + x).\n     * @param x a number\n     * @return log(1 + x)\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1337,col 9)",
        "(line 1339,col 9)-(line 1341,col 9)",
        "(line 1343,col 9)-(line 1362,col 9)",
        "(line 1365,col 9)-(line 1365,col 37)",
        "(line 1366,col 9)-(line 1366,col 24)",
        "(line 1367,col 9)-(line 1367,col 18)",
        "(line 1369,col 9)-(line 1369,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log10(double)",
      "begin_line": 1376,
      "end_line": 1392,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1377,col 9)-(line 1377,col 46)",
        "(line 1379,col 9)-(line 1379,col 44)",
        "(line 1380,col 9)-(line 1382,col 9)",
        "(line 1384,col 9)-(line 1384,col 52)",
        "(line 1385,col 9)-(line 1385,col 49)",
        "(line 1386,col 9)-(line 1386,col 55)",
        "(line 1388,col 9)-(line 1388,col 49)",
        "(line 1389,col 9)-(line 1389,col 52)",
        "(line 1391,col 9)-(line 1391,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double)",
      "begin_line": 1410,
      "end_line": 1412,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003e\n     * logarithm\u003c/a\u003e in a given base.\n     *\n     * Returns {@code NaN} if either argument is negative.\n     * If {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.\n     * If both arguments are 0, the result is {@code NaN}.\n     *\n     * @param base Base of the logarithm, must be greater than 0.\n     * @param x Argument, must be greater than 0.\n     * @return the value of the logarithm, i.e. the number {@code y} such that\n     * \u003ccode\u003ebase\u003csup\u003ey\u003c/sup\u003e \u003d x\u003c/code\u003e.\n     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.pow(double, double)",
      "begin_line": 1421,
      "end_line": 1579,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1422,col 9)-(line 1422,col 43)",
        "(line 1424,col 9)-(line 1426,col 9)",
        "(line 1428,col 9)-(line 1430,col 9)",
        "(line 1433,col 9)-(line 1456,col 9)",
        "(line 1458,col 9)-(line 1467,col 9)",
        "(line 1469,col 9)-(line 1479,col 9)",
        "(line 1481,col 9)-(line 1503,col 9)",
        "(line 1505,col 9)-(line 1516,col 9)",
        "(line 1519,col 9)-(line 1531,col 9)",
        "(line 1534,col 9)-(line 1534,col 18)",
        "(line 1535,col 9)-(line 1535,col 18)",
        "(line 1536,col 9)-(line 1545,col 9)",
        "(line 1548,col 9)-(line 1548,col 41)",
        "(line 1549,col 9)-(line 1551,col 9)",
        "(line 1553,col 9)-(line 1553,col 28)",
        "(line 1554,col 9)-(line 1554,col 28)",
        "(line 1557,col 9)-(line 1557,col 41)",
        "(line 1558,col 9)-(line 1558,col 40)",
        "(line 1559,col 9)-(line 1559,col 26)",
        "(line 1560,col 9)-(line 1560,col 19)",
        "(line 1563,col 9)-(line 1563,col 35)",
        "(line 1564,col 9)-(line 1564,col 57)",
        "(line 1566,col 9)-(line 1566,col 20)",
        "(line 1567,col 9)-(line 1567,col 31)",
        "(line 1569,col 9)-(line 1569,col 31)",
        "(line 1570,col 9)-(line 1570,col 35)",
        "(line 1571,col 9)-(line 1571,col 34)",
        "(line 1572,col 9)-(line 1572,col 26)",
        "(line 1573,col 9)-(line 1573,col 26)",
        "(line 1574,col 9)-(line 1574,col 20)",
        "(line 1576,col 9)-(line 1576,col 48)",
        "(line 1578,col 9)-(line 1578,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polySine(double)",
      "begin_line": 1588,
      "end_line": 1601,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1590,col 9)-(line 1590,col 24)",
        "(line 1592,col 9)-(line 1592,col 41)",
        "(line 1593,col 9)-(line 1593,col 44)",
        "(line 1594,col 9)-(line 1594,col 42)",
        "(line 1595,col 9)-(line 1595,col 42)",
        "(line 1598,col 9)-(line 1598,col 23)",
        "(line 1600,col 9)-(line 1600,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polyCosine(double)",
      "begin_line": 1609,
      "end_line": 1619,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1610,col 9)-(line 1610,col 24)",
        "(line 1612,col 9)-(line 1612,col 40)",
        "(line 1613,col 9)-(line 1613,col 44)",
        "(line 1614,col 9)-(line 1614,col 42)",
        "(line 1615,col 9)-(line 1615,col 42)",
        "(line 1616,col 9)-(line 1616,col 16)",
        "(line 1618,col 9)-(line 1618,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinQ(double, double)",
      "begin_line": 1628,
      "end_line": 1743,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 43)",
        "(line 1630,col 9)-(line 1630,col 49)",
        "(line 1633,col 9)-(line 1633,col 47)",
        "(line 1634,col 9)-(line 1634,col 47)",
        "(line 1635,col 9)-(line 1635,col 49)",
        "(line 1636,col 9)-(line 1636,col 49)",
        "(line 1639,col 9)-(line 1639,col 33)",
        "(line 1640,col 9)-(line 1640,col 43)",
        "(line 1641,col 9)-(line 1641,col 35)",
        "(line 1642,col 9)-(line 1642,col 51)",
        "(line 1645,col 9)-(line 1645,col 51)",
        "(line 1646,col 9)-(line 1646,col 47)",
        "(line 1647,col 9)-(line 1647,col 36)",
        "(line 1648,col 9)-(line 1648,col 24)",
        "(line 1651,col 9)-(line 1651,col 22)",
        "(line 1674,col 9)-(line 1674,col 21)",
        "(line 1675,col 9)-(line 1675,col 21)",
        "(line 1677,col 9)-(line 1677,col 25)",
        "(line 1678,col 9)-(line 1678,col 25)",
        "(line 1679,col 9)-(line 1679,col 32)",
        "(line 1680,col 9)-(line 1680,col 14)",
        "(line 1681,col 9)-(line 1681,col 18)",
        "(line 1683,col 9)-(line 1683,col 28)",
        "(line 1684,col 9)-(line 1684,col 18)",
        "(line 1685,col 9)-(line 1685,col 25)",
        "(line 1686,col 9)-(line 1686,col 14)",
        "(line 1687,col 9)-(line 1687,col 18)",
        "(line 1689,col 9)-(line 1689,col 50)",
        "(line 1704,col 9)-(line 1704,col 76)",
        "(line 1731,col 9)-(line 1738,col 9)",
        "(line 1740,col 9)-(line 1740,col 23)",
        "(line 1742,col 9)-(line 1742,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosQ(double, double)",
      "begin_line": 1752,
      "end_line": 1761,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1753,col 9)-(line 1753,col 47)",
        "(line 1754,col 9)-(line 1754,col 50)",
        "(line 1756,col 9)-(line 1756,col 35)",
        "(line 1757,col 9)-(line 1757,col 36)",
        "(line 1758,col 9)-(line 1758,col 23)",
        "(line 1760,col 9)-(line 1760,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1771,
      "end_line": 1906,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1773,col 9)-(line 1773,col 43)",
        "(line 1774,col 9)-(line 1774,col 49)",
        "(line 1777,col 9)-(line 1777,col 47)",
        "(line 1778,col 9)-(line 1778,col 47)",
        "(line 1779,col 9)-(line 1779,col 49)",
        "(line 1780,col 9)-(line 1780,col 49)",
        "(line 1783,col 9)-(line 1783,col 33)",
        "(line 1784,col 9)-(line 1784,col 43)",
        "(line 1785,col 9)-(line 1785,col 35)",
        "(line 1786,col 9)-(line 1786,col 51)",
        "(line 1789,col 9)-(line 1789,col 45)",
        "(line 1790,col 9)-(line 1790,col 47)",
        "(line 1791,col 9)-(line 1791,col 36)",
        "(line 1792,col 9)-(line 1792,col 24)",
        "(line 1817,col 9)-(line 1817,col 21)",
        "(line 1818,col 9)-(line 1818,col 21)",
        "(line 1821,col 9)-(line 1821,col 25)",
        "(line 1822,col 9)-(line 1822,col 25)",
        "(line 1823,col 9)-(line 1823,col 32)",
        "(line 1824,col 9)-(line 1824,col 14)",
        "(line 1825,col 9)-(line 1825,col 18)",
        "(line 1827,col 9)-(line 1827,col 26)",
        "(line 1828,col 9)-(line 1828,col 18)",
        "(line 1829,col 9)-(line 1829,col 25)",
        "(line 1830,col 9)-(line 1830,col 14)",
        "(line 1831,col 9)-(line 1831,col 18)",
        "(line 1833,col 9)-(line 1833,col 46)",
        "(line 1834,col 9)-(line 1834,col 70)",
        "(line 1836,col 9)-(line 1836,col 28)",
        "(line 1837,col 9)-(line 1837,col 38)",
        "(line 1841,col 9)-(line 1841,col 28)",
        "(line 1843,col 9)-(line 1843,col 26)",
        "(line 1844,col 9)-(line 1844,col 18)",
        "(line 1845,col 9)-(line 1845,col 25)",
        "(line 1846,col 9)-(line 1846,col 14)",
        "(line 1847,col 9)-(line 1847,col 18)",
        "(line 1849,col 9)-(line 1849,col 27)",
        "(line 1850,col 9)-(line 1850,col 18)",
        "(line 1851,col 9)-(line 1851,col 25)",
        "(line 1852,col 9)-(line 1852,col 14)",
        "(line 1853,col 9)-(line 1853,col 18)",
        "(line 1855,col 9)-(line 1855,col 62)",
        "(line 1856,col 9)-(line 1856,col 64)",
        "(line 1858,col 9)-(line 1858,col 28)",
        "(line 1859,col 9)-(line 1859,col 38)",
        "(line 1861,col 9)-(line 1865,col 9)",
        "(line 1878,col 9)-(line 1878,col 31)",
        "(line 1881,col 9)-(line 1881,col 34)",
        "(line 1882,col 9)-(line 1882,col 42)",
        "(line 1883,col 9)-(line 1883,col 34)",
        "(line 1885,col 9)-(line 1885,col 35)",
        "(line 1886,col 9)-(line 1886,col 44)",
        "(line 1887,col 9)-(line 1887,col 37)",
        "(line 1890,col 9)-(line 1890,col 85)",
        "(line 1891,col 9)-(line 1891,col 25)",
        "(line 1892,col 9)-(line 1892,col 42)",
        "(line 1894,col 9)-(line 1903,col 9)",
        "(line 1905,col 9)-(line 1905,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 1919,
      "end_line": 2129,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1922,col 9)-(line 1922,col 49)",
        "(line 1923,col 9)-(line 1923,col 61)",
        "(line 1926,col 9)-(line 1926,col 38)",
        "(line 1927,col 9)-(line 1927,col 38)",
        "(line 1930,col 9)-(line 1930,col 19)",
        "(line 1931,col 9)-(line 1931,col 22)",
        "(line 1934,col 9)-(line 1934,col 19)",
        "(line 1935,col 9)-(line 1935,col 19)",
        "(line 1936,col 9)-(line 1936,col 19)",
        "(line 1937,col 9)-(line 1937,col 32)",
        "(line 1938,col 9)-(line 1938,col 42)",
        "(line 1940,col 9)-(line 1949,col 9)",
        "(line 1952,col 9)-(line 1952,col 31)",
        "(line 1953,col 9)-(line 1953,col 38)",
        "(line 1955,col 9)-(line 1955,col 30)",
        "(line 1956,col 9)-(line 1956,col 37)",
        "(line 1958,col 9)-(line 1958,col 24)",
        "(line 1959,col 9)-(line 1959,col 24)",
        "(line 1960,col 9)-(line 1960,col 24)",
        "(line 1961,col 9)-(line 1961,col 24)",
        "(line 1963,col 9)-(line 1963,col 37)",
        "(line 1964,col 9)-(line 1964,col 38)",
        "(line 1966,col 9)-(line 1966,col 55)",
        "(line 1967,col 9)-(line 1967,col 48)",
        "(line 1968,col 9)-(line 1968,col 60)",
        "(line 1971,col 9)-(line 1974,col 9)",
        "(line 1976,col 9)-(line 1976,col 50)",
        "(line 1977,col 9)-(line 1977,col 40)",
        "(line 1979,col 9)-(line 1979,col 35)",
        "(line 1980,col 9)-(line 1980,col 36)",
        "(line 1982,col 9)-(line 1982,col 52)",
        "(line 1985,col 9)-(line 1988,col 9)",
        "(line 1991,col 9)-(line 1991,col 25)",
        "(line 1992,col 9)-(line 1992,col 32)",
        "(line 1993,col 9)-(line 1993,col 19)",
        "(line 1994,col 9)-(line 1994,col 19)",
        "(line 1995,col 9)-(line 1995,col 19)",
        "(line 1998,col 9)-(line 1998,col 37)",
        "(line 2000,col 9)-(line 2000,col 50)",
        "(line 2001,col 9)-(line 2001,col 48)",
        "(line 2002,col 9)-(line 2002,col 20)",
        "(line 2003,col 9)-(line 2003,col 52)",
        "(line 2005,col 9)-(line 2008,col 9)",
        "(line 2011,col 9)-(line 2011,col 25)",
        "(line 2012,col 9)-(line 2012,col 32)",
        "(line 2014,col 9)-(line 2014,col 19)",
        "(line 2015,col 9)-(line 2015,col 19)",
        "(line 2016,col 9)-(line 2016,col 19)",
        "(line 2018,col 9)-(line 2018,col 40)",
        "(line 2030,col 9)-(line 2030,col 42)",
        "(line 2033,col 9)-(line 2033,col 20)",
        "(line 2034,col 9)-(line 2034,col 30)",
        "(line 2035,col 9)-(line 2035,col 20)",
        "(line 2038,col 9)-(line 2038,col 25)",
        "(line 2039,col 9)-(line 2039,col 32)",
        "(line 2041,col 9)-(line 2041,col 34)",
        "(line 2042,col 9)-(line 2042,col 41)",
        "(line 2044,col 9)-(line 2044,col 19)",
        "(line 2045,col 9)-(line 2045,col 19)",
        "(line 2046,col 9)-(line 2046,col 19)",
        "(line 2047,col 9)-(line 2047,col 19)",
        "(line 2049,col 9)-(line 2049,col 38)",
        "(line 2050,col 9)-(line 2050,col 39)",
        "(line 2052,col 9)-(line 2052,col 47)",
        "(line 2053,col 9)-(line 2053,col 40)",
        "(line 2054,col 9)-(line 2054,col 53)",
        "(line 2057,col 9)-(line 2060,col 9)",
        "(line 2062,col 9)-(line 2062,col 51)",
        "(line 2063,col 9)-(line 2063,col 40)",
        "(line 2065,col 9)-(line 2065,col 37)",
        "(line 2066,col 9)-(line 2066,col 38)",
        "(line 2068,col 9)-(line 2068,col 53)",
        "(line 2071,col 9)-(line 2074,col 9)",
        "(line 2077,col 9)-(line 2077,col 34)",
        "(line 2078,col 9)-(line 2078,col 41)",
        "(line 2079,col 9)-(line 2079,col 19)",
        "(line 2080,col 9)-(line 2080,col 19)",
        "(line 2081,col 9)-(line 2081,col 19)",
        "(line 2084,col 9)-(line 2084,col 37)",
        "(line 2086,col 9)-(line 2086,col 51)",
        "(line 2087,col 9)-(line 2087,col 48)",
        "(line 2088,col 9)-(line 2088,col 21)",
        "(line 2089,col 9)-(line 2089,col 53)",
        "(line 2091,col 9)-(line 2094,col 9)",
        "(line 2097,col 9)-(line 2097,col 25)",
        "(line 2098,col 9)-(line 2098,col 32)",
        "(line 2099,col 9)-(line 2099,col 34)",
        "(line 2100,col 9)-(line 2100,col 41)",
        "(line 2101,col 9)-(line 2101,col 19)",
        "(line 2102,col 9)-(line 2102,col 19)",
        "(line 2103,col 9)-(line 2103,col 19)",
        "(line 2106,col 9)-(line 2106,col 37)",
        "(line 2108,col 9)-(line 2108,col 51)",
        "(line 2109,col 9)-(line 2109,col 48)",
        "(line 2110,col 9)-(line 2110,col 21)",
        "(line 2111,col 9)-(line 2111,col 53)",
        "(line 2113,col 9)-(line 2116,col 9)",
        "(line 2119,col 9)-(line 2119,col 53)",
        "(line 2120,col 9)-(line 2120,col 98)",
        "(line 2122,col 9)-(line 2122,col 34)",
        "(line 2123,col 9)-(line 2123,col 44)",
        "(line 2126,col 9)-(line 2126,col 28)",
        "(line 2127,col 9)-(line 2127,col 31)",
        "(line 2128,col 9)-(line 2128,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sin(double)",
      "begin_line": 2136,
      "end_line": 2227,
      "comment": "\n     *  Sine function.\n     *  @param x a number\n     *  @return sin(x)\n     ",
      "child_ranges": [
        "(line 2137,col 9)-(line 2137,col 33)",
        "(line 2138,col 9)-(line 2138,col 25)",
        "(line 2139,col 9)-(line 2139,col 18)",
        "(line 2140,col 9)-(line 2140,col 24)",
        "(line 2143,col 9)-(line 2143,col 15)",
        "(line 2144,col 9)-(line 2147,col 9)",
        "(line 2150,col 9)-(line 2156,col 9)",
        "(line 2158,col 9)-(line 2160,col 9)",
        "(line 2163,col 9)-(line 2209,col 9)",
        "(line 2211,col 9)-(line 2213,col 9)",
        "(line 2215,col 9)-(line 2226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cos(double)",
      "begin_line": 2234,
      "end_line": 2312,
      "comment": "\n     *  Cosine function\n     *  @param x a number\n     *  @return cos(x)\n     ",
      "child_ranges": [
        "(line 2235,col 9)-(line 2235,col 25)",
        "(line 2238,col 9)-(line 2238,col 22)",
        "(line 2239,col 9)-(line 2241,col 9)",
        "(line 2243,col 9)-(line 2245,col 9)",
        "(line 2248,col 9)-(line 2248,col 22)",
        "(line 2249,col 9)-(line 2295,col 9)",
        "(line 2300,col 9)-(line 2311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tan(double)",
      "begin_line": 2319,
      "end_line": 2420,
      "comment": "\n     *   Tangent function\n     *  @param x a number\n     *  @return tan(x)\n     ",
      "child_ranges": [
        "(line 2320,col 9)-(line 2320,col 33)",
        "(line 2321,col 9)-(line 2321,col 25)",
        "(line 2324,col 9)-(line 2324,col 22)",
        "(line 2325,col 9)-(line 2328,col 9)",
        "(line 2331,col 9)-(line 2337,col 9)",
        "(line 2339,col 9)-(line 2341,col 9)",
        "(line 2344,col 9)-(line 2344,col 22)",
        "(line 2345,col 9)-(line 2391,col 9)",
        "(line 2393,col 9)-(line 2406,col 9)",
        "(line 2408,col 9)-(line 2408,col 22)",
        "(line 2409,col 9)-(line 2413,col 9)",
        "(line 2415,col 9)-(line 2417,col 9)",
        "(line 2419,col 9)-(line 2419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double)",
      "begin_line": 2427,
      "end_line": 2429,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2428,col 9)-(line 2428,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2437,
      "end_line": 2576,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2438,col 9)-(line 2438,col 31)",
        "(line 2439,col 9)-(line 2439,col 16)",
        "(line 2441,col 9)-(line 2443,col 9)",
        "(line 2445,col 9)-(line 2450,col 9)",
        "(line 2452,col 9)-(line 2454,col 9)",
        "(line 2457,col 9)-(line 2462,col 9)",
        "(line 2463,col 9)-(line 2463,col 48)",
        "(line 2464,col 9)-(line 2464,col 58)",
        "(line 2465,col 9)-(line 2465,col 42)",
        "(line 2467,col 9)-(line 2467,col 34)",
        "(line 2468,col 9)-(line 2468,col 37)",
        "(line 2469,col 9)-(line 2469,col 20)",
        "(line 2472,col 9)-(line 2472,col 33)",
        "(line 2473,col 9)-(line 2473,col 37)",
        "(line 2474,col 9)-(line 2474,col 33)",
        "(line 2475,col 9)-(line 2475,col 16)",
        "(line 2476,col 9)-(line 2476,col 17)",
        "(line 2479,col 9)-(line 2511,col 9)",
        "(line 2514,col 9)-(line 2514,col 18)",
        "(line 2515,col 9)-(line 2515,col 18)",
        "(line 2518,col 9)-(line 2518,col 41)",
        "(line 2529,col 9)-(line 2529,col 33)",
        "(line 2530,col 9)-(line 2530,col 47)",
        "(line 2531,col 9)-(line 2531,col 46)",
        "(line 2532,col 9)-(line 2532,col 46)",
        "(line 2533,col 9)-(line 2533,col 46)",
        "(line 2534,col 9)-(line 2534,col 47)",
        "(line 2535,col 9)-(line 2535,col 31)",
        "(line 2538,col 9)-(line 2538,col 18)",
        "(line 2540,col 9)-(line 2540,col 23)",
        "(line 2541,col 9)-(line 2541,col 31)",
        "(line 2542,col 9)-(line 2542,col 18)",
        "(line 2545,col 9)-(line 2545,col 40)",
        "(line 2548,col 9)-(line 2548,col 38)",
        "(line 2549,col 9)-(line 2549,col 46)",
        "(line 2550,col 9)-(line 2550,col 23)",
        "(line 2551,col 9)-(line 2551,col 32)",
        "(line 2552,col 9)-(line 2552,col 18)",
        "(line 2554,col 9)-(line 2554,col 32)",
        "(line 2555,col 9)-(line 2555,col 45)",
        "(line 2557,col 9)-(line 2568,col 9)",
        "(line 2571,col 9)-(line 2573,col 9)",
        "(line 2575,col 9)-(line 2575,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan2(double, double)",
      "begin_line": 2584,
      "end_line": 2699,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2585,col 9)-(line 2587,col 9)",
        "(line 2589,col 9)-(line 2611,col 9)",
        "(line 2615,col 9)-(line 2625,col 9)",
        "(line 2627,col 9)-(line 2637,col 9)",
        "(line 2639,col 9)-(line 2647,col 9)",
        "(line 2649,col 9)-(line 2658,col 9)",
        "(line 2662,col 9)-(line 2670,col 9)",
        "(line 2673,col 9)-(line 2673,col 31)",
        "(line 2674,col 9)-(line 2676,col 9)",
        "(line 2678,col 9)-(line 2678,col 38)",
        "(line 2679,col 9)-(line 2679,col 27)",
        "(line 2682,col 9)-(line 2682,col 44)",
        "(line 2683,col 9)-(line 2683,col 33)",
        "(line 2685,col 9)-(line 2685,col 62)",
        "(line 2687,col 9)-(line 2687,col 36)",
        "(line 2688,col 9)-(line 2688,col 31)",
        "(line 2689,col 9)-(line 2689,col 18)",
        "(line 2691,col 9)-(line 2693,col 9)",
        "(line 2696,col 9)-(line 2696,col 50)",
        "(line 2698,col 9)-(line 2698,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asin(double)",
      "begin_line": 2705,
      "end_line": 2775,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2706,col 7)-(line 2708,col 7)",
        "(line 2710,col 7)-(line 2712,col 7)",
        "(line 2714,col 7)-(line 2716,col 7)",
        "(line 2718,col 7)-(line 2720,col 7)",
        "(line 2722,col 7)-(line 2724,col 7)",
        "(line 2729,col 7)-(line 2729,col 37)",
        "(line 2730,col 7)-(line 2730,col 40)",
        "(line 2731,col 7)-(line 2731,col 31)",
        "(line 2734,col 7)-(line 2734,col 24)",
        "(line 2735,col 7)-(line 2735,col 36)",
        "(line 2738,col 7)-(line 2738,col 15)",
        "(line 2739,col 7)-(line 2739,col 15)",
        "(line 2741,col 7)-(line 2741,col 27)",
        "(line 2742,col 7)-(line 2742,col 35)",
        "(line 2744,col 7)-(line 2744,col 21)",
        "(line 2745,col 7)-(line 2745,col 30)",
        "(line 2746,col 7)-(line 2746,col 16)",
        "(line 2749,col 7)-(line 2749,col 15)",
        "(line 2750,col 7)-(line 2750,col 19)",
        "(line 2751,col 7)-(line 2751,col 30)",
        "(line 2752,col 7)-(line 2752,col 27)",
        "(line 2753,col 7)-(line 2753,col 18)",
        "(line 2756,col 7)-(line 2756,col 53)",
        "(line 2759,col 7)-(line 2759,col 31)",
        "(line 2762,col 7)-(line 2762,col 21)",
        "(line 2763,col 7)-(line 2763,col 30)",
        "(line 2764,col 7)-(line 2764,col 34)",
        "(line 2765,col 7)-(line 2765,col 25)",
        "(line 2767,col 7)-(line 2767,col 52)",
        "(line 2768,col 7)-(line 2768,col 28)",
        "(line 2770,col 7)-(line 2770,col 21)",
        "(line 2771,col 7)-(line 2771,col 29)",
        "(line 2772,col 7)-(line 2772,col 16)",
        "(line 2774,col 7)-(line 2774,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acos(double)",
      "begin_line": 2781,
      "end_line": 2857,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2782,col 7)-(line 2784,col 7)",
        "(line 2786,col 7)-(line 2788,col 7)",
        "(line 2790,col 7)-(line 2792,col 7)",
        "(line 2794,col 7)-(line 2796,col 7)",
        "(line 2798,col 7)-(line 2800,col 7)",
        "(line 2805,col 7)-(line 2805,col 37)",
        "(line 2806,col 7)-(line 2806,col 40)",
        "(line 2807,col 7)-(line 2807,col 31)",
        "(line 2810,col 7)-(line 2810,col 24)",
        "(line 2811,col 7)-(line 2811,col 36)",
        "(line 2814,col 7)-(line 2814,col 15)",
        "(line 2815,col 7)-(line 2815,col 15)",
        "(line 2817,col 7)-(line 2817,col 27)",
        "(line 2818,col 7)-(line 2818,col 35)",
        "(line 2820,col 7)-(line 2820,col 21)",
        "(line 2821,col 7)-(line 2821,col 30)",
        "(line 2822,col 7)-(line 2822,col 16)",
        "(line 2825,col 7)-(line 2825,col 26)",
        "(line 2826,col 7)-(line 2826,col 30)",
        "(line 2827,col 7)-(line 2827,col 27)",
        "(line 2828,col 7)-(line 2828,col 18)",
        "(line 2831,col 7)-(line 2831,col 53)",
        "(line 2834,col 7)-(line 2834,col 25)",
        "(line 2835,col 7)-(line 2835,col 16)",
        "(line 2836,col 7)-(line 2836,col 26)",
        "(line 2839,col 7)-(line 2839,col 21)",
        "(line 2842,col 7)-(line 2844,col 7)",
        "(line 2846,col 7)-(line 2846,col 36)",
        "(line 2847,col 7)-(line 2847,col 25)",
        "(line 2849,col 7)-(line 2849,col 52)",
        "(line 2850,col 7)-(line 2850,col 19)",
        "(line 2852,col 7)-(line 2852,col 21)",
        "(line 2853,col 7)-(line 2853,col 29)",
        "(line 2854,col 7)-(line 2854,col 16)",
        "(line 2856,col 7)-(line 2856,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cbrt(double)",
      "begin_line": 2863,
      "end_line": 2941,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2865,col 7)-(line 2865,col 47)",
        "(line 2866,col 7)-(line 2866,col 59)",
        "(line 2867,col 7)-(line 2867,col 32)",
        "(line 2869,col 7)-(line 2879,col 7)",
        "(line 2881,col 7)-(line 2884,col 7)",
        "(line 2887,col 7)-(line 2887,col 30)",
        "(line 2890,col 7)-(line 2891,col 81)",
        "(line 2894,col 7)-(line 2894,col 104)",
        "(line 2897,col 7)-(line 2897,col 41)",
        "(line 2898,col 7)-(line 2898,col 44)",
        "(line 2899,col 7)-(line 2899,col 45)",
        "(line 2900,col 7)-(line 2900,col 44)",
        "(line 2901,col 7)-(line 2901,col 44)",
        "(line 2903,col 7)-(line 2903,col 39)",
        "(line 2908,col 7)-(line 2908,col 39)",
        "(line 2909,col 7)-(line 2909,col 46)",
        "(line 2910,col 7)-(line 2910,col 46)",
        "(line 2913,col 7)-(line 2913,col 39)",
        "(line 2914,col 7)-(line 2914,col 36)",
        "(line 2915,col 7)-(line 2915,col 27)",
        "(line 2917,col 7)-(line 2917,col 26)",
        "(line 2918,col 7)-(line 2918,col 42)",
        "(line 2919,col 7)-(line 2919,col 31)",
        "(line 2920,col 7)-(line 2920,col 38)",
        "(line 2921,col 7)-(line 2921,col 23)",
        "(line 2922,col 7)-(line 2922,col 17)",
        "(line 2924,col 7)-(line 2924,col 39)",
        "(line 2925,col 7)-(line 2925,col 19)",
        "(line 2927,col 7)-(line 2927,col 26)",
        "(line 2928,col 7)-(line 2928,col 34)",
        "(line 2929,col 7)-(line 2929,col 15)",
        "(line 2931,col 7)-(line 2931,col 33)",
        "(line 2934,col 7)-(line 2934,col 16)",
        "(line 2936,col 7)-(line 2938,col 7)",
        "(line 2940,col 7)-(line 2940,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toRadians(double)",
      "begin_line": 2948,
      "end_line": 2966,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2950,col 9)-(line 2952,col 9)",
        "(line 2955,col 9)-(line 2955,col 49)",
        "(line 2956,col 9)-(line 2956,col 50)",
        "(line 2958,col 9)-(line 2958,col 38)",
        "(line 2959,col 9)-(line 2959,col 27)",
        "(line 2961,col 9)-(line 2961,col 74)",
        "(line 2962,col 9)-(line 2964,col 9)",
        "(line 2965,col 9)-(line 2965,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toDegrees(double)",
      "begin_line": 2973,
      "end_line": 2987,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2975,col 9)-(line 2977,col 9)",
        "(line 2980,col 9)-(line 2980,col 46)",
        "(line 2981,col 9)-(line 2981,col 50)",
        "(line 2983,col 9)-(line 2983,col 38)",
        "(line 2984,col 9)-(line 2984,col 27)",
        "(line 2986,col 9)-(line 2986,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(int)",
      "begin_line": 2994,
      "end_line": 2996,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2995,col 9)-(line 2995,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(long)",
      "begin_line": 3003,
      "end_line": 3005,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3004,col 9)-(line 3004,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(float)",
      "begin_line": 3012,
      "end_line": 3014,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3013,col 9)-(line 3013,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(double)",
      "begin_line": 3021,
      "end_line": 3023,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3022,col 9)-(line 3022,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(double)",
      "begin_line": 3030,
      "end_line": 3035,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3031,col 9)-(line 3033,col 9)",
        "(line 3034,col 9)-(line 3034,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(float)",
      "begin_line": 3042,
      "end_line": 3047,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3043,col 9)-(line 3045,col 9)",
        "(line 3046,col 9)-(line 3046,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(double, int)",
      "begin_line": 3055,
      "end_line": 3131,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3058,col 9)-(line 3060,col 9)",
        "(line 3063,col 9)-(line 3065,col 9)",
        "(line 3066,col 9)-(line 3068,col 9)",
        "(line 3069,col 9)-(line 3071,col 9)",
        "(line 3074,col 9)-(line 3074,col 53)",
        "(line 3075,col 9)-(line 3075,col 53)",
        "(line 3076,col 9)-(line 3076,col 56)",
        "(line 3077,col 9)-(line 3077,col 53)",
        "(line 3080,col 9)-(line 3080,col 42)",
        "(line 3082,col 9)-(line 3129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(float, int)",
      "begin_line": 3139,
      "end_line": 3215,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3142,col 9)-(line 3144,col 9)",
        "(line 3147,col 9)-(line 3149,col 9)",
        "(line 3150,col 9)-(line 3152,col 9)",
        "(line 3153,col 9)-(line 3155,col 9)",
        "(line 3158,col 9)-(line 3158,col 49)",
        "(line 3159,col 9)-(line 3159,col 43)",
        "(line 3160,col 9)-(line 3160,col 46)",
        "(line 3161,col 9)-(line 3161,col 43)",
        "(line 3164,col 9)-(line 3164,col 42)",
        "(line 3166,col 9)-(line 3213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(double, double)",
      "begin_line": 3248,
      "end_line": 3271,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3251,col 9)-(line 3259,col 9)",
        "(line 3263,col 9)-(line 3263,col 53)",
        "(line 3264,col 9)-(line 3264,col 53)",
        "(line 3265,col 9)-(line 3269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(float, double)",
      "begin_line": 3304,
      "end_line": 3327,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3307,col 9)-(line 3315,col 9)",
        "(line 3319,col 9)-(line 3319,col 49)",
        "(line 3320,col 9)-(line 3320,col 43)",
        "(line 3321,col 9)-(line 3325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.floor(double)",
      "begin_line": 3333,
      "end_line": 3354,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3334,col 9)-(line 3334,col 15)",
        "(line 3336,col 9)-(line 3338,col 9)",
        "(line 3340,col 9)-(line 3342,col 9)",
        "(line 3344,col 9)-(line 3344,col 21)",
        "(line 3345,col 9)-(line 3347,col 9)",
        "(line 3349,col 9)-(line 3351,col 9)",
        "(line 3353,col 9)-(line 3353,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ceil(double)",
      "begin_line": 3360,
      "end_line": 3379,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3361,col 9)-(line 3361,col 17)",
        "(line 3363,col 9)-(line 3365,col 9)",
        "(line 3367,col 9)-(line 3367,col 21)",
        "(line 3368,col 9)-(line 3370,col 9)",
        "(line 3372,col 9)-(line 3372,col 17)",
        "(line 3374,col 9)-(line 3376,col 9)",
        "(line 3378,col 9)-(line 3378,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.rint(double)",
      "begin_line": 3385,
      "end_line": 3402,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3386,col 9)-(line 3386,col 28)",
        "(line 3387,col 9)-(line 3387,col 25)",
        "(line 3389,col 9)-(line 3394,col 9)",
        "(line 3395,col 9)-(line 3397,col 9)",
        "(line 3400,col 9)-(line 3400,col 26)",
        "(line 3401,col 9)-(line 3401,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(double)",
      "begin_line": 3408,
      "end_line": 3410,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3409,col 9)-(line 3409,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(float)",
      "begin_line": 3416,
      "end_line": 3418,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3417,col 9)-(line 3417,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(int, int)",
      "begin_line": 3425,
      "end_line": 3427,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3426,col 9)-(line 3426,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(long, long)",
      "begin_line": 3434,
      "end_line": 3436,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3435,col 9)-(line 3435,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(float, float)",
      "begin_line": 3443,
      "end_line": 3461,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3444,col 9)-(line 3446,col 9)",
        "(line 3447,col 9)-(line 3449,col 9)",
        "(line 3451,col 9)-(line 3453,col 9)",
        "(line 3456,col 9)-(line 3456,col 46)",
        "(line 3457,col 9)-(line 3459,col 9)",
        "(line 3460,col 9)-(line 3460,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(double, double)",
      "begin_line": 3468,
      "end_line": 3486,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3469,col 9)-(line 3471,col 9)",
        "(line 3472,col 9)-(line 3474,col 9)",
        "(line 3476,col 9)-(line 3478,col 9)",
        "(line 3481,col 9)-(line 3481,col 50)",
        "(line 3482,col 9)-(line 3484,col 9)",
        "(line 3485,col 9)-(line 3485,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(int, int)",
      "begin_line": 3493,
      "end_line": 3495,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3494,col 9)-(line 3494,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(long, long)",
      "begin_line": 3502,
      "end_line": 3504,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3503,col 9)-(line 3503,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(float, float)",
      "begin_line": 3511,
      "end_line": 3529,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3512,col 9)-(line 3514,col 9)",
        "(line 3515,col 9)-(line 3517,col 9)",
        "(line 3519,col 9)-(line 3521,col 9)",
        "(line 3524,col 9)-(line 3524,col 46)",
        "(line 3525,col 9)-(line 3527,col 9)",
        "(line 3528,col 9)-(line 3528,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(double, double)",
      "begin_line": 3536,
      "end_line": 3554,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3537,col 9)-(line 3539,col 9)",
        "(line 3540,col 9)-(line 3542,col 9)",
        "(line 3544,col 9)-(line 3546,col 9)",
        "(line 3549,col 9)-(line 3549,col 50)",
        "(line 3550,col 9)-(line 3552,col 9)",
        "(line 3553,col 9)-(line 3553,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.hypot(double, double)",
      "begin_line": 3570,
      "end_line": 3603,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3571,col 9)-(line 3602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3625,
      "end_line": 3627,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3626,col 9)-(line 3626,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(double, double)",
      "begin_line": 3637,
      "end_line": 3644,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3638,col 9)-(line 3638,col 52)",
        "(line 3639,col 9)-(line 3639,col 47)",
        "(line 3640,col 9)-(line 3642,col 9)",
        "(line 3643,col 9)-(line 3643,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(float, float)",
      "begin_line": 3654,
      "end_line": 3661,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3655,col 9)-(line 3655,col 48)",
        "(line 3656,col 9)-(line 3656,col 43)",
        "(line 3657,col 9)-(line 3659,col 9)",
        "(line 3660,col 9)-(line 3660,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(double)",
      "begin_line": 3672,
      "end_line": 3674,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3673,col 9)-(line 3673,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(float)",
      "begin_line": 3685,
      "end_line": 3687,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3686,col 9)-(line 3686,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.main(java.lang.String[])",
      "begin_line": 3694,
      "end_line": 3707,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3695,col 9)-(line 3695,col 37)",
        "(line 3696,col 9)-(line 3696,col 104)",
        "(line 3697,col 9)-(line 3697,col 104)",
        "(line 3698,col 9)-(line 3698,col 108)",
        "(line 3699,col 9)-(line 3699,col 108)",
        "(line 3700,col 9)-(line 3700,col 76)",
        "(line 3701,col 9)-(line 3701,col 83)",
        "(line 3702,col 9)-(line 3702,col 83)",
        "(line 3703,col 9)-(line 3703,col 87)",
        "(line 3704,col 9)-(line 3704,col 87)",
        "(line 3705,col 9)-(line 3705,col 89)",
        "(line 3706,col 9)-(line 3706,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3710,
      "end_line": 3750,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3714,
      "end_line": 3714,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3718,
      "end_line": 3718,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3753,
      "end_line": 3787,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3758,
      "end_line": 3758,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3762,
      "end_line": 3762,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3790,
      "end_line": 3809,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3792,
      "end_line": 3792,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    }
  ]
}