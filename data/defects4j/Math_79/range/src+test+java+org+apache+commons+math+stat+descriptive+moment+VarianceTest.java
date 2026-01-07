{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/stat/descriptive/moment/VarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarianceTest",
      "is_interface": false,
      "parent_types": [
        "StorelessUnivariateStatisticAbstractTest"
      ],
      "begin_line": 31,
      "end_line": 129,
      "comment": "\n * Test cases for the {@link UnivariateStatistic} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stat"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.VarianceTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * @param name\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.getUnivariateStatistic()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.suite()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 60)",
        "(line 52,col 9)-(line 52,col 40)",
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.expectedValue()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.expectedWeightedValue()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testNaN()",
      "begin_line": 73,
      "end_line": 78,
      "comment": "\n     * Make sure Double.NaN is returned iff n \u003d 0\n     *\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 56)",
        "(line 75,col 9)-(line 75,col 50)",
        "(line 76,col 9)-(line 76,col 26)",
        "(line 77,col 9)-(line 77,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testPopulation()",
      "begin_line": 83,
      "end_line": 98,
      "comment": "\n     * Test population version of variance\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 74)",
        "(line 85,col 9)-(line 85,col 44)",
        "(line 86,col 9)-(line 86,col 27)",
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 88,col 35)",
        "(line 89,col 9)-(line 89,col 77)",
        "(line 90,col 9)-(line 90,col 32)",
        "(line 91,col 9)-(line 91,col 72)",
        "(line 92,col 9)-(line 92,col 36)",
        "(line 93,col 9)-(line 93,col 72)",
        "(line 94,col 9)-(line 94,col 33)",
        "(line 95,col 9)-(line 95,col 77)",
        "(line 96,col 9)-(line 96,col 32)",
        "(line 97,col 9)-(line 97,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.populationVariance(double[])",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Definitional formula for population variance\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 45)",
        "(line 105,col 9)-(line 105,col 23)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testWeightedVariance()",
      "begin_line": 112,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 115,col 101)",
        "(line 118,col 9)-(line 119,col 101)",
        "(line 123,col 9)-(line 125,col 62)"
      ]
    }
  ]
}