{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 3494,
      "comment": "\n * Faster, more accurate, portable alternative to StrictMath.\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "PI"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " Archimede\u0027s constant PI, ratio of circle circumference to diameter. "
    },
    {
      "type": "field",
      "varNames": [
        "E"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Napier\u0027s constant e, base of the natural logarithm. "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_A"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + 750] + expIntTableB[x+750].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_INT_TABLE_B"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Exponential evaluated at integer values,\n     * exp(x) \u003d  expIntTableA[x + 750] + expIntTableB[x+750]\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_A"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXP_FRAC_TABLE_B"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Exponential over the range of 0 - 1 in increments of 2^-10\n     * exp(x/1024) \u003d  expFracTableA[x] + expFracTableB[x].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FACT"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Factorial table, for Taylor series expansions. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_MANT"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Extended precision logarithm table over the range 1 - 2 in increments of 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_A"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " log(2) (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_2_B"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " log(2) (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "LN_SPLIT_COEF"
      ],
      "begin_line": 65,
      "end_line": 82,
      "comment": " Coefficients for slowLog. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_QUICK_COEF"
      ],
      "begin_line": 85,
      "end_line": 95,
      "comment": " Coefficients for log, when input 0.99 \u003c x \u003c 1.01. "
    },
    {
      "type": "field",
      "varNames": [
        "LN_HI_PREC_COEF"
      ],
      "begin_line": 98,
      "end_line": 105,
      "comment": " Coefficients for log in the range of 1.0 \u003c x \u003c 1.0 + 2^-10. "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_A"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Sine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "SINE_TABLE_B"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Sine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_A"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Cosine table (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "COSINE_TABLE_B"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Cosine table (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_A"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Tangent table, used by atan() (high bits). "
    },
    {
      "type": "field",
      "varNames": [
        "TANGENT_TABLE_B"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Tangent table, used by atan() (low bits). "
    },
    {
      "type": "field",
      "varNames": [
        "RECIP_2PI"
      ],
      "begin_line": 126,
      "end_line": 144,
      "comment": " Bits of 1/(2*pi), need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "PI_O_4_BITS"
      ],
      "begin_line": 147,
      "end_line": 149,
      "comment": " Bits of pi/4, need for reducePayneHanek(). "
    },
    {
      "type": "field",
      "varNames": [
        "EIGHTHES"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Eighths.\n     * This is used by sinQ, because its faster to do a table lookup than\n     * a multiply in this time-critical routine\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CBRTTWO"
      ],
      "begin_line": 158,
      "end_line": 162,
      "comment": " Table of 2^((n+2)/3) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.FastMath.FastMath()",
      "begin_line": 211,
      "end_line": 212,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sqrt(double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": " Compute the square root of a number.\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosh(double)",
      "begin_line": 226,
      "end_line": 274,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic cosine of x\n     ",
      "child_ranges": [
        "(line 227,col 7)-(line 229,col 7)",
        "(line 231,col 7)-(line 233,col 7)",
        "(line 235,col 7)-(line 237,col 7)",
        "(line 239,col 7)-(line 239,col 38)",
        "(line 240,col 7)-(line 242,col 7)",
        "(line 243,col 7)-(line 243,col 26)",
        "(line 245,col 7)-(line 245,col 40)",
        "(line 246,col 7)-(line 246,col 48)",
        "(line 248,col 7)-(line 248,col 38)",
        "(line 249,col 7)-(line 249,col 36)",
        "(line 250,col 7)-(line 250,col 28)",
        "(line 253,col 7)-(line 253,col 28)",
        "(line 254,col 7)-(line 254,col 34)",
        "(line 255,col 7)-(line 255,col 42)",
        "(line 256,col 7)-(line 256,col 37)",
        "(line 259,col 7)-(line 259,col 82)",
        "(line 261,col 7)-(line 261,col 36)",
        "(line 264,col 7)-(line 264,col 25)",
        "(line 265,col 7)-(line 265,col 34)",
        "(line 266,col 7)-(line 266,col 16)",
        "(line 267,col 7)-(line 267,col 25)",
        "(line 268,col 7)-(line 268,col 34)",
        "(line 269,col 7)-(line 269,col 16)",
        "(line 271,col 7)-(line 271,col 30)",
        "(line 272,col 7)-(line 272,col 20)",
        "(line 273,col 7)-(line 273,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinh(double)",
      "begin_line": 280,
      "end_line": 384,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic sine of x\n     ",
      "child_ranges": [
        "(line 281,col 7)-(line 281,col 29)",
        "(line 282,col 7)-(line 284,col 7)",
        "(line 286,col 7)-(line 288,col 7)",
        "(line 290,col 7)-(line 292,col 7)",
        "(line 294,col 7)-(line 296,col 7)",
        "(line 298,col 7)-(line 301,col 7)",
        "(line 303,col 7)-(line 303,col 20)",
        "(line 305,col 7)-(line 377,col 7)",
        "(line 379,col 7)-(line 381,col 7)",
        "(line 383,col 7)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanh(double)",
      "begin_line": 390,
      "end_line": 502,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param x number on which evaluation is done\n     * @return hyperbolic tangent of x\n     ",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 29)",
        "(line 393,col 7)-(line 395,col 7)",
        "(line 397,col 7)-(line 399,col 7)",
        "(line 401,col 7)-(line 403,col 7)",
        "(line 405,col 7)-(line 407,col 7)",
        "(line 409,col 7)-(line 412,col 7)",
        "(line 414,col 7)-(line 414,col 20)",
        "(line 415,col 7)-(line 495,col 7)",
        "(line 497,col 7)-(line 499,col 7)",
        "(line 501,col 7)-(line 501,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acosh(double)",
      "begin_line": 508,
      "end_line": 510,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asinh(double)",
      "begin_line": 516,
      "end_line": 542,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 33)",
        "(line 519,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 524,col 24)",
        "(line 525,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 540,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atanh(double)",
      "begin_line": 548,
      "end_line": 574,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 33)",
        "(line 551,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 24)",
        "(line 557,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(double)",
      "begin_line": 581,
      "end_line": 583,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1, 0, +1 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(double)",
      "begin_line": 589,
      "end_line": 591,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.random()",
      "begin_line": 596,
      "end_line": 598,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double, double, double[])",
      "begin_line": 631,
      "end_line": 746,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 24)",
        "(line 633,col 9)-(line 633,col 24)",
        "(line 634,col 9)-(line 634,col 19)",
        "(line 640,col 9)-(line 690,col 9)",
        "(line 696,col 9)-(line 696,col 58)",
        "(line 697,col 9)-(line 697,col 59)",
        "(line 698,col 9)-(line 698,col 59)",
        "(line 704,col 9)-(line 704,col 63)",
        "(line 713,col 9)-(line 713,col 39)",
        "(line 714,col 9)-(line 714,col 45)",
        "(line 715,col 9)-(line 715,col 45)",
        "(line 716,col 9)-(line 716,col 30)",
        "(line 717,col 9)-(line 717,col 49)",
        "(line 724,col 9)-(line 724,col 44)",
        "(line 725,col 9)-(line 725,col 90)",
        "(line 731,col 9)-(line 731,col 43)",
        "(line 732,col 9)-(line 732,col 28)",
        "(line 733,col 9)-(line 737,col 9)",
        "(line 739,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 745,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double)",
      "begin_line": 752,
      "end_line": 754,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 753,col 7)-(line 753,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double, double[])",
      "begin_line": 761,
      "end_line": 901,
      "comment": " Internal helper method for expm1\n     * @param x number to compute shifted exponential\n     * @param hiPrecOut receive high precision result for -1.0 \u003c x \u003c 1.0\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 779,col 9)",
        "(line 781,col 9)-(line 781,col 21)",
        "(line 782,col 9)-(line 782,col 21)",
        "(line 783,col 9)-(line 783,col 23)",
        "(line 784,col 9)-(line 784,col 33)",
        "(line 786,col 9)-(line 789,col 9)",
        "(line 791,col 9)-(line 805,col 9)",
        "(line 809,col 9)-(line 809,col 41)",
        "(line 810,col 9)-(line 810,col 49)",
        "(line 811,col 9)-(line 811,col 48)",
        "(line 812,col 9)-(line 812,col 48)",
        "(line 813,col 9)-(line 813,col 26)",
        "(line 814,col 9)-(line 814,col 26)",
        "(line 816,col 9)-(line 816,col 28)",
        "(line 817,col 9)-(line 817,col 30)",
        "(line 818,col 9)-(line 818,col 31)",
        "(line 819,col 9)-(line 819,col 18)",
        "(line 821,col 9)-(line 821,col 33)",
        "(line 822,col 9)-(line 822,col 32)",
        "(line 823,col 9)-(line 823,col 24)",
        "(line 824,col 9)-(line 824,col 18)",
        "(line 827,col 9)-(line 827,col 31)",
        "(line 829,col 9)-(line 829,col 31)",
        "(line 830,col 9)-(line 830,col 46)",
        "(line 831,col 9)-(line 831,col 18)",
        "(line 833,col 9)-(line 833,col 31)",
        "(line 834,col 9)-(line 834,col 40)",
        "(line 835,col 9)-(line 835,col 18)",
        "(line 837,col 9)-(line 837,col 31)",
        "(line 838,col 9)-(line 838,col 38)",
        "(line 839,col 9)-(line 839,col 18)",
        "(line 843,col 9)-(line 843,col 26)",
        "(line 844,col 9)-(line 844,col 35)",
        "(line 845,col 9)-(line 845,col 18)",
        "(line 847,col 9)-(line 847,col 23)",
        "(line 849,col 9)-(line 849,col 32)",
        "(line 850,col 9)-(line 850,col 18)",
        "(line 852,col 9)-(line 852,col 26)",
        "(line 854,col 9)-(line 854,col 35)",
        "(line 855,col 9)-(line 855,col 18)",
        "(line 857,col 9)-(line 857,col 23)",
        "(line 859,col 9)-(line 859,col 32)",
        "(line 860,col 9)-(line 860,col 18)",
        "(line 862,col 9)-(line 893,col 9)",
        "(line 895,col 9)-(line 898,col 9)",
        "(line 900,col 9)-(line 900,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowexp(double, double[])",
      "begin_line": 910,
      "end_line": 937,
      "comment": "\n     *  For x between 0 and 1, returns exp(x), uses extended precision\n     *  @param x argument of exponential\n     *  @param result placeholder where to place exp(x) split in two terms\n     *  for extra precision (i.e. exp(x) \u003d result[0] ° result[1]\n     *  @return exp(x)\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 42)",
        "(line 912,col 9)-(line 912,col 42)",
        "(line 913,col 9)-(line 913,col 45)",
        "(line 914,col 9)-(line 914,col 42)",
        "(line 915,col 9)-(line 915,col 21)",
        "(line 916,col 9)-(line 916,col 28)",
        "(line 918,col 9)-(line 929,col 9)",
        "(line 931,col 9)-(line 934,col 9)",
        "(line 936,col 9)-(line 936,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.split(double, double[])",
      "begin_line": 944,
      "end_line": 954,
      "comment": " Compute split[0], split[1] such that their sum is equal to d,\n     * and split[0] has its 30 least significant bits as zero.\n     * @param d number to split\n     * @param split placeholder where to place the result\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 953,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.resplit(double[])",
      "begin_line": 960,
      "end_line": 973,
      "comment": " Recompute a split.\n     * @param a input/out array containing the split, changed\n     * on output\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 37)",
        "(line 962,col 9)-(line 962,col 44)",
        "(line 964,col 9)-(line 972,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitMult(double[], double[], double[])",
      "begin_line": 980,
      "end_line": 986,
      "comment": " Multiply two numbers in split form.\n     * @param a first term of multiplication\n     * @param b second term of multiplication\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 29)",
        "(line 982,col 9)-(line 982,col 57)",
        "(line 985,col 9)-(line 985,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitAdd(double[], double[], double[])",
      "begin_line": 993,
      "end_line": 998,
      "comment": " Add two numbers in split form.\n     * @param a first term of addition\n     * @param b second term of addition\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 29)",
        "(line 995,col 9)-(line 995,col 29)",
        "(line 997,col 9)-(line 997,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitReciprocal(double[], double[])",
      "begin_line": 1018,
      "end_line": 1046,
      "comment": " Compute the reciprocal of in.  Use the following algorithm.\n     *  in \u003d c + d.\n     *  want to find x + y such that x+y \u003d 1/(c+d) and x is much\n     *  larger than y and x has several zero bits on the right.\n     *\n     *  Set b \u003d 1/(2^22),  a \u003d 1 - b.  Thus (a+b) \u003d 1.\n     *  Use following identity to compute (a+b)/(c+d)\n     *\n     *  (a+b)/(c+d)  \u003d   a/c   +    (bc - ad) / (c^2 + cd)\n     *  set x \u003d a/c  and y \u003d (bc - ad) / (c^2 + cd)\n     *  This will be close to the right answer, but there will be\n     *  some rounding in the calculation of X.  So by carefully\n     *  computing 1 - (c+d)(x+y) we can compute an error and\n     *  add that back in.   This is done carefully so that terms\n     *  of similar size are subtracted first.\n     *  @param in initial number, in split form\n     *  @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 39)",
        "(line 1020,col 9)-(line 1020,col 33)",
        "(line 1022,col 9)-(line 1025,col 9)",
        "(line 1027,col 9)-(line 1027,col 30)",
        "(line 1028,col 9)-(line 1028,col 68)",
        "(line 1030,col 9)-(line 1032,col 9)",
        "(line 1035,col 9)-(line 1035,col 24)",
        "(line 1037,col 9)-(line 1045,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.quadMult(double[], double[], double[])",
      "begin_line": 1053,
      "end_line": 1100,
      "comment": " Compute (a[0] + a[1]) * (b[0] + b[1]) in extended precision.\n     * @param a first term of the multiplication\n     * @param b second term of the multiplication\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 42)",
        "(line 1055,col 9)-(line 1055,col 42)",
        "(line 1056,col 9)-(line 1056,col 42)",
        "(line 1059,col 9)-(line 1059,col 24)",
        "(line 1060,col 9)-(line 1060,col 24)",
        "(line 1061,col 9)-(line 1061,col 30)",
        "(line 1063,col 9)-(line 1063,col 26)",
        "(line 1064,col 9)-(line 1064,col 26)",
        "(line 1067,col 9)-(line 1067,col 24)",
        "(line 1068,col 9)-(line 1068,col 30)",
        "(line 1070,col 9)-(line 1070,col 39)",
        "(line 1071,col 9)-(line 1071,col 58)",
        "(line 1072,col 9)-(line 1072,col 24)",
        "(line 1073,col 9)-(line 1073,col 32)",
        "(line 1074,col 9)-(line 1074,col 58)",
        "(line 1075,col 9)-(line 1075,col 24)",
        "(line 1078,col 9)-(line 1078,col 24)",
        "(line 1079,col 9)-(line 1079,col 24)",
        "(line 1080,col 9)-(line 1080,col 30)",
        "(line 1082,col 9)-(line 1082,col 32)",
        "(line 1083,col 9)-(line 1083,col 58)",
        "(line 1084,col 9)-(line 1084,col 24)",
        "(line 1085,col 9)-(line 1085,col 32)",
        "(line 1086,col 9)-(line 1086,col 58)",
        "(line 1087,col 9)-(line 1087,col 24)",
        "(line 1090,col 9)-(line 1090,col 24)",
        "(line 1091,col 9)-(line 1091,col 24)",
        "(line 1092,col 9)-(line 1092,col 30)",
        "(line 1094,col 9)-(line 1094,col 32)",
        "(line 1095,col 9)-(line 1095,col 58)",
        "(line 1096,col 9)-(line 1096,col 24)",
        "(line 1097,col 9)-(line 1097,col 32)",
        "(line 1098,col 9)-(line 1098,col 58)",
        "(line 1099,col 9)-(line 1099,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expint(int, double[])",
      "begin_line": 1107,
      "end_line": 1145,
      "comment": " Compute exp(p) for a integer p in extended precision.\n     * @param p integer whose exponential is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return exp(p) in standard precision (equal to result[0] + result[1])\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 42)",
        "(line 1110,col 9)-(line 1110,col 42)",
        "(line 1111,col 9)-(line 1111,col 42)",
        "(line 1120,col 9)-(line 1120,col 34)",
        "(line 1121,col 9)-(line 1121,col 39)",
        "(line 1123,col 9)-(line 1123,col 23)",
        "(line 1125,col 9)-(line 1135,col 9)",
        "(line 1137,col 9)-(line 1142,col 9)",
        "(line 1144,col 9)-(line 1144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double)",
      "begin_line": 1154,
      "end_line": 1156,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1155,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double[])",
      "begin_line": 1164,
      "end_line": 1381,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 47)",
        "(line 1168,col 9)-(line 1176,col 9)",
        "(line 1179,col 9)-(line 1185,col 9)",
        "(line 1188,col 9)-(line 1188,col 41)",
        "(line 1190,col 9)-(line 1207,col 9)",
        "(line 1210,col 9)-(line 1255,col 9)",
        "(line 1258,col 9)-(line 1258,col 74)",
        "(line 1269,col 9)-(line 1269,col 111)",
        "(line 1271,col 9)-(line 1271,col 26)",
        "(line 1272,col 9)-(line 1272,col 26)",
        "(line 1274,col 9)-(line 1332,col 9)",
        "(line 1348,col 9)-(line 1348,col 30)",
        "(line 1349,col 9)-(line 1349,col 23)",
        "(line 1350,col 9)-(line 1350,col 28)",
        "(line 1351,col 9)-(line 1351,col 33)",
        "(line 1352,col 9)-(line 1352,col 14)",
        "(line 1353,col 9)-(line 1353,col 18)",
        "(line 1355,col 9)-(line 1355,col 21)",
        "(line 1356,col 9)-(line 1356,col 28)",
        "(line 1357,col 9)-(line 1357,col 14)",
        "(line 1358,col 9)-(line 1358,col 18)",
        "(line 1360,col 9)-(line 1360,col 27)",
        "(line 1361,col 9)-(line 1361,col 34)",
        "(line 1362,col 9)-(line 1362,col 14)",
        "(line 1363,col 9)-(line 1363,col 18)",
        "(line 1365,col 9)-(line 1365,col 23)",
        "(line 1366,col 9)-(line 1366,col 30)",
        "(line 1367,col 9)-(line 1367,col 14)",
        "(line 1368,col 9)-(line 1368,col 18)",
        "(line 1370,col 9)-(line 1370,col 21)",
        "(line 1371,col 9)-(line 1371,col 28)",
        "(line 1372,col 9)-(line 1372,col 14)",
        "(line 1373,col 9)-(line 1373,col 18)",
        "(line 1375,col 9)-(line 1378,col 9)",
        "(line 1380,col 9)-(line 1380,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log1p(double)",
      "begin_line": 1387,
      "end_line": 1420,
      "comment": " Compute log(1 + x).\n     * @param x a number\n     * @return log(1 + x)\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1388,col 29)",
        "(line 1389,col 9)-(line 1389,col 38)",
        "(line 1391,col 9)-(line 1393,col 9)",
        "(line 1395,col 9)-(line 1397,col 9)",
        "(line 1399,col 9)-(line 1412,col 9)",
        "(line 1415,col 9)-(line 1415,col 47)",
        "(line 1416,col 9)-(line 1416,col 24)",
        "(line 1417,col 9)-(line 1417,col 18)",
        "(line 1419,col 9)-(line 1419,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log10(double)",
      "begin_line": 1426,
      "end_line": 1439,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1427,col 9)-(line 1427,col 46)",
        "(line 1429,col 9)-(line 1429,col 23)",
        "(line 1431,col 9)-(line 1431,col 52)",
        "(line 1432,col 9)-(line 1432,col 49)",
        "(line 1433,col 9)-(line 1433,col 55)",
        "(line 1435,col 9)-(line 1435,col 49)",
        "(line 1436,col 9)-(line 1436,col 52)",
        "(line 1438,col 9)-(line 1438,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.pow(double, double)",
      "begin_line": 1448,
      "end_line": 1605,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1449,col 43)",
        "(line 1451,col 9)-(line 1453,col 9)",
        "(line 1455,col 9)-(line 1457,col 9)",
        "(line 1460,col 9)-(line 1487,col 9)",
        "(line 1489,col 9)-(line 1498,col 9)",
        "(line 1500,col 9)-(line 1509,col 9)",
        "(line 1511,col 9)-(line 1533,col 9)",
        "(line 1535,col 9)-(line 1546,col 9)",
        "(line 1549,col 9)-(line 1561,col 9)",
        "(line 1564,col 9)-(line 1564,col 18)",
        "(line 1565,col 9)-(line 1565,col 18)",
        "(line 1566,col 9)-(line 1575,col 9)",
        "(line 1578,col 9)-(line 1578,col 20)",
        "(line 1579,col 9)-(line 1579,col 28)",
        "(line 1580,col 9)-(line 1580,col 28)",
        "(line 1583,col 9)-(line 1583,col 41)",
        "(line 1584,col 9)-(line 1584,col 40)",
        "(line 1585,col 9)-(line 1585,col 26)",
        "(line 1586,col 9)-(line 1586,col 19)",
        "(line 1589,col 9)-(line 1589,col 35)",
        "(line 1590,col 9)-(line 1590,col 57)",
        "(line 1592,col 9)-(line 1592,col 20)",
        "(line 1593,col 9)-(line 1593,col 31)",
        "(line 1595,col 9)-(line 1595,col 31)",
        "(line 1596,col 9)-(line 1596,col 35)",
        "(line 1597,col 9)-(line 1597,col 34)",
        "(line 1598,col 9)-(line 1598,col 26)",
        "(line 1599,col 9)-(line 1599,col 26)",
        "(line 1600,col 9)-(line 1600,col 20)",
        "(line 1602,col 9)-(line 1602,col 48)",
        "(line 1604,col 9)-(line 1604,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowLog(double)",
      "begin_line": 1626,
      "end_line": 1668,
      "comment": " xi in the range of [1, 2].\n     *                                3        5        7\n     *      x+1           /          x        x        x          \\\n     *  ln ----- \u003d   2 *  |  x  +   ----  +  ----  +  ---- + ...  |\n     *      1-x           \\          3        5        7          /\n     *\n     * So, compute a Remez approximation of the following function\n     *\n     *  ln ((sqrt(x)+1)/(1-sqrt(x)))  /  x\n     *\n     * This will be an even function with only positive coefficents.\n     * x is in the range [0 - 1/3].\n     *\n     * Transform xi for input to the above function by setting\n     * x \u003d (xi-1)/(xi+1).   Input to the polynomial is x^2, then\n     * the result is multiplied by x.\n     * @param xi number from which log is requested\n     * @return log(xi)\n     ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 35)",
        "(line 1628,col 9)-(line 1628,col 36)",
        "(line 1629,col 9)-(line 1629,col 35)",
        "(line 1630,col 9)-(line 1630,col 35)",
        "(line 1632,col 9)-(line 1632,col 21)",
        "(line 1635,col 9)-(line 1635,col 20)",
        "(line 1636,col 9)-(line 1636,col 19)",
        "(line 1637,col 9)-(line 1637,col 30)",
        "(line 1638,col 9)-(line 1638,col 20)",
        "(line 1639,col 9)-(line 1639,col 19)",
        "(line 1640,col 9)-(line 1640,col 27)",
        "(line 1641,col 9)-(line 1641,col 20)",
        "(line 1642,col 9)-(line 1642,col 20)",
        "(line 1645,col 9)-(line 1645,col 28)",
        "(line 1651,col 9)-(line 1651,col 56)",
        "(line 1652,col 9)-(line 1652,col 56)",
        "(line 1654,col 9)-(line 1661,col 9)",
        "(line 1663,col 9)-(line 1663,col 27)",
        "(line 1664,col 9)-(line 1664,col 20)",
        "(line 1665,col 9)-(line 1665,col 20)",
        "(line 1667,col 9)-(line 1667,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowSin(double, double[])",
      "begin_line": 1676,
      "end_line": 1710,
      "comment": "\n     * For x between 0 and pi/4 compute sine.\n     * @param x number from which sine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 1677,col 9)-(line 1677,col 42)",
        "(line 1678,col 9)-(line 1678,col 42)",
        "(line 1679,col 9)-(line 1679,col 45)",
        "(line 1680,col 9)-(line 1680,col 42)",
        "(line 1681,col 9)-(line 1681,col 21)",
        "(line 1682,col 9)-(line 1682,col 28)",
        "(line 1684,col 9)-(line 1702,col 9)",
        "(line 1704,col 9)-(line 1707,col 9)",
        "(line 1709,col 9)-(line 1709,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowCos(double, double[])",
      "begin_line": 1718,
      "end_line": 1753,
      "comment": "\n     *  For x between 0 and pi/4 compute cosine\n     * @param x number from which cosine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 1720,col 9)-(line 1720,col 42)",
        "(line 1721,col 9)-(line 1721,col 42)",
        "(line 1722,col 9)-(line 1722,col 45)",
        "(line 1723,col 9)-(line 1723,col 42)",
        "(line 1724,col 9)-(line 1724,col 21)",
        "(line 1725,col 9)-(line 1725,col 28)",
        "(line 1727,col 9)-(line 1745,col 9)",
        "(line 1747,col 9)-(line 1750,col 9)",
        "(line 1752,col 9)-(line 1752,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.buildSinCosTables()",
      "begin_line": 1757,
      "end_line": 1849,
      "comment": " Build the sine and cosine tables.\n     ",
      "child_ranges": [
        "(line 1758,col 9)-(line 1758,col 46)",
        "(line 1761,col 9)-(line 1771,col 9)",
        "(line 1774,col 9)-(line 1827,col 9)",
        "(line 1830,col 9)-(line 1847,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polySine(double)",
      "begin_line": 1857,
      "end_line": 1870,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1859,col 9)-(line 1859,col 24)",
        "(line 1861,col 9)-(line 1861,col 41)",
        "(line 1862,col 9)-(line 1862,col 44)",
        "(line 1863,col 9)-(line 1863,col 42)",
        "(line 1864,col 9)-(line 1864,col 42)",
        "(line 1867,col 9)-(line 1867,col 23)",
        "(line 1869,col 9)-(line 1869,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polyCosine(double)",
      "begin_line": 1878,
      "end_line": 1888,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1879,col 9)-(line 1879,col 24)",
        "(line 1881,col 9)-(line 1881,col 40)",
        "(line 1882,col 9)-(line 1882,col 44)",
        "(line 1883,col 9)-(line 1883,col 42)",
        "(line 1884,col 9)-(line 1884,col 42)",
        "(line 1885,col 9)-(line 1885,col 16)",
        "(line 1887,col 9)-(line 1887,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinQ(double, double)",
      "begin_line": 1897,
      "end_line": 2012,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1898,col 9)-(line 1898,col 43)",
        "(line 1899,col 9)-(line 1899,col 50)",
        "(line 1902,col 9)-(line 1902,col 47)",
        "(line 1903,col 9)-(line 1903,col 47)",
        "(line 1904,col 9)-(line 1904,col 49)",
        "(line 1905,col 9)-(line 1905,col 49)",
        "(line 1908,col 9)-(line 1908,col 33)",
        "(line 1909,col 9)-(line 1909,col 43)",
        "(line 1910,col 9)-(line 1910,col 35)",
        "(line 1911,col 9)-(line 1911,col 51)",
        "(line 1914,col 9)-(line 1914,col 51)",
        "(line 1915,col 9)-(line 1915,col 47)",
        "(line 1916,col 9)-(line 1916,col 36)",
        "(line 1917,col 9)-(line 1917,col 24)",
        "(line 1920,col 9)-(line 1920,col 22)",
        "(line 1943,col 9)-(line 1943,col 21)",
        "(line 1944,col 9)-(line 1944,col 21)",
        "(line 1946,col 9)-(line 1946,col 25)",
        "(line 1947,col 9)-(line 1947,col 25)",
        "(line 1948,col 9)-(line 1948,col 32)",
        "(line 1949,col 9)-(line 1949,col 14)",
        "(line 1950,col 9)-(line 1950,col 18)",
        "(line 1952,col 9)-(line 1952,col 28)",
        "(line 1953,col 9)-(line 1953,col 18)",
        "(line 1954,col 9)-(line 1954,col 25)",
        "(line 1955,col 9)-(line 1955,col 14)",
        "(line 1956,col 9)-(line 1956,col 18)",
        "(line 1958,col 9)-(line 1958,col 50)",
        "(line 1973,col 9)-(line 1973,col 76)",
        "(line 2000,col 9)-(line 2007,col 9)",
        "(line 2009,col 9)-(line 2009,col 23)",
        "(line 2011,col 9)-(line 2011,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosQ(double, double)",
      "begin_line": 2021,
      "end_line": 2030,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 2022,col 9)-(line 2022,col 47)",
        "(line 2023,col 9)-(line 2023,col 50)",
        "(line 2025,col 9)-(line 2025,col 35)",
        "(line 2026,col 9)-(line 2026,col 36)",
        "(line 2027,col 9)-(line 2027,col 23)",
        "(line 2029,col 9)-(line 2029,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 2040,
      "end_line": 2175,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 2042,col 9)-(line 2042,col 43)",
        "(line 2043,col 9)-(line 2043,col 50)",
        "(line 2046,col 9)-(line 2046,col 47)",
        "(line 2047,col 9)-(line 2047,col 47)",
        "(line 2048,col 9)-(line 2048,col 49)",
        "(line 2049,col 9)-(line 2049,col 49)",
        "(line 2052,col 9)-(line 2052,col 33)",
        "(line 2053,col 9)-(line 2053,col 43)",
        "(line 2054,col 9)-(line 2054,col 35)",
        "(line 2055,col 9)-(line 2055,col 51)",
        "(line 2058,col 9)-(line 2058,col 45)",
        "(line 2059,col 9)-(line 2059,col 47)",
        "(line 2060,col 9)-(line 2060,col 36)",
        "(line 2061,col 9)-(line 2061,col 24)",
        "(line 2086,col 9)-(line 2086,col 21)",
        "(line 2087,col 9)-(line 2087,col 21)",
        "(line 2090,col 9)-(line 2090,col 25)",
        "(line 2091,col 9)-(line 2091,col 25)",
        "(line 2092,col 9)-(line 2092,col 32)",
        "(line 2093,col 9)-(line 2093,col 14)",
        "(line 2094,col 9)-(line 2094,col 18)",
        "(line 2096,col 9)-(line 2096,col 26)",
        "(line 2097,col 9)-(line 2097,col 18)",
        "(line 2098,col 9)-(line 2098,col 25)",
        "(line 2099,col 9)-(line 2099,col 14)",
        "(line 2100,col 9)-(line 2100,col 18)",
        "(line 2102,col 9)-(line 2102,col 46)",
        "(line 2103,col 9)-(line 2103,col 70)",
        "(line 2105,col 9)-(line 2105,col 28)",
        "(line 2106,col 9)-(line 2106,col 38)",
        "(line 2110,col 9)-(line 2110,col 28)",
        "(line 2112,col 9)-(line 2112,col 26)",
        "(line 2113,col 9)-(line 2113,col 18)",
        "(line 2114,col 9)-(line 2114,col 25)",
        "(line 2115,col 9)-(line 2115,col 14)",
        "(line 2116,col 9)-(line 2116,col 18)",
        "(line 2118,col 9)-(line 2118,col 27)",
        "(line 2119,col 9)-(line 2119,col 18)",
        "(line 2120,col 9)-(line 2120,col 25)",
        "(line 2121,col 9)-(line 2121,col 14)",
        "(line 2122,col 9)-(line 2122,col 18)",
        "(line 2124,col 9)-(line 2124,col 62)",
        "(line 2125,col 9)-(line 2125,col 64)",
        "(line 2127,col 9)-(line 2127,col 28)",
        "(line 2128,col 9)-(line 2128,col 38)",
        "(line 2130,col 9)-(line 2134,col 9)",
        "(line 2147,col 9)-(line 2147,col 31)",
        "(line 2150,col 9)-(line 2150,col 34)",
        "(line 2151,col 9)-(line 2151,col 42)",
        "(line 2152,col 9)-(line 2152,col 34)",
        "(line 2154,col 9)-(line 2154,col 35)",
        "(line 2155,col 9)-(line 2155,col 44)",
        "(line 2156,col 9)-(line 2156,col 37)",
        "(line 2159,col 9)-(line 2159,col 85)",
        "(line 2160,col 9)-(line 2160,col 25)",
        "(line 2161,col 9)-(line 2161,col 42)",
        "(line 2163,col 9)-(line 2172,col 9)",
        "(line 2174,col 9)-(line 2174,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 2188,
      "end_line": 2398,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 2191,col 9)-(line 2191,col 49)",
        "(line 2192,col 9)-(line 2192,col 61)",
        "(line 2195,col 9)-(line 2195,col 38)",
        "(line 2196,col 9)-(line 2196,col 38)",
        "(line 2199,col 9)-(line 2199,col 19)",
        "(line 2200,col 9)-(line 2200,col 22)",
        "(line 2203,col 9)-(line 2203,col 19)",
        "(line 2204,col 9)-(line 2204,col 19)",
        "(line 2205,col 9)-(line 2205,col 19)",
        "(line 2206,col 9)-(line 2206,col 32)",
        "(line 2207,col 9)-(line 2207,col 42)",
        "(line 2209,col 9)-(line 2218,col 9)",
        "(line 2221,col 9)-(line 2221,col 31)",
        "(line 2222,col 9)-(line 2222,col 38)",
        "(line 2224,col 9)-(line 2224,col 30)",
        "(line 2225,col 9)-(line 2225,col 37)",
        "(line 2227,col 9)-(line 2227,col 24)",
        "(line 2228,col 9)-(line 2228,col 24)",
        "(line 2229,col 9)-(line 2229,col 24)",
        "(line 2230,col 9)-(line 2230,col 24)",
        "(line 2232,col 9)-(line 2232,col 37)",
        "(line 2233,col 9)-(line 2233,col 38)",
        "(line 2235,col 9)-(line 2235,col 55)",
        "(line 2236,col 9)-(line 2236,col 48)",
        "(line 2237,col 9)-(line 2237,col 60)",
        "(line 2240,col 9)-(line 2243,col 9)",
        "(line 2245,col 9)-(line 2245,col 50)",
        "(line 2246,col 9)-(line 2246,col 40)",
        "(line 2248,col 9)-(line 2248,col 35)",
        "(line 2249,col 9)-(line 2249,col 36)",
        "(line 2251,col 9)-(line 2251,col 52)",
        "(line 2254,col 9)-(line 2257,col 9)",
        "(line 2260,col 9)-(line 2260,col 25)",
        "(line 2261,col 9)-(line 2261,col 32)",
        "(line 2262,col 9)-(line 2262,col 19)",
        "(line 2263,col 9)-(line 2263,col 19)",
        "(line 2264,col 9)-(line 2264,col 19)",
        "(line 2267,col 9)-(line 2267,col 37)",
        "(line 2269,col 9)-(line 2269,col 50)",
        "(line 2270,col 9)-(line 2270,col 48)",
        "(line 2271,col 9)-(line 2271,col 20)",
        "(line 2272,col 9)-(line 2272,col 52)",
        "(line 2274,col 9)-(line 2277,col 9)",
        "(line 2280,col 9)-(line 2280,col 25)",
        "(line 2281,col 9)-(line 2281,col 32)",
        "(line 2283,col 9)-(line 2283,col 19)",
        "(line 2284,col 9)-(line 2284,col 19)",
        "(line 2285,col 9)-(line 2285,col 19)",
        "(line 2287,col 9)-(line 2287,col 40)",
        "(line 2299,col 9)-(line 2299,col 42)",
        "(line 2302,col 9)-(line 2302,col 20)",
        "(line 2303,col 9)-(line 2303,col 30)",
        "(line 2304,col 9)-(line 2304,col 20)",
        "(line 2307,col 9)-(line 2307,col 25)",
        "(line 2308,col 9)-(line 2308,col 32)",
        "(line 2310,col 9)-(line 2310,col 34)",
        "(line 2311,col 9)-(line 2311,col 41)",
        "(line 2313,col 9)-(line 2313,col 19)",
        "(line 2314,col 9)-(line 2314,col 19)",
        "(line 2315,col 9)-(line 2315,col 19)",
        "(line 2316,col 9)-(line 2316,col 19)",
        "(line 2318,col 9)-(line 2318,col 38)",
        "(line 2319,col 9)-(line 2319,col 39)",
        "(line 2321,col 9)-(line 2321,col 47)",
        "(line 2322,col 9)-(line 2322,col 40)",
        "(line 2323,col 9)-(line 2323,col 53)",
        "(line 2326,col 9)-(line 2329,col 9)",
        "(line 2331,col 9)-(line 2331,col 51)",
        "(line 2332,col 9)-(line 2332,col 40)",
        "(line 2334,col 9)-(line 2334,col 37)",
        "(line 2335,col 9)-(line 2335,col 38)",
        "(line 2337,col 9)-(line 2337,col 53)",
        "(line 2340,col 9)-(line 2343,col 9)",
        "(line 2346,col 9)-(line 2346,col 34)",
        "(line 2347,col 9)-(line 2347,col 41)",
        "(line 2348,col 9)-(line 2348,col 19)",
        "(line 2349,col 9)-(line 2349,col 19)",
        "(line 2350,col 9)-(line 2350,col 19)",
        "(line 2353,col 9)-(line 2353,col 37)",
        "(line 2355,col 9)-(line 2355,col 51)",
        "(line 2356,col 9)-(line 2356,col 48)",
        "(line 2357,col 9)-(line 2357,col 21)",
        "(line 2358,col 9)-(line 2358,col 53)",
        "(line 2360,col 9)-(line 2363,col 9)",
        "(line 2366,col 9)-(line 2366,col 25)",
        "(line 2367,col 9)-(line 2367,col 32)",
        "(line 2368,col 9)-(line 2368,col 34)",
        "(line 2369,col 9)-(line 2369,col 41)",
        "(line 2370,col 9)-(line 2370,col 19)",
        "(line 2371,col 9)-(line 2371,col 19)",
        "(line 2372,col 9)-(line 2372,col 19)",
        "(line 2375,col 9)-(line 2375,col 37)",
        "(line 2377,col 9)-(line 2377,col 51)",
        "(line 2378,col 9)-(line 2378,col 48)",
        "(line 2379,col 9)-(line 2379,col 21)",
        "(line 2380,col 9)-(line 2380,col 53)",
        "(line 2382,col 9)-(line 2385,col 9)",
        "(line 2388,col 9)-(line 2388,col 59)",
        "(line 2389,col 9)-(line 2389,col 110)",
        "(line 2391,col 9)-(line 2391,col 34)",
        "(line 2392,col 9)-(line 2392,col 44)",
        "(line 2395,col 9)-(line 2395,col 28)",
        "(line 2396,col 9)-(line 2396,col 31)",
        "(line 2397,col 9)-(line 2397,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sin(double)",
      "begin_line": 2405,
      "end_line": 2495,
      "comment": "\n     *  Sine function.\n     *  @param x a number\n     *  @return sin(x)\n     ",
      "child_ranges": [
        "(line 2406,col 9)-(line 2406,col 33)",
        "(line 2407,col 9)-(line 2407,col 25)",
        "(line 2408,col 9)-(line 2408,col 18)",
        "(line 2409,col 9)-(line 2409,col 24)",
        "(line 2412,col 9)-(line 2412,col 15)",
        "(line 2413,col 9)-(line 2416,col 9)",
        "(line 2419,col 9)-(line 2425,col 9)",
        "(line 2427,col 9)-(line 2429,col 9)",
        "(line 2432,col 9)-(line 2477,col 9)",
        "(line 2479,col 9)-(line 2481,col 9)",
        "(line 2483,col 9)-(line 2494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cos(double)",
      "begin_line": 2502,
      "end_line": 2579,
      "comment": "\n     *  Cosine function\n     *  @param x a number\n     *  @return cos(x)\n     ",
      "child_ranges": [
        "(line 2503,col 9)-(line 2503,col 25)",
        "(line 2506,col 9)-(line 2506,col 22)",
        "(line 2507,col 9)-(line 2509,col 9)",
        "(line 2511,col 9)-(line 2513,col 9)",
        "(line 2516,col 9)-(line 2516,col 22)",
        "(line 2517,col 9)-(line 2562,col 9)",
        "(line 2567,col 9)-(line 2578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tan(double)",
      "begin_line": 2586,
      "end_line": 2686,
      "comment": "\n     *   Tangent function\n     *  @param x a number\n     *  @return tan(x)\n     ",
      "child_ranges": [
        "(line 2587,col 9)-(line 2587,col 33)",
        "(line 2588,col 9)-(line 2588,col 25)",
        "(line 2591,col 9)-(line 2591,col 22)",
        "(line 2592,col 9)-(line 2595,col 9)",
        "(line 2598,col 9)-(line 2604,col 9)",
        "(line 2606,col 9)-(line 2608,col 9)",
        "(line 2611,col 9)-(line 2611,col 22)",
        "(line 2612,col 9)-(line 2657,col 9)",
        "(line 2659,col 9)-(line 2672,col 9)",
        "(line 2674,col 9)-(line 2674,col 22)",
        "(line 2675,col 9)-(line 2679,col 9)",
        "(line 2681,col 9)-(line 2683,col 9)",
        "(line 2685,col 9)-(line 2685,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double)",
      "begin_line": 2693,
      "end_line": 2695,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2694,col 9)-(line 2694,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2703,
      "end_line": 2841,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by \u0026pi; if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2704,col 9)-(line 2704,col 31)",
        "(line 2705,col 9)-(line 2705,col 16)",
        "(line 2707,col 9)-(line 2712,col 9)",
        "(line 2714,col 9)-(line 2716,col 9)",
        "(line 2719,col 9)-(line 2724,col 9)",
        "(line 2725,col 9)-(line 2725,col 48)",
        "(line 2726,col 9)-(line 2726,col 58)",
        "(line 2727,col 9)-(line 2727,col 42)",
        "(line 2729,col 9)-(line 2729,col 34)",
        "(line 2730,col 9)-(line 2730,col 37)",
        "(line 2731,col 9)-(line 2731,col 20)",
        "(line 2734,col 9)-(line 2734,col 33)",
        "(line 2735,col 9)-(line 2735,col 37)",
        "(line 2736,col 9)-(line 2736,col 33)",
        "(line 2737,col 9)-(line 2737,col 16)",
        "(line 2738,col 9)-(line 2738,col 17)",
        "(line 2741,col 9)-(line 2773,col 9)",
        "(line 2776,col 9)-(line 2776,col 18)",
        "(line 2777,col 9)-(line 2777,col 18)",
        "(line 2780,col 9)-(line 2780,col 33)",
        "(line 2791,col 9)-(line 2791,col 33)",
        "(line 2792,col 9)-(line 2792,col 47)",
        "(line 2793,col 9)-(line 2793,col 46)",
        "(line 2794,col 9)-(line 2794,col 46)",
        "(line 2795,col 9)-(line 2795,col 46)",
        "(line 2796,col 9)-(line 2796,col 47)",
        "(line 2797,col 9)-(line 2797,col 31)",
        "(line 2800,col 9)-(line 2800,col 18)",
        "(line 2802,col 9)-(line 2802,col 23)",
        "(line 2803,col 9)-(line 2803,col 31)",
        "(line 2804,col 9)-(line 2804,col 18)",
        "(line 2807,col 9)-(line 2807,col 41)",
        "(line 2809,col 9)-(line 2809,col 22)",
        "(line 2810,col 9)-(line 2810,col 23)",
        "(line 2813,col 9)-(line 2813,col 39)",
        "(line 2814,col 9)-(line 2814,col 47)",
        "(line 2815,col 9)-(line 2815,col 23)",
        "(line 2816,col 9)-(line 2816,col 32)",
        "(line 2817,col 9)-(line 2817,col 18)",
        "(line 2819,col 9)-(line 2819,col 25)",
        "(line 2820,col 9)-(line 2820,col 38)",
        "(line 2822,col 9)-(line 2833,col 9)",
        "(line 2836,col 9)-(line 2838,col 9)",
        "(line 2840,col 9)-(line 2840,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan2(double, double)",
      "begin_line": 2849,
      "end_line": 2963,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between -\u0026pi; and \u0026pi;\n     ",
      "child_ranges": [
        "(line 2850,col 9)-(line 2852,col 9)",
        "(line 2854,col 9)-(line 2880,col 9)",
        "(line 2882,col 9)-(line 2892,col 9)",
        "(line 2894,col 9)-(line 2904,col 9)",
        "(line 2906,col 9)-(line 2914,col 9)",
        "(line 2916,col 9)-(line 2925,col 9)",
        "(line 2927,col 9)-(line 2935,col 9)",
        "(line 2937,col 9)-(line 2940,col 9)",
        "(line 2943,col 9)-(line 2943,col 39)",
        "(line 2944,col 9)-(line 2944,col 42)",
        "(line 2945,col 9)-(line 2945,col 33)",
        "(line 2948,col 9)-(line 2948,col 29)",
        "(line 2949,col 9)-(line 2949,col 32)",
        "(line 2950,col 9)-(line 2950,col 36)",
        "(line 2951,col 9)-(line 2951,col 27)",
        "(line 2953,col 9)-(line 2953,col 62)",
        "(line 2955,col 9)-(line 2955,col 23)",
        "(line 2956,col 9)-(line 2956,col 31)",
        "(line 2957,col 9)-(line 2957,col 18)",
        "(line 2960,col 9)-(line 2960,col 44)",
        "(line 2962,col 9)-(line 2962,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asin(double)",
      "begin_line": 2969,
      "end_line": 3035,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2970,col 7)-(line 2972,col 7)",
        "(line 2974,col 7)-(line 2976,col 7)",
        "(line 2978,col 7)-(line 2980,col 7)",
        "(line 2982,col 7)-(line 2984,col 7)",
        "(line 2989,col 7)-(line 2989,col 37)",
        "(line 2990,col 7)-(line 2990,col 40)",
        "(line 2991,col 7)-(line 2991,col 31)",
        "(line 2994,col 7)-(line 2994,col 24)",
        "(line 2995,col 7)-(line 2995,col 36)",
        "(line 2998,col 7)-(line 2998,col 15)",
        "(line 2999,col 7)-(line 2999,col 15)",
        "(line 3001,col 7)-(line 3001,col 27)",
        "(line 3002,col 7)-(line 3002,col 35)",
        "(line 3004,col 7)-(line 3004,col 21)",
        "(line 3005,col 7)-(line 3005,col 30)",
        "(line 3006,col 7)-(line 3006,col 16)",
        "(line 3009,col 7)-(line 3009,col 15)",
        "(line 3010,col 7)-(line 3010,col 19)",
        "(line 3011,col 7)-(line 3011,col 30)",
        "(line 3012,col 7)-(line 3012,col 27)",
        "(line 3013,col 7)-(line 3013,col 18)",
        "(line 3016,col 7)-(line 3016,col 53)",
        "(line 3019,col 7)-(line 3019,col 31)",
        "(line 3022,col 7)-(line 3022,col 21)",
        "(line 3023,col 7)-(line 3023,col 30)",
        "(line 3024,col 7)-(line 3024,col 34)",
        "(line 3025,col 7)-(line 3025,col 25)",
        "(line 3027,col 7)-(line 3027,col 52)",
        "(line 3028,col 7)-(line 3028,col 28)",
        "(line 3030,col 7)-(line 3030,col 21)",
        "(line 3031,col 7)-(line 3031,col 29)",
        "(line 3032,col 7)-(line 3032,col 16)",
        "(line 3034,col 7)-(line 3034,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acos(double)",
      "begin_line": 3041,
      "end_line": 3112,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 3042,col 7)-(line 3044,col 7)",
        "(line 3046,col 7)-(line 3048,col 7)",
        "(line 3050,col 7)-(line 3052,col 7)",
        "(line 3054,col 7)-(line 3056,col 7)",
        "(line 3058,col 7)-(line 3060,col 7)",
        "(line 3065,col 7)-(line 3065,col 37)",
        "(line 3066,col 7)-(line 3066,col 40)",
        "(line 3067,col 7)-(line 3067,col 31)",
        "(line 3070,col 7)-(line 3070,col 24)",
        "(line 3071,col 7)-(line 3071,col 36)",
        "(line 3074,col 7)-(line 3074,col 15)",
        "(line 3075,col 7)-(line 3075,col 15)",
        "(line 3077,col 7)-(line 3077,col 27)",
        "(line 3078,col 7)-(line 3078,col 35)",
        "(line 3080,col 7)-(line 3080,col 21)",
        "(line 3081,col 7)-(line 3081,col 30)",
        "(line 3082,col 7)-(line 3082,col 16)",
        "(line 3085,col 7)-(line 3085,col 26)",
        "(line 3086,col 7)-(line 3086,col 30)",
        "(line 3087,col 7)-(line 3087,col 27)",
        "(line 3088,col 7)-(line 3088,col 18)",
        "(line 3091,col 7)-(line 3091,col 53)",
        "(line 3094,col 7)-(line 3094,col 25)",
        "(line 3095,col 7)-(line 3095,col 16)",
        "(line 3096,col 7)-(line 3096,col 26)",
        "(line 3099,col 7)-(line 3099,col 21)",
        "(line 3100,col 7)-(line 3100,col 30)",
        "(line 3101,col 7)-(line 3101,col 34)",
        "(line 3102,col 7)-(line 3102,col 25)",
        "(line 3104,col 7)-(line 3104,col 52)",
        "(line 3105,col 7)-(line 3105,col 19)",
        "(line 3107,col 7)-(line 3107,col 21)",
        "(line 3108,col 7)-(line 3108,col 29)",
        "(line 3109,col 7)-(line 3109,col 16)",
        "(line 3111,col 7)-(line 3111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cbrt(double)",
      "begin_line": 3118,
      "end_line": 3196,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 3120,col 7)-(line 3120,col 47)",
        "(line 3121,col 7)-(line 3121,col 59)",
        "(line 3122,col 7)-(line 3122,col 32)",
        "(line 3124,col 7)-(line 3134,col 7)",
        "(line 3136,col 7)-(line 3139,col 7)",
        "(line 3142,col 7)-(line 3142,col 30)",
        "(line 3145,col 7)-(line 3146,col 81)",
        "(line 3149,col 7)-(line 3149,col 104)",
        "(line 3152,col 7)-(line 3152,col 41)",
        "(line 3153,col 7)-(line 3153,col 44)",
        "(line 3154,col 7)-(line 3154,col 45)",
        "(line 3155,col 7)-(line 3155,col 44)",
        "(line 3156,col 7)-(line 3156,col 44)",
        "(line 3158,col 7)-(line 3158,col 39)",
        "(line 3163,col 7)-(line 3163,col 39)",
        "(line 3164,col 7)-(line 3164,col 46)",
        "(line 3165,col 7)-(line 3165,col 46)",
        "(line 3168,col 7)-(line 3168,col 39)",
        "(line 3169,col 7)-(line 3169,col 36)",
        "(line 3170,col 7)-(line 3170,col 27)",
        "(line 3172,col 7)-(line 3172,col 26)",
        "(line 3173,col 7)-(line 3173,col 42)",
        "(line 3174,col 7)-(line 3174,col 31)",
        "(line 3175,col 7)-(line 3175,col 38)",
        "(line 3176,col 7)-(line 3176,col 23)",
        "(line 3177,col 7)-(line 3177,col 17)",
        "(line 3179,col 7)-(line 3179,col 39)",
        "(line 3180,col 7)-(line 3180,col 19)",
        "(line 3182,col 7)-(line 3182,col 26)",
        "(line 3183,col 7)-(line 3183,col 34)",
        "(line 3184,col 7)-(line 3184,col 15)",
        "(line 3186,col 7)-(line 3186,col 33)",
        "(line 3189,col 7)-(line 3189,col 16)",
        "(line 3191,col 7)-(line 3193,col 7)",
        "(line 3195,col 7)-(line 3195,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toRadians(double)",
      "begin_line": 3203,
      "end_line": 3213,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 3205,col 9)-(line 3205,col 49)",
        "(line 3206,col 9)-(line 3206,col 50)",
        "(line 3208,col 9)-(line 3208,col 39)",
        "(line 3209,col 9)-(line 3209,col 36)",
        "(line 3210,col 9)-(line 3210,col 27)",
        "(line 3212,col 9)-(line 3212,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toDegrees(double)",
      "begin_line": 3220,
      "end_line": 3230,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 3222,col 9)-(line 3222,col 46)",
        "(line 3223,col 9)-(line 3223,col 50)",
        "(line 3225,col 9)-(line 3225,col 39)",
        "(line 3226,col 9)-(line 3226,col 36)",
        "(line 3227,col 9)-(line 3227,col 27)",
        "(line 3229,col 9)-(line 3229,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(int)",
      "begin_line": 3237,
      "end_line": 3239,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3238,col 9)-(line 3238,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(long)",
      "begin_line": 3246,
      "end_line": 3248,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3247,col 9)-(line 3247,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(float)",
      "begin_line": 3255,
      "end_line": 3257,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3256,col 9)-(line 3256,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(double)",
      "begin_line": 3264,
      "end_line": 3266,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3265,col 9)-(line 3265,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(double)",
      "begin_line": 3274,
      "end_line": 3276,
      "comment": "",
      "child_ranges": [
        "(line 3275,col 9)-(line 3275,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(double, double)",
      "begin_line": 3294,
      "end_line": 3332,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3297,col 9)-(line 3301,col 9)",
        "(line 3306,col 9)-(line 3306,col 51)",
        "(line 3307,col 9)-(line 3307,col 51)",
        "(line 3308,col 9)-(line 3308,col 51)",
        "(line 3309,col 9)-(line 3309,col 51)",
        "(line 3311,col 9)-(line 3330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.floor(double)",
      "begin_line": 3338,
      "end_line": 3359,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3339,col 9)-(line 3339,col 15)",
        "(line 3341,col 9)-(line 3343,col 9)",
        "(line 3345,col 9)-(line 3347,col 9)",
        "(line 3349,col 9)-(line 3349,col 21)",
        "(line 3350,col 9)-(line 3352,col 9)",
        "(line 3354,col 9)-(line 3356,col 9)",
        "(line 3358,col 9)-(line 3358,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ceil(double)",
      "begin_line": 3365,
      "end_line": 3384,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3366,col 9)-(line 3366,col 17)",
        "(line 3368,col 9)-(line 3370,col 9)",
        "(line 3372,col 9)-(line 3372,col 21)",
        "(line 3373,col 9)-(line 3375,col 9)",
        "(line 3377,col 9)-(line 3377,col 17)",
        "(line 3379,col 9)-(line 3381,col 9)",
        "(line 3383,col 9)-(line 3383,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.rint(double)",
      "begin_line": 3390,
      "end_line": 3404,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3391,col 9)-(line 3391,col 28)",
        "(line 3392,col 9)-(line 3392,col 25)",
        "(line 3394,col 9)-(line 3396,col 9)",
        "(line 3397,col 9)-(line 3399,col 9)",
        "(line 3402,col 9)-(line 3402,col 26)",
        "(line 3403,col 9)-(line 3403,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(double)",
      "begin_line": 3410,
      "end_line": 3412,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3411,col 9)-(line 3411,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(float)",
      "begin_line": 3418,
      "end_line": 3420,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3419,col 9)-(line 3419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(int, int)",
      "begin_line": 3427,
      "end_line": 3429,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3428,col 9)-(line 3428,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(long, long)",
      "begin_line": 3436,
      "end_line": 3438,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3437,col 9)-(line 3437,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(float, float)",
      "begin_line": 3445,
      "end_line": 3447,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3446,col 9)-(line 3446,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(double, double)",
      "begin_line": 3454,
      "end_line": 3456,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3455,col 9)-(line 3455,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(int, int)",
      "begin_line": 3463,
      "end_line": 3465,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3464,col 9)-(line 3464,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(long, long)",
      "begin_line": 3472,
      "end_line": 3474,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3473,col 9)-(line 3473,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(float, float)",
      "begin_line": 3481,
      "end_line": 3483,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3482,col 9)-(line 3482,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(double, double)",
      "begin_line": 3490,
      "end_line": 3492,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3491,col 9)-(line 3491,col 69)"
      ]
    }
  ]
}