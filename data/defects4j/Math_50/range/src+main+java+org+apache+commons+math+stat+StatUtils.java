{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/stat/StatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 661,
      "comment": "\n * StatUtils provides static methods for computing statistics based on data\n * stored in double[] arrays.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SUM"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " sum "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_SQUARES"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " sumSq "
    },
    {
      "type": "field",
      "varNames": [
        "PRODUCT"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " prod "
    },
    {
      "type": "field",
      "varNames": [
        "SUM_OF_LOGS"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " sumLog "
    },
    {
      "type": "field",
      "varNames": [
        "MIN"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " min "
    },
    {
      "type": "field",
      "varNames": [
        "MAX"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " max "
    },
    {
      "type": "field",
      "varNames": [
        "MEAN"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " mean "
    },
    {
      "type": "field",
      "varNames": [
        "VARIANCE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " variance "
    },
    {
      "type": "field",
      "varNames": [
        "PERCENTILE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " percentile "
    },
    {
      "type": "field",
      "varNames": [
        "GEOMETRIC_MEAN"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " geometric mean "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.StatUtils.StatUtils()",
      "begin_line": 77,
      "end_line": 78,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sum(double[])",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns the sum of the values in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the input array\n     * is null.\u003c/p\u003e\n     *\n     * @param values  array of values to sum\n     * @return the sum of the values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sum(double[], int, int)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Returns the sum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumSq(double[])",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Returns the sum of the squares of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values  input array\n     * @return the sum of the squared values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the\n     * array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumSq(double[], int, int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.product(double[])",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Returns the product of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the product of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.product(double[], int, int)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumLog(double[])",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumLog(double[], int, int)",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.summary.SumOfLogs}.\n     * \u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.mean(double[])",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Returns the arithmetic mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the mean of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.mean(double[], int, int)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.geometricMean(double[])",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Returns the geometric mean of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the geometric mean of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.geometricMean(double[], int, int)",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n     * Returns the geometric mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the geometric mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[])",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Returns the variance of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], int, int)",
      "begin_line": 341,
      "end_line": 344,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], double, int, int)",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], double)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.max(double[])",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Returns the maximum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the maximum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.max(double[], int, int)",
      "begin_line": 446,
      "end_line": 449,
      "comment": "\n     * Returns the maximum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the maximum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.min(double[])",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Returns the minimum of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the minimum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.min(double[], int, int)",
      "begin_line": 494,
      "end_line": 497,
      "comment": "\n     * Returns the minimum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the minimum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.percentile(double[], double)",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length\n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\u003c/p\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null  or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.rank.Percentile} for\n     * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null\n     * or p is invalid\n     ",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.percentile(double[], int, int, double)",
      "begin_line": 553,
      "end_line": 556,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or\n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n      * See {@link org.apache.commons.math.stat.descriptive.rank.Percentile} for\n      * a description of the percentile estimation algorithm used.\u003c/p\u003e\n     *\n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumDifference(double[], double[])",
      "begin_line": 569,
      "end_line": 582,
      "comment": "\n     * Returns the sum of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return sum of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * (positive) length.\n     * @throws NoDataException if the sample arrays are empty.\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 31)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 26)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.meanDifference(double[], double[])",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Returns the mean of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return mean of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * (positive) length.\n     * @throws NoDataException if the sample arrays are empty.\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.varianceDifference(double[], double[], double)",
      "begin_line": 612,
      "end_line": 631,
      "comment": "\n     * Returns the variance of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., var(sample1[i] - sample2[i]).\n     *\n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @param meanDifference   the mean difference between corresponding entries\n     * @see #meanDifference(double[],double[])\n     * @return variance of paired differences\n     * @throws DimensionMismatchException if the arrays do not have the same\n     * length.\n     * @throws NumberIsTooSmallException if the arrays length is less than 2.\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 25)",
        "(line 616,col 9)-(line 616,col 25)",
        "(line 617,col 9)-(line 617,col 25)",
        "(line 618,col 9)-(line 618,col 31)",
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.normalize(double[])",
      "begin_line": 640,
      "end_line": 660,
      "comment": "\n     * Normalize (standardize) the series, so in the end it is having a mean of 0 and a standard deviation of 1.\n     *\n     * @param sample Sample to normalize.\n     * @return normalized (standardized) sample.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 66)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 649,col 9)-(line 649,col 38)",
        "(line 650,col 9)-(line 650,col 64)",
        "(line 653,col 9)-(line 653,col 64)",
        "(line 655,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 34)"
      ]
    }
  ]
}