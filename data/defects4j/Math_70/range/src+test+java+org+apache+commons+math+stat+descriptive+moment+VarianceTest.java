{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/stat/descriptive/moment/VarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarianceTest",
      "is_interface": false,
      "parent_types": [
        "StorelessUnivariateStatisticAbstractTest"
      ],
      "begin_line": 28,
      "end_line": 120,
      "comment": "\n * Test cases for the {@link UnivariateStatistic} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stat"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.VarianceTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * @param name\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.getUnivariateStatistic()",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.expectedValue()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.expectedWeightedValue()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testNaN()",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n     * Make sure Double.NaN is returned iff n \u003d 0\n     *\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 56)",
        "(line 66,col 9)-(line 66,col 50)",
        "(line 67,col 9)-(line 67,col 26)",
        "(line 68,col 9)-(line 68,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testPopulation()",
      "begin_line": 74,
      "end_line": 89,
      "comment": "\n     * Test population version of variance\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 74)",
        "(line 76,col 9)-(line 76,col 44)",
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 78,col 37)",
        "(line 79,col 9)-(line 79,col 35)",
        "(line 80,col 9)-(line 80,col 77)",
        "(line 81,col 9)-(line 81,col 32)",
        "(line 82,col 9)-(line 82,col 72)",
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 72)",
        "(line 85,col 9)-(line 85,col 33)",
        "(line 86,col 9)-(line 86,col 77)",
        "(line 87,col 9)-(line 87,col 32)",
        "(line 88,col 9)-(line 88,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.populationVariance(double[])",
      "begin_line": 94,
      "end_line": 101,
      "comment": "\n     * Definitional formula for population variance\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 45)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.VarianceTest.testWeightedVariance()",
      "begin_line": 103,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 106,col 101)",
        "(line 109,col 9)-(line 110,col 101)",
        "(line 114,col 9)-(line 116,col 62)"
      ]
    }
  ]
}