{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 1623,
      "comment": "\n * Arrays utilities.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_FACTOR"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Factor used for splitting double numbers: n \u003d 2^27 + 1 (i.e. {@value}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MathArrays.MathArrays()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 72,
      "comment": "\n     * Real-valued function that operate on an array or a part of it.\n     * @since 3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[])",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n         * Operates on an entire array.\n         *\n         * @param array Array to operate on.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[], int, int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n         * @param array Array to operate on.\n         * @param startIndex Index of the first element to take into account.\n         * @param numElements Number of elements to take into account.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeAdd(double[], double[])",
      "begin_line": 84,
      "end_line": 95,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * addition of the arguments.\n     *\n     * @param a First term of the addition.\n     * @param b Second term of the addition.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] + b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeSubtract(double[], double[])",
      "begin_line": 106,
      "end_line": 117,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * subtraction of the second argument from the first.\n     *\n     * @param a First term.\n     * @param b Element to be subtracted.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] - b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 42)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeMultiply(double[], double[])",
      "begin_line": 128,
      "end_line": 139,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * multiplication of the arguments.\n     *\n     * @param a First factor of the multiplication.\n     * @param b Second factor of the multiplication.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] * b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 42)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeDivide(double[], double[])",
      "begin_line": 150,
      "end_line": 161,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * division of the first argument by the second.\n     *\n     * @param a Numerator of the division.\n     * @param b Denominator of the division.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] / b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 42)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(double[], double[])",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 23)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(int[], int[])",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 186,col 7)-(line 186,col 18)",
        "(line 187,col 7)-(line 189,col 7)",
        "(line 190,col 7)-(line 190,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(double[], double[])",
      "begin_line": 200,
      "end_line": 207,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 23)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(int[], int[])",
      "begin_line": 216,
      "end_line": 223,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 217,col 7)-(line 217,col 21)",
        "(line 218,col 7)-(line 221,col 7)",
        "(line 222,col 7)-(line 222,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(double[], double[])",
      "begin_line": 232,
      "end_line": 238,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 23)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(int[], int[])",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 20)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(T[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 274,
      "end_line": 314,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param \u003cT\u003e the type of the elements in the specified array\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 28)",
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 324,
      "end_line": 328,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 341,
      "end_line": 392,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 33)",
        "(line 345,col 9)-(line 345,col 35)",
        "(line 347,col 9)-(line 347,col 18)",
        "(line 348,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 384,col 9)",
        "(line 387,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 403,
      "end_line": 406,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[])",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkRectangular(long[][])",
      "begin_line": 427,
      "end_line": 437,
      "comment": "\n     * Throws DimensionMismatchException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullArgumentException if input array is null\n     * @throws DimensionMismatchException if input array is not rectangular\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 35)",
        "(line 430,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkPositive(double[])",
      "begin_line": 447,
      "end_line": 454,
      "comment": "\n     * Check that all entries of the input array are strictly positive.\n     *\n     * @param in Array to be tested\n     * @throws NotStrictlyPositiveException if any entries of the array are not\n     * strictly positive.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[])",
      "begin_line": 463,
      "end_line": 470,
      "comment": "\n     * Check that all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[][])",
      "begin_line": 479,
      "end_line": 488,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.safeNorm(double[])",
      "begin_line": 550,
      "end_line": 603,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 34)",
        "(line 552,col 9)-(line 552,col 34)",
        "(line 553,col 9)-(line 553,col 22)",
        "(line 554,col 9)-(line 554,col 22)",
        "(line 555,col 9)-(line 555,col 22)",
        "(line 556,col 9)-(line 556,col 25)",
        "(line 557,col 9)-(line 557,col 25)",
        "(line 558,col 9)-(line 558,col 33)",
        "(line 559,col 9)-(line 559,col 40)",
        "(line 560,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 20)",
        "(line 589,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 621,
      "end_line": 624,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 643,
      "end_line": 701,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 651,col 33)",
        "(line 652,col 9)-(line 653,col 57)",
        "(line 655,col 9)-(line 655,col 42)",
        "(line 656,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 689,col 10)",
        "(line 691,col 9)-(line 691,col 37)",
        "(line 693,col 9)-(line 700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-bd379cda-f4c6-47a7-8501-42becf142464.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 673,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 675,col 17)-(line 675,col 24)",
        "(line 676,col 17)-(line 686,col 17)",
        "(line 687,col 17)-(line 687,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 710,col 10)-(line 710,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 720,col 10)-(line 720,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 732,
      "end_line": 736,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 733,col 10)-(line 733,col 43)",
        "(line 734,col 10)-(line 734,col 82)",
        "(line 735,col 10)-(line 735,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 747,
      "end_line": 751,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 748,col 10)-(line 748,col 49)",
        "(line 749,col 10)-(line 749,col 82)",
        "(line 750,col 10)-(line 750,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 770,
      "end_line": 826,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 33)",
        "(line 773,col 9)-(line 775,col 9)",
        "(line 777,col 9)-(line 777,col 50)",
        "(line 778,col 9)-(line 778,col 30)",
        "(line 780,col 9)-(line 796,col 9)",
        "(line 799,col 9)-(line 799,col 47)",
        "(line 800,col 9)-(line 800,col 42)",
        "(line 801,col 9)-(line 801,col 54)",
        "(line 802,col 9)-(line 802,col 49)",
        "(line 803,col 9)-(line 803,col 88)",
        "(line 805,col 9)-(line 805,col 40)",
        "(line 806,col 9)-(line 812,col 9)",
        "(line 814,col 9)-(line 814,col 59)",
        "(line 816,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 825,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 849,
      "end_line": 903,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 52)",
        "(line 865,col 9)-(line 865,col 51)",
        "(line 866,col 9)-(line 866,col 46)",
        "(line 867,col 9)-(line 867,col 52)",
        "(line 868,col 9)-(line 868,col 51)",
        "(line 869,col 9)-(line 869,col 46)",
        "(line 872,col 9)-(line 872,col 42)",
        "(line 873,col 9)-(line 873,col 118)",
        "(line 876,col 9)-(line 876,col 52)",
        "(line 877,col 9)-(line 877,col 51)",
        "(line 878,col 9)-(line 878,col 46)",
        "(line 879,col 9)-(line 879,col 52)",
        "(line 880,col 9)-(line 880,col 51)",
        "(line 881,col 9)-(line 881,col 46)",
        "(line 884,col 9)-(line 884,col 42)",
        "(line 885,col 9)-(line 885,col 118)",
        "(line 888,col 9)-(line 888,col 56)",
        "(line 889,col 9)-(line 889,col 54)",
        "(line 890,col 9)-(line 890,col 94)",
        "(line 894,col 9)-(line 894,col 65)",
        "(line 896,col 9)-(line 900,col 9)",
        "(line 902,col 9)-(line 902,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 928,
      "end_line": 1000,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 52)",
        "(line 945,col 9)-(line 945,col 51)",
        "(line 946,col 9)-(line 946,col 46)",
        "(line 947,col 9)-(line 947,col 52)",
        "(line 948,col 9)-(line 948,col 51)",
        "(line 949,col 9)-(line 949,col 46)",
        "(line 952,col 9)-(line 952,col 42)",
        "(line 953,col 9)-(line 953,col 118)",
        "(line 956,col 9)-(line 956,col 52)",
        "(line 957,col 9)-(line 957,col 51)",
        "(line 958,col 9)-(line 958,col 46)",
        "(line 959,col 9)-(line 959,col 52)",
        "(line 960,col 9)-(line 960,col 51)",
        "(line 961,col 9)-(line 961,col 46)",
        "(line 964,col 9)-(line 964,col 42)",
        "(line 965,col 9)-(line 965,col 118)",
        "(line 968,col 9)-(line 968,col 52)",
        "(line 969,col 9)-(line 969,col 51)",
        "(line 970,col 9)-(line 970,col 46)",
        "(line 971,col 9)-(line 971,col 52)",
        "(line 972,col 9)-(line 972,col 51)",
        "(line 973,col 9)-(line 973,col 46)",
        "(line 976,col 9)-(line 976,col 42)",
        "(line 977,col 9)-(line 977,col 118)",
        "(line 980,col 9)-(line 980,col 56)",
        "(line 981,col 9)-(line 981,col 54)",
        "(line 982,col 9)-(line 982,col 94)",
        "(line 985,col 9)-(line 985,col 54)",
        "(line 986,col 9)-(line 986,col 55)",
        "(line 987,col 9)-(line 987,col 95)",
        "(line 991,col 9)-(line 991,col 87)",
        "(line 993,col 9)-(line 997,col 9)",
        "(line 999,col 9)-(line 999,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 1029,
      "end_line": 1119,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 52)",
        "(line 1047,col 9)-(line 1047,col 51)",
        "(line 1048,col 9)-(line 1048,col 46)",
        "(line 1049,col 9)-(line 1049,col 52)",
        "(line 1050,col 9)-(line 1050,col 51)",
        "(line 1051,col 9)-(line 1051,col 46)",
        "(line 1054,col 9)-(line 1054,col 42)",
        "(line 1055,col 9)-(line 1055,col 118)",
        "(line 1058,col 9)-(line 1058,col 52)",
        "(line 1059,col 9)-(line 1059,col 51)",
        "(line 1060,col 9)-(line 1060,col 46)",
        "(line 1061,col 9)-(line 1061,col 52)",
        "(line 1062,col 9)-(line 1062,col 51)",
        "(line 1063,col 9)-(line 1063,col 46)",
        "(line 1066,col 9)-(line 1066,col 42)",
        "(line 1067,col 9)-(line 1067,col 118)",
        "(line 1070,col 9)-(line 1070,col 52)",
        "(line 1071,col 9)-(line 1071,col 51)",
        "(line 1072,col 9)-(line 1072,col 46)",
        "(line 1073,col 9)-(line 1073,col 52)",
        "(line 1074,col 9)-(line 1074,col 51)",
        "(line 1075,col 9)-(line 1075,col 46)",
        "(line 1078,col 9)-(line 1078,col 42)",
        "(line 1079,col 9)-(line 1079,col 118)",
        "(line 1082,col 9)-(line 1082,col 52)",
        "(line 1083,col 9)-(line 1083,col 51)",
        "(line 1084,col 9)-(line 1084,col 46)",
        "(line 1085,col 9)-(line 1085,col 52)",
        "(line 1086,col 9)-(line 1086,col 51)",
        "(line 1087,col 9)-(line 1087,col 46)",
        "(line 1090,col 9)-(line 1090,col 42)",
        "(line 1091,col 9)-(line 1091,col 118)",
        "(line 1094,col 9)-(line 1094,col 56)",
        "(line 1095,col 9)-(line 1095,col 54)",
        "(line 1096,col 9)-(line 1096,col 94)",
        "(line 1099,col 9)-(line 1099,col 54)",
        "(line 1100,col 9)-(line 1100,col 55)",
        "(line 1101,col 9)-(line 1101,col 95)",
        "(line 1104,col 9)-(line 1104,col 55)",
        "(line 1105,col 9)-(line 1105,col 56)",
        "(line 1106,col 9)-(line 1106,col 99)",
        "(line 1110,col 9)-(line 1110,col 110)",
        "(line 1112,col 9)-(line 1116,col 9)",
        "(line 1118,col 9)-(line 1118,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 1139,
      "end_line": 1164,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1143,col 9)-(line 1143,col 54)",
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1147,col 54)",
        "(line 1148,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 84)",
        "(line 1154,col 9)-(line 1154,col 68)",
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1160,col 9)-(line 1160,col 62)",
        "(line 1161,col 9)-(line 1161,col 32)",
        "(line 1162,col 9)-(line 1162,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 1183,
      "end_line": 1204,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1187,col 54)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 78)",
        "(line 1194,col 9)-(line 1194,col 68)",
        "(line 1195,col 9)-(line 1197,col 9)",
        "(line 1200,col 9)-(line 1200,col 62)",
        "(line 1201,col 9)-(line 1201,col 32)",
        "(line 1202,col 9)-(line 1202,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1228,
      "end_line": 1243,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure)\n     * @see #linearCombination(DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1232,col 9)-(line 1233,col 96)",
        "(line 1236,col 9)-(line 1236,col 85)",
        "(line 1239,col 9)-(line 1239,col 62)",
        "(line 1240,col 9)-(line 1240,col 32)",
        "(line 1241,col 9)-(line 1241,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1267,
      "end_line": 1282,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, DerivativeStructure, double, DerivativeStructure, double, DerivativeStructure)\n     * @see #linearCombination(double, DerivativeStructure, double, DerivativeStructure, double, DerivativeStructure, double, DerivativeStructure)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1272,col 85)",
        "(line 1275,col 9)-(line 1275,col 85)",
        "(line 1278,col 9)-(line 1278,col 62)",
        "(line 1279,col 9)-(line 1279,col 32)",
        "(line 1280,col 9)-(line 1280,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1308,
      "end_line": 1325,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure)\n     * @see #linearCombination(DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1315,col 96)",
        "(line 1318,col 9)-(line 1318,col 106)",
        "(line 1321,col 9)-(line 1321,col 62)",
        "(line 1322,col 9)-(line 1322,col 32)",
        "(line 1323,col 9)-(line 1323,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1351,
      "end_line": 1368,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, DerivativeStructure, double, DerivativeStructure)\n     * @see #linearCombination(double, DerivativeStructure, double, DerivativeStructure, double, DerivativeStructure, double, DerivativeStructure)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1356,col 9)-(line 1358,col 85)",
        "(line 1361,col 9)-(line 1361,col 106)",
        "(line 1364,col 9)-(line 1364,col 62)",
        "(line 1365,col 9)-(line 1365,col 32)",
        "(line 1366,col 9)-(line 1366,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1398,
      "end_line": 1417,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure)\n     * @see #linearCombination(DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure, DerivativeStructure)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1404,col 9)-(line 1407,col 96)",
        "(line 1410,col 9)-(line 1410,col 127)",
        "(line 1413,col 9)-(line 1413,col 62)",
        "(line 1414,col 9)-(line 1414,col 32)",
        "(line 1415,col 9)-(line 1415,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1447,
      "end_line": 1466,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, DerivativeStructure, double, DerivativeStructure)\n     * @see #linearCombination(double, DerivativeStructure, double, DerivativeStructure, double, DerivativeStructure)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1456,col 85)",
        "(line 1459,col 9)-(line 1459,col 127)",
        "(line 1462,col 9)-(line 1462,col 62)",
        "(line 1463,col 9)-(line 1463,col 32)",
        "(line 1464,col 9)-(line 1464,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 1478,
      "end_line": 1491,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 1479,col 9)-(line 1481,col 9)",
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1489,col 9)",
        "(line 1490,col 9)-(line 1490,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 1504,
      "end_line": 1517,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1505,col 9)-(line 1507,col 9)",
        "(line 1508,col 9)-(line 1510,col 9)",
        "(line 1511,col 9)-(line 1515,col 9)",
        "(line 1516,col 9)-(line 1516,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 1529,
      "end_line": 1542,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 1530,col 9)-(line 1532,col 9)",
        "(line 1533,col 9)-(line 1535,col 9)",
        "(line 1536,col 9)-(line 1540,col 9)",
        "(line 1541,col 9)-(line 1541,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1555,
      "end_line": 1568,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1556,col 9)-(line 1558,col 9)",
        "(line 1559,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1566,col 9)",
        "(line 1567,col 9)-(line 1567,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1592,
      "end_line": 1622,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1594,col 10)-(line 1596,col 10)",
        "(line 1597,col 10)-(line 1599,col 10)",
        "(line 1600,col 10)-(line 1600,col 25)",
        "(line 1601,col 10)-(line 1601,col 39)",
        "(line 1602,col 10)-(line 1602,col 40)",
        "(line 1603,col 10)-(line 1610,col 10)",
        "(line 1611,col 10)-(line 1613,col 10)",
        "(line 1614,col 10)-(line 1620,col 10)",
        "(line 1621,col 10)-(line 1621,col 20)"
      ]
    }
  ]
}