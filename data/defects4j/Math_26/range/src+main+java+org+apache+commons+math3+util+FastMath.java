{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 3777,
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
        "LN_2_A"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " log(2) (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_B"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " log(2) (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_QUICK_COEF"
      ],
      "begin_line": 113,
      "end_line": 123,
      "comment": " Coefficients for log, when input 0.99 \u003c x \u003c 1.01. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_HI_PREC_COEF"
      ],
      "begin_line": 126,
      "end_line": 133,
      "comment": " Coefficients for log in the range of 1.0 \u003c x \u003c 1.0 + 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_LEN"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Sine, Cosine, Tangent tables are for 0, 1/8, 2/8, ... 13/8 \u003d PI/2 approx. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_A"
      ],
      "begin_line": 139,
      "end_line": 155,
      "comment": " Sine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_B"
      ],
      "begin_line": 158,
      "end_line": 174,
      "comment": " Sine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_A"
      ],
      "begin_line": 177,
      "end_line": 193,
      "comment": " Cosine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_B"
      ],
      "begin_line": 196,
      "end_line": 212,
      "comment": " Cosine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_A"
      ],
      "begin_line": 216,
      "end_line": 232,
      "comment": " Tangent table, used by atan() (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_B"
      ],
      "begin_line": 235,
      "end_line": 251,
      "comment": " Tangent table, used by atan() (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "RECIP_2PI"
      ],
      "begin_line": 254,
      "end_line": 272,
      "comment": " Bits of 1/(2*pi), need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "PI_O_4_BITS"
      ],
      "begin_line": 275,
      "end_line": 277,
      "comment": " Bits of pi/4, need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "EIGHTHS"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Eighths.\n     * This is used by sinQ, because its faster to do a table lookup than\n     * a multiply in this time-critical routine\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CBRTTWO"
      ],
      "begin_line": 286,
      "end_line": 290,
      "comment": " Table of 2^((n+2)/3) "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_40000000"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " 1073741824L"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_30BITS"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " 0xFFFFFFFFC0000000L;"
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_52"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_3"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_5"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_7"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_9"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_11"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_13"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_15"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_17"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_3_4"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_15_16"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_13_14"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_11_12"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_9_10"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_7_8"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_5_6"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_2"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "F_1_4"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Constant: {@value}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.FastMath()",
      "begin_line": 349,
      "end_line": 349,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.doubleHighPart(double)",
      "begin_line": 360,
      "end_line": 367,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 45)",
        "(line 365,col 9)-(line 365,col 30)",
        "(line 366,col 9)-(line 366,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sqrt(double)",
      "begin_line": 374,
      "end_line": 376,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosh(double)",
      "begin_line": 382,
      "end_line": 435,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 383,col 7)-(line 385,col 7)",
        "(line 392,col 7)-(line 394,col 7)",
        "(line 396,col 7)-(line 398,col 7)",
        "(line 400,col 7)-(line 400,col 38)",
        "(line 401,col 7)-(line 403,col 7)",
        "(line 404,col 7)-(line 404,col 26)",
        "(line 406,col 7)-(line 406,col 40)",
        "(line 407,col 7)-(line 407,col 48)",
        "(line 409,col 7)-(line 409,col 38)",
        "(line 410,col 7)-(line 410,col 36)",
        "(line 411,col 7)-(line 411,col 28)",
        "(line 414,col 7)-(line 414,col 28)",
        "(line 415,col 7)-(line 415,col 34)",
        "(line 416,col 7)-(line 416,col 42)",
        "(line 417,col 7)-(line 417,col 37)",
        "(line 420,col 7)-(line 420,col 82)",
        "(line 422,col 7)-(line 422,col 36)",
        "(line 425,col 7)-(line 425,col 25)",
        "(line 426,col 7)-(line 426,col 34)",
        "(line 427,col 7)-(line 427,col 16)",
        "(line 428,col 7)-(line 428,col 25)",
        "(line 429,col 7)-(line 429,col 34)",
        "(line 430,col 7)-(line 430,col 16)",
        "(line 432,col 7)-(line 432,col 30)",
        "(line 433,col 7)-(line 433,col 20)",
        "(line 434,col 7)-(line 434,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinh(double)",
      "begin_line": 441,
      "end_line": 550,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 442,col 7)-(line 442,col 29)",
        "(line 443,col 7)-(line 445,col 7)",
        "(line 452,col 7)-(line 454,col 7)",
        "(line 456,col 7)-(line 458,col 7)",
        "(line 460,col 7)-(line 462,col 7)",
        "(line 464,col 7)-(line 467,col 7)",
        "(line 469,col 7)-(line 469,col 20)",
        "(line 471,col 7)-(line 543,col 7)",
        "(line 545,col 7)-(line 547,col 7)",
        "(line 549,col 7)-(line 549,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanh(double)",
      "begin_line": 556,
      "end_line": 674,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 557,col 7)-(line 557,col 29)",
        "(line 559,col 7)-(line 561,col 7)",
        "(line 569,col 7)-(line 571,col 7)",
        "(line 573,col 7)-(line 575,col 7)",
        "(line 577,col 7)-(line 579,col 7)",
        "(line 581,col 7)-(line 584,col 7)",
        "(line 586,col 7)-(line 586,col 20)",
        "(line 587,col 7)-(line 667,col 7)",
        "(line 669,col 7)-(line 671,col 7)",
        "(line 673,col 7)-(line 673,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acosh(double)",
      "begin_line": 680,
      "end_line": 682,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asinh(double)",
      "begin_line": 688,
      "end_line": 712,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 33)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 24)",
        "(line 696,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 711,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atanh(double)",
      "begin_line": 718,
      "end_line": 742,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
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
      "signature": "org.apache.commons.math3.util.FastMath.signum(double)",
      "begin_line": 749,
      "end_line": 751,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.signum(float)",
      "begin_line": 758,
      "end_line": 760,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(double)",
      "begin_line": 766,
      "end_line": 768,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextUp(float)",
      "begin_line": 774,
      "end_line": 776,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.random()",
      "begin_line": 782,
      "end_line": 784,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double)",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.exp(double, double, double[])",
      "begin_line": 817,
      "end_line": 932,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 24)",
        "(line 819,col 9)-(line 819,col 24)",
        "(line 820,col 9)-(line 820,col 19)",
        "(line 826,col 9)-(line 876,col 9)",
        "(line 882,col 9)-(line 882,col 58)",
        "(line 883,col 9)-(line 883,col 72)",
        "(line 884,col 9)-(line 884,col 72)",
        "(line 890,col 9)-(line 890,col 63)",
        "(line 899,col 9)-(line 899,col 39)",
        "(line 900,col 9)-(line 900,col 45)",
        "(line 901,col 9)-(line 901,col 45)",
        "(line 902,col 9)-(line 902,col 30)",
        "(line 903,col 9)-(line 903,col 49)",
        "(line 910,col 9)-(line 910,col 44)",
        "(line 911,col 9)-(line 911,col 90)",
        "(line 917,col 9)-(line 917,col 43)",
        "(line 918,col 9)-(line 918,col 28)",
        "(line 919,col 9)-(line 923,col 9)",
        "(line 925,col 9)-(line 929,col 9)",
        "(line 931,col 9)-(line 931,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double)",
      "begin_line": 938,
      "end_line": 940,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 939,col 7)-(line 939,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.expm1(double, double[])",
      "begin_line": 947,
      "end_line": 1087,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 967,col 21)",
        "(line 968,col 9)-(line 968,col 21)",
        "(line 969,col 9)-(line 969,col 23)",
        "(line 970,col 9)-(line 970,col 33)",
        "(line 972,col 9)-(line 975,col 9)",
        "(line 977,col 9)-(line 991,col 9)",
        "(line 995,col 9)-(line 995,col 41)",
        "(line 996,col 9)-(line 996,col 49)",
        "(line 997,col 9)-(line 997,col 48)",
        "(line 998,col 9)-(line 998,col 48)",
        "(line 999,col 9)-(line 999,col 26)",
        "(line 1000,col 9)-(line 1000,col 26)",
        "(line 1002,col 9)-(line 1002,col 28)",
        "(line 1003,col 9)-(line 1003,col 30)",
        "(line 1004,col 9)-(line 1004,col 31)",
        "(line 1005,col 9)-(line 1005,col 18)",
        "(line 1007,col 9)-(line 1007,col 33)",
        "(line 1008,col 9)-(line 1008,col 32)",
        "(line 1009,col 9)-(line 1009,col 24)",
        "(line 1010,col 9)-(line 1010,col 18)",
        "(line 1013,col 9)-(line 1013,col 31)",
        "(line 1015,col 9)-(line 1015,col 31)",
        "(line 1016,col 9)-(line 1016,col 46)",
        "(line 1017,col 9)-(line 1017,col 18)",
        "(line 1019,col 9)-(line 1019,col 31)",
        "(line 1020,col 9)-(line 1020,col 40)",
        "(line 1021,col 9)-(line 1021,col 18)",
        "(line 1023,col 9)-(line 1023,col 31)",
        "(line 1024,col 9)-(line 1024,col 38)",
        "(line 1025,col 9)-(line 1025,col 18)",
        "(line 1029,col 9)-(line 1029,col 26)",
        "(line 1030,col 9)-(line 1030,col 35)",
        "(line 1031,col 9)-(line 1031,col 18)",
        "(line 1033,col 9)-(line 1033,col 23)",
        "(line 1035,col 9)-(line 1035,col 32)",
        "(line 1036,col 9)-(line 1036,col 18)",
        "(line 1038,col 9)-(line 1038,col 26)",
        "(line 1040,col 9)-(line 1040,col 35)",
        "(line 1041,col 9)-(line 1041,col 18)",
        "(line 1043,col 9)-(line 1043,col 23)",
        "(line 1045,col 9)-(line 1045,col 32)",
        "(line 1046,col 9)-(line 1046,col 18)",
        "(line 1048,col 9)-(line 1079,col 9)",
        "(line 1081,col 9)-(line 1084,col 9)",
        "(line 1086,col 9)-(line 1086,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double)",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double[])",
      "begin_line": 1105,
      "end_line": 1325,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1108,col 9)",
        "(line 1109,col 9)-(line 1109,col 47)",
        "(line 1112,col 9)-(line 1120,col 9)",
        "(line 1123,col 9)-(line 1129,col 9)",
        "(line 1132,col 9)-(line 1132,col 41)",
        "(line 1134,col 9)-(line 1151,col 9)",
        "(line 1154,col 9)-(line 1199,col 9)",
        "(line 1202,col 9)-(line 1202,col 81)",
        "(line 1213,col 9)-(line 1213,col 97)",
        "(line 1215,col 9)-(line 1215,col 26)",
        "(line 1216,col 9)-(line 1216,col 26)",
        "(line 1218,col 9)-(line 1276,col 9)",
        "(line 1292,col 9)-(line 1292,col 30)",
        "(line 1293,col 9)-(line 1293,col 23)",
        "(line 1294,col 9)-(line 1294,col 28)",
        "(line 1295,col 9)-(line 1295,col 33)",
        "(line 1296,col 9)-(line 1296,col 14)",
        "(line 1297,col 9)-(line 1297,col 18)",
        "(line 1299,col 9)-(line 1299,col 21)",
        "(line 1300,col 9)-(line 1300,col 28)",
        "(line 1301,col 9)-(line 1301,col 14)",
        "(line 1302,col 9)-(line 1302,col 18)",
        "(line 1304,col 9)-(line 1304,col 27)",
        "(line 1305,col 9)-(line 1305,col 34)",
        "(line 1306,col 9)-(line 1306,col 14)",
        "(line 1307,col 9)-(line 1307,col 18)",
        "(line 1309,col 9)-(line 1309,col 23)",
        "(line 1310,col 9)-(line 1310,col 30)",
        "(line 1311,col 9)-(line 1311,col 14)",
        "(line 1312,col 9)-(line 1312,col 18)",
        "(line 1314,col 9)-(line 1314,col 21)",
        "(line 1315,col 9)-(line 1315,col 28)",
        "(line 1316,col 9)-(line 1316,col 14)",
        "(line 1317,col 9)-(line 1317,col 18)",
        "(line 1319,col 9)-(line 1322,col 9)",
        "(line 1324,col 9)-(line 1324,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log1p(double)",
      "begin_line": 1331,
      "end_line": 1368,
      "comment": " Compute log(1 + x).\n     * @param x a number\n     * @return log(1 + x)\n     ",
      "child_ranges": [
        "(line 1333,col 9)-(line 1335,col 9)",
        "(line 1337,col 9)-(line 1339,col 9)",
        "(line 1341,col 9)-(line 1360,col 9)",
        "(line 1363,col 9)-(line 1363,col 37)",
        "(line 1364,col 9)-(line 1364,col 24)",
        "(line 1365,col 9)-(line 1365,col 18)",
        "(line 1367,col 9)-(line 1367,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log10(double)",
      "begin_line": 1374,
      "end_line": 1390,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 46)",
        "(line 1377,col 9)-(line 1377,col 44)",
        "(line 1378,col 9)-(line 1380,col 9)",
        "(line 1382,col 9)-(line 1382,col 52)",
        "(line 1383,col 9)-(line 1383,col 49)",
        "(line 1384,col 9)-(line 1384,col 55)",
        "(line 1386,col 9)-(line 1386,col 49)",
        "(line 1387,col 9)-(line 1387,col 52)",
        "(line 1389,col 9)-(line 1389,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double)",
      "begin_line": 1408,
      "end_line": 1410,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003e\n     * logarithm\u003c/a\u003e in a given base.\n     *\n     * Returns {@code NaN} if either argument is negative.\n     * If {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.\n     * If both arguments are 0, the result is {@code NaN}.\n     *\n     * @param base Base of the logarithm, must be greater than 0.\n     * @param x Argument, must be greater than 0.\n     * @return the value of the logarithm, i.e. the number {@code y} such that\n     * \u003ccode\u003ebase\u003csup\u003ey\u003c/sup\u003e \u003d x\u003c/code\u003e.\n     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 1409,col 9)-(line 1409,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, double)",
      "begin_line": 1419,
      "end_line": 1577,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1420,col 43)",
        "(line 1422,col 9)-(line 1424,col 9)",
        "(line 1426,col 9)-(line 1428,col 9)",
        "(line 1431,col 9)-(line 1454,col 9)",
        "(line 1456,col 9)-(line 1465,col 9)",
        "(line 1467,col 9)-(line 1477,col 9)",
        "(line 1479,col 9)-(line 1501,col 9)",
        "(line 1503,col 9)-(line 1514,col 9)",
        "(line 1517,col 9)-(line 1529,col 9)",
        "(line 1532,col 9)-(line 1532,col 18)",
        "(line 1533,col 9)-(line 1533,col 18)",
        "(line 1534,col 9)-(line 1543,col 9)",
        "(line 1546,col 9)-(line 1546,col 41)",
        "(line 1547,col 9)-(line 1549,col 9)",
        "(line 1551,col 9)-(line 1551,col 28)",
        "(line 1552,col 9)-(line 1552,col 28)",
        "(line 1555,col 9)-(line 1555,col 41)",
        "(line 1556,col 9)-(line 1556,col 40)",
        "(line 1557,col 9)-(line 1557,col 26)",
        "(line 1558,col 9)-(line 1558,col 19)",
        "(line 1561,col 9)-(line 1561,col 35)",
        "(line 1562,col 9)-(line 1562,col 57)",
        "(line 1564,col 9)-(line 1564,col 20)",
        "(line 1565,col 9)-(line 1565,col 31)",
        "(line 1567,col 9)-(line 1567,col 31)",
        "(line 1568,col 9)-(line 1568,col 35)",
        "(line 1569,col 9)-(line 1569,col 34)",
        "(line 1570,col 9)-(line 1570,col 26)",
        "(line 1571,col 9)-(line 1571,col 26)",
        "(line 1572,col 9)-(line 1572,col 20)",
        "(line 1574,col 9)-(line 1574,col 48)",
        "(line 1576,col 9)-(line 1576,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polySine(double)",
      "begin_line": 1586,
      "end_line": 1599,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 24)",
        "(line 1590,col 9)-(line 1590,col 41)",
        "(line 1591,col 9)-(line 1591,col 44)",
        "(line 1592,col 9)-(line 1592,col 42)",
        "(line 1593,col 9)-(line 1593,col 42)",
        "(line 1596,col 9)-(line 1596,col 23)",
        "(line 1598,col 9)-(line 1598,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polyCosine(double)",
      "begin_line": 1607,
      "end_line": 1617,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1608,col 24)",
        "(line 1610,col 9)-(line 1610,col 40)",
        "(line 1611,col 9)-(line 1611,col 44)",
        "(line 1612,col 9)-(line 1612,col 42)",
        "(line 1613,col 9)-(line 1613,col 42)",
        "(line 1614,col 9)-(line 1614,col 16)",
        "(line 1616,col 9)-(line 1616,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinQ(double, double)",
      "begin_line": 1626,
      "end_line": 1741,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 43)",
        "(line 1628,col 9)-(line 1628,col 49)",
        "(line 1631,col 9)-(line 1631,col 47)",
        "(line 1632,col 9)-(line 1632,col 47)",
        "(line 1633,col 9)-(line 1633,col 49)",
        "(line 1634,col 9)-(line 1634,col 49)",
        "(line 1637,col 9)-(line 1637,col 33)",
        "(line 1638,col 9)-(line 1638,col 43)",
        "(line 1639,col 9)-(line 1639,col 35)",
        "(line 1640,col 9)-(line 1640,col 51)",
        "(line 1643,col 9)-(line 1643,col 51)",
        "(line 1644,col 9)-(line 1644,col 47)",
        "(line 1645,col 9)-(line 1645,col 36)",
        "(line 1646,col 9)-(line 1646,col 24)",
        "(line 1649,col 9)-(line 1649,col 22)",
        "(line 1672,col 9)-(line 1672,col 21)",
        "(line 1673,col 9)-(line 1673,col 21)",
        "(line 1675,col 9)-(line 1675,col 25)",
        "(line 1676,col 9)-(line 1676,col 25)",
        "(line 1677,col 9)-(line 1677,col 32)",
        "(line 1678,col 9)-(line 1678,col 14)",
        "(line 1679,col 9)-(line 1679,col 18)",
        "(line 1681,col 9)-(line 1681,col 28)",
        "(line 1682,col 9)-(line 1682,col 18)",
        "(line 1683,col 9)-(line 1683,col 25)",
        "(line 1684,col 9)-(line 1684,col 14)",
        "(line 1685,col 9)-(line 1685,col 18)",
        "(line 1687,col 9)-(line 1687,col 50)",
        "(line 1702,col 9)-(line 1702,col 76)",
        "(line 1729,col 9)-(line 1736,col 9)",
        "(line 1738,col 9)-(line 1738,col 23)",
        "(line 1740,col 9)-(line 1740,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosQ(double, double)",
      "begin_line": 1750,
      "end_line": 1759,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1751,col 9)-(line 1751,col 47)",
        "(line 1752,col 9)-(line 1752,col 50)",
        "(line 1754,col 9)-(line 1754,col 35)",
        "(line 1755,col 9)-(line 1755,col 36)",
        "(line 1756,col 9)-(line 1756,col 23)",
        "(line 1758,col 9)-(line 1758,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1769,
      "end_line": 1904,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1771,col 9)-(line 1771,col 43)",
        "(line 1772,col 9)-(line 1772,col 49)",
        "(line 1775,col 9)-(line 1775,col 47)",
        "(line 1776,col 9)-(line 1776,col 47)",
        "(line 1777,col 9)-(line 1777,col 49)",
        "(line 1778,col 9)-(line 1778,col 49)",
        "(line 1781,col 9)-(line 1781,col 33)",
        "(line 1782,col 9)-(line 1782,col 43)",
        "(line 1783,col 9)-(line 1783,col 35)",
        "(line 1784,col 9)-(line 1784,col 51)",
        "(line 1787,col 9)-(line 1787,col 45)",
        "(line 1788,col 9)-(line 1788,col 47)",
        "(line 1789,col 9)-(line 1789,col 36)",
        "(line 1790,col 9)-(line 1790,col 24)",
        "(line 1815,col 9)-(line 1815,col 21)",
        "(line 1816,col 9)-(line 1816,col 21)",
        "(line 1819,col 9)-(line 1819,col 25)",
        "(line 1820,col 9)-(line 1820,col 25)",
        "(line 1821,col 9)-(line 1821,col 32)",
        "(line 1822,col 9)-(line 1822,col 14)",
        "(line 1823,col 9)-(line 1823,col 18)",
        "(line 1825,col 9)-(line 1825,col 26)",
        "(line 1826,col 9)-(line 1826,col 18)",
        "(line 1827,col 9)-(line 1827,col 25)",
        "(line 1828,col 9)-(line 1828,col 14)",
        "(line 1829,col 9)-(line 1829,col 18)",
        "(line 1831,col 9)-(line 1831,col 46)",
        "(line 1832,col 9)-(line 1832,col 70)",
        "(line 1834,col 9)-(line 1834,col 28)",
        "(line 1835,col 9)-(line 1835,col 38)",
        "(line 1839,col 9)-(line 1839,col 28)",
        "(line 1841,col 9)-(line 1841,col 26)",
        "(line 1842,col 9)-(line 1842,col 18)",
        "(line 1843,col 9)-(line 1843,col 25)",
        "(line 1844,col 9)-(line 1844,col 14)",
        "(line 1845,col 9)-(line 1845,col 18)",
        "(line 1847,col 9)-(line 1847,col 27)",
        "(line 1848,col 9)-(line 1848,col 18)",
        "(line 1849,col 9)-(line 1849,col 25)",
        "(line 1850,col 9)-(line 1850,col 14)",
        "(line 1851,col 9)-(line 1851,col 18)",
        "(line 1853,col 9)-(line 1853,col 62)",
        "(line 1854,col 9)-(line 1854,col 64)",
        "(line 1856,col 9)-(line 1856,col 28)",
        "(line 1857,col 9)-(line 1857,col 38)",
        "(line 1859,col 9)-(line 1863,col 9)",
        "(line 1876,col 9)-(line 1876,col 31)",
        "(line 1879,col 9)-(line 1879,col 34)",
        "(line 1880,col 9)-(line 1880,col 42)",
        "(line 1881,col 9)-(line 1881,col 34)",
        "(line 1883,col 9)-(line 1883,col 35)",
        "(line 1884,col 9)-(line 1884,col 44)",
        "(line 1885,col 9)-(line 1885,col 37)",
        "(line 1888,col 9)-(line 1888,col 85)",
        "(line 1889,col 9)-(line 1889,col 25)",
        "(line 1890,col 9)-(line 1890,col 42)",
        "(line 1892,col 9)-(line 1901,col 9)",
        "(line 1903,col 9)-(line 1903,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 1917,
      "end_line": 2127,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1920,col 9)-(line 1920,col 49)",
        "(line 1921,col 9)-(line 1921,col 61)",
        "(line 1924,col 9)-(line 1924,col 38)",
        "(line 1925,col 9)-(line 1925,col 38)",
        "(line 1928,col 9)-(line 1928,col 19)",
        "(line 1929,col 9)-(line 1929,col 22)",
        "(line 1932,col 9)-(line 1932,col 19)",
        "(line 1933,col 9)-(line 1933,col 19)",
        "(line 1934,col 9)-(line 1934,col 19)",
        "(line 1935,col 9)-(line 1935,col 32)",
        "(line 1936,col 9)-(line 1936,col 42)",
        "(line 1938,col 9)-(line 1947,col 9)",
        "(line 1950,col 9)-(line 1950,col 31)",
        "(line 1951,col 9)-(line 1951,col 38)",
        "(line 1953,col 9)-(line 1953,col 30)",
        "(line 1954,col 9)-(line 1954,col 37)",
        "(line 1956,col 9)-(line 1956,col 24)",
        "(line 1957,col 9)-(line 1957,col 24)",
        "(line 1958,col 9)-(line 1958,col 24)",
        "(line 1959,col 9)-(line 1959,col 24)",
        "(line 1961,col 9)-(line 1961,col 37)",
        "(line 1962,col 9)-(line 1962,col 38)",
        "(line 1964,col 9)-(line 1964,col 55)",
        "(line 1965,col 9)-(line 1965,col 48)",
        "(line 1966,col 9)-(line 1966,col 60)",
        "(line 1969,col 9)-(line 1972,col 9)",
        "(line 1974,col 9)-(line 1974,col 50)",
        "(line 1975,col 9)-(line 1975,col 40)",
        "(line 1977,col 9)-(line 1977,col 35)",
        "(line 1978,col 9)-(line 1978,col 36)",
        "(line 1980,col 9)-(line 1980,col 52)",
        "(line 1983,col 9)-(line 1986,col 9)",
        "(line 1989,col 9)-(line 1989,col 25)",
        "(line 1990,col 9)-(line 1990,col 32)",
        "(line 1991,col 9)-(line 1991,col 19)",
        "(line 1992,col 9)-(line 1992,col 19)",
        "(line 1993,col 9)-(line 1993,col 19)",
        "(line 1996,col 9)-(line 1996,col 37)",
        "(line 1998,col 9)-(line 1998,col 50)",
        "(line 1999,col 9)-(line 1999,col 48)",
        "(line 2000,col 9)-(line 2000,col 20)",
        "(line 2001,col 9)-(line 2001,col 52)",
        "(line 2003,col 9)-(line 2006,col 9)",
        "(line 2009,col 9)-(line 2009,col 25)",
        "(line 2010,col 9)-(line 2010,col 32)",
        "(line 2012,col 9)-(line 2012,col 19)",
        "(line 2013,col 9)-(line 2013,col 19)",
        "(line 2014,col 9)-(line 2014,col 19)",
        "(line 2016,col 9)-(line 2016,col 40)",
        "(line 2028,col 9)-(line 2028,col 42)",
        "(line 2031,col 9)-(line 2031,col 20)",
        "(line 2032,col 9)-(line 2032,col 30)",
        "(line 2033,col 9)-(line 2033,col 20)",
        "(line 2036,col 9)-(line 2036,col 25)",
        "(line 2037,col 9)-(line 2037,col 32)",
        "(line 2039,col 9)-(line 2039,col 34)",
        "(line 2040,col 9)-(line 2040,col 41)",
        "(line 2042,col 9)-(line 2042,col 19)",
        "(line 2043,col 9)-(line 2043,col 19)",
        "(line 2044,col 9)-(line 2044,col 19)",
        "(line 2045,col 9)-(line 2045,col 19)",
        "(line 2047,col 9)-(line 2047,col 38)",
        "(line 2048,col 9)-(line 2048,col 39)",
        "(line 2050,col 9)-(line 2050,col 47)",
        "(line 2051,col 9)-(line 2051,col 40)",
        "(line 2052,col 9)-(line 2052,col 53)",
        "(line 2055,col 9)-(line 2058,col 9)",
        "(line 2060,col 9)-(line 2060,col 51)",
        "(line 2061,col 9)-(line 2061,col 40)",
        "(line 2063,col 9)-(line 2063,col 37)",
        "(line 2064,col 9)-(line 2064,col 38)",
        "(line 2066,col 9)-(line 2066,col 53)",
        "(line 2069,col 9)-(line 2072,col 9)",
        "(line 2075,col 9)-(line 2075,col 34)",
        "(line 2076,col 9)-(line 2076,col 41)",
        "(line 2077,col 9)-(line 2077,col 19)",
        "(line 2078,col 9)-(line 2078,col 19)",
        "(line 2079,col 9)-(line 2079,col 19)",
        "(line 2082,col 9)-(line 2082,col 37)",
        "(line 2084,col 9)-(line 2084,col 51)",
        "(line 2085,col 9)-(line 2085,col 48)",
        "(line 2086,col 9)-(line 2086,col 21)",
        "(line 2087,col 9)-(line 2087,col 53)",
        "(line 2089,col 9)-(line 2092,col 9)",
        "(line 2095,col 9)-(line 2095,col 25)",
        "(line 2096,col 9)-(line 2096,col 32)",
        "(line 2097,col 9)-(line 2097,col 34)",
        "(line 2098,col 9)-(line 2098,col 41)",
        "(line 2099,col 9)-(line 2099,col 19)",
        "(line 2100,col 9)-(line 2100,col 19)",
        "(line 2101,col 9)-(line 2101,col 19)",
        "(line 2104,col 9)-(line 2104,col 37)",
        "(line 2106,col 9)-(line 2106,col 51)",
        "(line 2107,col 9)-(line 2107,col 48)",
        "(line 2108,col 9)-(line 2108,col 21)",
        "(line 2109,col 9)-(line 2109,col 53)",
        "(line 2111,col 9)-(line 2114,col 9)",
        "(line 2117,col 9)-(line 2117,col 53)",
        "(line 2118,col 9)-(line 2118,col 98)",
        "(line 2120,col 9)-(line 2120,col 34)",
        "(line 2121,col 9)-(line 2121,col 44)",
        "(line 2124,col 9)-(line 2124,col 28)",
        "(line 2125,col 9)-(line 2125,col 31)",
        "(line 2126,col 9)-(line 2126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sin(double)",
      "begin_line": 2135,
      "end_line": 2194,
      "comment": "\n     * Sine function.\n     *\n     * @param x Argument.\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 2136,col 9)-(line 2136,col 33)",
        "(line 2137,col 9)-(line 2137,col 25)",
        "(line 2138,col 9)-(line 2138,col 18)",
        "(line 2139,col 9)-(line 2139,col 24)",
        "(line 2142,col 9)-(line 2142,col 15)",
        "(line 2143,col 9)-(line 2146,col 9)",
        "(line 2149,col 9)-(line 2155,col 9)",
        "(line 2157,col 9)-(line 2159,col 9)",
        "(line 2162,col 9)-(line 2176,col 9)",
        "(line 2178,col 9)-(line 2180,col 9)",
        "(line 2182,col 9)-(line 2193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cos(double)",
      "begin_line": 2202,
      "end_line": 2248,
      "comment": "\n     * Cosine function.\n     *\n     * @param x Argument.\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 2203,col 9)-(line 2203,col 25)",
        "(line 2206,col 9)-(line 2206,col 22)",
        "(line 2207,col 9)-(line 2209,col 9)",
        "(line 2211,col 9)-(line 2213,col 9)",
        "(line 2216,col 9)-(line 2216,col 22)",
        "(line 2217,col 9)-(line 2231,col 9)",
        "(line 2236,col 9)-(line 2247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tan(double)",
      "begin_line": 2256,
      "end_line": 2325,
      "comment": "\n     * Tangent function.\n     *\n     * @param x Argument.\n     * @return tan(x)\n     ",
      "child_ranges": [
        "(line 2257,col 9)-(line 2257,col 33)",
        "(line 2258,col 9)-(line 2258,col 25)",
        "(line 2261,col 9)-(line 2261,col 22)",
        "(line 2262,col 9)-(line 2265,col 9)",
        "(line 2268,col 9)-(line 2274,col 9)",
        "(line 2276,col 9)-(line 2278,col 9)",
        "(line 2281,col 9)-(line 2281,col 22)",
        "(line 2282,col 9)-(line 2296,col 9)",
        "(line 2298,col 9)-(line 2311,col 9)",
        "(line 2313,col 9)-(line 2313,col 22)",
        "(line 2314,col 9)-(line 2318,col 9)",
        "(line 2320,col 9)-(line 2322,col 9)",
        "(line 2324,col 9)-(line 2324,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double)",
      "begin_line": 2332,
      "end_line": 2334,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2333,col 9)-(line 2333,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2342,
      "end_line": 2481,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2343,col 9)-(line 2343,col 31)",
        "(line 2344,col 9)-(line 2344,col 16)",
        "(line 2346,col 9)-(line 2348,col 9)",
        "(line 2350,col 9)-(line 2355,col 9)",
        "(line 2357,col 9)-(line 2359,col 9)",
        "(line 2362,col 9)-(line 2367,col 9)",
        "(line 2368,col 9)-(line 2368,col 48)",
        "(line 2369,col 9)-(line 2369,col 58)",
        "(line 2370,col 9)-(line 2370,col 42)",
        "(line 2372,col 9)-(line 2372,col 34)",
        "(line 2373,col 9)-(line 2373,col 37)",
        "(line 2374,col 9)-(line 2374,col 20)",
        "(line 2377,col 9)-(line 2377,col 33)",
        "(line 2378,col 9)-(line 2378,col 37)",
        "(line 2379,col 9)-(line 2379,col 33)",
        "(line 2380,col 9)-(line 2380,col 16)",
        "(line 2381,col 9)-(line 2381,col 17)",
        "(line 2384,col 9)-(line 2416,col 9)",
        "(line 2419,col 9)-(line 2419,col 18)",
        "(line 2420,col 9)-(line 2420,col 18)",
        "(line 2423,col 9)-(line 2423,col 41)",
        "(line 2434,col 9)-(line 2434,col 33)",
        "(line 2435,col 9)-(line 2435,col 47)",
        "(line 2436,col 9)-(line 2436,col 46)",
        "(line 2437,col 9)-(line 2437,col 46)",
        "(line 2438,col 9)-(line 2438,col 46)",
        "(line 2439,col 9)-(line 2439,col 47)",
        "(line 2440,col 9)-(line 2440,col 31)",
        "(line 2443,col 9)-(line 2443,col 18)",
        "(line 2445,col 9)-(line 2445,col 23)",
        "(line 2446,col 9)-(line 2446,col 31)",
        "(line 2447,col 9)-(line 2447,col 18)",
        "(line 2450,col 9)-(line 2450,col 40)",
        "(line 2453,col 9)-(line 2453,col 38)",
        "(line 2454,col 9)-(line 2454,col 46)",
        "(line 2455,col 9)-(line 2455,col 23)",
        "(line 2456,col 9)-(line 2456,col 32)",
        "(line 2457,col 9)-(line 2457,col 18)",
        "(line 2459,col 9)-(line 2459,col 32)",
        "(line 2460,col 9)-(line 2460,col 45)",
        "(line 2462,col 9)-(line 2473,col 9)",
        "(line 2476,col 9)-(line 2478,col 9)",
        "(line 2480,col 9)-(line 2480,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan2(double, double)",
      "begin_line": 2489,
      "end_line": 2604,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2490,col 9)-(line 2492,col 9)",
        "(line 2494,col 9)-(line 2516,col 9)",
        "(line 2520,col 9)-(line 2530,col 9)",
        "(line 2532,col 9)-(line 2542,col 9)",
        "(line 2544,col 9)-(line 2552,col 9)",
        "(line 2554,col 9)-(line 2563,col 9)",
        "(line 2567,col 9)-(line 2575,col 9)",
        "(line 2578,col 9)-(line 2578,col 31)",
        "(line 2579,col 9)-(line 2581,col 9)",
        "(line 2583,col 9)-(line 2583,col 38)",
        "(line 2584,col 9)-(line 2584,col 27)",
        "(line 2587,col 9)-(line 2587,col 44)",
        "(line 2588,col 9)-(line 2588,col 33)",
        "(line 2590,col 9)-(line 2590,col 62)",
        "(line 2592,col 9)-(line 2592,col 36)",
        "(line 2593,col 9)-(line 2593,col 31)",
        "(line 2594,col 9)-(line 2594,col 18)",
        "(line 2596,col 9)-(line 2598,col 9)",
        "(line 2601,col 9)-(line 2601,col 50)",
        "(line 2603,col 9)-(line 2603,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asin(double)",
      "begin_line": 2610,
      "end_line": 2680,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2611,col 7)-(line 2613,col 7)",
        "(line 2615,col 7)-(line 2617,col 7)",
        "(line 2619,col 7)-(line 2621,col 7)",
        "(line 2623,col 7)-(line 2625,col 7)",
        "(line 2627,col 7)-(line 2629,col 7)",
        "(line 2634,col 7)-(line 2634,col 37)",
        "(line 2635,col 7)-(line 2635,col 40)",
        "(line 2636,col 7)-(line 2636,col 31)",
        "(line 2639,col 7)-(line 2639,col 24)",
        "(line 2640,col 7)-(line 2640,col 36)",
        "(line 2643,col 7)-(line 2643,col 15)",
        "(line 2644,col 7)-(line 2644,col 15)",
        "(line 2646,col 7)-(line 2646,col 27)",
        "(line 2647,col 7)-(line 2647,col 35)",
        "(line 2649,col 7)-(line 2649,col 21)",
        "(line 2650,col 7)-(line 2650,col 30)",
        "(line 2651,col 7)-(line 2651,col 16)",
        "(line 2654,col 7)-(line 2654,col 15)",
        "(line 2655,col 7)-(line 2655,col 19)",
        "(line 2656,col 7)-(line 2656,col 30)",
        "(line 2657,col 7)-(line 2657,col 27)",
        "(line 2658,col 7)-(line 2658,col 18)",
        "(line 2661,col 7)-(line 2661,col 53)",
        "(line 2664,col 7)-(line 2664,col 31)",
        "(line 2667,col 7)-(line 2667,col 21)",
        "(line 2668,col 7)-(line 2668,col 30)",
        "(line 2669,col 7)-(line 2669,col 34)",
        "(line 2670,col 7)-(line 2670,col 25)",
        "(line 2672,col 7)-(line 2672,col 52)",
        "(line 2673,col 7)-(line 2673,col 28)",
        "(line 2675,col 7)-(line 2675,col 21)",
        "(line 2676,col 7)-(line 2676,col 29)",
        "(line 2677,col 7)-(line 2677,col 16)",
        "(line 2679,col 7)-(line 2679,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acos(double)",
      "begin_line": 2686,
      "end_line": 2762,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2687,col 7)-(line 2689,col 7)",
        "(line 2691,col 7)-(line 2693,col 7)",
        "(line 2695,col 7)-(line 2697,col 7)",
        "(line 2699,col 7)-(line 2701,col 7)",
        "(line 2703,col 7)-(line 2705,col 7)",
        "(line 2710,col 7)-(line 2710,col 37)",
        "(line 2711,col 7)-(line 2711,col 40)",
        "(line 2712,col 7)-(line 2712,col 31)",
        "(line 2715,col 7)-(line 2715,col 24)",
        "(line 2716,col 7)-(line 2716,col 36)",
        "(line 2719,col 7)-(line 2719,col 15)",
        "(line 2720,col 7)-(line 2720,col 15)",
        "(line 2722,col 7)-(line 2722,col 27)",
        "(line 2723,col 7)-(line 2723,col 35)",
        "(line 2725,col 7)-(line 2725,col 21)",
        "(line 2726,col 7)-(line 2726,col 30)",
        "(line 2727,col 7)-(line 2727,col 16)",
        "(line 2730,col 7)-(line 2730,col 26)",
        "(line 2731,col 7)-(line 2731,col 30)",
        "(line 2732,col 7)-(line 2732,col 27)",
        "(line 2733,col 7)-(line 2733,col 18)",
        "(line 2736,col 7)-(line 2736,col 53)",
        "(line 2739,col 7)-(line 2739,col 25)",
        "(line 2740,col 7)-(line 2740,col 16)",
        "(line 2741,col 7)-(line 2741,col 26)",
        "(line 2744,col 7)-(line 2744,col 21)",
        "(line 2747,col 7)-(line 2749,col 7)",
        "(line 2751,col 7)-(line 2751,col 36)",
        "(line 2752,col 7)-(line 2752,col 25)",
        "(line 2754,col 7)-(line 2754,col 52)",
        "(line 2755,col 7)-(line 2755,col 19)",
        "(line 2757,col 7)-(line 2757,col 21)",
        "(line 2758,col 7)-(line 2758,col 29)",
        "(line 2759,col 7)-(line 2759,col 16)",
        "(line 2761,col 7)-(line 2761,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cbrt(double)",
      "begin_line": 2768,
      "end_line": 2846,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2770,col 7)-(line 2770,col 47)",
        "(line 2771,col 7)-(line 2771,col 59)",
        "(line 2772,col 7)-(line 2772,col 32)",
        "(line 2774,col 7)-(line 2784,col 7)",
        "(line 2786,col 7)-(line 2789,col 7)",
        "(line 2792,col 7)-(line 2792,col 30)",
        "(line 2795,col 7)-(line 2796,col 81)",
        "(line 2799,col 7)-(line 2799,col 104)",
        "(line 2802,col 7)-(line 2802,col 41)",
        "(line 2803,col 7)-(line 2803,col 44)",
        "(line 2804,col 7)-(line 2804,col 45)",
        "(line 2805,col 7)-(line 2805,col 44)",
        "(line 2806,col 7)-(line 2806,col 44)",
        "(line 2808,col 7)-(line 2808,col 39)",
        "(line 2813,col 7)-(line 2813,col 39)",
        "(line 2814,col 7)-(line 2814,col 46)",
        "(line 2815,col 7)-(line 2815,col 46)",
        "(line 2818,col 7)-(line 2818,col 39)",
        "(line 2819,col 7)-(line 2819,col 36)",
        "(line 2820,col 7)-(line 2820,col 27)",
        "(line 2822,col 7)-(line 2822,col 26)",
        "(line 2823,col 7)-(line 2823,col 42)",
        "(line 2824,col 7)-(line 2824,col 31)",
        "(line 2825,col 7)-(line 2825,col 38)",
        "(line 2826,col 7)-(line 2826,col 23)",
        "(line 2827,col 7)-(line 2827,col 17)",
        "(line 2829,col 7)-(line 2829,col 39)",
        "(line 2830,col 7)-(line 2830,col 19)",
        "(line 2832,col 7)-(line 2832,col 26)",
        "(line 2833,col 7)-(line 2833,col 34)",
        "(line 2834,col 7)-(line 2834,col 15)",
        "(line 2836,col 7)-(line 2836,col 33)",
        "(line 2839,col 7)-(line 2839,col 16)",
        "(line 2841,col 7)-(line 2843,col 7)",
        "(line 2845,col 7)-(line 2845,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toRadians(double)",
      "begin_line": 2853,
      "end_line": 2871,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2855,col 9)-(line 2857,col 9)",
        "(line 2860,col 9)-(line 2860,col 49)",
        "(line 2861,col 9)-(line 2861,col 50)",
        "(line 2863,col 9)-(line 2863,col 38)",
        "(line 2864,col 9)-(line 2864,col 27)",
        "(line 2866,col 9)-(line 2866,col 74)",
        "(line 2867,col 9)-(line 2869,col 9)",
        "(line 2870,col 9)-(line 2870,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toDegrees(double)",
      "begin_line": 2878,
      "end_line": 2892,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2880,col 9)-(line 2882,col 9)",
        "(line 2885,col 9)-(line 2885,col 46)",
        "(line 2886,col 9)-(line 2886,col 50)",
        "(line 2888,col 9)-(line 2888,col 38)",
        "(line 2889,col 9)-(line 2889,col 27)",
        "(line 2891,col 9)-(line 2891,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(int)",
      "begin_line": 2899,
      "end_line": 2901,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2900,col 9)-(line 2900,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(long)",
      "begin_line": 2908,
      "end_line": 2910,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2909,col 9)-(line 2909,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(float)",
      "begin_line": 2917,
      "end_line": 2919,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2918,col 9)-(line 2918,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(double)",
      "begin_line": 2926,
      "end_line": 2928,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2927,col 9)-(line 2927,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(double)",
      "begin_line": 2935,
      "end_line": 2940,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 2936,col 9)-(line 2938,col 9)",
        "(line 2939,col 9)-(line 2939,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(float)",
      "begin_line": 2947,
      "end_line": 2952,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 2948,col 9)-(line 2950,col 9)",
        "(line 2951,col 9)-(line 2951,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(double, int)",
      "begin_line": 2960,
      "end_line": 3036,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 2963,col 9)-(line 2965,col 9)",
        "(line 2968,col 9)-(line 2970,col 9)",
        "(line 2971,col 9)-(line 2973,col 9)",
        "(line 2974,col 9)-(line 2976,col 9)",
        "(line 2979,col 9)-(line 2979,col 53)",
        "(line 2980,col 9)-(line 2980,col 53)",
        "(line 2981,col 9)-(line 2981,col 56)",
        "(line 2982,col 9)-(line 2982,col 53)",
        "(line 2985,col 9)-(line 2985,col 42)",
        "(line 2987,col 9)-(line 3034,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(float, int)",
      "begin_line": 3044,
      "end_line": 3120,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3047,col 9)-(line 3049,col 9)",
        "(line 3052,col 9)-(line 3054,col 9)",
        "(line 3055,col 9)-(line 3057,col 9)",
        "(line 3058,col 9)-(line 3060,col 9)",
        "(line 3063,col 9)-(line 3063,col 49)",
        "(line 3064,col 9)-(line 3064,col 43)",
        "(line 3065,col 9)-(line 3065,col 46)",
        "(line 3066,col 9)-(line 3066,col 43)",
        "(line 3069,col 9)-(line 3069,col 42)",
        "(line 3071,col 9)-(line 3118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(double, double)",
      "begin_line": 3153,
      "end_line": 3176,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3156,col 9)-(line 3164,col 9)",
        "(line 3168,col 9)-(line 3168,col 53)",
        "(line 3169,col 9)-(line 3169,col 53)",
        "(line 3170,col 9)-(line 3174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(float, double)",
      "begin_line": 3209,
      "end_line": 3232,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3212,col 9)-(line 3220,col 9)",
        "(line 3224,col 9)-(line 3224,col 49)",
        "(line 3225,col 9)-(line 3225,col 43)",
        "(line 3226,col 9)-(line 3230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.floor(double)",
      "begin_line": 3238,
      "end_line": 3259,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3239,col 9)-(line 3239,col 15)",
        "(line 3241,col 9)-(line 3243,col 9)",
        "(line 3245,col 9)-(line 3247,col 9)",
        "(line 3249,col 9)-(line 3249,col 21)",
        "(line 3250,col 9)-(line 3252,col 9)",
        "(line 3254,col 9)-(line 3256,col 9)",
        "(line 3258,col 9)-(line 3258,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ceil(double)",
      "begin_line": 3265,
      "end_line": 3284,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3266,col 9)-(line 3266,col 17)",
        "(line 3268,col 9)-(line 3270,col 9)",
        "(line 3272,col 9)-(line 3272,col 21)",
        "(line 3273,col 9)-(line 3275,col 9)",
        "(line 3277,col 9)-(line 3277,col 17)",
        "(line 3279,col 9)-(line 3281,col 9)",
        "(line 3283,col 9)-(line 3283,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.rint(double)",
      "begin_line": 3290,
      "end_line": 3307,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3291,col 9)-(line 3291,col 28)",
        "(line 3292,col 9)-(line 3292,col 25)",
        "(line 3294,col 9)-(line 3299,col 9)",
        "(line 3300,col 9)-(line 3302,col 9)",
        "(line 3305,col 9)-(line 3305,col 26)",
        "(line 3306,col 9)-(line 3306,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(double)",
      "begin_line": 3313,
      "end_line": 3315,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3314,col 9)-(line 3314,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(float)",
      "begin_line": 3321,
      "end_line": 3323,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3322,col 9)-(line 3322,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(int, int)",
      "begin_line": 3330,
      "end_line": 3332,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3331,col 9)-(line 3331,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(long, long)",
      "begin_line": 3339,
      "end_line": 3341,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3340,col 9)-(line 3340,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(float, float)",
      "begin_line": 3348,
      "end_line": 3366,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3349,col 9)-(line 3351,col 9)",
        "(line 3352,col 9)-(line 3354,col 9)",
        "(line 3356,col 9)-(line 3358,col 9)",
        "(line 3361,col 9)-(line 3361,col 46)",
        "(line 3362,col 9)-(line 3364,col 9)",
        "(line 3365,col 9)-(line 3365,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(double, double)",
      "begin_line": 3373,
      "end_line": 3391,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3374,col 9)-(line 3376,col 9)",
        "(line 3377,col 9)-(line 3379,col 9)",
        "(line 3381,col 9)-(line 3383,col 9)",
        "(line 3386,col 9)-(line 3386,col 50)",
        "(line 3387,col 9)-(line 3389,col 9)",
        "(line 3390,col 9)-(line 3390,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(int, int)",
      "begin_line": 3398,
      "end_line": 3400,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3399,col 9)-(line 3399,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(long, long)",
      "begin_line": 3407,
      "end_line": 3409,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3408,col 9)-(line 3408,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(float, float)",
      "begin_line": 3416,
      "end_line": 3434,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
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
      "signature": "org.apache.commons.math3.util.FastMath.max(double, double)",
      "begin_line": 3441,
      "end_line": 3459,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
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
      "signature": "org.apache.commons.math3.util.FastMath.hypot(double, double)",
      "begin_line": 3475,
      "end_line": 3508,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3476,col 9)-(line 3507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3530,
      "end_line": 3532,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3531,col 9)-(line 3531,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(double, double)",
      "begin_line": 3542,
      "end_line": 3549,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3543,col 9)-(line 3543,col 52)",
        "(line 3544,col 9)-(line 3544,col 47)",
        "(line 3545,col 9)-(line 3547,col 9)",
        "(line 3548,col 9)-(line 3548,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(float, float)",
      "begin_line": 3559,
      "end_line": 3566,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3560,col 9)-(line 3560,col 48)",
        "(line 3561,col 9)-(line 3561,col 43)",
        "(line 3562,col 9)-(line 3564,col 9)",
        "(line 3565,col 9)-(line 3565,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(double)",
      "begin_line": 3577,
      "end_line": 3579,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3578,col 9)-(line 3578,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(float)",
      "begin_line": 3590,
      "end_line": 3592,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3591,col 9)-(line 3591,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.main(java.lang.String[])",
      "begin_line": 3599,
      "end_line": 3612,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3600,col 9)-(line 3600,col 37)",
        "(line 3601,col 9)-(line 3601,col 104)",
        "(line 3602,col 9)-(line 3602,col 104)",
        "(line 3603,col 9)-(line 3603,col 108)",
        "(line 3604,col 9)-(line 3604,col 108)",
        "(line 3605,col 9)-(line 3605,col 76)",
        "(line 3606,col 9)-(line 3606,col 83)",
        "(line 3607,col 9)-(line 3607,col 83)",
        "(line 3608,col 9)-(line 3608,col 87)",
        "(line 3609,col 9)-(line 3609,col 87)",
        "(line 3610,col 9)-(line 3610,col 89)",
        "(line 3611,col 9)-(line 3611,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3615,
      "end_line": 3651,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3619,
      "end_line": 3619,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3623,
      "end_line": 3623,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3654,
      "end_line": 3684,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3659,
      "end_line": 3659,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3663,
      "end_line": 3663,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3687,
      "end_line": 3704,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3689,
      "end_line": 3689,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "class_interface",
      "name": "CodyWaite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3707,
      "end_line": 3776,
      "comment": " Enclose the Cody/Waite reduction (used in \"sin\", \"cos\" and \"tan\"). "
    },
    {
      "type": "field",
      "varNames": [
        "finalK"
      ],
      "begin_line": 3709,
      "end_line": 3709,
      "comment": " k "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemA"
      ],
      "begin_line": 3711,
      "end_line": 3711,
      "comment": " remA "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemB"
      ],
      "begin_line": 3713,
      "end_line": 3713,
      "comment": " remB "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.CodyWaite(double, double)",
      "begin_line": 3719,
      "end_line": 3756,
      "comment": "\n         * @param xa Argument.\n         * @param xb Argument.\n         ",
      "child_ranges": [
        "(line 3723,col 13)-(line 3723,col 51)",
        "(line 3726,col 13)-(line 3726,col 24)",
        "(line 3727,col 13)-(line 3727,col 24)",
        "(line 3728,col 13)-(line 3751,col 13)",
        "(line 3753,col 13)-(line 3753,col 28)",
        "(line 3754,col 13)-(line 3754,col 34)",
        "(line 3755,col 13)-(line 3755,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getK()",
      "begin_line": 3761,
      "end_line": 3763,
      "comment": "\n         * @return k\n         ",
      "child_ranges": [
        "(line 3762,col 13)-(line 3762,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemA()",
      "begin_line": 3767,
      "end_line": 3769,
      "comment": "\n         * @return remA\n         ",
      "child_ranges": [
        "(line 3768,col 13)-(line 3768,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemB()",
      "begin_line": 3773,
      "end_line": 3775,
      "comment": "\n         * @return remB\n         ",
      "child_ranges": [
        "(line 3774,col 13)-(line 3774,col 29)"
      ]
    }
  ]
}