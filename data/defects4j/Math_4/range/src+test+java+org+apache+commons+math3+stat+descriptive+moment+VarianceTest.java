{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/descriptive/moment/VarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarianceTest",
      "is_interface": false,
      "parent_types": [
        "StorelessUnivariateStatisticAbstractTest"
      ],
      "begin_line": 30,
      "end_line": 118,
      "comment": "\n * Test cases for the {@link UnivariateStatistic} class.\n *\n * @version $Id$\n "
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
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.VarianceTest.getUnivariateStatistic()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.VarianceTest.expectedValue()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.VarianceTest.expectedWeightedValue()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.VarianceTest.testNaN()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * Make sure Double.NaN is returned iff n \u003d 0\n     *\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 56)",
        "(line 62,col 9)-(line 62,col 57)",
        "(line 63,col 9)-(line 63,col 26)",
        "(line 64,col 9)-(line 64,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.VarianceTest.testPopulation()",
      "begin_line": 70,
      "end_line": 86,
      "comment": "\n     * Test population version of variance\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 74)",
        "(line 73,col 9)-(line 73,col 44)",
        "(line 74,col 9)-(line 74,col 27)",
        "(line 75,col 9)-(line 75,col 37)",
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 77,col 84)",
        "(line 78,col 9)-(line 78,col 32)",
        "(line 79,col 9)-(line 79,col 79)",
        "(line 80,col 9)-(line 80,col 36)",
        "(line 81,col 9)-(line 81,col 79)",
        "(line 82,col 9)-(line 82,col 33)",
        "(line 83,col 9)-(line 83,col 84)",
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 85,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.VarianceTest.populationVariance(double[])",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\n     * Definitional formula for population variance\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 45)",
        "(line 93,col 9)-(line 93,col 23)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.VarianceTest.testWeightedVariance()",
      "begin_line": 100,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 104,col 101)",
        "(line 107,col 9)-(line 108,col 101)",
        "(line 112,col 9)-(line 114,col 62)"
      ]
    }
  ]
}