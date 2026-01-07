{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/rank/Percentile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Percentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 278,
      "comment": "\n * Provides percentile computation.\n * \u003cp\u003e\n * There are several commonly used methods for estimating percentiles (a.k.a.\n * quantiles) based on sample data.  For large samples, the different methods\n * agree closely, but when sample sizes are small, different methods will give\n * significantly different results.  The algorithm implemented here works as follows:\n * \u003col\u003e\n * \u003cli\u003eLet \u003ccode\u003en\u003c/code\u003e be the length of the (sorted) array and\n * \u003ccode\u003e0 \u003c p \u003c\u003d 100\u003c/code\u003e be the desired percentile.\u003c/li\u003e\n * \u003cli\u003eIf \u003ccode\u003e n \u003d 1 \u003c/code\u003e return the unique array element (regardless of\n * the value of \u003ccode\u003ep\u003c/code\u003e); otherwise \u003c/li\u003e\n * \u003cli\u003eCompute the estimated percentile position\n * \u003ccode\u003e pos \u003d p * (n + 1) / 100\u003c/code\u003e and the difference, \u003ccode\u003ed\u003c/code\u003e\n * between \u003ccode\u003epos\u003c/code\u003e and \u003ccode\u003efloor(pos)\u003c/code\u003e (i.e. the fractional\n * part of \u003ccode\u003epos\u003c/code\u003e).  If \u003ccode\u003epos \u003e\u003d n\u003c/code\u003e return the largest\n * element in the array; otherwise\u003c/li\u003e\n * \u003cli\u003eLet \u003ccode\u003elower\u003c/code\u003e be the element in position\n * \u003ccode\u003efloor(pos)\u003c/code\u003e in the array and let \u003ccode\u003eupper\u003c/code\u003e be the\n * next element in the array.  Return \u003ccode\u003elower + d * (upper - lower)\u003c/code\u003e\n * \u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n * To compute percentiles, the data must be (totally) ordered.  Input arrays\n * are copied and then sorted using  {@link java.util.Arrays#sort(double[])}.\n * The ordering used by \u003ccode\u003eArrays.sort(double[])\u003c/code\u003e is the one determined\n * by {@link java.lang.Double#compareTo(Double)}.  This ordering makes\n * \u003ccode\u003eDouble.NaN\u003c/code\u003e larger than any other value (including\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e).  Therefore, for example, the median\n * (50th percentile) of\n * \u003ccode\u003e{0, 1, 2, 3, 4, Double.NaN}\u003c/code\u003e evaluates to \u003ccode\u003e2.5.\u003c/code\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Since percentile estimation usually involves interpolation between array\n * elements, arrays containing  \u003ccode\u003eNaN\u003c/code\u003e or infinite values will often\n * result in \u003ccode\u003eNaN\u003ccode\u003e or infinite values returned.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "quantile"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Determines what percentile is computed when evaluate() is activated\n     * with no quantile argument "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.Percentile()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructs a Percentile with a default quantile\n     * value of 50.0.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.Percentile(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructs a Percentile with the specific quantile value.\n     * @param p the quantile\n     * @throws IllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.Percentile(org.apache.commons.math.stat.descriptive.rank.Percentile)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Copy constructor, creates a new {@code Percentile} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Percentile} instance to copy\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.evaluate(double[], double)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100) \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     *     or p is invalid\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 27)",
        "(line 133,col 9)-(line 133,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.evaluate(double[], int, int)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003equantile\u003c/code\u003eth percentile of the\n     * designated values in the \u003ccode\u003evalues\u003c/code\u003e array.  The quantile\n     * estimated is determined by the \u003ccode\u003equantile\u003c/code\u003e property.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003equantile\u003c/code\u003e)\n     * \u003ccode\u003evalues[begin]\u003c/code\u003e if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null,  or \u003ccode\u003estart\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e\n     * is invalid\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param start index of the first array element to include\n     * @param length the number of elements to include\n     * @return the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid\n     *\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.evaluate(double[], int, int, double)",
      "begin_line": 195,
      "end_line": 228,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * Calls to this method do not modify the internal \u003ccode\u003equantile\u003c/code\u003e\n     * state of this statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Percentile} for a description of the percentile estimation\n     * algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 36)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 26)",
        "(line 211,col 9)-(line 211,col 39)",
        "(line 212,col 9)-(line 212,col 38)",
        "(line 213,col 9)-(line 213,col 32)",
        "(line 214,col 9)-(line 214,col 32)",
        "(line 215,col 9)-(line 215,col 45)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 28)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 226,col 38)",
        "(line 227,col 9)-(line 227,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.getQuantile()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Returns the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @return quantile\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.setQuantile(double)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * Sets the value of the quantile field (determines what percentile is\n     * computed when evaluate() is called with no quantile argument).\n     *\n     * @param p a value between 0 \u003c p \u003c\u003d 100\n     * @throws IllegalArgumentException  if p is not greater than 0 and less\n     * than or equal to 100\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.copy()",
      "begin_line": 259,
      "end_line": 264,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 45)",
        "(line 262,col 9)-(line 262,col 27)",
        "(line 263,col 9)-(line 263,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Percentile.copy(org.apache.commons.math.stat.descriptive.rank.Percentile, org.apache.commons.math.stat.descriptive.rank.Percentile)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Percentile to copy\n     * @param dest Percentile to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 40)"
      ]
    }
  ]
}