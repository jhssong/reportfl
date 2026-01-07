{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/stat/descriptive/moment/GeometricMean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeometricMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 203,
      "comment": "\n * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n * geometric mean \u003c/a\u003e of the available values.\n * \u003cp\u003e\n * Uses a {@link SumOfLogs} instance to compute sum of logs and returns\n * \u003ccode\u003e exp( 1/n  (sum of logs) ).\u003c/code\u003e  Therefore, \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eIf any of values are \u003c 0, the result is \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf all values are non-negative and less than\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,  but at least one value is 0, the\n * result is \u003ccode\u003e0.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf both \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e and\n * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e are among the values, the result is\n * \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sumOfLogs"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Wrapped SumOfLogs instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.GeometricMean()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Create a GeometricMean instance\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.GeometricMean(org.apache.commons.math.stat.descriptive.moment.GeometricMean)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Copy constructor, creates a new {@code GeometricMean} identical\n     * to the {@code original}\n     *\n     * @param original the {@code GeometricMean} instance to copy\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)",
        "(line 74,col 9)-(line 74,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.GeometricMean(org.apache.commons.math.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Create a GeometricMean instance using the given SumOfLogs instance\n     * @param sumOfLogs sum of logs instance to use for computation\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.copy()",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 51)",
        "(line 91,col 9)-(line 91,col 27)",
        "(line 92,col 9)-(line 92,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.increment(double)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.getResult()",
      "begin_line": 106,
      "end_line": 113,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.clear()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.evaluate(double[], int, int)",
      "begin_line": 139,
      "end_line": 144,
      "comment": "\n     * Returns the geometric mean of the entries in the specified portion\n     * of the input array.\n     * \u003cp\u003e\n     * See {@link GeometricMean} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values input array containing the values\n     * @param begin first array element to include\n     * @param length the number of elements to include\n     * @return the geometric mean or Double.NaN if length \u003d 0 or\n     * any of the values are \u0026lt;\u003d 0.\n     * @throws IllegalArgumentException if the input array is null or the array\n     * index parameters are not valid\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 143,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.getN()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of logs.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #increment(double) increment} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use\n     * for computing the log sum\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 21)",
        "(line 167,col 9)-(line 167,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.getSumLogImpl()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.copy(org.apache.commons.math.stat.descriptive.moment.GeometricMean, org.apache.commons.math.stat.descriptive.moment.GeometricMean)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source GeometricMean to copy\n     * @param dest GeometricMean to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.GeometricMean.checkEmpty()",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 200,col 9)"
      ]
    }
  ]
}