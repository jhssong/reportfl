{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/dfp/DfpMath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DfpMath",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 968,
      "comment": " Mathematical routines for use with {@link Dfp}.\n * The constants are defined in {@link DfpField}\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "POW_TRAP"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Name for traps triggered by pow. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpMath.DfpMath()",
      "begin_line": 33,
      "end_line": 34,
      "comment": "\n     * Private Constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.split(org.apache.commons.math3.dfp.DfpField, java.lang.String)",
      "begin_line": 45,
      "end_line": 88,
      "comment": " Breaks a string representation up into two dfp\u0027s.\n     * \u003cp\u003eThe two dfp are such that the sum of them is equivalent\n     * to the input string, but has higher precision than using a\n     * single dfp. This is useful for improving accuracy of\n     * exponentiation and critical multiplies.\n     * @param field field to which the Dfp must belong\n     * @param a string representation to split\n     * @return an array of two {@link Dfp} which sum is a\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 34)",
        "(line 47,col 9)-(line 47,col 19)",
        "(line 48,col 9)-(line 48,col 31)",
        "(line 49,col 9)-(line 49,col 19)",
        "(line 50,col 9)-(line 50,col 20)",
        "(line 52,col 9)-(line 52,col 35)",
        "(line 54,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 57)",
        "(line 78,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 50)",
        "(line 87,col 9)-(line 87,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.split(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 94,
      "end_line": 100,
      "comment": " Splits a {@link Dfp} into 2 {@link Dfp}\u0027s such that their sum is equal to the input {@link Dfp}.\n     * @param a number to split\n     * @return two elements array containing the split number\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 40)",
        "(line 96,col 9)-(line 96,col 73)",
        "(line 97,col 9)-(line 97,col 49)",
        "(line 98,col 9)-(line 98,col 42)",
        "(line 99,col 9)-(line 99,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.splitMult(org.apache.commons.math3.dfp.Dfp[], org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 110,
      "end_line": 127,
      "comment": " Multiply two numbers that are split in to two pieces that are\n     *  meant to be added together.\n     *  Use binomial multiplication so ab \u003d a0 b0 + a0 b1 + a1 b0 + a1 b1\n     *  Store the first term in result0, the rest in result1\n     *  @param a first factor of the multiplication, in split form\n     *  @param b second factor of the multiplication, in split form\n     *  @return a \u0026times; b, in split form\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 40)",
        "(line 113,col 9)-(line 113,col 35)",
        "(line 114,col 9)-(line 114,col 40)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 90)",
        "(line 126,col 9)-(line 126,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.splitDiv(org.apache.commons.math3.dfp.Dfp[], org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 136,
      "end_line": 146,
      "comment": " Divide two numbers that are split in to two pieces that are meant to be added together.\n     * Inverse of split multiply above:\n     *  (a+b) / (c+d) \u003d (a/c) + ( (bc-ad)/(c**2+cd) )\n     *  @param a dividend, in split form\n     *  @param b divisor, in split form\n     *  @return a / b, in split form\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 27)",
        "(line 139,col 9)-(line 139,col 28)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 70)",
        "(line 143,col 9)-(line 143,col 83)",
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.splitPow(org.apache.commons.math3.dfp.Dfp[], int)",
      "begin_line": 153,
      "end_line": 204,
      "comment": " Raise a split base to the a power.\n     * @param base number to raise\n     * @param a power\n     * @return base\u003csup\u003ea\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 31)",
        "(line 156,col 9)-(line 156,col 29)",
        "(line 158,col 9)-(line 158,col 34)",
        "(line 159,col 9)-(line 159,col 37)",
        "(line 160,col 9)-(line 160,col 38)",
        "(line 162,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 171,col 9)",
        "(line 174,col 9)-(line 194,col 25)",
        "(line 196,col 9)-(line 196,col 45)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.pow(org.apache.commons.math3.dfp.Dfp, int)",
      "begin_line": 211,
      "end_line": 255,
      "comment": " Raises base to the power a by successive squaring.\n     * @param base number to raise\n     * @param a power\n     * @return base\u003csup\u003ea\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)",
        "(line 215,col 9)-(line 215,col 35)",
        "(line 217,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 228,col 9)-(line 247,col 25)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.exp(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 264,
      "end_line": 284,
      "comment": " Computes e to the given power.\n     * a is broken into two parts, such that a \u003d n+m  where n is an integer.\n     * We use pow() to compute e\u003csup\u003en\u003c/sup\u003e and a Taylor series to compute\n     * e\u003csup\u003em\u003c/sup\u003e.  We return e*\u003csup\u003en\u003c/sup\u003e \u0026times; e\u003csup\u003em\u003c/sup\u003e\n     * @param a power at which e should be raised\n     * @return e\u003csup\u003ea\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 34)",
        "(line 267,col 9)-(line 267,col 43)",
        "(line 269,col 9)-(line 269,col 39)",
        "(line 270,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 65)",
        "(line 281,col 9)-(line 281,col 46)",
        "(line 283,col 9)-(line 283,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.expInternal(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 291,
      "end_line": 308,
      "comment": " Computes e to the given power.\n     * Where -1 \u003c a \u003c 1.  Use the classic Taylor series.  1 + x**2/2! + x**3/3! + x**4/4!  ...\n     * @param a power at which e should be raised\n     * @return e\u003csup\u003ea\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 27)",
        "(line 293,col 9)-(line 293,col 27)",
        "(line 294,col 9)-(line 294,col 30)",
        "(line 295,col 9)-(line 295,col 28)",
        "(line 297,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.log(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 317,
      "end_line": 378,
      "comment": " Returns the natural logarithm of a.\n     * a is first split into three parts such that  a \u003d (10000^h)(2^j)k.\n     * ln(a) is computed by ln(a) \u003d ln(5)*h + ln(2)*(h+j) + ln(k)\n     * k is in the range 2/3 \u003c k \u003c4/3 and is passed on to a series expansion.\n     * @param a number from which logarithm is requested\n     * @return log(a)\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 15)",
        "(line 319,col 9)-(line 319,col 14)",
        "(line 320,col 9)-(line 320,col 15)",
        "(line 321,col 9)-(line 321,col 19)",
        "(line 324,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 334,col 23)",
        "(line 335,col 9)-(line 335,col 24)",
        "(line 337,col 9)-(line 337,col 52)",
        "(line 338,col 9)-(line 338,col 34)",
        "(line 340,col 9)-(line 343,col 9)",
        "(line 346,col 9)-(line 346,col 29)",
        "(line 347,col 9)-(line 347,col 31)",
        "(line 348,col 9)-(line 348,col 37)",
        "(line 349,col 9)-(line 349,col 39)",
        "(line 350,col 9)-(line 350,col 39)",
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 37)",
        "(line 362,col 9)-(line 362,col 79)",
        "(line 363,col 9)-(line 363,col 29)",
        "(line 364,col 9)-(line 364,col 57)",
        "(line 366,col 9)-(line 366,col 36)",
        "(line 367,col 9)-(line 367,col 36)",
        "(line 369,col 9)-(line 369,col 76)",
        "(line 370,col 9)-(line 370,col 29)",
        "(line 371,col 9)-(line 371,col 57)",
        "(line 373,col 9)-(line 373,col 36)",
        "(line 374,col 9)-(line 374,col 36)",
        "(line 376,col 9)-(line 376,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.logInternal(org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 435,
      "end_line": 463,
      "comment": " Computes the natural log of a number between 0 and 2.\n     *  Let f(x) \u003d ln(x),\n     *\n     *  We know that f\u0027(x) \u003d 1/x, thus from Taylor\u0027s theorum we have:\n     *\n     *           -----          n+1         n\n     *  f(x) \u003d   \\           (-1)    (x - 1)\n     *           /          ----------------    for 1 \u003c\u003d n \u003c\u003d infinity\n     *           -----             n\n     *\n     *  or\n     *                       2        3       4\n     *                   (x-1)   (x-1)    (x-1)\n     *  ln(x) \u003d  (x-1) - ----- + ------ - ------ + ...\n     *                     2       3        4\n     *\n     *  alternatively,\n     *\n     *                  2    3   4\n     *                 x    x   x\n     *  ln(x+1) \u003d  x - -  + - - - + ...\n     *                 2    3   4\n     *\n     *  This series can be used to compute ln(x), but it converges too slowly.\n     *\n     *  If we substitute -x for x above, we get\n     *\n     *                   2    3    4\n     *                  x    x    x\n     *  ln(1-x) \u003d  -x - -  - -  - - + ...\n     *                  2    3    4\n     *\n     *  Note that all terms are now negative.  Because the even powered ones\n     *  absorbed the sign.  Now, subtract the series above from the previous\n     *  one to get ln(x+1) - ln(1-x).  Note the even terms cancel out leaving\n     *  only the odd ones\n     *\n     *                             3     5      7\n     *                           2x    2x     2x\n     *  ln(x+1) - ln(x-1) \u003d 2x + --- + --- + ---- + ...\n     *                            3     5      7\n     *\n     *  By the property of logarithms that ln(a) - ln(b) \u003d ln (a/b) we have:\n     *\n     *                                3        5        7\n     *      x+1           /          x        x        x          \\\n     *  ln ----- \u003d   2 *  |  x  +   ----  +  ----  +  ---- + ...  |\n     *      x-1           \\          3        5        7          /\n     *\n     *  But now we want to find ln(a), so we need to find the value of x\n     *  such that a \u003d (x+1)/(x-1).   This is easily solved to find that\n     *  x \u003d (a-1)/(a+1).\n     * @param a number from which logarithm is requested, in split form\n     * @return log(a)\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 51)",
        "(line 441,col 9)-(line 441,col 89)",
        "(line 443,col 9)-(line 443,col 27)",
        "(line 444,col 9)-(line 444,col 29)",
        "(line 445,col 9)-(line 445,col 28)",
        "(line 446,col 9)-(line 446,col 20)",
        "(line 447,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 38)",
        "(line 461,col 9)-(line 461,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.pow(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 505,
      "end_line": 663,
      "comment": " Computes x to the y power.\u003cp\u003e\n     *\n     *  Uses the following method:\u003cp\u003e\n     *\n     *  \u003col\u003e\n     *  \u003cli\u003e Set u \u003d rint(y), v \u003d y-u\n     *  \u003cli\u003e Compute a \u003d v * ln(x)\n     *  \u003cli\u003e Compute b \u003d rint( a/ln(2) )\n     *  \u003cli\u003e Compute c \u003d a - b*ln(2)\n     *  \u003cli\u003e x\u003csup\u003ey\u003c/sup\u003e \u003d x\u003csup\u003eu\u003c/sup\u003e  *   2\u003csup\u003eb\u003c/sup\u003e * e\u003csup\u003ec\u003c/sup\u003e\n     *  \u003c/ol\u003e\n     *  if |y| \u003e 1e8, then we compute by exp(y*ln(x))   \u003cp\u003e\n     *\n     *  \u003cb\u003eSpecial Cases\u003c/b\u003e\u003cp\u003e\n     *  \u003cul\u003e\n     *  \u003cli\u003e  if y is 0.0 or -0.0 then result is 1.0\n     *  \u003cli\u003e  if y is 1.0 then result is x\n     *  \u003cli\u003e  if y is NaN then result is NaN\n     *  \u003cli\u003e  if x is NaN and y is not zero then result is NaN\n     *  \u003cli\u003e  if |x| \u003e 1.0 and y is +Infinity then result is +Infinity\n     *  \u003cli\u003e  if |x| \u003c 1.0 and y is -Infinity then result is +Infinity\n     *  \u003cli\u003e  if |x| \u003e 1.0 and y is -Infinity then result is +0\n     *  \u003cli\u003e  if |x| \u003c 1.0 and y is +Infinity then result is +0\n     *  \u003cli\u003e  if |x| \u003d 1.0 and y is +/-Infinity then result is NaN\n     *  \u003cli\u003e  if x \u003d +0 and y \u003e 0 then result is +0\n     *  \u003cli\u003e  if x \u003d +Inf and y \u003c 0 then result is +0\n     *  \u003cli\u003e  if x \u003d +0 and y \u003c 0 then result is +Inf\n     *  \u003cli\u003e  if x \u003d +Inf and y \u003e 0 then result is +Inf\n     *  \u003cli\u003e  if x \u003d -0 and y \u003e 0, finite, not odd integer then result is +0\n     *  \u003cli\u003e  if x \u003d -0 and y \u003c 0, finite, and odd integer then result is -Inf\n     *  \u003cli\u003e  if x \u003d -Inf and y \u003e 0, finite, and odd integer then result is -Inf\n     *  \u003cli\u003e  if x \u003d -0 and y \u003c 0, not finite odd integer then result is +Inf\n     *  \u003cli\u003e  if x \u003d -Inf and y \u003e 0, not finite odd integer then result is +Inf\n     *  \u003cli\u003e  if x \u003c 0 and y \u003e 0, finite, and odd integer then result is -(|x|\u003csup\u003ey\u003c/sup\u003e)\n     *  \u003cli\u003e  if x \u003c 0 and y \u003e 0, finite, and not integer then result is NaN\n     *  \u003c/ul\u003e\n     *  @param x base to be raised\n     *  @param y power to which base should be raised\n     *  @return x\u003csup\u003ey\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 513,col 9)",
        "(line 515,col 9)-(line 515,col 37)",
        "(line 516,col 9)-(line 516,col 36)",
        "(line 517,col 9)-(line 517,col 36)",
        "(line 518,col 9)-(line 518,col 31)",
        "(line 519,col 9)-(line 519,col 15)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 533,col 9)",
        "(line 535,col 9)-(line 539,col 9)",
        "(line 542,col 9)-(line 568,col 9)",
        "(line 570,col 9)-(line 574,col 9)",
        "(line 576,col 9)-(line 582,col 9)",
        "(line 584,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 629,col 9)",
        "(line 633,col 9)-(line 633,col 14)",
        "(line 634,col 9)-(line 654,col 9)",
        "(line 656,col 9)-(line 659,col 9)",
        "(line 661,col 9)-(line 661,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.sinInternal(org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 670,
      "end_line": 693,
      "comment": " Computes sin(a)  Used when 0 \u003c a \u003c pi/4.\n     * Uses the classic Taylor series.  x - x**3/3! + x**5/5!  ...\n     * @param a number from which sine is desired, in split form\n     * @return sin(a)\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 31)",
        "(line 673,col 9)-(line 673,col 18)",
        "(line 674,col 9)-(line 674,col 26)",
        "(line 675,col 9)-(line 675,col 18)",
        "(line 676,col 9)-(line 676,col 33)",
        "(line 677,col 9)-(line 677,col 28)",
        "(line 679,col 9)-(line 689,col 9)",
        "(line 691,col 9)-(line 691,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.cosInternal(org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 700,
      "end_line": 727,
      "comment": " Computes cos(a)  Used when 0 \u003c a \u003c pi/4.\n     * Uses the classic Taylor series for cosine.  1 - x**2/2! + x**4/4!  ...\n     * @param a number from which cosine is desired, in split form\n     * @return cos(a)\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 38)",
        "(line 704,col 9)-(line 704,col 20)",
        "(line 705,col 9)-(line 705,col 20)",
        "(line 706,col 9)-(line 706,col 31)",
        "(line 707,col 9)-(line 707,col 26)",
        "(line 709,col 9)-(line 709,col 23)",
        "(line 710,col 9)-(line 710,col 28)",
        "(line 712,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.sin(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 733,
      "end_line": 778,
      "comment": " computes the sine of the argument.\n     * @param a number from which sine is desired\n     * @return sin(a)\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 44)",
        "(line 735,col 9)-(line 735,col 48)",
        "(line 736,col 9)-(line 736,col 28)",
        "(line 739,col 9)-(line 739,col 44)",
        "(line 743,col 9)-(line 746,col 9)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 14)",
        "(line 757,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 776,col 9)-(line 776,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.cos(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 784,
      "end_line": 828,
      "comment": " computes the cosine of the argument.\n     * @param a number from which cosine is desired\n     * @return cos(a)\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 44)",
        "(line 786,col 9)-(line 786,col 48)",
        "(line 787,col 9)-(line 787,col 28)",
        "(line 790,col 9)-(line 790,col 44)",
        "(line 794,col 9)-(line 796,col 9)",
        "(line 802,col 9)-(line 805,col 9)",
        "(line 807,col 9)-(line 807,col 14)",
        "(line 808,col 9)-(line 820,col 9)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 826,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.tan(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 834,
      "end_line": 836,
      "comment": " computes the tangent of the argument.\n     * @param a number from which tangent is desired\n     * @return tan(a)\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.atanInternal(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 842,
      "end_line": 861,
      "comment": " computes the arc-tangent of the argument.\n     * @param a number from which arc-tangent is desired\n     * @return atan(a)\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 27)",
        "(line 845,col 9)-(line 845,col 27)",
        "(line 846,col 9)-(line 846,col 28)",
        "(line 848,col 9)-(line 857,col 9)",
        "(line 859,col 9)-(line 859,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.atan(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 876,
      "end_line": 935,
      "comment": " computes the arc tangent of the argument\n     *\n     *  Uses the typical taylor series\n     *\n     *  but may reduce arguments using the following identity\n     * tan(x+y) \u003d (tan(x) + tan(y)) / (1 - tan(x)*tan(y))\n     *\n     * since tan(PI/8) \u003d sqrt(2)-1,\n     *\n     * atan(x) \u003d atan( (x - sqrt(2) + 1) / (1+x*sqrt(2) - x) + PI/8.0\n     * @param a number from which arc-tangent is desired\n     * @return atan(a)\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 55)",
        "(line 878,col 9)-(line 878,col 54)",
        "(line 879,col 9)-(line 879,col 60)",
        "(line 880,col 9)-(line 880,col 58)",
        "(line 881,col 9)-(line 881,col 29)",
        "(line 882,col 9)-(line 882,col 28)",
        "(line 883,col 9)-(line 883,col 28)",
        "(line 885,col 9)-(line 885,col 68)",
        "(line 887,col 9)-(line 887,col 27)",
        "(line 888,col 9)-(line 891,col 9)",
        "(line 893,col 9)-(line 896,col 9)",
        "(line 898,col 9)-(line 917,col 9)",
        "(line 919,col 9)-(line 919,col 32)",
        "(line 921,col 9)-(line 923,col 9)",
        "(line 925,col 9)-(line 927,col 9)",
        "(line 929,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 933,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.asin(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 941,
      "end_line": 943,
      "comment": " computes the arc-sine of the argument.\n     * @param a number from which arc-sine is desired\n     * @return asin(a)\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpMath.acos(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 949,
      "end_line": 966,
      "comment": " computes the arc-cosine of the argument.\n     * @param a number from which arc-cosine is desired\n     * @return acos(a)\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 19)",
        "(line 951,col 9)-(line 951,col 33)",
        "(line 953,col 9)-(line 955,col 9)",
        "(line 957,col 9)-(line 957,col 40)",
        "(line 959,col 9)-(line 959,col 75)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 965,col 9)-(line 965,col 37)"
      ]
    }
  ]
}