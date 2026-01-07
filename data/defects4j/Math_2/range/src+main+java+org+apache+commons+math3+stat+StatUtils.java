{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/stat/StatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 888,
      "comment": "\n * StatUtils provides static methods for computing statistics based on data\n * stored in double[] arrays.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SUM"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " sum "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_SQUARES"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " sumSq "
    },
    {
      "type": "field",
      "varNames": [
        "PRODUCT"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " prod "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_LOGS"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " sumLog "
    },
    {
      "type": "field",
      "varNames": [
        "MIN"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " min "
    },
    {
      "type": "field",
      "varNames": [
        "MAX"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " max "
    },
    {
      "type": "field",
      "varNames": [
        "MEAN"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " mean "
    },
    {
      "type": "field",
      "varNames": [
        "VARIANCE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " variance "
    },
    {
      "type": "field",
      "varNames": [
        "PERCENTILE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " percentile "
    },
    {
      "type": "field",
      "varNames": [
        "GEOMETRIC_MEAN"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " geometric mean "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.StatUtils.StatUtils()",
      "begin_line": 82,
      "end_line": 83,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sum(double[])",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Returns the sum of the values in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the input array\n     * is null.\u003c/p\u003e\n     *\n     * @param values  array of values to sum\n     * @return the sum of the values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sum(double[], int, int)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Returns the sum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumSq(double[])",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Returns the sum of the squares of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values  input array\n     * @return the sum of the squared values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the\n     * array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumSq(double[], int, int)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.product(double[])",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Returns the product of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the product of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.product(double[], int, int)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumLog(double[])",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumLog(double[], int, int)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.mean(double[])",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * Returns the arithmetic mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the mean of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.mean(double[], int, int)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.geometricMean(double[])",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * Returns the geometric mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the geometric mean of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.geometricMean(double[], int, int)",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Returns the geometric mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the geometric mean of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[])",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Returns the variance of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[])} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[], int, int)",
      "begin_line": 359,
      "end_line": 362,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[], int, int)} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[], double, int, int)",
      "begin_line": 394,
      "end_line": 397,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[], double, int, int)} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[], double)",
      "begin_line": 425,
      "end_line": 428,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[], double)} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[])",
      "begin_line": 446,
      "end_line": 449,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the formula and computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the population variance of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[], int, int)",
      "begin_line": 472,
      "end_line": 475,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the population variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[], double, int, int)",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the population variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[], double)",
      "begin_line": 532,
      "end_line": 535,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the population variance of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.max(double[])",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Returns the maximum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the maximum of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.max(double[], int, int)",
      "begin_line": 580,
      "end_line": 583,
      "comment": "\n     * Returns the maximum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the maximum of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.min(double[])",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n     * Returns the minimum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the minimum of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.min(double[], int, int)",
      "begin_line": 628,
      "end_line": 631,
      "comment": "\n     * Returns the minimum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the minimum of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.percentile(double[], double)",
      "begin_line": 656,
      "end_line": 659,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\u003c/p\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null  or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.rank.Percentile} for\n     * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     * or p is invalid\n     ",
      "child_ranges": [
        "(line 658,col 13)-(line 658,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.percentile(double[], int, int, double)",
      "begin_line": 688,
      "end_line": 691,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.rank.Percentile} for\n     * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws MathIllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumDifference(double[], double[])",
      "begin_line": 704,
      "end_line": 718,
      "comment": "\n     * Returns the sum of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return sum of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * (positive) length.\n     * @throws NoDataException if the sample arrays are empty.\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 31)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 26)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 717,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.meanDifference(double[], double[])",
      "begin_line": 731,
      "end_line": 734,
      "comment": "\n     * Returns the mean of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return mean of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * (positive) length.\n     * @throws NoDataException if the sample arrays are empty.\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.varianceDifference(double[], double[], double)",
      "begin_line": 749,
      "end_line": 768,
      "comment": "\n     * Returns the variance of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., var(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @param meanDifference   the mean difference between corresponding entries\n     * @see #meanDifference(double[],double[])\n     * @return variance of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * length.\n     * @throws NumberIsTooSmallException if the arrays length is less than 2.\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 25)",
        "(line 753,col 9)-(line 753,col 25)",
        "(line 754,col 9)-(line 754,col 25)",
        "(line 755,col 9)-(line 755,col 31)",
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.normalize(double[])",
      "begin_line": 777,
      "end_line": 797,
      "comment": "\n     * Normalize (standardize) the sample, so it is has a mean of 0 and a standard deviation of 1.\n     *\n     * @param sample Sample to normalize.\n     * @return normalized (standardized) sample.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 66)",
        "(line 781,col 9)-(line 783,col 9)",
        "(line 786,col 9)-(line 786,col 38)",
        "(line 787,col 9)-(line 787,col 64)",
        "(line 790,col 9)-(line 790,col 64)",
        "(line 792,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.mode(double[])",
      "begin_line": 817,
      "end_line": 822,
      "comment": "\n     * Returns the sample mode(s).  The mode is the most frequently occurring\n     * value in the sample. If there is a unique value with maximum frequency,\n     * this value is returned as the only element of the output array. Otherwise,\n     * the returned array contains the maximum frequency elements in increasing\n     * order.  For example, if {@code sample} is {0, 12, 5, 6, 0, 13, 5, 17},\n     * the returned array will have length two, with 0 in the first element and\n     * 5 in the second.\n     *\n     * \u003cp\u003eNaN values are ignored when computing the mode - i.e., NaNs will never\n     * appear in the output array.  If the sample includes only NaNs or has\n     * length 0, an empty array is returned.\u003c/p\u003e\n     *\n     * @param sample input data\n     * @return array of array of the most frequently occurring element(s) sorted in ascending order.\n     * @throws MathIllegalArgumentException if the indices are invalid or the array is null\n     * @since 3.3\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 821,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.mode(double[], int, int)",
      "begin_line": 845,
      "end_line": 859,
      "comment": "\n     * Returns the sample mode(s).  The mode is the most frequently occurring\n     * value in the sample. If there is a unique value with maximum frequency,\n     * this value is returned as the only element of the output array. Otherwise,\n     * the returned array contains the maximum frequency elements in increasing\n     * order.  For example, if {@code sample} is {0, 12, 5, 6, 0, 13, 5, 17},\n     * the returned array will have length two, with 0 in the first element and\n     * 5 in the second.\n     *\n     * \u003cp\u003eNaN values are ignored when computing the mode - i.e., NaNs will never\n     * appear in the output array.  If the sample includes only NaNs or has\n     * length 0, an empty array is returned.\u003c/p\u003e\n     *\n     * @param sample input data\n     * @param begin index (0-based) of the first array element to include\n     * @param length the number of elements to include\n     *\n     * @return array of array of the most frequently occurring element(s) sorted in ascending order.\n     * @throws MathIllegalArgumentException if the indices are invalid or the array is null\n     * @since 3.3\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 848,col 9)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 858,col 9)-(line 858,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.getMode(double[], int, int)",
      "begin_line": 869,
      "end_line": 886,
      "comment": "\n     * Private helper method.\n     * Assumes parameters have been validated.\n     * @param values input data\n     * @param begin index (0-based) of the first array element to include\n     * @param length the number of elements to include\n     * @return array of array of the most frequently occurring element(s) sorted in ascending order.\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 41)",
        "(line 872,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 878,col 50)",
        "(line 880,col 9)-(line 880,col 49)",
        "(line 881,col 9)-(line 881,col 18)",
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 21)"
      ]
    }
  ]
}