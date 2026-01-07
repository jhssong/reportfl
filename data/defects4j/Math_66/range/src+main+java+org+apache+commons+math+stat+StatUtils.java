{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/stat/StatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 632,
      "comment": "\n * StatUtils provides static methods for computing statistics based on data\n * stored in double[] arrays.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SUM"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " sum "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_SQUARES"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " sumSq "
    },
    {
      "type": "field",
      "varNames": [
        "PRODUCT"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " prod "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_LOGS"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " sumLog "
    },
    {
      "type": "field",
      "varNames": [
        "MIN"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " min "
    },
    {
      "type": "field",
      "varNames": [
        "MAX"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " max "
    },
    {
      "type": "field",
      "varNames": [
        "MEAN"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " mean "
    },
    {
      "type": "field",
      "varNames": [
        "VARIANCE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " variance "
    },
    {
      "type": "field",
      "varNames": [
        "PERCENTILE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " percentile "
    },
    {
      "type": "field",
      "varNames": [
        "GEOMETRIC_MEAN"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " geometric mean "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.StatUtils.StatUtils()",
      "begin_line": 74,
      "end_line": 75,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sum(double[])",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the sum of the values in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the input array\n     * is null.\u003c/p\u003e\n     *\n     * @param values  array of values to sum\n     * @return the sum of the values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sum(double[], int, int)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Returns the sum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumSq(double[])",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the sum of the squares of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values  input array\n     * @return the sum of the squared values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the\n     * array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumSq(double[], int, int)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.product(double[])",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Returns the product of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the product of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.product(double[], int, int)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumLog(double[])",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumLog(double[], int, int)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.mean(double[])",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Returns the arithmetic mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the mean of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.mean(double[], int, int)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.geometricMean(double[])",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns the geometric mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the geometric mean of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.geometricMean(double[], int, int)",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\n     * Returns the geometric mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the geometric mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[])",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * Returns the variance of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], int, int)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], double, int, int)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], double)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.max(double[])",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Returns the maximum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the maximum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.max(double[], int, int)",
      "begin_line": 443,
      "end_line": 446,
      "comment": "\n     * Returns the maximum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the maximum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.min(double[])",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Returns the minimum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the minimum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.min(double[], int, int)",
      "begin_line": 491,
      "end_line": 494,
      "comment": "\n     * Returns the minimum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the minimum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.percentile(double[], double)",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\u003c/p\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null  or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.rank.Percentile} for\n     * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     * or p is invalid\n     ",
      "child_ranges": [
        "(line 520,col 13)-(line 520,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.percentile(double[], int, int, double)",
      "begin_line": 550,
      "end_line": 553,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n      * See {@link org.apache.commons.math.stat.descriptive.rank.Percentile} for\n      * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumDifference(double[], double[])",
      "begin_line": 565,
      "end_line": 581,
      "comment": "\n     * Returns the sum of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return sum of paired differences\n     * @throws IllegalArgumentException if the arrays do not have the same\n     * (positive) length\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 31)",
        "(line 568,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 26)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.meanDifference(double[], double[])",
      "begin_line": 593,
      "end_line": 596,
      "comment": "\n     * Returns the mean of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return mean of paired differences\n     * @throws IllegalArgumentException if the arrays do not have the same\n     * (positive) length\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.varianceDifference(double[], double[], double)",
      "begin_line": 610,
      "end_line": 630,
      "comment": "\n     * Returns the variance of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., var(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @param meanDifference   the mean difference between corresponding entries\n     * @see #meanDifference(double[],double[])\n     * @return variance of paired differences\n     * @throws IllegalArgumentException if the arrays do not have the same\n     * length or their common length is less than 2.\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 25)",
        "(line 613,col 9)-(line 613,col 25)",
        "(line 614,col 9)-(line 614,col 25)",
        "(line 615,col 9)-(line 615,col 31)",
        "(line 616,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 52)"
      ]
    }
  ]
}