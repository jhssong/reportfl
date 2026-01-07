{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 3845,
      "comment": "\n * Faster, more accurate, portable alternative to {@link Math} and\n * {@link StrictMath} for large scale computation.\n * \u003cp\u003e\n * FastMath is a drop-in replacement for both Math and StrictMath. This\n * means that for any method in Math (say {@code Math.sin(x)} or\n * {@code Math.cbrt(y)}), user can directly change the class and use the\n * methods as is (using {@code FastMath.sin(x)} or {@code FastMath.cbrt(y)}\n * in the previous example).\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath speed is achieved by relying heavily on optimizing compilers\n * to native code present in many JVMs today and use of large tables.\n * The larger tables are lazily initialised on first use, so that the setup\n * time does not penalise methods that don\u0027t need them.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note that FastMath is\n * extensively used inside Apache Commons Math, so by calling some algorithms,\n * the overhead when the the tables need to be intialised will occur\n * regardless of the end-user calling FastMath methods directly or not.\n * Performance figures for a specific JVM and hardware can be evaluated by\n * running the FastMathTestPerformance tests in the test directory of the source\n * distribution.\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath accuracy should be mostly independent of the JVM as it relies only\n * on IEEE-754 basic operations and on embedded tables. Almost all operations\n * are accurate to about 0.5 ulp throughout the domain range. This statement,\n * of course is only a rough global observed behavior, it is \u003cem\u003enot\u003c/em\u003e a\n * guarantee for \u003cem\u003eevery\u003c/em\u003e double numbers input (see William Kahan\u0027s \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Rounding#The_table-maker.27s_dilemma\"\u003eTable\n * Maker\u0027s Dilemma\u003c/a\u003e).\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath additionally implements the following methods not found in Math/StrictMath:\n * \u003cul\u003e\n * \u003cli\u003e{@link #asinh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #acosh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #atanh(double)}\u003c/li\u003e\n * \u003c/ul\u003e\n * The following methods are found in Math/StrictMath since 1.6 only, they are provided\n * by FastMath even in 1.5 Java virtual machines\n * \u003cul\u003e\n * \u003cli\u003e{@link #copySign(double, double)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(double,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(double, int)}\u003c/li\u003e\n * \u003cli\u003e{@link #copySign(float, float)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(float,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(float, int)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "PI"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Archimede\u0027s constant PI, ratio of circle circumference to diameter. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Napier\u0027s constant e, base of the natural logarithm. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_MAX_INDEX"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Index of exp(0) in the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_LEN"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Length of the array of integer exponentials. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT_LEN"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Logarithm table length. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_LEN"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " 0, 1/1024, ... 1024/1024"
    },
    {
      "type": "field",
      "varNames": [
        "RECOMPUTE_TABLES_AT_RUNTIME"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Indicator for tables initialization.\n     * \u003cp\u003e\n     * This compile-time constant should be set to true only if one explicitly\n     * wants to compute the tables at class loading time instead of using the\n     * already computed ones provided as literal arrays below.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_A"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " log(2) (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_B"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " log(2) (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_QUICK_COEF"
      ],
      "begin_line": 114,
      "end_line": 124,
      "comment": " Coefficients for log, when input 0.99 \u003c x \u003c 1.01. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_HI_PREC_COEF"
      ],
      "begin_line": 127,
      "end_line": 134,
      "comment": " Coefficients for log in the range of 1.0 \u003c x \u003c 1.0 + 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_LEN"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Sine, Cosine, Tangent tables are for 0, 1/8, 2/8, ... 13/8 \u003d PI/2 approx. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_A"
      ],
      "begin_line": 140,
      "end_line": 156,
      "comment": " Sine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_B"
      ],
      "begin_line": 159,
      "end_line": 175,
      "comment": " Sine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_A"
      ],
      "begin_line": 178,
      "end_line": 194,
      "comment": " Cosine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_B"
      ],
      "begin_line": 197,
      "end_line": 213,
      "comment": " Cosine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_A"
      ],
      "begin_line": 217,
      "end_line": 233,
      "comment": " Tangent table, used by atan() (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_B"
      ],
      "begin_line": 236,
      "end_line": 252,
      "comment": " Tangent table, used by atan() (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "RECIP_2PI"
      ],
      "begin_line": 255,
      "end_line": 273,
      "comment": " Bits of 1/(2*pi), need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "PI_O_4_BITS"
      ],
      "begin_line": 276,
      "end_line": 278,
      "comment": " Bits of pi/4, need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "EIGHTHS"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " Eighths.\n     * This is used by sinQ, because its faster to do a table lookup than\n     * a multiply in this time-critical routine\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CBRTTWO"
      ],
      "begin_line": 287,
      "end_line": 291,
      "comment": " Table of 2^((n+2)/3) "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_40000000"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " 1073741824L"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_30BITS"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " 0xFFFFFFFFC0000000L;"
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_52"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_3"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_5"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_7"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_9"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_11"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_13"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_15"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_17"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_3_4"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_15_16"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_13_14"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_11_12"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_9_10"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_7_8"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_5_6"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_2"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_4"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.FastMath()",
      "begin_line": 350,
      "end_line": 350,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.doubleHighPart(double)",
      "begin_line": 361,
      "end_line": 368,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 366,col 9)-(line 366,col 30)",
        "(line 367,col 9)-(line 367,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sqrt(double)",
      "begin_line": 375,
      "end_line": 377,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosh(double)",
      "begin_line": 383,
      "end_line": 437,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 384,col 7)-(line 386,col 7)",
        "(line 393,col 7)-(line 396,col 11)",
        "(line 397,col 7)-(line 400,col 7)",
        "(line 402,col 7)-(line 402,col 44)",
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
      "signature": "org.apache.commons.math3.util.FastMath.sinh(double)",
      "begin_line": 443,
      "end_line": 553,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 444,col 7)-(line 444,col 29)",
        "(line 445,col 7)-(line 447,col 7)",
        "(line 454,col 7)-(line 457,col 11)",
        "(line 458,col 7)-(line 461,col 7)",
        "(line 463,col 7)-(line 465,col 7)",
        "(line 467,col 7)-(line 470,col 7)",
        "(line 472,col 7)-(line 472,col 20)",
        "(line 474,col 7)-(line 546,col 7)",
        "(line 548,col 7)-(line 550,col 7)",
        "(line 552,col 7)-(line 552,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanh(double)",
      "begin_line": 559,
      "end_line": 677,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 560,col 7)-(line 560,col 29)",
        "(line 562,col 7)-(line 564,col 7)",
        "(line 572,col 7)-(line 574,col 7)",
        "(line 576,col 7)-(line 578,col 7)",
        "(line 580,col 7)-(line 582,col 7)",
        "(line 584,col 7)-(line 587,col 7)",
        "(line 589,col 7)-(line 589,col 20)",
        "(line 590,col 7)-(line 670,col 7)",
        "(line 672,col 7)-(line 674,col 7)",
        "(line 676,col 7)-(line 676,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acosh(double)",
      "begin_line": 683,
      "end_line": 685,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asinh(double)",
      "begin_line": 691,
      "end_line": 715,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 33)",
        "(line 693,col 9)-(line 696,col 9)",
        "(line 698,col 9)-(line 698,col 24)",
        "(line 699,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 714,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atanh(double)",
      "begin_line": 721,
      "end_line": 745,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 33)",
        "(line 723,col 9)-(line 726,col 9)",
        "(line 728,col 9)-(line 728,col 24)",
        "(line 729,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(double)",
      "begin_line": 752,
      "end_line": 754,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(float)",
      "begin_line": 761,
      "end_line": 763,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(double)",
      "begin_line": 769,
      "end_line": 771,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(float)",
      "begin_line": 777,
      "end_line": 779,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.random()",
      "begin_line": 785,
      "end_line": 787,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double)",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double, double, double[])",
      "begin_line": 820,
      "end_line": 935,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 24)",
        "(line 822,col 9)-(line 822,col 24)",
        "(line 823,col 9)-(line 823,col 19)",
        "(line 829,col 9)-(line 879,col 9)",
        "(line 885,col 9)-(line 885,col 58)",
        "(line 886,col 9)-(line 886,col 72)",
        "(line 887,col 9)-(line 887,col 72)",
        "(line 893,col 9)-(line 893,col 63)",
        "(line 902,col 9)-(line 902,col 39)",
        "(line 903,col 9)-(line 903,col 45)",
        "(line 904,col 9)-(line 904,col 45)",
        "(line 905,col 9)-(line 905,col 30)",
        "(line 906,col 9)-(line 906,col 49)",
        "(line 913,col 9)-(line 913,col 44)",
        "(line 914,col 9)-(line 914,col 90)",
        "(line 920,col 9)-(line 920,col 43)",
        "(line 921,col 9)-(line 921,col 28)",
        "(line 922,col 9)-(line 926,col 9)",
        "(line 928,col 9)-(line 932,col 9)",
        "(line 934,col 9)-(line 934,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double)",
      "begin_line": 941,
      "end_line": 943,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 942,col 7)-(line 942,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double, double[])",
      "begin_line": 950,
      "end_line": 1090,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 953,col 9)",
        "(line 955,col 9)-(line 968,col 9)",
        "(line 970,col 9)-(line 970,col 21)",
        "(line 971,col 9)-(line 971,col 21)",
        "(line 972,col 9)-(line 972,col 23)",
        "(line 973,col 9)-(line 973,col 33)",
        "(line 975,col 9)-(line 978,col 9)",
        "(line 980,col 9)-(line 994,col 9)",
        "(line 998,col 9)-(line 998,col 41)",
        "(line 999,col 9)-(line 999,col 49)",
        "(line 1000,col 9)-(line 1000,col 48)",
        "(line 1001,col 9)-(line 1001,col 48)",
        "(line 1002,col 9)-(line 1002,col 26)",
        "(line 1003,col 9)-(line 1003,col 26)",
        "(line 1005,col 9)-(line 1005,col 28)",
        "(line 1006,col 9)-(line 1006,col 30)",
        "(line 1007,col 9)-(line 1007,col 31)",
        "(line 1008,col 9)-(line 1008,col 18)",
        "(line 1010,col 9)-(line 1010,col 33)",
        "(line 1011,col 9)-(line 1011,col 32)",
        "(line 1012,col 9)-(line 1012,col 24)",
        "(line 1013,col 9)-(line 1013,col 18)",
        "(line 1016,col 9)-(line 1016,col 31)",
        "(line 1018,col 9)-(line 1018,col 31)",
        "(line 1019,col 9)-(line 1019,col 46)",
        "(line 1020,col 9)-(line 1020,col 18)",
        "(line 1022,col 9)-(line 1022,col 31)",
        "(line 1023,col 9)-(line 1023,col 40)",
        "(line 1024,col 9)-(line 1024,col 18)",
        "(line 1026,col 9)-(line 1026,col 31)",
        "(line 1027,col 9)-(line 1027,col 38)",
        "(line 1028,col 9)-(line 1028,col 18)",
        "(line 1032,col 9)-(line 1032,col 26)",
        "(line 1033,col 9)-(line 1033,col 35)",
        "(line 1034,col 9)-(line 1034,col 18)",
        "(line 1036,col 9)-(line 1036,col 23)",
        "(line 1038,col 9)-(line 1038,col 32)",
        "(line 1039,col 9)-(line 1039,col 18)",
        "(line 1041,col 9)-(line 1041,col 26)",
        "(line 1043,col 9)-(line 1043,col 35)",
        "(line 1044,col 9)-(line 1044,col 18)",
        "(line 1046,col 9)-(line 1046,col 23)",
        "(line 1048,col 9)-(line 1048,col 32)",
        "(line 1049,col 9)-(line 1049,col 18)",
        "(line 1051,col 9)-(line 1082,col 9)",
        "(line 1084,col 9)-(line 1087,col 9)",
        "(line 1089,col 9)-(line 1089,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double)",
      "begin_line": 1098,
      "end_line": 1100,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double[])",
      "begin_line": 1108,
      "end_line": 1332,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1111,col 9)",
        "(line 1112,col 9)-(line 1112,col 47)",
        "(line 1115,col 9)-(line 1123,col 9)",
        "(line 1126,col 9)-(line 1132,col 9)",
        "(line 1135,col 9)-(line 1135,col 41)",
        "(line 1137,col 9)-(line 1154,col 9)",
        "(line 1157,col 9)-(line 1204,col 9)",
        "(line 1207,col 9)-(line 1207,col 87)",
        "(line 1218,col 9)-(line 1218,col 103)",
        "(line 1220,col 9)-(line 1220,col 26)",
        "(line 1221,col 9)-(line 1221,col 26)",
        "(line 1223,col 9)-(line 1283,col 9)",
        "(line 1299,col 9)-(line 1299,col 30)",
        "(line 1300,col 9)-(line 1300,col 23)",
        "(line 1301,col 9)-(line 1301,col 28)",
        "(line 1302,col 9)-(line 1302,col 33)",
        "(line 1303,col 9)-(line 1303,col 14)",
        "(line 1304,col 9)-(line 1304,col 18)",
        "(line 1306,col 9)-(line 1306,col 21)",
        "(line 1307,col 9)-(line 1307,col 28)",
        "(line 1308,col 9)-(line 1308,col 14)",
        "(line 1309,col 9)-(line 1309,col 18)",
        "(line 1311,col 9)-(line 1311,col 27)",
        "(line 1312,col 9)-(line 1312,col 34)",
        "(line 1313,col 9)-(line 1313,col 14)",
        "(line 1314,col 9)-(line 1314,col 18)",
        "(line 1316,col 9)-(line 1316,col 23)",
        "(line 1317,col 9)-(line 1317,col 30)",
        "(line 1318,col 9)-(line 1318,col 14)",
        "(line 1319,col 9)-(line 1319,col 18)",
        "(line 1321,col 9)-(line 1321,col 21)",
        "(line 1322,col 9)-(line 1322,col 28)",
        "(line 1323,col 9)-(line 1323,col 14)",
        "(line 1324,col 9)-(line 1324,col 18)",
        "(line 1326,col 9)-(line 1329,col 9)",
        "(line 1331,col 9)-(line 1331,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log1p(double)",
      "begin_line": 1340,
      "end_line": 1370,
      "comment": "\n     * Computes log(1 + x).\n     *\n     * @param x Number.\n     * @return {@code log(1 + x)}.\n     ",
      "child_ranges": [
        "(line 1341,col 9)-(line 1343,col 9)",
        "(line 1345,col 9)-(line 1347,col 9)",
        "(line 1349,col 9)-(line 1369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log10(double)",
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
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double)",
      "begin_line": 1410,
      "end_line": 1412,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003e\n     * logarithm\u003c/a\u003e in a given base.\n     *\n     * Returns {@code NaN} if either argument is negative.\n     * If {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.\n     * If both arguments are 0, the result is {@code NaN}.\n     *\n     * @param base Base of the logarithm, must be greater than 0.\n     * @param x Argument, must be greater than 0.\n     * @return the value of the logarithm, i.e. the number {@code y} such that\n     * \u003ccode\u003ebase\u003csup\u003ey\u003c/sup\u003e \u003d x\u003c/code\u003e.\n     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, double)",
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
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, int)",
      "begin_line": 1589,
      "end_line": 1646,
      "comment": "\n     * Raise a double to an int power.\n     *\n     * @param d Number to raise.\n     * @param e Exponent.\n     * @return d\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1591,col 9)-(line 1596,col 9)",
        "(line 1600,col 9)-(line 1600,col 42)",
        "(line 1601,col 9)-(line 1601,col 48)",
        "(line 1602,col 9)-(line 1602,col 46)",
        "(line 1603,col 9)-(line 1603,col 43)",
        "(line 1606,col 9)-(line 1606,col 30)",
        "(line 1607,col 9)-(line 1607,col 30)",
        "(line 1610,col 9)-(line 1610,col 27)",
        "(line 1611,col 9)-(line 1611,col 32)",
        "(line 1612,col 9)-(line 1612,col 31)",
        "(line 1614,col 9)-(line 1642,col 9)",
        "(line 1644,col 9)-(line 1644,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polySine(double)",
      "begin_line": 1654,
      "end_line": 1667,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1656,col 9)-(line 1656,col 24)",
        "(line 1658,col 9)-(line 1658,col 41)",
        "(line 1659,col 9)-(line 1659,col 44)",
        "(line 1660,col 9)-(line 1660,col 42)",
        "(line 1661,col 9)-(line 1661,col 42)",
        "(line 1664,col 9)-(line 1664,col 23)",
        "(line 1666,col 9)-(line 1666,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polyCosine(double)",
      "begin_line": 1675,
      "end_line": 1685,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1676,col 9)-(line 1676,col 24)",
        "(line 1678,col 9)-(line 1678,col 40)",
        "(line 1679,col 9)-(line 1679,col 44)",
        "(line 1680,col 9)-(line 1680,col 42)",
        "(line 1681,col 9)-(line 1681,col 42)",
        "(line 1682,col 9)-(line 1682,col 16)",
        "(line 1684,col 9)-(line 1684,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinQ(double, double)",
      "begin_line": 1694,
      "end_line": 1809,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1695,col 9)-(line 1695,col 43)",
        "(line 1696,col 9)-(line 1696,col 49)",
        "(line 1699,col 9)-(line 1699,col 47)",
        "(line 1700,col 9)-(line 1700,col 47)",
        "(line 1701,col 9)-(line 1701,col 49)",
        "(line 1702,col 9)-(line 1702,col 49)",
        "(line 1705,col 9)-(line 1705,col 33)",
        "(line 1706,col 9)-(line 1706,col 43)",
        "(line 1707,col 9)-(line 1707,col 35)",
        "(line 1708,col 9)-(line 1708,col 51)",
        "(line 1711,col 9)-(line 1711,col 51)",
        "(line 1712,col 9)-(line 1712,col 47)",
        "(line 1713,col 9)-(line 1713,col 36)",
        "(line 1714,col 9)-(line 1714,col 24)",
        "(line 1717,col 9)-(line 1717,col 22)",
        "(line 1740,col 9)-(line 1740,col 21)",
        "(line 1741,col 9)-(line 1741,col 21)",
        "(line 1743,col 9)-(line 1743,col 25)",
        "(line 1744,col 9)-(line 1744,col 25)",
        "(line 1745,col 9)-(line 1745,col 32)",
        "(line 1746,col 9)-(line 1746,col 14)",
        "(line 1747,col 9)-(line 1747,col 18)",
        "(line 1749,col 9)-(line 1749,col 28)",
        "(line 1750,col 9)-(line 1750,col 18)",
        "(line 1751,col 9)-(line 1751,col 25)",
        "(line 1752,col 9)-(line 1752,col 14)",
        "(line 1753,col 9)-(line 1753,col 18)",
        "(line 1755,col 9)-(line 1755,col 50)",
        "(line 1770,col 9)-(line 1770,col 76)",
        "(line 1797,col 9)-(line 1804,col 9)",
        "(line 1806,col 9)-(line 1806,col 23)",
        "(line 1808,col 9)-(line 1808,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosQ(double, double)",
      "begin_line": 1818,
      "end_line": 1827,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1819,col 9)-(line 1819,col 47)",
        "(line 1820,col 9)-(line 1820,col 50)",
        "(line 1822,col 9)-(line 1822,col 35)",
        "(line 1823,col 9)-(line 1823,col 36)",
        "(line 1824,col 9)-(line 1824,col 23)",
        "(line 1826,col 9)-(line 1826,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1837,
      "end_line": 1972,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1839,col 9)-(line 1839,col 43)",
        "(line 1840,col 9)-(line 1840,col 49)",
        "(line 1843,col 9)-(line 1843,col 47)",
        "(line 1844,col 9)-(line 1844,col 47)",
        "(line 1845,col 9)-(line 1845,col 49)",
        "(line 1846,col 9)-(line 1846,col 49)",
        "(line 1849,col 9)-(line 1849,col 33)",
        "(line 1850,col 9)-(line 1850,col 43)",
        "(line 1851,col 9)-(line 1851,col 35)",
        "(line 1852,col 9)-(line 1852,col 51)",
        "(line 1855,col 9)-(line 1855,col 45)",
        "(line 1856,col 9)-(line 1856,col 47)",
        "(line 1857,col 9)-(line 1857,col 36)",
        "(line 1858,col 9)-(line 1858,col 24)",
        "(line 1883,col 9)-(line 1883,col 21)",
        "(line 1884,col 9)-(line 1884,col 21)",
        "(line 1887,col 9)-(line 1887,col 25)",
        "(line 1888,col 9)-(line 1888,col 25)",
        "(line 1889,col 9)-(line 1889,col 32)",
        "(line 1890,col 9)-(line 1890,col 14)",
        "(line 1891,col 9)-(line 1891,col 18)",
        "(line 1893,col 9)-(line 1893,col 26)",
        "(line 1894,col 9)-(line 1894,col 18)",
        "(line 1895,col 9)-(line 1895,col 25)",
        "(line 1896,col 9)-(line 1896,col 14)",
        "(line 1897,col 9)-(line 1897,col 18)",
        "(line 1899,col 9)-(line 1899,col 46)",
        "(line 1900,col 9)-(line 1900,col 70)",
        "(line 1902,col 9)-(line 1902,col 28)",
        "(line 1903,col 9)-(line 1903,col 38)",
        "(line 1907,col 9)-(line 1907,col 28)",
        "(line 1909,col 9)-(line 1909,col 26)",
        "(line 1910,col 9)-(line 1910,col 18)",
        "(line 1911,col 9)-(line 1911,col 25)",
        "(line 1912,col 9)-(line 1912,col 14)",
        "(line 1913,col 9)-(line 1913,col 18)",
        "(line 1915,col 9)-(line 1915,col 27)",
        "(line 1916,col 9)-(line 1916,col 18)",
        "(line 1917,col 9)-(line 1917,col 25)",
        "(line 1918,col 9)-(line 1918,col 14)",
        "(line 1919,col 9)-(line 1919,col 18)",
        "(line 1921,col 9)-(line 1921,col 62)",
        "(line 1922,col 9)-(line 1922,col 64)",
        "(line 1924,col 9)-(line 1924,col 28)",
        "(line 1925,col 9)-(line 1925,col 38)",
        "(line 1927,col 9)-(line 1931,col 9)",
        "(line 1944,col 9)-(line 1944,col 31)",
        "(line 1947,col 9)-(line 1947,col 34)",
        "(line 1948,col 9)-(line 1948,col 42)",
        "(line 1949,col 9)-(line 1949,col 34)",
        "(line 1951,col 9)-(line 1951,col 35)",
        "(line 1952,col 9)-(line 1952,col 44)",
        "(line 1953,col 9)-(line 1953,col 37)",
        "(line 1956,col 9)-(line 1956,col 85)",
        "(line 1957,col 9)-(line 1957,col 25)",
        "(line 1958,col 9)-(line 1958,col 42)",
        "(line 1960,col 9)-(line 1969,col 9)",
        "(line 1971,col 9)-(line 1971,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 1985,
      "end_line": 2195,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1988,col 9)-(line 1988,col 49)",
        "(line 1989,col 9)-(line 1989,col 61)",
        "(line 1992,col 9)-(line 1992,col 38)",
        "(line 1993,col 9)-(line 1993,col 38)",
        "(line 1996,col 9)-(line 1996,col 19)",
        "(line 1997,col 9)-(line 1997,col 22)",
        "(line 2000,col 9)-(line 2000,col 19)",
        "(line 2001,col 9)-(line 2001,col 19)",
        "(line 2002,col 9)-(line 2002,col 19)",
        "(line 2003,col 9)-(line 2003,col 32)",
        "(line 2004,col 9)-(line 2004,col 42)",
        "(line 2006,col 9)-(line 2015,col 9)",
        "(line 2018,col 9)-(line 2018,col 31)",
        "(line 2019,col 9)-(line 2019,col 38)",
        "(line 2021,col 9)-(line 2021,col 30)",
        "(line 2022,col 9)-(line 2022,col 37)",
        "(line 2024,col 9)-(line 2024,col 24)",
        "(line 2025,col 9)-(line 2025,col 24)",
        "(line 2026,col 9)-(line 2026,col 24)",
        "(line 2027,col 9)-(line 2027,col 24)",
        "(line 2029,col 9)-(line 2029,col 37)",
        "(line 2030,col 9)-(line 2030,col 38)",
        "(line 2032,col 9)-(line 2032,col 55)",
        "(line 2033,col 9)-(line 2033,col 48)",
        "(line 2034,col 9)-(line 2034,col 60)",
        "(line 2037,col 9)-(line 2040,col 9)",
        "(line 2042,col 9)-(line 2042,col 50)",
        "(line 2043,col 9)-(line 2043,col 40)",
        "(line 2045,col 9)-(line 2045,col 35)",
        "(line 2046,col 9)-(line 2046,col 36)",
        "(line 2048,col 9)-(line 2048,col 52)",
        "(line 2051,col 9)-(line 2054,col 9)",
        "(line 2057,col 9)-(line 2057,col 25)",
        "(line 2058,col 9)-(line 2058,col 32)",
        "(line 2059,col 9)-(line 2059,col 19)",
        "(line 2060,col 9)-(line 2060,col 19)",
        "(line 2061,col 9)-(line 2061,col 19)",
        "(line 2064,col 9)-(line 2064,col 37)",
        "(line 2066,col 9)-(line 2066,col 50)",
        "(line 2067,col 9)-(line 2067,col 48)",
        "(line 2068,col 9)-(line 2068,col 20)",
        "(line 2069,col 9)-(line 2069,col 52)",
        "(line 2071,col 9)-(line 2074,col 9)",
        "(line 2077,col 9)-(line 2077,col 25)",
        "(line 2078,col 9)-(line 2078,col 32)",
        "(line 2080,col 9)-(line 2080,col 19)",
        "(line 2081,col 9)-(line 2081,col 19)",
        "(line 2082,col 9)-(line 2082,col 19)",
        "(line 2084,col 9)-(line 2084,col 40)",
        "(line 2096,col 9)-(line 2096,col 42)",
        "(line 2099,col 9)-(line 2099,col 20)",
        "(line 2100,col 9)-(line 2100,col 30)",
        "(line 2101,col 9)-(line 2101,col 20)",
        "(line 2104,col 9)-(line 2104,col 25)",
        "(line 2105,col 9)-(line 2105,col 32)",
        "(line 2107,col 9)-(line 2107,col 34)",
        "(line 2108,col 9)-(line 2108,col 41)",
        "(line 2110,col 9)-(line 2110,col 19)",
        "(line 2111,col 9)-(line 2111,col 19)",
        "(line 2112,col 9)-(line 2112,col 19)",
        "(line 2113,col 9)-(line 2113,col 19)",
        "(line 2115,col 9)-(line 2115,col 38)",
        "(line 2116,col 9)-(line 2116,col 39)",
        "(line 2118,col 9)-(line 2118,col 47)",
        "(line 2119,col 9)-(line 2119,col 40)",
        "(line 2120,col 9)-(line 2120,col 53)",
        "(line 2123,col 9)-(line 2126,col 9)",
        "(line 2128,col 9)-(line 2128,col 51)",
        "(line 2129,col 9)-(line 2129,col 40)",
        "(line 2131,col 9)-(line 2131,col 37)",
        "(line 2132,col 9)-(line 2132,col 38)",
        "(line 2134,col 9)-(line 2134,col 53)",
        "(line 2137,col 9)-(line 2140,col 9)",
        "(line 2143,col 9)-(line 2143,col 34)",
        "(line 2144,col 9)-(line 2144,col 41)",
        "(line 2145,col 9)-(line 2145,col 19)",
        "(line 2146,col 9)-(line 2146,col 19)",
        "(line 2147,col 9)-(line 2147,col 19)",
        "(line 2150,col 9)-(line 2150,col 37)",
        "(line 2152,col 9)-(line 2152,col 51)",
        "(line 2153,col 9)-(line 2153,col 48)",
        "(line 2154,col 9)-(line 2154,col 21)",
        "(line 2155,col 9)-(line 2155,col 53)",
        "(line 2157,col 9)-(line 2160,col 9)",
        "(line 2163,col 9)-(line 2163,col 25)",
        "(line 2164,col 9)-(line 2164,col 32)",
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
        "(line 2185,col 9)-(line 2185,col 53)",
        "(line 2186,col 9)-(line 2186,col 98)",
        "(line 2188,col 9)-(line 2188,col 34)",
        "(line 2189,col 9)-(line 2189,col 44)",
        "(line 2192,col 9)-(line 2192,col 28)",
        "(line 2193,col 9)-(line 2193,col 31)",
        "(line 2194,col 9)-(line 2194,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sin(double)",
      "begin_line": 2203,
      "end_line": 2262,
      "comment": "\n     * Sine function.\n     *\n     * @param x Argument.\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 2204,col 9)-(line 2204,col 33)",
        "(line 2205,col 9)-(line 2205,col 25)",
        "(line 2206,col 9)-(line 2206,col 18)",
        "(line 2207,col 9)-(line 2207,col 24)",
        "(line 2210,col 9)-(line 2210,col 15)",
        "(line 2211,col 9)-(line 2214,col 9)",
        "(line 2217,col 9)-(line 2223,col 9)",
        "(line 2225,col 9)-(line 2227,col 9)",
        "(line 2230,col 9)-(line 2244,col 9)",
        "(line 2246,col 9)-(line 2248,col 9)",
        "(line 2250,col 9)-(line 2261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cos(double)",
      "begin_line": 2270,
      "end_line": 2316,
      "comment": "\n     * Cosine function.\n     *\n     * @param x Argument.\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 2271,col 9)-(line 2271,col 25)",
        "(line 2274,col 9)-(line 2274,col 22)",
        "(line 2275,col 9)-(line 2277,col 9)",
        "(line 2279,col 9)-(line 2281,col 9)",
        "(line 2284,col 9)-(line 2284,col 22)",
        "(line 2285,col 9)-(line 2299,col 9)",
        "(line 2304,col 9)-(line 2315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tan(double)",
      "begin_line": 2324,
      "end_line": 2393,
      "comment": "\n     * Tangent function.\n     *\n     * @param x Argument.\n     * @return tan(x)\n     ",
      "child_ranges": [
        "(line 2325,col 9)-(line 2325,col 33)",
        "(line 2326,col 9)-(line 2326,col 25)",
        "(line 2329,col 9)-(line 2329,col 22)",
        "(line 2330,col 9)-(line 2333,col 9)",
        "(line 2336,col 9)-(line 2342,col 9)",
        "(line 2344,col 9)-(line 2346,col 9)",
        "(line 2349,col 9)-(line 2349,col 22)",
        "(line 2350,col 9)-(line 2364,col 9)",
        "(line 2366,col 9)-(line 2379,col 9)",
        "(line 2381,col 9)-(line 2381,col 22)",
        "(line 2382,col 9)-(line 2386,col 9)",
        "(line 2388,col 9)-(line 2390,col 9)",
        "(line 2392,col 9)-(line 2392,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double)",
      "begin_line": 2400,
      "end_line": 2402,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2401,col 9)-(line 2401,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2410,
      "end_line": 2549,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2411,col 9)-(line 2411,col 31)",
        "(line 2412,col 9)-(line 2412,col 16)",
        "(line 2414,col 9)-(line 2416,col 9)",
        "(line 2418,col 9)-(line 2423,col 9)",
        "(line 2425,col 9)-(line 2427,col 9)",
        "(line 2430,col 9)-(line 2435,col 9)",
        "(line 2436,col 9)-(line 2436,col 48)",
        "(line 2437,col 9)-(line 2437,col 58)",
        "(line 2438,col 9)-(line 2438,col 42)",
        "(line 2440,col 9)-(line 2440,col 34)",
        "(line 2441,col 9)-(line 2441,col 37)",
        "(line 2442,col 9)-(line 2442,col 20)",
        "(line 2445,col 9)-(line 2445,col 33)",
        "(line 2446,col 9)-(line 2446,col 37)",
        "(line 2447,col 9)-(line 2447,col 33)",
        "(line 2448,col 9)-(line 2448,col 16)",
        "(line 2449,col 9)-(line 2449,col 17)",
        "(line 2452,col 9)-(line 2484,col 9)",
        "(line 2487,col 9)-(line 2487,col 18)",
        "(line 2488,col 9)-(line 2488,col 18)",
        "(line 2491,col 9)-(line 2491,col 41)",
        "(line 2502,col 9)-(line 2502,col 33)",
        "(line 2503,col 9)-(line 2503,col 47)",
        "(line 2504,col 9)-(line 2504,col 46)",
        "(line 2505,col 9)-(line 2505,col 46)",
        "(line 2506,col 9)-(line 2506,col 46)",
        "(line 2507,col 9)-(line 2507,col 47)",
        "(line 2508,col 9)-(line 2508,col 31)",
        "(line 2511,col 9)-(line 2511,col 18)",
        "(line 2513,col 9)-(line 2513,col 23)",
        "(line 2514,col 9)-(line 2514,col 31)",
        "(line 2515,col 9)-(line 2515,col 18)",
        "(line 2518,col 9)-(line 2518,col 40)",
        "(line 2521,col 9)-(line 2521,col 38)",
        "(line 2522,col 9)-(line 2522,col 46)",
        "(line 2523,col 9)-(line 2523,col 23)",
        "(line 2524,col 9)-(line 2524,col 32)",
        "(line 2525,col 9)-(line 2525,col 18)",
        "(line 2527,col 9)-(line 2527,col 32)",
        "(line 2528,col 9)-(line 2528,col 45)",
        "(line 2530,col 9)-(line 2541,col 9)",
        "(line 2544,col 9)-(line 2546,col 9)",
        "(line 2548,col 9)-(line 2548,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan2(double, double)",
      "begin_line": 2557,
      "end_line": 2672,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2558,col 9)-(line 2560,col 9)",
        "(line 2562,col 9)-(line 2584,col 9)",
        "(line 2588,col 9)-(line 2598,col 9)",
        "(line 2600,col 9)-(line 2610,col 9)",
        "(line 2612,col 9)-(line 2620,col 9)",
        "(line 2622,col 9)-(line 2631,col 9)",
        "(line 2635,col 9)-(line 2643,col 9)",
        "(line 2646,col 9)-(line 2646,col 31)",
        "(line 2647,col 9)-(line 2649,col 9)",
        "(line 2651,col 9)-(line 2651,col 38)",
        "(line 2652,col 9)-(line 2652,col 27)",
        "(line 2655,col 9)-(line 2655,col 44)",
        "(line 2656,col 9)-(line 2656,col 33)",
        "(line 2658,col 9)-(line 2658,col 62)",
        "(line 2660,col 9)-(line 2660,col 36)",
        "(line 2661,col 9)-(line 2661,col 31)",
        "(line 2662,col 9)-(line 2662,col 18)",
        "(line 2664,col 9)-(line 2666,col 9)",
        "(line 2669,col 9)-(line 2669,col 50)",
        "(line 2671,col 9)-(line 2671,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asin(double)",
      "begin_line": 2678,
      "end_line": 2748,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2679,col 7)-(line 2681,col 7)",
        "(line 2683,col 7)-(line 2685,col 7)",
        "(line 2687,col 7)-(line 2689,col 7)",
        "(line 2691,col 7)-(line 2693,col 7)",
        "(line 2695,col 7)-(line 2697,col 7)",
        "(line 2702,col 7)-(line 2702,col 37)",
        "(line 2703,col 7)-(line 2703,col 40)",
        "(line 2704,col 7)-(line 2704,col 31)",
        "(line 2707,col 7)-(line 2707,col 24)",
        "(line 2708,col 7)-(line 2708,col 36)",
        "(line 2711,col 7)-(line 2711,col 15)",
        "(line 2712,col 7)-(line 2712,col 15)",
        "(line 2714,col 7)-(line 2714,col 27)",
        "(line 2715,col 7)-(line 2715,col 35)",
        "(line 2717,col 7)-(line 2717,col 21)",
        "(line 2718,col 7)-(line 2718,col 30)",
        "(line 2719,col 7)-(line 2719,col 16)",
        "(line 2722,col 7)-(line 2722,col 15)",
        "(line 2723,col 7)-(line 2723,col 19)",
        "(line 2724,col 7)-(line 2724,col 30)",
        "(line 2725,col 7)-(line 2725,col 27)",
        "(line 2726,col 7)-(line 2726,col 18)",
        "(line 2729,col 7)-(line 2729,col 53)",
        "(line 2732,col 7)-(line 2732,col 31)",
        "(line 2735,col 7)-(line 2735,col 21)",
        "(line 2736,col 7)-(line 2736,col 30)",
        "(line 2737,col 7)-(line 2737,col 34)",
        "(line 2738,col 7)-(line 2738,col 25)",
        "(line 2740,col 7)-(line 2740,col 52)",
        "(line 2741,col 7)-(line 2741,col 28)",
        "(line 2743,col 7)-(line 2743,col 21)",
        "(line 2744,col 7)-(line 2744,col 29)",
        "(line 2745,col 7)-(line 2745,col 16)",
        "(line 2747,col 7)-(line 2747,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acos(double)",
      "begin_line": 2754,
      "end_line": 2830,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2755,col 7)-(line 2757,col 7)",
        "(line 2759,col 7)-(line 2761,col 7)",
        "(line 2763,col 7)-(line 2765,col 7)",
        "(line 2767,col 7)-(line 2769,col 7)",
        "(line 2771,col 7)-(line 2773,col 7)",
        "(line 2778,col 7)-(line 2778,col 37)",
        "(line 2779,col 7)-(line 2779,col 40)",
        "(line 2780,col 7)-(line 2780,col 31)",
        "(line 2783,col 7)-(line 2783,col 24)",
        "(line 2784,col 7)-(line 2784,col 36)",
        "(line 2787,col 7)-(line 2787,col 15)",
        "(line 2788,col 7)-(line 2788,col 15)",
        "(line 2790,col 7)-(line 2790,col 27)",
        "(line 2791,col 7)-(line 2791,col 35)",
        "(line 2793,col 7)-(line 2793,col 21)",
        "(line 2794,col 7)-(line 2794,col 30)",
        "(line 2795,col 7)-(line 2795,col 16)",
        "(line 2798,col 7)-(line 2798,col 26)",
        "(line 2799,col 7)-(line 2799,col 30)",
        "(line 2800,col 7)-(line 2800,col 27)",
        "(line 2801,col 7)-(line 2801,col 18)",
        "(line 2804,col 7)-(line 2804,col 53)",
        "(line 2807,col 7)-(line 2807,col 25)",
        "(line 2808,col 7)-(line 2808,col 16)",
        "(line 2809,col 7)-(line 2809,col 26)",
        "(line 2812,col 7)-(line 2812,col 21)",
        "(line 2815,col 7)-(line 2817,col 7)",
        "(line 2819,col 7)-(line 2819,col 36)",
        "(line 2820,col 7)-(line 2820,col 25)",
        "(line 2822,col 7)-(line 2822,col 52)",
        "(line 2823,col 7)-(line 2823,col 19)",
        "(line 2825,col 7)-(line 2825,col 21)",
        "(line 2826,col 7)-(line 2826,col 29)",
        "(line 2827,col 7)-(line 2827,col 16)",
        "(line 2829,col 7)-(line 2829,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cbrt(double)",
      "begin_line": 2836,
      "end_line": 2914,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2838,col 7)-(line 2838,col 47)",
        "(line 2839,col 7)-(line 2839,col 59)",
        "(line 2840,col 7)-(line 2840,col 32)",
        "(line 2842,col 7)-(line 2852,col 7)",
        "(line 2854,col 7)-(line 2857,col 7)",
        "(line 2860,col 7)-(line 2860,col 30)",
        "(line 2863,col 7)-(line 2864,col 81)",
        "(line 2867,col 7)-(line 2867,col 104)",
        "(line 2870,col 7)-(line 2870,col 41)",
        "(line 2871,col 7)-(line 2871,col 44)",
        "(line 2872,col 7)-(line 2872,col 45)",
        "(line 2873,col 7)-(line 2873,col 44)",
        "(line 2874,col 7)-(line 2874,col 44)",
        "(line 2876,col 7)-(line 2876,col 39)",
        "(line 2881,col 7)-(line 2881,col 39)",
        "(line 2882,col 7)-(line 2882,col 46)",
        "(line 2883,col 7)-(line 2883,col 46)",
        "(line 2886,col 7)-(line 2886,col 39)",
        "(line 2887,col 7)-(line 2887,col 36)",
        "(line 2888,col 7)-(line 2888,col 27)",
        "(line 2890,col 7)-(line 2890,col 26)",
        "(line 2891,col 7)-(line 2891,col 42)",
        "(line 2892,col 7)-(line 2892,col 31)",
        "(line 2893,col 7)-(line 2893,col 38)",
        "(line 2894,col 7)-(line 2894,col 23)",
        "(line 2895,col 7)-(line 2895,col 17)",
        "(line 2897,col 7)-(line 2897,col 39)",
        "(line 2898,col 7)-(line 2898,col 19)",
        "(line 2900,col 7)-(line 2900,col 26)",
        "(line 2901,col 7)-(line 2901,col 34)",
        "(line 2902,col 7)-(line 2902,col 15)",
        "(line 2904,col 7)-(line 2904,col 33)",
        "(line 2907,col 7)-(line 2907,col 16)",
        "(line 2909,col 7)-(line 2911,col 7)",
        "(line 2913,col 7)-(line 2913,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toRadians(double)",
      "begin_line": 2921,
      "end_line": 2939,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2923,col 9)-(line 2925,col 9)",
        "(line 2928,col 9)-(line 2928,col 49)",
        "(line 2929,col 9)-(line 2929,col 50)",
        "(line 2931,col 9)-(line 2931,col 38)",
        "(line 2932,col 9)-(line 2932,col 27)",
        "(line 2934,col 9)-(line 2934,col 74)",
        "(line 2935,col 9)-(line 2937,col 9)",
        "(line 2938,col 9)-(line 2938,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toDegrees(double)",
      "begin_line": 2946,
      "end_line": 2960,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2948,col 9)-(line 2950,col 9)",
        "(line 2953,col 9)-(line 2953,col 46)",
        "(line 2954,col 9)-(line 2954,col 50)",
        "(line 2956,col 9)-(line 2956,col 38)",
        "(line 2957,col 9)-(line 2957,col 27)",
        "(line 2959,col 9)-(line 2959,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(int)",
      "begin_line": 2967,
      "end_line": 2969,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2968,col 9)-(line 2968,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(long)",
      "begin_line": 2976,
      "end_line": 2978,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2977,col 9)-(line 2977,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(float)",
      "begin_line": 2985,
      "end_line": 2987,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2986,col 9)-(line 2986,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(double)",
      "begin_line": 2994,
      "end_line": 2996,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2995,col 9)-(line 2995,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(double)",
      "begin_line": 3003,
      "end_line": 3008,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3004,col 9)-(line 3006,col 9)",
        "(line 3007,col 9)-(line 3007,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(float)",
      "begin_line": 3015,
      "end_line": 3020,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3016,col 9)-(line 3018,col 9)",
        "(line 3019,col 9)-(line 3019,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(double, int)",
      "begin_line": 3028,
      "end_line": 3104,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3031,col 9)-(line 3033,col 9)",
        "(line 3036,col 9)-(line 3038,col 9)",
        "(line 3039,col 9)-(line 3041,col 9)",
        "(line 3042,col 9)-(line 3044,col 9)",
        "(line 3047,col 9)-(line 3047,col 53)",
        "(line 3048,col 9)-(line 3048,col 53)",
        "(line 3049,col 9)-(line 3049,col 56)",
        "(line 3050,col 9)-(line 3050,col 53)",
        "(line 3053,col 9)-(line 3053,col 42)",
        "(line 3055,col 9)-(line 3102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(float, int)",
      "begin_line": 3112,
      "end_line": 3188,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3115,col 9)-(line 3117,col 9)",
        "(line 3120,col 9)-(line 3122,col 9)",
        "(line 3123,col 9)-(line 3125,col 9)",
        "(line 3126,col 9)-(line 3128,col 9)",
        "(line 3131,col 9)-(line 3131,col 49)",
        "(line 3132,col 9)-(line 3132,col 43)",
        "(line 3133,col 9)-(line 3133,col 46)",
        "(line 3134,col 9)-(line 3134,col 43)",
        "(line 3137,col 9)-(line 3137,col 42)",
        "(line 3139,col 9)-(line 3186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(double, double)",
      "begin_line": 3221,
      "end_line": 3244,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3224,col 9)-(line 3232,col 9)",
        "(line 3236,col 9)-(line 3236,col 53)",
        "(line 3237,col 9)-(line 3237,col 53)",
        "(line 3238,col 9)-(line 3242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(float, double)",
      "begin_line": 3277,
      "end_line": 3300,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3280,col 9)-(line 3288,col 9)",
        "(line 3292,col 9)-(line 3292,col 49)",
        "(line 3293,col 9)-(line 3293,col 43)",
        "(line 3294,col 9)-(line 3298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.floor(double)",
      "begin_line": 3306,
      "end_line": 3327,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3307,col 9)-(line 3307,col 15)",
        "(line 3309,col 9)-(line 3311,col 9)",
        "(line 3313,col 9)-(line 3315,col 9)",
        "(line 3317,col 9)-(line 3317,col 21)",
        "(line 3318,col 9)-(line 3320,col 9)",
        "(line 3322,col 9)-(line 3324,col 9)",
        "(line 3326,col 9)-(line 3326,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ceil(double)",
      "begin_line": 3333,
      "end_line": 3352,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3334,col 9)-(line 3334,col 17)",
        "(line 3336,col 9)-(line 3338,col 9)",
        "(line 3340,col 9)-(line 3340,col 21)",
        "(line 3341,col 9)-(line 3343,col 9)",
        "(line 3345,col 9)-(line 3345,col 17)",
        "(line 3347,col 9)-(line 3349,col 9)",
        "(line 3351,col 9)-(line 3351,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.rint(double)",
      "begin_line": 3358,
      "end_line": 3375,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3359,col 9)-(line 3359,col 28)",
        "(line 3360,col 9)-(line 3360,col 25)",
        "(line 3362,col 9)-(line 3367,col 9)",
        "(line 3368,col 9)-(line 3370,col 9)",
        "(line 3373,col 9)-(line 3373,col 26)",
        "(line 3374,col 9)-(line 3374,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(double)",
      "begin_line": 3381,
      "end_line": 3383,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3382,col 9)-(line 3382,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(float)",
      "begin_line": 3389,
      "end_line": 3391,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3390,col 9)-(line 3390,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(int, int)",
      "begin_line": 3398,
      "end_line": 3400,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3399,col 9)-(line 3399,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(long, long)",
      "begin_line": 3407,
      "end_line": 3409,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3408,col 9)-(line 3408,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(float, float)",
      "begin_line": 3416,
      "end_line": 3434,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3417,col 9)-(line 3419,col 9)",
        "(line 3420,col 9)-(line 3422,col 9)",
        "(line 3424,col 9)-(line 3426,col 9)",
        "(line 3429,col 9)-(line 3429,col 46)",
        "(line 3430,col 9)-(line 3432,col 9)",
        "(line 3433,col 9)-(line 3433,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(double, double)",
      "begin_line": 3441,
      "end_line": 3459,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3442,col 9)-(line 3444,col 9)",
        "(line 3445,col 9)-(line 3447,col 9)",
        "(line 3449,col 9)-(line 3451,col 9)",
        "(line 3454,col 9)-(line 3454,col 50)",
        "(line 3455,col 9)-(line 3457,col 9)",
        "(line 3458,col 9)-(line 3458,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(int, int)",
      "begin_line": 3466,
      "end_line": 3468,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3467,col 9)-(line 3467,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(long, long)",
      "begin_line": 3475,
      "end_line": 3477,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3476,col 9)-(line 3476,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(float, float)",
      "begin_line": 3484,
      "end_line": 3502,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3485,col 9)-(line 3487,col 9)",
        "(line 3488,col 9)-(line 3490,col 9)",
        "(line 3492,col 9)-(line 3494,col 9)",
        "(line 3497,col 9)-(line 3497,col 46)",
        "(line 3498,col 9)-(line 3500,col 9)",
        "(line 3501,col 9)-(line 3501,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(double, double)",
      "begin_line": 3509,
      "end_line": 3527,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3510,col 9)-(line 3512,col 9)",
        "(line 3513,col 9)-(line 3515,col 9)",
        "(line 3517,col 9)-(line 3519,col 9)",
        "(line 3522,col 9)-(line 3522,col 50)",
        "(line 3523,col 9)-(line 3525,col 9)",
        "(line 3526,col 9)-(line 3526,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.hypot(double, double)",
      "begin_line": 3543,
      "end_line": 3576,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3544,col 9)-(line 3575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3598,
      "end_line": 3600,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3599,col 9)-(line 3599,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(double, double)",
      "begin_line": 3610,
      "end_line": 3617,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3611,col 9)-(line 3611,col 52)",
        "(line 3612,col 9)-(line 3612,col 47)",
        "(line 3613,col 9)-(line 3615,col 9)",
        "(line 3616,col 9)-(line 3616,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(float, float)",
      "begin_line": 3627,
      "end_line": 3634,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3628,col 9)-(line 3628,col 48)",
        "(line 3629,col 9)-(line 3629,col 43)",
        "(line 3630,col 9)-(line 3632,col 9)",
        "(line 3633,col 9)-(line 3633,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(double)",
      "begin_line": 3645,
      "end_line": 3647,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3646,col 9)-(line 3646,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(float)",
      "begin_line": 3658,
      "end_line": 3660,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3659,col 9)-(line 3659,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.main(java.lang.String[])",
      "begin_line": 3667,
      "end_line": 3680,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3668,col 9)-(line 3668,col 37)",
        "(line 3669,col 9)-(line 3669,col 104)",
        "(line 3670,col 9)-(line 3670,col 104)",
        "(line 3671,col 9)-(line 3671,col 108)",
        "(line 3672,col 9)-(line 3672,col 108)",
        "(line 3673,col 9)-(line 3673,col 76)",
        "(line 3674,col 9)-(line 3674,col 83)",
        "(line 3675,col 9)-(line 3675,col 83)",
        "(line 3676,col 9)-(line 3676,col 87)",
        "(line 3677,col 9)-(line 3677,col 87)",
        "(line 3678,col 9)-(line 3678,col 89)",
        "(line 3679,col 9)-(line 3679,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3683,
      "end_line": 3719,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3687,
      "end_line": 3687,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3691,
      "end_line": 3691,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3722,
      "end_line": 3752,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3727,
      "end_line": 3727,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3731,
      "end_line": 3731,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3755,
      "end_line": 3772,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3757,
      "end_line": 3757,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "class_interface",
      "name": "CodyWaite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3775,
      "end_line": 3844,
      "comment": " Enclose the Cody/Waite reduction (used in \"sin\", \"cos\" and \"tan\"). "
    },
    {
      "type": "field",
      "varNames": [
        "finalK"
      ],
      "begin_line": 3777,
      "end_line": 3777,
      "comment": " k "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemA"
      ],
      "begin_line": 3779,
      "end_line": 3779,
      "comment": " remA "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemB"
      ],
      "begin_line": 3781,
      "end_line": 3781,
      "comment": " remB "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.CodyWaite(double, double)",
      "begin_line": 3787,
      "end_line": 3824,
      "comment": "\n         * @param xa Argument.\n         * @param xb Argument.\n         ",
      "child_ranges": [
        "(line 3791,col 13)-(line 3791,col 51)",
        "(line 3794,col 13)-(line 3794,col 24)",
        "(line 3795,col 13)-(line 3795,col 24)",
        "(line 3796,col 13)-(line 3819,col 13)",
        "(line 3821,col 13)-(line 3821,col 28)",
        "(line 3822,col 13)-(line 3822,col 34)",
        "(line 3823,col 13)-(line 3823,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getK()",
      "begin_line": 3829,
      "end_line": 3831,
      "comment": "\n         * @return k\n         ",
      "child_ranges": [
        "(line 3830,col 13)-(line 3830,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemA()",
      "begin_line": 3835,
      "end_line": 3837,
      "comment": "\n         * @return remA\n         ",
      "child_ranges": [
        "(line 3836,col 13)-(line 3836,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemB()",
      "begin_line": 3841,
      "end_line": 3843,
      "comment": "\n         * @return remB\n         ",
      "child_ranges": [
        "(line 3842,col 13)-(line 3842,col 29)"
      ]
    }
  ]
}