{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 4077,
      "comment": "\n * Faster, more accurate, portable alternative to {@link Math} and\n * {@link StrictMath} for large scale computation.\n * \u003cp\u003e\n * FastMath speed is achieved by relying heavily on optimizing compilers\n * to native code present in many JVM todays and use of large tables that\n * are computed once at class loading (regardless of the number of subsequent\n * calls to computation methods). This implies that FastMath is targeted\n * more towards large scale computation (i.e. computation that take at least\n * a handful of seconds to complete) on desktop or server machines rather\n * than very small utilities on devices with limited power (i.e. computation\n * that should return a result almost instantly). Note that FastMath is\n * extensively used inside Apache Commons Math, so by calling some algorithms,\n * the one-shot overhead will occur regardless of the end-user calling FastMath\n * methods directly or not. Performance figures for a specific JVM and hardware\n * can be evaluated by running the FastMathTestPerformance tests in the test\n * directory of the source distribution.\n * \u003c/p\u003e\n * \u003cp\u003e\n * FastMath accuracy should be mostly independent of the JVM as it relies only\n * on IEEE-754 basic operations and on embedded tables. Almost all operations\n * are accurate to about 0.5 ulp throughout the domain range. This statement,\n * of course is only a rough global observed behavior, it is \u003cem\u003enot\u003c/em\u003e a\n * guarantee for \u003cem\u003eevery\u003c/em\u003e double numbers input (see William Kahan\u0027s \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Rounding#The_table-maker.27s_dilemma\"\u003eTable\n * Maker\u0027s Dilemma\u003c/a\u003e).\n * \u003c/p\u003e\n * \u003cp\u003e\n * Additionally implements the following methods not found in StrictMath:\n * \u003cul\u003e\n * \u003cli\u003e{@link #asinh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #acosh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #atanh(double)}\u003c/li\u003e\n * \u003c/ul\u003e\n * The following methods are found in StrictMath since 1.6 only\n * \u003cul\u003e\n * \u003cli\u003e{@link #copySign(double, double)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(double,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(double, int)}\u003c/li\u003e\n * \u003cli\u003e{@link #copySign(float, float)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(float,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(float, int)}\u003c/li\u003e\n * \u003c/ul\u003e\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "PI"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Archimede\u0027s constant PI, ratio of circle circumference to diameter. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Napier\u0027s constant e, base of the natural logarithm. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + 750] + expIntTableB[x+750].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + 750] + expIntTableB[x+750]\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FACT"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Factorial table, for Taylor series expansions. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_A"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " log(2) (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_B"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " log(2) (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_SPLIT_COEF"
      ],
      "begin_line": 110,
      "end_line": 127,
      "comment": " Coefficients for slowLog. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_QUICK_COEF"
      ],
      "begin_line": 130,
      "end_line": 140,
      "comment": " Coefficients for log, when input 0.99 \u003c x \u003c 1.01. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_HI_PREC_COEF"
      ],
      "begin_line": 143,
      "end_line": 150,
      "comment": " Coefficients for log in the range of 1.0 \u003c x \u003c 1.0 + 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_A"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Sine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_B"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Sine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_A"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Cosine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_B"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Cosine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_A"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Tangent table, used by atan() (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_B"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " Tangent table, used by atan() (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "RECIP_2PI"
      ],
      "begin_line": 171,
      "end_line": 189,
      "comment": " Bits of 1/(2*pi), need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "PI_O_4_BITS"
      ],
      "begin_line": 192,
      "end_line": 194,
      "comment": " Bits of pi/4, need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "EIGHTHS"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Eighths.\n     * This is used by sinQ, because its faster to do a table lookup than\n     * a multiply in this time-critical routine\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CBRTTWO"
      ],
      "begin_line": 203,
      "end_line": 207,
      "comment": " Table of 2^((n+2)/3) "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_40000000"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " 1073741824L"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_30BITS"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " 0xFFFFFFFFC0000000L;"
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_52"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.FastMath.FastMath()",
      "begin_line": 275,
      "end_line": 276,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.doubleHighPart(double)",
      "begin_line": 287,
      "end_line": 294,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 45)",
        "(line 292,col 9)-(line 292,col 30)",
        "(line 293,col 9)-(line 293,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sqrt(double)",
      "begin_line": 301,
      "end_line": 303,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosh(double)",
      "begin_line": 309,
      "end_line": 357,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 310,col 7)-(line 312,col 7)",
        "(line 314,col 7)-(line 316,col 7)",
        "(line 318,col 7)-(line 320,col 7)",
        "(line 322,col 7)-(line 322,col 38)",
        "(line 323,col 7)-(line 325,col 7)",
        "(line 326,col 7)-(line 326,col 26)",
        "(line 328,col 7)-(line 328,col 40)",
        "(line 329,col 7)-(line 329,col 48)",
        "(line 331,col 7)-(line 331,col 38)",
        "(line 332,col 7)-(line 332,col 36)",
        "(line 333,col 7)-(line 333,col 28)",
        "(line 336,col 7)-(line 336,col 28)",
        "(line 337,col 7)-(line 337,col 34)",
        "(line 338,col 7)-(line 338,col 42)",
        "(line 339,col 7)-(line 339,col 37)",
        "(line 342,col 7)-(line 342,col 82)",
        "(line 344,col 7)-(line 344,col 36)",
        "(line 347,col 7)-(line 347,col 25)",
        "(line 348,col 7)-(line 348,col 34)",
        "(line 349,col 7)-(line 349,col 16)",
        "(line 350,col 7)-(line 350,col 25)",
        "(line 351,col 7)-(line 351,col 34)",
        "(line 352,col 7)-(line 352,col 16)",
        "(line 354,col 7)-(line 354,col 30)",
        "(line 355,col 7)-(line 355,col 20)",
        "(line 356,col 7)-(line 356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinh(double)",
      "begin_line": 363,
      "end_line": 467,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 364,col 7)-(line 364,col 29)",
        "(line 365,col 7)-(line 367,col 7)",
        "(line 369,col 7)-(line 371,col 7)",
        "(line 373,col 7)-(line 375,col 7)",
        "(line 377,col 7)-(line 379,col 7)",
        "(line 381,col 7)-(line 384,col 7)",
        "(line 386,col 7)-(line 386,col 20)",
        "(line 388,col 7)-(line 460,col 7)",
        "(line 462,col 7)-(line 464,col 7)",
        "(line 466,col 7)-(line 466,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanh(double)",
      "begin_line": 473,
      "end_line": 585,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 474,col 7)-(line 474,col 29)",
        "(line 476,col 7)-(line 478,col 7)",
        "(line 480,col 7)-(line 482,col 7)",
        "(line 484,col 7)-(line 486,col 7)",
        "(line 488,col 7)-(line 490,col 7)",
        "(line 492,col 7)-(line 495,col 7)",
        "(line 497,col 7)-(line 497,col 20)",
        "(line 498,col 7)-(line 578,col 7)",
        "(line 580,col 7)-(line 582,col 7)",
        "(line 584,col 7)-(line 584,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acosh(double)",
      "begin_line": 591,
      "end_line": 593,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asinh(double)",
      "begin_line": 599,
      "end_line": 625,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 33)",
        "(line 602,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 607,col 24)",
        "(line 608,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 623,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atanh(double)",
      "begin_line": 631,
      "end_line": 657,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 33)",
        "(line 634,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 24)",
        "(line 640,col 9)-(line 653,col 9)",
        "(line 655,col 9)-(line 655,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(double)",
      "begin_line": 664,
      "end_line": 666,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(float)",
      "begin_line": 673,
      "end_line": 675,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(double)",
      "begin_line": 681,
      "end_line": 683,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(float)",
      "begin_line": 689,
      "end_line": 691,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.random()",
      "begin_line": 697,
      "end_line": 699,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double)",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double, double, double[])",
      "begin_line": 732,
      "end_line": 847,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 24)",
        "(line 734,col 9)-(line 734,col 24)",
        "(line 735,col 9)-(line 735,col 19)",
        "(line 741,col 9)-(line 791,col 9)",
        "(line 797,col 9)-(line 797,col 58)",
        "(line 798,col 9)-(line 798,col 59)",
        "(line 799,col 9)-(line 799,col 59)",
        "(line 805,col 9)-(line 805,col 63)",
        "(line 814,col 9)-(line 814,col 39)",
        "(line 815,col 9)-(line 815,col 45)",
        "(line 816,col 9)-(line 816,col 45)",
        "(line 817,col 9)-(line 817,col 30)",
        "(line 818,col 9)-(line 818,col 49)",
        "(line 825,col 9)-(line 825,col 44)",
        "(line 826,col 9)-(line 826,col 90)",
        "(line 832,col 9)-(line 832,col 43)",
        "(line 833,col 9)-(line 833,col 28)",
        "(line 834,col 9)-(line 838,col 9)",
        "(line 840,col 9)-(line 844,col 9)",
        "(line 846,col 9)-(line 846,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double)",
      "begin_line": 853,
      "end_line": 855,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 854,col 7)-(line 854,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double, double[])",
      "begin_line": 862,
      "end_line": 1002,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 865,col 9)",
        "(line 867,col 9)-(line 880,col 9)",
        "(line 882,col 9)-(line 882,col 21)",
        "(line 883,col 9)-(line 883,col 21)",
        "(line 884,col 9)-(line 884,col 23)",
        "(line 885,col 9)-(line 885,col 33)",
        "(line 887,col 9)-(line 890,col 9)",
        "(line 892,col 9)-(line 906,col 9)",
        "(line 910,col 9)-(line 910,col 41)",
        "(line 911,col 9)-(line 911,col 49)",
        "(line 912,col 9)-(line 912,col 48)",
        "(line 913,col 9)-(line 913,col 48)",
        "(line 914,col 9)-(line 914,col 26)",
        "(line 915,col 9)-(line 915,col 26)",
        "(line 917,col 9)-(line 917,col 28)",
        "(line 918,col 9)-(line 918,col 30)",
        "(line 919,col 9)-(line 919,col 31)",
        "(line 920,col 9)-(line 920,col 18)",
        "(line 922,col 9)-(line 922,col 33)",
        "(line 923,col 9)-(line 923,col 32)",
        "(line 924,col 9)-(line 924,col 24)",
        "(line 925,col 9)-(line 925,col 18)",
        "(line 928,col 9)-(line 928,col 31)",
        "(line 930,col 9)-(line 930,col 31)",
        "(line 931,col 9)-(line 931,col 46)",
        "(line 932,col 9)-(line 932,col 18)",
        "(line 934,col 9)-(line 934,col 31)",
        "(line 935,col 9)-(line 935,col 40)",
        "(line 936,col 9)-(line 936,col 18)",
        "(line 938,col 9)-(line 938,col 31)",
        "(line 939,col 9)-(line 939,col 38)",
        "(line 940,col 9)-(line 940,col 18)",
        "(line 944,col 9)-(line 944,col 26)",
        "(line 945,col 9)-(line 945,col 35)",
        "(line 946,col 9)-(line 946,col 18)",
        "(line 948,col 9)-(line 948,col 23)",
        "(line 950,col 9)-(line 950,col 32)",
        "(line 951,col 9)-(line 951,col 18)",
        "(line 953,col 9)-(line 953,col 26)",
        "(line 955,col 9)-(line 955,col 35)",
        "(line 956,col 9)-(line 956,col 18)",
        "(line 958,col 9)-(line 958,col 23)",
        "(line 960,col 9)-(line 960,col 32)",
        "(line 961,col 9)-(line 961,col 18)",
        "(line 963,col 9)-(line 994,col 9)",
        "(line 996,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1001,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowexp(double, double[])",
      "begin_line": 1011,
      "end_line": 1038,
      "comment": "\n     *  For x between 0 and 1, returns exp(x), uses extended precision\n     *  @param x argument of exponential\n     *  @param result placeholder where to place exp(x) split in two terms\n     *  for extra precision (i.e. exp(x) \u003d result[0] ° result[1]\n     *  @return exp(x)\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 42)",
        "(line 1013,col 9)-(line 1013,col 42)",
        "(line 1014,col 9)-(line 1014,col 45)",
        "(line 1015,col 9)-(line 1015,col 42)",
        "(line 1016,col 9)-(line 1016,col 21)",
        "(line 1017,col 9)-(line 1017,col 28)",
        "(line 1019,col 9)-(line 1030,col 9)",
        "(line 1032,col 9)-(line 1035,col 9)",
        "(line 1037,col 9)-(line 1037,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.split(double, double[])",
      "begin_line": 1045,
      "end_line": 1055,
      "comment": " Compute split[0], split[1] such that their sum is equal to d,\n     * and split[0] has its 30 least significant bits as zero.\n     * @param d number to split\n     * @param split placeholder where to place the result\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1054,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.resplit(double[])",
      "begin_line": 1061,
      "end_line": 1074,
      "comment": " Recompute a split.\n     * @param a input/out array containing the split, changed\n     * on output\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 37)",
        "(line 1063,col 9)-(line 1063,col 44)",
        "(line 1065,col 9)-(line 1073,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitMult(double[], double[], double[])",
      "begin_line": 1081,
      "end_line": 1087,
      "comment": " Multiply two numbers in split form.\n     * @param a first term of multiplication\n     * @param b second term of multiplication\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 29)",
        "(line 1083,col 9)-(line 1083,col 57)",
        "(line 1086,col 9)-(line 1086,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitAdd(double[], double[], double[])",
      "begin_line": 1094,
      "end_line": 1099,
      "comment": " Add two numbers in split form.\n     * @param a first term of addition\n     * @param b second term of addition\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1095,col 29)",
        "(line 1096,col 9)-(line 1096,col 29)",
        "(line 1098,col 9)-(line 1098,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitReciprocal(double[], double[])",
      "begin_line": 1119,
      "end_line": 1147,
      "comment": " Compute the reciprocal of in.  Use the following algorithm.\n     *  in \u003d c + d.\n     *  want to find x + y such that x+y \u003d 1/(c+d) and x is much\n     *  larger than y and x has several zero bits on the right.\n     *\n     *  Set b \u003d 1/(2^22),  a \u003d 1 - b.  Thus (a+b) \u003d 1.\n     *  Use following identity to compute (a+b)/(c+d)\n     *\n     *  (a+b)/(c+d)  \u003d   a/c   +    (bc - ad) / (c^2 + cd)\n     *  set x \u003d a/c  and y \u003d (bc - ad) / (c^2 + cd)\n     *  This will be close to the right answer, but there will be\n     *  some rounding in the calculation of X.  So by carefully\n     *  computing 1 - (c+d)(x+y) we can compute an error and\n     *  add that back in.   This is done carefully so that terms\n     *  of similar size are subtracted first.\n     *  @param in initial number, in split form\n     *  @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 39)",
        "(line 1121,col 9)-(line 1121,col 33)",
        "(line 1123,col 9)-(line 1126,col 9)",
        "(line 1128,col 9)-(line 1128,col 30)",
        "(line 1129,col 9)-(line 1129,col 68)",
        "(line 1131,col 9)-(line 1133,col 9)",
        "(line 1136,col 9)-(line 1136,col 24)",
        "(line 1138,col 9)-(line 1146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.quadMult(double[], double[], double[])",
      "begin_line": 1154,
      "end_line": 1201,
      "comment": " Compute (a[0] + a[1]) * (b[0] + b[1]) in extended precision.\n     * @param a first term of the multiplication\n     * @param b second term of the multiplication\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1155,col 42)",
        "(line 1156,col 9)-(line 1156,col 42)",
        "(line 1157,col 9)-(line 1157,col 42)",
        "(line 1160,col 9)-(line 1160,col 24)",
        "(line 1161,col 9)-(line 1161,col 24)",
        "(line 1162,col 9)-(line 1162,col 30)",
        "(line 1164,col 9)-(line 1164,col 26)",
        "(line 1165,col 9)-(line 1165,col 26)",
        "(line 1168,col 9)-(line 1168,col 24)",
        "(line 1169,col 9)-(line 1169,col 30)",
        "(line 1171,col 9)-(line 1171,col 39)",
        "(line 1172,col 9)-(line 1172,col 58)",
        "(line 1173,col 9)-(line 1173,col 24)",
        "(line 1174,col 9)-(line 1174,col 32)",
        "(line 1175,col 9)-(line 1175,col 58)",
        "(line 1176,col 9)-(line 1176,col 24)",
        "(line 1179,col 9)-(line 1179,col 24)",
        "(line 1180,col 9)-(line 1180,col 24)",
        "(line 1181,col 9)-(line 1181,col 30)",
        "(line 1183,col 9)-(line 1183,col 32)",
        "(line 1184,col 9)-(line 1184,col 58)",
        "(line 1185,col 9)-(line 1185,col 24)",
        "(line 1186,col 9)-(line 1186,col 32)",
        "(line 1187,col 9)-(line 1187,col 58)",
        "(line 1188,col 9)-(line 1188,col 24)",
        "(line 1191,col 9)-(line 1191,col 24)",
        "(line 1192,col 9)-(line 1192,col 24)",
        "(line 1193,col 9)-(line 1193,col 30)",
        "(line 1195,col 9)-(line 1195,col 32)",
        "(line 1196,col 9)-(line 1196,col 58)",
        "(line 1197,col 9)-(line 1197,col 24)",
        "(line 1198,col 9)-(line 1198,col 32)",
        "(line 1199,col 9)-(line 1199,col 58)",
        "(line 1200,col 9)-(line 1200,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expint(int, double[])",
      "begin_line": 1208,
      "end_line": 1246,
      "comment": " Compute exp(p) for a integer p in extended precision.\n     * @param p integer whose exponential is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return exp(p) in standard precision (equal to result[0] + result[1])\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 42)",
        "(line 1211,col 9)-(line 1211,col 42)",
        "(line 1212,col 9)-(line 1212,col 42)",
        "(line 1221,col 9)-(line 1221,col 34)",
        "(line 1222,col 9)-(line 1222,col 39)",
        "(line 1224,col 9)-(line 1224,col 23)",
        "(line 1226,col 9)-(line 1236,col 9)",
        "(line 1238,col 9)-(line 1243,col 9)",
        "(line 1245,col 9)-(line 1245,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double)",
      "begin_line": 1255,
      "end_line": 1257,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double[])",
      "begin_line": 1265,
      "end_line": 1485,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1268,col 9)",
        "(line 1269,col 9)-(line 1269,col 47)",
        "(line 1272,col 9)-(line 1280,col 9)",
        "(line 1283,col 9)-(line 1289,col 9)",
        "(line 1292,col 9)-(line 1292,col 41)",
        "(line 1294,col 9)-(line 1311,col 9)",
        "(line 1314,col 9)-(line 1359,col 9)",
        "(line 1362,col 9)-(line 1362,col 74)",
        "(line 1373,col 9)-(line 1373,col 97)",
        "(line 1375,col 9)-(line 1375,col 26)",
        "(line 1376,col 9)-(line 1376,col 26)",
        "(line 1378,col 9)-(line 1436,col 9)",
        "(line 1452,col 9)-(line 1452,col 30)",
        "(line 1453,col 9)-(line 1453,col 23)",
        "(line 1454,col 9)-(line 1454,col 28)",
        "(line 1455,col 9)-(line 1455,col 33)",
        "(line 1456,col 9)-(line 1456,col 14)",
        "(line 1457,col 9)-(line 1457,col 18)",
        "(line 1459,col 9)-(line 1459,col 21)",
        "(line 1460,col 9)-(line 1460,col 28)",
        "(line 1461,col 9)-(line 1461,col 14)",
        "(line 1462,col 9)-(line 1462,col 18)",
        "(line 1464,col 9)-(line 1464,col 27)",
        "(line 1465,col 9)-(line 1465,col 34)",
        "(line 1466,col 9)-(line 1466,col 14)",
        "(line 1467,col 9)-(line 1467,col 18)",
        "(line 1469,col 9)-(line 1469,col 23)",
        "(line 1470,col 9)-(line 1470,col 30)",
        "(line 1471,col 9)-(line 1471,col 14)",
        "(line 1472,col 9)-(line 1472,col 18)",
        "(line 1474,col 9)-(line 1474,col 21)",
        "(line 1475,col 9)-(line 1475,col 28)",
        "(line 1476,col 9)-(line 1476,col 14)",
        "(line 1477,col 9)-(line 1477,col 18)",
        "(line 1479,col 9)-(line 1482,col 9)",
        "(line 1484,col 9)-(line 1484,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log1p(double)",
      "begin_line": 1491,
      "end_line": 1528,
      "comment": " Compute log(1 + x).\n     * @param x a number\n     * @return log(1 + x)\n     ",
      "child_ranges": [
        "(line 1493,col 9)-(line 1495,col 9)",
        "(line 1497,col 9)-(line 1499,col 9)",
        "(line 1501,col 9)-(line 1520,col 9)",
        "(line 1523,col 9)-(line 1523,col 47)",
        "(line 1524,col 9)-(line 1524,col 24)",
        "(line 1525,col 9)-(line 1525,col 18)",
        "(line 1527,col 9)-(line 1527,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log10(double)",
      "begin_line": 1534,
      "end_line": 1550,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 46)",
        "(line 1537,col 9)-(line 1537,col 44)",
        "(line 1538,col 9)-(line 1540,col 9)",
        "(line 1542,col 9)-(line 1542,col 52)",
        "(line 1543,col 9)-(line 1543,col 49)",
        "(line 1544,col 9)-(line 1544,col 55)",
        "(line 1546,col 9)-(line 1546,col 49)",
        "(line 1547,col 9)-(line 1547,col 52)",
        "(line 1549,col 9)-(line 1549,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.pow(double, double)",
      "begin_line": 1559,
      "end_line": 1721,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1560,col 9)-(line 1560,col 43)",
        "(line 1562,col 9)-(line 1564,col 9)",
        "(line 1566,col 9)-(line 1568,col 9)",
        "(line 1571,col 9)-(line 1598,col 9)",
        "(line 1600,col 9)-(line 1609,col 9)",
        "(line 1611,col 9)-(line 1621,col 9)",
        "(line 1623,col 9)-(line 1645,col 9)",
        "(line 1647,col 9)-(line 1658,col 9)",
        "(line 1661,col 9)-(line 1673,col 9)",
        "(line 1676,col 9)-(line 1676,col 18)",
        "(line 1677,col 9)-(line 1677,col 18)",
        "(line 1678,col 9)-(line 1687,col 9)",
        "(line 1690,col 9)-(line 1690,col 41)",
        "(line 1691,col 9)-(line 1693,col 9)",
        "(line 1695,col 9)-(line 1695,col 28)",
        "(line 1696,col 9)-(line 1696,col 28)",
        "(line 1699,col 9)-(line 1699,col 41)",
        "(line 1700,col 9)-(line 1700,col 40)",
        "(line 1701,col 9)-(line 1701,col 26)",
        "(line 1702,col 9)-(line 1702,col 19)",
        "(line 1705,col 9)-(line 1705,col 35)",
        "(line 1706,col 9)-(line 1706,col 57)",
        "(line 1708,col 9)-(line 1708,col 20)",
        "(line 1709,col 9)-(line 1709,col 31)",
        "(line 1711,col 9)-(line 1711,col 31)",
        "(line 1712,col 9)-(line 1712,col 35)",
        "(line 1713,col 9)-(line 1713,col 34)",
        "(line 1714,col 9)-(line 1714,col 26)",
        "(line 1715,col 9)-(line 1715,col 26)",
        "(line 1716,col 9)-(line 1716,col 20)",
        "(line 1718,col 9)-(line 1718,col 48)",
        "(line 1720,col 9)-(line 1720,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowLog(double)",
      "begin_line": 1742,
      "end_line": 1784,
      "comment": " xi in the range of [1, 2].\n     *                                3        5        7\n     *      x+1           /          x        x        x          \\\n     *  ln ----- \u003d   2 *  |  x  +   ----  +  ----  +  ---- + ...  |\n     *      1-x           \\          3        5        7          /\n     *\n     * So, compute a Remez approximation of the following function\n     *\n     *  ln ((sqrt(x)+1)/(1-sqrt(x)))  /  x\n     *\n     * This will be an even function with only positive coefficents.\n     * x is in the range [0 - 1/3].\n     *\n     * Transform xi for input to the above function by setting\n     * x \u003d (xi-1)/(xi+1).   Input to the polynomial is x^2, then\n     * the result is multiplied by x.\n     * @param xi number from which log is requested\n     * @return log(xi)\n     ",
      "child_ranges": [
        "(line 1743,col 9)-(line 1743,col 35)",
        "(line 1744,col 9)-(line 1744,col 36)",
        "(line 1745,col 9)-(line 1745,col 35)",
        "(line 1746,col 9)-(line 1746,col 35)",
        "(line 1748,col 9)-(line 1748,col 21)",
        "(line 1751,col 9)-(line 1751,col 20)",
        "(line 1752,col 9)-(line 1752,col 19)",
        "(line 1753,col 9)-(line 1753,col 30)",
        "(line 1754,col 9)-(line 1754,col 20)",
        "(line 1755,col 9)-(line 1755,col 19)",
        "(line 1756,col 9)-(line 1756,col 27)",
        "(line 1757,col 9)-(line 1757,col 20)",
        "(line 1758,col 9)-(line 1758,col 20)",
        "(line 1761,col 9)-(line 1761,col 28)",
        "(line 1767,col 9)-(line 1767,col 56)",
        "(line 1768,col 9)-(line 1768,col 56)",
        "(line 1770,col 9)-(line 1777,col 9)",
        "(line 1779,col 9)-(line 1779,col 27)",
        "(line 1780,col 9)-(line 1780,col 20)",
        "(line 1781,col 9)-(line 1781,col 20)",
        "(line 1783,col 9)-(line 1783,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowSin(double, double[])",
      "begin_line": 1792,
      "end_line": 1826,
      "comment": "\n     * For x between 0 and pi/4 compute sine.\n     * @param x number from which sine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 1793,col 9)-(line 1793,col 42)",
        "(line 1794,col 9)-(line 1794,col 42)",
        "(line 1795,col 9)-(line 1795,col 45)",
        "(line 1796,col 9)-(line 1796,col 42)",
        "(line 1797,col 9)-(line 1797,col 21)",
        "(line 1798,col 9)-(line 1798,col 28)",
        "(line 1800,col 9)-(line 1818,col 9)",
        "(line 1820,col 9)-(line 1823,col 9)",
        "(line 1825,col 9)-(line 1825,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowCos(double, double[])",
      "begin_line": 1834,
      "end_line": 1869,
      "comment": "\n     *  For x between 0 and pi/4 compute cosine\n     * @param x number from which cosine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 1836,col 9)-(line 1836,col 42)",
        "(line 1837,col 9)-(line 1837,col 42)",
        "(line 1838,col 9)-(line 1838,col 45)",
        "(line 1839,col 9)-(line 1839,col 42)",
        "(line 1840,col 9)-(line 1840,col 21)",
        "(line 1841,col 9)-(line 1841,col 28)",
        "(line 1843,col 9)-(line 1861,col 9)",
        "(line 1863,col 9)-(line 1866,col 9)",
        "(line 1868,col 9)-(line 1868,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.buildSinCosTables()",
      "begin_line": 1873,
      "end_line": 1965,
      "comment": " Build the sine and cosine tables.\n     ",
      "child_ranges": [
        "(line 1874,col 9)-(line 1874,col 46)",
        "(line 1877,col 9)-(line 1887,col 9)",
        "(line 1890,col 9)-(line 1943,col 9)",
        "(line 1946,col 9)-(line 1963,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polySine(double)",
      "begin_line": 1973,
      "end_line": 1986,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1975,col 9)-(line 1975,col 24)",
        "(line 1977,col 9)-(line 1977,col 41)",
        "(line 1978,col 9)-(line 1978,col 44)",
        "(line 1979,col 9)-(line 1979,col 42)",
        "(line 1980,col 9)-(line 1980,col 42)",
        "(line 1983,col 9)-(line 1983,col 23)",
        "(line 1985,col 9)-(line 1985,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polyCosine(double)",
      "begin_line": 1994,
      "end_line": 2004,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1995,col 9)-(line 1995,col 24)",
        "(line 1997,col 9)-(line 1997,col 40)",
        "(line 1998,col 9)-(line 1998,col 44)",
        "(line 1999,col 9)-(line 1999,col 42)",
        "(line 2000,col 9)-(line 2000,col 42)",
        "(line 2001,col 9)-(line 2001,col 16)",
        "(line 2003,col 9)-(line 2003,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinQ(double, double)",
      "begin_line": 2013,
      "end_line": 2128,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 2014,col 9)-(line 2014,col 43)",
        "(line 2015,col 9)-(line 2015,col 49)",
        "(line 2018,col 9)-(line 2018,col 47)",
        "(line 2019,col 9)-(line 2019,col 47)",
        "(line 2020,col 9)-(line 2020,col 49)",
        "(line 2021,col 9)-(line 2021,col 49)",
        "(line 2024,col 9)-(line 2024,col 33)",
        "(line 2025,col 9)-(line 2025,col 43)",
        "(line 2026,col 9)-(line 2026,col 35)",
        "(line 2027,col 9)-(line 2027,col 51)",
        "(line 2030,col 9)-(line 2030,col 51)",
        "(line 2031,col 9)-(line 2031,col 47)",
        "(line 2032,col 9)-(line 2032,col 36)",
        "(line 2033,col 9)-(line 2033,col 24)",
        "(line 2036,col 9)-(line 2036,col 22)",
        "(line 2059,col 9)-(line 2059,col 21)",
        "(line 2060,col 9)-(line 2060,col 21)",
        "(line 2062,col 9)-(line 2062,col 25)",
        "(line 2063,col 9)-(line 2063,col 25)",
        "(line 2064,col 9)-(line 2064,col 32)",
        "(line 2065,col 9)-(line 2065,col 14)",
        "(line 2066,col 9)-(line 2066,col 18)",
        "(line 2068,col 9)-(line 2068,col 28)",
        "(line 2069,col 9)-(line 2069,col 18)",
        "(line 2070,col 9)-(line 2070,col 25)",
        "(line 2071,col 9)-(line 2071,col 14)",
        "(line 2072,col 9)-(line 2072,col 18)",
        "(line 2074,col 9)-(line 2074,col 50)",
        "(line 2089,col 9)-(line 2089,col 76)",
        "(line 2116,col 9)-(line 2123,col 9)",
        "(line 2125,col 9)-(line 2125,col 23)",
        "(line 2127,col 9)-(line 2127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosQ(double, double)",
      "begin_line": 2137,
      "end_line": 2146,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 2138,col 9)-(line 2138,col 47)",
        "(line 2139,col 9)-(line 2139,col 50)",
        "(line 2141,col 9)-(line 2141,col 35)",
        "(line 2142,col 9)-(line 2142,col 36)",
        "(line 2143,col 9)-(line 2143,col 23)",
        "(line 2145,col 9)-(line 2145,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 2156,
      "end_line": 2291,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 2158,col 9)-(line 2158,col 43)",
        "(line 2159,col 9)-(line 2159,col 49)",
        "(line 2162,col 9)-(line 2162,col 47)",
        "(line 2163,col 9)-(line 2163,col 47)",
        "(line 2164,col 9)-(line 2164,col 49)",
        "(line 2165,col 9)-(line 2165,col 49)",
        "(line 2168,col 9)-(line 2168,col 33)",
        "(line 2169,col 9)-(line 2169,col 43)",
        "(line 2170,col 9)-(line 2170,col 35)",
        "(line 2171,col 9)-(line 2171,col 51)",
        "(line 2174,col 9)-(line 2174,col 45)",
        "(line 2175,col 9)-(line 2175,col 47)",
        "(line 2176,col 9)-(line 2176,col 36)",
        "(line 2177,col 9)-(line 2177,col 24)",
        "(line 2202,col 9)-(line 2202,col 21)",
        "(line 2203,col 9)-(line 2203,col 21)",
        "(line 2206,col 9)-(line 2206,col 25)",
        "(line 2207,col 9)-(line 2207,col 25)",
        "(line 2208,col 9)-(line 2208,col 32)",
        "(line 2209,col 9)-(line 2209,col 14)",
        "(line 2210,col 9)-(line 2210,col 18)",
        "(line 2212,col 9)-(line 2212,col 26)",
        "(line 2213,col 9)-(line 2213,col 18)",
        "(line 2214,col 9)-(line 2214,col 25)",
        "(line 2215,col 9)-(line 2215,col 14)",
        "(line 2216,col 9)-(line 2216,col 18)",
        "(line 2218,col 9)-(line 2218,col 46)",
        "(line 2219,col 9)-(line 2219,col 70)",
        "(line 2221,col 9)-(line 2221,col 28)",
        "(line 2222,col 9)-(line 2222,col 38)",
        "(line 2226,col 9)-(line 2226,col 28)",
        "(line 2228,col 9)-(line 2228,col 26)",
        "(line 2229,col 9)-(line 2229,col 18)",
        "(line 2230,col 9)-(line 2230,col 25)",
        "(line 2231,col 9)-(line 2231,col 14)",
        "(line 2232,col 9)-(line 2232,col 18)",
        "(line 2234,col 9)-(line 2234,col 27)",
        "(line 2235,col 9)-(line 2235,col 18)",
        "(line 2236,col 9)-(line 2236,col 25)",
        "(line 2237,col 9)-(line 2237,col 14)",
        "(line 2238,col 9)-(line 2238,col 18)",
        "(line 2240,col 9)-(line 2240,col 62)",
        "(line 2241,col 9)-(line 2241,col 64)",
        "(line 2243,col 9)-(line 2243,col 28)",
        "(line 2244,col 9)-(line 2244,col 38)",
        "(line 2246,col 9)-(line 2250,col 9)",
        "(line 2263,col 9)-(line 2263,col 31)",
        "(line 2266,col 9)-(line 2266,col 34)",
        "(line 2267,col 9)-(line 2267,col 42)",
        "(line 2268,col 9)-(line 2268,col 34)",
        "(line 2270,col 9)-(line 2270,col 35)",
        "(line 2271,col 9)-(line 2271,col 44)",
        "(line 2272,col 9)-(line 2272,col 37)",
        "(line 2275,col 9)-(line 2275,col 85)",
        "(line 2276,col 9)-(line 2276,col 25)",
        "(line 2277,col 9)-(line 2277,col 42)",
        "(line 2279,col 9)-(line 2288,col 9)",
        "(line 2290,col 9)-(line 2290,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 2304,
      "end_line": 2514,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 2307,col 9)-(line 2307,col 49)",
        "(line 2308,col 9)-(line 2308,col 61)",
        "(line 2311,col 9)-(line 2311,col 38)",
        "(line 2312,col 9)-(line 2312,col 38)",
        "(line 2315,col 9)-(line 2315,col 19)",
        "(line 2316,col 9)-(line 2316,col 22)",
        "(line 2319,col 9)-(line 2319,col 19)",
        "(line 2320,col 9)-(line 2320,col 19)",
        "(line 2321,col 9)-(line 2321,col 19)",
        "(line 2322,col 9)-(line 2322,col 32)",
        "(line 2323,col 9)-(line 2323,col 42)",
        "(line 2325,col 9)-(line 2334,col 9)",
        "(line 2337,col 9)-(line 2337,col 31)",
        "(line 2338,col 9)-(line 2338,col 38)",
        "(line 2340,col 9)-(line 2340,col 30)",
        "(line 2341,col 9)-(line 2341,col 37)",
        "(line 2343,col 9)-(line 2343,col 24)",
        "(line 2344,col 9)-(line 2344,col 24)",
        "(line 2345,col 9)-(line 2345,col 24)",
        "(line 2346,col 9)-(line 2346,col 24)",
        "(line 2348,col 9)-(line 2348,col 37)",
        "(line 2349,col 9)-(line 2349,col 38)",
        "(line 2351,col 9)-(line 2351,col 55)",
        "(line 2352,col 9)-(line 2352,col 48)",
        "(line 2353,col 9)-(line 2353,col 60)",
        "(line 2356,col 9)-(line 2359,col 9)",
        "(line 2361,col 9)-(line 2361,col 50)",
        "(line 2362,col 9)-(line 2362,col 40)",
        "(line 2364,col 9)-(line 2364,col 35)",
        "(line 2365,col 9)-(line 2365,col 36)",
        "(line 2367,col 9)-(line 2367,col 52)",
        "(line 2370,col 9)-(line 2373,col 9)",
        "(line 2376,col 9)-(line 2376,col 25)",
        "(line 2377,col 9)-(line 2377,col 32)",
        "(line 2378,col 9)-(line 2378,col 19)",
        "(line 2379,col 9)-(line 2379,col 19)",
        "(line 2380,col 9)-(line 2380,col 19)",
        "(line 2383,col 9)-(line 2383,col 37)",
        "(line 2385,col 9)-(line 2385,col 50)",
        "(line 2386,col 9)-(line 2386,col 48)",
        "(line 2387,col 9)-(line 2387,col 20)",
        "(line 2388,col 9)-(line 2388,col 52)",
        "(line 2390,col 9)-(line 2393,col 9)",
        "(line 2396,col 9)-(line 2396,col 25)",
        "(line 2397,col 9)-(line 2397,col 32)",
        "(line 2399,col 9)-(line 2399,col 19)",
        "(line 2400,col 9)-(line 2400,col 19)",
        "(line 2401,col 9)-(line 2401,col 19)",
        "(line 2403,col 9)-(line 2403,col 40)",
        "(line 2415,col 9)-(line 2415,col 42)",
        "(line 2418,col 9)-(line 2418,col 20)",
        "(line 2419,col 9)-(line 2419,col 30)",
        "(line 2420,col 9)-(line 2420,col 20)",
        "(line 2423,col 9)-(line 2423,col 25)",
        "(line 2424,col 9)-(line 2424,col 32)",
        "(line 2426,col 9)-(line 2426,col 34)",
        "(line 2427,col 9)-(line 2427,col 41)",
        "(line 2429,col 9)-(line 2429,col 19)",
        "(line 2430,col 9)-(line 2430,col 19)",
        "(line 2431,col 9)-(line 2431,col 19)",
        "(line 2432,col 9)-(line 2432,col 19)",
        "(line 2434,col 9)-(line 2434,col 38)",
        "(line 2435,col 9)-(line 2435,col 39)",
        "(line 2437,col 9)-(line 2437,col 47)",
        "(line 2438,col 9)-(line 2438,col 40)",
        "(line 2439,col 9)-(line 2439,col 53)",
        "(line 2442,col 9)-(line 2445,col 9)",
        "(line 2447,col 9)-(line 2447,col 51)",
        "(line 2448,col 9)-(line 2448,col 40)",
        "(line 2450,col 9)-(line 2450,col 37)",
        "(line 2451,col 9)-(line 2451,col 38)",
        "(line 2453,col 9)-(line 2453,col 53)",
        "(line 2456,col 9)-(line 2459,col 9)",
        "(line 2462,col 9)-(line 2462,col 34)",
        "(line 2463,col 9)-(line 2463,col 41)",
        "(line 2464,col 9)-(line 2464,col 19)",
        "(line 2465,col 9)-(line 2465,col 19)",
        "(line 2466,col 9)-(line 2466,col 19)",
        "(line 2469,col 9)-(line 2469,col 37)",
        "(line 2471,col 9)-(line 2471,col 51)",
        "(line 2472,col 9)-(line 2472,col 48)",
        "(line 2473,col 9)-(line 2473,col 21)",
        "(line 2474,col 9)-(line 2474,col 53)",
        "(line 2476,col 9)-(line 2479,col 9)",
        "(line 2482,col 9)-(line 2482,col 25)",
        "(line 2483,col 9)-(line 2483,col 32)",
        "(line 2484,col 9)-(line 2484,col 34)",
        "(line 2485,col 9)-(line 2485,col 41)",
        "(line 2486,col 9)-(line 2486,col 19)",
        "(line 2487,col 9)-(line 2487,col 19)",
        "(line 2488,col 9)-(line 2488,col 19)",
        "(line 2491,col 9)-(line 2491,col 37)",
        "(line 2493,col 9)-(line 2493,col 51)",
        "(line 2494,col 9)-(line 2494,col 48)",
        "(line 2495,col 9)-(line 2495,col 21)",
        "(line 2496,col 9)-(line 2496,col 53)",
        "(line 2498,col 9)-(line 2501,col 9)",
        "(line 2504,col 9)-(line 2504,col 53)",
        "(line 2505,col 9)-(line 2505,col 98)",
        "(line 2507,col 9)-(line 2507,col 34)",
        "(line 2508,col 9)-(line 2508,col 44)",
        "(line 2511,col 9)-(line 2511,col 28)",
        "(line 2512,col 9)-(line 2512,col 31)",
        "(line 2513,col 9)-(line 2513,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sin(double)",
      "begin_line": 2521,
      "end_line": 2612,
      "comment": "\n     *  Sine function.\n     *  @param x a number\n     *  @return sin(x)\n     ",
      "child_ranges": [
        "(line 2522,col 9)-(line 2522,col 33)",
        "(line 2523,col 9)-(line 2523,col 25)",
        "(line 2524,col 9)-(line 2524,col 18)",
        "(line 2525,col 9)-(line 2525,col 24)",
        "(line 2528,col 9)-(line 2528,col 15)",
        "(line 2529,col 9)-(line 2532,col 9)",
        "(line 2535,col 9)-(line 2541,col 9)",
        "(line 2543,col 9)-(line 2545,col 9)",
        "(line 2548,col 9)-(line 2594,col 9)",
        "(line 2596,col 9)-(line 2598,col 9)",
        "(line 2600,col 9)-(line 2611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cos(double)",
      "begin_line": 2619,
      "end_line": 2697,
      "comment": "\n     *  Cosine function\n     *  @param x a number\n     *  @return cos(x)\n     ",
      "child_ranges": [
        "(line 2620,col 9)-(line 2620,col 25)",
        "(line 2623,col 9)-(line 2623,col 22)",
        "(line 2624,col 9)-(line 2626,col 9)",
        "(line 2628,col 9)-(line 2630,col 9)",
        "(line 2633,col 9)-(line 2633,col 22)",
        "(line 2634,col 9)-(line 2680,col 9)",
        "(line 2685,col 9)-(line 2696,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tan(double)",
      "begin_line": 2704,
      "end_line": 2805,
      "comment": "\n     *   Tangent function\n     *  @param x a number\n     *  @return tan(x)\n     ",
      "child_ranges": [
        "(line 2705,col 9)-(line 2705,col 33)",
        "(line 2706,col 9)-(line 2706,col 25)",
        "(line 2709,col 9)-(line 2709,col 22)",
        "(line 2710,col 9)-(line 2713,col 9)",
        "(line 2716,col 9)-(line 2722,col 9)",
        "(line 2724,col 9)-(line 2726,col 9)",
        "(line 2729,col 9)-(line 2729,col 22)",
        "(line 2730,col 9)-(line 2776,col 9)",
        "(line 2778,col 9)-(line 2791,col 9)",
        "(line 2793,col 9)-(line 2793,col 22)",
        "(line 2794,col 9)-(line 2798,col 9)",
        "(line 2800,col 9)-(line 2802,col 9)",
        "(line 2804,col 9)-(line 2804,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double)",
      "begin_line": 2812,
      "end_line": 2814,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2813,col 9)-(line 2813,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2822,
      "end_line": 2964,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2823,col 9)-(line 2823,col 31)",
        "(line 2824,col 9)-(line 2824,col 16)",
        "(line 2826,col 9)-(line 2828,col 9)",
        "(line 2830,col 9)-(line 2835,col 9)",
        "(line 2837,col 9)-(line 2839,col 9)",
        "(line 2842,col 9)-(line 2847,col 9)",
        "(line 2848,col 9)-(line 2848,col 48)",
        "(line 2849,col 9)-(line 2849,col 58)",
        "(line 2850,col 9)-(line 2850,col 42)",
        "(line 2852,col 9)-(line 2852,col 34)",
        "(line 2853,col 9)-(line 2853,col 37)",
        "(line 2854,col 9)-(line 2854,col 20)",
        "(line 2857,col 9)-(line 2857,col 33)",
        "(line 2858,col 9)-(line 2858,col 37)",
        "(line 2859,col 9)-(line 2859,col 33)",
        "(line 2860,col 9)-(line 2860,col 16)",
        "(line 2861,col 9)-(line 2861,col 17)",
        "(line 2864,col 9)-(line 2896,col 9)",
        "(line 2899,col 9)-(line 2899,col 18)",
        "(line 2900,col 9)-(line 2900,col 18)",
        "(line 2903,col 9)-(line 2903,col 33)",
        "(line 2914,col 9)-(line 2914,col 33)",
        "(line 2915,col 9)-(line 2915,col 47)",
        "(line 2916,col 9)-(line 2916,col 46)",
        "(line 2917,col 9)-(line 2917,col 46)",
        "(line 2918,col 9)-(line 2918,col 46)",
        "(line 2919,col 9)-(line 2919,col 47)",
        "(line 2920,col 9)-(line 2920,col 31)",
        "(line 2923,col 9)-(line 2923,col 18)",
        "(line 2925,col 9)-(line 2925,col 23)",
        "(line 2926,col 9)-(line 2926,col 31)",
        "(line 2927,col 9)-(line 2927,col 18)",
        "(line 2930,col 9)-(line 2930,col 41)",
        "(line 2932,col 9)-(line 2932,col 22)",
        "(line 2933,col 9)-(line 2933,col 23)",
        "(line 2936,col 9)-(line 2936,col 38)",
        "(line 2937,col 9)-(line 2937,col 46)",
        "(line 2938,col 9)-(line 2938,col 23)",
        "(line 2939,col 9)-(line 2939,col 32)",
        "(line 2940,col 9)-(line 2940,col 18)",
        "(line 2942,col 9)-(line 2942,col 25)",
        "(line 2943,col 9)-(line 2943,col 38)",
        "(line 2945,col 9)-(line 2956,col 9)",
        "(line 2959,col 9)-(line 2961,col 9)",
        "(line 2963,col 9)-(line 2963,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan2(double, double)",
      "begin_line": 2972,
      "end_line": 3087,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2973,col 9)-(line 2975,col 9)",
        "(line 2977,col 9)-(line 2999,col 9)",
        "(line 3003,col 9)-(line 3013,col 9)",
        "(line 3015,col 9)-(line 3025,col 9)",
        "(line 3027,col 9)-(line 3035,col 9)",
        "(line 3037,col 9)-(line 3046,col 9)",
        "(line 3050,col 9)-(line 3058,col 9)",
        "(line 3061,col 9)-(line 3061,col 29)",
        "(line 3062,col 9)-(line 3064,col 9)",
        "(line 3066,col 9)-(line 3066,col 38)",
        "(line 3067,col 9)-(line 3067,col 27)",
        "(line 3070,col 9)-(line 3070,col 44)",
        "(line 3071,col 9)-(line 3071,col 33)",
        "(line 3073,col 9)-(line 3073,col 62)",
        "(line 3075,col 9)-(line 3075,col 30)",
        "(line 3076,col 9)-(line 3076,col 31)",
        "(line 3077,col 9)-(line 3077,col 18)",
        "(line 3079,col 9)-(line 3081,col 9)",
        "(line 3084,col 9)-(line 3084,col 44)",
        "(line 3086,col 9)-(line 3086,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asin(double)",
      "begin_line": 3093,
      "end_line": 3163,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 3094,col 7)-(line 3096,col 7)",
        "(line 3098,col 7)-(line 3100,col 7)",
        "(line 3102,col 7)-(line 3104,col 7)",
        "(line 3106,col 7)-(line 3108,col 7)",
        "(line 3110,col 7)-(line 3112,col 7)",
        "(line 3117,col 7)-(line 3117,col 37)",
        "(line 3118,col 7)-(line 3118,col 40)",
        "(line 3119,col 7)-(line 3119,col 31)",
        "(line 3122,col 7)-(line 3122,col 24)",
        "(line 3123,col 7)-(line 3123,col 36)",
        "(line 3126,col 7)-(line 3126,col 15)",
        "(line 3127,col 7)-(line 3127,col 15)",
        "(line 3129,col 7)-(line 3129,col 27)",
        "(line 3130,col 7)-(line 3130,col 35)",
        "(line 3132,col 7)-(line 3132,col 21)",
        "(line 3133,col 7)-(line 3133,col 30)",
        "(line 3134,col 7)-(line 3134,col 16)",
        "(line 3137,col 7)-(line 3137,col 15)",
        "(line 3138,col 7)-(line 3138,col 19)",
        "(line 3139,col 7)-(line 3139,col 30)",
        "(line 3140,col 7)-(line 3140,col 27)",
        "(line 3141,col 7)-(line 3141,col 18)",
        "(line 3144,col 7)-(line 3144,col 53)",
        "(line 3147,col 7)-(line 3147,col 31)",
        "(line 3150,col 7)-(line 3150,col 21)",
        "(line 3151,col 7)-(line 3151,col 30)",
        "(line 3152,col 7)-(line 3152,col 34)",
        "(line 3153,col 7)-(line 3153,col 25)",
        "(line 3155,col 7)-(line 3155,col 52)",
        "(line 3156,col 7)-(line 3156,col 28)",
        "(line 3158,col 7)-(line 3158,col 21)",
        "(line 3159,col 7)-(line 3159,col 29)",
        "(line 3160,col 7)-(line 3160,col 16)",
        "(line 3162,col 7)-(line 3162,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acos(double)",
      "begin_line": 3169,
      "end_line": 3245,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 3170,col 7)-(line 3172,col 7)",
        "(line 3174,col 7)-(line 3176,col 7)",
        "(line 3178,col 7)-(line 3180,col 7)",
        "(line 3182,col 7)-(line 3184,col 7)",
        "(line 3186,col 7)-(line 3188,col 7)",
        "(line 3193,col 7)-(line 3193,col 37)",
        "(line 3194,col 7)-(line 3194,col 40)",
        "(line 3195,col 7)-(line 3195,col 31)",
        "(line 3198,col 7)-(line 3198,col 24)",
        "(line 3199,col 7)-(line 3199,col 36)",
        "(line 3202,col 7)-(line 3202,col 15)",
        "(line 3203,col 7)-(line 3203,col 15)",
        "(line 3205,col 7)-(line 3205,col 27)",
        "(line 3206,col 7)-(line 3206,col 35)",
        "(line 3208,col 7)-(line 3208,col 21)",
        "(line 3209,col 7)-(line 3209,col 30)",
        "(line 3210,col 7)-(line 3210,col 16)",
        "(line 3213,col 7)-(line 3213,col 26)",
        "(line 3214,col 7)-(line 3214,col 30)",
        "(line 3215,col 7)-(line 3215,col 27)",
        "(line 3216,col 7)-(line 3216,col 18)",
        "(line 3219,col 7)-(line 3219,col 53)",
        "(line 3222,col 7)-(line 3222,col 25)",
        "(line 3223,col 7)-(line 3223,col 16)",
        "(line 3224,col 7)-(line 3224,col 26)",
        "(line 3227,col 7)-(line 3227,col 21)",
        "(line 3230,col 7)-(line 3232,col 7)",
        "(line 3234,col 7)-(line 3234,col 36)",
        "(line 3235,col 7)-(line 3235,col 25)",
        "(line 3237,col 7)-(line 3237,col 52)",
        "(line 3238,col 7)-(line 3238,col 19)",
        "(line 3240,col 7)-(line 3240,col 21)",
        "(line 3241,col 7)-(line 3241,col 29)",
        "(line 3242,col 7)-(line 3242,col 16)",
        "(line 3244,col 7)-(line 3244,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cbrt(double)",
      "begin_line": 3251,
      "end_line": 3329,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 3253,col 7)-(line 3253,col 47)",
        "(line 3254,col 7)-(line 3254,col 59)",
        "(line 3255,col 7)-(line 3255,col 32)",
        "(line 3257,col 7)-(line 3267,col 7)",
        "(line 3269,col 7)-(line 3272,col 7)",
        "(line 3275,col 7)-(line 3275,col 30)",
        "(line 3278,col 7)-(line 3279,col 81)",
        "(line 3282,col 7)-(line 3282,col 104)",
        "(line 3285,col 7)-(line 3285,col 41)",
        "(line 3286,col 7)-(line 3286,col 44)",
        "(line 3287,col 7)-(line 3287,col 45)",
        "(line 3288,col 7)-(line 3288,col 44)",
        "(line 3289,col 7)-(line 3289,col 44)",
        "(line 3291,col 7)-(line 3291,col 39)",
        "(line 3296,col 7)-(line 3296,col 39)",
        "(line 3297,col 7)-(line 3297,col 46)",
        "(line 3298,col 7)-(line 3298,col 46)",
        "(line 3301,col 7)-(line 3301,col 39)",
        "(line 3302,col 7)-(line 3302,col 36)",
        "(line 3303,col 7)-(line 3303,col 27)",
        "(line 3305,col 7)-(line 3305,col 26)",
        "(line 3306,col 7)-(line 3306,col 42)",
        "(line 3307,col 7)-(line 3307,col 31)",
        "(line 3308,col 7)-(line 3308,col 38)",
        "(line 3309,col 7)-(line 3309,col 23)",
        "(line 3310,col 7)-(line 3310,col 17)",
        "(line 3312,col 7)-(line 3312,col 39)",
        "(line 3313,col 7)-(line 3313,col 19)",
        "(line 3315,col 7)-(line 3315,col 26)",
        "(line 3316,col 7)-(line 3316,col 34)",
        "(line 3317,col 7)-(line 3317,col 15)",
        "(line 3319,col 7)-(line 3319,col 33)",
        "(line 3322,col 7)-(line 3322,col 16)",
        "(line 3324,col 7)-(line 3326,col 7)",
        "(line 3328,col 7)-(line 3328,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toRadians(double)",
      "begin_line": 3336,
      "end_line": 3354,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 3338,col 9)-(line 3340,col 9)",
        "(line 3343,col 9)-(line 3343,col 49)",
        "(line 3344,col 9)-(line 3344,col 50)",
        "(line 3346,col 9)-(line 3346,col 38)",
        "(line 3347,col 9)-(line 3347,col 27)",
        "(line 3349,col 9)-(line 3349,col 74)",
        "(line 3350,col 9)-(line 3352,col 9)",
        "(line 3353,col 9)-(line 3353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toDegrees(double)",
      "begin_line": 3361,
      "end_line": 3375,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 3363,col 9)-(line 3365,col 9)",
        "(line 3368,col 9)-(line 3368,col 46)",
        "(line 3369,col 9)-(line 3369,col 50)",
        "(line 3371,col 9)-(line 3371,col 38)",
        "(line 3372,col 9)-(line 3372,col 27)",
        "(line 3374,col 9)-(line 3374,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(int)",
      "begin_line": 3382,
      "end_line": 3384,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3383,col 9)-(line 3383,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(long)",
      "begin_line": 3391,
      "end_line": 3393,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3392,col 9)-(line 3392,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(float)",
      "begin_line": 3400,
      "end_line": 3402,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3401,col 9)-(line 3401,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(double)",
      "begin_line": 3409,
      "end_line": 3411,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3410,col 9)-(line 3410,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(double)",
      "begin_line": 3418,
      "end_line": 3423,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3419,col 9)-(line 3421,col 9)",
        "(line 3422,col 9)-(line 3422,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(float)",
      "begin_line": 3430,
      "end_line": 3435,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3431,col 9)-(line 3433,col 9)",
        "(line 3434,col 9)-(line 3434,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(double, int)",
      "begin_line": 3443,
      "end_line": 3519,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3446,col 9)-(line 3448,col 9)",
        "(line 3451,col 9)-(line 3453,col 9)",
        "(line 3454,col 9)-(line 3456,col 9)",
        "(line 3457,col 9)-(line 3459,col 9)",
        "(line 3462,col 9)-(line 3462,col 53)",
        "(line 3463,col 9)-(line 3463,col 53)",
        "(line 3464,col 9)-(line 3464,col 56)",
        "(line 3465,col 9)-(line 3465,col 53)",
        "(line 3468,col 9)-(line 3468,col 42)",
        "(line 3470,col 9)-(line 3517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(float, int)",
      "begin_line": 3527,
      "end_line": 3603,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3530,col 9)-(line 3532,col 9)",
        "(line 3535,col 9)-(line 3537,col 9)",
        "(line 3538,col 9)-(line 3540,col 9)",
        "(line 3541,col 9)-(line 3543,col 9)",
        "(line 3546,col 9)-(line 3546,col 49)",
        "(line 3547,col 9)-(line 3547,col 43)",
        "(line 3548,col 9)-(line 3548,col 46)",
        "(line 3549,col 9)-(line 3549,col 43)",
        "(line 3552,col 9)-(line 3552,col 42)",
        "(line 3554,col 9)-(line 3601,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(double, double)",
      "begin_line": 3636,
      "end_line": 3659,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3639,col 9)-(line 3647,col 9)",
        "(line 3651,col 9)-(line 3651,col 53)",
        "(line 3652,col 9)-(line 3652,col 53)",
        "(line 3653,col 9)-(line 3657,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(float, double)",
      "begin_line": 3692,
      "end_line": 3715,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3695,col 9)-(line 3703,col 9)",
        "(line 3707,col 9)-(line 3707,col 49)",
        "(line 3708,col 9)-(line 3708,col 43)",
        "(line 3709,col 9)-(line 3713,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.floor(double)",
      "begin_line": 3721,
      "end_line": 3742,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3722,col 9)-(line 3722,col 15)",
        "(line 3724,col 9)-(line 3726,col 9)",
        "(line 3728,col 9)-(line 3730,col 9)",
        "(line 3732,col 9)-(line 3732,col 21)",
        "(line 3733,col 9)-(line 3735,col 9)",
        "(line 3737,col 9)-(line 3739,col 9)",
        "(line 3741,col 9)-(line 3741,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ceil(double)",
      "begin_line": 3748,
      "end_line": 3767,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3749,col 9)-(line 3749,col 17)",
        "(line 3751,col 9)-(line 3753,col 9)",
        "(line 3755,col 9)-(line 3755,col 21)",
        "(line 3756,col 9)-(line 3758,col 9)",
        "(line 3760,col 9)-(line 3760,col 17)",
        "(line 3762,col 9)-(line 3764,col 9)",
        "(line 3766,col 9)-(line 3766,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.rint(double)",
      "begin_line": 3773,
      "end_line": 3790,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3774,col 9)-(line 3774,col 28)",
        "(line 3775,col 9)-(line 3775,col 25)",
        "(line 3777,col 9)-(line 3782,col 9)",
        "(line 3783,col 9)-(line 3785,col 9)",
        "(line 3788,col 9)-(line 3788,col 26)",
        "(line 3789,col 9)-(line 3789,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(double)",
      "begin_line": 3796,
      "end_line": 3798,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3797,col 9)-(line 3797,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(float)",
      "begin_line": 3804,
      "end_line": 3806,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3805,col 9)-(line 3805,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(int, int)",
      "begin_line": 3813,
      "end_line": 3815,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3814,col 9)-(line 3814,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(long, long)",
      "begin_line": 3822,
      "end_line": 3824,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3823,col 9)-(line 3823,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(float, float)",
      "begin_line": 3831,
      "end_line": 3849,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3832,col 9)-(line 3834,col 9)",
        "(line 3835,col 9)-(line 3837,col 9)",
        "(line 3839,col 9)-(line 3841,col 9)",
        "(line 3844,col 9)-(line 3844,col 46)",
        "(line 3845,col 9)-(line 3847,col 9)",
        "(line 3848,col 9)-(line 3848,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(double, double)",
      "begin_line": 3856,
      "end_line": 3874,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3857,col 9)-(line 3859,col 9)",
        "(line 3860,col 9)-(line 3862,col 9)",
        "(line 3864,col 9)-(line 3866,col 9)",
        "(line 3869,col 9)-(line 3869,col 50)",
        "(line 3870,col 9)-(line 3872,col 9)",
        "(line 3873,col 9)-(line 3873,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(int, int)",
      "begin_line": 3881,
      "end_line": 3883,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3882,col 9)-(line 3882,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(long, long)",
      "begin_line": 3890,
      "end_line": 3892,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3891,col 9)-(line 3891,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(float, float)",
      "begin_line": 3899,
      "end_line": 3917,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3900,col 9)-(line 3902,col 9)",
        "(line 3903,col 9)-(line 3905,col 9)",
        "(line 3907,col 9)-(line 3909,col 9)",
        "(line 3912,col 9)-(line 3912,col 46)",
        "(line 3913,col 9)-(line 3915,col 9)",
        "(line 3916,col 9)-(line 3916,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(double, double)",
      "begin_line": 3924,
      "end_line": 3942,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3925,col 9)-(line 3927,col 9)",
        "(line 3928,col 9)-(line 3930,col 9)",
        "(line 3932,col 9)-(line 3934,col 9)",
        "(line 3937,col 9)-(line 3937,col 50)",
        "(line 3938,col 9)-(line 3940,col 9)",
        "(line 3941,col 9)-(line 3941,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.hypot(double, double)",
      "begin_line": 3958,
      "end_line": 3991,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3959,col 9)-(line 3990,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 4013,
      "end_line": 4015,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 4014,col 9)-(line 4014,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(double, double)",
      "begin_line": 4025,
      "end_line": 4032,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 4026,col 9)-(line 4026,col 52)",
        "(line 4027,col 9)-(line 4027,col 47)",
        "(line 4028,col 9)-(line 4030,col 9)",
        "(line 4031,col 9)-(line 4031,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(float, float)",
      "begin_line": 4042,
      "end_line": 4049,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 4043,col 9)-(line 4043,col 48)",
        "(line 4044,col 9)-(line 4044,col 43)",
        "(line 4045,col 9)-(line 4047,col 9)",
        "(line 4048,col 9)-(line 4048,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(double)",
      "begin_line": 4060,
      "end_line": 4062,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 4061,col 9)-(line 4061,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(float)",
      "begin_line": 4073,
      "end_line": 4075,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 4074,col 9)-(line 4074,col 63)"
      ]
    }
  ]
}