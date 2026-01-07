{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/descriptive/StorelessUnivariateStatisticAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatisticAbstractTest",
      "is_interface": false,
      "parent_types": [
        "UnivariateStatisticAbstractTest"
      ],
      "begin_line": 29,
      "end_line": 220,
      "comment": "\n * Test cases for {@link StorelessUnivariateStatistic} classes.\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.getUnivariateStatistic()",
      "begin_line": 36,
      "end_line": 37,
      "comment": " Return a new instance of the statistic ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.expectedValue()",
      "begin_line": 40,
      "end_line": 41,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testIncrementation()",
      "begin_line": 46,
      "end_line": 73,
      "comment": "\n     *  Verifies that increment() and incrementAll work properly.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 50,col 68)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 84)",
        "(line 58,col 9)-(line 58,col 64)",
        "(line 60,col 9)-(line 60,col 26)",
        "(line 63,col 9)-(line 63,col 42)",
        "(line 64,col 9)-(line 64,col 84)",
        "(line 65,col 9)-(line 65,col 64)",
        "(line 67,col 9)-(line 67,col 26)",
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 71,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.checkClearValue(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerialization()",
      "begin_line": 79,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 83,col 68)",
        "(line 85,col 9)-(line 85,col 53)",
        "(line 87,col 9)-(line 87,col 26)",
        "(line 89,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 53)",
        "(line 97,col 9)-(line 97,col 84)",
        "(line 99,col 9)-(line 99,col 26)",
        "(line 101,col 9)-(line 101,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testEqualsAndHashCode()",
      "begin_line": 105,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 68)",
        "(line 109,col 9)-(line 109,col 55)",
        "(line 111,col 9)-(line 111,col 87)",
        "(line 112,col 9)-(line 112,col 78)",
        "(line 114,col 9)-(line 114,col 45)",
        "(line 115,col 9)-(line 115,col 77)",
        "(line 116,col 9)-(line 116,col 87)",
        "(line 117,col 9)-(line 118,col 50)",
        "(line 120,col 9)-(line 120,col 32)",
        "(line 121,col 9)-(line 121,col 79)",
        "(line 122,col 9)-(line 122,col 89)",
        "(line 123,col 9)-(line 123,col 89)",
        "(line 124,col 9)-(line 125,col 51)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 96)",
        "(line 129,col 9)-(line 130,col 61)",
        "(line 132,col 9)-(line 132,col 54)",
        "(line 133,col 9)-(line 133,col 105)",
        "(line 134,col 9)-(line 135,col 63)",
        "(line 137,col 9)-(line 137,col 55)",
        "(line 138,col 9)-(line 138,col 96)",
        "(line 139,col 9)-(line 140,col 61)",
        "(line 142,col 9)-(line 142,col 26)",
        "(line 143,col 9)-(line 143,col 27)",
        "(line 144,col 9)-(line 144,col 89)",
        "(line 145,col 9)-(line 146,col 50)",
        "(line 147,col 9)-(line 148,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testMomentSmallSamples()",
      "begin_line": 152,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 60)",
        "(line 155,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testConsistency()",
      "begin_line": 167,
      "end_line": 179,
      "comment": "\n     * Make sure that evaluate(double[]) and inrementAll(double[]),\n     * getResult() give same results.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 100)",
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 171,col 88)",
        "(line 172,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testCopyConsistency()",
      "begin_line": 186,
      "end_line": 212,
      "comment": "\n     * Verifies that copied statistics remain equal to originals when\n     * incremented the same way.\n     *\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 190,col 68)",
        "(line 192,col 9)-(line 192,col 52)",
        "(line 195,col 9)-(line 195,col 76)",
        "(line 198,col 9)-(line 198,col 55)",
        "(line 199,col 9)-(line 199,col 32)",
        "(line 202,col 9)-(line 202,col 50)",
        "(line 203,col 9)-(line 203,col 50)",
        "(line 206,col 9)-(line 207,col 63)",
        "(line 208,col 9)-(line 209,col 63)",
        "(line 210,col 9)-(line 210,col 50)",
        "(line 211,col 9)-(line 211,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerial()",
      "begin_line": 214,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 217,col 68)",
        "(line 218,col 9)-(line 218,col 65)"
      ]
    }
  ]
}