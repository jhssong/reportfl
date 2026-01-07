{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 2967,
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
      "comment": " Eighthes.\n     * This is used by sinQ, because its faster to do a table lookup than\n     * a multiply in this time-critical routine\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.FastMath.FastMath()",
      "begin_line": 204,
      "end_line": 205,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acos(double)",
      "begin_line": 211,
      "end_line": 213,
      "comment": " Compute the arc cosine of a number.\n     * @param a number on which evaluation is done\n     * @return arc cosine of a\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asin(double)",
      "begin_line": 219,
      "end_line": 221,
      "comment": " Compute the arc sine of a number.\n     * @param a number on which evaluation is done\n     * @return arc sine of a\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sqrt(double)",
      "begin_line": 227,
      "end_line": 229,
      "comment": " Compute the square root of a number.\n     * @param a number on which evaluation is done\n     * @return square root of a\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cbrt(double)",
      "begin_line": 235,
      "end_line": 237,
      "comment": " Compute the cubic root of a number.\n     * @param a number on which evaluation is done\n     * @return cubic root of a\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosh(double)",
      "begin_line": 243,
      "end_line": 245,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinh(double)",
      "begin_line": 251,
      "end_line": 273,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 23)",
        "(line 260,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanh(double)",
      "begin_line": 279,
      "end_line": 302,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 23)",
        "(line 288,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acosh(double)",
      "begin_line": 308,
      "end_line": 310,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asinh(double)",
      "begin_line": 316,
      "end_line": 342,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 33)",
        "(line 319,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 24)",
        "(line 325,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atanh(double)",
      "begin_line": 348,
      "end_line": 374,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 33)",
        "(line 351,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 24)",
        "(line 357,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(double)",
      "begin_line": 381,
      "end_line": 383,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1, 0, +1 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(double)",
      "begin_line": 389,
      "end_line": 391,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.random()",
      "begin_line": 396,
      "end_line": 398,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double, double, double[])",
      "begin_line": 431,
      "end_line": 538,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 24)",
        "(line 433,col 9)-(line 433,col 24)",
        "(line 434,col 9)-(line 434,col 19)",
        "(line 440,col 9)-(line 482,col 9)",
        "(line 488,col 9)-(line 488,col 58)",
        "(line 489,col 9)-(line 489,col 59)",
        "(line 490,col 9)-(line 490,col 59)",
        "(line 496,col 9)-(line 496,col 63)",
        "(line 505,col 9)-(line 505,col 39)",
        "(line 506,col 9)-(line 506,col 45)",
        "(line 507,col 9)-(line 507,col 45)",
        "(line 508,col 9)-(line 508,col 30)",
        "(line 509,col 9)-(line 509,col 49)",
        "(line 516,col 9)-(line 516,col 44)",
        "(line 517,col 9)-(line 517,col 90)",
        "(line 523,col 9)-(line 523,col 43)",
        "(line 524,col 9)-(line 524,col 28)",
        "(line 525,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 535,col 9)",
        "(line 537,col 9)-(line 537,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double)",
      "begin_line": 544,
      "end_line": 679,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 549,col 9)-(line 562,col 9)",
        "(line 564,col 9)-(line 564,col 21)",
        "(line 565,col 9)-(line 565,col 21)",
        "(line 566,col 9)-(line 566,col 23)",
        "(line 567,col 9)-(line 567,col 33)",
        "(line 569,col 9)-(line 572,col 9)",
        "(line 574,col 9)-(line 588,col 9)",
        "(line 592,col 9)-(line 592,col 41)",
        "(line 593,col 9)-(line 593,col 49)",
        "(line 594,col 9)-(line 594,col 48)",
        "(line 595,col 9)-(line 595,col 48)",
        "(line 596,col 9)-(line 596,col 26)",
        "(line 597,col 9)-(line 597,col 26)",
        "(line 599,col 9)-(line 599,col 28)",
        "(line 600,col 9)-(line 600,col 30)",
        "(line 601,col 9)-(line 601,col 31)",
        "(line 602,col 9)-(line 602,col 18)",
        "(line 604,col 9)-(line 604,col 33)",
        "(line 605,col 9)-(line 605,col 32)",
        "(line 606,col 9)-(line 606,col 24)",
        "(line 607,col 9)-(line 607,col 18)",
        "(line 610,col 9)-(line 610,col 31)",
        "(line 612,col 9)-(line 612,col 31)",
        "(line 613,col 9)-(line 613,col 46)",
        "(line 614,col 9)-(line 614,col 18)",
        "(line 616,col 9)-(line 616,col 31)",
        "(line 617,col 9)-(line 617,col 40)",
        "(line 618,col 9)-(line 618,col 18)",
        "(line 620,col 9)-(line 620,col 31)",
        "(line 621,col 9)-(line 621,col 38)",
        "(line 622,col 9)-(line 622,col 18)",
        "(line 626,col 9)-(line 626,col 26)",
        "(line 627,col 9)-(line 627,col 35)",
        "(line 628,col 9)-(line 628,col 18)",
        "(line 630,col 9)-(line 630,col 23)",
        "(line 632,col 9)-(line 632,col 32)",
        "(line 633,col 9)-(line 633,col 18)",
        "(line 635,col 9)-(line 635,col 26)",
        "(line 637,col 9)-(line 637,col 35)",
        "(line 638,col 9)-(line 638,col 18)",
        "(line 640,col 9)-(line 640,col 23)",
        "(line 642,col 9)-(line 642,col 32)",
        "(line 643,col 9)-(line 643,col 18)",
        "(line 645,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 678,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowexp(double, double[])",
      "begin_line": 688,
      "end_line": 715,
      "comment": "\n     *  For x between 0 and 1, returns exp(x), uses extended precision\n     *  @param x argument of exponential\n     *  @param result placeholder where to place exp(x) split in two terms\n     *  for extra precision (i.e. exp(x) \u003d result[0] ° result[1]\n     *  @return exp(x)\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 42)",
        "(line 690,col 9)-(line 690,col 42)",
        "(line 691,col 9)-(line 691,col 45)",
        "(line 692,col 9)-(line 692,col 42)",
        "(line 693,col 9)-(line 693,col 21)",
        "(line 694,col 9)-(line 694,col 28)",
        "(line 696,col 9)-(line 707,col 9)",
        "(line 709,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 714,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.split(double, double[])",
      "begin_line": 722,
      "end_line": 732,
      "comment": " Compute split[0], split[1] such that their sum is equal to d,\n     * and split[0] has its 30 least significant bits as zero.\n     * @param d number to split\n     * @param split placeholder where to place the result\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 731,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.resplit(double[])",
      "begin_line": 738,
      "end_line": 751,
      "comment": " Recompute a split.\n     * @param a input/out array containing the split, changed\n     * on output\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 37)",
        "(line 740,col 9)-(line 740,col 44)",
        "(line 742,col 9)-(line 750,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitMult(double[], double[], double[])",
      "begin_line": 758,
      "end_line": 764,
      "comment": " Multiply two numbers in split form.\n     * @param a first term of multiplication\n     * @param b second term of multiplication\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 29)",
        "(line 760,col 9)-(line 760,col 57)",
        "(line 763,col 9)-(line 763,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitAdd(double[], double[], double[])",
      "begin_line": 771,
      "end_line": 776,
      "comment": " Add two numbers in split form.\n     * @param a first term of addition\n     * @param b second term of addition\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 29)",
        "(line 773,col 9)-(line 773,col 29)",
        "(line 775,col 9)-(line 775,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitReciprocal(double[], double[])",
      "begin_line": 796,
      "end_line": 824,
      "comment": " Compute the reciprocal of in.  Use the following algorithm.\n     *  in \u003d c + d.\n     *  want to find x + y such that x+y \u003d 1/(c+d) and x is much\n     *  larger than y and x has several zero bits on the right.\n     *\n     *  Set b \u003d 1/(2^22),  a \u003d 1 - b.  Thus (a+b) \u003d 1.\n     *  Use following identity to compute (a+b)/(c+d)\n     *\n     *  (a+b)/(c+d)  \u003d   a/c   +    (bc - ad) / (c^2 + cd)\n     *  set x \u003d a/c  and y \u003d (bc - ad) / (c^2 + cd)\n     *  This will be close to the right answer, but there will be\n     *  some rounding in the calculation of X.  So by carefully\n     *  computing 1 - (c+d)(x+y) we can compute an error and\n     *  add that back in.   This is done carefully so that terms\n     *  of similar size are subtracted first.\n     *  @param in initial number, in split form\n     *  @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 39)",
        "(line 798,col 9)-(line 798,col 33)",
        "(line 800,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 30)",
        "(line 806,col 9)-(line 806,col 68)",
        "(line 808,col 9)-(line 810,col 9)",
        "(line 813,col 9)-(line 813,col 24)",
        "(line 815,col 9)-(line 823,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.quadMult(double[], double[], double[])",
      "begin_line": 831,
      "end_line": 878,
      "comment": " Compute (a[0] + a[1]) * (b[0] + b[1]) in extended precision.\n     * @param a first term of the multiplication\n     * @param b second term of the multiplication\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 42)",
        "(line 833,col 9)-(line 833,col 42)",
        "(line 834,col 9)-(line 834,col 42)",
        "(line 837,col 9)-(line 837,col 24)",
        "(line 838,col 9)-(line 838,col 24)",
        "(line 839,col 9)-(line 839,col 30)",
        "(line 841,col 9)-(line 841,col 26)",
        "(line 842,col 9)-(line 842,col 26)",
        "(line 845,col 9)-(line 845,col 24)",
        "(line 846,col 9)-(line 846,col 30)",
        "(line 848,col 9)-(line 848,col 39)",
        "(line 849,col 9)-(line 849,col 58)",
        "(line 850,col 9)-(line 850,col 24)",
        "(line 851,col 9)-(line 851,col 32)",
        "(line 852,col 9)-(line 852,col 58)",
        "(line 853,col 9)-(line 853,col 24)",
        "(line 856,col 9)-(line 856,col 24)",
        "(line 857,col 9)-(line 857,col 24)",
        "(line 858,col 9)-(line 858,col 30)",
        "(line 860,col 9)-(line 860,col 32)",
        "(line 861,col 9)-(line 861,col 58)",
        "(line 862,col 9)-(line 862,col 24)",
        "(line 863,col 9)-(line 863,col 32)",
        "(line 864,col 9)-(line 864,col 58)",
        "(line 865,col 9)-(line 865,col 24)",
        "(line 868,col 9)-(line 868,col 24)",
        "(line 869,col 9)-(line 869,col 24)",
        "(line 870,col 9)-(line 870,col 30)",
        "(line 872,col 9)-(line 872,col 32)",
        "(line 873,col 9)-(line 873,col 58)",
        "(line 874,col 9)-(line 874,col 24)",
        "(line 875,col 9)-(line 875,col 32)",
        "(line 876,col 9)-(line 876,col 58)",
        "(line 877,col 9)-(line 877,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expint(int, double[])",
      "begin_line": 885,
      "end_line": 923,
      "comment": " Compute exp(p) for a integer p in extended precision.\n     * @param p integer whose exponential is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return exp(p) in standard precision (equal to result[0] + result[1])\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 42)",
        "(line 888,col 9)-(line 888,col 42)",
        "(line 889,col 9)-(line 889,col 42)",
        "(line 898,col 9)-(line 898,col 34)",
        "(line 899,col 9)-(line 899,col 39)",
        "(line 901,col 9)-(line 901,col 23)",
        "(line 903,col 9)-(line 913,col 9)",
        "(line 915,col 9)-(line 920,col 9)",
        "(line 922,col 9)-(line 922,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double)",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double[])",
      "begin_line": 942,
      "end_line": 1164,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 47)",
        "(line 946,col 9)-(line 954,col 9)",
        "(line 957,col 9)-(line 963,col 9)",
        "(line 966,col 9)-(line 966,col 41)",
        "(line 968,col 9)-(line 985,col 9)",
        "(line 988,col 9)-(line 1038,col 9)",
        "(line 1041,col 9)-(line 1041,col 74)",
        "(line 1052,col 9)-(line 1052,col 111)",
        "(line 1054,col 9)-(line 1054,col 26)",
        "(line 1055,col 9)-(line 1055,col 26)",
        "(line 1057,col 9)-(line 1115,col 9)",
        "(line 1131,col 9)-(line 1131,col 30)",
        "(line 1132,col 9)-(line 1132,col 23)",
        "(line 1133,col 9)-(line 1133,col 28)",
        "(line 1134,col 9)-(line 1134,col 33)",
        "(line 1135,col 9)-(line 1135,col 14)",
        "(line 1136,col 9)-(line 1136,col 18)",
        "(line 1138,col 9)-(line 1138,col 21)",
        "(line 1139,col 9)-(line 1139,col 28)",
        "(line 1140,col 9)-(line 1140,col 14)",
        "(line 1141,col 9)-(line 1141,col 18)",
        "(line 1143,col 9)-(line 1143,col 27)",
        "(line 1144,col 9)-(line 1144,col 34)",
        "(line 1145,col 9)-(line 1145,col 14)",
        "(line 1146,col 9)-(line 1146,col 18)",
        "(line 1148,col 9)-(line 1148,col 23)",
        "(line 1149,col 9)-(line 1149,col 30)",
        "(line 1150,col 9)-(line 1150,col 14)",
        "(line 1151,col 9)-(line 1151,col 18)",
        "(line 1153,col 9)-(line 1153,col 21)",
        "(line 1154,col 9)-(line 1154,col 28)",
        "(line 1155,col 9)-(line 1155,col 14)",
        "(line 1156,col 9)-(line 1156,col 18)",
        "(line 1158,col 9)-(line 1161,col 9)",
        "(line 1163,col 9)-(line 1163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log1p(double)",
      "begin_line": 1170,
      "end_line": 1195,
      "comment": " Compute log(1 + x).\n     * @param x a number\n     * @return log(1 + x)\n     ",
      "child_ranges": [
        "(line 1171,col 9)-(line 1171,col 29)",
        "(line 1172,col 9)-(line 1172,col 38)",
        "(line 1174,col 9)-(line 1187,col 9)",
        "(line 1190,col 9)-(line 1190,col 47)",
        "(line 1191,col 9)-(line 1191,col 24)",
        "(line 1192,col 9)-(line 1192,col 18)",
        "(line 1194,col 9)-(line 1194,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log10(double)",
      "begin_line": 1201,
      "end_line": 1214,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1202,col 9)-(line 1202,col 46)",
        "(line 1204,col 9)-(line 1204,col 23)",
        "(line 1206,col 9)-(line 1206,col 52)",
        "(line 1207,col 9)-(line 1207,col 49)",
        "(line 1208,col 9)-(line 1208,col 55)",
        "(line 1210,col 9)-(line 1210,col 49)",
        "(line 1211,col 9)-(line 1211,col 52)",
        "(line 1213,col 9)-(line 1213,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.pow(double, double)",
      "begin_line": 1223,
      "end_line": 1315,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 43)",
        "(line 1226,col 9)-(line 1228,col 9)",
        "(line 1231,col 9)-(line 1238,col 9)",
        "(line 1240,col 9)-(line 1256,col 9)",
        "(line 1258,col 9)-(line 1264,col 9)",
        "(line 1266,col 9)-(line 1272,col 9)",
        "(line 1274,col 9)-(line 1280,col 9)",
        "(line 1283,col 9)-(line 1283,col 39)",
        "(line 1284,col 9)-(line 1284,col 42)",
        "(line 1285,col 9)-(line 1285,col 33)",
        "(line 1288,col 9)-(line 1288,col 20)",
        "(line 1289,col 9)-(line 1289,col 28)",
        "(line 1290,col 9)-(line 1290,col 28)",
        "(line 1293,col 9)-(line 1293,col 34)",
        "(line 1294,col 9)-(line 1294,col 46)",
        "(line 1295,col 9)-(line 1295,col 26)",
        "(line 1296,col 9)-(line 1296,col 19)",
        "(line 1299,col 9)-(line 1299,col 35)",
        "(line 1300,col 9)-(line 1300,col 57)",
        "(line 1302,col 9)-(line 1302,col 20)",
        "(line 1303,col 9)-(line 1303,col 31)",
        "(line 1305,col 9)-(line 1305,col 31)",
        "(line 1306,col 9)-(line 1306,col 35)",
        "(line 1307,col 9)-(line 1307,col 34)",
        "(line 1308,col 9)-(line 1308,col 26)",
        "(line 1309,col 9)-(line 1309,col 26)",
        "(line 1310,col 9)-(line 1310,col 20)",
        "(line 1312,col 9)-(line 1312,col 48)",
        "(line 1314,col 9)-(line 1314,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowLog(double)",
      "begin_line": 1336,
      "end_line": 1378,
      "comment": " xi in the range of [1, 2].\n     *                                3        5        7\n     *      x+1           /          x        x        x          \\\n     *  ln ----- \u003d   2 *  |  x  +   ----  +  ----  +  ---- + ...  |\n     *      1-x           \\          3        5        7          /\n     *\n     * So, compute a Remez approximation of the following function\n     *\n     *  ln ((sqrt(x)+1)/(1-sqrt(x)))  /  x\n     *\n     * This will be an even function with only positive coefficents.\n     * x is in the range [0 - 1/3].\n     *\n     * Transform xi for input to the above function by setting\n     * x \u003d (xi-1)/(xi+1).   Input to the polynomial is x^2, then\n     * the result is multiplied by x.\n     * @param xi number from which log is requested\n     * @return log(xi)\n     ",
      "child_ranges": [
        "(line 1337,col 9)-(line 1337,col 35)",
        "(line 1338,col 9)-(line 1338,col 36)",
        "(line 1339,col 9)-(line 1339,col 35)",
        "(line 1340,col 9)-(line 1340,col 35)",
        "(line 1342,col 9)-(line 1342,col 21)",
        "(line 1345,col 9)-(line 1345,col 20)",
        "(line 1346,col 9)-(line 1346,col 19)",
        "(line 1347,col 9)-(line 1347,col 30)",
        "(line 1348,col 9)-(line 1348,col 20)",
        "(line 1349,col 9)-(line 1349,col 19)",
        "(line 1350,col 9)-(line 1350,col 27)",
        "(line 1351,col 9)-(line 1351,col 20)",
        "(line 1352,col 9)-(line 1352,col 20)",
        "(line 1355,col 9)-(line 1355,col 28)",
        "(line 1361,col 9)-(line 1361,col 56)",
        "(line 1362,col 9)-(line 1362,col 56)",
        "(line 1364,col 9)-(line 1371,col 9)",
        "(line 1373,col 9)-(line 1373,col 27)",
        "(line 1374,col 9)-(line 1374,col 20)",
        "(line 1375,col 9)-(line 1375,col 20)",
        "(line 1377,col 9)-(line 1377,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowSin(double, double[])",
      "begin_line": 1386,
      "end_line": 1420,
      "comment": "\n     * For x between 0 and pi/4 compute sine.\n     * @param x number from which sine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 42)",
        "(line 1388,col 9)-(line 1388,col 42)",
        "(line 1389,col 9)-(line 1389,col 45)",
        "(line 1390,col 9)-(line 1390,col 42)",
        "(line 1391,col 9)-(line 1391,col 21)",
        "(line 1392,col 9)-(line 1392,col 28)",
        "(line 1394,col 9)-(line 1412,col 9)",
        "(line 1414,col 9)-(line 1417,col 9)",
        "(line 1419,col 9)-(line 1419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowCos(double, double[])",
      "begin_line": 1428,
      "end_line": 1463,
      "comment": "\n     *  For x between 0 and pi/4 compute cosine\n     * @param x number from which cosine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 1430,col 9)-(line 1430,col 42)",
        "(line 1431,col 9)-(line 1431,col 42)",
        "(line 1432,col 9)-(line 1432,col 45)",
        "(line 1433,col 9)-(line 1433,col 42)",
        "(line 1434,col 9)-(line 1434,col 21)",
        "(line 1435,col 9)-(line 1435,col 28)",
        "(line 1437,col 9)-(line 1455,col 9)",
        "(line 1457,col 9)-(line 1460,col 9)",
        "(line 1462,col 9)-(line 1462,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.buildSinCosTables()",
      "begin_line": 1467,
      "end_line": 1559,
      "comment": " Build the sine and cosine tables.\n     ",
      "child_ranges": [
        "(line 1468,col 9)-(line 1468,col 46)",
        "(line 1471,col 9)-(line 1481,col 9)",
        "(line 1484,col 9)-(line 1537,col 9)",
        "(line 1540,col 9)-(line 1557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polySine(double)",
      "begin_line": 1567,
      "end_line": 1580,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1569,col 9)-(line 1569,col 24)",
        "(line 1571,col 9)-(line 1571,col 41)",
        "(line 1572,col 9)-(line 1572,col 44)",
        "(line 1573,col 9)-(line 1573,col 42)",
        "(line 1574,col 9)-(line 1574,col 42)",
        "(line 1577,col 9)-(line 1577,col 23)",
        "(line 1579,col 9)-(line 1579,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polyCosine(double)",
      "begin_line": 1588,
      "end_line": 1598,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1589,col 9)-(line 1589,col 24)",
        "(line 1591,col 9)-(line 1591,col 40)",
        "(line 1592,col 9)-(line 1592,col 44)",
        "(line 1593,col 9)-(line 1593,col 42)",
        "(line 1594,col 9)-(line 1594,col 42)",
        "(line 1595,col 9)-(line 1595,col 16)",
        "(line 1597,col 9)-(line 1597,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinQ(double, double)",
      "begin_line": 1607,
      "end_line": 1722,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1608,col 43)",
        "(line 1609,col 9)-(line 1609,col 50)",
        "(line 1612,col 9)-(line 1612,col 47)",
        "(line 1613,col 9)-(line 1613,col 47)",
        "(line 1614,col 9)-(line 1614,col 49)",
        "(line 1615,col 9)-(line 1615,col 49)",
        "(line 1618,col 9)-(line 1618,col 33)",
        "(line 1619,col 9)-(line 1619,col 43)",
        "(line 1620,col 9)-(line 1620,col 35)",
        "(line 1621,col 9)-(line 1621,col 51)",
        "(line 1624,col 9)-(line 1624,col 51)",
        "(line 1625,col 9)-(line 1625,col 47)",
        "(line 1626,col 9)-(line 1626,col 36)",
        "(line 1627,col 9)-(line 1627,col 24)",
        "(line 1630,col 9)-(line 1630,col 22)",
        "(line 1653,col 9)-(line 1653,col 21)",
        "(line 1654,col 9)-(line 1654,col 21)",
        "(line 1656,col 9)-(line 1656,col 25)",
        "(line 1657,col 9)-(line 1657,col 25)",
        "(line 1658,col 9)-(line 1658,col 32)",
        "(line 1659,col 9)-(line 1659,col 14)",
        "(line 1660,col 9)-(line 1660,col 18)",
        "(line 1662,col 9)-(line 1662,col 28)",
        "(line 1663,col 9)-(line 1663,col 18)",
        "(line 1664,col 9)-(line 1664,col 25)",
        "(line 1665,col 9)-(line 1665,col 14)",
        "(line 1666,col 9)-(line 1666,col 18)",
        "(line 1668,col 9)-(line 1668,col 50)",
        "(line 1683,col 9)-(line 1683,col 76)",
        "(line 1710,col 9)-(line 1717,col 9)",
        "(line 1719,col 9)-(line 1719,col 23)",
        "(line 1721,col 9)-(line 1721,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosQ(double, double)",
      "begin_line": 1731,
      "end_line": 1740,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1732,col 9)-(line 1732,col 47)",
        "(line 1733,col 9)-(line 1733,col 50)",
        "(line 1735,col 9)-(line 1735,col 35)",
        "(line 1736,col 9)-(line 1736,col 36)",
        "(line 1737,col 9)-(line 1737,col 23)",
        "(line 1739,col 9)-(line 1739,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1750,
      "end_line": 1885,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1752,col 9)-(line 1752,col 43)",
        "(line 1753,col 9)-(line 1753,col 50)",
        "(line 1756,col 9)-(line 1756,col 47)",
        "(line 1757,col 9)-(line 1757,col 47)",
        "(line 1758,col 9)-(line 1758,col 49)",
        "(line 1759,col 9)-(line 1759,col 49)",
        "(line 1762,col 9)-(line 1762,col 33)",
        "(line 1763,col 9)-(line 1763,col 43)",
        "(line 1764,col 9)-(line 1764,col 35)",
        "(line 1765,col 9)-(line 1765,col 51)",
        "(line 1768,col 9)-(line 1768,col 45)",
        "(line 1769,col 9)-(line 1769,col 47)",
        "(line 1770,col 9)-(line 1770,col 36)",
        "(line 1771,col 9)-(line 1771,col 24)",
        "(line 1796,col 9)-(line 1796,col 21)",
        "(line 1797,col 9)-(line 1797,col 21)",
        "(line 1800,col 9)-(line 1800,col 25)",
        "(line 1801,col 9)-(line 1801,col 25)",
        "(line 1802,col 9)-(line 1802,col 32)",
        "(line 1803,col 9)-(line 1803,col 14)",
        "(line 1804,col 9)-(line 1804,col 18)",
        "(line 1806,col 9)-(line 1806,col 26)",
        "(line 1807,col 9)-(line 1807,col 18)",
        "(line 1808,col 9)-(line 1808,col 25)",
        "(line 1809,col 9)-(line 1809,col 14)",
        "(line 1810,col 9)-(line 1810,col 18)",
        "(line 1812,col 9)-(line 1812,col 46)",
        "(line 1813,col 9)-(line 1813,col 70)",
        "(line 1815,col 9)-(line 1815,col 28)",
        "(line 1816,col 9)-(line 1816,col 38)",
        "(line 1820,col 9)-(line 1820,col 28)",
        "(line 1822,col 9)-(line 1822,col 26)",
        "(line 1823,col 9)-(line 1823,col 18)",
        "(line 1824,col 9)-(line 1824,col 25)",
        "(line 1825,col 9)-(line 1825,col 14)",
        "(line 1826,col 9)-(line 1826,col 18)",
        "(line 1828,col 9)-(line 1828,col 27)",
        "(line 1829,col 9)-(line 1829,col 18)",
        "(line 1830,col 9)-(line 1830,col 25)",
        "(line 1831,col 9)-(line 1831,col 14)",
        "(line 1832,col 9)-(line 1832,col 18)",
        "(line 1834,col 9)-(line 1834,col 62)",
        "(line 1835,col 9)-(line 1835,col 64)",
        "(line 1837,col 9)-(line 1837,col 28)",
        "(line 1838,col 9)-(line 1838,col 38)",
        "(line 1840,col 9)-(line 1844,col 9)",
        "(line 1857,col 9)-(line 1857,col 31)",
        "(line 1860,col 9)-(line 1860,col 34)",
        "(line 1861,col 9)-(line 1861,col 42)",
        "(line 1862,col 9)-(line 1862,col 34)",
        "(line 1864,col 9)-(line 1864,col 35)",
        "(line 1865,col 9)-(line 1865,col 44)",
        "(line 1866,col 9)-(line 1866,col 37)",
        "(line 1869,col 9)-(line 1869,col 85)",
        "(line 1870,col 9)-(line 1870,col 25)",
        "(line 1871,col 9)-(line 1871,col 42)",
        "(line 1873,col 9)-(line 1882,col 9)",
        "(line 1884,col 9)-(line 1884,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 1898,
      "end_line": 2108,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1901,col 9)-(line 1901,col 49)",
        "(line 1902,col 9)-(line 1902,col 61)",
        "(line 1905,col 9)-(line 1905,col 38)",
        "(line 1906,col 9)-(line 1906,col 38)",
        "(line 1909,col 9)-(line 1909,col 19)",
        "(line 1910,col 9)-(line 1910,col 22)",
        "(line 1913,col 9)-(line 1913,col 19)",
        "(line 1914,col 9)-(line 1914,col 19)",
        "(line 1915,col 9)-(line 1915,col 19)",
        "(line 1916,col 9)-(line 1916,col 32)",
        "(line 1917,col 9)-(line 1917,col 42)",
        "(line 1919,col 9)-(line 1928,col 9)",
        "(line 1931,col 9)-(line 1931,col 31)",
        "(line 1932,col 9)-(line 1932,col 38)",
        "(line 1934,col 9)-(line 1934,col 30)",
        "(line 1935,col 9)-(line 1935,col 37)",
        "(line 1937,col 9)-(line 1937,col 24)",
        "(line 1938,col 9)-(line 1938,col 24)",
        "(line 1939,col 9)-(line 1939,col 24)",
        "(line 1940,col 9)-(line 1940,col 24)",
        "(line 1942,col 9)-(line 1942,col 37)",
        "(line 1943,col 9)-(line 1943,col 38)",
        "(line 1945,col 9)-(line 1945,col 55)",
        "(line 1946,col 9)-(line 1946,col 48)",
        "(line 1947,col 9)-(line 1947,col 60)",
        "(line 1950,col 9)-(line 1953,col 9)",
        "(line 1955,col 9)-(line 1955,col 50)",
        "(line 1956,col 9)-(line 1956,col 40)",
        "(line 1958,col 9)-(line 1958,col 35)",
        "(line 1959,col 9)-(line 1959,col 36)",
        "(line 1961,col 9)-(line 1961,col 52)",
        "(line 1964,col 9)-(line 1967,col 9)",
        "(line 1970,col 9)-(line 1970,col 25)",
        "(line 1971,col 9)-(line 1971,col 32)",
        "(line 1972,col 9)-(line 1972,col 19)",
        "(line 1973,col 9)-(line 1973,col 19)",
        "(line 1974,col 9)-(line 1974,col 19)",
        "(line 1977,col 9)-(line 1977,col 37)",
        "(line 1979,col 9)-(line 1979,col 50)",
        "(line 1980,col 9)-(line 1980,col 48)",
        "(line 1981,col 9)-(line 1981,col 20)",
        "(line 1982,col 9)-(line 1982,col 52)",
        "(line 1984,col 9)-(line 1987,col 9)",
        "(line 1990,col 9)-(line 1990,col 25)",
        "(line 1991,col 9)-(line 1991,col 32)",
        "(line 1993,col 9)-(line 1993,col 19)",
        "(line 1994,col 9)-(line 1994,col 19)",
        "(line 1995,col 9)-(line 1995,col 19)",
        "(line 1997,col 9)-(line 1997,col 40)",
        "(line 2009,col 9)-(line 2009,col 42)",
        "(line 2012,col 9)-(line 2012,col 20)",
        "(line 2013,col 9)-(line 2013,col 30)",
        "(line 2014,col 9)-(line 2014,col 20)",
        "(line 2017,col 9)-(line 2017,col 25)",
        "(line 2018,col 9)-(line 2018,col 32)",
        "(line 2020,col 9)-(line 2020,col 34)",
        "(line 2021,col 9)-(line 2021,col 41)",
        "(line 2023,col 9)-(line 2023,col 19)",
        "(line 2024,col 9)-(line 2024,col 19)",
        "(line 2025,col 9)-(line 2025,col 19)",
        "(line 2026,col 9)-(line 2026,col 19)",
        "(line 2028,col 9)-(line 2028,col 38)",
        "(line 2029,col 9)-(line 2029,col 39)",
        "(line 2031,col 9)-(line 2031,col 47)",
        "(line 2032,col 9)-(line 2032,col 40)",
        "(line 2033,col 9)-(line 2033,col 53)",
        "(line 2036,col 9)-(line 2039,col 9)",
        "(line 2041,col 9)-(line 2041,col 51)",
        "(line 2042,col 9)-(line 2042,col 40)",
        "(line 2044,col 9)-(line 2044,col 37)",
        "(line 2045,col 9)-(line 2045,col 38)",
        "(line 2047,col 9)-(line 2047,col 53)",
        "(line 2050,col 9)-(line 2053,col 9)",
        "(line 2056,col 9)-(line 2056,col 34)",
        "(line 2057,col 9)-(line 2057,col 41)",
        "(line 2058,col 9)-(line 2058,col 19)",
        "(line 2059,col 9)-(line 2059,col 19)",
        "(line 2060,col 9)-(line 2060,col 19)",
        "(line 2063,col 9)-(line 2063,col 37)",
        "(line 2065,col 9)-(line 2065,col 51)",
        "(line 2066,col 9)-(line 2066,col 48)",
        "(line 2067,col 9)-(line 2067,col 21)",
        "(line 2068,col 9)-(line 2068,col 53)",
        "(line 2070,col 9)-(line 2073,col 9)",
        "(line 2076,col 9)-(line 2076,col 25)",
        "(line 2077,col 9)-(line 2077,col 32)",
        "(line 2078,col 9)-(line 2078,col 34)",
        "(line 2079,col 9)-(line 2079,col 41)",
        "(line 2080,col 9)-(line 2080,col 19)",
        "(line 2081,col 9)-(line 2081,col 19)",
        "(line 2082,col 9)-(line 2082,col 19)",
        "(line 2085,col 9)-(line 2085,col 37)",
        "(line 2087,col 9)-(line 2087,col 51)",
        "(line 2088,col 9)-(line 2088,col 48)",
        "(line 2089,col 9)-(line 2089,col 21)",
        "(line 2090,col 9)-(line 2090,col 53)",
        "(line 2092,col 9)-(line 2095,col 9)",
        "(line 2098,col 9)-(line 2098,col 59)",
        "(line 2099,col 9)-(line 2099,col 110)",
        "(line 2101,col 9)-(line 2101,col 34)",
        "(line 2102,col 9)-(line 2102,col 44)",
        "(line 2105,col 9)-(line 2105,col 28)",
        "(line 2106,col 9)-(line 2106,col 31)",
        "(line 2107,col 9)-(line 2107,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sin(double)",
      "begin_line": 2115,
      "end_line": 2205,
      "comment": "\n     *  Sine function.\n     *  @param x a number\n     *  @return sin(x)\n     ",
      "child_ranges": [
        "(line 2116,col 9)-(line 2116,col 33)",
        "(line 2117,col 9)-(line 2117,col 25)",
        "(line 2118,col 9)-(line 2118,col 18)",
        "(line 2119,col 9)-(line 2119,col 24)",
        "(line 2122,col 9)-(line 2122,col 15)",
        "(line 2123,col 9)-(line 2126,col 9)",
        "(line 2129,col 9)-(line 2135,col 9)",
        "(line 2137,col 9)-(line 2139,col 9)",
        "(line 2142,col 9)-(line 2187,col 9)",
        "(line 2189,col 9)-(line 2191,col 9)",
        "(line 2193,col 9)-(line 2204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cos(double)",
      "begin_line": 2212,
      "end_line": 2289,
      "comment": "\n     *  Cosine function\n     *  @param x a number\n     *  @return cos(x)\n     ",
      "child_ranges": [
        "(line 2213,col 9)-(line 2213,col 25)",
        "(line 2216,col 9)-(line 2216,col 22)",
        "(line 2217,col 9)-(line 2219,col 9)",
        "(line 2221,col 9)-(line 2223,col 9)",
        "(line 2226,col 9)-(line 2226,col 22)",
        "(line 2227,col 9)-(line 2272,col 9)",
        "(line 2277,col 9)-(line 2288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tan(double)",
      "begin_line": 2296,
      "end_line": 2396,
      "comment": "\n     *   Tangent function\n     *  @param x a number\n     *  @return tan(x)\n     ",
      "child_ranges": [
        "(line 2297,col 9)-(line 2297,col 33)",
        "(line 2298,col 9)-(line 2298,col 25)",
        "(line 2301,col 9)-(line 2301,col 22)",
        "(line 2302,col 9)-(line 2305,col 9)",
        "(line 2308,col 9)-(line 2314,col 9)",
        "(line 2316,col 9)-(line 2318,col 9)",
        "(line 2321,col 9)-(line 2321,col 22)",
        "(line 2322,col 9)-(line 2367,col 9)",
        "(line 2369,col 9)-(line 2382,col 9)",
        "(line 2384,col 9)-(line 2384,col 22)",
        "(line 2385,col 9)-(line 2389,col 9)",
        "(line 2391,col 9)-(line 2393,col 9)",
        "(line 2395,col 9)-(line 2395,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double)",
      "begin_line": 2403,
      "end_line": 2405,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2404,col 9)-(line 2404,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2413,
      "end_line": 2569,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by \u0026pi; if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2414,col 9)-(line 2414,col 31)",
        "(line 2415,col 9)-(line 2415,col 30)",
        "(line 2416,col 9)-(line 2416,col 16)",
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
        "(line 2491,col 9)-(line 2491,col 33)",
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
        "(line 2518,col 9)-(line 2518,col 41)",
        "(line 2520,col 9)-(line 2520,col 22)",
        "(line 2521,col 9)-(line 2521,col 23)",
        "(line 2522,col 9)-(line 2548,col 9)",
        "(line 2550,col 9)-(line 2561,col 9)",
        "(line 2564,col 9)-(line 2566,col 9)",
        "(line 2568,col 9)-(line 2568,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan2(double, double)",
      "begin_line": 2577,
      "end_line": 2687,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between -\u0026pi; and \u0026pi;\n     ",
      "child_ranges": [
        "(line 2578,col 9)-(line 2580,col 9)",
        "(line 2582,col 9)-(line 2604,col 9)",
        "(line 2606,col 9)-(line 2616,col 9)",
        "(line 2618,col 9)-(line 2628,col 9)",
        "(line 2630,col 9)-(line 2638,col 9)",
        "(line 2640,col 9)-(line 2649,col 9)",
        "(line 2651,col 9)-(line 2659,col 9)",
        "(line 2661,col 9)-(line 2664,col 9)",
        "(line 2667,col 9)-(line 2667,col 39)",
        "(line 2668,col 9)-(line 2668,col 42)",
        "(line 2669,col 9)-(line 2669,col 33)",
        "(line 2672,col 9)-(line 2672,col 29)",
        "(line 2673,col 9)-(line 2673,col 32)",
        "(line 2674,col 9)-(line 2674,col 36)",
        "(line 2675,col 9)-(line 2675,col 27)",
        "(line 2677,col 9)-(line 2677,col 62)",
        "(line 2679,col 9)-(line 2679,col 23)",
        "(line 2680,col 9)-(line 2680,col 31)",
        "(line 2681,col 9)-(line 2681,col 18)",
        "(line 2684,col 9)-(line 2684,col 44)",
        "(line 2686,col 9)-(line 2686,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toRadians(double)",
      "begin_line": 2694,
      "end_line": 2704,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2696,col 9)-(line 2696,col 49)",
        "(line 2697,col 9)-(line 2697,col 50)",
        "(line 2699,col 9)-(line 2699,col 39)",
        "(line 2700,col 9)-(line 2700,col 36)",
        "(line 2701,col 9)-(line 2701,col 27)",
        "(line 2703,col 9)-(line 2703,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toDegrees(double)",
      "begin_line": 2711,
      "end_line": 2721,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2713,col 9)-(line 2713,col 46)",
        "(line 2714,col 9)-(line 2714,col 50)",
        "(line 2716,col 9)-(line 2716,col 39)",
        "(line 2717,col 9)-(line 2717,col 36)",
        "(line 2718,col 9)-(line 2718,col 27)",
        "(line 2720,col 9)-(line 2720,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(int)",
      "begin_line": 2728,
      "end_line": 2730,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2729,col 9)-(line 2729,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(long)",
      "begin_line": 2737,
      "end_line": 2739,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2738,col 9)-(line 2738,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(float)",
      "begin_line": 2746,
      "end_line": 2748,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2747,col 9)-(line 2747,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(double)",
      "begin_line": 2755,
      "end_line": 2757,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 2756,col 9)-(line 2756,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(double)",
      "begin_line": 2765,
      "end_line": 2767,
      "comment": "",
      "child_ranges": [
        "(line 2766,col 9)-(line 2766,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(double, double)",
      "begin_line": 2785,
      "end_line": 2823,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 2788,col 9)-(line 2792,col 9)",
        "(line 2797,col 9)-(line 2797,col 51)",
        "(line 2798,col 9)-(line 2798,col 51)",
        "(line 2799,col 9)-(line 2799,col 51)",
        "(line 2800,col 9)-(line 2800,col 51)",
        "(line 2802,col 9)-(line 2821,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.floor(double)",
      "begin_line": 2829,
      "end_line": 2842,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 2830,col 9)-(line 2830,col 15)",
        "(line 2832,col 9)-(line 2834,col 9)",
        "(line 2836,col 9)-(line 2836,col 21)",
        "(line 2837,col 9)-(line 2839,col 9)",
        "(line 2841,col 9)-(line 2841,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ceil(double)",
      "begin_line": 2848,
      "end_line": 2857,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 2849,col 9)-(line 2849,col 17)",
        "(line 2851,col 9)-(line 2851,col 21)",
        "(line 2852,col 9)-(line 2854,col 9)",
        "(line 2856,col 9)-(line 2856,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.rint(double)",
      "begin_line": 2863,
      "end_line": 2877,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 2864,col 9)-(line 2864,col 28)",
        "(line 2865,col 9)-(line 2865,col 25)",
        "(line 2867,col 9)-(line 2869,col 9)",
        "(line 2870,col 9)-(line 2872,col 9)",
        "(line 2875,col 9)-(line 2875,col 26)",
        "(line 2876,col 9)-(line 2876,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(double)",
      "begin_line": 2883,
      "end_line": 2885,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 2884,col 9)-(line 2884,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(float)",
      "begin_line": 2891,
      "end_line": 2893,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 2892,col 9)-(line 2892,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(int, int)",
      "begin_line": 2900,
      "end_line": 2902,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 2901,col 9)-(line 2901,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(long, long)",
      "begin_line": 2909,
      "end_line": 2911,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 2910,col 9)-(line 2910,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(float, float)",
      "begin_line": 2918,
      "end_line": 2920,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 2919,col 9)-(line 2919,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(double, double)",
      "begin_line": 2927,
      "end_line": 2929,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 2928,col 9)-(line 2928,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(int, int)",
      "begin_line": 2936,
      "end_line": 2938,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 2937,col 9)-(line 2937,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(long, long)",
      "begin_line": 2945,
      "end_line": 2947,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 2946,col 9)-(line 2946,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(float, float)",
      "begin_line": 2954,
      "end_line": 2956,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 2955,col 9)-(line 2955,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(double, double)",
      "begin_line": 2963,
      "end_line": 2965,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 2964,col 9)-(line 2964,col 69)"
      ]
    }
  ]
}