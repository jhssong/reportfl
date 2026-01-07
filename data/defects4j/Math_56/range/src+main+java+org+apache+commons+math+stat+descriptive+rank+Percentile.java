{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/stat/descriptive/rank/Percentile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Percentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 82,
      "end_line": 495,
      "comment": "\n * Provides percentile computation.\n * \u003cp\u003e\n * There are several commonly used methods for estimating percentiles (a.k.a.\n * quantiles) based on sample data.  For large samples, the different methods\n * agree closely, but when sample sizes are small, different methods will give\n * significantly different results.  The algorithm implemented here works as follows:\n * \u003col\u003e\n * \u003cli\u003eLet \u003ccode\u003en\u003c/code\u003e be the length of the (sorted) array and\n * \u003ccode\u003e0 \u003c p \u003c\u003d 100\u003c/code\u003e be the desired percentile.\u003c/li\u003e\n * \u003cli\u003eIf \u003ccode\u003e n \u003d 1 \u003c/code\u003e return the unique array element (regardless of\n * the value of \u003ccode\u003ep\u003c/code\u003e); otherwise \u003c/li\u003e\n * \u003cli\u003eCompute the estimated percentile position\n * \u003ccode\u003e pos \u003d p * (n + 1) / 100\u003c/code\u003e and the difference, \u003ccode\u003ed\u003c/code\u003e\n * between \u003ccode\u003epos\u003c/code\u003e and \u003ccode\u003efloor(pos)\u003c/code\u003e (i.e. the fractional\n * part of \u003ccode\u003epos\u003c/code\u003e).  If \u003ccode\u003epos \u003e\u003d n\u003c/code\u003e return the largest\n * element in the array; otherwise\u003c/li\u003e\n * \u003cli\u003eLet \u003ccode\u003elower\u003c/code\u003e be the element in position\n * \u003ccode\u003efloor(pos)\u003c/code\u003e in the array and let \u003ccode\u003eupper\u003c/code\u003e be the\n * next element in the array.  Return \u003ccode\u003elower + d * (upper - lower)\u003c/code\u003e\n * \u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n * To compute percentiles, the data must be at least partially ordered.  Input\n * arrays are copied and recursively partitioned using an ordering definition.\n * The ordering used by \u003ccode\u003eArrays.sort(double[])\u003c/code\u003e is the one determined\n * by {@link java.lang.Double#compareTo(Double)}.  This ordering makes\n * \u003ccode\u003eDouble.NaN\u003c/code\u003e larger than any other value (including\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e).  Therefore, for example, the median\n * (50th percentile) of\n * \u003ccode\u003e{0, 1, 2, 3, 4, Double.NaN}\u003c/code\u003e evaluates to \u003ccode\u003e2.5.\u003c/code\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Since percentile estimation usually involves interpolation between array\n * elements, arrays containing  \u003ccode\u003eNaN\u003c/code\u003e or infinite values will often\n * result in \u003ccode\u003eNaN\u003ccode\u003e or infinite values returned.\u003c/p\u003e\n * \u003cp\u003e\n * Since 2.2, Percentile implementation uses only selection instead of complete\n * sorting and caches selection algorithm state between calls to the various\n * {@code evaluate} methods when several percentiles are to be computed on the same data.\n * This greatly improves efficiency, both for single percentile and multiple\n * percentiles computations. However, it also induces a need to be sure the data\n * at one call to {@code evaluate} is the same as the data with the cached algorithm\n * state from the previous calls. Percentile does this by checking the array reference\n * itself and a checksum of its content by default. If the user already knows he calls\n * {@code evaluate} on an immutable array, he can save the checking time by calling the\n * {@code evaluate} methods that do \u003cem\u003enot\u003c/em\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_SELECT_SIZE"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Minimum size under which we use a simple insertion sort rather than Hoare\u0027s select. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CACHED_LEVELS"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Maximum number of partitioning pivots cached (each level double the number of pivots). "
    },
    {
      "type": "field",
      "varNames": [
        "quantile"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Determines what percentile is computed when evaluate() is activated\n     * with no quantile argument "
    },
    {
      "type": "field",
      "varNames": [
        "cachedPivots"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Cached pivots. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.Percentile()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructs a Percentile with a default quantile\n     * value of 50.0.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.Percentile(double)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Constructs a Percentile with the specific quantile value.\n     * @param p the quantile\n     * @throws IllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 23)",
        "(line 116,col 9)-(line 116,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.Percentile(org.apache.commons.math.stat.descriptive.rank.Percentile)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Copy constructor, creates a new {@code Percentile} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Percentile} instance to copy\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.setData(double[])",
      "begin_line": 130,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.setData(double[], int, int)",
      "begin_line": 142,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.evaluate(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Returns the result of evaluating the statistic over the stored data.\n     * \u003cp\u003e\n     * The stored array is the one which was set by previous calls to\n     * \u003c/p\u003e\n     * @param p the percentile value to compute\n     * @return the value of the statistic applied to the stored data\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.evaluate(double[], double)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100) \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     *     or p is invalid\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 27)",
        "(line 193,col 9)-(line 193,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.evaluate(double[], int, int)",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003equantile\u003c/code\u003eth percentile of the\n     * designated values in the \u003ccode\u003evalues\u003c/code\u003e array.  The quantile\n     * estimated is determined by the \u003ccode\u003equantile\u003c/code\u003e property.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003equantile\u003c/code\u003e)\n     * \u003ccode\u003evalues[begin]\u003c/code\u003e if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null,  or \u003ccode\u003estart\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e\n     * is invalid\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param start index of the first array element to include\n     * @param length the number of elements to include\n     * @return the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid\n     *\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.evaluate(double[], int, int, double)",
      "begin_line": 255,
      "end_line": 295,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 36)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 26)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 32)",
        "(line 273,col 9)-(line 273,col 32)",
        "(line 274,col 9)-(line 274,col 22)",
        "(line 275,col 9)-(line 275,col 25)",
        "(line 276,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 60)",
        "(line 293,col 9)-(line 293,col 56)",
        "(line 294,col 9)-(line 294,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.select(double[], int[], int)",
      "begin_line": 308,
      "end_line": 349,
      "comment": "\n     * Select the k\u003csup\u003eth\u003c/sup\u003e smallest element from work array\n     * @param work work array (will be reorganized during the call)\n     * @param pivotsHeap set of pivot index corresponding to elements that\n     * are already at their sorted location, stored as an implicit heap\n     * (i.e. a sorted binary tree stored in a flat array, where the\n     * children of a node at index n are at indices 2n+1 for the left\n     * child and 2n+2 for the right child, with 0-based indices)\n     * @param k index of the desired element\n     * @return k\u003csup\u003eth\u003c/sup\u003e smallest element\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 22)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 312,col 22)",
        "(line 314,col 9)-(line 342,col 9)",
        "(line 346,col 9)-(line 346,col 40)",
        "(line 347,col 9)-(line 347,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.medianOf3(double[], int, int)",
      "begin_line": 358,
      "end_line": 380,
      "comment": " Select a pivot index as the median of three\n     * @param work data array\n     * @param begin index of the first element of the slice\n     * @param end index after the last element of the slice\n     * @return the index of the median element chosen between the\n     * first, the middle and the last element of the array slice\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 41)",
        "(line 361,col 9)-(line 361,col 68)",
        "(line 362,col 9)-(line 362,col 45)",
        "(line 363,col 9)-(line 363,col 46)",
        "(line 364,col 9)-(line 364,col 52)",
        "(line 366,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.partition(double[], int, int, int)",
      "begin_line": 395,
      "end_line": 424,
      "comment": "\n     * Partition an array slice around a pivot\n     * \u003cp\u003e\n     * Partitioning exchanges array elements such that all elements\n     * smaller than pivot are before it and all elements larger than\n     * pivot are after it\n     * \u003c/p\u003e\n     * @param work data array\n     * @param begin index of the first element of the slice\n     * @param end index after the last element of the slice\n     * @param pivot initial index of the pivot\n     * @return index of the pivot after partition\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 41)",
        "(line 398,col 9)-(line 398,col 34)",
        "(line 400,col 9)-(line 400,col 26)",
        "(line 401,col 9)-(line 401,col 24)",
        "(line 402,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 30)",
        "(line 421,col 9)-(line 421,col 28)",
        "(line 422,col 9)-(line 422,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.insertionSort(double[], int, int)",
      "begin_line": 432,
      "end_line": 442,
      "comment": "\n     * Sort in place a (small) array slice using insertion sort\n     * @param work array to sort\n     * @param begin index of the first element of the slice to sort\n     * @param end index after the last element of the slice to sort\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.getQuantile()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Returns the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @return quantile\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.setQuantile(double)",
      "begin_line": 462,
      "end_line": 467,
      "comment": "\n     * Sets the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @param p a value between 0 \u003c p \u003c\u003d 100\n     * @throws IllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.copy()",
      "begin_line": 472,
      "end_line": 477,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 45)",
        "(line 475,col 9)-(line 475,col 27)",
        "(line 476,col 9)-(line 476,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.copy(org.apache.commons.math.stat.descriptive.rank.Percentile, org.apache.commons.math.stat.descriptive.rank.Percentile)",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Percentile to copy\n     * @param dest Percentile to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 42)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 40)"
      ]
    }
  ]
}