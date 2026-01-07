{
  "filepath": "/tmp/Math-100b/src/test/org/apache/commons/math/stat/descriptive/moment/VarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarianceTest",
      "is_interface": false,
      "parent_types": [
        "StorelessUnivariateStatisticAbstractTest"
      ],
      "begin_line": 30,
      "end_line": 104,
      "comment": "\n * Test cases for the {@link UnivariateStatistic} class.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stat"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.VarianceTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * @param name\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.getUnivariateStatistic()",
      "begin_line": 44,
      "end_line": 46,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.math.stat.descriptive.UnivariateStatisticAbstractTest#getUnivariateStatistic()\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.suite()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 60)",
        "(line 50,col 9)-(line 50,col 40)",
        "(line 51,col 9)-(line 51,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.expectedValue()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.math.stat.descriptive.UnivariateStatisticAbstractTest#expectedValue()\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testNaN()",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Make sure Double.NaN is returned iff n \u003d 0\n     *\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 56)",
        "(line 67,col 9)-(line 67,col 50)",
        "(line 68,col 9)-(line 68,col 26)",
        "(line 69,col 9)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testPopulation()",
      "begin_line": 75,
      "end_line": 90,
      "comment": "\n     * Test population version of variance\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 74)",
        "(line 77,col 9)-(line 77,col 44)",
        "(line 78,col 9)-(line 78,col 27)",
        "(line 79,col 9)-(line 79,col 37)",
        "(line 80,col 9)-(line 80,col 35)",
        "(line 81,col 9)-(line 81,col 77)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 83,col 72)",
        "(line 84,col 9)-(line 84,col 36)",
        "(line 85,col 9)-(line 85,col 72)",
        "(line 86,col 9)-(line 86,col 33)",
        "(line 87,col 9)-(line 87,col 77)",
        "(line 88,col 9)-(line 88,col 32)",
        "(line 89,col 9)-(line 89,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.populationVariance(double[])",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Definitional formula for population variance\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 45)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 39)"
      ]
    }
  ]
}