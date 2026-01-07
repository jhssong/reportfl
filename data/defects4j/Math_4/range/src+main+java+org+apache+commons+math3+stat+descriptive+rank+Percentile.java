{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/rank/Percentile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Percentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 84,
      "end_line": 510,
      "comment": "\n * Provides percentile computation.\n * \u003cp\u003e\n * There are several commonly used methods for estimating percentiles (a.k.a.\n * quantiles) based on sample data.  For large samples, the different methods\n * agree closely, but when sample sizes are small, different methods will give\n * significantly different results.  The algorithm implemented here works as follows:\n * \u003col\u003e\n * \u003cli\u003eLet \u003ccode\u003en\u003c/code\u003e be the length of the (sorted) array and\n * \u003ccode\u003e0 \u003c p \u003c\u003d 100\u003c/code\u003e be the desired percentile.\u003c/li\u003e\n * \u003cli\u003eIf \u003ccode\u003e n \u003d 1 \u003c/code\u003e return the unique array element (regardless of\n * the value of \u003ccode\u003ep\u003c/code\u003e); otherwise \u003c/li\u003e\n * \u003cli\u003eCompute the estimated percentile position\n * \u003ccode\u003e pos \u003d p * (n + 1) / 100\u003c/code\u003e and the difference, \u003ccode\u003ed\u003c/code\u003e\n * between \u003ccode\u003epos\u003c/code\u003e and \u003ccode\u003efloor(pos)\u003c/code\u003e (i.e. the fractional\n * part of \u003ccode\u003epos\u003c/code\u003e).\u003c/li\u003e\n * \u003cli\u003e If \u003ccode\u003epos \u003c 1\u003c/code\u003e return the smallest element in the array.\u003c/li\u003e\n * \u003cli\u003e Else if \u003ccode\u003epos \u003e\u003d n\u003c/code\u003e return the largest element in the array.\u003c/li\u003e\n * \u003cli\u003e Else let \u003ccode\u003elower\u003c/code\u003e be the element in position\n * \u003ccode\u003efloor(pos)\u003c/code\u003e in the array and let \u003ccode\u003eupper\u003c/code\u003e be the\n * next element in the array.  Return \u003ccode\u003elower + d * (upper - lower)\u003c/code\u003e\n * \u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n * To compute percentiles, the data must be at least partially ordered.  Input\n * arrays are copied and recursively partitioned using an ordering definition.\n * The ordering used by \u003ccode\u003eArrays.sort(double[])\u003c/code\u003e is the one determined\n * by {@link java.lang.Double#compareTo(Double)}.  This ordering makes\n * \u003ccode\u003eDouble.NaN\u003c/code\u003e larger than any other value (including\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e).  Therefore, for example, the median\n * (50th percentile) of\n * \u003ccode\u003e{0, 1, 2, 3, 4, Double.NaN}\u003c/code\u003e evaluates to \u003ccode\u003e2.5.\u003c/code\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Since percentile estimation usually involves interpolation between array\n * elements, arrays containing  \u003ccode\u003eNaN\u003c/code\u003e or infinite values will often\n * result in \u003ccode\u003eNaN\u003c/code\u003e or infinite values returned.\u003c/p\u003e\n * \u003cp\u003e\n * Since 2.2, Percentile uses only selection instead of complete sorting\n * and caches selection algorithm state between calls to the various\n * {@code evaluate} methods. This greatly improves efficiency, both for a single\n * percentile and multiple percentile computations. To maximize performance when\n * multiple percentiles are computed based on the same data, users should set the\n * data array once using either one of the {@link #evaluate(double[], double)} or\n * {@link #setData(double[])} methods and thereafter {@link #evaluate(double)}\n * with just the percentile provided.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_SELECT_SIZE"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Minimum size under which we use a simple insertion sort rather than Hoare\u0027s select. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CACHED_LEVELS"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Maximum number of partitioning pivots cached (each level double the number of pivots). "
    },
    {
      "type": "field",
      "varNames": [
        "quantile"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Determines what percentile is computed when evaluate() is activated\n     * with no quantile argument "
    },
    {
      "type": "field",
      "varNames": [
        "cachedPivots"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Cached pivots. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.Percentile()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Constructs a Percentile with a default quantile\n     * value of 50.0.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.Percentile(double)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Constructs a Percentile with the specific quantile value.\n     * @param p the quantile\n     * @throws MathIllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 23)",
        "(line 119,col 9)-(line 119,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.Percentile(org.apache.commons.math3.stat.descriptive.rank.Percentile)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Copy constructor, creates a new {@code Percentile} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Percentile} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.setData(double[])",
      "begin_line": 134,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.setData(double[], int, int)",
      "begin_line": 146,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the result of evaluating the statistic over the stored data.\n     * \u003cp\u003e\n     * The stored array is the one which was set by previous calls to\n     * {@link #setData(double[])}\n     * \u003c/p\u003e\n     * @param p the percentile value to compute\n     * @return the value of the statistic applied to the stored data\n     * @throws MathIllegalArgumentException if p is not a valid quantile value\n     * (p must be greater than 0 and less than or equal to 100)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double[], double)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100) \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     *     or p is invalid\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 27)",
        "(line 202,col 9)-(line 202,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double[], int, int)",
      "begin_line": 228,
      "end_line": 232,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003equantile\u003c/code\u003eth percentile of the\n     * designated values in the \u003ccode\u003evalues\u003c/code\u003e array.  The quantile\n     * estimated is determined by the \u003ccode\u003equantile\u003c/code\u003e property.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003equantile\u003c/code\u003e)\n     * \u003ccode\u003evalues[begin]\u003c/code\u003e if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null, or \u003ccode\u003estart\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param start index of the first array element to include\n     * @param length the number of elements to include\n     * @return the percentile value\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     *\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double[], int, int, double)",
      "begin_line": 264,
      "end_line": 305,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws MathIllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 36)",
        "(line 269,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 26)",
        "(line 280,col 9)-(line 280,col 39)",
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 32)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 284,col 22)",
        "(line 285,col 9)-(line 285,col 25)",
        "(line 286,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 60)",
        "(line 303,col 9)-(line 303,col 56)",
        "(line 304,col 9)-(line 304,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.select(double[], int[], int)",
      "begin_line": 318,
      "end_line": 359,
      "comment": "\n     * Select the k\u003csup\u003eth\u003c/sup\u003e smallest element from work array\n     * @param work work array (will be reorganized during the call)\n     * @param pivotsHeap set of pivot index corresponding to elements that\n     * are already at their sorted location, stored as an implicit heap\n     * (i.e. a sorted binary tree stored in a flat array, where the\n     * children of a node at index n are at indices 2n+1 for the left\n     * child and 2n+2 for the right child, with 0-based indices)\n     * @param k index of the desired element\n     * @return k\u003csup\u003eth\u003c/sup\u003e smallest element\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 22)",
        "(line 321,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 322,col 22)",
        "(line 324,col 9)-(line 352,col 9)",
        "(line 356,col 9)-(line 356,col 40)",
        "(line 357,col 9)-(line 357,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.medianOf3(double[], int, int)",
      "begin_line": 368,
      "end_line": 390,
      "comment": " Select a pivot index as the median of three\n     * @param work data array\n     * @param begin index of the first element of the slice\n     * @param end index after the last element of the slice\n     * @return the index of the median element chosen between the\n     * first, the middle and the last element of the array slice\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 41)",
        "(line 371,col 9)-(line 371,col 68)",
        "(line 372,col 9)-(line 372,col 45)",
        "(line 373,col 9)-(line 373,col 46)",
        "(line 374,col 9)-(line 374,col 52)",
        "(line 376,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.partition(double[], int, int, int)",
      "begin_line": 405,
      "end_line": 434,
      "comment": "\n     * Partition an array slice around a pivot\n     * \u003cp\u003e\n     * Partitioning exchanges array elements such that all elements\n     * smaller than pivot are before it and all elements larger than\n     * pivot are after it\n     * \u003c/p\u003e\n     * @param work data array\n     * @param begin index of the first element of the slice\n     * @param end index after the last element of the slice\n     * @param pivot initial index of the pivot\n     * @return index of the pivot after partition\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 34)",
        "(line 410,col 9)-(line 410,col 26)",
        "(line 411,col 9)-(line 411,col 24)",
        "(line 412,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 30)",
        "(line 431,col 9)-(line 431,col 28)",
        "(line 432,col 9)-(line 432,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.insertionSort(double[], int, int)",
      "begin_line": 442,
      "end_line": 452,
      "comment": "\n     * Sort in place a (small) array slice using insertion sort\n     * @param work array to sort\n     * @param begin index of the first element of the slice to sort\n     * @param end index after the last element of the slice to sort\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.getQuantile()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\n     * Returns the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @return quantile\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.setQuantile(double)",
      "begin_line": 472,
      "end_line": 478,
      "comment": "\n     * Sets the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @param p a value between 0 \u003c p \u003c\u003d 100\n     * @throws MathIllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.copy()",
      "begin_line": 483,
      "end_line": 489,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 45)",
        "(line 487,col 9)-(line 487,col 27)",
        "(line 488,col 9)-(line 488,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.copy(org.apache.commons.math3.stat.descriptive.rank.Percentile, org.apache.commons.math3.stat.descriptive.rank.Percentile)",
      "begin_line": 499,
      "end_line": 508,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Percentile to copy\n     * @param dest Percentile to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 39)",
        "(line 502,col 9)-(line 502,col 37)",
        "(line 503,col 9)-(line 503,col 42)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 40)"
      ]
    }
  ]
}