{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/stat/descriptive/rank/Percentile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Percentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 83,
      "end_line": 499,
      "comment": "\n * Provides percentile computation.\n * \u003cp\u003e\n * There are several commonly used methods for estimating percentiles (a.k.a.\n * quantiles) based on sample data.  For large samples, the different methods\n * agree closely, but when sample sizes are small, different methods will give\n * significantly different results.  The algorithm implemented here works as follows:\n * \u003col\u003e\n * \u003cli\u003eLet \u003ccode\u003en\u003c/code\u003e be the length of the (sorted) array and\n * \u003ccode\u003e0 \u003c p \u003c\u003d 100\u003c/code\u003e be the desired percentile.\u003c/li\u003e\n * \u003cli\u003eIf \u003ccode\u003e n \u003d 1 \u003c/code\u003e return the unique array element (regardless of\n * the value of \u003ccode\u003ep\u003c/code\u003e); otherwise \u003c/li\u003e\n * \u003cli\u003eCompute the estimated percentile position\n * \u003ccode\u003e pos \u003d p * (n + 1) / 100\u003c/code\u003e and the difference, \u003ccode\u003ed\u003c/code\u003e\n * between \u003ccode\u003epos\u003c/code\u003e and \u003ccode\u003efloor(pos)\u003c/code\u003e (i.e. the fractional\n * part of \u003ccode\u003epos\u003c/code\u003e).\u003c/li\u003e\n * \u003cli\u003e If \u003ccode\u003epos \u003c 1\u003c/code\u003e return the smallest element in the array.\u003c/li\u003e\n * \u003cli\u003e Else if \u003ccode\u003epos \u003e\u003d n\u003c/code\u003e return the largest element in the array.\u003c/li\u003e\n * \u003cli\u003e Else let \u003ccode\u003elower\u003c/code\u003e be the element in position\n * \u003ccode\u003efloor(pos)\u003c/code\u003e in the array and let \u003ccode\u003eupper\u003c/code\u003e be the\n * next element in the array.  Return \u003ccode\u003elower + d * (upper - lower)\u003c/code\u003e\n * \u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n * To compute percentiles, the data must be at least partially ordered.  Input\n * arrays are copied and recursively partitioned using an ordering definition.\n * The ordering used by \u003ccode\u003eArrays.sort(double[])\u003c/code\u003e is the one determined\n * by {@link java.lang.Double#compareTo(Double)}.  This ordering makes\n * \u003ccode\u003eDouble.NaN\u003c/code\u003e larger than any other value (including\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e).  Therefore, for example, the median\n * (50th percentile) of\n * \u003ccode\u003e{0, 1, 2, 3, 4, Double.NaN}\u003c/code\u003e evaluates to \u003ccode\u003e2.5.\u003c/code\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Since percentile estimation usually involves interpolation between array\n * elements, arrays containing  \u003ccode\u003eNaN\u003c/code\u003e or infinite values will often\n * result in \u003ccode\u003eNaN\u003c/code\u003e or infinite values returned.\u003c/p\u003e\n * \u003cp\u003e\n * Since 2.2, Percentile uses only selection instead of complete sorting\n * and caches selection algorithm state between calls to the various\n * {@code evaluate} methods. This greatly improves efficiency, both for a single\n * percentile and multiple percentile computations. To maximize performance when\n * multiple percentiles are computed based on the same data, users should set the\n * data array once using either one of the {@link #evaluate(double[], double)} or\n * {@link #setData(double[])} methods and thereafter {@link #evaluate(double)}\n * with just the percentile provided.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_SELECT_SIZE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Minimum size under which we use a simple insertion sort rather than Hoare\u0027s select. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_CACHED_LEVELS"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Maximum number of partitioning pivots cached (each level double the number of pivots). "
    },
    {
      "type": "field",
      "varNames": [
        "quantile"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Determines what percentile is computed when evaluate() is activated\n     * with no quantile argument "
    },
    {
      "type": "field",
      "varNames": [
        "cachedPivots"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Cached pivots. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.Percentile()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Constructs a Percentile with a default quantile\n     * value of 50.0.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.Percentile(double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Constructs a Percentile with the specific quantile value.\n     * @param p the quantile\n     * @throws IllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 23)",
        "(line 117,col 9)-(line 117,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.Percentile(org.apache.commons.math3.stat.descriptive.rank.Percentile)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Copy constructor, creates a new {@code Percentile} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Percentile} instance to copy\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.setData(double[])",
      "begin_line": 131,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.setData(double[], int, int)",
      "begin_line": 143,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns the result of evaluating the statistic over the stored data.\n     * \u003cp\u003e\n     * The stored array is the one which was set by previous calls to\n     * \u003c/p\u003e\n     * @param p the percentile value to compute\n     * @return the value of the statistic applied to the stored data\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double[], double)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100) \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     *     or p is invalid\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 27)",
        "(line 194,col 9)-(line 194,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double[], int, int)",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003equantile\u003c/code\u003eth percentile of the\n     * designated values in the \u003ccode\u003evalues\u003c/code\u003e array.  The quantile\n     * estimated is determined by the \u003ccode\u003equantile\u003c/code\u003e property.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003equantile\u003c/code\u003e)\n     * \u003ccode\u003evalues[begin]\u003c/code\u003e if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null,  or \u003ccode\u003estart\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e\n     * is invalid\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param start index of the first array element to include\n     * @param length the number of elements to include\n     * @return the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid\n     *\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.evaluate(double[], int, int, double)",
      "begin_line": 256,
      "end_line": 296,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 36)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 26)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 273,col 32)",
        "(line 274,col 9)-(line 274,col 32)",
        "(line 275,col 9)-(line 275,col 22)",
        "(line 276,col 9)-(line 276,col 25)",
        "(line 277,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 60)",
        "(line 294,col 9)-(line 294,col 56)",
        "(line 295,col 9)-(line 295,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.select(double[], int[], int)",
      "begin_line": 309,
      "end_line": 350,
      "comment": "\n     * Select the k\u003csup\u003eth\u003c/sup\u003e smallest element from work array\n     * @param work work array (will be reorganized during the call)\n     * @param pivotsHeap set of pivot index corresponding to elements that\n     * are already at their sorted location, stored as an implicit heap\n     * (i.e. a sorted binary tree stored in a flat array, where the\n     * children of a node at index n are at indices 2n+1 for the left\n     * child and 2n+2 for the right child, with 0-based indices)\n     * @param k index of the desired element\n     * @return k\u003csup\u003eth\u003c/sup\u003e smallest element\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 22)",
        "(line 312,col 9)-(line 312,col 32)",
        "(line 313,col 9)-(line 313,col 22)",
        "(line 315,col 9)-(line 343,col 9)",
        "(line 347,col 9)-(line 347,col 40)",
        "(line 348,col 9)-(line 348,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.medianOf3(double[], int, int)",
      "begin_line": 359,
      "end_line": 381,
      "comment": " Select a pivot index as the median of three\n     * @param work data array\n     * @param begin index of the first element of the slice\n     * @param end index after the last element of the slice\n     * @return the index of the median element chosen between the\n     * first, the middle and the last element of the array slice\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 41)",
        "(line 362,col 9)-(line 362,col 68)",
        "(line 363,col 9)-(line 363,col 45)",
        "(line 364,col 9)-(line 364,col 46)",
        "(line 365,col 9)-(line 365,col 52)",
        "(line 367,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.partition(double[], int, int, int)",
      "begin_line": 396,
      "end_line": 425,
      "comment": "\n     * Partition an array slice around a pivot\n     * \u003cp\u003e\n     * Partitioning exchanges array elements such that all elements\n     * smaller than pivot are before it and all elements larger than\n     * pivot are after it\n     * \u003c/p\u003e\n     * @param work data array\n     * @param begin index of the first element of the slice\n     * @param end index after the last element of the slice\n     * @param pivot initial index of the pivot\n     * @return index of the pivot after partition\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 41)",
        "(line 399,col 9)-(line 399,col 34)",
        "(line 401,col 9)-(line 401,col 26)",
        "(line 402,col 9)-(line 402,col 24)",
        "(line 403,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 30)",
        "(line 422,col 9)-(line 422,col 28)",
        "(line 423,col 9)-(line 423,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.insertionSort(double[], int, int)",
      "begin_line": 433,
      "end_line": 443,
      "comment": "\n     * Sort in place a (small) array slice using insertion sort\n     * @param work array to sort\n     * @param begin index of the first element of the slice to sort\n     * @param end index after the last element of the slice to sort\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 442,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.getQuantile()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * Returns the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @return quantile\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.setQuantile(double)",
      "begin_line": 463,
      "end_line": 468,
      "comment": "\n     * Sets the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @param p a value between 0 \u003c p \u003c\u003d 100\n     * @throws IllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.copy()",
      "begin_line": 473,
      "end_line": 478,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 45)",
        "(line 476,col 9)-(line 476,col 27)",
        "(line 477,col 9)-(line 477,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Percentile.copy(org.apache.commons.math3.stat.descriptive.rank.Percentile, org.apache.commons.math3.stat.descriptive.rank.Percentile)",
      "begin_line": 488,
      "end_line": 497,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Percentile to copy\n     * @param dest Percentile to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 39)",
        "(line 491,col 9)-(line 491,col 37)",
        "(line 492,col 9)-(line 492,col 42)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 40)"
      ]
    }
  ]
}