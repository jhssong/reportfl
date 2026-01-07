{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 1403,
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
      "end_line": 733,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 681,col 9)",
        "(line 683,col 9)-(line 683,col 33)",
        "(line 684,col 9)-(line 685,col 57)",
        "(line 687,col 9)-(line 687,col 42)",
        "(line 688,col 9)-(line 701,col 9)",
        "(line 703,col 9)-(line 721,col 10)",
        "(line 723,col 9)-(line 723,col 37)",
        "(line 725,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-aa16e074-617d-485a-b572-f09ebc921cbf.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 705,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 707,col 17)-(line 707,col 24)",
        "(line 708,col 17)-(line 718,col 17)",
        "(line 719,col 17)-(line 719,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 741,
      "end_line": 743,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 742,col 10)-(line 742,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 752,col 10)-(line 752,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 764,
      "end_line": 768,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 765,col 10)-(line 765,col 43)",
        "(line 766,col 10)-(line 766,col 82)",
        "(line 767,col 10)-(line 767,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 779,
      "end_line": 783,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 780,col 10)-(line 780,col 49)",
        "(line 781,col 10)-(line 781,col 82)",
        "(line 782,col 10)-(line 782,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 802,
      "end_line": 858,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 33)",
        "(line 805,col 9)-(line 807,col 9)",
        "(line 809,col 9)-(line 809,col 50)",
        "(line 810,col 9)-(line 810,col 30)",
        "(line 812,col 9)-(line 828,col 9)",
        "(line 831,col 9)-(line 831,col 47)",
        "(line 832,col 9)-(line 832,col 42)",
        "(line 833,col 9)-(line 833,col 54)",
        "(line 834,col 9)-(line 834,col 49)",
        "(line 835,col 9)-(line 835,col 88)",
        "(line 837,col 9)-(line 837,col 40)",
        "(line 838,col 9)-(line 844,col 9)",
        "(line 846,col 9)-(line 846,col 59)",
        "(line 848,col 9)-(line 855,col 9)",
        "(line 857,col 9)-(line 857,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 881,
      "end_line": 935,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 52)",
        "(line 897,col 9)-(line 897,col 51)",
        "(line 898,col 9)-(line 898,col 46)",
        "(line 899,col 9)-(line 899,col 52)",
        "(line 900,col 9)-(line 900,col 51)",
        "(line 901,col 9)-(line 901,col 46)",
        "(line 904,col 9)-(line 904,col 42)",
        "(line 905,col 9)-(line 905,col 118)",
        "(line 908,col 9)-(line 908,col 52)",
        "(line 909,col 9)-(line 909,col 51)",
        "(line 910,col 9)-(line 910,col 46)",
        "(line 911,col 9)-(line 911,col 52)",
        "(line 912,col 9)-(line 912,col 51)",
        "(line 913,col 9)-(line 913,col 46)",
        "(line 916,col 9)-(line 916,col 42)",
        "(line 917,col 9)-(line 917,col 118)",
        "(line 920,col 9)-(line 920,col 56)",
        "(line 921,col 9)-(line 921,col 54)",
        "(line 922,col 9)-(line 922,col 94)",
        "(line 926,col 9)-(line 926,col 65)",
        "(line 928,col 9)-(line 932,col 9)",
        "(line 934,col 9)-(line 934,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 960,
      "end_line": 1032,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 52)",
        "(line 977,col 9)-(line 977,col 51)",
        "(line 978,col 9)-(line 978,col 46)",
        "(line 979,col 9)-(line 979,col 52)",
        "(line 980,col 9)-(line 980,col 51)",
        "(line 981,col 9)-(line 981,col 46)",
        "(line 984,col 9)-(line 984,col 42)",
        "(line 985,col 9)-(line 985,col 118)",
        "(line 988,col 9)-(line 988,col 52)",
        "(line 989,col 9)-(line 989,col 51)",
        "(line 990,col 9)-(line 990,col 46)",
        "(line 991,col 9)-(line 991,col 52)",
        "(line 992,col 9)-(line 992,col 51)",
        "(line 993,col 9)-(line 993,col 46)",
        "(line 996,col 9)-(line 996,col 42)",
        "(line 997,col 9)-(line 997,col 118)",
        "(line 1000,col 9)-(line 1000,col 52)",
        "(line 1001,col 9)-(line 1001,col 51)",
        "(line 1002,col 9)-(line 1002,col 46)",
        "(line 1003,col 9)-(line 1003,col 52)",
        "(line 1004,col 9)-(line 1004,col 51)",
        "(line 1005,col 9)-(line 1005,col 46)",
        "(line 1008,col 9)-(line 1008,col 42)",
        "(line 1009,col 9)-(line 1009,col 118)",
        "(line 1012,col 9)-(line 1012,col 56)",
        "(line 1013,col 9)-(line 1013,col 54)",
        "(line 1014,col 9)-(line 1014,col 94)",
        "(line 1017,col 9)-(line 1017,col 54)",
        "(line 1018,col 9)-(line 1018,col 55)",
        "(line 1019,col 9)-(line 1019,col 95)",
        "(line 1023,col 9)-(line 1023,col 87)",
        "(line 1025,col 9)-(line 1029,col 9)",
        "(line 1031,col 9)-(line 1031,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 1061,
      "end_line": 1151,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 52)",
        "(line 1079,col 9)-(line 1079,col 51)",
        "(line 1080,col 9)-(line 1080,col 46)",
        "(line 1081,col 9)-(line 1081,col 52)",
        "(line 1082,col 9)-(line 1082,col 51)",
        "(line 1083,col 9)-(line 1083,col 46)",
        "(line 1086,col 9)-(line 1086,col 42)",
        "(line 1087,col 9)-(line 1087,col 118)",
        "(line 1090,col 9)-(line 1090,col 52)",
        "(line 1091,col 9)-(line 1091,col 51)",
        "(line 1092,col 9)-(line 1092,col 46)",
        "(line 1093,col 9)-(line 1093,col 52)",
        "(line 1094,col 9)-(line 1094,col 51)",
        "(line 1095,col 9)-(line 1095,col 46)",
        "(line 1098,col 9)-(line 1098,col 42)",
        "(line 1099,col 9)-(line 1099,col 118)",
        "(line 1102,col 9)-(line 1102,col 52)",
        "(line 1103,col 9)-(line 1103,col 51)",
        "(line 1104,col 9)-(line 1104,col 46)",
        "(line 1105,col 9)-(line 1105,col 52)",
        "(line 1106,col 9)-(line 1106,col 51)",
        "(line 1107,col 9)-(line 1107,col 46)",
        "(line 1110,col 9)-(line 1110,col 42)",
        "(line 1111,col 9)-(line 1111,col 118)",
        "(line 1114,col 9)-(line 1114,col 52)",
        "(line 1115,col 9)-(line 1115,col 51)",
        "(line 1116,col 9)-(line 1116,col 46)",
        "(line 1117,col 9)-(line 1117,col 52)",
        "(line 1118,col 9)-(line 1118,col 51)",
        "(line 1119,col 9)-(line 1119,col 46)",
        "(line 1122,col 9)-(line 1122,col 42)",
        "(line 1123,col 9)-(line 1123,col 118)",
        "(line 1126,col 9)-(line 1126,col 56)",
        "(line 1127,col 9)-(line 1127,col 54)",
        "(line 1128,col 9)-(line 1128,col 94)",
        "(line 1131,col 9)-(line 1131,col 54)",
        "(line 1132,col 9)-(line 1132,col 55)",
        "(line 1133,col 9)-(line 1133,col 95)",
        "(line 1136,col 9)-(line 1136,col 55)",
        "(line 1137,col 9)-(line 1137,col 56)",
        "(line 1138,col 9)-(line 1138,col 99)",
        "(line 1142,col 9)-(line 1142,col 110)",
        "(line 1144,col 9)-(line 1148,col 9)",
        "(line 1150,col 9)-(line 1150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 1163,
      "end_line": 1176,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1169,col 9)",
        "(line 1170,col 9)-(line 1174,col 9)",
        "(line 1175,col 9)-(line 1175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 1189,
      "end_line": 1202,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1200,col 9)",
        "(line 1201,col 9)-(line 1201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 1214,
      "end_line": 1227,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 1215,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1225,col 9)",
        "(line 1226,col 9)-(line 1226,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1240,
      "end_line": 1253,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1241,col 9)-(line 1243,col 9)",
        "(line 1244,col 9)-(line 1246,col 9)",
        "(line 1247,col 9)-(line 1251,col 9)",
        "(line 1252,col 9)-(line 1252,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1277,
      "end_line": 1307,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1279,col 10)-(line 1281,col 10)",
        "(line 1282,col 10)-(line 1284,col 10)",
        "(line 1285,col 10)-(line 1285,col 25)",
        "(line 1286,col 10)-(line 1286,col 39)",
        "(line 1287,col 10)-(line 1287,col 40)",
        "(line 1288,col 10)-(line 1295,col 10)",
        "(line 1296,col 10)-(line 1298,col 10)",
        "(line 1299,col 10)-(line 1305,col 10)",
        "(line 1306,col 10)-(line 1306,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 1319,
      "end_line": 1324,
      "comment": " Build an array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param length of the array\n      * @return a new array\n      * @since 3.2\n      ",
      "child_ranges": [
        "(line 1320,col 10)-(line 1321,col 78)",
        "(line 1322,col 10)-(line 1322,col 45)",
        "(line 1323,col 10)-(line 1323,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 1338,
      "end_line": 1354,
      "comment": " Build a double dimension  array of elements.\n      * \u003cp\u003e\n      * Arrays are filled with field.getZero()\n      * \u003c/p\u003e\n      * @param \u003cT\u003e the type of the field elements\n      * @param field field to which array elements belong\n      * @param rows number of rows in the array\n      * @param columns number of columns (may be negative to build partial\n      * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n      * @return a new array\n      * @since 3.2\n      ",
      "child_ranges": [
        "(line 1340,col 10)-(line 1340,col 27)",
        "(line 1341,col 10)-(line 1352,col 10)",
        "(line 1353,col 10)-(line 1353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.convolve(double[], double[])",
      "begin_line": 1373,
      "end_line": 1401,
      "comment": "\n      * Calculates the convolution between two sequences.\n      * \u003cp\u003e\n      * The solution is obtained via straightforward computation of the convolution sum (and not via FFT; for longer sequences,\n      * the performance of this method might be inferior to an FFT-based implementation).\n      *\n      * @param x the first sequence (double array of length {@code N}); the sequence is assumed to be zero elsewhere\n      *   (i.e. {x[i]}\u003d0 for i\u003c0 and i\u003e\u003d{@code N}). Typically, this sequence will represent an input signal to a system.\n      * @param h the second sequence (double array of length {@code M}); the sequence is assumed to be zero elsewhere\n      *   (i.e. {h[i]}\u003d0 for i\u003c0 and i\u003e\u003d{@code M}). Typically, this sequence will represent the impulse response of the system.\n      * @return the convolution of {@code x} and {@code h} (double array of length {@code N} + {@code M} -1)\n      * @throws NullArgumentException if either {@code x} or {@code h} is null\n      * @throws NoDataException if either {@code x} or {@code h} is empty\n      *\n      * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Convolution\"\u003eConvolution (Wikipedia)\u003c/a\u003e\n      * @since 4.0\n      ",
      "child_ranges": [
        "(line 1374,col 10)-(line 1374,col 35)",
        "(line 1375,col 10)-(line 1375,col 35)",
        "(line 1377,col 10)-(line 1377,col 32)",
        "(line 1378,col 10)-(line 1378,col 32)",
        "(line 1380,col 10)-(line 1382,col 10)",
        "(line 1385,col 10)-(line 1385,col 43)",
        "(line 1386,col 10)-(line 1386,col 52)",
        "(line 1389,col 10)-(line 1398,col 10)",
        "(line 1400,col 10)-(line 1400,col 18)"
      ]
    }
  ]
}