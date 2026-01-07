{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/util/FastMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 3263,
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
      "end_line": 228,
      "comment": " Compute the hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinh(double)",
      "begin_line": 234,
      "end_line": 256,
      "comment": " Compute the hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 33)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 23)",
        "(line 243,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanh(double)",
      "begin_line": 262,
      "end_line": 285,
      "comment": " Compute the hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 33)",
        "(line 265,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 23)",
        "(line 271,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acosh(double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " Compute the inverse hyperbolic cosine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic cosine of a\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asinh(double)",
      "begin_line": 299,
      "end_line": 325,
      "comment": " Compute the inverse hyperbolic sine of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic sine of a\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 33)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 24)",
        "(line 308,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atanh(double)",
      "begin_line": 331,
      "end_line": 357,
      "comment": " Compute the inverse hyperbolic tangent of a number.\n     * @param a number on which evaluation is done\n     * @return inverse hyperbolic tangent of a\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 33)",
        "(line 334,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 24)",
        "(line 340,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.signum(double)",
      "begin_line": 364,
      "end_line": 366,
      "comment": " Compute the signum of a number.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1, 0, +1 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextUp(double)",
      "begin_line": 372,
      "end_line": 374,
      "comment": " Compute next number towards positive infinity.\n     * @param a number to which neighbor should be computed\n     * @return neighbor of a towards positive infinity\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.random()",
      "begin_line": 379,
      "end_line": 381,
      "comment": " Returns a pseudo-random number between 0.0 and 1.0.\n     * @return a random number between 0.0 and 1.0\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Exponential function.\n     *\n     * Computes exp(x), function result is nearly rounded.   It will be correctly\n     * rounded to the theoretical value for 99.9% of input values, otherwise it will\n     * have a 1 UPL error.\n     *\n     * Method:\n     *    Lookup intVal \u003d exp(int(x))\n     *    Lookup fracVal \u003d exp(int(x-int(x) / 1024.0) * 1024.0 );\n     *    Compute z as the exponential of the remaining bits by a polynomial minus one\n     *    exp(x) \u003d intVal * fracVal * (1 + z)\n     *\n     * Accuracy:\n     *    Calculation is done with 63 bits of precision, so result should be correctly\n     *    rounded for 99.9% of input values, with less than 1 ULP error otherwise.\n     *\n     * @param x   a double\n     * @return double e\u003csup\u003ex\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.exp(double, double, double[])",
      "begin_line": 414,
      "end_line": 529,
      "comment": "\n     * Internal helper method for exponential function.\n     * @param x original argument of the exponential function\n     * @param extra extra bits of precision on input (To Be Confirmed)\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return exp(x)\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 24)",
        "(line 416,col 9)-(line 416,col 24)",
        "(line 417,col 9)-(line 417,col 19)",
        "(line 423,col 9)-(line 473,col 9)",
        "(line 479,col 9)-(line 479,col 58)",
        "(line 480,col 9)-(line 480,col 59)",
        "(line 481,col 9)-(line 481,col 59)",
        "(line 487,col 9)-(line 487,col 63)",
        "(line 496,col 9)-(line 496,col 39)",
        "(line 497,col 9)-(line 497,col 45)",
        "(line 498,col 9)-(line 498,col 45)",
        "(line 499,col 9)-(line 499,col 30)",
        "(line 500,col 9)-(line 500,col 49)",
        "(line 507,col 9)-(line 507,col 44)",
        "(line 508,col 9)-(line 508,col 90)",
        "(line 514,col 9)-(line 514,col 43)",
        "(line 515,col 9)-(line 515,col 28)",
        "(line 516,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 528,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expm1(double)",
      "begin_line": 535,
      "end_line": 670,
      "comment": " Compute exp(x) - 1\n     * @param x number to compute shifted exponential\n     * @return exp(x) - 1\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 555,col 21)",
        "(line 556,col 9)-(line 556,col 21)",
        "(line 557,col 9)-(line 557,col 23)",
        "(line 558,col 9)-(line 558,col 33)",
        "(line 560,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 579,col 9)",
        "(line 583,col 9)-(line 583,col 41)",
        "(line 584,col 9)-(line 584,col 49)",
        "(line 585,col 9)-(line 585,col 48)",
        "(line 586,col 9)-(line 586,col 48)",
        "(line 587,col 9)-(line 587,col 26)",
        "(line 588,col 9)-(line 588,col 26)",
        "(line 590,col 9)-(line 590,col 28)",
        "(line 591,col 9)-(line 591,col 30)",
        "(line 592,col 9)-(line 592,col 31)",
        "(line 593,col 9)-(line 593,col 18)",
        "(line 595,col 9)-(line 595,col 33)",
        "(line 596,col 9)-(line 596,col 32)",
        "(line 597,col 9)-(line 597,col 24)",
        "(line 598,col 9)-(line 598,col 18)",
        "(line 601,col 9)-(line 601,col 31)",
        "(line 603,col 9)-(line 603,col 31)",
        "(line 604,col 9)-(line 604,col 46)",
        "(line 605,col 9)-(line 605,col 18)",
        "(line 607,col 9)-(line 607,col 31)",
        "(line 608,col 9)-(line 608,col 40)",
        "(line 609,col 9)-(line 609,col 18)",
        "(line 611,col 9)-(line 611,col 31)",
        "(line 612,col 9)-(line 612,col 38)",
        "(line 613,col 9)-(line 613,col 18)",
        "(line 617,col 9)-(line 617,col 26)",
        "(line 618,col 9)-(line 618,col 35)",
        "(line 619,col 9)-(line 619,col 18)",
        "(line 621,col 9)-(line 621,col 23)",
        "(line 623,col 9)-(line 623,col 32)",
        "(line 624,col 9)-(line 624,col 18)",
        "(line 626,col 9)-(line 626,col 26)",
        "(line 628,col 9)-(line 628,col 35)",
        "(line 629,col 9)-(line 629,col 18)",
        "(line 631,col 9)-(line 631,col 23)",
        "(line 633,col 9)-(line 633,col 32)",
        "(line 634,col 9)-(line 634,col 18)",
        "(line 636,col 9)-(line 667,col 9)",
        "(line 669,col 9)-(line 669,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowexp(double, double[])",
      "begin_line": 679,
      "end_line": 706,
      "comment": "\n     *  For x between 0 and 1, returns exp(x), uses extended precision\n     *  @param x argument of exponential\n     *  @param result placeholder where to place exp(x) split in two terms\n     *  for extra precision (i.e. exp(x) \u003d result[0] ° result[1]\n     *  @return exp(x)\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 42)",
        "(line 681,col 9)-(line 681,col 42)",
        "(line 682,col 9)-(line 682,col 45)",
        "(line 683,col 9)-(line 683,col 42)",
        "(line 684,col 9)-(line 684,col 21)",
        "(line 685,col 9)-(line 685,col 28)",
        "(line 687,col 9)-(line 698,col 9)",
        "(line 700,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.split(double, double[])",
      "begin_line": 713,
      "end_line": 723,
      "comment": " Compute split[0], split[1] such that their sum is equal to d,\n     * and split[0] has its 30 least significant bits as zero.\n     * @param d number to split\n     * @param split placeholder where to place the result\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.resplit(double[])",
      "begin_line": 729,
      "end_line": 742,
      "comment": " Recompute a split.\n     * @param a input/out array containing the split, changed\n     * on output\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 37)",
        "(line 731,col 9)-(line 731,col 44)",
        "(line 733,col 9)-(line 741,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitMult(double[], double[], double[])",
      "begin_line": 749,
      "end_line": 755,
      "comment": " Multiply two numbers in split form.\n     * @param a first term of multiplication\n     * @param b second term of multiplication\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 29)",
        "(line 751,col 9)-(line 751,col 57)",
        "(line 754,col 9)-(line 754,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitAdd(double[], double[], double[])",
      "begin_line": 762,
      "end_line": 767,
      "comment": " Add two numbers in split form.\n     * @param a first term of addition\n     * @param b second term of addition\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 29)",
        "(line 764,col 9)-(line 764,col 29)",
        "(line 766,col 9)-(line 766,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.splitReciprocal(double[], double[])",
      "begin_line": 787,
      "end_line": 815,
      "comment": " Compute the reciprocal of in.  Use the following algorithm.\n     *  in \u003d c + d.\n     *  want to find x + y such that x+y \u003d 1/(c+d) and x is much\n     *  larger than y and x has several zero bits on the right.\n     *\n     *  Set b \u003d 1/(2^22),  a \u003d 1 - b.  Thus (a+b) \u003d 1.\n     *  Use following identity to compute (a+b)/(c+d)\n     *\n     *  (a+b)/(c+d)  \u003d   a/c   +    (bc - ad) / (c^2 + cd)\n     *  set x \u003d a/c  and y \u003d (bc - ad) / (c^2 + cd)\n     *  This will be close to the right answer, but there will be\n     *  some rounding in the calculation of X.  So by carefully\n     *  computing 1 - (c+d)(x+y) we can compute an error and\n     *  add that back in.   This is done carefully so that terms\n     *  of similar size are subtracted first.\n     *  @param in initial number, in split form\n     *  @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 39)",
        "(line 789,col 9)-(line 789,col 33)",
        "(line 791,col 9)-(line 794,col 9)",
        "(line 796,col 9)-(line 796,col 30)",
        "(line 797,col 9)-(line 797,col 68)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 804,col 9)-(line 804,col 24)",
        "(line 806,col 9)-(line 814,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.quadMult(double[], double[], double[])",
      "begin_line": 822,
      "end_line": 869,
      "comment": " Compute (a[0] + a[1]) * (b[0] + b[1]) in extended precision.\n     * @param a first term of the multiplication\n     * @param b second term of the multiplication\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 42)",
        "(line 824,col 9)-(line 824,col 42)",
        "(line 825,col 9)-(line 825,col 42)",
        "(line 828,col 9)-(line 828,col 24)",
        "(line 829,col 9)-(line 829,col 24)",
        "(line 830,col 9)-(line 830,col 30)",
        "(line 832,col 9)-(line 832,col 26)",
        "(line 833,col 9)-(line 833,col 26)",
        "(line 836,col 9)-(line 836,col 24)",
        "(line 837,col 9)-(line 837,col 30)",
        "(line 839,col 9)-(line 839,col 39)",
        "(line 840,col 9)-(line 840,col 58)",
        "(line 841,col 9)-(line 841,col 24)",
        "(line 842,col 9)-(line 842,col 32)",
        "(line 843,col 9)-(line 843,col 58)",
        "(line 844,col 9)-(line 844,col 24)",
        "(line 847,col 9)-(line 847,col 24)",
        "(line 848,col 9)-(line 848,col 24)",
        "(line 849,col 9)-(line 849,col 30)",
        "(line 851,col 9)-(line 851,col 32)",
        "(line 852,col 9)-(line 852,col 58)",
        "(line 853,col 9)-(line 853,col 24)",
        "(line 854,col 9)-(line 854,col 32)",
        "(line 855,col 9)-(line 855,col 58)",
        "(line 856,col 9)-(line 856,col 24)",
        "(line 859,col 9)-(line 859,col 24)",
        "(line 860,col 9)-(line 860,col 24)",
        "(line 861,col 9)-(line 861,col 30)",
        "(line 863,col 9)-(line 863,col 32)",
        "(line 864,col 9)-(line 864,col 58)",
        "(line 865,col 9)-(line 865,col 24)",
        "(line 866,col 9)-(line 866,col 32)",
        "(line 867,col 9)-(line 867,col 58)",
        "(line 868,col 9)-(line 868,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.expint(int, double[])",
      "begin_line": 876,
      "end_line": 914,
      "comment": " Compute exp(p) for a integer p in extended precision.\n     * @param p integer whose exponential is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return exp(p) in standard precision (equal to result[0] + result[1])\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 42)",
        "(line 879,col 9)-(line 879,col 42)",
        "(line 880,col 9)-(line 880,col 42)",
        "(line 889,col 9)-(line 889,col 34)",
        "(line 890,col 9)-(line 890,col 39)",
        "(line 892,col 9)-(line 892,col 23)",
        "(line 894,col 9)-(line 904,col 9)",
        "(line 906,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 913,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double)",
      "begin_line": 923,
      "end_line": 925,
      "comment": "\n     * Natural logarithm.\n     *\n     * @param x   a double\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log(double, double[])",
      "begin_line": 933,
      "end_line": 1150,
      "comment": "\n     * Internal helper method for natural logarithm function.\n     * @param x original argument of the natural logarithm function\n     * @param hiPrec extra bits of precision on output (To Be Confirmed)\n     * @return log(x)\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 47)",
        "(line 937,col 9)-(line 945,col 9)",
        "(line 948,col 9)-(line 954,col 9)",
        "(line 957,col 9)-(line 957,col 41)",
        "(line 959,col 9)-(line 976,col 9)",
        "(line 979,col 9)-(line 1024,col 9)",
        "(line 1027,col 9)-(line 1027,col 74)",
        "(line 1038,col 9)-(line 1038,col 111)",
        "(line 1040,col 9)-(line 1040,col 26)",
        "(line 1041,col 9)-(line 1041,col 26)",
        "(line 1043,col 9)-(line 1101,col 9)",
        "(line 1117,col 9)-(line 1117,col 30)",
        "(line 1118,col 9)-(line 1118,col 23)",
        "(line 1119,col 9)-(line 1119,col 28)",
        "(line 1120,col 9)-(line 1120,col 33)",
        "(line 1121,col 9)-(line 1121,col 14)",
        "(line 1122,col 9)-(line 1122,col 18)",
        "(line 1124,col 9)-(line 1124,col 21)",
        "(line 1125,col 9)-(line 1125,col 28)",
        "(line 1126,col 9)-(line 1126,col 14)",
        "(line 1127,col 9)-(line 1127,col 18)",
        "(line 1129,col 9)-(line 1129,col 27)",
        "(line 1130,col 9)-(line 1130,col 34)",
        "(line 1131,col 9)-(line 1131,col 14)",
        "(line 1132,col 9)-(line 1132,col 18)",
        "(line 1134,col 9)-(line 1134,col 23)",
        "(line 1135,col 9)-(line 1135,col 30)",
        "(line 1136,col 9)-(line 1136,col 14)",
        "(line 1137,col 9)-(line 1137,col 18)",
        "(line 1139,col 9)-(line 1139,col 21)",
        "(line 1140,col 9)-(line 1140,col 28)",
        "(line 1141,col 9)-(line 1141,col 14)",
        "(line 1142,col 9)-(line 1142,col 18)",
        "(line 1144,col 9)-(line 1147,col 9)",
        "(line 1149,col 9)-(line 1149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log1p(double)",
      "begin_line": 1156,
      "end_line": 1189,
      "comment": " Compute log(1 + x).\n     * @param x a number\n     * @return log(1 + x)\n     ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1157,col 29)",
        "(line 1158,col 9)-(line 1158,col 38)",
        "(line 1160,col 9)-(line 1162,col 9)",
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1168,col 9)-(line 1181,col 9)",
        "(line 1184,col 9)-(line 1184,col 47)",
        "(line 1185,col 9)-(line 1185,col 24)",
        "(line 1186,col 9)-(line 1186,col 18)",
        "(line 1188,col 9)-(line 1188,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.log10(double)",
      "begin_line": 1195,
      "end_line": 1208,
      "comment": " Compute the base 10 logarithm.\n     * @param x a number\n     * @return log10(x)\n     ",
      "child_ranges": [
        "(line 1196,col 9)-(line 1196,col 46)",
        "(line 1198,col 9)-(line 1198,col 23)",
        "(line 1200,col 9)-(line 1200,col 52)",
        "(line 1201,col 9)-(line 1201,col 49)",
        "(line 1202,col 9)-(line 1202,col 55)",
        "(line 1204,col 9)-(line 1204,col 49)",
        "(line 1205,col 9)-(line 1205,col 52)",
        "(line 1207,col 9)-(line 1207,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.pow(double, double)",
      "begin_line": 1217,
      "end_line": 1374,
      "comment": "\n     * Power function.  Compute x^y.\n     *\n     * @param x   a double\n     * @param y   a double\n     * @return double\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 43)",
        "(line 1220,col 9)-(line 1222,col 9)",
        "(line 1224,col 9)-(line 1226,col 9)",
        "(line 1229,col 9)-(line 1256,col 9)",
        "(line 1258,col 9)-(line 1267,col 9)",
        "(line 1269,col 9)-(line 1278,col 9)",
        "(line 1280,col 9)-(line 1302,col 9)",
        "(line 1304,col 9)-(line 1315,col 9)",
        "(line 1318,col 9)-(line 1330,col 9)",
        "(line 1333,col 9)-(line 1333,col 18)",
        "(line 1334,col 9)-(line 1334,col 18)",
        "(line 1335,col 9)-(line 1344,col 9)",
        "(line 1347,col 9)-(line 1347,col 20)",
        "(line 1348,col 9)-(line 1348,col 28)",
        "(line 1349,col 9)-(line 1349,col 28)",
        "(line 1352,col 9)-(line 1352,col 41)",
        "(line 1353,col 9)-(line 1353,col 40)",
        "(line 1354,col 9)-(line 1354,col 26)",
        "(line 1355,col 9)-(line 1355,col 19)",
        "(line 1358,col 9)-(line 1358,col 35)",
        "(line 1359,col 9)-(line 1359,col 57)",
        "(line 1361,col 9)-(line 1361,col 20)",
        "(line 1362,col 9)-(line 1362,col 31)",
        "(line 1364,col 9)-(line 1364,col 31)",
        "(line 1365,col 9)-(line 1365,col 35)",
        "(line 1366,col 9)-(line 1366,col 34)",
        "(line 1367,col 9)-(line 1367,col 26)",
        "(line 1368,col 9)-(line 1368,col 26)",
        "(line 1369,col 9)-(line 1369,col 20)",
        "(line 1371,col 9)-(line 1371,col 48)",
        "(line 1373,col 9)-(line 1373,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowLog(double)",
      "begin_line": 1395,
      "end_line": 1437,
      "comment": " xi in the range of [1, 2].\n     *                                3        5        7\n     *      x+1           /          x        x        x          \\\n     *  ln ----- \u003d   2 *  |  x  +   ----  +  ----  +  ---- + ...  |\n     *      1-x           \\          3        5        7          /\n     *\n     * So, compute a Remez approximation of the following function\n     *\n     *  ln ((sqrt(x)+1)/(1-sqrt(x)))  /  x\n     *\n     * This will be an even function with only positive coefficents.\n     * x is in the range [0 - 1/3].\n     *\n     * Transform xi for input to the above function by setting\n     * x \u003d (xi-1)/(xi+1).   Input to the polynomial is x^2, then\n     * the result is multiplied by x.\n     * @param xi number from which log is requested\n     * @return log(xi)\n     ",
      "child_ranges": [
        "(line 1396,col 9)-(line 1396,col 35)",
        "(line 1397,col 9)-(line 1397,col 36)",
        "(line 1398,col 9)-(line 1398,col 35)",
        "(line 1399,col 9)-(line 1399,col 35)",
        "(line 1401,col 9)-(line 1401,col 21)",
        "(line 1404,col 9)-(line 1404,col 20)",
        "(line 1405,col 9)-(line 1405,col 19)",
        "(line 1406,col 9)-(line 1406,col 30)",
        "(line 1407,col 9)-(line 1407,col 20)",
        "(line 1408,col 9)-(line 1408,col 19)",
        "(line 1409,col 9)-(line 1409,col 27)",
        "(line 1410,col 9)-(line 1410,col 20)",
        "(line 1411,col 9)-(line 1411,col 20)",
        "(line 1414,col 9)-(line 1414,col 28)",
        "(line 1420,col 9)-(line 1420,col 56)",
        "(line 1421,col 9)-(line 1421,col 56)",
        "(line 1423,col 9)-(line 1430,col 9)",
        "(line 1432,col 9)-(line 1432,col 27)",
        "(line 1433,col 9)-(line 1433,col 20)",
        "(line 1434,col 9)-(line 1434,col 20)",
        "(line 1436,col 9)-(line 1436,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowSin(double, double[])",
      "begin_line": 1445,
      "end_line": 1479,
      "comment": "\n     * For x between 0 and pi/4 compute sine.\n     * @param x number from which sine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 1446,col 9)-(line 1446,col 42)",
        "(line 1447,col 9)-(line 1447,col 42)",
        "(line 1448,col 9)-(line 1448,col 45)",
        "(line 1449,col 9)-(line 1449,col 42)",
        "(line 1450,col 9)-(line 1450,col 21)",
        "(line 1451,col 9)-(line 1451,col 28)",
        "(line 1453,col 9)-(line 1471,col 9)",
        "(line 1473,col 9)-(line 1476,col 9)",
        "(line 1478,col 9)-(line 1478,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.slowCos(double, double[])",
      "begin_line": 1487,
      "end_line": 1522,
      "comment": "\n     *  For x between 0 and pi/4 compute cosine\n     * @param x number from which cosine is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 1489,col 9)-(line 1489,col 42)",
        "(line 1490,col 9)-(line 1490,col 42)",
        "(line 1491,col 9)-(line 1491,col 45)",
        "(line 1492,col 9)-(line 1492,col 42)",
        "(line 1493,col 9)-(line 1493,col 21)",
        "(line 1494,col 9)-(line 1494,col 28)",
        "(line 1496,col 9)-(line 1514,col 9)",
        "(line 1516,col 9)-(line 1519,col 9)",
        "(line 1521,col 9)-(line 1521,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.buildSinCosTables()",
      "begin_line": 1526,
      "end_line": 1618,
      "comment": " Build the sine and cosine tables.\n     ",
      "child_ranges": [
        "(line 1527,col 9)-(line 1527,col 46)",
        "(line 1530,col 9)-(line 1540,col 9)",
        "(line 1543,col 9)-(line 1596,col 9)",
        "(line 1599,col 9)-(line 1616,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polySine(double)",
      "begin_line": 1626,
      "end_line": 1639,
      "comment": "\n     *  Computes sin(x) - x, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return sin(x) - x\n     ",
      "child_ranges": [
        "(line 1628,col 9)-(line 1628,col 24)",
        "(line 1630,col 9)-(line 1630,col 41)",
        "(line 1631,col 9)-(line 1631,col 44)",
        "(line 1632,col 9)-(line 1632,col 42)",
        "(line 1633,col 9)-(line 1633,col 42)",
        "(line 1636,col 9)-(line 1636,col 23)",
        "(line 1638,col 9)-(line 1638,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.polyCosine(double)",
      "begin_line": 1647,
      "end_line": 1657,
      "comment": "\n     *  Computes cos(x) - 1, where |x| \u003c 1/16.\n     *  Use a Remez polynomial approximation.\n     *  @param x a number smaller than 1/16\n     *  @return cos(x) - 1\n     ",
      "child_ranges": [
        "(line 1648,col 9)-(line 1648,col 24)",
        "(line 1650,col 9)-(line 1650,col 40)",
        "(line 1651,col 9)-(line 1651,col 44)",
        "(line 1652,col 9)-(line 1652,col 42)",
        "(line 1653,col 9)-(line 1653,col 42)",
        "(line 1654,col 9)-(line 1654,col 16)",
        "(line 1656,col 9)-(line 1656,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sinQ(double, double)",
      "begin_line": 1666,
      "end_line": 1781,
      "comment": "\n     *  Compute sine over the first quadrant (0 \u003c x \u003c pi/2).\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return sin(xa + xb)\n     ",
      "child_ranges": [
        "(line 1667,col 9)-(line 1667,col 43)",
        "(line 1668,col 9)-(line 1668,col 50)",
        "(line 1671,col 9)-(line 1671,col 47)",
        "(line 1672,col 9)-(line 1672,col 47)",
        "(line 1673,col 9)-(line 1673,col 49)",
        "(line 1674,col 9)-(line 1674,col 49)",
        "(line 1677,col 9)-(line 1677,col 33)",
        "(line 1678,col 9)-(line 1678,col 43)",
        "(line 1679,col 9)-(line 1679,col 35)",
        "(line 1680,col 9)-(line 1680,col 51)",
        "(line 1683,col 9)-(line 1683,col 51)",
        "(line 1684,col 9)-(line 1684,col 47)",
        "(line 1685,col 9)-(line 1685,col 36)",
        "(line 1686,col 9)-(line 1686,col 24)",
        "(line 1689,col 9)-(line 1689,col 22)",
        "(line 1712,col 9)-(line 1712,col 21)",
        "(line 1713,col 9)-(line 1713,col 21)",
        "(line 1715,col 9)-(line 1715,col 25)",
        "(line 1716,col 9)-(line 1716,col 25)",
        "(line 1717,col 9)-(line 1717,col 32)",
        "(line 1718,col 9)-(line 1718,col 14)",
        "(line 1719,col 9)-(line 1719,col 18)",
        "(line 1721,col 9)-(line 1721,col 28)",
        "(line 1722,col 9)-(line 1722,col 18)",
        "(line 1723,col 9)-(line 1723,col 25)",
        "(line 1724,col 9)-(line 1724,col 14)",
        "(line 1725,col 9)-(line 1725,col 18)",
        "(line 1727,col 9)-(line 1727,col 50)",
        "(line 1742,col 9)-(line 1742,col 76)",
        "(line 1769,col 9)-(line 1776,col 9)",
        "(line 1778,col 9)-(line 1778,col 23)",
        "(line 1780,col 9)-(line 1780,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cosQ(double, double)",
      "begin_line": 1790,
      "end_line": 1799,
      "comment": "\n     * Compute cosine in the first quadrant by subtracting input from PI/2 and\n     * then calling sinQ.  This is more accurate as the input approaches PI/2.\n     *  @param xa number from which cosine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @return cos(xa + xb)\n     ",
      "child_ranges": [
        "(line 1791,col 9)-(line 1791,col 47)",
        "(line 1792,col 9)-(line 1792,col 50)",
        "(line 1794,col 9)-(line 1794,col 35)",
        "(line 1795,col 9)-(line 1795,col 36)",
        "(line 1796,col 9)-(line 1796,col 23)",
        "(line 1798,col 9)-(line 1798,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tanQ(double, double, boolean)",
      "begin_line": 1809,
      "end_line": 1944,
      "comment": "\n     *  Compute tangent (or cotangent) over the first quadrant.   0 \u003c x \u003c pi/2\n     *  Use combination of table lookup and rational polynomial expansion.\n     *  @param xa number from which sine is requested\n     *  @param xb extra bits for x (may be 0.0)\n     *  @param cotanFlag if true, compute the cotangent instead of the tangent\n     *  @return tan(xa+xb) (or cotangent, depending on cotanFlag)\n     ",
      "child_ranges": [
        "(line 1811,col 9)-(line 1811,col 43)",
        "(line 1812,col 9)-(line 1812,col 50)",
        "(line 1815,col 9)-(line 1815,col 47)",
        "(line 1816,col 9)-(line 1816,col 47)",
        "(line 1817,col 9)-(line 1817,col 49)",
        "(line 1818,col 9)-(line 1818,col 49)",
        "(line 1821,col 9)-(line 1821,col 33)",
        "(line 1822,col 9)-(line 1822,col 43)",
        "(line 1823,col 9)-(line 1823,col 35)",
        "(line 1824,col 9)-(line 1824,col 51)",
        "(line 1827,col 9)-(line 1827,col 45)",
        "(line 1828,col 9)-(line 1828,col 47)",
        "(line 1829,col 9)-(line 1829,col 36)",
        "(line 1830,col 9)-(line 1830,col 24)",
        "(line 1855,col 9)-(line 1855,col 21)",
        "(line 1856,col 9)-(line 1856,col 21)",
        "(line 1859,col 9)-(line 1859,col 25)",
        "(line 1860,col 9)-(line 1860,col 25)",
        "(line 1861,col 9)-(line 1861,col 32)",
        "(line 1862,col 9)-(line 1862,col 14)",
        "(line 1863,col 9)-(line 1863,col 18)",
        "(line 1865,col 9)-(line 1865,col 26)",
        "(line 1866,col 9)-(line 1866,col 18)",
        "(line 1867,col 9)-(line 1867,col 25)",
        "(line 1868,col 9)-(line 1868,col 14)",
        "(line 1869,col 9)-(line 1869,col 18)",
        "(line 1871,col 9)-(line 1871,col 46)",
        "(line 1872,col 9)-(line 1872,col 70)",
        "(line 1874,col 9)-(line 1874,col 28)",
        "(line 1875,col 9)-(line 1875,col 38)",
        "(line 1879,col 9)-(line 1879,col 28)",
        "(line 1881,col 9)-(line 1881,col 26)",
        "(line 1882,col 9)-(line 1882,col 18)",
        "(line 1883,col 9)-(line 1883,col 25)",
        "(line 1884,col 9)-(line 1884,col 14)",
        "(line 1885,col 9)-(line 1885,col 18)",
        "(line 1887,col 9)-(line 1887,col 27)",
        "(line 1888,col 9)-(line 1888,col 18)",
        "(line 1889,col 9)-(line 1889,col 25)",
        "(line 1890,col 9)-(line 1890,col 14)",
        "(line 1891,col 9)-(line 1891,col 18)",
        "(line 1893,col 9)-(line 1893,col 62)",
        "(line 1894,col 9)-(line 1894,col 64)",
        "(line 1896,col 9)-(line 1896,col 28)",
        "(line 1897,col 9)-(line 1897,col 38)",
        "(line 1899,col 9)-(line 1903,col 9)",
        "(line 1916,col 9)-(line 1916,col 31)",
        "(line 1919,col 9)-(line 1919,col 34)",
        "(line 1920,col 9)-(line 1920,col 42)",
        "(line 1921,col 9)-(line 1921,col 34)",
        "(line 1923,col 9)-(line 1923,col 35)",
        "(line 1924,col 9)-(line 1924,col 44)",
        "(line 1925,col 9)-(line 1925,col 37)",
        "(line 1928,col 9)-(line 1928,col 85)",
        "(line 1929,col 9)-(line 1929,col 25)",
        "(line 1930,col 9)-(line 1930,col 42)",
        "(line 1932,col 9)-(line 1941,col 9)",
        "(line 1943,col 9)-(line 1943,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.reducePayneHanek(double, double[])",
      "begin_line": 1957,
      "end_line": 2167,
      "comment": " Reduce the input argument using the Payne and Hanek method.\n     *  This is good for all inputs 0.0 \u003c x \u003c inf\n     *  Output is remainder after dividing by PI/2\n     *  The result array should contain 3 numbers.\n     *  result[0] is the integer portion, so mod 4 this gives the quadrant.\n     *  result[1] is the upper bits of the remainder\n     *  result[2] is the lower bits of the remainder\n     *\n     * @param x number to reduce\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 1960,col 9)-(line 1960,col 49)",
        "(line 1961,col 9)-(line 1961,col 61)",
        "(line 1964,col 9)-(line 1964,col 38)",
        "(line 1965,col 9)-(line 1965,col 38)",
        "(line 1968,col 9)-(line 1968,col 19)",
        "(line 1969,col 9)-(line 1969,col 22)",
        "(line 1972,col 9)-(line 1972,col 19)",
        "(line 1973,col 9)-(line 1973,col 19)",
        "(line 1974,col 9)-(line 1974,col 19)",
        "(line 1975,col 9)-(line 1975,col 32)",
        "(line 1976,col 9)-(line 1976,col 42)",
        "(line 1978,col 9)-(line 1987,col 9)",
        "(line 1990,col 9)-(line 1990,col 31)",
        "(line 1991,col 9)-(line 1991,col 38)",
        "(line 1993,col 9)-(line 1993,col 30)",
        "(line 1994,col 9)-(line 1994,col 37)",
        "(line 1996,col 9)-(line 1996,col 24)",
        "(line 1997,col 9)-(line 1997,col 24)",
        "(line 1998,col 9)-(line 1998,col 24)",
        "(line 1999,col 9)-(line 1999,col 24)",
        "(line 2001,col 9)-(line 2001,col 37)",
        "(line 2002,col 9)-(line 2002,col 38)",
        "(line 2004,col 9)-(line 2004,col 55)",
        "(line 2005,col 9)-(line 2005,col 48)",
        "(line 2006,col 9)-(line 2006,col 60)",
        "(line 2009,col 9)-(line 2012,col 9)",
        "(line 2014,col 9)-(line 2014,col 50)",
        "(line 2015,col 9)-(line 2015,col 40)",
        "(line 2017,col 9)-(line 2017,col 35)",
        "(line 2018,col 9)-(line 2018,col 36)",
        "(line 2020,col 9)-(line 2020,col 52)",
        "(line 2023,col 9)-(line 2026,col 9)",
        "(line 2029,col 9)-(line 2029,col 25)",
        "(line 2030,col 9)-(line 2030,col 32)",
        "(line 2031,col 9)-(line 2031,col 19)",
        "(line 2032,col 9)-(line 2032,col 19)",
        "(line 2033,col 9)-(line 2033,col 19)",
        "(line 2036,col 9)-(line 2036,col 37)",
        "(line 2038,col 9)-(line 2038,col 50)",
        "(line 2039,col 9)-(line 2039,col 48)",
        "(line 2040,col 9)-(line 2040,col 20)",
        "(line 2041,col 9)-(line 2041,col 52)",
        "(line 2043,col 9)-(line 2046,col 9)",
        "(line 2049,col 9)-(line 2049,col 25)",
        "(line 2050,col 9)-(line 2050,col 32)",
        "(line 2052,col 9)-(line 2052,col 19)",
        "(line 2053,col 9)-(line 2053,col 19)",
        "(line 2054,col 9)-(line 2054,col 19)",
        "(line 2056,col 9)-(line 2056,col 40)",
        "(line 2068,col 9)-(line 2068,col 42)",
        "(line 2071,col 9)-(line 2071,col 20)",
        "(line 2072,col 9)-(line 2072,col 30)",
        "(line 2073,col 9)-(line 2073,col 20)",
        "(line 2076,col 9)-(line 2076,col 25)",
        "(line 2077,col 9)-(line 2077,col 32)",
        "(line 2079,col 9)-(line 2079,col 34)",
        "(line 2080,col 9)-(line 2080,col 41)",
        "(line 2082,col 9)-(line 2082,col 19)",
        "(line 2083,col 9)-(line 2083,col 19)",
        "(line 2084,col 9)-(line 2084,col 19)",
        "(line 2085,col 9)-(line 2085,col 19)",
        "(line 2087,col 9)-(line 2087,col 38)",
        "(line 2088,col 9)-(line 2088,col 39)",
        "(line 2090,col 9)-(line 2090,col 47)",
        "(line 2091,col 9)-(line 2091,col 40)",
        "(line 2092,col 9)-(line 2092,col 53)",
        "(line 2095,col 9)-(line 2098,col 9)",
        "(line 2100,col 9)-(line 2100,col 51)",
        "(line 2101,col 9)-(line 2101,col 40)",
        "(line 2103,col 9)-(line 2103,col 37)",
        "(line 2104,col 9)-(line 2104,col 38)",
        "(line 2106,col 9)-(line 2106,col 53)",
        "(line 2109,col 9)-(line 2112,col 9)",
        "(line 2115,col 9)-(line 2115,col 34)",
        "(line 2116,col 9)-(line 2116,col 41)",
        "(line 2117,col 9)-(line 2117,col 19)",
        "(line 2118,col 9)-(line 2118,col 19)",
        "(line 2119,col 9)-(line 2119,col 19)",
        "(line 2122,col 9)-(line 2122,col 37)",
        "(line 2124,col 9)-(line 2124,col 51)",
        "(line 2125,col 9)-(line 2125,col 48)",
        "(line 2126,col 9)-(line 2126,col 21)",
        "(line 2127,col 9)-(line 2127,col 53)",
        "(line 2129,col 9)-(line 2132,col 9)",
        "(line 2135,col 9)-(line 2135,col 25)",
        "(line 2136,col 9)-(line 2136,col 32)",
        "(line 2137,col 9)-(line 2137,col 34)",
        "(line 2138,col 9)-(line 2138,col 41)",
        "(line 2139,col 9)-(line 2139,col 19)",
        "(line 2140,col 9)-(line 2140,col 19)",
        "(line 2141,col 9)-(line 2141,col 19)",
        "(line 2144,col 9)-(line 2144,col 37)",
        "(line 2146,col 9)-(line 2146,col 51)",
        "(line 2147,col 9)-(line 2147,col 48)",
        "(line 2148,col 9)-(line 2148,col 21)",
        "(line 2149,col 9)-(line 2149,col 53)",
        "(line 2151,col 9)-(line 2154,col 9)",
        "(line 2157,col 9)-(line 2157,col 59)",
        "(line 2158,col 9)-(line 2158,col 110)",
        "(line 2160,col 9)-(line 2160,col 34)",
        "(line 2161,col 9)-(line 2161,col 44)",
        "(line 2164,col 9)-(line 2164,col 28)",
        "(line 2165,col 9)-(line 2165,col 31)",
        "(line 2166,col 9)-(line 2166,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.sin(double)",
      "begin_line": 2174,
      "end_line": 2264,
      "comment": "\n     *  Sine function.\n     *  @param x a number\n     *  @return sin(x)\n     ",
      "child_ranges": [
        "(line 2175,col 9)-(line 2175,col 33)",
        "(line 2176,col 9)-(line 2176,col 25)",
        "(line 2177,col 9)-(line 2177,col 18)",
        "(line 2178,col 9)-(line 2178,col 24)",
        "(line 2181,col 9)-(line 2181,col 15)",
        "(line 2182,col 9)-(line 2185,col 9)",
        "(line 2188,col 9)-(line 2194,col 9)",
        "(line 2196,col 9)-(line 2198,col 9)",
        "(line 2201,col 9)-(line 2246,col 9)",
        "(line 2248,col 9)-(line 2250,col 9)",
        "(line 2252,col 9)-(line 2263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cos(double)",
      "begin_line": 2271,
      "end_line": 2348,
      "comment": "\n     *  Cosine function\n     *  @param x a number\n     *  @return cos(x)\n     ",
      "child_ranges": [
        "(line 2272,col 9)-(line 2272,col 25)",
        "(line 2275,col 9)-(line 2275,col 22)",
        "(line 2276,col 9)-(line 2278,col 9)",
        "(line 2280,col 9)-(line 2282,col 9)",
        "(line 2285,col 9)-(line 2285,col 22)",
        "(line 2286,col 9)-(line 2331,col 9)",
        "(line 2336,col 9)-(line 2347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.tan(double)",
      "begin_line": 2355,
      "end_line": 2455,
      "comment": "\n     *   Tangent function\n     *  @param x a number\n     *  @return tan(x)\n     ",
      "child_ranges": [
        "(line 2356,col 9)-(line 2356,col 33)",
        "(line 2357,col 9)-(line 2357,col 25)",
        "(line 2360,col 9)-(line 2360,col 22)",
        "(line 2361,col 9)-(line 2364,col 9)",
        "(line 2367,col 9)-(line 2373,col 9)",
        "(line 2375,col 9)-(line 2377,col 9)",
        "(line 2380,col 9)-(line 2380,col 22)",
        "(line 2381,col 9)-(line 2426,col 9)",
        "(line 2428,col 9)-(line 2441,col 9)",
        "(line 2443,col 9)-(line 2443,col 22)",
        "(line 2444,col 9)-(line 2448,col 9)",
        "(line 2450,col 9)-(line 2452,col 9)",
        "(line 2454,col 9)-(line 2454,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double)",
      "begin_line": 2462,
      "end_line": 2464,
      "comment": "\n     * Arctangent function\n     *  @param x a number\n     *  @return atan(x)\n     ",
      "child_ranges": [
        "(line 2463,col 9)-(line 2463,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan(double, double, boolean)",
      "begin_line": 2472,
      "end_line": 2610,
      "comment": " Internal helper function to compute arctangent.\n     * @param xa number from which arctangent is requested\n     * @param xb extra bits for x (may be 0.0)\n     * @param leftPlane if true, result angle must be put in the left half plane\n     * @return atan(xa + xb) (or angle shifted by \u0026pi; if leftPlane is true)\n     ",
      "child_ranges": [
        "(line 2473,col 9)-(line 2473,col 31)",
        "(line 2474,col 9)-(line 2474,col 16)",
        "(line 2476,col 9)-(line 2481,col 9)",
        "(line 2483,col 9)-(line 2485,col 9)",
        "(line 2488,col 9)-(line 2493,col 9)",
        "(line 2494,col 9)-(line 2494,col 48)",
        "(line 2495,col 9)-(line 2495,col 58)",
        "(line 2496,col 9)-(line 2496,col 42)",
        "(line 2498,col 9)-(line 2498,col 34)",
        "(line 2499,col 9)-(line 2499,col 37)",
        "(line 2500,col 9)-(line 2500,col 20)",
        "(line 2503,col 9)-(line 2503,col 33)",
        "(line 2504,col 9)-(line 2504,col 37)",
        "(line 2505,col 9)-(line 2505,col 33)",
        "(line 2506,col 9)-(line 2506,col 16)",
        "(line 2507,col 9)-(line 2507,col 17)",
        "(line 2510,col 9)-(line 2542,col 9)",
        "(line 2545,col 9)-(line 2545,col 18)",
        "(line 2546,col 9)-(line 2546,col 18)",
        "(line 2549,col 9)-(line 2549,col 33)",
        "(line 2560,col 9)-(line 2560,col 33)",
        "(line 2561,col 9)-(line 2561,col 47)",
        "(line 2562,col 9)-(line 2562,col 46)",
        "(line 2563,col 9)-(line 2563,col 46)",
        "(line 2564,col 9)-(line 2564,col 46)",
        "(line 2565,col 9)-(line 2565,col 47)",
        "(line 2566,col 9)-(line 2566,col 31)",
        "(line 2569,col 9)-(line 2569,col 18)",
        "(line 2571,col 9)-(line 2571,col 23)",
        "(line 2572,col 9)-(line 2572,col 31)",
        "(line 2573,col 9)-(line 2573,col 18)",
        "(line 2576,col 9)-(line 2576,col 41)",
        "(line 2578,col 9)-(line 2578,col 22)",
        "(line 2579,col 9)-(line 2579,col 23)",
        "(line 2582,col 9)-(line 2582,col 39)",
        "(line 2583,col 9)-(line 2583,col 47)",
        "(line 2584,col 9)-(line 2584,col 23)",
        "(line 2585,col 9)-(line 2585,col 32)",
        "(line 2586,col 9)-(line 2586,col 18)",
        "(line 2588,col 9)-(line 2588,col 25)",
        "(line 2589,col 9)-(line 2589,col 38)",
        "(line 2591,col 9)-(line 2602,col 9)",
        "(line 2605,col 9)-(line 2607,col 9)",
        "(line 2609,col 9)-(line 2609,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.atan2(double, double)",
      "begin_line": 2618,
      "end_line": 2732,
      "comment": "\n     * Two arguments arctangent function\n     * @param y ordinate\n     * @param x abscissa\n     * @return phase angle of point (x,y) between -\u0026pi; and \u0026pi;\n     ",
      "child_ranges": [
        "(line 2619,col 9)-(line 2621,col 9)",
        "(line 2623,col 9)-(line 2649,col 9)",
        "(line 2651,col 9)-(line 2661,col 9)",
        "(line 2663,col 9)-(line 2673,col 9)",
        "(line 2675,col 9)-(line 2683,col 9)",
        "(line 2685,col 9)-(line 2694,col 9)",
        "(line 2696,col 9)-(line 2704,col 9)",
        "(line 2706,col 9)-(line 2709,col 9)",
        "(line 2712,col 9)-(line 2712,col 39)",
        "(line 2713,col 9)-(line 2713,col 42)",
        "(line 2714,col 9)-(line 2714,col 33)",
        "(line 2717,col 9)-(line 2717,col 29)",
        "(line 2718,col 9)-(line 2718,col 32)",
        "(line 2719,col 9)-(line 2719,col 36)",
        "(line 2720,col 9)-(line 2720,col 27)",
        "(line 2722,col 9)-(line 2722,col 62)",
        "(line 2724,col 9)-(line 2724,col 23)",
        "(line 2725,col 9)-(line 2725,col 31)",
        "(line 2726,col 9)-(line 2726,col 18)",
        "(line 2729,col 9)-(line 2729,col 44)",
        "(line 2731,col 9)-(line 2731,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.asin(double)",
      "begin_line": 2738,
      "end_line": 2804,
      "comment": " Compute the arc sine of a number.\n     * @param x number on which evaluation is done\n     * @return arc sine of x\n     ",
      "child_ranges": [
        "(line 2739,col 7)-(line 2741,col 7)",
        "(line 2743,col 7)-(line 2745,col 7)",
        "(line 2747,col 7)-(line 2749,col 7)",
        "(line 2751,col 7)-(line 2753,col 7)",
        "(line 2758,col 7)-(line 2758,col 37)",
        "(line 2759,col 7)-(line 2759,col 40)",
        "(line 2760,col 7)-(line 2760,col 31)",
        "(line 2763,col 7)-(line 2763,col 24)",
        "(line 2764,col 7)-(line 2764,col 36)",
        "(line 2767,col 7)-(line 2767,col 15)",
        "(line 2768,col 7)-(line 2768,col 15)",
        "(line 2770,col 7)-(line 2770,col 27)",
        "(line 2771,col 7)-(line 2771,col 35)",
        "(line 2773,col 7)-(line 2773,col 21)",
        "(line 2774,col 7)-(line 2774,col 30)",
        "(line 2775,col 7)-(line 2775,col 16)",
        "(line 2778,col 7)-(line 2778,col 15)",
        "(line 2779,col 7)-(line 2779,col 19)",
        "(line 2780,col 7)-(line 2780,col 30)",
        "(line 2781,col 7)-(line 2781,col 27)",
        "(line 2782,col 7)-(line 2782,col 18)",
        "(line 2785,col 7)-(line 2785,col 53)",
        "(line 2788,col 7)-(line 2788,col 31)",
        "(line 2791,col 7)-(line 2791,col 21)",
        "(line 2792,col 7)-(line 2792,col 30)",
        "(line 2793,col 7)-(line 2793,col 34)",
        "(line 2794,col 7)-(line 2794,col 25)",
        "(line 2796,col 7)-(line 2796,col 52)",
        "(line 2797,col 7)-(line 2797,col 28)",
        "(line 2799,col 7)-(line 2799,col 21)",
        "(line 2800,col 7)-(line 2800,col 29)",
        "(line 2801,col 7)-(line 2801,col 16)",
        "(line 2803,col 7)-(line 2803,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.acos(double)",
      "begin_line": 2810,
      "end_line": 2881,
      "comment": " Compute the arc cosine of a number.\n     * @param x number on which evaluation is done\n     * @return arc cosine of x\n     ",
      "child_ranges": [
        "(line 2811,col 7)-(line 2813,col 7)",
        "(line 2815,col 7)-(line 2817,col 7)",
        "(line 2819,col 7)-(line 2821,col 7)",
        "(line 2823,col 7)-(line 2825,col 7)",
        "(line 2827,col 7)-(line 2829,col 7)",
        "(line 2834,col 7)-(line 2834,col 37)",
        "(line 2835,col 7)-(line 2835,col 40)",
        "(line 2836,col 7)-(line 2836,col 31)",
        "(line 2839,col 7)-(line 2839,col 24)",
        "(line 2840,col 7)-(line 2840,col 36)",
        "(line 2843,col 7)-(line 2843,col 15)",
        "(line 2844,col 7)-(line 2844,col 15)",
        "(line 2846,col 7)-(line 2846,col 27)",
        "(line 2847,col 7)-(line 2847,col 35)",
        "(line 2849,col 7)-(line 2849,col 21)",
        "(line 2850,col 7)-(line 2850,col 30)",
        "(line 2851,col 7)-(line 2851,col 16)",
        "(line 2854,col 7)-(line 2854,col 26)",
        "(line 2855,col 7)-(line 2855,col 30)",
        "(line 2856,col 7)-(line 2856,col 27)",
        "(line 2857,col 7)-(line 2857,col 18)",
        "(line 2860,col 7)-(line 2860,col 53)",
        "(line 2863,col 7)-(line 2863,col 25)",
        "(line 2864,col 7)-(line 2864,col 16)",
        "(line 2865,col 7)-(line 2865,col 26)",
        "(line 2868,col 7)-(line 2868,col 21)",
        "(line 2869,col 7)-(line 2869,col 30)",
        "(line 2870,col 7)-(line 2870,col 34)",
        "(line 2871,col 7)-(line 2871,col 25)",
        "(line 2873,col 7)-(line 2873,col 52)",
        "(line 2874,col 7)-(line 2874,col 19)",
        "(line 2876,col 7)-(line 2876,col 21)",
        "(line 2877,col 7)-(line 2877,col 29)",
        "(line 2878,col 7)-(line 2878,col 16)",
        "(line 2880,col 7)-(line 2880,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.cbrt(double)",
      "begin_line": 2887,
      "end_line": 2965,
      "comment": " Compute the cubic root of a number.\n     * @param x number on which evaluation is done\n     * @return cubic root of x\n     ",
      "child_ranges": [
        "(line 2889,col 7)-(line 2889,col 47)",
        "(line 2890,col 7)-(line 2890,col 59)",
        "(line 2891,col 7)-(line 2891,col 32)",
        "(line 2893,col 7)-(line 2903,col 7)",
        "(line 2905,col 7)-(line 2908,col 7)",
        "(line 2911,col 7)-(line 2911,col 30)",
        "(line 2914,col 7)-(line 2915,col 81)",
        "(line 2918,col 7)-(line 2918,col 104)",
        "(line 2921,col 7)-(line 2921,col 41)",
        "(line 2922,col 7)-(line 2922,col 44)",
        "(line 2923,col 7)-(line 2923,col 45)",
        "(line 2924,col 7)-(line 2924,col 44)",
        "(line 2925,col 7)-(line 2925,col 44)",
        "(line 2927,col 7)-(line 2927,col 39)",
        "(line 2932,col 7)-(line 2932,col 39)",
        "(line 2933,col 7)-(line 2933,col 46)",
        "(line 2934,col 7)-(line 2934,col 46)",
        "(line 2937,col 7)-(line 2937,col 39)",
        "(line 2938,col 7)-(line 2938,col 36)",
        "(line 2939,col 7)-(line 2939,col 27)",
        "(line 2941,col 7)-(line 2941,col 26)",
        "(line 2942,col 7)-(line 2942,col 42)",
        "(line 2943,col 7)-(line 2943,col 31)",
        "(line 2944,col 7)-(line 2944,col 38)",
        "(line 2945,col 7)-(line 2945,col 25)",
        "(line 2946,col 7)-(line 2946,col 17)",
        "(line 2948,col 7)-(line 2948,col 39)",
        "(line 2949,col 7)-(line 2949,col 19)",
        "(line 2951,col 7)-(line 2951,col 26)",
        "(line 2952,col 7)-(line 2952,col 34)",
        "(line 2953,col 7)-(line 2953,col 15)",
        "(line 2955,col 7)-(line 2955,col 33)",
        "(line 2958,col 7)-(line 2958,col 16)",
        "(line 2960,col 7)-(line 2962,col 7)",
        "(line 2964,col 7)-(line 2964,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toRadians(double)",
      "begin_line": 2972,
      "end_line": 2982,
      "comment": "\n     *  Convert degrees to radians, with error of less than 0.5 ULP\n     *  @param x angle in degrees\n     *  @return x converted into radians\n     ",
      "child_ranges": [
        "(line 2974,col 9)-(line 2974,col 49)",
        "(line 2975,col 9)-(line 2975,col 50)",
        "(line 2977,col 9)-(line 2977,col 39)",
        "(line 2978,col 9)-(line 2978,col 36)",
        "(line 2979,col 9)-(line 2979,col 27)",
        "(line 2981,col 9)-(line 2981,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.toDegrees(double)",
      "begin_line": 2989,
      "end_line": 2999,
      "comment": "\n     *  Convert radians to degrees, with error of less than 0.5 ULP\n     *  @param x angle in radians\n     *  @return x converted into degrees\n     ",
      "child_ranges": [
        "(line 2991,col 9)-(line 2991,col 46)",
        "(line 2992,col 9)-(line 2992,col 50)",
        "(line 2994,col 9)-(line 2994,col 39)",
        "(line 2995,col 9)-(line 2995,col 36)",
        "(line 2996,col 9)-(line 2996,col 27)",
        "(line 2998,col 9)-(line 2998,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(int)",
      "begin_line": 3006,
      "end_line": 3008,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3007,col 9)-(line 3007,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(long)",
      "begin_line": 3015,
      "end_line": 3017,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3016,col 9)-(line 3016,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(float)",
      "begin_line": 3024,
      "end_line": 3026,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3025,col 9)-(line 3025,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.abs(double)",
      "begin_line": 3033,
      "end_line": 3035,
      "comment": "\n     * Absolute value.\n     * @param x number from which absolute value is requested\n     * @return abs(x)\n     ",
      "child_ranges": [
        "(line 3034,col 9)-(line 3034,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ulp(double)",
      "begin_line": 3043,
      "end_line": 3045,
      "comment": "",
      "child_ranges": [
        "(line 3044,col 9)-(line 3044,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.nextAfter(double, double)",
      "begin_line": 3063,
      "end_line": 3101,
      "comment": "\n     * Get the next machine representable number after a number, moving\n     * in the direction of another number.\n     * \u003cp\u003e\n     * If \u003ccode\u003edirection\u003c/code\u003e is greater than or equal to\u003ccode\u003ed\u003c/code\u003e,\n     * the smallest machine representable number strictly greater than\n     * \u003ccode\u003ed\u003c/code\u003e is returned; otherwise the largest representable number\n     * strictly less than \u003ccode\u003ed\u003c/code\u003e is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003ed\u003c/code\u003e is NaN or Infinite, it is returned unchanged.\u003c/p\u003e\n     *\n     * @param d base number\n     * @param direction (the only important thing is whether\n     * direction is greater or smaller than d)\n     * @return the next machine representable number in the specified direction\n     ",
      "child_ranges": [
        "(line 3066,col 9)-(line 3070,col 9)",
        "(line 3075,col 9)-(line 3075,col 51)",
        "(line 3076,col 9)-(line 3076,col 51)",
        "(line 3077,col 9)-(line 3077,col 51)",
        "(line 3078,col 9)-(line 3078,col 51)",
        "(line 3080,col 9)-(line 3099,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.floor(double)",
      "begin_line": 3107,
      "end_line": 3128,
      "comment": " Get the largest whole number smaller than x.\n     * @param x number from which floor is requested\n     * @return a double number f such that f is an integer f \u003c\u003d x \u003c f + 1.0\n     ",
      "child_ranges": [
        "(line 3108,col 9)-(line 3108,col 15)",
        "(line 3110,col 9)-(line 3112,col 9)",
        "(line 3114,col 9)-(line 3116,col 9)",
        "(line 3118,col 9)-(line 3118,col 21)",
        "(line 3119,col 9)-(line 3121,col 9)",
        "(line 3123,col 9)-(line 3125,col 9)",
        "(line 3127,col 9)-(line 3127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.ceil(double)",
      "begin_line": 3134,
      "end_line": 3153,
      "comment": " Get the smallest whole number larger than x.\n     * @param x number from which ceil is requested\n     * @return a double number c such that c is an integer c - 1.0 \u003c x \u003c\u003d c\n     ",
      "child_ranges": [
        "(line 3135,col 9)-(line 3135,col 17)",
        "(line 3137,col 9)-(line 3139,col 9)",
        "(line 3141,col 9)-(line 3141,col 21)",
        "(line 3142,col 9)-(line 3144,col 9)",
        "(line 3146,col 9)-(line 3146,col 17)",
        "(line 3148,col 9)-(line 3150,col 9)",
        "(line 3152,col 9)-(line 3152,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.rint(double)",
      "begin_line": 3159,
      "end_line": 3173,
      "comment": " Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.\n     * @param x number from which nearest whole number is requested\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d x \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 3160,col 9)-(line 3160,col 28)",
        "(line 3161,col 9)-(line 3161,col 25)",
        "(line 3163,col 9)-(line 3165,col 9)",
        "(line 3166,col 9)-(line 3168,col 9)",
        "(line 3171,col 9)-(line 3171,col 26)",
        "(line 3172,col 9)-(line 3172,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(double)",
      "begin_line": 3179,
      "end_line": 3181,
      "comment": " Get the closest long to x.\n     * @param x number from which closest long is requested\n     * @return closest long to x\n     ",
      "child_ranges": [
        "(line 3180,col 9)-(line 3180,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.round(float)",
      "begin_line": 3187,
      "end_line": 3189,
      "comment": " Get the closest int to x.\n     * @param x number from which closest int is requested\n     * @return closest int to x\n     ",
      "child_ranges": [
        "(line 3188,col 9)-(line 3188,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(int, int)",
      "begin_line": 3196,
      "end_line": 3198,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3197,col 9)-(line 3197,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(long, long)",
      "begin_line": 3205,
      "end_line": 3207,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3206,col 9)-(line 3206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(float, float)",
      "begin_line": 3214,
      "end_line": 3216,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3215,col 9)-(line 3215,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.min(double, double)",
      "begin_line": 3223,
      "end_line": 3225,
      "comment": " Compute the minimum of two values\n     * @param a first value\n     * @param b second value\n     * @return a if a is lesser or equal to b, b otherwise\n     ",
      "child_ranges": [
        "(line 3224,col 9)-(line 3224,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(int, int)",
      "begin_line": 3232,
      "end_line": 3234,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3233,col 9)-(line 3233,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(long, long)",
      "begin_line": 3241,
      "end_line": 3243,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3242,col 9)-(line 3242,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(float, float)",
      "begin_line": 3250,
      "end_line": 3252,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3251,col 9)-(line 3251,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMath.max(double, double)",
      "begin_line": 3259,
      "end_line": 3261,
      "comment": " Compute the maximum of two values\n     * @param a first value\n     * @param b second value\n     * @return b if a is lesser or equal to b, a otherwise\n     ",
      "child_ranges": [
        "(line 3260,col 9)-(line 3260,col 69)"
      ]
    }
  ]
}