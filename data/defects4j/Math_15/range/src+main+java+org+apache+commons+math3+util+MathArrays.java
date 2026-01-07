{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 1181,
      "comment": "\n * Arrays utilities.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_FACTOR"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Factor used for splitting double numbers: n \u003d 2^27 + 1 (i.e. {@value}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MathArrays.MathArrays()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 70,
      "comment": "\n     * Real-valued function that operate on an array or a part of it.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[])",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n         * Operates on an entire array.\n         *\n         * @param array Array to operate on.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[], int, int)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n         * @param array Array to operate on.\n         * @param startIndex Index of the first element to take into account.\n         * @param numElements Number of elements to take into account.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(double[], double[])",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(int[], int[])",
      "begin_line": 94,
      "end_line": 100,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 95,col 7)-(line 95,col 18)",
        "(line 96,col 7)-(line 98,col 7)",
        "(line 99,col 7)-(line 99,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(double[], double[])",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 23)",
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(int[], int[])",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 126,col 7)-(line 126,col 21)",
        "(line 127,col 7)-(line 130,col 7)",
        "(line 131,col 7)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(double[], double[])",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(int[], int[])",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 20)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(T[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 183,
      "end_line": 223,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param \u003cT\u003e the type of the elements in the specified array\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 28)",
        "(line 187,col 9)-(line 187,col 35)",
        "(line 188,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 233,
      "end_line": 237,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 250,
      "end_line": 301,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 254,col 35)",
        "(line 256,col 9)-(line 256,col 18)",
        "(line 257,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 293,col 9)",
        "(line 296,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[])",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkRectangular(long[][])",
      "begin_line": 335,
      "end_line": 345,
      "comment": "\n     * Throws DimensionMismatchException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullArgumentException if input array is null\n     * @throws DimensionMismatchException if input array is not rectangular\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 35)",
        "(line 338,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkPositive(double[])",
      "begin_line": 354,
      "end_line": 361,
      "comment": "\n     * Check that all entries of the input array are strictly positive.\n     *\n     * @param in Array to be tested\n     * @throws NotStrictlyPositiveException if any entries of the array are not\n     * strictly positive.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[])",
      "begin_line": 369,
      "end_line": 376,
      "comment": "\n     * Check that all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[][])",
      "begin_line": 384,
      "end_line": 393,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.safeNorm(double[])",
      "begin_line": 455,
      "end_line": 508,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 34)",
        "(line 457,col 9)-(line 457,col 34)",
        "(line 458,col 9)-(line 458,col 22)",
        "(line 459,col 9)-(line 459,col 22)",
        "(line 460,col 9)-(line 460,col 22)",
        "(line 461,col 9)-(line 461,col 25)",
        "(line 462,col 9)-(line 462,col 25)",
        "(line 463,col 9)-(line 463,col 33)",
        "(line 464,col 9)-(line 464,col 40)",
        "(line 465,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 20)",
        "(line 494,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 526,
      "end_line": 529,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 548,
      "end_line": 606,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 33)",
        "(line 557,col 9)-(line 558,col 57)",
        "(line 560,col 9)-(line 560,col 42)",
        "(line 561,col 9)-(line 574,col 9)",
        "(line 576,col 9)-(line 594,col 10)",
        "(line 596,col 9)-(line 596,col 37)",
        "(line 598,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-0e252021-ef50-4981-84ea-3c2529cf0f75.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 578,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 580,col 17)-(line 580,col 24)",
        "(line 581,col 17)-(line 591,col 17)",
        "(line 592,col 17)-(line 592,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 615,col 10)-(line 615,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 625,col 10)-(line 625,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 637,
      "end_line": 641,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 638,col 10)-(line 638,col 43)",
        "(line 639,col 10)-(line 639,col 82)",
        "(line 640,col 10)-(line 640,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 652,
      "end_line": 656,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 653,col 10)-(line 653,col 49)",
        "(line 654,col 10)-(line 654,col 82)",
        "(line 655,col 10)-(line 655,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 675,
      "end_line": 731,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 33)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 682,col 9)-(line 682,col 50)",
        "(line 683,col 9)-(line 683,col 30)",
        "(line 685,col 9)-(line 701,col 9)",
        "(line 704,col 9)-(line 704,col 47)",
        "(line 705,col 9)-(line 705,col 42)",
        "(line 706,col 9)-(line 706,col 54)",
        "(line 707,col 9)-(line 707,col 49)",
        "(line 708,col 9)-(line 708,col 88)",
        "(line 710,col 9)-(line 710,col 40)",
        "(line 711,col 9)-(line 717,col 9)",
        "(line 719,col 9)-(line 719,col 59)",
        "(line 721,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 754,
      "end_line": 808,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 52)",
        "(line 770,col 9)-(line 770,col 51)",
        "(line 771,col 9)-(line 771,col 46)",
        "(line 772,col 9)-(line 772,col 52)",
        "(line 773,col 9)-(line 773,col 51)",
        "(line 774,col 9)-(line 774,col 46)",
        "(line 777,col 9)-(line 777,col 42)",
        "(line 778,col 9)-(line 778,col 118)",
        "(line 781,col 9)-(line 781,col 52)",
        "(line 782,col 9)-(line 782,col 51)",
        "(line 783,col 9)-(line 783,col 46)",
        "(line 784,col 9)-(line 784,col 52)",
        "(line 785,col 9)-(line 785,col 51)",
        "(line 786,col 9)-(line 786,col 46)",
        "(line 789,col 9)-(line 789,col 42)",
        "(line 790,col 9)-(line 790,col 118)",
        "(line 793,col 9)-(line 793,col 56)",
        "(line 794,col 9)-(line 794,col 54)",
        "(line 795,col 9)-(line 795,col 94)",
        "(line 799,col 9)-(line 799,col 65)",
        "(line 801,col 9)-(line 805,col 9)",
        "(line 807,col 9)-(line 807,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 833,
      "end_line": 905,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 52)",
        "(line 850,col 9)-(line 850,col 51)",
        "(line 851,col 9)-(line 851,col 46)",
        "(line 852,col 9)-(line 852,col 52)",
        "(line 853,col 9)-(line 853,col 51)",
        "(line 854,col 9)-(line 854,col 46)",
        "(line 857,col 9)-(line 857,col 42)",
        "(line 858,col 9)-(line 858,col 118)",
        "(line 861,col 9)-(line 861,col 52)",
        "(line 862,col 9)-(line 862,col 51)",
        "(line 863,col 9)-(line 863,col 46)",
        "(line 864,col 9)-(line 864,col 52)",
        "(line 865,col 9)-(line 865,col 51)",
        "(line 866,col 9)-(line 866,col 46)",
        "(line 869,col 9)-(line 869,col 42)",
        "(line 870,col 9)-(line 870,col 118)",
        "(line 873,col 9)-(line 873,col 52)",
        "(line 874,col 9)-(line 874,col 51)",
        "(line 875,col 9)-(line 875,col 46)",
        "(line 876,col 9)-(line 876,col 52)",
        "(line 877,col 9)-(line 877,col 51)",
        "(line 878,col 9)-(line 878,col 46)",
        "(line 881,col 9)-(line 881,col 42)",
        "(line 882,col 9)-(line 882,col 118)",
        "(line 885,col 9)-(line 885,col 56)",
        "(line 886,col 9)-(line 886,col 54)",
        "(line 887,col 9)-(line 887,col 94)",
        "(line 890,col 9)-(line 890,col 54)",
        "(line 891,col 9)-(line 891,col 55)",
        "(line 892,col 9)-(line 892,col 95)",
        "(line 896,col 9)-(line 896,col 87)",
        "(line 898,col 9)-(line 902,col 9)",
        "(line 904,col 9)-(line 904,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 934,
      "end_line": 1024,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 52)",
        "(line 952,col 9)-(line 952,col 51)",
        "(line 953,col 9)-(line 953,col 46)",
        "(line 954,col 9)-(line 954,col 52)",
        "(line 955,col 9)-(line 955,col 51)",
        "(line 956,col 9)-(line 956,col 46)",
        "(line 959,col 9)-(line 959,col 42)",
        "(line 960,col 9)-(line 960,col 118)",
        "(line 963,col 9)-(line 963,col 52)",
        "(line 964,col 9)-(line 964,col 51)",
        "(line 965,col 9)-(line 965,col 46)",
        "(line 966,col 9)-(line 966,col 52)",
        "(line 967,col 9)-(line 967,col 51)",
        "(line 968,col 9)-(line 968,col 46)",
        "(line 971,col 9)-(line 971,col 42)",
        "(line 972,col 9)-(line 972,col 118)",
        "(line 975,col 9)-(line 975,col 52)",
        "(line 976,col 9)-(line 976,col 51)",
        "(line 977,col 9)-(line 977,col 46)",
        "(line 978,col 9)-(line 978,col 52)",
        "(line 979,col 9)-(line 979,col 51)",
        "(line 980,col 9)-(line 980,col 46)",
        "(line 983,col 9)-(line 983,col 42)",
        "(line 984,col 9)-(line 984,col 118)",
        "(line 987,col 9)-(line 987,col 52)",
        "(line 988,col 9)-(line 988,col 51)",
        "(line 989,col 9)-(line 989,col 46)",
        "(line 990,col 9)-(line 990,col 52)",
        "(line 991,col 9)-(line 991,col 51)",
        "(line 992,col 9)-(line 992,col 46)",
        "(line 995,col 9)-(line 995,col 42)",
        "(line 996,col 9)-(line 996,col 118)",
        "(line 999,col 9)-(line 999,col 56)",
        "(line 1000,col 9)-(line 1000,col 54)",
        "(line 1001,col 9)-(line 1001,col 94)",
        "(line 1004,col 9)-(line 1004,col 54)",
        "(line 1005,col 9)-(line 1005,col 55)",
        "(line 1006,col 9)-(line 1006,col 95)",
        "(line 1009,col 9)-(line 1009,col 55)",
        "(line 1010,col 9)-(line 1010,col 56)",
        "(line 1011,col 9)-(line 1011,col 99)",
        "(line 1015,col 9)-(line 1015,col 110)",
        "(line 1017,col 9)-(line 1021,col 9)",
        "(line 1023,col 9)-(line 1023,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 1036,
      "end_line": 1049,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1042,col 9)",
        "(line 1043,col 9)-(line 1047,col 9)",
        "(line 1048,col 9)-(line 1048,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 1062,
      "end_line": 1075,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 1087,
      "end_line": 1100,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1091,col 9)-(line 1093,col 9)",
        "(line 1094,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1099,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1113,
      "end_line": 1126,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1119,col 9)",
        "(line 1120,col 9)-(line 1124,col 9)",
        "(line 1125,col 9)-(line 1125,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1150,
      "end_line": 1180,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1152,col 10)-(line 1154,col 10)",
        "(line 1155,col 10)-(line 1157,col 10)",
        "(line 1158,col 10)-(line 1158,col 25)",
        "(line 1159,col 10)-(line 1159,col 39)",
        "(line 1160,col 10)-(line 1160,col 40)",
        "(line 1161,col 10)-(line 1168,col 10)",
        "(line 1169,col 10)-(line 1171,col 10)",
        "(line 1172,col 10)-(line 1178,col 10)",
        "(line 1179,col 10)-(line 1179,col 20)"
      ]
    }
  ]
}