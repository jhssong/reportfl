{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/StandardDeviation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardDeviation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 280,
      "comment": "\n * Computes the sample standard deviation.  The standard deviation\n * is the positive square root of the variance.  This implementation wraps a\n * {@link Variance} instance.  The \u003ccode\u003eisBiasCorrected\u003c/code\u003e property of the\n * wrapped Variance instance is exposed, so that this class can be used to\n * compute both the \"sample standard deviation\" (the square root of the\n * bias-corrected \"sample variance\") or the \"population standard deviation\"\n * (the square root of the non-bias-corrected \"population variance\"). See\n * {@link Variance} for more information.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Wrapped Variance instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.StandardDeviation()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Constructs a StandardDeviation.  Sets the underlying {@link Variance}\n     * instance\u0027s \u003ccode\u003eisBiasCorrected\u003c/code\u003e property to true.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.StandardDeviation(org.apache.commons.math3.stat.descriptive.moment.SecondMoment)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Constructs a StandardDeviation from an external second moment.\n     *\n     * @param m2 the external moment\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.StandardDeviation(org.apache.commons.math3.stat.descriptive.moment.StandardDeviation)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Copy constructor, creates a new {@code StandardDeviation} identical\n     * to the {@code original}\n     *\n     * @param original the {@code StandardDeviation} instance to copy\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.StandardDeviation(boolean)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Contructs a StandardDeviation with the specified value for the\n     * \u003ccode\u003eisBiasCorrected\u003c/code\u003e property.  If this property is set to\n     * \u003ccode\u003etrue\u003c/code\u003e, the {@link Variance} used in computing results will\n     * use the bias-corrected, or \"sample\" formula.  See {@link Variance} for\n     * details.\n     *\n     * @param isBiasCorrected  whether or not the variance computation will use\n     * the bias-corrected formula\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.StandardDeviation(boolean, org.apache.commons.math3.stat.descriptive.moment.SecondMoment)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Contructs a StandardDeviation with the specified value for the\n     * \u003ccode\u003eisBiasCorrected\u003c/code\u003e property and the supplied external moment.\n     * If \u003ccode\u003eisBiasCorrected\u003c/code\u003e is set to \u003ccode\u003etrue\u003c/code\u003e, the\n     * {@link Variance} used in computing results will use the bias-corrected,\n     * or \"sample\" formula.  See {@link Variance} for details.\n     *\n     * @param isBiasCorrected  whether or not the variance computation will use\n     * the bias-corrected formula\n      * @param m2 the external moment\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.increment(double)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.getN()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.getResult()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.clear()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.evaluate(double[])",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Returns the Standard Deviation of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.evaluate(double[], int, int)",
      "begin_line": 177,
      "end_line": 181,
      "comment": "\n     * Returns the Standard Deviation of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample. \u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 180,col 8)-(line 180,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.evaluate(double[], double, int, int)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Returns the Standard Deviation of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.evaluate(double[], double)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * Returns the Standard Deviation of the entries in the input array, using\n     * the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.isBiasCorrected()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * @return Returns the isBiasCorrected.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.setBiasCorrected(boolean)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * @param isBiasCorrected The isBiasCorrected to set.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.copy()",
      "begin_line": 255,
      "end_line": 261,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 59)",
        "(line 259,col 9)-(line 259,col 27)",
        "(line 260,col 9)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.copy(org.apache.commons.math3.stat.descriptive.moment.StandardDeviation, org.apache.commons.math3.stat.descriptive.moment.StandardDeviation)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source StandardDeviation to copy\n     * @param dest StandardDeviation to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 39)",
        "(line 275,col 9)-(line 275,col 37)",
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 277,col 47)"
      ]
    }
  ]
}