{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 1324,
      "comment": "\n * Arrays utilities.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_FACTOR"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Factor used for splitting double numbers: n \u003d 2^27 + 1 (i.e. {@value}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MathArrays.MathArrays()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 74,
      "comment": "\n     * Real-valued function that operate on an array or a part of it.\n     * @since 3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[])",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n         * Operates on an entire array.\n         *\n         * @param array Array to operate on.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[], int, int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n         * @param array Array to operate on.\n         * @param startIndex Index of the first element to take into account.\n         * @param numElements Number of elements to take into account.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeAdd(double[], double[])",
      "begin_line": 86,
      "end_line": 97,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * addition of the arguments.\n     *\n     * @param a First term of the addition.\n     * @param b Second term of the addition.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] + b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 42)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeSubtract(double[], double[])",
      "begin_line": 108,
      "end_line": 119,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * subtraction of the second argument from the first.\n     *\n     * @param a First term.\n     * @param b Element to be subtracted.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] - b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeMultiply(double[], double[])",
      "begin_line": 130,
      "end_line": 141,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * multiplication of the arguments.\n     *\n     * @param a First factor of the multiplication.\n     * @param b Second factor of the multiplication.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] * b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeDivide(double[], double[])",
      "begin_line": 152,
      "end_line": 163,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * division of the first argument by the second.\n     *\n     * @param a Numerator of the division.\n     * @param b Denominator of the division.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] / b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 42)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(double[], double[])",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 23)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(int[], int[])",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 188,col 7)-(line 188,col 18)",
        "(line 189,col 7)-(line 191,col 7)",
        "(line 192,col 7)-(line 192,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(double[], double[])",
      "begin_line": 202,
      "end_line": 209,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 23)",
        "(line 204,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(int[], int[])",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 219,col 7)-(line 219,col 21)",
        "(line 220,col 7)-(line 223,col 7)",
        "(line 224,col 7)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(double[], double[])",
      "begin_line": 234,
      "end_line": 240,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(int[], int[])",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 20)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(T[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 276,
      "end_line": 316,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param \u003cT\u003e the type of the elements in the specified array\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 28)",
        "(line 280,col 9)-(line 280,col 35)",
        "(line 281,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 326,
      "end_line": 330,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 343,
      "end_line": 394,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 33)",
        "(line 347,col 9)-(line 347,col 35)",
        "(line 349,col 9)-(line 349,col 18)",
        "(line 350,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 386,col 9)",
        "(line 389,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[])",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkRectangular(long[][])",
      "begin_line": 429,
      "end_line": 439,
      "comment": "\n     * Throws DimensionMismatchException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullArgumentException if input array is null\n     * @throws DimensionMismatchException if input array is not rectangular\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 35)",
        "(line 432,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkPositive(double[])",
      "begin_line": 449,
      "end_line": 456,
      "comment": "\n     * Check that all entries of the input array are strictly positive.\n     *\n     * @param in Array to be tested\n     * @throws NotStrictlyPositiveException if any entries of the array are not\n     * strictly positive.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 455,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[])",
      "begin_line": 465,
      "end_line": 472,
      "comment": "\n     * Check that all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[][])",
      "begin_line": 481,
      "end_line": 490,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.safeNorm(double[])",
      "begin_line": 552,
      "end_line": 605,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 34)",
        "(line 554,col 9)-(line 554,col 34)",
        "(line 555,col 9)-(line 555,col 22)",
        "(line 556,col 9)-(line 556,col 22)",
        "(line 557,col 9)-(line 557,col 22)",
        "(line 558,col 9)-(line 558,col 25)",
        "(line 559,col 9)-(line 559,col 25)",
        "(line 560,col 9)-(line 560,col 33)",
        "(line 561,col 9)-(line 561,col 40)",
        "(line 562,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 20)",
        "(line 591,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 623,
      "end_line": 626,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 645,
      "end_line": 703,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 653,col 33)",
        "(line 654,col 9)-(line 655,col 57)",
        "(line 657,col 9)-(line 657,col 42)",
        "(line 658,col 9)-(line 671,col 9)",
        "(line 673,col 9)-(line 691,col 10)",
        "(line 693,col 9)-(line 693,col 37)",
        "(line 695,col 9)-(line 702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-8d9d0bfb-303e-4b12-b65a-3c4f20086286.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 675,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 677,col 17)-(line 677,col 24)",
        "(line 678,col 17)-(line 688,col 17)",
        "(line 689,col 17)-(line 689,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 712,col 10)-(line 712,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 722,col 10)-(line 722,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 734,
      "end_line": 738,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 735,col 10)-(line 735,col 43)",
        "(line 736,col 10)-(line 736,col 82)",
        "(line 737,col 10)-(line 737,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 749,
      "end_line": 753,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 750,col 10)-(line 750,col 49)",
        "(line 751,col 10)-(line 751,col 82)",
        "(line 752,col 10)-(line 752,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 772,
      "end_line": 828,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 33)",
        "(line 775,col 9)-(line 777,col 9)",
        "(line 779,col 9)-(line 779,col 50)",
        "(line 780,col 9)-(line 780,col 30)",
        "(line 782,col 9)-(line 798,col 9)",
        "(line 801,col 9)-(line 801,col 47)",
        "(line 802,col 9)-(line 802,col 42)",
        "(line 803,col 9)-(line 803,col 54)",
        "(line 804,col 9)-(line 804,col 49)",
        "(line 805,col 9)-(line 805,col 88)",
        "(line 807,col 9)-(line 807,col 40)",
        "(line 808,col 9)-(line 814,col 9)",
        "(line 816,col 9)-(line 816,col 59)",
        "(line 818,col 9)-(line 825,col 9)",
        "(line 827,col 9)-(line 827,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 851,
      "end_line": 905,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
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
        "(line 890,col 9)-(line 890,col 56)",
        "(line 891,col 9)-(line 891,col 54)",
        "(line 892,col 9)-(line 892,col 94)",
        "(line 896,col 9)-(line 896,col 65)",
        "(line 898,col 9)-(line 902,col 9)",
        "(line 904,col 9)-(line 904,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 930,
      "end_line": 1002,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 52)",
        "(line 947,col 9)-(line 947,col 51)",
        "(line 948,col 9)-(line 948,col 46)",
        "(line 949,col 9)-(line 949,col 52)",
        "(line 950,col 9)-(line 950,col 51)",
        "(line 951,col 9)-(line 951,col 46)",
        "(line 954,col 9)-(line 954,col 42)",
        "(line 955,col 9)-(line 955,col 118)",
        "(line 958,col 9)-(line 958,col 52)",
        "(line 959,col 9)-(line 959,col 51)",
        "(line 960,col 9)-(line 960,col 46)",
        "(line 961,col 9)-(line 961,col 52)",
        "(line 962,col 9)-(line 962,col 51)",
        "(line 963,col 9)-(line 963,col 46)",
        "(line 966,col 9)-(line 966,col 42)",
        "(line 967,col 9)-(line 967,col 118)",
        "(line 970,col 9)-(line 970,col 52)",
        "(line 971,col 9)-(line 971,col 51)",
        "(line 972,col 9)-(line 972,col 46)",
        "(line 973,col 9)-(line 973,col 52)",
        "(line 974,col 9)-(line 974,col 51)",
        "(line 975,col 9)-(line 975,col 46)",
        "(line 978,col 9)-(line 978,col 42)",
        "(line 979,col 9)-(line 979,col 118)",
        "(line 982,col 9)-(line 982,col 56)",
        "(line 983,col 9)-(line 983,col 54)",
        "(line 984,col 9)-(line 984,col 94)",
        "(line 987,col 9)-(line 987,col 54)",
        "(line 988,col 9)-(line 988,col 55)",
        "(line 989,col 9)-(line 989,col 95)",
        "(line 993,col 9)-(line 993,col 87)",
        "(line 995,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1001,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 1031,
      "end_line": 1121,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 52)",
        "(line 1049,col 9)-(line 1049,col 51)",
        "(line 1050,col 9)-(line 1050,col 46)",
        "(line 1051,col 9)-(line 1051,col 52)",
        "(line 1052,col 9)-(line 1052,col 51)",
        "(line 1053,col 9)-(line 1053,col 46)",
        "(line 1056,col 9)-(line 1056,col 42)",
        "(line 1057,col 9)-(line 1057,col 118)",
        "(line 1060,col 9)-(line 1060,col 52)",
        "(line 1061,col 9)-(line 1061,col 51)",
        "(line 1062,col 9)-(line 1062,col 46)",
        "(line 1063,col 9)-(line 1063,col 52)",
        "(line 1064,col 9)-(line 1064,col 51)",
        "(line 1065,col 9)-(line 1065,col 46)",
        "(line 1068,col 9)-(line 1068,col 42)",
        "(line 1069,col 9)-(line 1069,col 118)",
        "(line 1072,col 9)-(line 1072,col 52)",
        "(line 1073,col 9)-(line 1073,col 51)",
        "(line 1074,col 9)-(line 1074,col 46)",
        "(line 1075,col 9)-(line 1075,col 52)",
        "(line 1076,col 9)-(line 1076,col 51)",
        "(line 1077,col 9)-(line 1077,col 46)",
        "(line 1080,col 9)-(line 1080,col 42)",
        "(line 1081,col 9)-(line 1081,col 118)",
        "(line 1084,col 9)-(line 1084,col 52)",
        "(line 1085,col 9)-(line 1085,col 51)",
        "(line 1086,col 9)-(line 1086,col 46)",
        "(line 1087,col 9)-(line 1087,col 52)",
        "(line 1088,col 9)-(line 1088,col 51)",
        "(line 1089,col 9)-(line 1089,col 46)",
        "(line 1092,col 9)-(line 1092,col 42)",
        "(line 1093,col 9)-(line 1093,col 118)",
        "(line 1096,col 9)-(line 1096,col 56)",
        "(line 1097,col 9)-(line 1097,col 54)",
        "(line 1098,col 9)-(line 1098,col 94)",
        "(line 1101,col 9)-(line 1101,col 54)",
        "(line 1102,col 9)-(line 1102,col 55)",
        "(line 1103,col 9)-(line 1103,col 95)",
        "(line 1106,col 9)-(line 1106,col 55)",
        "(line 1107,col 9)-(line 1107,col 56)",
        "(line 1108,col 9)-(line 1108,col 99)",
        "(line 1112,col 9)-(line 1112,col 110)",
        "(line 1114,col 9)-(line 1118,col 9)",
        "(line 1120,col 9)-(line 1120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 1133,
      "end_line": 1146,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1139,col 9)",
        "(line 1140,col 9)-(line 1144,col 9)",
        "(line 1145,col 9)-(line 1145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 1159,
      "end_line": 1172,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1162,col 9)",
        "(line 1163,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 1184,
      "end_line": 1197,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1210,
      "end_line": 1223,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1216,col 9)",
        "(line 1217,col 9)-(line 1221,col 9)",
        "(line 1222,col 9)-(line 1222,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1247,
      "end_line": 1277,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1249,col 10)-(line 1251,col 10)",
        "(line 1252,col 10)-(line 1254,col 10)",
        "(line 1255,col 10)-(line 1255,col 25)",
        "(line 1256,col 10)-(line 1256,col 39)",
        "(line 1257,col 10)-(line 1257,col 40)",
        "(line 1258,col 10)-(line 1265,col 10)",
        "(line 1266,col 10)-(line 1268,col 10)",
        "(line 1269,col 10)-(line 1275,col 10)",
        "(line 1276,col 10)-(line 1276,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 1288,
      "end_line": 1293,
      "comment": " Build an array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param length of the array\n      * @return a new array\n      ",
      "child_ranges": [
        "(line 1289,col 10)-(line 1290,col 78)",
        "(line 1291,col 10)-(line 1291,col 45)",
        "(line 1292,col 10)-(line 1292,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 1306,
      "end_line": 1322,
      "comment": " Build a double dimension  array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param rows number of rows in the array\n     * @param columns number of columns (may be negative to build partial\n     * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n      * @return a new array\n      ",
      "child_ranges": [
        "(line 1308,col 10)-(line 1308,col 27)",
        "(line 1309,col 10)-(line 1320,col 10)",
        "(line 1321,col 10)-(line 1321,col 22)"
      ]
    }
  ]
}