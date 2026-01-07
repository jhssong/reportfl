{
  "filepath": "/tmp/Math-63b/src/test/java/org/apache/commons/math/stat/descriptive/StorelessUnivariateStatisticAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatisticAbstractTest",
      "is_interface": false,
      "parent_types": [
        "UnivariateStatisticAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 211,
      "comment": "\n * Test cases for {@link StorelessUnivariateStatistic} classes.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.StorelessUnivariateStatisticAbstractTest(java.lang.String)",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSamples"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Small sample arrays "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.getUnivariateStatistic()",
      "begin_line": 38,
      "end_line": 39,
      "comment": " Return a new instance of the statistic ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.expectedValue()",
      "begin_line": 42,
      "end_line": 43,
      "comment": "Expected value for  the testArray defined in UnivariateStatisticAbstractTest ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testIncrementation()",
      "begin_line": 48,
      "end_line": 74,
      "comment": "\n     *  Verifies that increment() and incrementAll work properly.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 51,col 68)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 77)",
        "(line 59,col 9)-(line 59,col 57)",
        "(line 61,col 9)-(line 61,col 26)",
        "(line 64,col 9)-(line 64,col 42)",
        "(line 65,col 9)-(line 65,col 77)",
        "(line 66,col 9)-(line 66,col 57)",
        "(line 68,col 9)-(line 68,col 26)",
        "(line 71,col 9)-(line 71,col 56)",
        "(line 72,col 9)-(line 72,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerialization()",
      "begin_line": 76,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 68)",
        "(line 81,col 9)-(line 81,col 53)",
        "(line 83,col 9)-(line 83,col 26)",
        "(line 85,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 53)",
        "(line 93,col 9)-(line 93,col 77)",
        "(line 95,col 9)-(line 95,col 26)",
        "(line 97,col 9)-(line 97,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testEqualsAndHashCode()",
      "begin_line": 101,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 68)",
        "(line 104,col 9)-(line 104,col 55)",
        "(line 106,col 9)-(line 106,col 80)",
        "(line 107,col 9)-(line 107,col 71)",
        "(line 109,col 9)-(line 109,col 45)",
        "(line 110,col 9)-(line 110,col 77)",
        "(line 111,col 9)-(line 111,col 80)",
        "(line 112,col 9)-(line 113,col 50)",
        "(line 115,col 9)-(line 115,col 32)",
        "(line 116,col 9)-(line 116,col 72)",
        "(line 117,col 9)-(line 117,col 82)",
        "(line 118,col 9)-(line 118,col 82)",
        "(line 119,col 9)-(line 120,col 51)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 89)",
        "(line 124,col 9)-(line 125,col 61)",
        "(line 127,col 9)-(line 127,col 54)",
        "(line 128,col 9)-(line 128,col 98)",
        "(line 129,col 9)-(line 130,col 63)",
        "(line 132,col 9)-(line 132,col 55)",
        "(line 133,col 9)-(line 133,col 89)",
        "(line 134,col 9)-(line 135,col 61)",
        "(line 137,col 9)-(line 137,col 26)",
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 82)",
        "(line 140,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 143,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testMomentSmallSamples()",
      "begin_line": 147,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 60)",
        "(line 149,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testConsistency()",
      "begin_line": 161,
      "end_line": 172,
      "comment": "\n     * Make sure that evaluate(double[]) and inrementAll(double[]),\n     * getResult() give same results.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 100)",
        "(line 163,col 9)-(line 163,col 37)",
        "(line 164,col 9)-(line 164,col 81)",
        "(line 165,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testCopyConsistency()",
      "begin_line": 179,
      "end_line": 204,
      "comment": "\n     * Verifies that copied statistics remain equal to originals when\n     * incremented the same way.\n     *\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 182,col 68)",
        "(line 184,col 9)-(line 184,col 52)",
        "(line 187,col 9)-(line 187,col 76)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 191,col 9)-(line 191,col 32)",
        "(line 194,col 9)-(line 194,col 43)",
        "(line 195,col 9)-(line 195,col 43)",
        "(line 198,col 9)-(line 199,col 63)",
        "(line 200,col 9)-(line 201,col 63)",
        "(line 202,col 9)-(line 202,col 43)",
        "(line 203,col 9)-(line 203,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerial()",
      "begin_line": 206,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 208,col 68)",
        "(line 209,col 9)-(line 209,col 58)"
      ]
    }
  ]
}