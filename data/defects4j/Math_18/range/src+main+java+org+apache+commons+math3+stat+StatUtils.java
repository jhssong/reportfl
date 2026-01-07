{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/stat/StatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 788,
      "comment": "\n * StatUtils provides static methods for computing statistics based on data\n * stored in double[] arrays.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SUM"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " sum "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_SQUARES"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " sumSq "
    },
    {
      "type": "field",
      "varNames": [
        "PRODUCT"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " prod "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_LOGS"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " sumLog "
    },
    {
      "type": "field",
      "varNames": [
        "MIN"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " min "
    },
    {
      "type": "field",
      "varNames": [
        "MAX"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " max "
    },
    {
      "type": "field",
      "varNames": [
        "MEAN"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " mean "
    },
    {
      "type": "field",
      "varNames": [
        "VARIANCE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " variance "
    },
    {
      "type": "field",
      "varNames": [
        "PERCENTILE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " percentile "
    },
    {
      "type": "field",
      "varNames": [
        "GEOMETRIC_MEAN"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " geometric mean "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.StatUtils.StatUtils()",
      "begin_line": 78,
      "end_line": 79,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sum(double[])",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Returns the sum of the values in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the input array\n     * is null.\u003c/p\u003e\n     *\n     * @param values  array of values to sum\n     * @return the sum of the values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sum(double[], int, int)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * Returns the sum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumSq(double[])",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns the sum of the squares of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values  input array\n     * @return the sum of the squared values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the\n     * array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumSq(double[], int, int)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.product(double[])",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\n     * Returns the product of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the product of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.product(double[], int, int)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumLog(double[])",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumLog(double[], int, int)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.mean(double[])",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Returns the arithmetic mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the mean of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.mean(double[], int, int)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.geometricMean(double[])",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Returns the geometric mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the geometric mean of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.geometricMean(double[], int, int)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * Returns the geometric mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the geometric mean of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[])",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Returns the variance of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[])} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[], int, int)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[], int, int)} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[], double, int, int)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[], double, int, int)} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.variance(double[], double)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #populationVariance(double[], double)} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[])",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the formula and computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the population variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[], int, int)",
      "begin_line": 466,
      "end_line": 469,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the population variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[], double, int, int)",
      "begin_line": 498,
      "end_line": 501,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the population variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.populationVariance(double[], double)",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the population variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.max(double[])",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Returns the maximum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the maximum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.max(double[], int, int)",
      "begin_line": 573,
      "end_line": 576,
      "comment": "\n     * Returns the maximum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the maximum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.min(double[])",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Returns the minimum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the minimum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.min(double[], int, int)",
      "begin_line": 621,
      "end_line": 624,
      "comment": "\n     * Returns the minimum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the minimum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.percentile(double[], double)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\u003c/p\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null  or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math3.stat.descriptive.rank.Percentile} for\n     * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     * or p is invalid\n     ",
      "child_ranges": [
        "(line 650,col 13)-(line 650,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.percentile(double[], int, int, double)",
      "begin_line": 680,
      "end_line": 683,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n      * See {@link org.apache.commons.math3.stat.descriptive.rank.Percentile} for\n      * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.sumDifference(double[], double[])",
      "begin_line": 696,
      "end_line": 709,
      "comment": "\n     * Returns the sum of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return sum of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * (positive) length.\n     * @throws NoDataException if the sample arrays are empty.\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 31)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 26)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.meanDifference(double[], double[])",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\n     * Returns the mean of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return mean of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * (positive) length.\n     * @throws NoDataException if the sample arrays are empty.\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.varianceDifference(double[], double[], double)",
      "begin_line": 739,
      "end_line": 758,
      "comment": "\n     * Returns the variance of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., var(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @param meanDifference   the mean difference between corresponding entries\n     * @see #meanDifference(double[],double[])\n     * @return variance of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * length.\n     * @throws NumberIsTooSmallException if the arrays length is less than 2.\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 25)",
        "(line 743,col 9)-(line 743,col 25)",
        "(line 744,col 9)-(line 744,col 25)",
        "(line 745,col 9)-(line 745,col 31)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.StatUtils.normalize(double[])",
      "begin_line": 767,
      "end_line": 787,
      "comment": "\n     * Normalize (standardize) the series, so in the end it is having a mean of 0 and a standard deviation of 1.\n     *\n     * @param sample Sample to normalize.\n     * @return normalized (standardized) sample.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 66)",
        "(line 771,col 9)-(line 773,col 9)",
        "(line 776,col 9)-(line 776,col 38)",
        "(line 777,col 9)-(line 777,col 64)",
        "(line 780,col 9)-(line 780,col 64)",
        "(line 782,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 34)"
      ]
    }
  ]
}