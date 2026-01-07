{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 1083,
      "comment": "\n * Arrays utilities.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_FACTOR"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Factor used for splitting double numbers: n \u003d 2^27 + 1 (i.e. {@value}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathArrays.MathArrays()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.distance1(double[], double[])",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 23)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.distance1(int[], int[])",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 71,col 7)-(line 71,col 18)",
        "(line 72,col 7)-(line 74,col 7)",
        "(line 75,col 7)-(line 75,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.distance(double[], double[])",
      "begin_line": 85,
      "end_line": 92,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 23)",
        "(line 87,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.distance(int[], int[])",
      "begin_line": 101,
      "end_line": 108,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 21)",
        "(line 103,col 7)-(line 106,col 7)",
        "(line 107,col 7)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.distanceInf(double[], double[])",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 23)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.distanceInf(int[], int[])",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 20)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.isMonotonic(java.lang.Comparable[], org.apache.commons.math.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 158,
      "end_line": 198,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 17)",
        "(line 164,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.isMonotonic(double[], org.apache.commons.math.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.checkOrder(double[], org.apache.commons.math.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 225,
      "end_line": 275,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 35)",
        "(line 230,col 9)-(line 230,col 18)",
        "(line 231,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.checkOrder(double[], org.apache.commons.math.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.checkOrder(double[])",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.safeNorm(double[])",
      "begin_line": 362,
      "end_line": 415,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 34)",
        "(line 364,col 9)-(line 364,col 34)",
        "(line 365,col 9)-(line 365,col 22)",
        "(line 366,col 9)-(line 366,col 22)",
        "(line 367,col 9)-(line 367,col 22)",
        "(line 368,col 9)-(line 368,col 25)",
        "(line 369,col 9)-(line 369,col 25)",
        "(line 370,col 9)-(line 370,col 42)",
        "(line 371,col 9)-(line 371,col 40)",
        "(line 372,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 20)",
        "(line 401,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 433,
      "end_line": 436,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.sortInPlace(double[], org.apache.commons.math.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 454,
      "end_line": 511,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as\n     * {@link #sortInPlace(double[], double[] ...)}, but allows the order of\n     * the sort to be provided in the {@code dir} parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 33)",
        "(line 462,col 9)-(line 463,col 57)",
        "(line 465,col 9)-(line 465,col 42)",
        "(line 466,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 499,col 10)",
        "(line 501,col 9)-(line 501,col 37)",
        "(line 503,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.Anonymous-2977a65e-fb51-42af-a482-7e8c97189128.compare(org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 483,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 485,col 17)-(line 485,col 24)",
        "(line 486,col 17)-(line 496,col 17)",
        "(line 497,col 17)-(line 497,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(int[])",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 520,col 10)-(line 520,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(double[])",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 530,col 10)-(line 530,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(int[], int)",
      "begin_line": 542,
      "end_line": 546,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 543,col 10)-(line 543,col 43)",
        "(line 544,col 10)-(line 544,col 82)",
        "(line 545,col 10)-(line 545,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(double[], int)",
      "begin_line": 557,
      "end_line": 561,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 558,col 10)-(line 558,col 49)",
        "(line 559,col 10)-(line 559,col 82)",
        "(line 560,col 10)-(line 560,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 579,
      "end_line": 634,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 33)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 585,col 50)",
        "(line 586,col 9)-(line 586,col 30)",
        "(line 588,col 9)-(line 604,col 9)",
        "(line 607,col 9)-(line 607,col 47)",
        "(line 608,col 9)-(line 608,col 42)",
        "(line 609,col 9)-(line 609,col 54)",
        "(line 610,col 9)-(line 610,col 49)",
        "(line 611,col 9)-(line 611,col 88)",
        "(line 613,col 9)-(line 613,col 40)",
        "(line 614,col 9)-(line 620,col 9)",
        "(line 622,col 9)-(line 622,col 59)",
        "(line 624,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 657,
      "end_line": 711,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 52)",
        "(line 673,col 9)-(line 673,col 51)",
        "(line 674,col 9)-(line 674,col 46)",
        "(line 675,col 9)-(line 675,col 52)",
        "(line 676,col 9)-(line 676,col 51)",
        "(line 677,col 9)-(line 677,col 46)",
        "(line 680,col 9)-(line 680,col 42)",
        "(line 681,col 9)-(line 681,col 118)",
        "(line 684,col 9)-(line 684,col 52)",
        "(line 685,col 9)-(line 685,col 51)",
        "(line 686,col 9)-(line 686,col 46)",
        "(line 687,col 9)-(line 687,col 52)",
        "(line 688,col 9)-(line 688,col 51)",
        "(line 689,col 9)-(line 689,col 46)",
        "(line 692,col 9)-(line 692,col 42)",
        "(line 693,col 9)-(line 693,col 118)",
        "(line 696,col 9)-(line 696,col 56)",
        "(line 697,col 9)-(line 697,col 54)",
        "(line 698,col 9)-(line 698,col 94)",
        "(line 702,col 9)-(line 702,col 65)",
        "(line 704,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 736,
      "end_line": 808,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 52)",
        "(line 753,col 9)-(line 753,col 51)",
        "(line 754,col 9)-(line 754,col 46)",
        "(line 755,col 9)-(line 755,col 52)",
        "(line 756,col 9)-(line 756,col 51)",
        "(line 757,col 9)-(line 757,col 46)",
        "(line 760,col 9)-(line 760,col 42)",
        "(line 761,col 9)-(line 761,col 118)",
        "(line 764,col 9)-(line 764,col 52)",
        "(line 765,col 9)-(line 765,col 51)",
        "(line 766,col 9)-(line 766,col 46)",
        "(line 767,col 9)-(line 767,col 52)",
        "(line 768,col 9)-(line 768,col 51)",
        "(line 769,col 9)-(line 769,col 46)",
        "(line 772,col 9)-(line 772,col 42)",
        "(line 773,col 9)-(line 773,col 118)",
        "(line 776,col 9)-(line 776,col 52)",
        "(line 777,col 9)-(line 777,col 51)",
        "(line 778,col 9)-(line 778,col 46)",
        "(line 779,col 9)-(line 779,col 52)",
        "(line 780,col 9)-(line 780,col 51)",
        "(line 781,col 9)-(line 781,col 46)",
        "(line 784,col 9)-(line 784,col 42)",
        "(line 785,col 9)-(line 785,col 118)",
        "(line 788,col 9)-(line 788,col 56)",
        "(line 789,col 9)-(line 789,col 54)",
        "(line 790,col 9)-(line 790,col 94)",
        "(line 793,col 9)-(line 793,col 54)",
        "(line 794,col 9)-(line 794,col 55)",
        "(line 795,col 9)-(line 795,col 95)",
        "(line 799,col 9)-(line 799,col 87)",
        "(line 801,col 9)-(line 805,col 9)",
        "(line 807,col 9)-(line 807,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 837,
      "end_line": 927,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 52)",
        "(line 855,col 9)-(line 855,col 51)",
        "(line 856,col 9)-(line 856,col 46)",
        "(line 857,col 9)-(line 857,col 52)",
        "(line 858,col 9)-(line 858,col 51)",
        "(line 859,col 9)-(line 859,col 46)",
        "(line 862,col 9)-(line 862,col 42)",
        "(line 863,col 9)-(line 863,col 118)",
        "(line 866,col 9)-(line 866,col 52)",
        "(line 867,col 9)-(line 867,col 51)",
        "(line 868,col 9)-(line 868,col 46)",
        "(line 869,col 9)-(line 869,col 52)",
        "(line 870,col 9)-(line 870,col 51)",
        "(line 871,col 9)-(line 871,col 46)",
        "(line 874,col 9)-(line 874,col 42)",
        "(line 875,col 9)-(line 875,col 118)",
        "(line 878,col 9)-(line 878,col 52)",
        "(line 879,col 9)-(line 879,col 51)",
        "(line 880,col 9)-(line 880,col 46)",
        "(line 881,col 9)-(line 881,col 52)",
        "(line 882,col 9)-(line 882,col 51)",
        "(line 883,col 9)-(line 883,col 46)",
        "(line 886,col 9)-(line 886,col 42)",
        "(line 887,col 9)-(line 887,col 118)",
        "(line 890,col 9)-(line 890,col 52)",
        "(line 891,col 9)-(line 891,col 51)",
        "(line 892,col 9)-(line 892,col 46)",
        "(line 893,col 9)-(line 893,col 52)",
        "(line 894,col 9)-(line 894,col 51)",
        "(line 895,col 9)-(line 895,col 46)",
        "(line 898,col 9)-(line 898,col 42)",
        "(line 899,col 9)-(line 899,col 118)",
        "(line 902,col 9)-(line 902,col 56)",
        "(line 903,col 9)-(line 903,col 54)",
        "(line 904,col 9)-(line 904,col 94)",
        "(line 907,col 9)-(line 907,col 54)",
        "(line 908,col 9)-(line 908,col 55)",
        "(line 909,col 9)-(line 909,col 95)",
        "(line 912,col 9)-(line 912,col 55)",
        "(line 913,col 9)-(line 913,col 56)",
        "(line 914,col 9)-(line 914,col 99)",
        "(line 918,col 9)-(line 918,col 110)",
        "(line 920,col 9)-(line 924,col 9)",
        "(line 926,col 9)-(line 926,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equals(float[], float[])",
      "begin_line": 939,
      "end_line": 952,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 945,col 9)",
        "(line 946,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 951,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 965,
      "end_line": 978,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 977,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equals(double[], double[])",
      "begin_line": 990,
      "end_line": 1003,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 993,col 9)",
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 1001,col 9)",
        "(line 1002,col 9)-(line 1002,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1016,
      "end_line": 1029,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1028,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1053,
      "end_line": 1082,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1054,col 10)-(line 1056,col 10)",
        "(line 1057,col 10)-(line 1059,col 10)",
        "(line 1060,col 10)-(line 1060,col 25)",
        "(line 1061,col 10)-(line 1061,col 39)",
        "(line 1062,col 10)-(line 1062,col 40)",
        "(line 1063,col 10)-(line 1070,col 10)",
        "(line 1071,col 10)-(line 1073,col 10)",
        "(line 1074,col 10)-(line 1080,col 10)",
        "(line 1081,col 10)-(line 1081,col 20)"
      ]
    }
  ]
}