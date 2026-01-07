{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 1095,
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
      "signature": "org.apache.commons.math3.util.MathArrays.MathArrays()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(double[], double[])",
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
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(int[], int[])",
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
      "signature": "org.apache.commons.math3.util.MathArrays.distance(double[], double[])",
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
      "signature": "org.apache.commons.math3.util.MathArrays.distance(int[], int[])",
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
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(double[], double[])",
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
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(int[], int[])",
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
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(T[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 159,
      "end_line": 199,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param \u003cT\u003e the type of the elements in the specified array\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 35)",
        "(line 164,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 209,
      "end_line": 218,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 231,
      "end_line": 282,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 33)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 237,col 9)-(line 237,col 18)",
        "(line 238,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 274,col 9)",
        "(line 277,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[])",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.safeNorm(double[])",
      "begin_line": 369,
      "end_line": 422,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 34)",
        "(line 371,col 9)-(line 371,col 34)",
        "(line 372,col 9)-(line 372,col 22)",
        "(line 373,col 9)-(line 373,col 22)",
        "(line 374,col 9)-(line 374,col 22)",
        "(line 375,col 9)-(line 375,col 25)",
        "(line 376,col 9)-(line 376,col 25)",
        "(line 377,col 9)-(line 377,col 33)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 20)",
        "(line 408,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 440,
      "end_line": 443,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 462,
      "end_line": 520,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 33)",
        "(line 471,col 9)-(line 472,col 57)",
        "(line 474,col 9)-(line 474,col 42)",
        "(line 475,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 508,col 10)",
        "(line 510,col 9)-(line 510,col 37)",
        "(line 512,col 9)-(line 519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-54b91417-f0f1-4773-a4fe-370a075edc48.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 492,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 494,col 17)-(line 494,col 24)",
        "(line 495,col 17)-(line 505,col 17)",
        "(line 506,col 17)-(line 506,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 529,col 10)-(line 529,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 539,col 10)-(line 539,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 551,
      "end_line": 555,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 552,col 10)-(line 552,col 43)",
        "(line 553,col 10)-(line 553,col 82)",
        "(line 554,col 10)-(line 554,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 566,
      "end_line": 570,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 567,col 10)-(line 567,col 49)",
        "(line 568,col 10)-(line 568,col 82)",
        "(line 569,col 10)-(line 569,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 589,
      "end_line": 645,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 33)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 596,col 9)-(line 596,col 50)",
        "(line 597,col 9)-(line 597,col 30)",
        "(line 599,col 9)-(line 615,col 9)",
        "(line 618,col 9)-(line 618,col 47)",
        "(line 619,col 9)-(line 619,col 42)",
        "(line 620,col 9)-(line 620,col 54)",
        "(line 621,col 9)-(line 621,col 49)",
        "(line 622,col 9)-(line 622,col 88)",
        "(line 624,col 9)-(line 624,col 40)",
        "(line 625,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 59)",
        "(line 635,col 9)-(line 642,col 9)",
        "(line 644,col 9)-(line 644,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 668,
      "end_line": 722,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 52)",
        "(line 684,col 9)-(line 684,col 51)",
        "(line 685,col 9)-(line 685,col 46)",
        "(line 686,col 9)-(line 686,col 52)",
        "(line 687,col 9)-(line 687,col 51)",
        "(line 688,col 9)-(line 688,col 46)",
        "(line 691,col 9)-(line 691,col 42)",
        "(line 692,col 9)-(line 692,col 118)",
        "(line 695,col 9)-(line 695,col 52)",
        "(line 696,col 9)-(line 696,col 51)",
        "(line 697,col 9)-(line 697,col 46)",
        "(line 698,col 9)-(line 698,col 52)",
        "(line 699,col 9)-(line 699,col 51)",
        "(line 700,col 9)-(line 700,col 46)",
        "(line 703,col 9)-(line 703,col 42)",
        "(line 704,col 9)-(line 704,col 118)",
        "(line 707,col 9)-(line 707,col 56)",
        "(line 708,col 9)-(line 708,col 54)",
        "(line 709,col 9)-(line 709,col 94)",
        "(line 713,col 9)-(line 713,col 65)",
        "(line 715,col 9)-(line 719,col 9)",
        "(line 721,col 9)-(line 721,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 747,
      "end_line": 819,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 52)",
        "(line 764,col 9)-(line 764,col 51)",
        "(line 765,col 9)-(line 765,col 46)",
        "(line 766,col 9)-(line 766,col 52)",
        "(line 767,col 9)-(line 767,col 51)",
        "(line 768,col 9)-(line 768,col 46)",
        "(line 771,col 9)-(line 771,col 42)",
        "(line 772,col 9)-(line 772,col 118)",
        "(line 775,col 9)-(line 775,col 52)",
        "(line 776,col 9)-(line 776,col 51)",
        "(line 777,col 9)-(line 777,col 46)",
        "(line 778,col 9)-(line 778,col 52)",
        "(line 779,col 9)-(line 779,col 51)",
        "(line 780,col 9)-(line 780,col 46)",
        "(line 783,col 9)-(line 783,col 42)",
        "(line 784,col 9)-(line 784,col 118)",
        "(line 787,col 9)-(line 787,col 52)",
        "(line 788,col 9)-(line 788,col 51)",
        "(line 789,col 9)-(line 789,col 46)",
        "(line 790,col 9)-(line 790,col 52)",
        "(line 791,col 9)-(line 791,col 51)",
        "(line 792,col 9)-(line 792,col 46)",
        "(line 795,col 9)-(line 795,col 42)",
        "(line 796,col 9)-(line 796,col 118)",
        "(line 799,col 9)-(line 799,col 56)",
        "(line 800,col 9)-(line 800,col 54)",
        "(line 801,col 9)-(line 801,col 94)",
        "(line 804,col 9)-(line 804,col 54)",
        "(line 805,col 9)-(line 805,col 55)",
        "(line 806,col 9)-(line 806,col 95)",
        "(line 810,col 9)-(line 810,col 87)",
        "(line 812,col 9)-(line 816,col 9)",
        "(line 818,col 9)-(line 818,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 848,
      "end_line": 938,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 52)",
        "(line 866,col 9)-(line 866,col 51)",
        "(line 867,col 9)-(line 867,col 46)",
        "(line 868,col 9)-(line 868,col 52)",
        "(line 869,col 9)-(line 869,col 51)",
        "(line 870,col 9)-(line 870,col 46)",
        "(line 873,col 9)-(line 873,col 42)",
        "(line 874,col 9)-(line 874,col 118)",
        "(line 877,col 9)-(line 877,col 52)",
        "(line 878,col 9)-(line 878,col 51)",
        "(line 879,col 9)-(line 879,col 46)",
        "(line 880,col 9)-(line 880,col 52)",
        "(line 881,col 9)-(line 881,col 51)",
        "(line 882,col 9)-(line 882,col 46)",
        "(line 885,col 9)-(line 885,col 42)",
        "(line 886,col 9)-(line 886,col 118)",
        "(line 889,col 9)-(line 889,col 52)",
        "(line 890,col 9)-(line 890,col 51)",
        "(line 891,col 9)-(line 891,col 46)",
        "(line 892,col 9)-(line 892,col 52)",
        "(line 893,col 9)-(line 893,col 51)",
        "(line 894,col 9)-(line 894,col 46)",
        "(line 897,col 9)-(line 897,col 42)",
        "(line 898,col 9)-(line 898,col 118)",
        "(line 901,col 9)-(line 901,col 52)",
        "(line 902,col 9)-(line 902,col 51)",
        "(line 903,col 9)-(line 903,col 46)",
        "(line 904,col 9)-(line 904,col 52)",
        "(line 905,col 9)-(line 905,col 51)",
        "(line 906,col 9)-(line 906,col 46)",
        "(line 909,col 9)-(line 909,col 42)",
        "(line 910,col 9)-(line 910,col 118)",
        "(line 913,col 9)-(line 913,col 56)",
        "(line 914,col 9)-(line 914,col 54)",
        "(line 915,col 9)-(line 915,col 94)",
        "(line 918,col 9)-(line 918,col 54)",
        "(line 919,col 9)-(line 919,col 55)",
        "(line 920,col 9)-(line 920,col 95)",
        "(line 923,col 9)-(line 923,col 55)",
        "(line 924,col 9)-(line 924,col 56)",
        "(line 925,col 9)-(line 925,col 99)",
        "(line 929,col 9)-(line 929,col 110)",
        "(line 931,col 9)-(line 935,col 9)",
        "(line 937,col 9)-(line 937,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 950,
      "end_line": 963,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 976,
      "end_line": 989,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 1001,
      "end_line": 1014,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1027,
      "end_line": 1040,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1030,col 9)",
        "(line 1031,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1039,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1064,
      "end_line": 1094,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1066,col 10)-(line 1068,col 10)",
        "(line 1069,col 10)-(line 1071,col 10)",
        "(line 1072,col 10)-(line 1072,col 25)",
        "(line 1073,col 10)-(line 1073,col 39)",
        "(line 1074,col 10)-(line 1074,col 40)",
        "(line 1075,col 10)-(line 1082,col 10)",
        "(line 1083,col 10)-(line 1085,col 10)",
        "(line 1086,col 10)-(line 1092,col 10)",
        "(line 1093,col 10)-(line 1093,col 20)"
      ]
    }
  ]
}