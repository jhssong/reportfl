{
  "filepath": "/tmp/Math-93b/src/test/org/apache/commons/math/stat/descriptive/StorelessUnivariateStatisticAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatisticAbstractTest",
      "is_interface": false,
      "parent_types": [
        "UnivariateStatisticAbstractTest"
      ],
      "begin_line": 26,
      "end_line": 203,
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
      "begin_line": 45,
      "end_line": 71,
      "comment": " \n     *  Verifies that increment() and incrementAll work properly. \n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 68)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 55,col 9)-(line 55,col 77)",
        "(line 56,col 9)-(line 56,col 57)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 61,col 9)-(line 61,col 42)",
        "(line 62,col 9)-(line 62,col 77)",
        "(line 63,col 9)-(line 63,col 57)",
        "(line 65,col 9)-(line 65,col 26)",
        "(line 68,col 9)-(line 68,col 56)",
        "(line 69,col 9)-(line 69,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testSerialization()",
      "begin_line": 73,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 68)",
        "(line 78,col 9)-(line 78,col 53)",
        "(line 80,col 9)-(line 80,col 26)",
        "(line 82,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 53)",
        "(line 90,col 9)-(line 90,col 77)",
        "(line 92,col 9)-(line 92,col 26)",
        "(line 94,col 9)-(line 94,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testEqualsAndHashCode()",
      "begin_line": 98,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 100,col 68)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 103,col 9)-(line 103,col 80)",
        "(line 104,col 9)-(line 104,col 71)",
        "(line 106,col 9)-(line 106,col 45)",
        "(line 107,col 9)-(line 107,col 77)",
        "(line 108,col 9)-(line 108,col 80)",
        "(line 109,col 9)-(line 110,col 50)",
        "(line 112,col 9)-(line 112,col 32)",
        "(line 113,col 9)-(line 113,col 72)",
        "(line 114,col 9)-(line 114,col 82)",
        "(line 115,col 9)-(line 115,col 82)",
        "(line 116,col 9)-(line 117,col 51)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 120,col 89)",
        "(line 121,col 9)-(line 122,col 61)",
        "(line 124,col 9)-(line 124,col 54)",
        "(line 125,col 9)-(line 125,col 98)",
        "(line 126,col 9)-(line 127,col 63)",
        "(line 129,col 9)-(line 129,col 55)",
        "(line 130,col 9)-(line 130,col 89)",
        "(line 131,col 9)-(line 132,col 61)",
        "(line 134,col 9)-(line 134,col 26)",
        "(line 135,col 9)-(line 135,col 27)",
        "(line 136,col 9)-(line 136,col 82)",
        "(line 137,col 9)-(line 138,col 50)",
        "(line 139,col 9)-(line 140,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testMomentSmallSamples()",
      "begin_line": 144,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 60)",
        "(line 146,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testConsistency()",
      "begin_line": 158,
      "end_line": 169,
      "comment": " \n     * Make sure that evaluate(double[]) and inrementAll(double[]), \n     * getResult() give same results.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 100)",
        "(line 160,col 9)-(line 160,col 37)",
        "(line 161,col 9)-(line 161,col 81)",
        "(line 162,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatisticAbstractTest.testCopyConsistency()",
      "begin_line": 176,
      "end_line": 201,
      "comment": "\n     * Verifies that copied statistics remain equal to originals when\n     * incremented the same way.\n     *\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 179,col 68)",
        "(line 181,col 9)-(line 181,col 52)",
        "(line 184,col 9)-(line 184,col 77)",
        "(line 187,col 9)-(line 187,col 55)",
        "(line 188,col 9)-(line 188,col 63)",
        "(line 191,col 9)-(line 191,col 43)",
        "(line 192,col 9)-(line 192,col 43)",
        "(line 195,col 9)-(line 196,col 63)",
        "(line 197,col 9)-(line 198,col 63)",
        "(line 199,col 9)-(line 199,col 43)",
        "(line 200,col 9)-(line 200,col 43)"
      ]
    }
  ]
}