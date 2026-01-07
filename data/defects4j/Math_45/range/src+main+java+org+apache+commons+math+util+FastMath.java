{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 3791,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.util.FastMath.FastMath()",
      "begin_line": 349,
      "end_line": 349,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.doubleHighPart(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.sqrt(double)",
      "begin_line": 374,
      "end_line": 376,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosh(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.sinh(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.tanh(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.acosh(double)",
      "begin_line": 680,
      "end_line": 682,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asinh(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.atanh(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.signum(double)",
      "begin_line": 749,
      "end_line": 751,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(float)",
      "begin_line": 758,
      "end_line": 760,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(double)",
      "begin_line": 766,
      "end_line": 768,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(float)",
      "begin_line": 774,
      "end_line": 776,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.random()",
      "begin_line": 782,
      "end_line": 784,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double)",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double, double, double[])",
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
      "signature": "org.apache.commons.math.util.FastMath.expm1(double)",
      "begin_line": 938,
      "end_line": 940,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 939,col 7)-(line 939,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double, double[])",
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
      "signature": "org.apache.commons.math.util.FastMath.log(double)",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double[])",
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
      "signature": "org.apache.commons.math.util.FastMath.log1p(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.log10(double)",
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
      "signature": "org.apache.commons.math.util.FastMath.pow(double, double)",
      "begin_line": 1399,
      "end_line": 1557,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1400,col 43)",
        "(line 1402,col 9)-(line 1404,col 9)",
        "(line 1406,col 9)-(line 1408,col 9)",
        "(line 1411,col 9)-(line 1434,col 9)",
        "(line 1436,col 9)-(line 1445,col 9)",
        "(line 1447,col 9)-(line 1457,col 9)",
        "(line 1459,col 9)-(line 1481,col 9)",
        "(line 1483,col 9)-(line 1494,col 9)",
        "(line 1497,col 9)-(line 1509,col 9)",
        "(line 1512,col 9)-(line 1512,col 18)",
        "(line 1513,col 9)-(line 1513,col 18)",
        "(line 1514,col 9)-(line 1523,col 9)",
        "(line 1526,col 9)-(line 1526,col 41)",
        "(line 1527,col 9)-(line 1529,col 9)",
        "(line 1531,col 9)-(line 1531,col 28)",
        "(line 1532,col 9)-(line 1532,col 28)",
        "(line 1535,col 9)-(line 1535,col 41)",
        "(line 1536,col 9)-(line 1536,col 40)",
        "(line 1537,col 9)-(line 1537,col 26)",
        "(line 1538,col 9)-(line 1538,col 19)",
        "(line 1541,col 9)-(line 1541,col 35)",
        "(line 1542,col 9)-(line 1542,col 57)",
        "(line 1544,col 9)-(line 1544,col 20)",
        "(line 1545,col 9)-(line 1545,col 31)",
        "(line 1547,col 9)-(line 1547,col 31)",
        "(line 1548,col 9)-(line 1548,col 35)",
        "(line 1549,col 9)-(line 1549,col 34)",
        "(line 1550,col 9)-(line 1550,col 26)",
        "(line 1551,col 9)-(line 1551,col 26)",
        "(line 1552,col 9)-(line 1552,col 20)",
        "(line 1554,col 9)-(line 1554,col 48)",
        "(line 1556,col 9)-(line 1556,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polySine(double)",
      "begin_line": 1566,
      "end_line": 1579,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1568,col 24)",
        "(line 1570,col 9)-(line 1570,col 41)",
        "(line 1571,col 9)-(line 1571,col 44)",
        "(line 1572,col 9)-(line 1572,col 42)",
        "(line 1573,col 9)-(line 1573,col 42)",
        "(line 1576,col 9)-(line 1576,col 23)",
        "(line 1578,col 9)-(line 1578,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polyCosine(double)",
      "begin_line": 1587,
      "end_line": 1597,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 24)",
        "(line 1590,col 9)-(line 1590,col 40)",
        "(line 1591,col 9)-(line 1591,col 44)",
        "(line 1592,col 9)-(line 1592,col 42)",
        "(line 1593,col 9)-(line 1593,col 42)",
        "(line 1594,col 9)-(line 1594,col 16)",
        "(line 1596,col 9)-(line 1596,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinQ(double, double)",
      "begin_line": 1606,
      "end_line": 1721,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1607,col 9)-(line 1607,col 43)",
        "(line 1608,col 9)-(line 1608,col 49)",
        "(line 1611,col 9)-(line 1611,col 47)",
        "(line 1612,col 9)-(line 1612,col 47)",
        "(line 1613,col 9)-(line 1613,col 49)",
        "(line 1614,col 9)-(line 1614,col 49)",
        "(line 1617,col 9)-(line 1617,col 33)",
        "(line 1618,col 9)-(line 1618,col 43)",
        "(line 1619,col 9)-(line 1619,col 35)",
        "(line 1620,col 9)-(line 1620,col 51)",
        "(line 1623,col 9)-(line 1623,col 51)",
        "(line 1624,col 9)-(line 1624,col 47)",
        "(line 1625,col 9)-(line 1625,col 36)",
        "(line 1626,col 9)-(line 1626,col 24)",
        "(line 1629,col 9)-(line 1629,col 22)",
        "(line 1652,col 9)-(line 1652,col 21)",
        "(line 1653,col 9)-(line 1653,col 21)",
        "(line 1655,col 9)-(line 1655,col 25)",
        "(line 1656,col 9)-(line 1656,col 25)",
        "(line 1657,col 9)-(line 1657,col 32)",
        "(line 1658,col 9)-(line 1658,col 14)",
        "(line 1659,col 9)-(line 1659,col 18)",
        "(line 1661,col 9)-(line 1661,col 28)",
        "(line 1662,col 9)-(line 1662,col 18)",
        "(line 1663,col 9)-(line 1663,col 25)",
        "(line 1664,col 9)-(line 1664,col 14)",
        "(line 1665,col 9)-(line 1665,col 18)",
        "(line 1667,col 9)-(line 1667,col 50)",
        "(line 1682,col 9)-(line 1682,col 76)",
        "(line 1709,col 9)-(line 1716,col 9)",
        "(line 1718,col 9)-(line 1718,col 23)",
        "(line 1720,col 9)-(line 1720,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosQ(double, double)",
      "begin_line": 1730,
      "end_line": 1739,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1731,col 9)-(line 1731,col 47)",
        "(line 1732,col 9)-(line 1732,col 50)",
        "(line 1734,col 9)-(line 1734,col 35)",
        "(line 1735,col 9)-(line 1735,col 36)",
        "(line 1736,col 9)-(line 1736,col 23)",
        "(line 1738,col 9)-(line 1738,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1749,
      "end_line": 1884,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1751,col 9)-(line 1751,col 43)",
        "(line 1752,col 9)-(line 1752,col 49)",
        "(line 1755,col 9)-(line 1755,col 47)",
        "(line 1756,col 9)-(line 1756,col 47)",
        "(line 1757,col 9)-(line 1757,col 49)",
        "(line 1758,col 9)-(line 1758,col 49)",
        "(line 1761,col 9)-(line 1761,col 33)",
        "(line 1762,col 9)-(line 1762,col 43)",
        "(line 1763,col 9)-(line 1763,col 35)",
        "(line 1764,col 9)-(line 1764,col 51)",
        "(line 1767,col 9)-(line 1767,col 45)",
        "(line 1768,col 9)-(line 1768,col 47)",
        "(line 1769,col 9)-(line 1769,col 36)",
        "(line 1770,col 9)-(line 1770,col 24)",
        "(line 1795,col 9)-(line 1795,col 21)",
        "(line 1796,col 9)-(line 1796,col 21)",
        "(line 1799,col 9)-(line 1799,col 25)",
        "(line 1800,col 9)-(line 1800,col 25)",
        "(line 1801,col 9)-(line 1801,col 32)",
        "(line 1802,col 9)-(line 1802,col 14)",
        "(line 1803,col 9)-(line 1803,col 18)",
        "(line 1805,col 9)-(line 1805,col 26)",
        "(line 1806,col 9)-(line 1806,col 18)",
        "(line 1807,col 9)-(line 1807,col 25)",
        "(line 1808,col 9)-(line 1808,col 14)",
        "(line 1809,col 9)-(line 1809,col 18)",
        "(line 1811,col 9)-(line 1811,col 46)",
        "(line 1812,col 9)-(line 1812,col 70)",
        "(line 1814,col 9)-(line 1814,col 28)",
        "(line 1815,col 9)-(line 1815,col 38)",
        "(line 1819,col 9)-(line 1819,col 28)",
        "(line 1821,col 9)-(line 1821,col 26)",
        "(line 1822,col 9)-(line 1822,col 18)",
        "(line 1823,col 9)-(line 1823,col 25)",
        "(line 1824,col 9)-(line 1824,col 14)",
        "(line 1825,col 9)-(line 1825,col 18)",
        "(line 1827,col 9)-(line 1827,col 27)",
        "(line 1828,col 9)-(line 1828,col 18)",
        "(line 1829,col 9)-(line 1829,col 25)",
        "(line 1830,col 9)-(line 1830,col 14)",
        "(line 1831,col 9)-(line 1831,col 18)",
        "(line 1833,col 9)-(line 1833,col 62)",
        "(line 1834,col 9)-(line 1834,col 64)",
        "(line 1836,col 9)-(line 1836,col 28)",
        "(line 1837,col 9)-(line 1837,col 38)",
        "(line 1839,col 9)-(line 1843,col 9)",
        "(line 1856,col 9)-(line 1856,col 31)",
        "(line 1859,col 9)-(line 1859,col 34)",
        "(line 1860,col 9)-(line 1860,col 42)",
        "(line 1861,col 9)-(line 1861,col 34)",
        "(line 1863,col 9)-(line 1863,col 35)",
        "(line 1864,col 9)-(line 1864,col 44)",
        "(line 1865,col 9)-(line 1865,col 37)",
        "(line 1868,col 9)-(line 1868,col 85)",
        "(line 1869,col 9)-(line 1869,col 25)",
        "(line 1870,col 9)-(line 1870,col 42)",
        "(line 1872,col 9)-(line 1881,col 9)",
        "(line 1883,col 9)-(line 1883,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 1897,
      "end_line": 2107,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1900,col 9)-(line 1900,col 49)",
        "(line 1901,col 9)-(line 1901,col 61)",
        "(line 1904,col 9)-(line 1904,col 38)",
        "(line 1905,col 9)-(line 1905,col 38)",
        "(line 1908,col 9)-(line 1908,col 19)",
        "(line 1909,col 9)-(line 1909,col 22)",
        "(line 1912,col 9)-(line 1912,col 19)",
        "(line 1913,col 9)-(line 1913,col 19)",
        "(line 1914,col 9)-(line 1914,col 19)",
        "(line 1915,col 9)-(line 1915,col 32)",
        "(line 1916,col 9)-(line 1916,col 42)",
        "(line 1918,col 9)-(line 1927,col 9)",
        "(line 1930,col 9)-(line 1930,col 31)",
        "(line 1931,col 9)-(line 1931,col 38)",
        "(line 1933,col 9)-(line 1933,col 30)",
        "(line 1934,col 9)-(line 1934,col 37)",
        "(line 1936,col 9)-(line 1936,col 24)",
        "(line 1937,col 9)-(line 1937,col 24)",
        "(line 1938,col 9)-(line 1938,col 24)",
        "(line 1939,col 9)-(line 1939,col 24)",
        "(line 1941,col 9)-(line 1941,col 37)",
        "(line 1942,col 9)-(line 1942,col 38)",
        "(line 1944,col 9)-(line 1944,col 55)",
        "(line 1945,col 9)-(line 1945,col 48)",
        "(line 1946,col 9)-(line 1946,col 60)",
        "(line 1949,col 9)-(line 1952,col 9)",
        "(line 1954,col 9)-(line 1954,col 50)",
        "(line 1955,col 9)-(line 1955,col 40)",
        "(line 1957,col 9)-(line 1957,col 35)",
        "(line 1958,col 9)-(line 1958,col 36)",
        "(line 1960,col 9)-(line 1960,col 52)",
        "(line 1963,col 9)-(line 1966,col 9)",
        "(line 1969,col 9)-(line 1969,col 25)",
        "(line 1970,col 9)-(line 1970,col 32)",
        "(line 1971,col 9)-(line 1971,col 19)",
        "(line 1972,col 9)-(line 1972,col 19)",
        "(line 1973,col 9)-(line 1973,col 19)",
        "(line 1976,col 9)-(line 1976,col 37)",
        "(line 1978,col 9)-(line 1978,col 50)",
        "(line 1979,col 9)-(line 1979,col 48)",
        "(line 1980,col 9)-(line 1980,col 20)",
        "(line 1981,col 9)-(line 1981,col 52)",
        "(line 1983,col 9)-(line 1986,col 9)",
        "(line 1989,col 9)-(line 1989,col 25)",
        "(line 1990,col 9)-(line 1990,col 32)",
        "(line 1992,col 9)-(line 1992,col 19)",
        "(line 1993,col 9)-(line 1993,col 19)",
        "(line 1994,col 9)-(line 1994,col 19)",
        "(line 1996,col 9)-(line 1996,col 40)",
        "(line 2008,col 9)-(line 2008,col 42)",
        "(line 2011,col 9)-(line 2011,col 20)",
        "(line 2012,col 9)-(line 2012,col 30)",
        "(line 2013,col 9)-(line 2013,col 20)",
        "(line 2016,col 9)-(line 2016,col 25)",
        "(line 2017,col 9)-(line 2017,col 32)",
        "(line 2019,col 9)-(line 2019,col 34)",
        "(line 2020,col 9)-(line 2020,col 41)",
        "(line 2022,col 9)-(line 2022,col 19)",
        "(line 2023,col 9)-(line 2023,col 19)",
        "(line 2024,col 9)-(line 2024,col 19)",
        "(line 2025,col 9)-(line 2025,col 19)",
        "(line 2027,col 9)-(line 2027,col 38)",
        "(line 2028,col 9)-(line 2028,col 39)",
        "(line 2030,col 9)-(line 2030,col 47)",
        "(line 2031,col 9)-(line 2031,col 40)",
        "(line 2032,col 9)-(line 2032,col 53)",
        "(line 2035,col 9)-(line 2038,col 9)",
        "(line 2040,col 9)-(line 2040,col 51)",
        "(line 2041,col 9)-(line 2041,col 40)",
        "(line 2043,col 9)-(line 2043,col 37)",
        "(line 2044,col 9)-(line 2044,col 38)",
        "(line 2046,col 9)-(line 2046,col 53)",
        "(line 2049,col 9)-(line 2052,col 9)",
        "(line 2055,col 9)-(line 2055,col 34)",
        "(line 2056,col 9)-(line 2056,col 41)",
        "(line 2057,col 9)-(line 2057,col 19)",
        "(line 2058,col 9)-(line 2058,col 19)",
        "(line 2059,col 9)-(line 2059,col 19)",
        "(line 2062,col 9)-(line 2062,col 37)",
        "(line 2064,col 9)-(line 2064,col 51)",
        "(line 2065,col 9)-(line 2065,col 48)",
        "(line 2066,col 9)-(line 2066,col 21)",
        "(line 2067,col 9)-(line 2067,col 53)",
        "(line 2069,col 9)-(line 2072,col 9)",
        "(line 2075,col 9)-(line 2075,col 25)",
        "(line 2076,col 9)-(line 2076,col 32)",
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
        "(line 2097,col 9)-(line 2097,col 53)",
        "(line 2098,col 9)-(line 2098,col 98)",
        "(line 2100,col 9)-(line 2100,col 34)",
        "(line 2101,col 9)-(line 2101,col 44)",
        "(line 2104,col 9)-(line 2104,col 28)",
        "(line 2105,col 9)-(line 2105,col 31)",
        "(line 2106,col 9)-(line 2106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sin(double)",
      "begin_line": 2114,
      "end_line": 2205,
      "comment": "\n     *  Sine function.\n     *  @param x a number\n     *  @return sin(x)\n     ",
      "child_ranges": [
        "(line 2115,col 9)-(line 2115,col 33)",
        "(line 2116,col 9)-(line 2116,col 25)",
        "(line 2117,col 9)-(line 2117,col 18)",
        "(line 2118,col 9)-(line 2118,col 24)",
        "(line 2121,col 9)-(line 2121,col 15)",
        "(line 2122,col 9)-(line 2125,col 9)",
        "(line 2128,col 9)-(line 2134,col 9)",
        "(line 2136,col 9)-(line 2138,col 9)",
        "(line 2141,col 9)-(line 2187,col 9)",
        "(line 2189,col 9)-(line 2191,col 9)",
        "(line 2193,col 9)-(line 2204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cos(double)",
      "begin_line": 2212,
      "end_line": 2290,
      "comment": "\n     *  Cosine function\n     *  @param x a number\n     *  @return cos(x)\n     ",
      "child_ranges": [
        "(line 2213,col 9)-(line 2213,col 25)",
        "(line 2216,col 9)-(line 2216,col 22)",
        "(line 2217,col 9)-(line 2219,col 9)",
        "(line 2221,col 9)-(line 2223,col 9)",
        "(line 2226,col 9)-(line 2226,col 22)",
        "(line 2227,col 9)-(line 2273,col 9)",
        "(line 2278,col 9)-(line 2289,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tan(double)",
      "begin_line": 2297,
      "end_line": 2398,
      "comment": "\n     *   Tangent function\n     *  @param x a number\n     *  @return tan(x)\n     ",
      "child_ranges": [
        "(line 2298,col 9)-(line 2298,col 33)",
        "(line 2299,col 9)-(line 2299,col 25)",
        "(line 2302,col 9)-(line 2302,col 22)",
        "(line 2303,col 9)-(line 2306,col 9)",
        "(line 2309,col 9)-(line 2315,col 9)",
        "(line 2317,col 9)-(line 2319,col 9)",
        "(line 2322,col 9)-(line 2322,col 22)",
        "(line 2323,col 9)-(line 2369,col 9)",
        "(line 2371,col 9)-(line 2384,col 9)",
        "(line 2386,col 9)-(line 2386,col 22)",
        "(line 2387,col 9)-(line 2391,col 9)",
        "(line 2393,col 9)-(line 2395,col 9)",
        "(line 2397,col 9)-(line 2397,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double)",
      "begin_line": 2405,
      "end_line": 2407,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2406,col 9)-(line 2406,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2415,
      "end_line": 2557,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2416,col 9)-(line 2416,col 31)",
        "(line 2417,col 9)-(line 2417,col 16)",
        "(line 2419,col 9)-(line 2421,col 9)",
        "(line 2423,col 9)-(line 2428,col 9)",
        "(line 2430,col 9)-(line 2432,col 9)",
        "(line 2435,col 9)-(line 2440,col 9)",
        "(line 2441,col 9)-(line 2441,col 48)",
        "(line 2442,col 9)-(line 2442,col 58)",
        "(line 2443,col 9)-(line 2443,col 42)",
        "(line 2445,col 9)-(line 2445,col 34)",
        "(line 2446,col 9)-(line 2446,col 37)",
        "(line 2447,col 9)-(line 2447,col 20)",
        "(line 2450,col 9)-(line 2450,col 33)",
        "(line 2451,col 9)-(line 2451,col 37)",
        "(line 2452,col 9)-(line 2452,col 33)",
        "(line 2453,col 9)-(line 2453,col 16)",
        "(line 2454,col 9)-(line 2454,col 17)",
        "(line 2457,col 9)-(line 2489,col 9)",
        "(line 2492,col 9)-(line 2492,col 18)",
        "(line 2493,col 9)-(line 2493,col 18)",
        "(line 2496,col 9)-(line 2496,col 33)",
        "(line 2507,col 9)-(line 2507,col 33)",
        "(line 2508,col 9)-(line 2508,col 47)",
        "(line 2509,col 9)-(line 2509,col 46)",
        "(line 2510,col 9)-(line 2510,col 46)",
        "(line 2511,col 9)-(line 2511,col 46)",
        "(line 2512,col 9)-(line 2512,col 47)",
        "(line 2513,col 9)-(line 2513,col 31)",
        "(line 2516,col 9)-(line 2516,col 18)",
        "(line 2518,col 9)-(line 2518,col 23)",
        "(line 2519,col 9)-(line 2519,col 31)",
        "(line 2520,col 9)-(line 2520,col 18)",
        "(line 2523,col 9)-(line 2523,col 41)",
        "(line 2525,col 9)-(line 2525,col 22)",
        "(line 2526,col 9)-(line 2526,col 23)",
        "(line 2529,col 9)-(line 2529,col 38)",
        "(line 2530,col 9)-(line 2530,col 46)",
        "(line 2531,col 9)-(line 2531,col 23)",
        "(line 2532,col 9)-(line 2532,col 32)",
        "(line 2533,col 9)-(line 2533,col 18)",
        "(line 2535,col 9)-(line 2535,col 25)",
        "(line 2536,col 9)-(line 2536,col 38)",
        "(line 2538,col 9)-(line 2549,col 9)",
        "(line 2552,col 9)-(line 2554,col 9)",
        "(line 2556,col 9)-(line 2556,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan2(double, double)",
      "begin_line": 2565,
      "end_line": 2680,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2566,col 9)-(line 2568,col 9)",
        "(line 2570,col 9)-(line 2592,col 9)",
        "(line 2596,col 9)-(line 2606,col 9)",
        "(line 2608,col 9)-(line 2618,col 9)",
        "(line 2620,col 9)-(line 2628,col 9)",
        "(line 2630,col 9)-(line 2639,col 9)",
        "(line 2643,col 9)-(line 2651,col 9)",
        "(line 2654,col 9)-(line 2654,col 29)",
        "(line 2655,col 9)-(line 2657,col 9)",
        "(line 2659,col 9)-(line 2659,col 38)",
        "(line 2660,col 9)-(line 2660,col 27)",
        "(line 2663,col 9)-(line 2663,col 44)",
        "(line 2664,col 9)-(line 2664,col 33)",
        "(line 2666,col 9)-(line 2666,col 62)",
        "(line 2668,col 9)-(line 2668,col 30)",
        "(line 2669,col 9)-(line 2669,col 31)",
        "(line 2670,col 9)-(line 2670,col 18)",
        "(line 2672,col 9)-(line 2674,col 9)",
        "(line 2677,col 9)-(line 2677,col 44)",
        "(line 2679,col 9)-(line 2679,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asin(double)",
      "begin_line": 2686,
      "end_line": 2756,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
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
        "(line 2730,col 7)-(line 2730,col 15)",
        "(line 2731,col 7)-(line 2731,col 19)",
        "(line 2732,col 7)-(line 2732,col 30)",
        "(line 2733,col 7)-(line 2733,col 27)",
        "(line 2734,col 7)-(line 2734,col 18)",
        "(line 2737,col 7)-(line 2737,col 53)",
        "(line 2740,col 7)-(line 2740,col 31)",
        "(line 2743,col 7)-(line 2743,col 21)",
        "(line 2744,col 7)-(line 2744,col 30)",
        "(line 2745,col 7)-(line 2745,col 34)",
        "(line 2746,col 7)-(line 2746,col 25)",
        "(line 2748,col 7)-(line 2748,col 52)",
        "(line 2749,col 7)-(line 2749,col 28)",
        "(line 2751,col 7)-(line 2751,col 21)",
        "(line 2752,col 7)-(line 2752,col 29)",
        "(line 2753,col 7)-(line 2753,col 16)",
        "(line 2755,col 7)-(line 2755,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acos(double)",
      "begin_line": 2762,
      "end_line": 2838,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2763,col 7)-(line 2765,col 7)",
        "(line 2767,col 7)-(line 2769,col 7)",
        "(line 2771,col 7)-(line 2773,col 7)",
        "(line 2775,col 7)-(line 2777,col 7)",
        "(line 2779,col 7)-(line 2781,col 7)",
        "(line 2786,col 7)-(line 2786,col 37)",
        "(line 2787,col 7)-(line 2787,col 40)",
        "(line 2788,col 7)-(line 2788,col 31)",
        "(line 2791,col 7)-(line 2791,col 24)",
        "(line 2792,col 7)-(line 2792,col 36)",
        "(line 2795,col 7)-(line 2795,col 15)",
        "(line 2796,col 7)-(line 2796,col 15)",
        "(line 2798,col 7)-(line 2798,col 27)",
        "(line 2799,col 7)-(line 2799,col 35)",
        "(line 2801,col 7)-(line 2801,col 21)",
        "(line 2802,col 7)-(line 2802,col 30)",
        "(line 2803,col 7)-(line 2803,col 16)",
        "(line 2806,col 7)-(line 2806,col 26)",
        "(line 2807,col 7)-(line 2807,col 30)",
        "(line 2808,col 7)-(line 2808,col 27)",
        "(line 2809,col 7)-(line 2809,col 18)",
        "(line 2812,col 7)-(line 2812,col 53)",
        "(line 2815,col 7)-(line 2815,col 25)",
        "(line 2816,col 7)-(line 2816,col 16)",
        "(line 2817,col 7)-(line 2817,col 26)",
        "(line 2820,col 7)-(line 2820,col 21)",
        "(line 2823,col 7)-(line 2825,col 7)",
        "(line 2827,col 7)-(line 2827,col 36)",
        "(line 2828,col 7)-(line 2828,col 25)",
        "(line 2830,col 7)-(line 2830,col 52)",
        "(line 2831,col 7)-(line 2831,col 19)",
        "(line 2833,col 7)-(line 2833,col 21)",
        "(line 2834,col 7)-(line 2834,col 29)",
        "(line 2835,col 7)-(line 2835,col 16)",
        "(line 2837,col 7)-(line 2837,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cbrt(double)",
      "begin_line": 2844,
      "end_line": 2922,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2846,col 7)-(line 2846,col 47)",
        "(line 2847,col 7)-(line 2847,col 59)",
        "(line 2848,col 7)-(line 2848,col 32)",
        "(line 2850,col 7)-(line 2860,col 7)",
        "(line 2862,col 7)-(line 2865,col 7)",
        "(line 2868,col 7)-(line 2868,col 30)",
        "(line 2871,col 7)-(line 2872,col 81)",
        "(line 2875,col 7)-(line 2875,col 104)",
        "(line 2878,col 7)-(line 2878,col 41)",
        "(line 2879,col 7)-(line 2879,col 44)",
        "(line 2880,col 7)-(line 2880,col 45)",
        "(line 2881,col 7)-(line 2881,col 44)",
        "(line 2882,col 7)-(line 2882,col 44)",
        "(line 2884,col 7)-(line 2884,col 39)",
        "(line 2889,col 7)-(line 2889,col 39)",
        "(line 2890,col 7)-(line 2890,col 46)",
        "(line 2891,col 7)-(line 2891,col 46)",
        "(line 2894,col 7)-(line 2894,col 39)",
        "(line 2895,col 7)-(line 2895,col 36)",
        "(line 2896,col 7)-(line 2896,col 27)",
        "(line 2898,col 7)-(line 2898,col 26)",
        "(line 2899,col 7)-(line 2899,col 42)",
        "(line 2900,col 7)-(line 2900,col 31)",
        "(line 2901,col 7)-(line 2901,col 38)",
        "(line 2902,col 7)-(line 2902,col 23)",
        "(line 2903,col 7)-(line 2903,col 17)",
        "(line 2905,col 7)-(line 2905,col 39)",
        "(line 2906,col 7)-(line 2906,col 19)",
        "(line 2908,col 7)-(line 2908,col 26)",
        "(line 2909,col 7)-(line 2909,col 34)",
        "(line 2910,col 7)-(line 2910,col 15)",
        "(line 2912,col 7)-(line 2912,col 33)",
        "(line 2915,col 7)-(line 2915,col 16)",
        "(line 2917,col 7)-(line 2919,col 7)",
        "(line 2921,col 7)-(line 2921,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toRadians(double)",
      "begin_line": 2929,
      "end_line": 2947,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2931,col 9)-(line 2933,col 9)",
        "(line 2936,col 9)-(line 2936,col 49)",
        "(line 2937,col 9)-(line 2937,col 50)",
        "(line 2939,col 9)-(line 2939,col 38)",
        "(line 2940,col 9)-(line 2940,col 27)",
        "(line 2942,col 9)-(line 2942,col 74)",
        "(line 2943,col 9)-(line 2945,col 9)",
        "(line 2946,col 9)-(line 2946,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toDegrees(double)",
      "begin_line": 2954,
      "end_line": 2968,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2956,col 9)-(line 2958,col 9)",
        "(line 2961,col 9)-(line 2961,col 46)",
        "(line 2962,col 9)-(line 2962,col 50)",
        "(line 2964,col 9)-(line 2964,col 38)",
        "(line 2965,col 9)-(line 2965,col 27)",
        "(line 2967,col 9)-(line 2967,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(int)",
      "begin_line": 2975,
      "end_line": 2977,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2976,col 9)-(line 2976,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(long)",
      "begin_line": 2984,
      "end_line": 2986,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2985,col 9)-(line 2985,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(float)",
      "begin_line": 2993,
      "end_line": 2995,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2994,col 9)-(line 2994,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(double)",
      "begin_line": 3002,
      "end_line": 3004,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3003,col 9)-(line 3003,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(double)",
      "begin_line": 3011,
      "end_line": 3016,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3012,col 9)-(line 3014,col 9)",
        "(line 3015,col 9)-(line 3015,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(float)",
      "begin_line": 3023,
      "end_line": 3028,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3024,col 9)-(line 3026,col 9)",
        "(line 3027,col 9)-(line 3027,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(double, int)",
      "begin_line": 3036,
      "end_line": 3112,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3039,col 9)-(line 3041,col 9)",
        "(line 3044,col 9)-(line 3046,col 9)",
        "(line 3047,col 9)-(line 3049,col 9)",
        "(line 3050,col 9)-(line 3052,col 9)",
        "(line 3055,col 9)-(line 3055,col 53)",
        "(line 3056,col 9)-(line 3056,col 53)",
        "(line 3057,col 9)-(line 3057,col 56)",
        "(line 3058,col 9)-(line 3058,col 53)",
        "(line 3061,col 9)-(line 3061,col 42)",
        "(line 3063,col 9)-(line 3110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(float, int)",
      "begin_line": 3120,
      "end_line": 3196,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3123,col 9)-(line 3125,col 9)",
        "(line 3128,col 9)-(line 3130,col 9)",
        "(line 3131,col 9)-(line 3133,col 9)",
        "(line 3134,col 9)-(line 3136,col 9)",
        "(line 3139,col 9)-(line 3139,col 49)",
        "(line 3140,col 9)-(line 3140,col 43)",
        "(line 3141,col 9)-(line 3141,col 46)",
        "(line 3142,col 9)-(line 3142,col 43)",
        "(line 3145,col 9)-(line 3145,col 42)",
        "(line 3147,col 9)-(line 3194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(double, double)",
      "begin_line": 3229,
      "end_line": 3252,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3232,col 9)-(line 3240,col 9)",
        "(line 3244,col 9)-(line 3244,col 53)",
        "(line 3245,col 9)-(line 3245,col 53)",
        "(line 3246,col 9)-(line 3250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(float, double)",
      "begin_line": 3285,
      "end_line": 3308,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3288,col 9)-(line 3296,col 9)",
        "(line 3300,col 9)-(line 3300,col 49)",
        "(line 3301,col 9)-(line 3301,col 43)",
        "(line 3302,col 9)-(line 3306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.floor(double)",
      "begin_line": 3314,
      "end_line": 3335,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3315,col 9)-(line 3315,col 15)",
        "(line 3317,col 9)-(line 3319,col 9)",
        "(line 3321,col 9)-(line 3323,col 9)",
        "(line 3325,col 9)-(line 3325,col 21)",
        "(line 3326,col 9)-(line 3328,col 9)",
        "(line 3330,col 9)-(line 3332,col 9)",
        "(line 3334,col 9)-(line 3334,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ceil(double)",
      "begin_line": 3341,
      "end_line": 3360,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3342,col 9)-(line 3342,col 17)",
        "(line 3344,col 9)-(line 3346,col 9)",
        "(line 3348,col 9)-(line 3348,col 21)",
        "(line 3349,col 9)-(line 3351,col 9)",
        "(line 3353,col 9)-(line 3353,col 17)",
        "(line 3355,col 9)-(line 3357,col 9)",
        "(line 3359,col 9)-(line 3359,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.rint(double)",
      "begin_line": 3366,
      "end_line": 3383,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3367,col 9)-(line 3367,col 28)",
        "(line 3368,col 9)-(line 3368,col 25)",
        "(line 3370,col 9)-(line 3375,col 9)",
        "(line 3376,col 9)-(line 3378,col 9)",
        "(line 3381,col 9)-(line 3381,col 26)",
        "(line 3382,col 9)-(line 3382,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(double)",
      "begin_line": 3389,
      "end_line": 3391,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3390,col 9)-(line 3390,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(float)",
      "begin_line": 3397,
      "end_line": 3399,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3398,col 9)-(line 3398,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(int, int)",
      "begin_line": 3406,
      "end_line": 3408,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3407,col 9)-(line 3407,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(long, long)",
      "begin_line": 3415,
      "end_line": 3417,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3416,col 9)-(line 3416,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(float, float)",
      "begin_line": 3424,
      "end_line": 3442,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3425,col 9)-(line 3427,col 9)",
        "(line 3428,col 9)-(line 3430,col 9)",
        "(line 3432,col 9)-(line 3434,col 9)",
        "(line 3437,col 9)-(line 3437,col 46)",
        "(line 3438,col 9)-(line 3440,col 9)",
        "(line 3441,col 9)-(line 3441,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(double, double)",
      "begin_line": 3449,
      "end_line": 3467,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3450,col 9)-(line 3452,col 9)",
        "(line 3453,col 9)-(line 3455,col 9)",
        "(line 3457,col 9)-(line 3459,col 9)",
        "(line 3462,col 9)-(line 3462,col 50)",
        "(line 3463,col 9)-(line 3465,col 9)",
        "(line 3466,col 9)-(line 3466,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(int, int)",
      "begin_line": 3474,
      "end_line": 3476,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3475,col 9)-(line 3475,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(long, long)",
      "begin_line": 3483,
      "end_line": 3485,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3484,col 9)-(line 3484,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(float, float)",
      "begin_line": 3492,
      "end_line": 3510,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3493,col 9)-(line 3495,col 9)",
        "(line 3496,col 9)-(line 3498,col 9)",
        "(line 3500,col 9)-(line 3502,col 9)",
        "(line 3505,col 9)-(line 3505,col 46)",
        "(line 3506,col 9)-(line 3508,col 9)",
        "(line 3509,col 9)-(line 3509,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(double, double)",
      "begin_line": 3517,
      "end_line": 3535,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3518,col 9)-(line 3520,col 9)",
        "(line 3521,col 9)-(line 3523,col 9)",
        "(line 3525,col 9)-(line 3527,col 9)",
        "(line 3530,col 9)-(line 3530,col 50)",
        "(line 3531,col 9)-(line 3533,col 9)",
        "(line 3534,col 9)-(line 3534,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.hypot(double, double)",
      "begin_line": 3551,
      "end_line": 3584,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3552,col 9)-(line 3583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3606,
      "end_line": 3608,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3607,col 9)-(line 3607,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(double, double)",
      "begin_line": 3618,
      "end_line": 3625,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3619,col 9)-(line 3619,col 52)",
        "(line 3620,col 9)-(line 3620,col 47)",
        "(line 3621,col 9)-(line 3623,col 9)",
        "(line 3624,col 9)-(line 3624,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(float, float)",
      "begin_line": 3635,
      "end_line": 3642,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3636,col 9)-(line 3636,col 48)",
        "(line 3637,col 9)-(line 3637,col 43)",
        "(line 3638,col 9)-(line 3640,col 9)",
        "(line 3641,col 9)-(line 3641,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(double)",
      "begin_line": 3653,
      "end_line": 3655,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3654,col 9)-(line 3654,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(float)",
      "begin_line": 3666,
      "end_line": 3668,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 3667,col 9)-(line 3667,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.main(java.lang.String[])",
      "begin_line": 3675,
      "end_line": 3688,
      "comment": "\n     * Print out contents of arrays, and check the length.\n     * \u003cp\u003eused to generate the preset arrays originally.\u003c/p\u003e\n     * @param a unused\n     ",
      "child_ranges": [
        "(line 3676,col 9)-(line 3676,col 37)",
        "(line 3677,col 9)-(line 3677,col 104)",
        "(line 3678,col 9)-(line 3678,col 104)",
        "(line 3679,col 9)-(line 3679,col 108)",
        "(line 3680,col 9)-(line 3680,col 108)",
        "(line 3681,col 9)-(line 3681,col 76)",
        "(line 3682,col 9)-(line 3682,col 83)",
        "(line 3683,col 9)-(line 3683,col 83)",
        "(line 3684,col 9)-(line 3684,col 87)",
        "(line 3685,col 9)-(line 3685,col 87)",
        "(line 3686,col 9)-(line 3686,col 89)",
        "(line 3687,col 9)-(line 3687,col 89)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpIntTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3691,
      "end_line": 3731,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 3695,
      "end_line": 3695,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX].\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 3699,
      "end_line": 3699,
      "comment": " Exponential evaluated at integer values,\n         * exp(x) \u003d  expIntTableA[x + EXP_INT_TABLE_MAX_INDEX] + expIntTableB[x+EXP_INT_TABLE_MAX_INDEX]\n         "
    },
    {
      "type": "class_interface",
      "name": "ExpFracTable",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3734,
      "end_line": 3768,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 3739,
      "end_line": 3739,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         * 1024 \u003d 2^10\n         "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 3743,
      "end_line": 3743,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n         * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n         "
    },
    {
      "type": "class_interface",
      "name": "lnMant",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 3771,
      "end_line": 3790,
      "comment": " Enclose large data table in nested static class so it\u0027s only loaded on first access. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 3773,
      "end_line": 3773,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    }
  ]
}