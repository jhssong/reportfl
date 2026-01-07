{
  "filepath": "/tmp/Math-95b/src/test/org/apache/commons/math/stat/descriptive/StorelessUnivariateStatisticAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatisticAbstractTest",
      "is_interface": false,
      "parent_types": [
        "UnivariateStatisticAbstractTest"
      ],
      "begin_line": 26,
      "end_line": 162,
      "comment": "\n * Test cases for {@link StorelessUnivariateStatistic} classes.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.StorelessUnivariateStatisticAbstractTest(java.lang.String)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSamples"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Small sample arrays "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.getUnivariateStatistic()",
      "begin_line": 37,
      "end_line": 37,
      "comment": " Return a new instance of the statistic ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.expectedValue()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testIncrementation()",
      "begin_line": 43,
      "end_line": 62,
      "comment": " Verify that calling increment() in a loop over testArray results in correct state ",
      "child_ranges": [
        "(line 45,col 9)-(line 46,col 68)",
        "(line 48,col 9)-(line 48,col 26)",
        "(line 50,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 54,col 77)",
        "(line 55,col 9)-(line 55,col 57)",
        "(line 57,col 9)-(line 57,col 26)",
        "(line 59,col 9)-(line 59,col 56)",
        "(line 60,col 9)-(line 60,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerialization()",
      "begin_line": 64,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 68)",
        "(line 69,col 9)-(line 69,col 53)",
        "(line 71,col 9)-(line 71,col 26)",
        "(line 73,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 53)",
        "(line 81,col 9)-(line 81,col 77)",
        "(line 83,col 9)-(line 83,col 26)",
        "(line 85,col 9)-(line 85,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testEqualsAndHashCode()",
      "begin_line": 89,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 68)",
        "(line 92,col 9)-(line 92,col 55)",
        "(line 94,col 9)-(line 94,col 80)",
        "(line 95,col 9)-(line 95,col 71)",
        "(line 97,col 9)-(line 97,col 45)",
        "(line 98,col 9)-(line 98,col 77)",
        "(line 99,col 9)-(line 99,col 80)",
        "(line 100,col 9)-(line 101,col 50)",
        "(line 103,col 9)-(line 103,col 32)",
        "(line 104,col 9)-(line 104,col 72)",
        "(line 105,col 9)-(line 105,col 82)",
        "(line 106,col 9)-(line 106,col 82)",
        "(line 107,col 9)-(line 108,col 51)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 89)",
        "(line 112,col 9)-(line 113,col 61)",
        "(line 115,col 9)-(line 115,col 54)",
        "(line 116,col 9)-(line 116,col 98)",
        "(line 117,col 9)-(line 118,col 63)",
        "(line 120,col 9)-(line 120,col 55)",
        "(line 121,col 9)-(line 121,col 89)",
        "(line 122,col 9)-(line 123,col 61)",
        "(line 125,col 9)-(line 125,col 26)",
        "(line 126,col 9)-(line 126,col 27)",
        "(line 127,col 9)-(line 127,col 82)",
        "(line 128,col 9)-(line 129,col 50)",
        "(line 130,col 9)-(line 131,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testMomentSmallSamples()",
      "begin_line": 135,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 60)",
        "(line 137,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testConsistency()",
      "begin_line": 149,
      "end_line": 160,
      "comment": " \n     * Make sure that evaluate(double[]) and inrementAll(double[]), \n     * getResult() give same results.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 100)",
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 81)",
        "(line 153,col 9)-(line 159,col 9)"
      ]
    }
  ]
}