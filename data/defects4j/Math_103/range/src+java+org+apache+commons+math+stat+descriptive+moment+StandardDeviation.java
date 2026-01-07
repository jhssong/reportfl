{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/stat/descriptive/moment/StandardDeviation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardDeviation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 230,
      "comment": "\n * Computes the sample standard deviation.  The standard deviation\n * is the positive square root of the variance.  This implementation wraps a\n * {@link Variance} instance.  The \u003ccode\u003eisBiasCorrected\u003c/code\u003e property of the\n * wrapped Variance instance is exposed, so that this class can be used to\n * compute both the \"sample standard deviation\" (the square root of the \n * bias-corrected \"sample variance\") or the \"population standard deviation\"\n * (the square root of the non-bias-corrected \"population variance\"). See \n * {@link Variance} for more information.  \n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Wrapped Variance instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.StandardDeviation()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructs a StandardDeviation.  Sets the underlying {@link Variance}\n     * instance\u0027s \u003ccode\u003eisBiasCorrected\u003c/code\u003e property to true.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.StandardDeviation(org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Constructs a StandardDeviation from an external second moment.\n     * \n     * @param m2 the external moment\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.StandardDeviation(boolean)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Contructs a StandardDeviation with the specified value for the\n     * \u003ccode\u003eisBiasCorrected\u003c/code\u003e property.  If this property is set to \n     * \u003ccode\u003etrue\u003c/code\u003e, the {@link Variance} used in computing results will\n     * use the bias-corrected, or \"sample\" formula.  See {@link Variance} for\n     * details.\n     * \n     * @param isBiasCorrected  whether or not the variance computation will use\n     * the bias-corrected formula\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.StandardDeviation(boolean, org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Contructs a StandardDeviation with the specified value for the\n     * \u003ccode\u003eisBiasCorrected\u003c/code\u003e property and the supplied external moment.\n     * If \u003ccode\u003eisBiasCorrected\u003c/code\u003e is set to \u003ccode\u003etrue\u003c/code\u003e, the\n     * {@link Variance} used in computing results will use the bias-corrected,\n     * or \"sample\" formula.  See {@link Variance} for details.\n     * \n     * @param isBiasCorrected  whether or not the variance computation will use\n     * the bias-corrected formula\n      * @param m2 the external moment\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.increment(double)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.getN()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.getResult()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.clear()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.evaluate(double[])",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Returns the Standard Deviation of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\n     * \n     * @param values the input array\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.evaluate(double[], int, int)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Returns the Standard Deviation of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 160,col 8)-(line 160,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.evaluate(double[], double, int, int)",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * Returns the Standard Deviation of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\n     * \n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.evaluate(double[], double)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Returns the Standard Deviation of the entries in the input array, using\n     * the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\n     * \n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the standard deviation of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.isBiasCorrected()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * @return Returns the isBiasCorrected.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.StandardDeviation.setBiasCorrected(boolean)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * @param isBiasCorrected The isBiasCorrected to set.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 51)"
      ]
    }
  ]
}