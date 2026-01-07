{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 1536,
      "comment": "\n * Arrays utilities.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_FACTOR"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Factor used for splitting double numbers: n \u003d 2^27 + 1 (i.e. {@value}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MathArrays.MathArrays()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 78,
      "comment": "\n     * Real-valued function that operate on an array or a part of it.\n     * @since 3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[])",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n         * Operates on an entire array.\n         *\n         * @param array Array to operate on.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[], int, int)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n         * @param array Array to operate on.\n         * @param startIndex Index of the first element to take into account.\n         * @param numElements Number of elements to take into account.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.scale(double, double[])",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Create a copy of an array scaled by a value.\n     *\n     * @param arr Array to scale.\n     * @param val Scalar.\n     * @return scaled copy of array with each entry multiplied by val.\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 49)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.scaleInPlace(double, double[])",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eMultiply each element of an array by a value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe array is modified in place (no copy is created).\u003c/p\u003e\n     *\n     * @param arr Array to scale\n     * @param val Scalar\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeAdd(double[], double[])",
      "begin_line": 121,
      "end_line": 132,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * addition of the arguments.\n     *\n     * @param a First term of the addition.\n     * @param b Second term of the addition.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] + b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeSubtract(double[], double[])",
      "begin_line": 143,
      "end_line": 154,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * subtraction of the second argument from the first.\n     *\n     * @param a First term.\n     * @param b Element to be subtracted.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] - b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 42)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeMultiply(double[], double[])",
      "begin_line": 165,
      "end_line": 176,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * multiplication of the arguments.\n     *\n     * @param a First factor of the multiplication.\n     * @param b Second factor of the multiplication.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] * b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 42)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeDivide(double[], double[])",
      "begin_line": 187,
      "end_line": 198,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * division of the first argument by the second.\n     *\n     * @param a Numerator of the division.\n     * @param b Denominator of the division.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] / b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 42)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(double[], double[])",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 23)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(int[], int[])",
      "begin_line": 222,
      "end_line": 228,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 223,col 7)-(line 223,col 18)",
        "(line 224,col 7)-(line 226,col 7)",
        "(line 227,col 7)-(line 227,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(double[], double[])",
      "begin_line": 237,
      "end_line": 244,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 23)",
        "(line 239,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(int[], int[])",
      "begin_line": 253,
      "end_line": 260,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 254,col 7)-(line 254,col 21)",
        "(line 255,col 7)-(line 258,col 7)",
        "(line 259,col 7)-(line 259,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(double[], double[])",
      "begin_line": 269,
      "end_line": 275,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 23)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(int[], int[])",
      "begin_line": 284,
      "end_line": 290,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 20)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(T[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 311,
      "end_line": 351,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param \u003cT\u003e the type of the elements in the specified array\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 28)",
        "(line 315,col 9)-(line 315,col 35)",
        "(line 316,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 376,
      "end_line": 427,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 33)",
        "(line 380,col 9)-(line 380,col 35)",
        "(line 382,col 9)-(line 382,col 18)",
        "(line 383,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 419,col 9)",
        "(line 422,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[])",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkRectangular(long[][])",
      "begin_line": 462,
      "end_line": 472,
      "comment": "\n     * Throws DimensionMismatchException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullArgumentException if input array is null\n     * @throws DimensionMismatchException if input array is not rectangular\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 35)",
        "(line 465,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkPositive(double[])",
      "begin_line": 482,
      "end_line": 489,
      "comment": "\n     * Check that all entries of the input array are strictly positive.\n     *\n     * @param in Array to be tested\n     * @throws NotStrictlyPositiveException if any entries of the array are not\n     * strictly positive.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[])",
      "begin_line": 498,
      "end_line": 505,
      "comment": "\n     * Check that all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[][])",
      "begin_line": 514,
      "end_line": 523,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 522,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.safeNorm(double[])",
      "begin_line": 585,
      "end_line": 638,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 34)",
        "(line 587,col 9)-(line 587,col 34)",
        "(line 588,col 9)-(line 588,col 22)",
        "(line 589,col 9)-(line 589,col 22)",
        "(line 590,col 9)-(line 590,col 22)",
        "(line 591,col 9)-(line 591,col 25)",
        "(line 592,col 9)-(line 592,col 25)",
        "(line 593,col 9)-(line 593,col 33)",
        "(line 594,col 9)-(line 594,col 40)",
        "(line 595,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 20)",
        "(line 624,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 656,
      "end_line": 659,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 678,
      "end_line": 748,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 689,col 42)",
        "(line 690,col 9)-(line 690,col 33)",
        "(line 692,col 9)-(line 700,col 9)",
        "(line 703,col 9)-(line 704,col 56)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 710,col 9)-(line 722,col 10)",
        "(line 725,col 9)-(line 725,col 37)",
        "(line 730,col 9)-(line 730,col 43)",
        "(line 731,col 9)-(line 735,col 9)",
        "(line 739,col 9)-(line 747,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-ff5404db-0a2a-42c7-87f5-c67897449db0.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e)",
      "begin_line": 718,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 720,col 17)-(line 720,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-4774fbae-0ba4-4e44-9fb2-04cd38df5b7e.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e)",
      "begin_line": 713,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 715,col 17)-(line 715,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 757,col 10)-(line 757,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 767,col 10)-(line 767,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 779,
      "end_line": 783,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 780,col 10)-(line 780,col 43)",
        "(line 781,col 10)-(line 781,col 82)",
        "(line 782,col 10)-(line 782,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 794,
      "end_line": 798,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 795,col 10)-(line 795,col 49)",
        "(line 796,col 10)-(line 796,col 82)",
        "(line 797,col 10)-(line 797,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 817,
      "end_line": 878,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 33)",
        "(line 820,col 9)-(line 822,col 9)",
        "(line 824,col 9)-(line 827,col 9)",
        "(line 829,col 9)-(line 829,col 50)",
        "(line 830,col 9)-(line 830,col 30)",
        "(line 832,col 9)-(line 848,col 9)",
        "(line 851,col 9)-(line 851,col 47)",
        "(line 852,col 9)-(line 852,col 42)",
        "(line 853,col 9)-(line 853,col 54)",
        "(line 854,col 9)-(line 854,col 49)",
        "(line 855,col 9)-(line 855,col 88)",
        "(line 857,col 9)-(line 857,col 40)",
        "(line 858,col 9)-(line 864,col 9)",
        "(line 866,col 9)-(line 866,col 59)",
        "(line 868,col 9)-(line 875,col 9)",
        "(line 877,col 9)-(line 877,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 901,
      "end_line": 955,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 52)",
        "(line 917,col 9)-(line 917,col 51)",
        "(line 918,col 9)-(line 918,col 46)",
        "(line 919,col 9)-(line 919,col 52)",
        "(line 920,col 9)-(line 920,col 51)",
        "(line 921,col 9)-(line 921,col 46)",
        "(line 924,col 9)-(line 924,col 42)",
        "(line 925,col 9)-(line 925,col 118)",
        "(line 928,col 9)-(line 928,col 52)",
        "(line 929,col 9)-(line 929,col 51)",
        "(line 930,col 9)-(line 930,col 46)",
        "(line 931,col 9)-(line 931,col 52)",
        "(line 932,col 9)-(line 932,col 51)",
        "(line 933,col 9)-(line 933,col 46)",
        "(line 936,col 9)-(line 936,col 42)",
        "(line 937,col 9)-(line 937,col 118)",
        "(line 940,col 9)-(line 940,col 56)",
        "(line 941,col 9)-(line 941,col 54)",
        "(line 942,col 9)-(line 942,col 94)",
        "(line 946,col 9)-(line 946,col 65)",
        "(line 948,col 9)-(line 952,col 9)",
        "(line 954,col 9)-(line 954,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 980,
      "end_line": 1052,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 52)",
        "(line 997,col 9)-(line 997,col 51)",
        "(line 998,col 9)-(line 998,col 46)",
        "(line 999,col 9)-(line 999,col 52)",
        "(line 1000,col 9)-(line 1000,col 51)",
        "(line 1001,col 9)-(line 1001,col 46)",
        "(line 1004,col 9)-(line 1004,col 42)",
        "(line 1005,col 9)-(line 1005,col 118)",
        "(line 1008,col 9)-(line 1008,col 52)",
        "(line 1009,col 9)-(line 1009,col 51)",
        "(line 1010,col 9)-(line 1010,col 46)",
        "(line 1011,col 9)-(line 1011,col 52)",
        "(line 1012,col 9)-(line 1012,col 51)",
        "(line 1013,col 9)-(line 1013,col 46)",
        "(line 1016,col 9)-(line 1016,col 42)",
        "(line 1017,col 9)-(line 1017,col 118)",
        "(line 1020,col 9)-(line 1020,col 52)",
        "(line 1021,col 9)-(line 1021,col 51)",
        "(line 1022,col 9)-(line 1022,col 46)",
        "(line 1023,col 9)-(line 1023,col 52)",
        "(line 1024,col 9)-(line 1024,col 51)",
        "(line 1025,col 9)-(line 1025,col 46)",
        "(line 1028,col 9)-(line 1028,col 42)",
        "(line 1029,col 9)-(line 1029,col 118)",
        "(line 1032,col 9)-(line 1032,col 56)",
        "(line 1033,col 9)-(line 1033,col 54)",
        "(line 1034,col 9)-(line 1034,col 94)",
        "(line 1037,col 9)-(line 1037,col 54)",
        "(line 1038,col 9)-(line 1038,col 55)",
        "(line 1039,col 9)-(line 1039,col 95)",
        "(line 1043,col 9)-(line 1043,col 87)",
        "(line 1045,col 9)-(line 1049,col 9)",
        "(line 1051,col 9)-(line 1051,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 1081,
      "end_line": 1171,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 52)",
        "(line 1099,col 9)-(line 1099,col 51)",
        "(line 1100,col 9)-(line 1100,col 46)",
        "(line 1101,col 9)-(line 1101,col 52)",
        "(line 1102,col 9)-(line 1102,col 51)",
        "(line 1103,col 9)-(line 1103,col 46)",
        "(line 1106,col 9)-(line 1106,col 42)",
        "(line 1107,col 9)-(line 1107,col 118)",
        "(line 1110,col 9)-(line 1110,col 52)",
        "(line 1111,col 9)-(line 1111,col 51)",
        "(line 1112,col 9)-(line 1112,col 46)",
        "(line 1113,col 9)-(line 1113,col 52)",
        "(line 1114,col 9)-(line 1114,col 51)",
        "(line 1115,col 9)-(line 1115,col 46)",
        "(line 1118,col 9)-(line 1118,col 42)",
        "(line 1119,col 9)-(line 1119,col 118)",
        "(line 1122,col 9)-(line 1122,col 52)",
        "(line 1123,col 9)-(line 1123,col 51)",
        "(line 1124,col 9)-(line 1124,col 46)",
        "(line 1125,col 9)-(line 1125,col 52)",
        "(line 1126,col 9)-(line 1126,col 51)",
        "(line 1127,col 9)-(line 1127,col 46)",
        "(line 1130,col 9)-(line 1130,col 42)",
        "(line 1131,col 9)-(line 1131,col 118)",
        "(line 1134,col 9)-(line 1134,col 52)",
        "(line 1135,col 9)-(line 1135,col 51)",
        "(line 1136,col 9)-(line 1136,col 46)",
        "(line 1137,col 9)-(line 1137,col 52)",
        "(line 1138,col 9)-(line 1138,col 51)",
        "(line 1139,col 9)-(line 1139,col 46)",
        "(line 1142,col 9)-(line 1142,col 42)",
        "(line 1143,col 9)-(line 1143,col 118)",
        "(line 1146,col 9)-(line 1146,col 56)",
        "(line 1147,col 9)-(line 1147,col 54)",
        "(line 1148,col 9)-(line 1148,col 94)",
        "(line 1151,col 9)-(line 1151,col 54)",
        "(line 1152,col 9)-(line 1152,col 55)",
        "(line 1153,col 9)-(line 1153,col 95)",
        "(line 1156,col 9)-(line 1156,col 55)",
        "(line 1157,col 9)-(line 1157,col 56)",
        "(line 1158,col 9)-(line 1158,col 99)",
        "(line 1162,col 9)-(line 1162,col 110)",
        "(line 1164,col 9)-(line 1168,col 9)",
        "(line 1170,col 9)-(line 1170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 1183,
      "end_line": 1196,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 1209,
      "end_line": 1222,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1212,col 9)",
        "(line 1213,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1221,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 1234,
      "end_line": 1247,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 1235,col 9)-(line 1237,col 9)",
        "(line 1238,col 9)-(line 1240,col 9)",
        "(line 1241,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1260,
      "end_line": 1273,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1264,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1272,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1297,
      "end_line": 1327,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1299,col 10)-(line 1301,col 10)",
        "(line 1302,col 10)-(line 1304,col 10)",
        "(line 1305,col 10)-(line 1305,col 25)",
        "(line 1306,col 10)-(line 1306,col 39)",
        "(line 1307,col 10)-(line 1307,col 40)",
        "(line 1308,col 10)-(line 1315,col 10)",
        "(line 1316,col 10)-(line 1318,col 10)",
        "(line 1319,col 10)-(line 1325,col 10)",
        "(line 1326,col 10)-(line 1326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 1339,
      "end_line": 1344,
      "comment": " Build an array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param length of the array\n      * @return a new array\n      * @since 3.2\n      ",
      "child_ranges": [
        "(line 1340,col 10)-(line 1341,col 78)",
        "(line 1342,col 10)-(line 1342,col 45)",
        "(line 1343,col 10)-(line 1343,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 1358,
      "end_line": 1374,
      "comment": " Build a double dimension  array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param rows number of rows in the array\n      * @param columns number of columns (may be negative to build partial\n      * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n      * @return a new array\n      * @since 3.2\n      ",
      "child_ranges": [
        "(line 1360,col 10)-(line 1360,col 27)",
        "(line 1361,col 10)-(line 1372,col 10)",
        "(line 1373,col 10)-(line 1373,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.convolve(double[], double[])",
      "begin_line": 1398,
      "end_line": 1427,
      "comment": "\n      * Calculates the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Convolution\"\u003e\n      * convolution\u003c/a\u003e between two sequences.\n      * The solution is obtained via straightforward computation of the\n      * convolution sum (and not via FFT).\n      * Whenever the computation needs an element that would be located\n      * at an index outside the input arrays, the value is assumed to be\n      * zero.\n      *\n      * @param x First sequence.\n      * Typically, this sequence will represent an input signal to a system.\n      * @param h Second sequence.\n      * Typically, this sequence will represent the impulse response of the\n      * system.\n      * @return the convolution of {@code x} and {@code h}.\n      * This array\u0027s length will be {@code x.length + h.length - 1}.\n      * @throws NullArgumentException if either {@code x} or {@code h} is\n      * {@code null}.\n      * @throws NoDataException if either {@code x} or {@code h} is empty.\n      *\n      * @since 3.3\n      ",
      "child_ranges": [
        "(line 1401,col 10)-(line 1401,col 35)",
        "(line 1402,col 10)-(line 1402,col 35)",
        "(line 1404,col 10)-(line 1404,col 35)",
        "(line 1405,col 10)-(line 1405,col 35)",
        "(line 1407,col 10)-(line 1409,col 10)",
        "(line 1412,col 10)-(line 1412,col 49)",
        "(line 1413,col 10)-(line 1413,col 52)",
        "(line 1416,col 10)-(line 1424,col 10)",
        "(line 1426,col 10)-(line 1426,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.shuffle(int[], int, org.apache.commons.math3.util.MathArrays.Position)",
      "begin_line": 1453,
      "end_line": 1457,
      "comment": "\n     * Shuffle the entries of the given array.\n     * The {@code start} and {@code pos} parameters select which portion\n     * of the array is randomized and which is left untouched.\n     *\n     * @see #shuffle(int[],int,Position,RandomGenerator)\n     *\n     * @param list Array whose entries will be shuffled (in-place).\n     * @param start Index at which shuffling begins.\n     * @param pos Shuffling is performed for index positions between\n     * {@code start} and either the end (if {@link Position#TAIL})\n     * or the beginning (if {@link Position#HEAD}) of the array.\n     ",
      "child_ranges": [
        "(line 1456,col 9)-(line 1456,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.shuffle(int[], int, org.apache.commons.math3.util.MathArrays.Position, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 1473,
      "end_line": 1511,
      "comment": "\n     * Shuffle the entries of the given array, using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Fisher–Yates_shuffle#The_modern_algorithm\"\u003e\n     * Fisher–Yates\u003c/a\u003e algorithm.\n     * The {@code start} and {@code pos} parameters select which portion\n     * of the array is randomized and which is left untouched.\n     *\n     * @param list Array whose entries will be shuffled (in-place).\n     * @param start Index at which shuffling begins.\n     * @param pos Shuffling is performed for index positions between\n     * {@code start} and either the end (if {@link Position#TAIL})\n     * or the beginning (if {@link Position#HEAD}) of the array.\n     * @param rng Random number generator.\n     ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.shuffle(int[], org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 1521,
      "end_line": 1524,
      "comment": "\n     * Shuffle the entries of the given array.\n     *\n     * @see #shuffle(int[],int,Position,RandomGenerator)\n     *\n     * @param list Array whose entries will be shuffled (in-place).\n     * @param rng Random number generator.\n     ",
      "child_ranges": [
        "(line 1523,col 9)-(line 1523,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.shuffle(int[])",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "\n     * Shuffle the entries of the given array.\n     *\n     * @see #shuffle(int[],int,Position,RandomGenerator)\n     *\n     * @param list Array whose entries will be shuffled (in-place).\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 40)"
      ]
    }
  ]
}