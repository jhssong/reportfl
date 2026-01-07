{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/stat/descriptive/moment/GeometricMean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeometricMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic"
      ],
      "begin_line": 47,
      "end_line": 159,
      "comment": "\n * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n * geometric mean \u003c/a\u003e of the available values.\n * \u003cp\u003e\n * Uses a {@link SumOfLogs} instance to compute sum of logs and returns\n * \u003ccode\u003e exp( 1/n  (sum of logs) ).\u003c/code\u003e  Therefore, \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eIf any of values are \u003c 0, the result is \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf all values are non-negative and less than \n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,  but at least one value is 0, the \n * result is \u003ccode\u003e0.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf both \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e and \n * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e are among the values, the result is\n * \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n * \n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sumOfLogs"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Wrapped SumOfLogs instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.GeometricMean()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create a GeometricMean instance\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.GeometricMean(org.apache.commons.math.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Create a GeometricMean instance using the given SumOfLogs instance\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.increment(double)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.getResult()",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.clear()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.evaluate(double[], int, int)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Returns the geometric mean of the entries in the specified portion\n     * of the input array.\n     * \u003cp\u003e\n     * See {@link GeometricMean} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \n     * @param values input array containing the values\n     * @param begin first array element to include\n     * @param length the number of elements to include\n     * @return the geometric mean or Double.NaN if length \u003d 0 or\n     * any of the values are \u0026lt;\u003d 0.\n     * @throws IllegalArgumentException if the input array is null or the array\n     * index parameters are not valid\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 113,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.getN()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of logs.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #increment(double) increment} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use\n     * for computing the log sum\n     * @throws IllegalStateException if data has already been added \n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 21)",
        "(line 137,col 9)-(line 137,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.getSumLogImpl()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the log sum\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.checkEmpty()",
      "begin_line": 152,
      "end_line": 157,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 156,col 9)"
      ]
    }
  ]
}