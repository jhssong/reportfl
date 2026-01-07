{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/StatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 619,
      "comment": "\n * StatUtils provides static methods for computing statistics based on data\n * stored in double[] arrays. \n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " sum "
    },
    {
      "type": "field",
      "varNames": [
        "sumSq"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " sumSq "
    },
    {
      "type": "field",
      "varNames": [
        "prod"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " prod "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " sumLog "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " min "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " max "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " mean "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " variance "
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " percentile "
    },
    {
      "type": "field",
      "varNames": [
        "geometricMean"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " geometric mean "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.StatUtils.StatUtils()",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sum(double[])",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Returns the sum of the values in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the input array\n     * is null.\n     * \n     * @param values  array of values to sum\n     * @return the sum of the values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sum(double[], int, int)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Returns the sum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumSq(double[])",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns the sum of the squares of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values  input array\n     * @return the sum of the squared values or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the\n     * array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumSq(double[], int, int)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Returns the sum of the squares of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the squares of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.product(double[])",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Returns the product of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @return the product of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.product(double[], int, int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Returns the product of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the product of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumLog(double[])",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.summary.SumOfLogs}.\n     * \n     * @param values the input array\n     * @return the sum of the natural logs of the values or Double.NaN if \n     * the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumLog(double[], int, int)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n      * See {@link org.apache.commons.math.stat.descriptive.summary.SumOfLogs}.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or Double.NaN if \n     * length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.mean(double[])",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Returns the arithmetic mean of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\n     * \n     * @param values the input array\n     * @return the mean of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.mean(double[], int, int)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Mean} for\n     * details on the computing algorithm.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.geometricMean(double[])",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Returns the geometric mean of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\n     * \n     * @param values the input array\n     * @return the geometric mean of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.geometricMean(double[], int, int)",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * Returns the geometric mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.GeometricMean}\n     * for details on the computing algorithm.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the geometric mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[])",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Returns the variance of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], int, int)",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], double, int, int)",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or the\n     * array index parameters are not valid.\n     * \n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.variance(double[], double)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.  \n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.moment.Variance} for\n     * details on the computing algorithm.   \n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.max(double[])",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Returns the maximum of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e, \n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param values the input array\n     * @return the maximum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.max(double[], int, int)",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\n     * Returns the maximum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e, \n     * the result is \u003ccode\u003eDouble.POSITIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the maximum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.min(double[])",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * Returns the minimum of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e, \n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \n     * \n     * @param values the input array\n     * @return the minimum of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.min(double[], int, int)",
      "begin_line": 487,
      "end_line": 490,
      "comment": "\n     * Returns the minimum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e, \n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the minimum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     * parameters are not valid\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.percentile(double[], double)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e has length \n     * \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[0]\u003c/code\u003e\n     *  if \u003ccode\u003evalues\u003c/code\u003e has length \u003ccode\u003e1\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     * is null  or p is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * See {@link org.apache.commons.math.stat.descriptive.rank.Percentile} for\n     * a description of the percentile estimation algorithm used.\n     * \n     * @param values input array of values\n     * @param p the percentile value to compute\n     * @return the percentile value or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if \u003ccode\u003evalues\u003c/code\u003e is null \n     * or p is invalid\n     ",
      "child_ranges": [
        "(line 516,col 13)-(line 516,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.percentile(double[], int, int, double)",
      "begin_line": 546,
      "end_line": 549,
      "comment": "\n     * Returns an estimate of the \u003ccode\u003ep\u003c/code\u003eth percentile of the values\n     * in the \u003ccode\u003evalues\u003c/code\u003e array, starting with the element in (0-based)\n     * position \u003ccode\u003ebegin\u003c/code\u003e in the array and including \u003ccode\u003elength\u003c/code\u003e\n     * values.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eReturns \u003ccode\u003eDouble.NaN\u003c/code\u003e if \u003ccode\u003elength \u003d 0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eReturns (for any value of \u003ccode\u003ep\u003c/code\u003e) \u003ccode\u003evalues[begin]\u003c/code\u003e\n     *  if \u003ccode\u003elength \u003d 1 \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003evalues\u003c/code\u003e\n     *  is null , \u003ccode\u003ebegin\u003c/code\u003e or \u003ccode\u003elength\u003c/code\u003e is invalid, or \n     * \u003ccode\u003ep\u003c/code\u003e is not a valid quantile value (p must be greater than 0\n     * and less than or equal to 100)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n      * See {@link org.apache.commons.math.stat.descriptive.rank.Percentile} for\n      * a description of the percentile estimation algorithm used.\n     * \n     * @param values array of input values\n     * @param p  the percentile to compute\n     * @param begin  the first (0-based) element to include in the computation\n     * @param length  the number of array elements to include\n     * @return  the percentile value\n     * @throws IllegalArgumentException if the parameters are not valid or the\n     * input array is null\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.sumDifference(double[], double[])",
      "begin_line": 561,
      "end_line": 573,
      "comment": "\n     * Returns the sum of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]).\n     * \n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return sum of paired differences\n     * @throws IllegalArgumentException if the arrays do not have the same\n     * (positive) length\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 31)",
        "(line 564,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 26)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.meanDifference(double[], double[])",
      "begin_line": 585,
      "end_line": 588,
      "comment": "\n     * Returns the mean of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.\n     * \n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @return mean of paired differences\n     * @throws IllegalArgumentException if the arrays do not have the same\n     * (positive) length\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.StatUtils.varianceDifference(double[], double[], double)",
      "begin_line": 602,
      "end_line": 617,
      "comment": "\n     * Returns the variance of the (signed) differences between corresponding elements of the\n     * input arrays -- i.e., var(sample1[i] - sample2[i]).\n     * \n     * @param sample1  the first array\n     * @param sample2  the second array\n     * @param meanDifference   the mean difference between corresponding entries \n     * @see #meanDifference(double[],double[])\n     * @return variance of paired differences\n     * @throws IllegalArgumentException if the arrays do not have the same\n     * length or their common length is less than 2.\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 25)",
        "(line 605,col 9)-(line 605,col 25)",
        "(line 606,col 9)-(line 606,col 25)",
        "(line 607,col 9)-(line 607,col 31)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 70)"
      ]
    }
  ]
}