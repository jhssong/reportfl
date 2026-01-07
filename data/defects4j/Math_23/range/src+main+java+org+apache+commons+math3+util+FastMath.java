{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 3842,
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
      "end_line": 1329,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1108,col 9)",
        "(line 1109,col 9)-(line 1109,col 47)",
        "(line 1112,col 9)-(line 1120,col 9)",
        "(line 1123,col 9)-(line 1129,col 9)",
        "(line 1132,col 9)-(line 1132,col 41)",
        "(line 1134,col 9)-(line 1151,col 9)",
        "(line 1154,col 9)-(line 1201,col 9)",
        "(line 1204,col 9)-(line 1204,col 87)",
        "(line 1215,col 9)-(line 1215,col 103)",
        "(line 1217,col 9)-(line 1217,col 26)",
        "(line 1218,col 9)-(line 1218,col 26)",
        "(line 1220,col 9)-(line 1280,col 9)",
        "(line 1296,col 9)-(line 1296,col 30)",
        "(line 1297,col 9)-(line 1297,col 23)",
        "(line 1298,col 9)-(line 1298,col 28)",
        "(line 1299,col 9)-(line 1299,col 33)",
        "(line 1300,col 9)-(line 1300,col 14)",
        "(line 1301,col 9)-(line 1301,col 18)",
        "(line 1303,col 9)-(line 1303,col 21)",
        "(line 1304,col 9)-(line 1304,col 28)",
        "(line 1305,col 9)-(line 1305,col 14)",
        "(line 1306,col 9)-(line 1306,col 18)",
        "(line 1308,col 9)-(line 1308,col 27)",
        "(line 1309,col 9)-(line 1309,col 34)",
        "(line 1310,col 9)-(line 1310,col 14)",
        "(line 1311,col 9)-(line 1311,col 18)",
        "(line 1313,col 9)-(line 1313,col 23)",
        "(line 1314,col 9)-(line 1314,col 30)",
        "(line 1315,col 9)-(line 1315,col 14)",
        "(line 1316,col 9)-(line 1316,col 18)",
        "(line 1318,col 9)-(line 1318,col 21)",
        "(line 1319,col 9)-(line 1319,col 28)",
        "(line 1320,col 9)-(line 1320,col 14)",
        "(line 1321,col 9)-(line 1321,col 18)",
        "(line 1323,col 9)-(line 1326,col 9)",
        "(line 1328,col 9)-(line 1328,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log1p(double)",
      "begin_line": 1337,
      "end_line": 1367,
      "comment": "\n     * Computes log(1 + x).\n     *\n     * @param x Number.\n     * @return {@code log(1 + x)}.\n     ",
      "child_ranges": [
        "(line 1338,col 9)-(line 1340,col 9)",
        "(line 1342,col 9)-(line 1344,col 9)",
        "(line 1346,col 9)-(line 1366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log10(double)",
      "begin_line": 1373,
      "end_line": 1389,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1374,col 9)-(line 1374,col 46)",
        "(line 1376,col 9)-(line 1376,col 44)",
        "(line 1377,col 9)-(line 1379,col 9)",
        "(line 1381,col 9)-(line 1381,col 52)",
        "(line 1382,col 9)-(line 1382,col 49)",
        "(line 1383,col 9)-(line 1383,col 55)",
        "(line 1385,col 9)-(line 1385,col 49)",
        "(line 1386,col 9)-(line 1386,col 52)",
        "(line 1388,col 9)-(line 1388,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.log(double, double)",
      "begin_line": 1407,
      "end_line": 1409,
      "comment": "\n     * Computes the \u003ca href\u003d\"http://mathworld.wolfram.com/Logarithm.html\"\u003e\n     * logarithm\u003c/a\u003e in a given base.\n     *\n     * Returns {@code NaN} if either argument is negative.\n     * If {@code base} is 0 and {@code x} is positive, 0 is returned.\n     * If {@code base} is positive and {@code x} is 0,\n     * {@code Double.NEGATIVE_INFINITY} is returned.\n     * If both arguments are 0, the result is {@code NaN}.\n     *\n     * @param base Base of the logarithm, must be greater than 0.\n     * @param x Argument, must be greater than 0.\n     * @return the value of the logarithm, i.e. the number {@code y} such that\n     * \u003ccode\u003ebase\u003csup\u003ey\u003c/sup\u003e \u003d x\u003c/code\u003e.\n     * @since 1.2 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 1408,col 9)-(line 1408,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, double)",
      "begin_line": 1418,
      "end_line": 1576,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 43)",
        "(line 1421,col 9)-(line 1423,col 9)",
        "(line 1425,col 9)-(line 1427,col 9)",
        "(line 1430,col 9)-(line 1453,col 9)",
        "(line 1455,col 9)-(line 1464,col 9)",
        "(line 1466,col 9)-(line 1476,col 9)",
        "(line 1478,col 9)-(line 1500,col 9)",
        "(line 1502,col 9)-(line 1513,col 9)",
        "(line 1516,col 9)-(line 1528,col 9)",
        "(line 1531,col 9)-(line 1531,col 18)",
        "(line 1532,col 9)-(line 1532,col 18)",
        "(line 1533,col 9)-(line 1542,col 9)",
        "(line 1545,col 9)-(line 1545,col 41)",
        "(line 1546,col 9)-(line 1548,col 9)",
        "(line 1550,col 9)-(line 1550,col 28)",
        "(line 1551,col 9)-(line 1551,col 28)",
        "(line 1554,col 9)-(line 1554,col 41)",
        "(line 1555,col 9)-(line 1555,col 40)",
        "(line 1556,col 9)-(line 1556,col 26)",
        "(line 1557,col 9)-(line 1557,col 19)",
        "(line 1560,col 9)-(line 1560,col 35)",
        "(line 1561,col 9)-(line 1561,col 57)",
        "(line 1563,col 9)-(line 1563,col 20)",
        "(line 1564,col 9)-(line 1564,col 31)",
        "(line 1566,col 9)-(line 1566,col 31)",
        "(line 1567,col 9)-(line 1567,col 35)",
        "(line 1568,col 9)-(line 1568,col 34)",
        "(line 1569,col 9)-(line 1569,col 26)",
        "(line 1570,col 9)-(line 1570,col 26)",
        "(line 1571,col 9)-(line 1571,col 20)",
        "(line 1573,col 9)-(line 1573,col 48)",
        "(line 1575,col 9)-(line 1575,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.pow(double, int)",
      "begin_line": 1586,
      "end_line": 1643,
      "comment": "\n     * Raise a double to an int power.\n     *\n     * @param d Number to raise.\n     * @param e Exponent.\n     * @return d\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1593,col 9)",
        "(line 1597,col 9)-(line 1597,col 42)",
        "(line 1598,col 9)-(line 1598,col 48)",
        "(line 1599,col 9)-(line 1599,col 46)",
        "(line 1600,col 9)-(line 1600,col 43)",
        "(line 1603,col 9)-(line 1603,col 30)",
        "(line 1604,col 9)-(line 1604,col 30)",
        "(line 1607,col 9)-(line 1607,col 27)",
        "(line 1608,col 9)-(line 1608,col 32)",
        "(line 1609,col 9)-(line 1609,col 31)",
        "(line 1611,col 9)-(line 1639,col 9)",
        "(line 1641,col 9)-(line 1641,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polySine(double)",
      "begin_line": 1651,
      "end_line": 1664,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1653,col 9)-(line 1653,col 24)",
        "(line 1655,col 9)-(line 1655,col 41)",
        "(line 1656,col 9)-(line 1656,col 44)",
        "(line 1657,col 9)-(line 1657,col 42)",
        "(line 1658,col 9)-(line 1658,col 42)",
        "(line 1661,col 9)-(line 1661,col 23)",
        "(line 1663,col 9)-(line 1663,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.polyCosine(double)",
      "begin_line": 1672,
      "end_line": 1682,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1673,col 9)-(line 1673,col 24)",
        "(line 1675,col 9)-(line 1675,col 40)",
        "(line 1676,col 9)-(line 1676,col 44)",
        "(line 1677,col 9)-(line 1677,col 42)",
        "(line 1678,col 9)-(line 1678,col 42)",
        "(line 1679,col 9)-(line 1679,col 16)",
        "(line 1681,col 9)-(line 1681,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sinQ(double, double)",
      "begin_line": 1691,
      "end_line": 1806,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1692,col 9)-(line 1692,col 43)",
        "(line 1693,col 9)-(line 1693,col 49)",
        "(line 1696,col 9)-(line 1696,col 47)",
        "(line 1697,col 9)-(line 1697,col 47)",
        "(line 1698,col 9)-(line 1698,col 49)",
        "(line 1699,col 9)-(line 1699,col 49)",
        "(line 1702,col 9)-(line 1702,col 33)",
        "(line 1703,col 9)-(line 1703,col 43)",
        "(line 1704,col 9)-(line 1704,col 35)",
        "(line 1705,col 9)-(line 1705,col 51)",
        "(line 1708,col 9)-(line 1708,col 51)",
        "(line 1709,col 9)-(line 1709,col 47)",
        "(line 1710,col 9)-(line 1710,col 36)",
        "(line 1711,col 9)-(line 1711,col 24)",
        "(line 1714,col 9)-(line 1714,col 22)",
        "(line 1737,col 9)-(line 1737,col 21)",
        "(line 1738,col 9)-(line 1738,col 21)",
        "(line 1740,col 9)-(line 1740,col 25)",
        "(line 1741,col 9)-(line 1741,col 25)",
        "(line 1742,col 9)-(line 1742,col 32)",
        "(line 1743,col 9)-(line 1743,col 14)",
        "(line 1744,col 9)-(line 1744,col 18)",
        "(line 1746,col 9)-(line 1746,col 28)",
        "(line 1747,col 9)-(line 1747,col 18)",
        "(line 1748,col 9)-(line 1748,col 25)",
        "(line 1749,col 9)-(line 1749,col 14)",
        "(line 1750,col 9)-(line 1750,col 18)",
        "(line 1752,col 9)-(line 1752,col 50)",
        "(line 1767,col 9)-(line 1767,col 76)",
        "(line 1794,col 9)-(line 1801,col 9)",
        "(line 1803,col 9)-(line 1803,col 23)",
        "(line 1805,col 9)-(line 1805,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cosQ(double, double)",
      "begin_line": 1815,
      "end_line": 1824,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1816,col 47)",
        "(line 1817,col 9)-(line 1817,col 50)",
        "(line 1819,col 9)-(line 1819,col 35)",
        "(line 1820,col 9)-(line 1820,col 36)",
        "(line 1821,col 9)-(line 1821,col 23)",
        "(line 1823,col 9)-(line 1823,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1834,
      "end_line": 1969,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1836,col 9)-(line 1836,col 43)",
        "(line 1837,col 9)-(line 1837,col 49)",
        "(line 1840,col 9)-(line 1840,col 47)",
        "(line 1841,col 9)-(line 1841,col 47)",
        "(line 1842,col 9)-(line 1842,col 49)",
        "(line 1843,col 9)-(line 1843,col 49)",
        "(line 1846,col 9)-(line 1846,col 33)",
        "(line 1847,col 9)-(line 1847,col 43)",
        "(line 1848,col 9)-(line 1848,col 35)",
        "(line 1849,col 9)-(line 1849,col 51)",
        "(line 1852,col 9)-(line 1852,col 45)",
        "(line 1853,col 9)-(line 1853,col 47)",
        "(line 1854,col 9)-(line 1854,col 36)",
        "(line 1855,col 9)-(line 1855,col 24)",
        "(line 1880,col 9)-(line 1880,col 21)",
        "(line 1881,col 9)-(line 1881,col 21)",
        "(line 1884,col 9)-(line 1884,col 25)",
        "(line 1885,col 9)-(line 1885,col 25)",
        "(line 1886,col 9)-(line 1886,col 32)",
        "(line 1887,col 9)-(line 1887,col 14)",
        "(line 1888,col 9)-(line 1888,col 18)",
        "(line 1890,col 9)-(line 1890,col 26)",
        "(line 1891,col 9)-(line 1891,col 18)",
        "(line 1892,col 9)-(line 1892,col 25)",
        "(line 1893,col 9)-(line 1893,col 14)",
        "(line 1894,col 9)-(line 1894,col 18)",
        "(line 1896,col 9)-(line 1896,col 46)",
        "(line 1897,col 9)-(line 1897,col 70)",
        "(line 1899,col 9)-(line 1899,col 28)",
        "(line 1900,col 9)-(line 1900,col 38)",
        "(line 1904,col 9)-(line 1904,col 28)",
        "(line 1906,col 9)-(line 1906,col 26)",
        "(line 1907,col 9)-(line 1907,col 18)",
        "(line 1908,col 9)-(line 1908,col 25)",
        "(line 1909,col 9)-(line 1909,col 14)",
        "(line 1910,col 9)-(line 1910,col 18)",
        "(line 1912,col 9)-(line 1912,col 27)",
        "(line 1913,col 9)-(line 1913,col 18)",
        "(line 1914,col 9)-(line 1914,col 25)",
        "(line 1915,col 9)-(line 1915,col 14)",
        "(line 1916,col 9)-(line 1916,col 18)",
        "(line 1918,col 9)-(line 1918,col 62)",
        "(line 1919,col 9)-(line 1919,col 64)",
        "(line 1921,col 9)-(line 1921,col 28)",
        "(line 1922,col 9)-(line 1922,col 38)",
        "(line 1924,col 9)-(line 1928,col 9)",
        "(line 1941,col 9)-(line 1941,col 31)",
        "(line 1944,col 9)-(line 1944,col 34)",
        "(line 1945,col 9)-(line 1945,col 42)",
        "(line 1946,col 9)-(line 1946,col 34)",
        "(line 1948,col 9)-(line 1948,col 35)",
        "(line 1949,col 9)-(line 1949,col 44)",
        "(line 1950,col 9)-(line 1950,col 37)",
        "(line 1953,col 9)-(line 1953,col 85)",
        "(line 1954,col 9)-(line 1954,col 25)",
        "(line 1955,col 9)-(line 1955,col 42)",
        "(line 1957,col 9)-(line 1966,col 9)",
        "(line 1968,col 9)-(line 1968,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 1982,
      "end_line": 2192,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1985,col 9)-(line 1985,col 49)",
        "(line 1986,col 9)-(line 1986,col 61)",
        "(line 1989,col 9)-(line 1989,col 38)",
        "(line 1990,col 9)-(line 1990,col 38)",
        "(line 1993,col 9)-(line 1993,col 19)",
        "(line 1994,col 9)-(line 1994,col 22)",
        "(line 1997,col 9)-(line 1997,col 19)",
        "(line 1998,col 9)-(line 1998,col 19)",
        "(line 1999,col 9)-(line 1999,col 19)",
        "(line 2000,col 9)-(line 2000,col 32)",
        "(line 2001,col 9)-(line 2001,col 42)",
        "(line 2003,col 9)-(line 2012,col 9)",
        "(line 2015,col 9)-(line 2015,col 31)",
        "(line 2016,col 9)-(line 2016,col 38)",
        "(line 2018,col 9)-(line 2018,col 30)",
        "(line 2019,col 9)-(line 2019,col 37)",
        "(line 2021,col 9)-(line 2021,col 24)",
        "(line 2022,col 9)-(line 2022,col 24)",
        "(line 2023,col 9)-(line 2023,col 24)",
        "(line 2024,col 9)-(line 2024,col 24)",
        "(line 2026,col 9)-(line 2026,col 37)",
        "(line 2027,col 9)-(line 2027,col 38)",
        "(line 2029,col 9)-(line 2029,col 55)",
        "(line 2030,col 9)-(line 2030,col 48)",
        "(line 2031,col 9)-(line 2031,col 60)",
        "(line 2034,col 9)-(line 2037,col 9)",
        "(line 2039,col 9)-(line 2039,col 50)",
        "(line 2040,col 9)-(line 2040,col 40)",
        "(line 2042,col 9)-(line 2042,col 35)",
        "(line 2043,col 9)-(line 2043,col 36)",
        "(line 2045,col 9)-(line 2045,col 52)",
        "(line 2048,col 9)-(line 2051,col 9)",
        "(line 2054,col 9)-(line 2054,col 25)",
        "(line 2055,col 9)-(line 2055,col 32)",
        "(line 2056,col 9)-(line 2056,col 19)",
        "(line 2057,col 9)-(line 2057,col 19)",
        "(line 2058,col 9)-(line 2058,col 19)",
        "(line 2061,col 9)-(line 2061,col 37)",
        "(line 2063,col 9)-(line 2063,col 50)",
        "(line 2064,col 9)-(line 2064,col 48)",
        "(line 2065,col 9)-(line 2065,col 20)",
        "(line 2066,col 9)-(line 2066,col 52)",
        "(line 2068,col 9)-(line 2071,col 9)",
        "(line 2074,col 9)-(line 2074,col 25)",
        "(line 2075,col 9)-(line 2075,col 32)",
        "(line 2077,col 9)-(line 2077,col 19)",
        "(line 2078,col 9)-(line 2078,col 19)",
        "(line 2079,col 9)-(line 2079,col 19)",
        "(line 2081,col 9)-(line 2081,col 40)",
        "(line 2093,col 9)-(line 2093,col 42)",
        "(line 2096,col 9)-(line 2096,col 20)",
        "(line 2097,col 9)-(line 2097,col 30)",
        "(line 2098,col 9)-(line 2098,col 20)",
        "(line 2101,col 9)-(line 2101,col 25)",
        "(line 2102,col 9)-(line 2102,col 32)",
        "(line 2104,col 9)-(line 2104,col 34)",
        "(line 2105,col 9)-(line 2105,col 41)",
        "(line 2107,col 9)-(line 2107,col 19)",
        "(line 2108,col 9)-(line 2108,col 19)",
        "(line 2109,col 9)-(line 2109,col 19)",
        "(line 2110,col 9)-(line 2110,col 19)",
        "(line 2112,col 9)-(line 2112,col 38)",
        "(line 2113,col 9)-(line 2113,col 39)",
        "(line 2115,col 9)-(line 2115,col 47)",
        "(line 2116,col 9)-(line 2116,col 40)",
        "(line 2117,col 9)-(line 2117,col 53)",
        "(line 2120,col 9)-(line 2123,col 9)",
        "(line 2125,col 9)-(line 2125,col 51)",
        "(line 2126,col 9)-(line 2126,col 40)",
        "(line 2128,col 9)-(line 2128,col 37)",
        "(line 2129,col 9)-(line 2129,col 38)",
        "(line 2131,col 9)-(line 2131,col 53)",
        "(line 2134,col 9)-(line 2137,col 9)",
        "(line 2140,col 9)-(line 2140,col 34)",
        "(line 2141,col 9)-(line 2141,col 41)",
        "(line 2142,col 9)-(line 2142,col 19)",
        "(line 2143,col 9)-(line 2143,col 19)",
        "(line 2144,col 9)-(line 2144,col 19)",
        "(line 2147,col 9)-(line 2147,col 37)",
        "(line 2149,col 9)-(line 2149,col 51)",
        "(line 2150,col 9)-(line 2150,col 48)",
        "(line 2151,col 9)-(line 2151,col 21)",
        "(line 2152,col 9)-(line 2152,col 53)",
        "(line 2154,col 9)-(line 2157,col 9)",
        "(line 2160,col 9)-(line 2160,col 25)",
        "(line 2161,col 9)-(line 2161,col 32)",
        "(line 2162,col 9)-(line 2162,col 34)",
        "(line 2163,col 9)-(line 2163,col 41)",
        "(line 2164,col 9)-(line 2164,col 19)",
        "(line 2165,col 9)-(line 2165,col 19)",
        "(line 2166,col 9)-(line 2166,col 19)",
        "(line 2169,col 9)-(line 2169,col 37)",
        "(line 2171,col 9)-(line 2171,col 51)",
        "(line 2172,col 9)-(line 2172,col 48)",
        "(line 2173,col 9)-(line 2173,col 21)",
        "(line 2174,col 9)-(line 2174,col 53)",
        "(line 2176,col 9)-(line 2179,col 9)",
        "(line 2182,col 9)-(line 2182,col 53)",
        "(line 2183,col 9)-(line 2183,col 98)",
        "(line 2185,col 9)-(line 2185,col 34)",
        "(line 2186,col 9)-(line 2186,col 44)",
        "(line 2189,col 9)-(line 2189,col 28)",
        "(line 2190,col 9)-(line 2190,col 31)",
        "(line 2191,col 9)-(line 2191,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.sin(double)",
      "begin_line": 2200,
      "end_line": 2259,
      "comment": "\n     * Sine function.\n     *\n     * @param x Argument.\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 2201,col 9)-(line 2201,col 33)",
        "(line 2202,col 9)-(line 2202,col 25)",
        "(line 2203,col 9)-(line 2203,col 18)",
        "(line 2204,col 9)-(line 2204,col 24)",
        "(line 2207,col 9)-(line 2207,col 15)",
        "(line 2208,col 9)-(line 2211,col 9)",
        "(line 2214,col 9)-(line 2220,col 9)",
        "(line 2222,col 9)-(line 2224,col 9)",
        "(line 2227,col 9)-(line 2241,col 9)",
        "(line 2243,col 9)-(line 2245,col 9)",
        "(line 2247,col 9)-(line 2258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cos(double)",
      "begin_line": 2267,
      "end_line": 2313,
      "comment": "\n     * Cosine function.\n     *\n     * @param x Argument.\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 2268,col 9)-(line 2268,col 25)",
        "(line 2271,col 9)-(line 2271,col 22)",
        "(line 2272,col 9)-(line 2274,col 9)",
        "(line 2276,col 9)-(line 2278,col 9)",
        "(line 2281,col 9)-(line 2281,col 22)",
        "(line 2282,col 9)-(line 2296,col 9)",
        "(line 2301,col 9)-(line 2312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.tan(double)",
      "begin_line": 2321,
      "end_line": 2390,
      "comment": "\n     * Tangent function.\n     *\n     * @param x Argument.\n     * @return tan(x)\n     ",
      "child_ranges": [
        "(line 2322,col 9)-(line 2322,col 33)",
        "(line 2323,col 9)-(line 2323,col 25)",
        "(line 2326,col 9)-(line 2326,col 22)",
        "(line 2327,col 9)-(line 2330,col 9)",
        "(line 2333,col 9)-(line 2339,col 9)",
        "(line 2341,col 9)-(line 2343,col 9)",
        "(line 2346,col 9)-(line 2346,col 22)",
        "(line 2347,col 9)-(line 2361,col 9)",
        "(line 2363,col 9)-(line 2376,col 9)",
        "(line 2378,col 9)-(line 2378,col 22)",
        "(line 2379,col 9)-(line 2383,col 9)",
        "(line 2385,col 9)-(line 2387,col 9)",
        "(line 2389,col 9)-(line 2389,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double)",
      "begin_line": 2397,
      "end_line": 2399,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2398,col 9)-(line 2398,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2407,
      "end_line": 2546,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2408,col 9)-(line 2408,col 31)",
        "(line 2409,col 9)-(line 2409,col 16)",
        "(line 2411,col 9)-(line 2413,col 9)",
        "(line 2415,col 9)-(line 2420,col 9)",
        "(line 2422,col 9)-(line 2424,col 9)",
        "(line 2427,col 9)-(line 2432,col 9)",
        "(line 2433,col 9)-(line 2433,col 48)",
        "(line 2434,col 9)-(line 2434,col 58)",
        "(line 2435,col 9)-(line 2435,col 42)",
        "(line 2437,col 9)-(line 2437,col 34)",
        "(line 2438,col 9)-(line 2438,col 37)",
        "(line 2439,col 9)-(line 2439,col 20)",
        "(line 2442,col 9)-(line 2442,col 33)",
        "(line 2443,col 9)-(line 2443,col 37)",
        "(line 2444,col 9)-(line 2444,col 33)",
        "(line 2445,col 9)-(line 2445,col 16)",
        "(line 2446,col 9)-(line 2446,col 17)",
        "(line 2449,col 9)-(line 2481,col 9)",
        "(line 2484,col 9)-(line 2484,col 18)",
        "(line 2485,col 9)-(line 2485,col 18)",
        "(line 2488,col 9)-(line 2488,col 41)",
        "(line 2499,col 9)-(line 2499,col 33)",
        "(line 2500,col 9)-(line 2500,col 47)",
        "(line 2501,col 9)-(line 2501,col 46)",
        "(line 2502,col 9)-(line 2502,col 46)",
        "(line 2503,col 9)-(line 2503,col 46)",
        "(line 2504,col 9)-(line 2504,col 47)",
        "(line 2505,col 9)-(line 2505,col 31)",
        "(line 2508,col 9)-(line 2508,col 18)",
        "(line 2510,col 9)-(line 2510,col 23)",
        "(line 2511,col 9)-(line 2511,col 31)",
        "(line 2512,col 9)-(line 2512,col 18)",
        "(line 2515,col 9)-(line 2515,col 40)",
        "(line 2518,col 9)-(line 2518,col 38)",
        "(line 2519,col 9)-(line 2519,col 46)",
        "(line 2520,col 9)-(line 2520,col 23)",
        "(line 2521,col 9)-(line 2521,col 32)",
        "(line 2522,col 9)-(line 2522,col 18)",
        "(line 2524,col 9)-(line 2524,col 32)",
        "(line 2525,col 9)-(line 2525,col 45)",
        "(line 2527,col 9)-(line 2538,col 9)",
        "(line 2541,col 9)-(line 2543,col 9)",
        "(line 2545,col 9)-(line 2545,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.atan2(double, double)",
      "begin_line": 2554,
      "end_line": 2669,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2555,col 9)-(line 2557,col 9)",
        "(line 2559,col 9)-(line 2581,col 9)",
        "(line 2585,col 9)-(line 2595,col 9)",
        "(line 2597,col 9)-(line 2607,col 9)",
        "(line 2609,col 9)-(line 2617,col 9)",
        "(line 2619,col 9)-(line 2628,col 9)",
        "(line 2632,col 9)-(line 2640,col 9)",
        "(line 2643,col 9)-(line 2643,col 31)",
        "(line 2644,col 9)-(line 2646,col 9)",
        "(line 2648,col 9)-(line 2648,col 38)",
        "(line 2649,col 9)-(line 2649,col 27)",
        "(line 2652,col 9)-(line 2652,col 44)",
        "(line 2653,col 9)-(line 2653,col 33)",
        "(line 2655,col 9)-(line 2655,col 62)",
        "(line 2657,col 9)-(line 2657,col 36)",
        "(line 2658,col 9)-(line 2658,col 31)",
        "(line 2659,col 9)-(line 2659,col 18)",
        "(line 2661,col 9)-(line 2663,col 9)",
        "(line 2666,col 9)-(line 2666,col 50)",
        "(line 2668,col 9)-(line 2668,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.asin(double)",
      "begin_line": 2675,
      "end_line": 2745,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2676,col 7)-(line 2678,col 7)",
        "(line 2680,col 7)-(line 2682,col 7)",
        "(line 2684,col 7)-(line 2686,col 7)",
        "(line 2688,col 7)-(line 2690,col 7)",
        "(line 2692,col 7)-(line 2694,col 7)",
        "(line 2699,col 7)-(line 2699,col 37)",
        "(line 2700,col 7)-(line 2700,col 40)",
        "(line 2701,col 7)-(line 2701,col 31)",
        "(line 2704,col 7)-(line 2704,col 24)",
        "(line 2705,col 7)-(line 2705,col 36)",
        "(line 2708,col 7)-(line 2708,col 15)",
        "(line 2709,col 7)-(line 2709,col 15)",
        "(line 2711,col 7)-(line 2711,col 27)",
        "(line 2712,col 7)-(line 2712,col 35)",
        "(line 2714,col 7)-(line 2714,col 21)",
        "(line 2715,col 7)-(line 2715,col 30)",
        "(line 2716,col 7)-(line 2716,col 16)",
        "(line 2719,col 7)-(line 2719,col 15)",
        "(line 2720,col 7)-(line 2720,col 19)",
        "(line 2721,col 7)-(line 2721,col 30)",
        "(line 2722,col 7)-(line 2722,col 27)",
        "(line 2723,col 7)-(line 2723,col 18)",
        "(line 2726,col 7)-(line 2726,col 53)",
        "(line 2729,col 7)-(line 2729,col 31)",
        "(line 2732,col 7)-(line 2732,col 21)",
        "(line 2733,col 7)-(line 2733,col 30)",
        "(line 2734,col 7)-(line 2734,col 34)",
        "(line 2735,col 7)-(line 2735,col 25)",
        "(line 2737,col 7)-(line 2737,col 52)",
        "(line 2738,col 7)-(line 2738,col 28)",
        "(line 2740,col 7)-(line 2740,col 21)",
        "(line 2741,col 7)-(line 2741,col 29)",
        "(line 2742,col 7)-(line 2742,col 16)",
        "(line 2744,col 7)-(line 2744,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.acos(double)",
      "begin_line": 2751,
      "end_line": 2827,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2752,col 7)-(line 2754,col 7)",
        "(line 2756,col 7)-(line 2758,col 7)",
        "(line 2760,col 7)-(line 2762,col 7)",
        "(line 2764,col 7)-(line 2766,col 7)",
        "(line 2768,col 7)-(line 2770,col 7)",
        "(line 2775,col 7)-(line 2775,col 37)",
        "(line 2776,col 7)-(line 2776,col 40)",
        "(line 2777,col 7)-(line 2777,col 31)",
        "(line 2780,col 7)-(line 2780,col 24)",
        "(line 2781,col 7)-(line 2781,col 36)",
        "(line 2784,col 7)-(line 2784,col 15)",
        "(line 2785,col 7)-(line 2785,col 15)",
        "(line 2787,col 7)-(line 2787,col 27)",
        "(line 2788,col 7)-(line 2788,col 35)",
        "(line 2790,col 7)-(line 2790,col 21)",
        "(line 2791,col 7)-(line 2791,col 30)",
        "(line 2792,col 7)-(line 2792,col 16)",
        "(line 2795,col 7)-(line 2795,col 26)",
        "(line 2796,col 7)-(line 2796,col 30)",
        "(line 2797,col 7)-(line 2797,col 27)",
        "(line 2798,col 7)-(line 2798,col 18)",
        "(line 2801,col 7)-(line 2801,col 53)",
        "(line 2804,col 7)-(line 2804,col 25)",
        "(line 2805,col 7)-(line 2805,col 16)",
        "(line 2806,col 7)-(line 2806,col 26)",
        "(line 2809,col 7)-(line 2809,col 21)",
        "(line 2812,col 7)-(line 2814,col 7)",
        "(line 2816,col 7)-(line 2816,col 36)",
        "(line 2817,col 7)-(line 2817,col 25)",
        "(line 2819,col 7)-(line 2819,col 52)",
        "(line 2820,col 7)-(line 2820,col 19)",
        "(line 2822,col 7)-(line 2822,col 21)",
        "(line 2823,col 7)-(line 2823,col 29)",
        "(line 2824,col 7)-(line 2824,col 16)",
        "(line 2826,col 7)-(line 2826,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.cbrt(double)",
      "begin_line": 2833,
      "end_line": 2911,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2835,col 7)-(line 2835,col 47)",
        "(line 2836,col 7)-(line 2836,col 59)",
        "(line 2837,col 7)-(line 2837,col 32)",
        "(line 2839,col 7)-(line 2849,col 7)",
        "(line 2851,col 7)-(line 2854,col 7)",
        "(line 2857,col 7)-(line 2857,col 30)",
        "(line 2860,col 7)-(line 2861,col 81)",
        "(line 2864,col 7)-(line 2864,col 104)",
        "(line 2867,col 7)-(line 2867,col 41)",
        "(line 2868,col 7)-(line 2868,col 44)",
        "(line 2869,col 7)-(line 2869,col 45)",
        "(line 2870,col 7)-(line 2870,col 44)",
        "(line 2871,col 7)-(line 2871,col 44)",
        "(line 2873,col 7)-(line 2873,col 39)",
        "(line 2878,col 7)-(line 2878,col 39)",
        "(line 2879,col 7)-(line 2879,col 46)",
        "(line 2880,col 7)-(line 2880,col 46)",
        "(line 2883,col 7)-(line 2883,col 39)",
        "(line 2884,col 7)-(line 2884,col 36)",
        "(line 2885,col 7)-(line 2885,col 27)",
        "(line 2887,col 7)-(line 2887,col 26)",
        "(line 2888,col 7)-(line 2888,col 42)",
        "(line 2889,col 7)-(line 2889,col 31)",
        "(line 2890,col 7)-(line 2890,col 38)",
        "(line 2891,col 7)-(line 2891,col 23)",
        "(line 2892,col 7)-(line 2892,col 17)",
        "(line 2894,col 7)-(line 2894,col 39)",
        "(line 2895,col 7)-(line 2895,col 19)",
        "(line 2897,col 7)-(line 2897,col 26)",
        "(line 2898,col 7)-(line 2898,col 34)",
        "(line 2899,col 7)-(line 2899,col 15)",
        "(line 2901,col 7)-(line 2901,col 33)",
        "(line 2904,col 7)-(line 2904,col 16)",
        "(line 2906,col 7)-(line 2908,col 7)",
        "(line 2910,col 7)-(line 2910,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toRadians(double)",
      "begin_line": 2918,
      "end_line": 2936,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2920,col 9)-(line 2922,col 9)",
        "(line 2925,col 9)-(line 2925,col 49)",
        "(line 2926,col 9)-(line 2926,col 50)",
        "(line 2928,col 9)-(line 2928,col 38)",
        "(line 2929,col 9)-(line 2929,col 27)",
        "(line 2931,col 9)-(line 2931,col 74)",
        "(line 2932,col 9)-(line 2934,col 9)",
        "(line 2935,col 9)-(line 2935,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.toDegrees(double)",
      "begin_line": 2943,
      "end_line": 2957,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2945,col 9)-(line 2947,col 9)",
        "(line 2950,col 9)-(line 2950,col 46)",
        "(line 2951,col 9)-(line 2951,col 50)",
        "(line 2953,col 9)-(line 2953,col 38)",
        "(line 2954,col 9)-(line 2954,col 27)",
        "(line 2956,col 9)-(line 2956,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(int)",
      "begin_line": 2964,
      "end_line": 2966,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2965,col 9)-(line 2965,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(long)",
      "begin_line": 2973,
      "end_line": 2975,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2974,col 9)-(line 2974,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(float)",
      "begin_line": 2982,
      "end_line": 2984,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2983,col 9)-(line 2983,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.abs(double)",
      "begin_line": 2991,
      "end_line": 2993,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2992,col 9)-(line 2992,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(double)",
      "begin_line": 3000,
      "end_line": 3005,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3001,col 9)-(line 3003,col 9)",
        "(line 3004,col 9)-(line 3004,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ulp(float)",
      "begin_line": 3012,
      "end_line": 3017,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3013,col 9)-(line 3015,col 9)",
        "(line 3016,col 9)-(line 3016,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(double, int)",
      "begin_line": 3025,
      "end_line": 3101,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3028,col 9)-(line 3030,col 9)",
        "(line 3033,col 9)-(line 3035,col 9)",
        "(line 3036,col 9)-(line 3038,col 9)",
        "(line 3039,col 9)-(line 3041,col 9)",
        "(line 3044,col 9)-(line 3044,col 53)",
        "(line 3045,col 9)-(line 3045,col 53)",
        "(line 3046,col 9)-(line 3046,col 56)",
        "(line 3047,col 9)-(line 3047,col 53)",
        "(line 3050,col 9)-(line 3050,col 42)",
        "(line 3052,col 9)-(line 3099,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.scalb(float, int)",
      "begin_line": 3109,
      "end_line": 3185,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3112,col 9)-(line 3114,col 9)",
        "(line 3117,col 9)-(line 3119,col 9)",
        "(line 3120,col 9)-(line 3122,col 9)",
        "(line 3123,col 9)-(line 3125,col 9)",
        "(line 3128,col 9)-(line 3128,col 49)",
        "(line 3129,col 9)-(line 3129,col 43)",
        "(line 3130,col 9)-(line 3130,col 46)",
        "(line 3131,col 9)-(line 3131,col 43)",
        "(line 3134,col 9)-(line 3134,col 42)",
        "(line 3136,col 9)-(line 3183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(double, double)",
      "begin_line": 3218,
      "end_line": 3241,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3221,col 9)-(line 3229,col 9)",
        "(line 3233,col 9)-(line 3233,col 53)",
        "(line 3234,col 9)-(line 3234,col 53)",
        "(line 3235,col 9)-(line 3239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.nextAfter(float, double)",
      "begin_line": 3274,
      "end_line": 3297,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3277,col 9)-(line 3285,col 9)",
        "(line 3289,col 9)-(line 3289,col 49)",
        "(line 3290,col 9)-(line 3290,col 43)",
        "(line 3291,col 9)-(line 3295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.floor(double)",
      "begin_line": 3303,
      "end_line": 3324,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3304,col 9)-(line 3304,col 15)",
        "(line 3306,col 9)-(line 3308,col 9)",
        "(line 3310,col 9)-(line 3312,col 9)",
        "(line 3314,col 9)-(line 3314,col 21)",
        "(line 3315,col 9)-(line 3317,col 9)",
        "(line 3319,col 9)-(line 3321,col 9)",
        "(line 3323,col 9)-(line 3323,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.ceil(double)",
      "begin_line": 3330,
      "end_line": 3349,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3331,col 9)-(line 3331,col 17)",
        "(line 3333,col 9)-(line 3335,col 9)",
        "(line 3337,col 9)-(line 3337,col 21)",
        "(line 3338,col 9)-(line 3340,col 9)",
        "(line 3342,col 9)-(line 3342,col 17)",
        "(line 3344,col 9)-(line 3346,col 9)",
        "(line 3348,col 9)-(line 3348,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.rint(double)",
      "begin_line": 3355,
      "end_line": 3372,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3356,col 9)-(line 3356,col 28)",
        "(line 3357,col 9)-(line 3357,col 25)",
        "(line 3359,col 9)-(line 3364,col 9)",
        "(line 3365,col 9)-(line 3367,col 9)",
        "(line 3370,col 9)-(line 3370,col 26)",
        "(line 3371,col 9)-(line 3371,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(double)",
      "begin_line": 3378,
      "end_line": 3380,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3379,col 9)-(line 3379,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.round(float)",
      "begin_line": 3386,
      "end_line": 3388,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3387,col 9)-(line 3387,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(int, int)",
      "begin_line": 3395,
      "end_line": 3397,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3396,col 9)-(line 3396,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(long, long)",
      "begin_line": 3404,
      "end_line": 3406,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3405,col 9)-(line 3405,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(float, float)",
      "begin_line": 3413,
      "end_line": 3431,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3414,col 9)-(line 3416,col 9)",
        "(line 3417,col 9)-(line 3419,col 9)",
        "(line 3421,col 9)-(line 3423,col 9)",
        "(line 3426,col 9)-(line 3426,col 46)",
        "(line 3427,col 9)-(line 3429,col 9)",
        "(line 3430,col 9)-(line 3430,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.min(double, double)",
      "begin_line": 3438,
      "end_line": 3456,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3439,col 9)-(line 3441,col 9)",
        "(line 3442,col 9)-(line 3444,col 9)",
        "(line 3446,col 9)-(line 3448,col 9)",
        "(line 3451,col 9)-(line 3451,col 50)",
        "(line 3452,col 9)-(line 3454,col 9)",
        "(line 3455,col 9)-(line 3455,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(int, int)",
      "begin_line": 3463,
      "end_line": 3465,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3464,col 9)-(line 3464,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(long, long)",
      "begin_line": 3472,
      "end_line": 3474,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3473,col 9)-(line 3473,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(float, float)",
      "begin_line": 3481,
      "end_line": 3499,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3482,col 9)-(line 3484,col 9)",
        "(line 3485,col 9)-(line 3487,col 9)",
        "(line 3489,col 9)-(line 3491,col 9)",
        "(line 3494,col 9)-(line 3494,col 46)",
        "(line 3495,col 9)-(line 3497,col 9)",
        "(line 3498,col 9)-(line 3498,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.max(double, double)",
      "begin_line": 3506,
      "end_line": 3524,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3507,col 9)-(line 3509,col 9)",
        "(line 3510,col 9)-(line 3512,col 9)",
        "(line 3514,col 9)-(line 3516,col 9)",
        "(line 3519,col 9)-(line 3519,col 50)",
        "(line 3520,col 9)-(line 3522,col 9)",
        "(line 3523,col 9)-(line 3523,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.hypot(double, double)",
      "begin_line": 3540,
      "end_line": 3573,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3541,col 9)-(line 3572,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3595,
      "end_line": 3597,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3596,col 9)-(line 3596,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(double, double)",
      "begin_line": 3607,
      "end_line": 3614,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3608,col 9)-(line 3608,col 52)",
        "(line 3609,col 9)-(line 3609,col 47)",
        "(line 3610,col 9)-(line 3612,col 9)",
        "(line 3613,col 9)-(line 3613,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.copySign(float, float)",
      "begin_line": 3624,
      "end_line": 3631,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3625,col 9)-(line 3625,col 48)",
        "(line 3626,col 9)-(line 3626,col 43)",
        "(line 3627,col 9)-(line 3629,col 9)",
        "(line 3630,col 9)-(line 3630,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(double)",
      "begin_line": 3642,
      "end_line": 3644,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3643,col 9)-(line 3643,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.getExponent(float)",
      "begin_line": 3655,
      "end_line": 3657,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3656,col 9)-(line 3656,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.main(java.lang.String[])",
      "begin_line": 3664,
      "end_line": 3677,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3665,col 9)-(line 3665,col 37)",
        "(line 3666,col 9)-(line 3666,col 104)",
        "(line 3667,col 9)-(line 3667,col 104)",
        "(line 3668,col 9)-(line 3668,col 108)",
        "(line 3669,col 9)-(line 3669,col 108)",
        "(line 3670,col 9)-(line 3670,col 76)",
        "(line 3671,col 9)-(line 3671,col 83)",
        "(line 3672,col 9)-(line 3672,col 83)",
        "(line 3673,col 9)-(line 3673,col 87)",
        "(line 3674,col 9)-(line 3674,col 87)",
        "(line 3675,col 9)-(line 3675,col 89)",
        "(line 3676,col 9)-(line 3676,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3680,
      "end_line": 3716,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3684,
      "end_line": 3684,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3688,
      "end_line": 3688,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3719,
      "end_line": 3749,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3724,
      "end_line": 3724,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3728,
      "end_line": 3728,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3752,
      "end_line": 3769,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3754,
      "end_line": 3754,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "class_interface",
      "name": "CodyWaite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3772,
      "end_line": 3841,
      "comment": " Enclose the Cody/Waite reduction (used in \"sin\", \"cos\" and \"tan\"). "
    },
    {
      "type": "field",
      "varNames": [
        "finalK"
      ],
      "begin_line": 3774,
      "end_line": 3774,
      "comment": " k "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemA"
      ],
      "begin_line": 3776,
      "end_line": 3776,
      "comment": " remA "
    },
    {
      "type": "field",
      "varNames": [
        "finalRemB"
      ],
      "begin_line": 3778,
      "end_line": 3778,
      "comment": " remB "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.CodyWaite(double, double)",
      "begin_line": 3784,
      "end_line": 3821,
      "comment": "\n         * @param xa Argument.\n         * @param xb Argument.\n         ",
      "child_ranges": [
        "(line 3788,col 13)-(line 3788,col 51)",
        "(line 3791,col 13)-(line 3791,col 24)",
        "(line 3792,col 13)-(line 3792,col 24)",
        "(line 3793,col 13)-(line 3816,col 13)",
        "(line 3818,col 13)-(line 3818,col 28)",
        "(line 3819,col 13)-(line 3819,col 34)",
        "(line 3820,col 13)-(line 3820,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getK()",
      "begin_line": 3826,
      "end_line": 3828,
      "comment": "\n         * @return k\n         ",
      "child_ranges": [
        "(line 3827,col 13)-(line 3827,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemA()",
      "begin_line": 3832,
      "end_line": 3834,
      "comment": "\n         * @return remA\n         ",
      "child_ranges": [
        "(line 3833,col 13)-(line 3833,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMath.CodyWaite.getRemB()",
      "begin_line": 3838,
      "end_line": 3840,
      "comment": "\n         * @return remB\n         ",
      "child_ranges": [
        "(line 3839,col 13)-(line 3839,col 29)"
      ]
    }
  ]
}