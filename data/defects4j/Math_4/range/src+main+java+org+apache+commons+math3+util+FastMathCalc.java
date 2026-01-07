{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/FastMathCalc.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathCalc",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 659,
      "comment": " Class used to compute the classical functions tables.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_40000000"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " 1073741824L"
    },
    {
      "type": "field",
      "varNames": [
        "FACT"
      ],
      "begin_line": 36,
      "end_line": 58,
      "comment": " Factorial table, for Taylor series expansions. 0!, 1!, 2!, ... 19! "
    },
    {
      "type": "field",
      "varNames": [
        "LN_SPLIT_COEF"
      ],
      "begin_line": 61,
      "end_line": 78,
      "comment": " Coefficients for slowLog. "
    },
    {
      "type": "field",
      "varNames": [
        "TABLE_START_DECL"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Table start declaration. "
    },
    {
      "type": "field",
      "varNames": [
        "TABLE_END_DECL"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Table end declaration. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.FastMathCalc.FastMathCalc()",
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * Private Constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.buildSinCosTables(double[], double[], double[], double[], int, double[], double[])",
      "begin_line": 101,
      "end_line": 196,
      "comment": " Build the sine and cosine tables.\n     * @param SINE_TABLE_A table of the most significant part of the sines\n     * @param SINE_TABLE_B table of the least significant part of the sines\n     * @param COSINE_TABLE_A table of the most significant part of the cosines\n     * @param COSINE_TABLE_B table of the most significant part of the cosines\n     * @param SINE_TABLE_LEN length of the tables\n     * @param TANGENT_TABLE_A table of the most significant part of the tangents\n     * @param TANGENT_TABLE_B table of the most significant part of the tangents\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 46)",
        "(line 108,col 9)-(line 118,col 9)",
        "(line 121,col 9)-(line 174,col 9)",
        "(line 177,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.slowCos(double, double[])",
      "begin_line": 206,
      "end_line": 241,
      "comment": "\n     *  For x between 0 and pi/4 compute cosine using Talor series\n     *  cos(x) \u003d 1 - x^2/2! + x^4/4! ...\n     * @param x number from which cosine is requested\n     * @param result placeholder where to put the result in extended precision\n     * (may be null)\n     * @return cos(x)\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 42)",
        "(line 209,col 9)-(line 209,col 42)",
        "(line 210,col 9)-(line 210,col 45)",
        "(line 211,col 9)-(line 211,col 42)",
        "(line 212,col 9)-(line 212,col 21)",
        "(line 213,col 9)-(line 213,col 28)",
        "(line 215,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.slowSin(double, double[])",
      "begin_line": 251,
      "end_line": 285,
      "comment": "\n     * For x between 0 and pi/4 compute sine using Taylor expansion:\n     * sin(x) \u003d x - x^3/3! + x^5/5! - x^7/7! ...\n     * @param x number from which sine is requested\n     * @param result placeholder where to put the result in extended precision\n     * (may be null)\n     * @return sin(x)\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 42)",
        "(line 253,col 9)-(line 253,col 42)",
        "(line 254,col 9)-(line 254,col 45)",
        "(line 255,col 9)-(line 255,col 42)",
        "(line 256,col 9)-(line 256,col 21)",
        "(line 257,col 9)-(line 257,col 28)",
        "(line 259,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.slowexp(double, double[])",
      "begin_line": 295,
      "end_line": 322,
      "comment": "\n     *  For x between 0 and 1, returns exp(x), uses extended precision\n     *  @param x argument of exponential\n     *  @param result placeholder where to place exp(x) split in two terms\n     *  for extra precision (i.e. exp(x) \u003d result[0] + result[1]\n     *  @return exp(x)\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 42)",
        "(line 298,col 9)-(line 298,col 45)",
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 21)",
        "(line 301,col 9)-(line 301,col 28)",
        "(line 303,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.split(double, double[])",
      "begin_line": 329,
      "end_line": 339,
      "comment": " Compute split[0], split[1] such that their sum is equal to d,\n     * and split[0] has its 30 least significant bits as zero.\n     * @param d number to split\n     * @param split placeholder where to place the result\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.resplit(double[])",
      "begin_line": 345,
      "end_line": 358,
      "comment": " Recompute a split.\n     * @param a input/out array containing the split, changed\n     * on output\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 37)",
        "(line 347,col 9)-(line 347,col 44)",
        "(line 349,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.splitMult(double[], double[], double[])",
      "begin_line": 365,
      "end_line": 371,
      "comment": " Multiply two numbers in split form.\n     * @param a first term of multiplication\n     * @param b second term of multiplication\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 29)",
        "(line 367,col 9)-(line 367,col 57)",
        "(line 370,col 9)-(line 370,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.splitAdd(double[], double[], double[])",
      "begin_line": 378,
      "end_line": 383,
      "comment": " Add two numbers in split form.\n     * @param a first term of addition\n     * @param b second term of addition\n     * @param ans placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 29)",
        "(line 380,col 9)-(line 380,col 29)",
        "(line 382,col 9)-(line 382,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.splitReciprocal(double[], double[])",
      "begin_line": 403,
      "end_line": 431,
      "comment": " Compute the reciprocal of in.  Use the following algorithm.\n     *  in \u003d c + d.\n     *  want to find x + y such that x+y \u003d 1/(c+d) and x is much\n     *  larger than y and x has several zero bits on the right.\n     *\n     *  Set b \u003d 1/(2^22),  a \u003d 1 - b.  Thus (a+b) \u003d 1.\n     *  Use following identity to compute (a+b)/(c+d)\n     *\n     *  (a+b)/(c+d)  \u003d   a/c   +    (bc - ad) / (c^2 + cd)\n     *  set x \u003d a/c  and y \u003d (bc - ad) / (c^2 + cd)\n     *  This will be close to the right answer, but there will be\n     *  some rounding in the calculation of X.  So by carefully\n     *  computing 1 - (c+d)(x+y) we can compute an error and\n     *  add that back in.   This is done carefully so that terms\n     *  of similar size are subtracted first.\n     *  @param in initial number, in split form\n     *  @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 33)",
        "(line 407,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 30)",
        "(line 413,col 9)-(line 413,col 68)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 420,col 9)-(line 420,col 24)",
        "(line 422,col 9)-(line 430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.quadMult(double[], double[], double[])",
      "begin_line": 438,
      "end_line": 485,
      "comment": " Compute (a[0] + a[1]) * (b[0] + b[1]) in extended precision.\n     * @param a first term of the multiplication\n     * @param b second term of the multiplication\n     * @param result placeholder where to put the result\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 42)",
        "(line 440,col 9)-(line 440,col 42)",
        "(line 441,col 9)-(line 441,col 42)",
        "(line 444,col 9)-(line 444,col 24)",
        "(line 445,col 9)-(line 445,col 24)",
        "(line 446,col 9)-(line 446,col 30)",
        "(line 448,col 9)-(line 448,col 26)",
        "(line 449,col 9)-(line 449,col 26)",
        "(line 452,col 9)-(line 452,col 24)",
        "(line 453,col 9)-(line 453,col 30)",
        "(line 455,col 9)-(line 455,col 39)",
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 457,col 24)",
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 459,col 58)",
        "(line 460,col 9)-(line 460,col 24)",
        "(line 463,col 9)-(line 463,col 24)",
        "(line 464,col 9)-(line 464,col 24)",
        "(line 465,col 9)-(line 465,col 30)",
        "(line 467,col 9)-(line 467,col 32)",
        "(line 468,col 9)-(line 468,col 58)",
        "(line 469,col 9)-(line 469,col 24)",
        "(line 470,col 9)-(line 470,col 32)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 472,col 24)",
        "(line 475,col 9)-(line 475,col 24)",
        "(line 476,col 9)-(line 476,col 24)",
        "(line 477,col 9)-(line 477,col 30)",
        "(line 479,col 9)-(line 479,col 32)",
        "(line 480,col 9)-(line 480,col 58)",
        "(line 481,col 9)-(line 481,col 24)",
        "(line 482,col 9)-(line 482,col 32)",
        "(line 483,col 9)-(line 483,col 58)",
        "(line 484,col 9)-(line 484,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.expint(int, double[])",
      "begin_line": 492,
      "end_line": 530,
      "comment": " Compute exp(p) for a integer p in extended precision.\n     * @param p integer whose exponential is requested\n     * @param result placeholder where to put the result in extended precision\n     * @return exp(p) in standard precision (equal to result[0] + result[1])\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 42)",
        "(line 495,col 9)-(line 495,col 42)",
        "(line 496,col 9)-(line 496,col 42)",
        "(line 505,col 9)-(line 505,col 34)",
        "(line 506,col 9)-(line 506,col 39)",
        "(line 508,col 9)-(line 508,col 23)",
        "(line 510,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 527,col 9)",
        "(line 529,col 9)-(line 529,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.slowLog(double)",
      "begin_line": 550,
      "end_line": 592,
      "comment": " xi in the range of [1, 2].\n     *                                3        5        7\n     *      x+1           /          x        x        x          \\\n     *  ln ----- \u003d   2 *  |  x  +   ----  +  ----  +  ---- + ...  |\n     *      1-x           \\          3        5        7          /\n     *\n     * So, compute a Remez approximation of the following function\n     *\n     *  ln ((sqrt(x)+1)/(1-sqrt(x)))  /  x\n     *\n     * This will be an even function with only positive coefficents.\n     * x is in the range [0 - 1/3].\n     *\n     * Transform xi for input to the above function by setting\n     * x \u003d (xi-1)/(xi+1).   Input to the polynomial is x^2, then\n     * the result is multiplied by x.\n     * @param xi number from which log is requested\n     * @return log(xi)\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 35)",
        "(line 552,col 9)-(line 552,col 36)",
        "(line 553,col 9)-(line 553,col 35)",
        "(line 554,col 9)-(line 554,col 35)",
        "(line 556,col 9)-(line 556,col 21)",
        "(line 559,col 9)-(line 559,col 20)",
        "(line 560,col 9)-(line 560,col 19)",
        "(line 561,col 9)-(line 561,col 30)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 563,col 9)-(line 563,col 19)",
        "(line 564,col 9)-(line 564,col 27)",
        "(line 565,col 9)-(line 565,col 20)",
        "(line 566,col 9)-(line 566,col 20)",
        "(line 569,col 9)-(line 569,col 28)",
        "(line 575,col 9)-(line 575,col 56)",
        "(line 576,col 9)-(line 576,col 56)",
        "(line 578,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 27)",
        "(line 588,col 9)-(line 588,col 20)",
        "(line 589,col 9)-(line 589,col 20)",
        "(line 591,col 9)-(line 591,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.printarray(java.io.PrintStream, java.lang.String, int, double[][])",
      "begin_line": 602,
      "end_line": 615,
      "comment": "\n     * Print an array.\n     * @param out text output stream where output should be printed\n     * @param name array name\n     * @param expectedLen expected length of the array\n     * @param array2d array data\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 26)",
        "(line 604,col 9)-(line 604,col 46)",
        "(line 605,col 9)-(line 605,col 44)",
        "(line 606,col 9)-(line 606,col 18)",
        "(line 607,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.printarray(java.io.PrintStream, java.lang.String, int, double[])",
      "begin_line": 624,
      "end_line": 632,
      "comment": "\n     * Print an array.\n     * @param out text output stream where output should be printed\n     * @param name array name\n     * @param expectedLen expected length of the array\n     * @param array array data\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 32)",
        "(line 626,col 9)-(line 626,col 44)",
        "(line 627,col 9)-(line 627,col 38)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.format(double)",
      "begin_line": 638,
      "end_line": 644,
      "comment": " Format a double.\n     * @param d double number to format\n     * @return formatted number\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 643,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.FastMathCalc.checkLen(int, int)",
      "begin_line": 652,
      "end_line": 657,
      "comment": "\n     * Check two lengths are equal.\n     * @param expectedLen expected length\n     * @param actual actual length\n     * @exception DimensionMismatchException if the two lengths are not equal\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 656,col 9)"
      ]
    }
  ]
}