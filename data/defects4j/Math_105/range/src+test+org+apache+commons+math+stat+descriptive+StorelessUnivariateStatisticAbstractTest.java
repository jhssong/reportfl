{
  "filepath": "/tmp/Math-105b/src/test/org/apache/commons/math/stat/descriptive/StorelessUnivariateStatisticAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatisticAbstractTest",
      "is_interface": false,
      "parent_types": [
        "UnivariateStatisticAbstractTest"
      ],
      "begin_line": 25,
      "end_line": 161,
      "comment": "\n * Test cases for {@link StorelessUnivariateStatistic} classes.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.StorelessUnivariateStatisticAbstractTest(java.lang.String)",
      "begin_line": 28,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSamples"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Small sample arrays "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.getUnivariateStatistic()",
      "begin_line": 36,
      "end_line": 36,
      "comment": " Return a new instance of the statistic ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.expectedValue()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testIncrementation()",
      "begin_line": 42,
      "end_line": 61,
      "comment": " Verify that calling increment() in a loop over testArray results in correct state ",
      "child_ranges": [
        "(line 44,col 9)-(line 45,col 68)",
        "(line 47,col 9)-(line 47,col 26)",
        "(line 49,col 9)-(line 51,col 9)",
        "(line 53,col 9)-(line 53,col 77)",
        "(line 54,col 9)-(line 54,col 57)",
        "(line 56,col 9)-(line 56,col 26)",
        "(line 58,col 9)-(line 58,col 56)",
        "(line 59,col 9)-(line 59,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerialization()",
      "begin_line": 63,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 66,col 68)",
        "(line 68,col 9)-(line 68,col 53)",
        "(line 70,col 9)-(line 70,col 26)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 53)",
        "(line 80,col 9)-(line 80,col 77)",
        "(line 82,col 9)-(line 82,col 26)",
        "(line 84,col 9)-(line 84,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testEqualsAndHashCode()",
      "begin_line": 88,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 90,col 68)",
        "(line 91,col 9)-(line 91,col 55)",
        "(line 93,col 9)-(line 93,col 80)",
        "(line 94,col 9)-(line 94,col 71)",
        "(line 96,col 9)-(line 96,col 45)",
        "(line 97,col 9)-(line 97,col 77)",
        "(line 98,col 9)-(line 98,col 80)",
        "(line 99,col 9)-(line 100,col 50)",
        "(line 102,col 9)-(line 102,col 32)",
        "(line 103,col 9)-(line 103,col 72)",
        "(line 104,col 9)-(line 104,col 82)",
        "(line 105,col 9)-(line 105,col 82)",
        "(line 106,col 9)-(line 107,col 51)",
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 89)",
        "(line 111,col 9)-(line 112,col 61)",
        "(line 114,col 9)-(line 114,col 54)",
        "(line 115,col 9)-(line 115,col 98)",
        "(line 116,col 9)-(line 117,col 63)",
        "(line 119,col 9)-(line 119,col 55)",
        "(line 120,col 9)-(line 120,col 89)",
        "(line 121,col 9)-(line 122,col 61)",
        "(line 124,col 9)-(line 124,col 26)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 126,col 9)-(line 126,col 82)",
        "(line 127,col 9)-(line 128,col 50)",
        "(line 129,col 9)-(line 130,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testMomentSmallSamples()",
      "begin_line": 134,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 60)",
        "(line 136,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testConsistency()",
      "begin_line": 148,
      "end_line": 159,
      "comment": " \n     * Make sure that evaluate(double[]) and inrementAll(double[]), \n     * getResult() give same results.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 100)",
        "(line 150,col 9)-(line 150,col 37)",
        "(line 151,col 9)-(line 151,col 81)",
        "(line 152,col 9)-(line 158,col 9)"
      ]
    }
  ]
}