{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/util/MathArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 1090,
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
      "end_line": 213,
      "comment": "\n     * Check that an array is monotonically increasing or decreasing.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @return {@code true} if sorted, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean, boolean)",
      "begin_line": 226,
      "end_line": 277,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @param abort Whether to throw an exception if the check fails.\n     * @return {@code true} if the array is sorted.\n     * @throws NonMonotonicSequenceException if the array is not sorted\n     * and {@code abort} is {@code true}.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 33)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 232,col 9)-(line 232,col 18)",
        "(line 233,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 269,col 9)",
        "(line 272,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, boolean)",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * Check that the given array is sorted.\n     *\n     * @param val Values.\n     * @param dir Ordering direction.\n     * @param strict Whether the order should be strict.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.checkOrder(double[])",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Check that the given array is sorted in strictly increasing order.\n     *\n     * @param val Values.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.safeNorm(double[])",
      "begin_line": 364,
      "end_line": 417,
      "comment": "\n     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.\n     * Translation of the minpack enorm subroutine.\n     *\n     * The redistribution policy for MINPACK is available\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n     * convenience, it is reproduced below.\u003c/p\u003e\n     *\n     * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     *    Minpack Copyright Notice (1999) University of Chicago.\n     *    All rights reserved\n     * \u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003ctd\u003e\n     * Redistribution and use in source and binary forms, with or without\n     * modification, are permitted provided that the following conditions\n     * are met:\n     * \u003col\u003e\n     *  \u003cli\u003eRedistributions of source code must retain the above copyright\n     *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n     * \u003cli\u003eRedistributions in binary form must reproduce the above\n     *     copyright notice, this list of conditions and the following\n     *     disclaimer in the documentation and/or other materials provided\n     *     with the distribution.\u003c/li\u003e\n     * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n     *     must include the following acknowledgment:\n     *     {@code This product includes software developed by the University of\n     *           Chicago, as Operator of Argonne National Laboratory.}\n     *     Alternately, this acknowledgment may appear in the software itself,\n     *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n     *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n     * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/table\u003e\n     *\n     * @param v Vector of doubles.\n     * @return the 2-norm of the vector.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 34)",
        "(line 366,col 9)-(line 366,col 34)",
        "(line 367,col 9)-(line 367,col 22)",
        "(line 368,col 9)-(line 368,col 22)",
        "(line 369,col 9)-(line 369,col 22)",
        "(line 370,col 9)-(line 370,col 25)",
        "(line 371,col 9)-(line 371,col 25)",
        "(line 372,col 9)-(line 372,col 33)",
        "(line 373,col 9)-(line 373,col 40)",
        "(line 374,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 20)",
        "(line 403,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], double[]...)",
      "begin_line": 435,
      "end_line": 438,
      "comment": "\n     * Sort an array in ascending order in place and perform the same reordering\n     * of entries on other arrays. For example, if\n     * {@code x \u003d [3, 1, 2], y \u003d [1, 2, 3]} and {@code z \u003d [0, 5, 7]}, then\n     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},\n     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.sortInPlace(double[], org.apache.commons.math3.util.MathArrays.OrderDirection, double[]...)",
      "begin_line": 457,
      "end_line": 515,
      "comment": "\n     * Sort an array in place and perform the same reordering of entries on\n     * other arrays.  This method works the same as the other\n     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but\n     * allows the order of the sort to be provided in the {@code dir}\n     * parameter.\n     *\n     * @param x Array to be sorted and used as a pattern for permutation\n     * of the other arrays.\n     * @param dir Order direction.\n     * @param yList Set of arrays whose permutations of entries will follow\n     * those performed on {@code x}.\n     * @throws DimensionMismatchException if any {@code y} is not the same\n     * size as {@code x}.\n     * @throws NullArgumentException if {@code x} or any {@code y} is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 465,col 33)",
        "(line 466,col 9)-(line 467,col 57)",
        "(line 469,col 9)-(line 469,col 42)",
        "(line 470,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 503,col 10)",
        "(line 505,col 9)-(line 505,col 37)",
        "(line 507,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.Anonymous-db2074b3-18a1-44ae-9bca-4d342b4f397f.compare(org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e, org.apache.commons.math3.util.Pair\u003cjava.lang.Double, double[]\u003e)",
      "begin_line": 487,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 489,col 17)-(line 489,col 24)",
        "(line 490,col 17)-(line 500,col 17)",
        "(line 501,col 17)-(line 501,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[])",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 524,col 10)-(line 524,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[])",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 534,col 10)-(line 534,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(int[], int)",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 547,col 10)-(line 547,col 43)",
        "(line 548,col 10)-(line 548,col 82)",
        "(line 549,col 10)-(line 549,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.copyOf(double[], int)",
      "begin_line": 561,
      "end_line": 565,
      "comment": "\n     * Creates a copy of the {@code source} array.\n     *\n     * @param source Array to be copied.\n     * @param len Number of entries to copy. If smaller then the source\n     * length, the copy will be truncated, if larger it will padded with\n     * zeroes.\n     * @return the copied array.\n     ",
      "child_ranges": [
        "(line 562,col 10)-(line 562,col 49)",
        "(line 563,col 10)-(line 563,col 82)",
        "(line 564,col 10)-(line 564,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double[], double[])",
      "begin_line": 584,
      "end_line": 640,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     *\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 33)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 591,col 50)",
        "(line 592,col 9)-(line 592,col 30)",
        "(line 594,col 9)-(line 610,col 9)",
        "(line 613,col 9)-(line 613,col 47)",
        "(line 614,col 9)-(line 614,col 42)",
        "(line 615,col 9)-(line 615,col 54)",
        "(line 616,col 9)-(line 616,col 49)",
        "(line 617,col 9)-(line 617,col 88)",
        "(line 619,col 9)-(line 619,col 40)",
        "(line 620,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 628,col 59)",
        "(line 630,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double)",
      "begin_line": 663,
      "end_line": 717,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e to high accuracy. It does\n     * so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects. It is based\n     * on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 52)",
        "(line 679,col 9)-(line 679,col 51)",
        "(line 680,col 9)-(line 680,col 46)",
        "(line 681,col 9)-(line 681,col 52)",
        "(line 682,col 9)-(line 682,col 51)",
        "(line 683,col 9)-(line 683,col 46)",
        "(line 686,col 9)-(line 686,col 42)",
        "(line 687,col 9)-(line 687,col 118)",
        "(line 690,col 9)-(line 690,col 52)",
        "(line 691,col 9)-(line 691,col 51)",
        "(line 692,col 9)-(line 692,col 46)",
        "(line 693,col 9)-(line 693,col 52)",
        "(line 694,col 9)-(line 694,col 51)",
        "(line 695,col 9)-(line 695,col 46)",
        "(line 698,col 9)-(line 698,col 42)",
        "(line 699,col 9)-(line 699,col 118)",
        "(line 702,col 9)-(line 702,col 56)",
        "(line 703,col 9)-(line 703,col 54)",
        "(line 704,col 9)-(line 704,col 94)",
        "(line 708,col 9)-(line 708,col 65)",
        "(line 710,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 716,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double)",
      "begin_line": 742,
      "end_line": 814,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 52)",
        "(line 759,col 9)-(line 759,col 51)",
        "(line 760,col 9)-(line 760,col 46)",
        "(line 761,col 9)-(line 761,col 52)",
        "(line 762,col 9)-(line 762,col 51)",
        "(line 763,col 9)-(line 763,col 46)",
        "(line 766,col 9)-(line 766,col 42)",
        "(line 767,col 9)-(line 767,col 118)",
        "(line 770,col 9)-(line 770,col 52)",
        "(line 771,col 9)-(line 771,col 51)",
        "(line 772,col 9)-(line 772,col 46)",
        "(line 773,col 9)-(line 773,col 52)",
        "(line 774,col 9)-(line 774,col 51)",
        "(line 775,col 9)-(line 775,col 46)",
        "(line 778,col 9)-(line 778,col 42)",
        "(line 779,col 9)-(line 779,col 118)",
        "(line 782,col 9)-(line 782,col 52)",
        "(line 783,col 9)-(line 783,col 51)",
        "(line 784,col 9)-(line 784,col 46)",
        "(line 785,col 9)-(line 785,col 52)",
        "(line 786,col 9)-(line 786,col 51)",
        "(line 787,col 9)-(line 787,col 46)",
        "(line 790,col 9)-(line 790,col 42)",
        "(line 791,col 9)-(line 791,col 118)",
        "(line 794,col 9)-(line 794,col 56)",
        "(line 795,col 9)-(line 795,col 54)",
        "(line 796,col 9)-(line 796,col 94)",
        "(line 799,col 9)-(line 799,col 54)",
        "(line 800,col 9)-(line 800,col 55)",
        "(line 801,col 9)-(line 801,col 95)",
        "(line 805,col 9)-(line 805,col 87)",
        "(line 807,col 9)-(line 811,col 9)",
        "(line 813,col 9)-(line 813,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.linearCombination(double, double, double, double, double, double, double, double)",
      "begin_line": 843,
      "end_line": 933,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, double, double, double)\n     * @see #linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 52)",
        "(line 861,col 9)-(line 861,col 51)",
        "(line 862,col 9)-(line 862,col 46)",
        "(line 863,col 9)-(line 863,col 52)",
        "(line 864,col 9)-(line 864,col 51)",
        "(line 865,col 9)-(line 865,col 46)",
        "(line 868,col 9)-(line 868,col 42)",
        "(line 869,col 9)-(line 869,col 118)",
        "(line 872,col 9)-(line 872,col 52)",
        "(line 873,col 9)-(line 873,col 51)",
        "(line 874,col 9)-(line 874,col 46)",
        "(line 875,col 9)-(line 875,col 52)",
        "(line 876,col 9)-(line 876,col 51)",
        "(line 877,col 9)-(line 877,col 46)",
        "(line 880,col 9)-(line 880,col 42)",
        "(line 881,col 9)-(line 881,col 118)",
        "(line 884,col 9)-(line 884,col 52)",
        "(line 885,col 9)-(line 885,col 51)",
        "(line 886,col 9)-(line 886,col 46)",
        "(line 887,col 9)-(line 887,col 52)",
        "(line 888,col 9)-(line 888,col 51)",
        "(line 889,col 9)-(line 889,col 46)",
        "(line 892,col 9)-(line 892,col 42)",
        "(line 893,col 9)-(line 893,col 118)",
        "(line 896,col 9)-(line 896,col 52)",
        "(line 897,col 9)-(line 897,col 51)",
        "(line 898,col 9)-(line 898,col 46)",
        "(line 899,col 9)-(line 899,col 52)",
        "(line 900,col 9)-(line 900,col 51)",
        "(line 901,col 9)-(line 901,col 46)",
        "(line 904,col 9)-(line 904,col 42)",
        "(line 905,col 9)-(line 905,col 118)",
        "(line 908,col 9)-(line 908,col 56)",
        "(line 909,col 9)-(line 909,col 54)",
        "(line 910,col 9)-(line 910,col 94)",
        "(line 913,col 9)-(line 913,col 54)",
        "(line 914,col 9)-(line 914,col 55)",
        "(line 915,col 9)-(line 915,col 95)",
        "(line 918,col 9)-(line 918,col 55)",
        "(line 919,col 9)-(line 919,col 56)",
        "(line 920,col 9)-(line 920,col 99)",
        "(line 924,col 9)-(line 924,col 110)",
        "(line 926,col 9)-(line 930,col 9)",
        "(line 932,col 9)-(line 932,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(float[], float[])",
      "begin_line": 945,
      "end_line": 958,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equals(float,float)}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension\n     * and equal elements.\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 957,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[], float[])",
      "begin_line": 971,
      "end_line": 984,
      "comment": "\n     * Returns true iff both arguments are null or have same dimensions and all\n     * their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x first array\n     * @param y second array\n     * @return true if the values are both null or have same dimension and\n     * equal elements\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 983,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equals(double[], double[])",
      "begin_line": 996,
      "end_line": 1009,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equals(double,double)}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1008,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[], double[])",
      "begin_line": 1022,
      "end_line": 1035,
      "comment": "\n     * Returns {@code true} iff both arguments are {@code null} or have same\n     * dimensions and all their elements are equal as defined by\n     * {@link Precision#equalsIncludingNaN(double,double) this method}.\n     *\n     * @param x First array.\n     * @param y Second array.\n     * @return {@code true} if the values are both {@code null} or have same\n     * dimension and equal elements.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1026,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1034,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathArrays.normalizeArray(double[], double)",
      "begin_line": 1059,
      "end_line": 1089,
      "comment": "\n      * Normalizes an array to make it sum to a specified value.\n      * Returns the result of the transformation \u003cpre\u003e\n      *    x |-\u003e x * normalizedSum / sum\n      * \u003c/pre\u003e\n      * applied to each non-NaN element x of the input array, where sum is the\n      * sum of the non-NaN entries in the input array.\u003c/p\u003e\n      *\n      * \u003cp\u003eThrows IllegalArgumentException if {@code normalizedSum} is infinite\n      * or NaN and ArithmeticException if the input array contains any infinite elements\n      * or sums to 0.\u003c/p\u003e\n      *\n      * \u003cp\u003eIgnores (i.e., copies unchanged to the output array) NaNs in the input array.\u003c/p\u003e\n      *\n      * @param values Input array to be normalized\n      * @param normalizedSum Target sum for the normalized array\n      * @return the normalized array.\n      * @throws MathArithmeticException if the input array contains infinite\n      * elements or sums to zero.\n      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.\n      * @since 2.1\n      ",
      "child_ranges": [
        "(line 1061,col 10)-(line 1063,col 10)",
        "(line 1064,col 10)-(line 1066,col 10)",
        "(line 1067,col 10)-(line 1067,col 25)",
        "(line 1068,col 10)-(line 1068,col 39)",
        "(line 1069,col 10)-(line 1069,col 40)",
        "(line 1070,col 10)-(line 1077,col 10)",
        "(line 1078,col 10)-(line 1080,col 10)",
        "(line 1081,col 10)-(line 1087,col 10)",
        "(line 1088,col 10)-(line 1088,col 20)"
      ]
    }
  ]
}