{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 1084,
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
        "(line 370,col 9)-(line 370,col 33)",
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
      "begin_line": 455,
      "end_line": 512,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 462,col 33)",
        "(line 463,col 9)-(line 464,col 57)",
        "(line 466,col 9)-(line 466,col 42)",
        "(line 467,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 500,col 10)",
        "(line 502,col 9)-(line 502,col 37)",
        "(line 504,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.Anonymous-56d8677a-84b0-49e3-97db-484f07bae482.compare(org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 484,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 486,col 17)-(line 486,col 24)",
        "(line 487,col 17)-(line 497,col 17)",
        "(line 498,col 17)-(line 498,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(int[])",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 521,col 10)-(line 521,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(double[])",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 531,col 10)-(line 531,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(int[], int)",
      "begin_line": 543,
      "end_line": 547,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 544,col 10)-(line 544,col 43)",
        "(line 545,col 10)-(line 545,col 82)",
        "(line 546,col 10)-(line 546,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.copyOf(double[], int)",
      "begin_line": 558,
      "end_line": 562,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 559,col 10)-(line 559,col 49)",
        "(line 560,col 10)-(line 560,col 82)",
        "(line 561,col 10)-(line 561,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 580,
      "end_line": 635,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 33)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 50)",
        "(line 587,col 9)-(line 587,col 30)",
        "(line 589,col 9)-(line 605,col 9)",
        "(line 608,col 9)-(line 608,col 47)",
        "(line 609,col 9)-(line 609,col 42)",
        "(line 610,col 9)-(line 610,col 54)",
        "(line 611,col 9)-(line 611,col 49)",
        "(line 612,col 9)-(line 612,col 88)",
        "(line 614,col 9)-(line 614,col 40)",
        "(line 615,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 623,col 59)",
        "(line 625,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 634,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 658,
      "end_line": 712,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 52)",
        "(line 674,col 9)-(line 674,col 51)",
        "(line 675,col 9)-(line 675,col 46)",
        "(line 676,col 9)-(line 676,col 52)",
        "(line 677,col 9)-(line 677,col 51)",
        "(line 678,col 9)-(line 678,col 46)",
        "(line 681,col 9)-(line 681,col 42)",
        "(line 682,col 9)-(line 682,col 118)",
        "(line 685,col 9)-(line 685,col 52)",
        "(line 686,col 9)-(line 686,col 51)",
        "(line 687,col 9)-(line 687,col 46)",
        "(line 688,col 9)-(line 688,col 52)",
        "(line 689,col 9)-(line 689,col 51)",
        "(line 690,col 9)-(line 690,col 46)",
        "(line 693,col 9)-(line 693,col 42)",
        "(line 694,col 9)-(line 694,col 118)",
        "(line 697,col 9)-(line 697,col 56)",
        "(line 698,col 9)-(line 698,col 54)",
        "(line 699,col 9)-(line 699,col 94)",
        "(line 703,col 9)-(line 703,col 65)",
        "(line 705,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 711,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 737,
      "end_line": 809,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 52)",
        "(line 754,col 9)-(line 754,col 51)",
        "(line 755,col 9)-(line 755,col 46)",
        "(line 756,col 9)-(line 756,col 52)",
        "(line 757,col 9)-(line 757,col 51)",
        "(line 758,col 9)-(line 758,col 46)",
        "(line 761,col 9)-(line 761,col 42)",
        "(line 762,col 9)-(line 762,col 118)",
        "(line 765,col 9)-(line 765,col 52)",
        "(line 766,col 9)-(line 766,col 51)",
        "(line 767,col 9)-(line 767,col 46)",
        "(line 768,col 9)-(line 768,col 52)",
        "(line 769,col 9)-(line 769,col 51)",
        "(line 770,col 9)-(line 770,col 46)",
        "(line 773,col 9)-(line 773,col 42)",
        "(line 774,col 9)-(line 774,col 118)",
        "(line 777,col 9)-(line 777,col 52)",
        "(line 778,col 9)-(line 778,col 51)",
        "(line 779,col 9)-(line 779,col 46)",
        "(line 780,col 9)-(line 780,col 52)",
        "(line 781,col 9)-(line 781,col 51)",
        "(line 782,col 9)-(line 782,col 46)",
        "(line 785,col 9)-(line 785,col 42)",
        "(line 786,col 9)-(line 786,col 118)",
        "(line 789,col 9)-(line 789,col 56)",
        "(line 790,col 9)-(line 790,col 54)",
        "(line 791,col 9)-(line 791,col 94)",
        "(line 794,col 9)-(line 794,col 54)",
        "(line 795,col 9)-(line 795,col 55)",
        "(line 796,col 9)-(line 796,col 95)",
        "(line 800,col 9)-(line 800,col 87)",
        "(line 802,col 9)-(line 806,col 9)",
        "(line 808,col 9)-(line 808,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 838,
      "end_line": 928,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 52)",
        "(line 856,col 9)-(line 856,col 51)",
        "(line 857,col 9)-(line 857,col 46)",
        "(line 858,col 9)-(line 858,col 52)",
        "(line 859,col 9)-(line 859,col 51)",
        "(line 860,col 9)-(line 860,col 46)",
        "(line 863,col 9)-(line 863,col 42)",
        "(line 864,col 9)-(line 864,col 118)",
        "(line 867,col 9)-(line 867,col 52)",
        "(line 868,col 9)-(line 868,col 51)",
        "(line 869,col 9)-(line 869,col 46)",
        "(line 870,col 9)-(line 870,col 52)",
        "(line 871,col 9)-(line 871,col 51)",
        "(line 872,col 9)-(line 872,col 46)",
        "(line 875,col 9)-(line 875,col 42)",
        "(line 876,col 9)-(line 876,col 118)",
        "(line 879,col 9)-(line 879,col 52)",
        "(line 880,col 9)-(line 880,col 51)",
        "(line 881,col 9)-(line 881,col 46)",
        "(line 882,col 9)-(line 882,col 52)",
        "(line 883,col 9)-(line 883,col 51)",
        "(line 884,col 9)-(line 884,col 46)",
        "(line 887,col 9)-(line 887,col 42)",
        "(line 888,col 9)-(line 888,col 118)",
        "(line 891,col 9)-(line 891,col 52)",
        "(line 892,col 9)-(line 892,col 51)",
        "(line 893,col 9)-(line 893,col 46)",
        "(line 894,col 9)-(line 894,col 52)",
        "(line 895,col 9)-(line 895,col 51)",
        "(line 896,col 9)-(line 896,col 46)",
        "(line 899,col 9)-(line 899,col 42)",
        "(line 900,col 9)-(line 900,col 118)",
        "(line 903,col 9)-(line 903,col 56)",
        "(line 904,col 9)-(line 904,col 54)",
        "(line 905,col 9)-(line 905,col 94)",
        "(line 908,col 9)-(line 908,col 54)",
        "(line 909,col 9)-(line 909,col 55)",
        "(line 910,col 9)-(line 910,col 95)",
        "(line 913,col 9)-(line 913,col 55)",
        "(line 914,col 9)-(line 914,col 56)",
        "(line 915,col 9)-(line 915,col 99)",
        "(line 919,col 9)-(line 919,col 110)",
        "(line 921,col 9)-(line 925,col 9)",
        "(line 927,col 9)-(line 927,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equals(float[], float[])",
      "begin_line": 940,
      "end_line": 953,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 946,col 9)",
        "(line 947,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 966,
      "end_line": 979,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equals(double[], double[])",
      "begin_line": 991,
      "end_line": 1004,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1003,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1017,
      "end_line": 1030,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1023,col 9)",
        "(line 1024,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1029,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1054,
      "end_line": 1083,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1055,col 10)-(line 1057,col 10)",
        "(line 1058,col 10)-(line 1060,col 10)",
        "(line 1061,col 10)-(line 1061,col 25)",
        "(line 1062,col 10)-(line 1062,col 39)",
        "(line 1063,col 10)-(line 1063,col 40)",
        "(line 1064,col 10)-(line 1071,col 10)",
        "(line 1072,col 10)-(line 1074,col 10)",
        "(line 1075,col 10)-(line 1081,col 10)",
        "(line 1082,col 10)-(line 1082,col 20)"
      ]
    }
  ]
}