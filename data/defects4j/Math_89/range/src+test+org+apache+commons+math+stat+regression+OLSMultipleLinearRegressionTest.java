{
  "filepath": "/tmp/Math-89b/src/test/org/apache/commons/math/stat/regression/OLSMultipleLinearRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OLSMultipleLinearRegressionTest",
      "is_interface": false,
      "parent_types": [
        "MultipleLinearRegressionAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.setUp()",
      "begin_line": 32,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 61)",
        "(line 36,col 9)-(line 36,col 28)",
        "(line 37,col 9)-(line 37,col 48)",
        "(line 38,col 9)-(line 38,col 50)",
        "(line 39,col 9)-(line 39,col 50)",
        "(line 40,col 9)-(line 40,col 50)",
        "(line 41,col 9)-(line 41,col 50)",
        "(line 42,col 9)-(line 42,col 50)",
        "(line 43,col 9)-(line 43,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.createRegression()",
      "begin_line": 46,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 83)",
        "(line 49,col 9)-(line 49,col 39)",
        "(line 50,col 9)-(line 50,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.getNumberOfRegressors()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.getSampleSize()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.cannotAddXSampleData()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.cannotAddNullYSampleData()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.cannotAddSampleDataWithSizeMismatch()",
      "begin_line": 73,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 44)",
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testPerfectFit()",
      "begin_line": 81,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 69)",
        "(line 84,col 9)-(line 86,col 23)",
        "(line 87,col 9)-(line 87,col 60)",
        "(line 88,col 9)-(line 89,col 29)",
        "(line 90,col 9)-(line 90,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testLongly()",
      "begin_line": 105,
      "end_line": 164,
      "comment": "\n     * Test Longley dataset against certified values provided by NIST.\n     * Data Source: J. Longley (1967) \"An Appraisal of Least Squares\n     * Programs for the Electronic Computer from the Point of View of the User\"\n     * Journal of the American Statistical Association, vol. 62. September,\n     * pp. 819-841.\n     * \n     * Certified values (and data) are from NIST:\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 126,col 10)",
        "(line 129,col 9)-(line 129,col 22)",
        "(line 130,col 9)-(line 130,col 22)",
        "(line 133,col 9)-(line 133,col 78)",
        "(line 134,col 9)-(line 134,col 49)",
        "(line 137,col 9)-(line 137,col 64)",
        "(line 138,col 9)-(line 142,col 42)",
        "(line 145,col 9)-(line 145,col 55)",
        "(line 146,col 9)-(line 153,col 28)",
        "(line 156,col 9)-(line 156,col 77)",
        "(line 157,col 9)-(line 163,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testSwissFertility()",
      "begin_line": 170,
      "end_line": 267,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     * Data Source: R datasets package\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 220,col 10)",
        "(line 223,col 9)-(line 223,col 22)",
        "(line 224,col 9)-(line 224,col 22)",
        "(line 227,col 9)-(line 227,col 78)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 231,col 9)-(line 231,col 64)",
        "(line 232,col 9)-(line 237,col 43)",
        "(line 240,col 9)-(line 240,col 55)",
        "(line 241,col 9)-(line 258,col 23)",
        "(line 261,col 9)-(line 261,col 77)",
        "(line 262,col 9)-(line 266,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testHat()",
      "begin_line": 274,
      "end_line": 337,
      "comment": "\n     * Test hat matrix computation\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 294,col 10)",
        "(line 296,col 9)-(line 296,col 22)",
        "(line 297,col 9)-(line 297,col 22)",
        "(line 300,col 9)-(line 300,col 78)",
        "(line 301,col 9)-(line 301,col 49)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 306,col 9)-(line 317,col 10)",
        "(line 320,col 9)-(line 320,col 18)",
        "(line 321,col 9)-(line 327,col 9)",
        "(line 333,col 9)-(line 333,col 55)",
        "(line 334,col 9)-(line 334,col 64)",
        "(line 335,col 9)-(line 335,col 79)",
        "(line 336,col 9)-(line 336,col 64)"
      ]
    }
  ]
}