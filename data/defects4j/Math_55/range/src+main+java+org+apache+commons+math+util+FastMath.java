{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 4047,
      "comment": "\n * Faster, more accurate, portable alternative to {@link StrictMath}.\n * \u003cp\u003e\n * Additionally implements the following methods not found in StrictMath:\n * \u003cul\u003e\n * \u003cli\u003e{@link #asinh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #acosh(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #atanh(double)}\u003c/li\u003e\n * \u003c/ul\u003e\n * The following methods are found in StrictMath since 1.6 only\n * \u003cul\u003e\n * \u003cli\u003e{@link #copySign(double, double)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(double,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(double)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(double, int)}\u003c/li\u003e\n * \u003cli\u003e{@link #copySign(float, float)}\u003c/li\u003e\n * \u003cli\u003e{@link #getExponent(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextAfter(float,double)}\u003c/li\u003e\n * \u003cli\u003e{@link #nextUp(float)}\u003c/li\u003e\n * \u003cli\u003e{@link #scalb(float, int)}\u003c/li\u003e\n * \u003c/ul\u003e\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "PI"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Archimede\u0027s constant PI, ratio of circle circumference to diameter. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Napier\u0027s constant e, base of the natural logarithm. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + 750] + expIntTableB[x+750].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + 750] + expIntTableB[x+750]\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FACT"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Factorial table, for Taylor series expansions. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_A"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " log(2) (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_B"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " log(2) (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_SPLIT_COEF"
      ],
      "begin_line": 85,
      "end_line": 102,
      "comment": " Coefficients for slowLog. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_QUICK_COEF"
      ],
      "begin_line": 105,
      "end_line": 115,
      "comment": " Coefficients for log, when input 0.99 \u003c x \u003c 1.01. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_HI_PREC_COEF"
      ],
      "begin_line": 118,
      "end_line": 125,
      "comment": " Coefficients for log in the range of 1.0 \u003c x \u003c 1.0 + 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_A"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Sine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_B"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Sine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_A"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Cosine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_B"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Cosine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_A"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Tangent table, used by atan() (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_B"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Tangent table, used by atan() (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "RECIP_2PI"
      ],
      "begin_line": 146,
      "end_line": 164,
      "comment": " Bits of 1/(2*pi), need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "PI_O_4_BITS"
      ],
      "begin_line": 167,
      "end_line": 169,
      "comment": " Bits of pi/4, need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "EIGHTHS"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Eighths.\n     * This is used by sinQ, because its faster to do a table lookup than\n     * a multiply in this time-critical routine\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CBRTTWO"
      ],
      "begin_line": 178,
      "end_line": 182,
      "comment": " Table of 2^((n+2)/3) "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_40000000"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " 1073741824L"
    },
    {
      "type": "field",
      "varNames": [
        "MASK_30BITS"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " 0xFFFFFFFFC0000000L;"
    },
    {
      "type": "field",
      "varNames": [
        "TWO_POWER_52"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.FastMath.FastMath()",
      "begin_line": 250,
      "end_line": 251,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.doubleHighPart(double)",
      "begin_line": 262,
      "end_line": 269,
      "comment": "\n     * Get the high order bits from the mantissa.\n     * Equivalent to adding and subtracting HEX_40000 but also works for very large numbers\n     *\n     * @param d the value to split\n     * @return the high order part of the mantissa\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 45)",
        "(line 267,col 9)-(line 267,col 30)",
        "(line 268,col 9)-(line 268,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sqrt(double)",
      "begin_line": 276,
      "end_line": 278,
      "comment": " Compute the square root of a number.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#sqrt}\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosh(double)",
      "begin_line": 284,
      "end_line": 332,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 285,col 7)-(line 287,col 7)",
        "(line 289,col 7)-(line 291,col 7)",
        "(line 293,col 7)-(line 295,col 7)",
        "(line 297,col 7)-(line 297,col 38)",
        "(line 298,col 7)-(line 300,col 7)",
        "(line 301,col 7)-(line 301,col 26)",
        "(line 303,col 7)-(line 303,col 40)",
        "(line 304,col 7)-(line 304,col 48)",
        "(line 306,col 7)-(line 306,col 38)",
        "(line 307,col 7)-(line 307,col 36)",
        "(line 308,col 7)-(line 308,col 28)",
        "(line 311,col 7)-(line 311,col 28)",
        "(line 312,col 7)-(line 312,col 34)",
        "(line 313,col 7)-(line 313,col 42)",
        "(line 314,col 7)-(line 314,col 37)",
        "(line 317,col 7)-(line 317,col 82)",
        "(line 319,col 7)-(line 319,col 36)",
        "(line 322,col 7)-(line 322,col 25)",
        "(line 323,col 7)-(line 323,col 34)",
        "(line 324,col 7)-(line 324,col 16)",
        "(line 325,col 7)-(line 325,col 25)",
        "(line 326,col 7)-(line 326,col 34)",
        "(line 327,col 7)-(line 327,col 16)",
        "(line 329,col 7)-(line 329,col 30)",
        "(line 330,col 7)-(line 330,col 20)",
        "(line 331,col 7)-(line 331,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinh(double)",
      "begin_line": 338,
      "end_line": 442,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 339,col 7)-(line 339,col 29)",
        "(line 340,col 7)-(line 342,col 7)",
        "(line 344,col 7)-(line 346,col 7)",
        "(line 348,col 7)-(line 350,col 7)",
        "(line 352,col 7)-(line 354,col 7)",
        "(line 356,col 7)-(line 359,col 7)",
        "(line 361,col 7)-(line 361,col 20)",
        "(line 363,col 7)-(line 435,col 7)",
        "(line 437,col 7)-(line 439,col 7)",
        "(line 441,col 7)-(line 441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanh(double)",
      "begin_line": 448,
      "end_line": 560,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 449,col 7)-(line 449,col 29)",
        "(line 451,col 7)-(line 453,col 7)",
        "(line 455,col 7)-(line 457,col 7)",
        "(line 459,col 7)-(line 461,col 7)",
        "(line 463,col 7)-(line 465,col 7)",
        "(line 467,col 7)-(line 470,col 7)",
        "(line 472,col 7)-(line 472,col 20)",
        "(line 473,col 7)-(line 553,col 7)",
        "(line 555,col 7)-(line 557,col 7)",
        "(line 559,col 7)-(line 559,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acosh(double)",
      "begin_line": 566,
      "end_line": 568,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asinh(double)",
      "begin_line": 574,
      "end_line": 600,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 33)",
        "(line 577,col 9)-(line 580,col 9)",
        "(line 582,col 9)-(line 582,col 24)",
        "(line 583,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atanh(double)",
      "begin_line": 606,
      "end_line": 632,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 33)",
        "(line 609,col 9)-(line 612,col 9)",
        "(line 614,col 9)-(line 614,col 24)",
        "(line 615,col 9)-(line 628,col 9)",
        "(line 630,col 9)-(line 630,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(double)",
      "begin_line": 639,
      "end_line": 641,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(float)",
      "begin_line": 648,
      "end_line": 650,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(double)",
      "begin_line": 656,
      "end_line": 658,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(float)",
      "begin_line": 664,
      "end_line": 666,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.random()",
      "begin_line": 672,
      "end_line": 674,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link Math#random}\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double)",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double, double, double[])",
      "begin_line": 707,
      "end_line": 822,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 24)",
        "(line 709,col 9)-(line 709,col 24)",
        "(line 710,col 9)-(line 710,col 19)",
        "(line 716,col 9)-(line 766,col 9)",
        "(line 772,col 9)-(line 772,col 58)",
        "(line 773,col 9)-(line 773,col 59)",
        "(line 774,col 9)-(line 774,col 59)",
        "(line 780,col 9)-(line 780,col 63)",
        "(line 789,col 9)-(line 789,col 39)",
        "(line 790,col 9)-(line 790,col 45)",
        "(line 791,col 9)-(line 791,col 45)",
        "(line 792,col 9)-(line 792,col 30)",
        "(line 793,col 9)-(line 793,col 49)",
        "(line 800,col 9)-(line 800,col 44)",
        "(line 801,col 9)-(line 801,col 90)",
        "(line 807,col 9)-(line 807,col 43)",
        "(line 808,col 9)-(line 808,col 28)",
        "(line 809,col 9)-(line 813,col 9)",
        "(line 815,col 9)-(line 819,col 9)",
        "(line 821,col 9)-(line 821,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double)",
      "begin_line": 828,
      "end_line": 830,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 829,col 7)-(line 829,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double, double[])",
      "begin_line": 837,
      "end_line": 977,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 840,col 9)",
        "(line 842,col 9)-(line 855,col 9)",
        "(line 857,col 9)-(line 857,col 21)",
        "(line 858,col 9)-(line 858,col 21)",
        "(line 859,col 9)-(line 859,col 23)",
        "(line 860,col 9)-(line 860,col 33)",
        "(line 862,col 9)-(line 865,col 9)",
        "(line 867,col 9)-(line 881,col 9)",
        "(line 885,col 9)-(line 885,col 41)",
        "(line 886,col 9)-(line 886,col 49)",
        "(line 887,col 9)-(line 887,col 48)",
        "(line 888,col 9)-(line 888,col 48)",
        "(line 889,col 9)-(line 889,col 26)",
        "(line 890,col 9)-(line 890,col 26)",
        "(line 892,col 9)-(line 892,col 28)",
        "(line 893,col 9)-(line 893,col 30)",
        "(line 894,col 9)-(line 894,col 31)",
        "(line 895,col 9)-(line 895,col 18)",
        "(line 897,col 9)-(line 897,col 33)",
        "(line 898,col 9)-(line 898,col 32)",
        "(line 899,col 9)-(line 899,col 24)",
        "(line 900,col 9)-(line 900,col 18)",
        "(line 903,col 9)-(line 903,col 31)",
        "(line 905,col 9)-(line 905,col 31)",
        "(line 906,col 9)-(line 906,col 46)",
        "(line 907,col 9)-(line 907,col 18)",
        "(line 909,col 9)-(line 909,col 31)",
        "(line 910,col 9)-(line 910,col 40)",
        "(line 911,col 9)-(line 911,col 18)",
        "(line 913,col 9)-(line 913,col 31)",
        "(line 914,col 9)-(line 914,col 38)",
        "(line 915,col 9)-(line 915,col 18)",
        "(line 919,col 9)-(line 919,col 26)",
        "(line 920,col 9)-(line 920,col 35)",
        "(line 921,col 9)-(line 921,col 18)",
        "(line 923,col 9)-(line 923,col 23)",
        "(line 925,col 9)-(line 925,col 32)",
        "(line 926,col 9)-(line 926,col 18)",
        "(line 928,col 9)-(line 928,col 26)",
        "(line 930,col 9)-(line 930,col 35)",
        "(line 931,col 9)-(line 931,col 18)",
        "(line 933,col 9)-(line 933,col 23)",
        "(line 935,col 9)-(line 935,col 32)",
        "(line 936,col 9)-(line 936,col 18)",
        "(line 938,col 9)-(line 969,col 9)",
        "(line 971,col 9)-(line 974,col 9)",
        "(line 976,col 9)-(line 976,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowexp(double, double[])",
      "begin_line": 986,
      "end_line": 1013,
      "comment": "\n     *  For x between 0 and 1, returns exp(x), uses extended precision\n     *  @param x argument of exponential\n     *  @param result placeholder where to place exp(x) split in two terms\n     *  for extra precision (i.e. exp(x) \u003d result[0] ° result[1]\n     *  @return exp(x)\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 42)",
        "(line 988,col 9)-(line 988,col 42)",
        "(line 989,col 9)-(line 989,col 45)",
        "(line 990,col 9)-(line 990,col 42)",
        "(line 991,col 9)-(line 991,col 21)",
        "(line 992,col 9)-(line 992,col 28)",
        "(line 994,col 9)-(line 1005,col 9)",
        "(line 1007,col 9)-(line 1010,col 9)",
        "(line 1012,col 9)-(line 1012,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.split(double, double[])",
      "begin_line": 1020,
      "end_line": 1030,
      "comment": " Compute split[0], split[1] such that their sum is equal to d,\n     * and split[0] has its 30 least significant bits as zero.\n     * @param d number to split\n     * @param split placeholder where to place the result\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1029,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.resplit(double[])",
      "begin_line": 1036,
      "end_line": 1049,
      "comment": " Recompute a split.\n     * @param a input/out array containing the split, changed\n     * on output\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 37)",
        "(line 1038,col 9)-(line 1038,col 44)",
        "(line 1040,col 9)-(line 1048,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitMult(double[], double[], double[])",
      "begin_line": 1056,
      "end_line": 1062,
      "comment": " Multiply two numbers in split form.\n     * @param a first term of multiplication\n     * @param b second term of multiplication\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 29)",
        "(line 1058,col 9)-(line 1058,col 57)",
        "(line 1061,col 9)-(line 1061,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitAdd(double[], double[], double[])",
      "begin_line": 1069,
      "end_line": 1074,
      "comment": " Add two numbers in split form.\n     * @param a first term of addition\n     * @param b second term of addition\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1070,col 9)-(line 1070,col 29)",
        "(line 1071,col 9)-(line 1071,col 29)",
        "(line 1073,col 9)-(line 1073,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitReciprocal(double[], double[])",
      "begin_line": 1094,
      "end_line": 1122,
      "comment": " Compute the reciprocal of in.  Use the following algorithm.\n     *  in \u003d c + d.\n     *  want to find x + y such that x+y \u003d 1/(c+d) and x is much\n     *  larger than y and x has several zero bits on the right.\n     *\n     *  Set b \u003d 1/(2^22),  a \u003d 1 - b.  Thus (a+b) \u003d 1.\n     *  Use following identity to compute (a+b)/(c+d)\n     *\n     *  (a+b)/(c+d)  \u003d   a/c   +    (bc - ad) / (c^2 + cd)\n     *  set x \u003d a/c  and y \u003d (bc - ad) / (c^2 + cd)\n     *  This will be close to the right answer, but there will be\n     *  some rounding in the calculation of X.  So by carefully\n     *  computing 1 - (c+d)(x+y) we can compute an error and\n     *  add that back in.   This is done carefully so that terms\n     *  of similar size are subtracted first.\n     *  @param in initial number, in split form\n     *  @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1095,col 39)",
        "(line 1096,col 9)-(line 1096,col 33)",
        "(line 1098,col 9)-(line 1101,col 9)",
        "(line 1103,col 9)-(line 1103,col 30)",
        "(line 1104,col 9)-(line 1104,col 68)",
        "(line 1106,col 9)-(line 1108,col 9)",
        "(line 1111,col 9)-(line 1111,col 24)",
        "(line 1113,col 9)-(line 1121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.quadMult(double[], double[], double[])",
      "begin_line": 1129,
      "end_line": 1176,
      "comment": " Compute (a[0] + a[1]) * (b[0] + b[1]) in extended precision.\n     * @param a first term of the multiplication\n     * @param b second term of the multiplication\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 42)",
        "(line 1131,col 9)-(line 1131,col 42)",
        "(line 1132,col 9)-(line 1132,col 42)",
        "(line 1135,col 9)-(line 1135,col 24)",
        "(line 1136,col 9)-(line 1136,col 24)",
        "(line 1137,col 9)-(line 1137,col 30)",
        "(line 1139,col 9)-(line 1139,col 26)",
        "(line 1140,col 9)-(line 1140,col 26)",
        "(line 1143,col 9)-(line 1143,col 24)",
        "(line 1144,col 9)-(line 1144,col 30)",
        "(line 1146,col 9)-(line 1146,col 39)",
        "(line 1147,col 9)-(line 1147,col 58)",
        "(line 1148,col 9)-(line 1148,col 24)",
        "(line 1149,col 9)-(line 1149,col 32)",
        "(line 1150,col 9)-(line 1150,col 58)",
        "(line 1151,col 9)-(line 1151,col 24)",
        "(line 1154,col 9)-(line 1154,col 24)",
        "(line 1155,col 9)-(line 1155,col 24)",
        "(line 1156,col 9)-(line 1156,col 30)",
        "(line 1158,col 9)-(line 1158,col 32)",
        "(line 1159,col 9)-(line 1159,col 58)",
        "(line 1160,col 9)-(line 1160,col 24)",
        "(line 1161,col 9)-(line 1161,col 32)",
        "(line 1162,col 9)-(line 1162,col 58)",
        "(line 1163,col 9)-(line 1163,col 24)",
        "(line 1166,col 9)-(line 1166,col 24)",
        "(line 1167,col 9)-(line 1167,col 24)",
        "(line 1168,col 9)-(line 1168,col 30)",
        "(line 1170,col 9)-(line 1170,col 32)",
        "(line 1171,col 9)-(line 1171,col 58)",
        "(line 1172,col 9)-(line 1172,col 24)",
        "(line 1173,col 9)-(line 1173,col 32)",
        "(line 1174,col 9)-(line 1174,col 58)",
        "(line 1175,col 9)-(line 1175,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expint(int, double[])",
      "begin_line": 1183,
      "end_line": 1221,
      "comment": " Compute exp(p) for a integer p in extended precision.\n     * @param p integer whose exponential is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return exp(p) in standard precision (equal to result[0] + result[1])\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 42)",
        "(line 1186,col 9)-(line 1186,col 42)",
        "(line 1187,col 9)-(line 1187,col 42)",
        "(line 1196,col 9)-(line 1196,col 34)",
        "(line 1197,col 9)-(line 1197,col 39)",
        "(line 1199,col 9)-(line 1199,col 23)",
        "(line 1201,col 9)-(line 1211,col 9)",
        "(line 1213,col 9)-(line 1218,col 9)",
        "(line 1220,col 9)-(line 1220,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double)",
      "begin_line": 1230,
      "end_line": 1232,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double[])",
      "begin_line": 1240,
      "end_line": 1460,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1241,col 9)-(line 1243,col 9)",
        "(line 1244,col 9)-(line 1244,col 47)",
        "(line 1247,col 9)-(line 1255,col 9)",
        "(line 1258,col 9)-(line 1264,col 9)",
        "(line 1267,col 9)-(line 1267,col 41)",
        "(line 1269,col 9)-(line 1286,col 9)",
        "(line 1289,col 9)-(line 1334,col 9)",
        "(line 1337,col 9)-(line 1337,col 74)",
        "(line 1348,col 9)-(line 1348,col 97)",
        "(line 1350,col 9)-(line 1350,col 26)",
        "(line 1351,col 9)-(line 1351,col 26)",
        "(line 1353,col 9)-(line 1411,col 9)",
        "(line 1427,col 9)-(line 1427,col 30)",
        "(line 1428,col 9)-(line 1428,col 23)",
        "(line 1429,col 9)-(line 1429,col 28)",
        "(line 1430,col 9)-(line 1430,col 33)",
        "(line 1431,col 9)-(line 1431,col 14)",
        "(line 1432,col 9)-(line 1432,col 18)",
        "(line 1434,col 9)-(line 1434,col 21)",
        "(line 1435,col 9)-(line 1435,col 28)",
        "(line 1436,col 9)-(line 1436,col 14)",
        "(line 1437,col 9)-(line 1437,col 18)",
        "(line 1439,col 9)-(line 1439,col 27)",
        "(line 1440,col 9)-(line 1440,col 34)",
        "(line 1441,col 9)-(line 1441,col 14)",
        "(line 1442,col 9)-(line 1442,col 18)",
        "(line 1444,col 9)-(line 1444,col 23)",
        "(line 1445,col 9)-(line 1445,col 30)",
        "(line 1446,col 9)-(line 1446,col 14)",
        "(line 1447,col 9)-(line 1447,col 18)",
        "(line 1449,col 9)-(line 1449,col 21)",
        "(line 1450,col 9)-(line 1450,col 28)",
        "(line 1451,col 9)-(line 1451,col 14)",
        "(line 1452,col 9)-(line 1452,col 18)",
        "(line 1454,col 9)-(line 1457,col 9)",
        "(line 1459,col 9)-(line 1459,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log1p(double)",
      "begin_line": 1466,
      "end_line": 1502,
      "comment": " Compute log(1 + x).\n     * @param x a number\n     * @return log(1 + x)\n     ",
      "child_ranges": [
        "(line 1467,col 9)-(line 1467,col 29)",
        "(line 1468,col 9)-(line 1468,col 38)",
        "(line 1470,col 9)-(line 1472,col 9)",
        "(line 1474,col 9)-(line 1476,col 9)",
        "(line 1478,col 9)-(line 1494,col 9)",
        "(line 1497,col 9)-(line 1497,col 47)",
        "(line 1498,col 9)-(line 1498,col 24)",
        "(line 1499,col 9)-(line 1499,col 18)",
        "(line 1501,col 9)-(line 1501,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log10(double)",
      "begin_line": 1508,
      "end_line": 1524,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1509,col 9)-(line 1509,col 46)",
        "(line 1511,col 9)-(line 1511,col 44)",
        "(line 1512,col 9)-(line 1514,col 9)",
        "(line 1516,col 9)-(line 1516,col 52)",
        "(line 1517,col 9)-(line 1517,col 49)",
        "(line 1518,col 9)-(line 1518,col 55)",
        "(line 1520,col 9)-(line 1520,col 49)",
        "(line 1521,col 9)-(line 1521,col 52)",
        "(line 1523,col 9)-(line 1523,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.pow(double, double)",
      "begin_line": 1533,
      "end_line": 1694,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 43)",
        "(line 1536,col 9)-(line 1538,col 9)",
        "(line 1540,col 9)-(line 1542,col 9)",
        "(line 1545,col 9)-(line 1572,col 9)",
        "(line 1574,col 9)-(line 1583,col 9)",
        "(line 1585,col 9)-(line 1594,col 9)",
        "(line 1596,col 9)-(line 1618,col 9)",
        "(line 1620,col 9)-(line 1631,col 9)",
        "(line 1634,col 9)-(line 1646,col 9)",
        "(line 1649,col 9)-(line 1649,col 18)",
        "(line 1650,col 9)-(line 1650,col 18)",
        "(line 1651,col 9)-(line 1660,col 9)",
        "(line 1663,col 9)-(line 1663,col 41)",
        "(line 1664,col 9)-(line 1666,col 9)",
        "(line 1668,col 9)-(line 1668,col 28)",
        "(line 1669,col 9)-(line 1669,col 28)",
        "(line 1672,col 9)-(line 1672,col 41)",
        "(line 1673,col 9)-(line 1673,col 40)",
        "(line 1674,col 9)-(line 1674,col 26)",
        "(line 1675,col 9)-(line 1675,col 19)",
        "(line 1678,col 9)-(line 1678,col 35)",
        "(line 1679,col 9)-(line 1679,col 57)",
        "(line 1681,col 9)-(line 1681,col 20)",
        "(line 1682,col 9)-(line 1682,col 31)",
        "(line 1684,col 9)-(line 1684,col 31)",
        "(line 1685,col 9)-(line 1685,col 35)",
        "(line 1686,col 9)-(line 1686,col 34)",
        "(line 1687,col 9)-(line 1687,col 26)",
        "(line 1688,col 9)-(line 1688,col 26)",
        "(line 1689,col 9)-(line 1689,col 20)",
        "(line 1691,col 9)-(line 1691,col 48)",
        "(line 1693,col 9)-(line 1693,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowLog(double)",
      "begin_line": 1715,
      "end_line": 1757,
      "comment": " xi in the range of [1, 2].\n     *                                3        5        7\n     *      x+1           /          x        x        x          \\\n     *  ln ----- \u003d   2 *  |  x  +   ----  +  ----  +  ---- + ...  |\n     *      1-x           \\          3        5        7          /\n     *\n     * So, compute a Remez approximation of the following function\n     *\n     *  ln ((sqrt(x)+1)/(1-sqrt(x)))  /  x\n     *\n     * This will be an even function with only positive coefficents.\n     * x is in the range [0 - 1/3].\n     *\n     * Transform xi for input to the above function by setting\n     * x \u003d (xi-1)/(xi+1).   Input to the polynomial is x^2, then\n     * the result is multiplied by x.\n     * @param xi number from which log is requested\n     * @return log(xi)\n     ",
      "child_ranges": [
        "(line 1716,col 9)-(line 1716,col 35)",
        "(line 1717,col 9)-(line 1717,col 36)",
        "(line 1718,col 9)-(line 1718,col 35)",
        "(line 1719,col 9)-(line 1719,col 35)",
        "(line 1721,col 9)-(line 1721,col 21)",
        "(line 1724,col 9)-(line 1724,col 20)",
        "(line 1725,col 9)-(line 1725,col 19)",
        "(line 1726,col 9)-(line 1726,col 30)",
        "(line 1727,col 9)-(line 1727,col 20)",
        "(line 1728,col 9)-(line 1728,col 19)",
        "(line 1729,col 9)-(line 1729,col 27)",
        "(line 1730,col 9)-(line 1730,col 20)",
        "(line 1731,col 9)-(line 1731,col 20)",
        "(line 1734,col 9)-(line 1734,col 28)",
        "(line 1740,col 9)-(line 1740,col 56)",
        "(line 1741,col 9)-(line 1741,col 56)",
        "(line 1743,col 9)-(line 1750,col 9)",
        "(line 1752,col 9)-(line 1752,col 27)",
        "(line 1753,col 9)-(line 1753,col 20)",
        "(line 1754,col 9)-(line 1754,col 20)",
        "(line 1756,col 9)-(line 1756,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowSin(double, double[])",
      "begin_line": 1765,
      "end_line": 1799,
      "comment": "\n     * For x between 0 and pi/4 compute sine.\n     * @param x number from which sine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 1766,col 9)-(line 1766,col 42)",
        "(line 1767,col 9)-(line 1767,col 42)",
        "(line 1768,col 9)-(line 1768,col 45)",
        "(line 1769,col 9)-(line 1769,col 42)",
        "(line 1770,col 9)-(line 1770,col 21)",
        "(line 1771,col 9)-(line 1771,col 28)",
        "(line 1773,col 9)-(line 1791,col 9)",
        "(line 1793,col 9)-(line 1796,col 9)",
        "(line 1798,col 9)-(line 1798,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowCos(double, double[])",
      "begin_line": 1807,
      "end_line": 1842,
      "comment": "\n     *  For x between 0 and pi/4 compute cosine\n     * @param x number from which cosine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 1809,col 9)-(line 1809,col 42)",
        "(line 1810,col 9)-(line 1810,col 42)",
        "(line 1811,col 9)-(line 1811,col 45)",
        "(line 1812,col 9)-(line 1812,col 42)",
        "(line 1813,col 9)-(line 1813,col 21)",
        "(line 1814,col 9)-(line 1814,col 28)",
        "(line 1816,col 9)-(line 1834,col 9)",
        "(line 1836,col 9)-(line 1839,col 9)",
        "(line 1841,col 9)-(line 1841,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.buildSinCosTables()",
      "begin_line": 1846,
      "end_line": 1938,
      "comment": " Build the sine and cosine tables.\n     ",
      "child_ranges": [
        "(line 1847,col 9)-(line 1847,col 46)",
        "(line 1850,col 9)-(line 1860,col 9)",
        "(line 1863,col 9)-(line 1916,col 9)",
        "(line 1919,col 9)-(line 1936,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polySine(double)",
      "begin_line": 1946,
      "end_line": 1959,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1948,col 9)-(line 1948,col 24)",
        "(line 1950,col 9)-(line 1950,col 41)",
        "(line 1951,col 9)-(line 1951,col 44)",
        "(line 1952,col 9)-(line 1952,col 42)",
        "(line 1953,col 9)-(line 1953,col 42)",
        "(line 1956,col 9)-(line 1956,col 23)",
        "(line 1958,col 9)-(line 1958,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polyCosine(double)",
      "begin_line": 1967,
      "end_line": 1977,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1968,col 9)-(line 1968,col 24)",
        "(line 1970,col 9)-(line 1970,col 40)",
        "(line 1971,col 9)-(line 1971,col 44)",
        "(line 1972,col 9)-(line 1972,col 42)",
        "(line 1973,col 9)-(line 1973,col 42)",
        "(line 1974,col 9)-(line 1974,col 16)",
        "(line 1976,col 9)-(line 1976,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinQ(double, double)",
      "begin_line": 1986,
      "end_line": 2101,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1987,col 9)-(line 1987,col 43)",
        "(line 1988,col 9)-(line 1988,col 49)",
        "(line 1991,col 9)-(line 1991,col 47)",
        "(line 1992,col 9)-(line 1992,col 47)",
        "(line 1993,col 9)-(line 1993,col 49)",
        "(line 1994,col 9)-(line 1994,col 49)",
        "(line 1997,col 9)-(line 1997,col 33)",
        "(line 1998,col 9)-(line 1998,col 43)",
        "(line 1999,col 9)-(line 1999,col 35)",
        "(line 2000,col 9)-(line 2000,col 51)",
        "(line 2003,col 9)-(line 2003,col 51)",
        "(line 2004,col 9)-(line 2004,col 47)",
        "(line 2005,col 9)-(line 2005,col 36)",
        "(line 2006,col 9)-(line 2006,col 24)",
        "(line 2009,col 9)-(line 2009,col 22)",
        "(line 2032,col 9)-(line 2032,col 21)",
        "(line 2033,col 9)-(line 2033,col 21)",
        "(line 2035,col 9)-(line 2035,col 25)",
        "(line 2036,col 9)-(line 2036,col 25)",
        "(line 2037,col 9)-(line 2037,col 32)",
        "(line 2038,col 9)-(line 2038,col 14)",
        "(line 2039,col 9)-(line 2039,col 18)",
        "(line 2041,col 9)-(line 2041,col 28)",
        "(line 2042,col 9)-(line 2042,col 18)",
        "(line 2043,col 9)-(line 2043,col 25)",
        "(line 2044,col 9)-(line 2044,col 14)",
        "(line 2045,col 9)-(line 2045,col 18)",
        "(line 2047,col 9)-(line 2047,col 50)",
        "(line 2062,col 9)-(line 2062,col 76)",
        "(line 2089,col 9)-(line 2096,col 9)",
        "(line 2098,col 9)-(line 2098,col 23)",
        "(line 2100,col 9)-(line 2100,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosQ(double, double)",
      "begin_line": 2110,
      "end_line": 2119,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 2111,col 9)-(line 2111,col 47)",
        "(line 2112,col 9)-(line 2112,col 50)",
        "(line 2114,col 9)-(line 2114,col 35)",
        "(line 2115,col 9)-(line 2115,col 36)",
        "(line 2116,col 9)-(line 2116,col 23)",
        "(line 2118,col 9)-(line 2118,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 2129,
      "end_line": 2264,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 2131,col 9)-(line 2131,col 43)",
        "(line 2132,col 9)-(line 2132,col 49)",
        "(line 2135,col 9)-(line 2135,col 47)",
        "(line 2136,col 9)-(line 2136,col 47)",
        "(line 2137,col 9)-(line 2137,col 49)",
        "(line 2138,col 9)-(line 2138,col 49)",
        "(line 2141,col 9)-(line 2141,col 33)",
        "(line 2142,col 9)-(line 2142,col 43)",
        "(line 2143,col 9)-(line 2143,col 35)",
        "(line 2144,col 9)-(line 2144,col 51)",
        "(line 2147,col 9)-(line 2147,col 45)",
        "(line 2148,col 9)-(line 2148,col 47)",
        "(line 2149,col 9)-(line 2149,col 36)",
        "(line 2150,col 9)-(line 2150,col 24)",
        "(line 2175,col 9)-(line 2175,col 21)",
        "(line 2176,col 9)-(line 2176,col 21)",
        "(line 2179,col 9)-(line 2179,col 25)",
        "(line 2180,col 9)-(line 2180,col 25)",
        "(line 2181,col 9)-(line 2181,col 32)",
        "(line 2182,col 9)-(line 2182,col 14)",
        "(line 2183,col 9)-(line 2183,col 18)",
        "(line 2185,col 9)-(line 2185,col 26)",
        "(line 2186,col 9)-(line 2186,col 18)",
        "(line 2187,col 9)-(line 2187,col 25)",
        "(line 2188,col 9)-(line 2188,col 14)",
        "(line 2189,col 9)-(line 2189,col 18)",
        "(line 2191,col 9)-(line 2191,col 46)",
        "(line 2192,col 9)-(line 2192,col 70)",
        "(line 2194,col 9)-(line 2194,col 28)",
        "(line 2195,col 9)-(line 2195,col 38)",
        "(line 2199,col 9)-(line 2199,col 28)",
        "(line 2201,col 9)-(line 2201,col 26)",
        "(line 2202,col 9)-(line 2202,col 18)",
        "(line 2203,col 9)-(line 2203,col 25)",
        "(line 2204,col 9)-(line 2204,col 14)",
        "(line 2205,col 9)-(line 2205,col 18)",
        "(line 2207,col 9)-(line 2207,col 27)",
        "(line 2208,col 9)-(line 2208,col 18)",
        "(line 2209,col 9)-(line 2209,col 25)",
        "(line 2210,col 9)-(line 2210,col 14)",
        "(line 2211,col 9)-(line 2211,col 18)",
        "(line 2213,col 9)-(line 2213,col 62)",
        "(line 2214,col 9)-(line 2214,col 64)",
        "(line 2216,col 9)-(line 2216,col 28)",
        "(line 2217,col 9)-(line 2217,col 38)",
        "(line 2219,col 9)-(line 2223,col 9)",
        "(line 2236,col 9)-(line 2236,col 31)",
        "(line 2239,col 9)-(line 2239,col 34)",
        "(line 2240,col 9)-(line 2240,col 42)",
        "(line 2241,col 9)-(line 2241,col 34)",
        "(line 2243,col 9)-(line 2243,col 35)",
        "(line 2244,col 9)-(line 2244,col 44)",
        "(line 2245,col 9)-(line 2245,col 37)",
        "(line 2248,col 9)-(line 2248,col 85)",
        "(line 2249,col 9)-(line 2249,col 25)",
        "(line 2250,col 9)-(line 2250,col 42)",
        "(line 2252,col 9)-(line 2261,col 9)",
        "(line 2263,col 9)-(line 2263,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 2277,
      "end_line": 2487,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 2280,col 9)-(line 2280,col 49)",
        "(line 2281,col 9)-(line 2281,col 61)",
        "(line 2284,col 9)-(line 2284,col 38)",
        "(line 2285,col 9)-(line 2285,col 38)",
        "(line 2288,col 9)-(line 2288,col 19)",
        "(line 2289,col 9)-(line 2289,col 22)",
        "(line 2292,col 9)-(line 2292,col 19)",
        "(line 2293,col 9)-(line 2293,col 19)",
        "(line 2294,col 9)-(line 2294,col 19)",
        "(line 2295,col 9)-(line 2295,col 32)",
        "(line 2296,col 9)-(line 2296,col 42)",
        "(line 2298,col 9)-(line 2307,col 9)",
        "(line 2310,col 9)-(line 2310,col 31)",
        "(line 2311,col 9)-(line 2311,col 38)",
        "(line 2313,col 9)-(line 2313,col 30)",
        "(line 2314,col 9)-(line 2314,col 37)",
        "(line 2316,col 9)-(line 2316,col 24)",
        "(line 2317,col 9)-(line 2317,col 24)",
        "(line 2318,col 9)-(line 2318,col 24)",
        "(line 2319,col 9)-(line 2319,col 24)",
        "(line 2321,col 9)-(line 2321,col 37)",
        "(line 2322,col 9)-(line 2322,col 38)",
        "(line 2324,col 9)-(line 2324,col 55)",
        "(line 2325,col 9)-(line 2325,col 48)",
        "(line 2326,col 9)-(line 2326,col 60)",
        "(line 2329,col 9)-(line 2332,col 9)",
        "(line 2334,col 9)-(line 2334,col 50)",
        "(line 2335,col 9)-(line 2335,col 40)",
        "(line 2337,col 9)-(line 2337,col 35)",
        "(line 2338,col 9)-(line 2338,col 36)",
        "(line 2340,col 9)-(line 2340,col 52)",
        "(line 2343,col 9)-(line 2346,col 9)",
        "(line 2349,col 9)-(line 2349,col 25)",
        "(line 2350,col 9)-(line 2350,col 32)",
        "(line 2351,col 9)-(line 2351,col 19)",
        "(line 2352,col 9)-(line 2352,col 19)",
        "(line 2353,col 9)-(line 2353,col 19)",
        "(line 2356,col 9)-(line 2356,col 37)",
        "(line 2358,col 9)-(line 2358,col 50)",
        "(line 2359,col 9)-(line 2359,col 48)",
        "(line 2360,col 9)-(line 2360,col 20)",
        "(line 2361,col 9)-(line 2361,col 52)",
        "(line 2363,col 9)-(line 2366,col 9)",
        "(line 2369,col 9)-(line 2369,col 25)",
        "(line 2370,col 9)-(line 2370,col 32)",
        "(line 2372,col 9)-(line 2372,col 19)",
        "(line 2373,col 9)-(line 2373,col 19)",
        "(line 2374,col 9)-(line 2374,col 19)",
        "(line 2376,col 9)-(line 2376,col 40)",
        "(line 2388,col 9)-(line 2388,col 42)",
        "(line 2391,col 9)-(line 2391,col 20)",
        "(line 2392,col 9)-(line 2392,col 30)",
        "(line 2393,col 9)-(line 2393,col 20)",
        "(line 2396,col 9)-(line 2396,col 25)",
        "(line 2397,col 9)-(line 2397,col 32)",
        "(line 2399,col 9)-(line 2399,col 34)",
        "(line 2400,col 9)-(line 2400,col 41)",
        "(line 2402,col 9)-(line 2402,col 19)",
        "(line 2403,col 9)-(line 2403,col 19)",
        "(line 2404,col 9)-(line 2404,col 19)",
        "(line 2405,col 9)-(line 2405,col 19)",
        "(line 2407,col 9)-(line 2407,col 38)",
        "(line 2408,col 9)-(line 2408,col 39)",
        "(line 2410,col 9)-(line 2410,col 47)",
        "(line 2411,col 9)-(line 2411,col 40)",
        "(line 2412,col 9)-(line 2412,col 53)",
        "(line 2415,col 9)-(line 2418,col 9)",
        "(line 2420,col 9)-(line 2420,col 51)",
        "(line 2421,col 9)-(line 2421,col 40)",
        "(line 2423,col 9)-(line 2423,col 37)",
        "(line 2424,col 9)-(line 2424,col 38)",
        "(line 2426,col 9)-(line 2426,col 53)",
        "(line 2429,col 9)-(line 2432,col 9)",
        "(line 2435,col 9)-(line 2435,col 34)",
        "(line 2436,col 9)-(line 2436,col 41)",
        "(line 2437,col 9)-(line 2437,col 19)",
        "(line 2438,col 9)-(line 2438,col 19)",
        "(line 2439,col 9)-(line 2439,col 19)",
        "(line 2442,col 9)-(line 2442,col 37)",
        "(line 2444,col 9)-(line 2444,col 51)",
        "(line 2445,col 9)-(line 2445,col 48)",
        "(line 2446,col 9)-(line 2446,col 21)",
        "(line 2447,col 9)-(line 2447,col 53)",
        "(line 2449,col 9)-(line 2452,col 9)",
        "(line 2455,col 9)-(line 2455,col 25)",
        "(line 2456,col 9)-(line 2456,col 32)",
        "(line 2457,col 9)-(line 2457,col 34)",
        "(line 2458,col 9)-(line 2458,col 41)",
        "(line 2459,col 9)-(line 2459,col 19)",
        "(line 2460,col 9)-(line 2460,col 19)",
        "(line 2461,col 9)-(line 2461,col 19)",
        "(line 2464,col 9)-(line 2464,col 37)",
        "(line 2466,col 9)-(line 2466,col 51)",
        "(line 2467,col 9)-(line 2467,col 48)",
        "(line 2468,col 9)-(line 2468,col 21)",
        "(line 2469,col 9)-(line 2469,col 53)",
        "(line 2471,col 9)-(line 2474,col 9)",
        "(line 2477,col 9)-(line 2477,col 53)",
        "(line 2478,col 9)-(line 2478,col 98)",
        "(line 2480,col 9)-(line 2480,col 34)",
        "(line 2481,col 9)-(line 2481,col 44)",
        "(line 2484,col 9)-(line 2484,col 28)",
        "(line 2485,col 9)-(line 2485,col 31)",
        "(line 2486,col 9)-(line 2486,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sin(double)",
      "begin_line": 2494,
      "end_line": 2584,
      "comment": "\n     *  Sine function.\n     *  @param x a number\n     *  @return sin(x)\n     ",
      "child_ranges": [
        "(line 2495,col 9)-(line 2495,col 33)",
        "(line 2496,col 9)-(line 2496,col 25)",
        "(line 2497,col 9)-(line 2497,col 18)",
        "(line 2498,col 9)-(line 2498,col 24)",
        "(line 2501,col 9)-(line 2501,col 15)",
        "(line 2502,col 9)-(line 2505,col 9)",
        "(line 2508,col 9)-(line 2514,col 9)",
        "(line 2516,col 9)-(line 2518,col 9)",
        "(line 2521,col 9)-(line 2566,col 9)",
        "(line 2568,col 9)-(line 2570,col 9)",
        "(line 2572,col 9)-(line 2583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cos(double)",
      "begin_line": 2591,
      "end_line": 2668,
      "comment": "\n     *  Cosine function\n     *  @param x a number\n     *  @return cos(x)\n     ",
      "child_ranges": [
        "(line 2592,col 9)-(line 2592,col 25)",
        "(line 2595,col 9)-(line 2595,col 22)",
        "(line 2596,col 9)-(line 2598,col 9)",
        "(line 2600,col 9)-(line 2602,col 9)",
        "(line 2605,col 9)-(line 2605,col 22)",
        "(line 2606,col 9)-(line 2651,col 9)",
        "(line 2656,col 9)-(line 2667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tan(double)",
      "begin_line": 2675,
      "end_line": 2775,
      "comment": "\n     *   Tangent function\n     *  @param x a number\n     *  @return tan(x)\n     ",
      "child_ranges": [
        "(line 2676,col 9)-(line 2676,col 33)",
        "(line 2677,col 9)-(line 2677,col 25)",
        "(line 2680,col 9)-(line 2680,col 22)",
        "(line 2681,col 9)-(line 2684,col 9)",
        "(line 2687,col 9)-(line 2693,col 9)",
        "(line 2695,col 9)-(line 2697,col 9)",
        "(line 2700,col 9)-(line 2700,col 22)",
        "(line 2701,col 9)-(line 2746,col 9)",
        "(line 2748,col 9)-(line 2761,col 9)",
        "(line 2763,col 9)-(line 2763,col 22)",
        "(line 2764,col 9)-(line 2768,col 9)",
        "(line 2770,col 9)-(line 2772,col 9)",
        "(line 2774,col 9)-(line 2774,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double)",
      "begin_line": 2782,
      "end_line": 2784,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2783,col 9)-(line 2783,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2792,
      "end_line": 2934,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by {@code PI} if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2793,col 9)-(line 2793,col 31)",
        "(line 2794,col 9)-(line 2794,col 16)",
        "(line 2796,col 9)-(line 2798,col 9)",
        "(line 2800,col 9)-(line 2805,col 9)",
        "(line 2807,col 9)-(line 2809,col 9)",
        "(line 2812,col 9)-(line 2817,col 9)",
        "(line 2818,col 9)-(line 2818,col 48)",
        "(line 2819,col 9)-(line 2819,col 58)",
        "(line 2820,col 9)-(line 2820,col 42)",
        "(line 2822,col 9)-(line 2822,col 34)",
        "(line 2823,col 9)-(line 2823,col 37)",
        "(line 2824,col 9)-(line 2824,col 20)",
        "(line 2827,col 9)-(line 2827,col 33)",
        "(line 2828,col 9)-(line 2828,col 37)",
        "(line 2829,col 9)-(line 2829,col 33)",
        "(line 2830,col 9)-(line 2830,col 16)",
        "(line 2831,col 9)-(line 2831,col 17)",
        "(line 2834,col 9)-(line 2866,col 9)",
        "(line 2869,col 9)-(line 2869,col 18)",
        "(line 2870,col 9)-(line 2870,col 18)",
        "(line 2873,col 9)-(line 2873,col 33)",
        "(line 2884,col 9)-(line 2884,col 33)",
        "(line 2885,col 9)-(line 2885,col 47)",
        "(line 2886,col 9)-(line 2886,col 46)",
        "(line 2887,col 9)-(line 2887,col 46)",
        "(line 2888,col 9)-(line 2888,col 46)",
        "(line 2889,col 9)-(line 2889,col 47)",
        "(line 2890,col 9)-(line 2890,col 31)",
        "(line 2893,col 9)-(line 2893,col 18)",
        "(line 2895,col 9)-(line 2895,col 23)",
        "(line 2896,col 9)-(line 2896,col 31)",
        "(line 2897,col 9)-(line 2897,col 18)",
        "(line 2900,col 9)-(line 2900,col 41)",
        "(line 2902,col 9)-(line 2902,col 22)",
        "(line 2903,col 9)-(line 2903,col 23)",
        "(line 2906,col 9)-(line 2906,col 38)",
        "(line 2907,col 9)-(line 2907,col 46)",
        "(line 2908,col 9)-(line 2908,col 23)",
        "(line 2909,col 9)-(line 2909,col 32)",
        "(line 2910,col 9)-(line 2910,col 18)",
        "(line 2912,col 9)-(line 2912,col 25)",
        "(line 2913,col 9)-(line 2913,col 38)",
        "(line 2915,col 9)-(line 2926,col 9)",
        "(line 2929,col 9)-(line 2931,col 9)",
        "(line 2933,col 9)-(line 2933,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan2(double, double)",
      "begin_line": 2942,
      "end_line": 3057,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between {@code -PI} and {@code PI}\n     ",
      "child_ranges": [
        "(line 2943,col 9)-(line 2945,col 9)",
        "(line 2947,col 9)-(line 2969,col 9)",
        "(line 2973,col 9)-(line 2983,col 9)",
        "(line 2985,col 9)-(line 2995,col 9)",
        "(line 2997,col 9)-(line 3005,col 9)",
        "(line 3007,col 9)-(line 3016,col 9)",
        "(line 3020,col 9)-(line 3028,col 9)",
        "(line 3031,col 9)-(line 3031,col 29)",
        "(line 3032,col 9)-(line 3034,col 9)",
        "(line 3036,col 9)-(line 3036,col 38)",
        "(line 3037,col 9)-(line 3037,col 27)",
        "(line 3040,col 9)-(line 3040,col 44)",
        "(line 3041,col 9)-(line 3041,col 33)",
        "(line 3043,col 9)-(line 3043,col 62)",
        "(line 3045,col 9)-(line 3045,col 30)",
        "(line 3046,col 9)-(line 3046,col 31)",
        "(line 3047,col 9)-(line 3047,col 18)",
        "(line 3049,col 9)-(line 3051,col 9)",
        "(line 3054,col 9)-(line 3054,col 44)",
        "(line 3056,col 9)-(line 3056,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asin(double)",
      "begin_line": 3063,
      "end_line": 3133,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 3064,col 7)-(line 3066,col 7)",
        "(line 3068,col 7)-(line 3070,col 7)",
        "(line 3072,col 7)-(line 3074,col 7)",
        "(line 3076,col 7)-(line 3078,col 7)",
        "(line 3080,col 7)-(line 3082,col 7)",
        "(line 3087,col 7)-(line 3087,col 37)",
        "(line 3088,col 7)-(line 3088,col 40)",
        "(line 3089,col 7)-(line 3089,col 31)",
        "(line 3092,col 7)-(line 3092,col 24)",
        "(line 3093,col 7)-(line 3093,col 36)",
        "(line 3096,col 7)-(line 3096,col 15)",
        "(line 3097,col 7)-(line 3097,col 15)",
        "(line 3099,col 7)-(line 3099,col 27)",
        "(line 3100,col 7)-(line 3100,col 35)",
        "(line 3102,col 7)-(line 3102,col 21)",
        "(line 3103,col 7)-(line 3103,col 30)",
        "(line 3104,col 7)-(line 3104,col 16)",
        "(line 3107,col 7)-(line 3107,col 15)",
        "(line 3108,col 7)-(line 3108,col 19)",
        "(line 3109,col 7)-(line 3109,col 30)",
        "(line 3110,col 7)-(line 3110,col 27)",
        "(line 3111,col 7)-(line 3111,col 18)",
        "(line 3114,col 7)-(line 3114,col 53)",
        "(line 3117,col 7)-(line 3117,col 31)",
        "(line 3120,col 7)-(line 3120,col 21)",
        "(line 3121,col 7)-(line 3121,col 30)",
        "(line 3122,col 7)-(line 3122,col 34)",
        "(line 3123,col 7)-(line 3123,col 25)",
        "(line 3125,col 7)-(line 3125,col 52)",
        "(line 3126,col 7)-(line 3126,col 28)",
        "(line 3128,col 7)-(line 3128,col 21)",
        "(line 3129,col 7)-(line 3129,col 29)",
        "(line 3130,col 7)-(line 3130,col 16)",
        "(line 3132,col 7)-(line 3132,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acos(double)",
      "begin_line": 3139,
      "end_line": 3215,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 3140,col 7)-(line 3142,col 7)",
        "(line 3144,col 7)-(line 3146,col 7)",
        "(line 3148,col 7)-(line 3150,col 7)",
        "(line 3152,col 7)-(line 3154,col 7)",
        "(line 3156,col 7)-(line 3158,col 7)",
        "(line 3163,col 7)-(line 3163,col 37)",
        "(line 3164,col 7)-(line 3164,col 40)",
        "(line 3165,col 7)-(line 3165,col 31)",
        "(line 3168,col 7)-(line 3168,col 24)",
        "(line 3169,col 7)-(line 3169,col 36)",
        "(line 3172,col 7)-(line 3172,col 15)",
        "(line 3173,col 7)-(line 3173,col 15)",
        "(line 3175,col 7)-(line 3175,col 27)",
        "(line 3176,col 7)-(line 3176,col 35)",
        "(line 3178,col 7)-(line 3178,col 21)",
        "(line 3179,col 7)-(line 3179,col 30)",
        "(line 3180,col 7)-(line 3180,col 16)",
        "(line 3183,col 7)-(line 3183,col 26)",
        "(line 3184,col 7)-(line 3184,col 30)",
        "(line 3185,col 7)-(line 3185,col 27)",
        "(line 3186,col 7)-(line 3186,col 18)",
        "(line 3189,col 7)-(line 3189,col 53)",
        "(line 3192,col 7)-(line 3192,col 25)",
        "(line 3193,col 7)-(line 3193,col 16)",
        "(line 3194,col 7)-(line 3194,col 26)",
        "(line 3197,col 7)-(line 3197,col 21)",
        "(line 3200,col 7)-(line 3202,col 7)",
        "(line 3204,col 7)-(line 3204,col 36)",
        "(line 3205,col 7)-(line 3205,col 25)",
        "(line 3207,col 7)-(line 3207,col 52)",
        "(line 3208,col 7)-(line 3208,col 19)",
        "(line 3210,col 7)-(line 3210,col 21)",
        "(line 3211,col 7)-(line 3211,col 29)",
        "(line 3212,col 7)-(line 3212,col 16)",
        "(line 3214,col 7)-(line 3214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cbrt(double)",
      "begin_line": 3221,
      "end_line": 3299,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 3223,col 7)-(line 3223,col 47)",
        "(line 3224,col 7)-(line 3224,col 59)",
        "(line 3225,col 7)-(line 3225,col 32)",
        "(line 3227,col 7)-(line 3237,col 7)",
        "(line 3239,col 7)-(line 3242,col 7)",
        "(line 3245,col 7)-(line 3245,col 30)",
        "(line 3248,col 7)-(line 3249,col 81)",
        "(line 3252,col 7)-(line 3252,col 104)",
        "(line 3255,col 7)-(line 3255,col 41)",
        "(line 3256,col 7)-(line 3256,col 44)",
        "(line 3257,col 7)-(line 3257,col 45)",
        "(line 3258,col 7)-(line 3258,col 44)",
        "(line 3259,col 7)-(line 3259,col 44)",
        "(line 3261,col 7)-(line 3261,col 39)",
        "(line 3266,col 7)-(line 3266,col 39)",
        "(line 3267,col 7)-(line 3267,col 46)",
        "(line 3268,col 7)-(line 3268,col 46)",
        "(line 3271,col 7)-(line 3271,col 39)",
        "(line 3272,col 7)-(line 3272,col 36)",
        "(line 3273,col 7)-(line 3273,col 27)",
        "(line 3275,col 7)-(line 3275,col 26)",
        "(line 3276,col 7)-(line 3276,col 42)",
        "(line 3277,col 7)-(line 3277,col 31)",
        "(line 3278,col 7)-(line 3278,col 38)",
        "(line 3279,col 7)-(line 3279,col 23)",
        "(line 3280,col 7)-(line 3280,col 17)",
        "(line 3282,col 7)-(line 3282,col 39)",
        "(line 3283,col 7)-(line 3283,col 19)",
        "(line 3285,col 7)-(line 3285,col 26)",
        "(line 3286,col 7)-(line 3286,col 34)",
        "(line 3287,col 7)-(line 3287,col 15)",
        "(line 3289,col 7)-(line 3289,col 33)",
        "(line 3292,col 7)-(line 3292,col 16)",
        "(line 3294,col 7)-(line 3296,col 7)",
        "(line 3298,col 7)-(line 3298,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toRadians(double)",
      "begin_line": 3306,
      "end_line": 3324,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 3308,col 9)-(line 3310,col 9)",
        "(line 3313,col 9)-(line 3313,col 49)",
        "(line 3314,col 9)-(line 3314,col 50)",
        "(line 3316,col 9)-(line 3316,col 38)",
        "(line 3317,col 9)-(line 3317,col 27)",
        "(line 3319,col 9)-(line 3319,col 74)",
        "(line 3320,col 9)-(line 3322,col 9)",
        "(line 3323,col 9)-(line 3323,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toDegrees(double)",
      "begin_line": 3331,
      "end_line": 3345,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 3333,col 9)-(line 3335,col 9)",
        "(line 3338,col 9)-(line 3338,col 46)",
        "(line 3339,col 9)-(line 3339,col 50)",
        "(line 3341,col 9)-(line 3341,col 38)",
        "(line 3342,col 9)-(line 3342,col 27)",
        "(line 3344,col 9)-(line 3344,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(int)",
      "begin_line": 3352,
      "end_line": 3354,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3353,col 9)-(line 3353,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(long)",
      "begin_line": 3361,
      "end_line": 3363,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3362,col 9)-(line 3362,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(float)",
      "begin_line": 3370,
      "end_line": 3372,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3371,col 9)-(line 3371,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(double)",
      "begin_line": 3379,
      "end_line": 3381,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3380,col 9)-(line 3380,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(double)",
      "begin_line": 3388,
      "end_line": 3393,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3389,col 9)-(line 3391,col 9)",
        "(line 3392,col 9)-(line 3392,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(float)",
      "begin_line": 3400,
      "end_line": 3405,
      "comment": "\n     * Compute least significant bit (Unit in Last Position) for a number.\n     * @param x number from which ulp is requested\n     * @return ulp(x)\n     ",
      "child_ranges": [
        "(line 3401,col 9)-(line 3403,col 9)",
        "(line 3404,col 9)-(line 3404,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(double, int)",
      "begin_line": 3413,
      "end_line": 3489,
      "comment": "\n     * Multiply a double number by a power of 2.\n     * @param d number to multiply\n     * @param n power of 2\n     * @return d \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3416,col 9)-(line 3418,col 9)",
        "(line 3421,col 9)-(line 3423,col 9)",
        "(line 3424,col 9)-(line 3426,col 9)",
        "(line 3427,col 9)-(line 3429,col 9)",
        "(line 3432,col 9)-(line 3432,col 53)",
        "(line 3433,col 9)-(line 3433,col 53)",
        "(line 3434,col 9)-(line 3434,col 56)",
        "(line 3435,col 9)-(line 3435,col 53)",
        "(line 3438,col 9)-(line 3438,col 42)",
        "(line 3440,col 9)-(line 3487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.scalb(float, int)",
      "begin_line": 3497,
      "end_line": 3573,
      "comment": "\n     * Multiply a float number by a power of 2.\n     * @param f number to multiply\n     * @param n power of 2\n     * @return f \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 3500,col 9)-(line 3502,col 9)",
        "(line 3505,col 9)-(line 3507,col 9)",
        "(line 3508,col 9)-(line 3510,col 9)",
        "(line 3511,col 9)-(line 3513,col 9)",
        "(line 3516,col 9)-(line 3516,col 49)",
        "(line 3517,col 9)-(line 3517,col 43)",
        "(line 3518,col 9)-(line 3518,col 46)",
        "(line 3519,col 9)-(line 3519,col 43)",
        "(line 3522,col 9)-(line 3522,col 42)",
        "(line 3524,col 9)-(line 3571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(double, double)",
      "begin_line": 3606,
      "end_line": 3629,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code d},\n     * the smallest machine representable number strictly greater than\n     * {@code d} is returned; if less, then the largest representable number\n     * strictly less than {@code d} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code d} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code d})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3609,col 9)-(line 3617,col 9)",
        "(line 3621,col 9)-(line 3621,col 53)",
        "(line 3622,col 9)-(line 3622,col 53)",
        "(line 3623,col 9)-(line 3627,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(float, double)",
      "begin_line": 3662,
      "end_line": 3685,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * The ordering is as follows (increasing):\n     * \u003cul\u003e\n     * \u003cli\u003e-INFINITY\u003c/li\u003e\n     * \u003cli\u003e-MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e-MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e-0.0\u003c/li\u003e\n     * \u003cli\u003e+0.0\u003c/li\u003e\n     * \u003cli\u003e+MIN_VALUE\u003c/li\u003e\n     * \u003cli\u003e+MAX_VALUE\u003c/li\u003e\n     * \u003cli\u003e+INFINITY\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003cp\u003e\n     * If arguments compare equal, then the second argument is returned.\n     * \u003cp\u003e\n     * If {@code direction} is greater than {@code f},\n     * the smallest machine representable number strictly greater than\n     * {@code f} is returned; if less, then the largest representable number\n     * strictly less than {@code f} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If {@code f} is infinite and direction does not\n     * bring it back to finite numbers, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param f base number\n     * @param direction (the only important thing is whether\n     * {@code direction} is greater or smaller than {@code f})\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3665,col 9)-(line 3673,col 9)",
        "(line 3677,col 9)-(line 3677,col 49)",
        "(line 3678,col 9)-(line 3678,col 43)",
        "(line 3679,col 9)-(line 3683,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.floor(double)",
      "begin_line": 3691,
      "end_line": 3712,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3692,col 9)-(line 3692,col 15)",
        "(line 3694,col 9)-(line 3696,col 9)",
        "(line 3698,col 9)-(line 3700,col 9)",
        "(line 3702,col 9)-(line 3702,col 21)",
        "(line 3703,col 9)-(line 3705,col 9)",
        "(line 3707,col 9)-(line 3709,col 9)",
        "(line 3711,col 9)-(line 3711,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ceil(double)",
      "begin_line": 3718,
      "end_line": 3737,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3719,col 9)-(line 3719,col 17)",
        "(line 3721,col 9)-(line 3723,col 9)",
        "(line 3725,col 9)-(line 3725,col 21)",
        "(line 3726,col 9)-(line 3728,col 9)",
        "(line 3730,col 9)-(line 3730,col 17)",
        "(line 3732,col 9)-(line 3734,col 9)",
        "(line 3736,col 9)-(line 3736,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.rint(double)",
      "begin_line": 3743,
      "end_line": 3760,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3744,col 9)-(line 3744,col 28)",
        "(line 3745,col 9)-(line 3745,col 25)",
        "(line 3747,col 9)-(line 3752,col 9)",
        "(line 3753,col 9)-(line 3755,col 9)",
        "(line 3758,col 9)-(line 3758,col 26)",
        "(line 3759,col 9)-(line 3759,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(double)",
      "begin_line": 3766,
      "end_line": 3768,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3767,col 9)-(line 3767,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(float)",
      "begin_line": 3774,
      "end_line": 3776,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3775,col 9)-(line 3775,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(int, int)",
      "begin_line": 3783,
      "end_line": 3785,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3784,col 9)-(line 3784,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(long, long)",
      "begin_line": 3792,
      "end_line": 3794,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3793,col 9)-(line 3793,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(float, float)",
      "begin_line": 3801,
      "end_line": 3819,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3802,col 9)-(line 3804,col 9)",
        "(line 3805,col 9)-(line 3807,col 9)",
        "(line 3809,col 9)-(line 3811,col 9)",
        "(line 3814,col 9)-(line 3814,col 46)",
        "(line 3815,col 9)-(line 3817,col 9)",
        "(line 3818,col 9)-(line 3818,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(double, double)",
      "begin_line": 3826,
      "end_line": 3844,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3827,col 9)-(line 3829,col 9)",
        "(line 3830,col 9)-(line 3832,col 9)",
        "(line 3834,col 9)-(line 3836,col 9)",
        "(line 3839,col 9)-(line 3839,col 50)",
        "(line 3840,col 9)-(line 3842,col 9)",
        "(line 3843,col 9)-(line 3843,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(int, int)",
      "begin_line": 3851,
      "end_line": 3853,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3852,col 9)-(line 3852,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(long, long)",
      "begin_line": 3860,
      "end_line": 3862,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3861,col 9)-(line 3861,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(float, float)",
      "begin_line": 3869,
      "end_line": 3887,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3870,col 9)-(line 3872,col 9)",
        "(line 3873,col 9)-(line 3875,col 9)",
        "(line 3877,col 9)-(line 3879,col 9)",
        "(line 3882,col 9)-(line 3882,col 46)",
        "(line 3883,col 9)-(line 3885,col 9)",
        "(line 3886,col 9)-(line 3886,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(double, double)",
      "begin_line": 3894,
      "end_line": 3912,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3895,col 9)-(line 3897,col 9)",
        "(line 3898,col 9)-(line 3900,col 9)",
        "(line 3902,col 9)-(line 3904,col 9)",
        "(line 3907,col 9)-(line 3907,col 50)",
        "(line 3908,col 9)-(line 3910,col 9)",
        "(line 3911,col 9)-(line 3911,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.hypot(double, double)",
      "begin_line": 3928,
      "end_line": 3961,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     ",
      "child_ranges": [
        "(line 3929,col 9)-(line 3960,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.IEEEremainder(double, double)",
      "begin_line": 3983,
      "end_line": 3985,
      "comment": "\n     * Computes the remainder as prescribed by the IEEE 754 standard.\n     * The remainder value is mathematically equal to {@code x - y*n}\n     * where {@code n} is the mathematical integer closest to the exact mathematical value\n     * of the quotient {@code x/y}.\n     * If two mathematical integers are equally close to {@code x/y} then\n     * {@code n} is the integer that is even.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eIf either operand is NaN, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the result is not NaN, the sign of the result equals the sign of the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is finite and the divisor is an infinity, the result equals the dividend.\u003c/li\u003e\n     * \u003cli\u003eIf the dividend is a zero and the divisor is finite, the result equals the dividend.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e this implementation currently delegates to {@link StrictMath#IEEEremainder}\n     * @param dividend the number to be divided\n     * @param divisor the number by which to divide\n     * @return the remainder, rounded\n     ",
      "child_ranges": [
        "(line 3984,col 9)-(line 3984,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(double, double)",
      "begin_line": 3995,
      "end_line": 4002,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 3996,col 9)-(line 3996,col 52)",
        "(line 3997,col 9)-(line 3997,col 47)",
        "(line 3998,col 9)-(line 4000,col 9)",
        "(line 4001,col 9)-(line 4001,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.copySign(float, float)",
      "begin_line": 4012,
      "end_line": 4019,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param magnitude the value to return\n     * @param sign the sign for the returned value\n     * @return the magnitude with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 4013,col 9)-(line 4013,col 48)",
        "(line 4014,col 9)-(line 4014,col 43)",
        "(line 4015,col 9)-(line 4017,col 9)",
        "(line 4018,col 9)-(line 4018,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(double)",
      "begin_line": 4030,
      "end_line": 4032,
      "comment": "\n     * Return the exponent of a double number, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param d number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 4031,col 9)-(line 4031,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.getExponent(float)",
      "begin_line": 4043,
      "end_line": 4045,
      "comment": "\n     * Return the exponent of a float number, removing the bias.\n     * \u003cp\u003e\n     * For float numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @param f number from which exponent is requested\n     * @return exponent for d in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 4044,col 9)-(line 4044,col 63)"
      ]
    }
  ]
}