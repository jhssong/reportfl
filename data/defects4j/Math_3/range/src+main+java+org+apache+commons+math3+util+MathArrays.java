{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 1422,
      "comment": "\n * Arrays utilities.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_FACTOR"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Factor used for splitting double numbers: n \u003d 2^27 + 1 (i.e. {@value}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MathArrays.MathArrays()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 75,
      "comment": "\n     * Real-valued function that operate on an array or a part of it.\n     * @since 3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[])",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n         * Operates on an entire array.\n         *\n         * @param array Array to operate on.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Function.evaluate(double[], int, int)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n         * @param array Array to operate on.\n         * @param startIndex Index of the first element to take into account.\n         * @param numElements Number of elements to take into account.\n         * @return the result of the operation.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.scale(double, double[])",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Create a copy of an array scaled by a value.\n     *\n     * @param arr Array to scale.\n     * @param val Scalar.\n     * @return scaled copy of array with each entry multiplied by val.\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 49)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.scaleInPlace(double, double[])",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * \u003cp\u003eMultiply each element of an array by a value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe array is modified in place (no copy is created).\u003c/p\u003e\n     *\n     * @param arr Array to scale\n     * @param val Scalar\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeAdd(double[], double[])",
      "begin_line": 118,
      "end_line": 129,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * addition of the arguments.\n     *\n     * @param a First term of the addition.\n     * @param b Second term of the addition.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] + b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 42)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeSubtract(double[], double[])",
      "begin_line": 140,
      "end_line": 151,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * subtraction of the second argument from the first.\n     *\n     * @param a First term.\n     * @param b Element to be subtracted.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] - b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeMultiply(double[], double[])",
      "begin_line": 162,
      "end_line": 173,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * multiplication of the arguments.\n     *\n     * @param a First factor of the multiplication.\n     * @param b Second factor of the multiplication.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] * b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 42)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.ebeDivide(double[], double[])",
      "begin_line": 184,
      "end_line": 195,
      "comment": "\n     * Creates an array whose contents will be the element-by-element\n     * division of the first argument by the second.\n     *\n     * @param a Numerator of the division.\n     * @param b Denominator of the division.\n     * @return a new array {@code r} where {@code r[i] \u003d a[i] / b[i]}.\n     * @throws DimensionMismatchException if the array lengths differ.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 42)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(double[], double[])",
      "begin_line": 204,
      "end_line": 210,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 23)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance1(int[], int[])",
      "begin_line": 219,
      "end_line": 225,
      "comment": "\n     * Calculates the L\u003csub\u003e1\u003c/sub\u003e (sum of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e1\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 220,col 7)-(line 220,col 18)",
        "(line 221,col 7)-(line 223,col 7)",
        "(line 224,col 7)-(line 224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(double[], double[])",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distance(int[], int[])",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\n     * Calculates the L\u003csub\u003e2\u003c/sub\u003e (Euclidean) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e2\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 251,col 7)-(line 251,col 21)",
        "(line 252,col 7)-(line 255,col 7)",
        "(line 256,col 7)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(double[], double[])",
      "begin_line": 266,
      "end_line": 272,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 23)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.distanceInf(int[], int[])",
      "begin_line": 281,
      "end_line": 287,
      "comment": "\n     * Calculates the L\u003csub\u003e\u0026infin;\u003c/sub\u003e (max of abs) distance between two points.\n     *\n     * @param p1 the first point\n     * @param p2 the second point\n     * @return the L\u003csub\u003e\u0026infin;\u003c/sub\u003e distance between the two points\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 20)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(T[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 308,
      "end_line": 348,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param \u003cT\u003e the type of the elements in the specified array\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 28)",
        "(line 312,col 9)-(line 312,col 35)",
        "(line 313,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.isMonotonic(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 373,
      "end_line": 424,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 33)",
        "(line 377,col 9)-(line 377,col 35)",
        "(line 379,col 9)-(line 379,col 18)",
        "(line 380,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 416,col 9)",
        "(line 419,col 9)-(line 423,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 435,
      "end_line": 438,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[])",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkRectangular(long[][])",
      "begin_line": 459,
      "end_line": 469,
      "comment": "\n     * Throws DimensionMismatchException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullArgumentException if input array is null\n     * @throws DimensionMismatchException if input array is not rectangular\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 35)",
        "(line 462,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkPositive(double[])",
      "begin_line": 479,
      "end_line": 486,
      "comment": "\n     * Check that all entries of the input array are strictly positive.\n     *\n     * @param in Array to be tested\n     * @throws NotStrictlyPositiveException if any entries of the array are not\n     * strictly positive.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 485,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[])",
      "begin_line": 495,
      "end_line": 502,
      "comment": "\n     * Check that all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 501,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkNonNegative(long[][])",
      "begin_line": 511,
      "end_line": 520,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested\n     * @throws NotPositiveException if any array entries are less than 0.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.safeNorm(double[])",
      "begin_line": 582,
      "end_line": 635,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 34)",
        "(line 584,col 9)-(line 584,col 34)",
        "(line 585,col 9)-(line 585,col 22)",
        "(line 586,col 9)-(line 586,col 22)",
        "(line 587,col 9)-(line 587,col 22)",
        "(line 588,col 9)-(line 588,col 25)",
        "(line 589,col 9)-(line 589,col 25)",
        "(line 590,col 9)-(line 590,col 33)",
        "(line 591,col 9)-(line 591,col 40)",
        "(line 592,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 20)",
        "(line 621,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 653,
      "end_line": 656,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 675,
      "end_line": 745,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 684,col 9)",
        "(line 686,col 9)-(line 686,col 42)",
        "(line 687,col 9)-(line 687,col 33)",
        "(line 689,col 9)-(line 697,col 9)",
        "(line 700,col 9)-(line 701,col 56)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 707,col 9)-(line 719,col 10)",
        "(line 722,col 9)-(line 722,col 37)",
        "(line 727,col 9)-(line 727,col 43)",
        "(line 728,col 9)-(line 732,col 9)",
        "(line 736,col 9)-(line 744,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-b1c333f0-90a6-4eab-8973-630603694b98.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e)",
      "begin_line": 715,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 17)-(line 717,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-e6ec7244-2cb5-4fcd-b161-8150479d0dad.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, java.lang.Integer\u003e)",
      "begin_line": 710,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 712,col 17)-(line 712,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 754,col 10)-(line 754,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 763,
      "end_line": 765,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 764,col 10)-(line 764,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 776,
      "end_line": 780,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 777,col 10)-(line 777,col 43)",
        "(line 778,col 10)-(line 778,col 82)",
        "(line 779,col 10)-(line 779,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 791,
      "end_line": 795,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 792,col 10)-(line 792,col 49)",
        "(line 793,col 10)-(line 793,col 82)",
        "(line 794,col 10)-(line 794,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 814,
      "end_line": 872,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 33)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 823,col 9)-(line 823,col 50)",
        "(line 824,col 9)-(line 824,col 30)",
        "(line 826,col 9)-(line 842,col 9)",
        "(line 845,col 9)-(line 845,col 47)",
        "(line 846,col 9)-(line 846,col 42)",
        "(line 847,col 9)-(line 847,col 54)",
        "(line 848,col 9)-(line 848,col 49)",
        "(line 849,col 9)-(line 849,col 88)",
        "(line 851,col 9)-(line 851,col 40)",
        "(line 852,col 9)-(line 858,col 9)",
        "(line 860,col 9)-(line 860,col 59)",
        "(line 862,col 9)-(line 869,col 9)",
        "(line 871,col 9)-(line 871,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 895,
      "end_line": 949,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 52)",
        "(line 911,col 9)-(line 911,col 51)",
        "(line 912,col 9)-(line 912,col 46)",
        "(line 913,col 9)-(line 913,col 52)",
        "(line 914,col 9)-(line 914,col 51)",
        "(line 915,col 9)-(line 915,col 46)",
        "(line 918,col 9)-(line 918,col 42)",
        "(line 919,col 9)-(line 919,col 118)",
        "(line 922,col 9)-(line 922,col 52)",
        "(line 923,col 9)-(line 923,col 51)",
        "(line 924,col 9)-(line 924,col 46)",
        "(line 925,col 9)-(line 925,col 52)",
        "(line 926,col 9)-(line 926,col 51)",
        "(line 927,col 9)-(line 927,col 46)",
        "(line 930,col 9)-(line 930,col 42)",
        "(line 931,col 9)-(line 931,col 118)",
        "(line 934,col 9)-(line 934,col 56)",
        "(line 935,col 9)-(line 935,col 54)",
        "(line 936,col 9)-(line 936,col 94)",
        "(line 940,col 9)-(line 940,col 65)",
        "(line 942,col 9)-(line 946,col 9)",
        "(line 948,col 9)-(line 948,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 974,
      "end_line": 1046,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 52)",
        "(line 991,col 9)-(line 991,col 51)",
        "(line 992,col 9)-(line 992,col 46)",
        "(line 993,col 9)-(line 993,col 52)",
        "(line 994,col 9)-(line 994,col 51)",
        "(line 995,col 9)-(line 995,col 46)",
        "(line 998,col 9)-(line 998,col 42)",
        "(line 999,col 9)-(line 999,col 118)",
        "(line 1002,col 9)-(line 1002,col 52)",
        "(line 1003,col 9)-(line 1003,col 51)",
        "(line 1004,col 9)-(line 1004,col 46)",
        "(line 1005,col 9)-(line 1005,col 52)",
        "(line 1006,col 9)-(line 1006,col 51)",
        "(line 1007,col 9)-(line 1007,col 46)",
        "(line 1010,col 9)-(line 1010,col 42)",
        "(line 1011,col 9)-(line 1011,col 118)",
        "(line 1014,col 9)-(line 1014,col 52)",
        "(line 1015,col 9)-(line 1015,col 51)",
        "(line 1016,col 9)-(line 1016,col 46)",
        "(line 1017,col 9)-(line 1017,col 52)",
        "(line 1018,col 9)-(line 1018,col 51)",
        "(line 1019,col 9)-(line 1019,col 46)",
        "(line 1022,col 9)-(line 1022,col 42)",
        "(line 1023,col 9)-(line 1023,col 118)",
        "(line 1026,col 9)-(line 1026,col 56)",
        "(line 1027,col 9)-(line 1027,col 54)",
        "(line 1028,col 9)-(line 1028,col 94)",
        "(line 1031,col 9)-(line 1031,col 54)",
        "(line 1032,col 9)-(line 1032,col 55)",
        "(line 1033,col 9)-(line 1033,col 95)",
        "(line 1037,col 9)-(line 1037,col 87)",
        "(line 1039,col 9)-(line 1043,col 9)",
        "(line 1045,col 9)-(line 1045,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 1075,
      "end_line": 1165,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 52)",
        "(line 1093,col 9)-(line 1093,col 51)",
        "(line 1094,col 9)-(line 1094,col 46)",
        "(line 1095,col 9)-(line 1095,col 52)",
        "(line 1096,col 9)-(line 1096,col 51)",
        "(line 1097,col 9)-(line 1097,col 46)",
        "(line 1100,col 9)-(line 1100,col 42)",
        "(line 1101,col 9)-(line 1101,col 118)",
        "(line 1104,col 9)-(line 1104,col 52)",
        "(line 1105,col 9)-(line 1105,col 51)",
        "(line 1106,col 9)-(line 1106,col 46)",
        "(line 1107,col 9)-(line 1107,col 52)",
        "(line 1108,col 9)-(line 1108,col 51)",
        "(line 1109,col 9)-(line 1109,col 46)",
        "(line 1112,col 9)-(line 1112,col 42)",
        "(line 1113,col 9)-(line 1113,col 118)",
        "(line 1116,col 9)-(line 1116,col 52)",
        "(line 1117,col 9)-(line 1117,col 51)",
        "(line 1118,col 9)-(line 1118,col 46)",
        "(line 1119,col 9)-(line 1119,col 52)",
        "(line 1120,col 9)-(line 1120,col 51)",
        "(line 1121,col 9)-(line 1121,col 46)",
        "(line 1124,col 9)-(line 1124,col 42)",
        "(line 1125,col 9)-(line 1125,col 118)",
        "(line 1128,col 9)-(line 1128,col 52)",
        "(line 1129,col 9)-(line 1129,col 51)",
        "(line 1130,col 9)-(line 1130,col 46)",
        "(line 1131,col 9)-(line 1131,col 52)",
        "(line 1132,col 9)-(line 1132,col 51)",
        "(line 1133,col 9)-(line 1133,col 46)",
        "(line 1136,col 9)-(line 1136,col 42)",
        "(line 1137,col 9)-(line 1137,col 118)",
        "(line 1140,col 9)-(line 1140,col 56)",
        "(line 1141,col 9)-(line 1141,col 54)",
        "(line 1142,col 9)-(line 1142,col 94)",
        "(line 1145,col 9)-(line 1145,col 54)",
        "(line 1146,col 9)-(line 1146,col 55)",
        "(line 1147,col 9)-(line 1147,col 95)",
        "(line 1150,col 9)-(line 1150,col 55)",
        "(line 1151,col 9)-(line 1151,col 56)",
        "(line 1152,col 9)-(line 1152,col 99)",
        "(line 1156,col 9)-(line 1156,col 110)",
        "(line 1158,col 9)-(line 1162,col 9)",
        "(line 1164,col 9)-(line 1164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 1177,
      "end_line": 1190,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1183,col 9)",
        "(line 1184,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 1203,
      "end_line": 1216,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1210,col 9)-(line 1214,col 9)",
        "(line 1215,col 9)-(line 1215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 1228,
      "end_line": 1241,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1240,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1254,
      "end_line": 1267,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1257,col 9)",
        "(line 1258,col 9)-(line 1260,col 9)",
        "(line 1261,col 9)-(line 1265,col 9)",
        "(line 1266,col 9)-(line 1266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1291,
      "end_line": 1321,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1293,col 10)-(line 1295,col 10)",
        "(line 1296,col 10)-(line 1298,col 10)",
        "(line 1299,col 10)-(line 1299,col 25)",
        "(line 1300,col 10)-(line 1300,col 39)",
        "(line 1301,col 10)-(line 1301,col 40)",
        "(line 1302,col 10)-(line 1309,col 10)",
        "(line 1310,col 10)-(line 1312,col 10)",
        "(line 1313,col 10)-(line 1319,col 10)",
        "(line 1320,col 10)-(line 1320,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 1333,
      "end_line": 1338,
      "comment": " Build an array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param length of the array\n      * @return a new array\n      * @since 3.2\n      ",
      "child_ranges": [
        "(line 1334,col 10)-(line 1335,col 78)",
        "(line 1336,col 10)-(line 1336,col 45)",
        "(line 1337,col 10)-(line 1337,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 1352,
      "end_line": 1368,
      "comment": " Build a double dimension  array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param rows number of rows in the array\n      * @param columns number of columns (may be negative to build partial\n      * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n      * @return a new array\n      * @since 3.2\n      ",
      "child_ranges": [
        "(line 1354,col 10)-(line 1354,col 27)",
        "(line 1355,col 10)-(line 1366,col 10)",
        "(line 1367,col 10)-(line 1367,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.convolve(double[], double[])",
      "begin_line": 1392,
      "end_line": 1421,
      "comment": "\n      * Calculates the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Convolution\"\u003e\n      * convolution\u003c/a\u003e between two sequences.\n      * The solution is obtained via straightforward computation of the\n      * convolution sum (and not via FFT).\n      * Whenever the computation needs an element that would be located\n      * at an index outside the input arrays, the value is assumed to be\n      * zero.\n      *\n      * @param x First sequence.\n      * Typically, this sequence will represent an input signal to a system.\n      * @param h Second sequence.\n      * Typically, this sequence will represent the impulse response of the\n      * system.\n      * @return the convolution of {@code x} and {@code h}.\n      * This array\u0027s length will be {@code x.length + h.length - 1}.\n      * @throws NullArgumentException if either {@code x} or {@code h} is\n      * {@code null}.\n      * @throws NoDataException if either {@code x} or {@code h} is empty.\n      *\n      * @since 3.3\n      ",
      "child_ranges": [
        "(line 1395,col 10)-(line 1395,col 35)",
        "(line 1396,col 10)-(line 1396,col 35)",
        "(line 1398,col 10)-(line 1398,col 35)",
        "(line 1399,col 10)-(line 1399,col 35)",
        "(line 1401,col 10)-(line 1403,col 10)",
        "(line 1406,col 10)-(line 1406,col 49)",
        "(line 1407,col 10)-(line 1407,col 52)",
        "(line 1410,col 10)-(line 1418,col 10)",
        "(line 1420,col 10)-(line 1420,col 18)"
      ]
    }
  ]
}