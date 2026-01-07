{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/moment/SecondMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 87,
      "comment": "\n * Computes a statistic related to the Second Central Moment.  Specifically,\n * what is computed is the sum of squared deviations from the sample mean.\n * \u003cp\u003e\n * The following recursive updating formula is used:\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then\n * \u003cp\u003e\n * new value \u003d old value + dev^2 * (n -1) / n.\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n * \n * @version $Revision$ $Date$\n "
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
        "m2"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " second moment of values that have been added "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.SecondMoment()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Create a SecondMoment instance\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)",
        "(line 58,col 9)-(line 58,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.increment(double)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 27)",
        "(line 69,col 9)-(line 69,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.clear()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 22)",
        "(line 77,col 9)-(line 77,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.getResult()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 18)"
      ]
    }
  ]
}