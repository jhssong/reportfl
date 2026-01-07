{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/stat/descriptive/StorelessUnivariateStatisticAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatisticAbstractTest",
      "is_interface": false,
      "parent_types": [
        "UnivariateStatisticAbstractTest"
      ],
      "begin_line": 26,
      "end_line": 210,
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
      "end_line": 38,
      "comment": " Return a new instance of the statistic ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.expectedValue()",
      "begin_line": 41,
      "end_line": 42,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testIncrementation()",
      "begin_line": 47,
      "end_line": 73,
      "comment": "\n     *  Verifies that increment() and incrementAll work properly.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 50,col 68)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 77)",
        "(line 58,col 9)-(line 58,col 57)",
        "(line 60,col 9)-(line 60,col 26)",
        "(line 63,col 9)-(line 63,col 42)",
        "(line 64,col 9)-(line 64,col 77)",
        "(line 65,col 9)-(line 65,col 57)",
        "(line 67,col 9)-(line 67,col 26)",
        "(line 70,col 9)-(line 70,col 56)",
        "(line 71,col 9)-(line 71,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerialization()",
      "begin_line": 75,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 78,col 68)",
        "(line 80,col 9)-(line 80,col 53)",
        "(line 82,col 9)-(line 82,col 26)",
        "(line 84,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 53)",
        "(line 92,col 9)-(line 92,col 77)",
        "(line 94,col 9)-(line 94,col 26)",
        "(line 96,col 9)-(line 96,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testEqualsAndHashCode()",
      "begin_line": 100,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 102,col 68)",
        "(line 103,col 9)-(line 103,col 55)",
        "(line 105,col 9)-(line 105,col 80)",
        "(line 106,col 9)-(line 106,col 71)",
        "(line 108,col 9)-(line 108,col 45)",
        "(line 109,col 9)-(line 109,col 77)",
        "(line 110,col 9)-(line 110,col 80)",
        "(line 111,col 9)-(line 112,col 50)",
        "(line 114,col 9)-(line 114,col 32)",
        "(line 115,col 9)-(line 115,col 72)",
        "(line 116,col 9)-(line 116,col 82)",
        "(line 117,col 9)-(line 117,col 82)",
        "(line 118,col 9)-(line 119,col 51)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 89)",
        "(line 123,col 9)-(line 124,col 61)",
        "(line 126,col 9)-(line 126,col 54)",
        "(line 127,col 9)-(line 127,col 98)",
        "(line 128,col 9)-(line 129,col 63)",
        "(line 131,col 9)-(line 131,col 55)",
        "(line 132,col 9)-(line 132,col 89)",
        "(line 133,col 9)-(line 134,col 61)",
        "(line 136,col 9)-(line 136,col 26)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 82)",
        "(line 139,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 142,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testMomentSmallSamples()",
      "begin_line": 146,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 60)",
        "(line 148,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testConsistency()",
      "begin_line": 160,
      "end_line": 171,
      "comment": "\n     * Make sure that evaluate(double[]) and inrementAll(double[]),\n     * getResult() give same results.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 100)",
        "(line 162,col 9)-(line 162,col 37)",
        "(line 163,col 9)-(line 163,col 81)",
        "(line 164,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testCopyConsistency()",
      "begin_line": 178,
      "end_line": 203,
      "comment": "\n     * Verifies that copied statistics remain equal to originals when\n     * incremented the same way.\n     *\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 181,col 68)",
        "(line 183,col 9)-(line 183,col 52)",
        "(line 186,col 9)-(line 186,col 68)",
        "(line 189,col 9)-(line 189,col 55)",
        "(line 190,col 9)-(line 190,col 32)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 194,col 9)-(line 194,col 43)",
        "(line 197,col 9)-(line 198,col 63)",
        "(line 199,col 9)-(line 200,col 63)",
        "(line 201,col 9)-(line 201,col 43)",
        "(line 202,col 9)-(line 202,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerial()",
      "begin_line": 205,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 207,col 68)",
        "(line 208,col 9)-(line 208,col 58)"
      ]
    }
  ]
}