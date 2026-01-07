{
  "filepath": "/tmp/Math-94b/src/test/org/apache/commons/math/stat/regression/OLSMultipleLinearRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OLSMultipleLinearRegressionTest",
      "is_interface": false,
      "parent_types": [
        "MultipleLinearRegressionAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 334,
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
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 61)",
        "(line 35,col 9)-(line 35,col 28)",
        "(line 36,col 9)-(line 36,col 48)",
        "(line 37,col 9)-(line 37,col 50)",
        "(line 38,col 9)-(line 38,col 50)",
        "(line 39,col 9)-(line 39,col 50)",
        "(line 40,col 9)-(line 40,col 50)",
        "(line 41,col 9)-(line 41,col 50)",
        "(line 42,col 9)-(line 42,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.createRegression()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 83)",
        "(line 47,col 9)-(line 47,col 39)",
        "(line 48,col 9)-(line 48,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.getNumberOfRegressors()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.getSampleSize()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.cannotAddXSampleData()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.cannotAddNullYSampleData()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.cannotAddSampleDataWithSizeMismatch()",
      "begin_line": 69,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 44)",
        "(line 72,col 9)-(line 72,col 39)",
        "(line 73,col 9)-(line 73,col 36)",
        "(line 74,col 9)-(line 74,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testPerfectFit()",
      "begin_line": 77,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 69)",
        "(line 80,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 60)",
        "(line 84,col 9)-(line 85,col 29)",
        "(line 86,col 9)-(line 86,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testLongly()",
      "begin_line": 101,
      "end_line": 160,
      "comment": "\n     * Test Longley dataset against certified values provided by NIST.\n     * Data Source: J. Longley (1967) \"An Appraisal of Least Squares\n     * Programs for the Electronic Computer from the Point of View of the User\"\n     * Journal of the American Statistical Association, vol. 62. September,\n     * pp. 819-841.\n     * \n     * Certified values (and data) are from NIST:\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 122,col 10)",
        "(line 125,col 9)-(line 125,col 22)",
        "(line 126,col 9)-(line 126,col 22)",
        "(line 129,col 9)-(line 129,col 78)",
        "(line 130,col 9)-(line 130,col 49)",
        "(line 133,col 9)-(line 133,col 64)",
        "(line 134,col 9)-(line 138,col 42)",
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 149,col 28)",
        "(line 152,col 9)-(line 152,col 77)",
        "(line 153,col 9)-(line 159,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testSwissFertility()",
      "begin_line": 166,
      "end_line": 263,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     * Data Source: R datasets package\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 216,col 10)",
        "(line 219,col 9)-(line 219,col 22)",
        "(line 220,col 9)-(line 220,col 22)",
        "(line 223,col 9)-(line 223,col 78)",
        "(line 224,col 9)-(line 224,col 49)",
        "(line 227,col 9)-(line 227,col 64)",
        "(line 228,col 9)-(line 233,col 43)",
        "(line 236,col 9)-(line 236,col 55)",
        "(line 237,col 9)-(line 254,col 23)",
        "(line 257,col 9)-(line 257,col 77)",
        "(line 258,col 9)-(line 262,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegressionTest.testHat()",
      "begin_line": 270,
      "end_line": 333,
      "comment": "\n     * Test hat matrix computation\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 290,col 10)",
        "(line 292,col 9)-(line 292,col 22)",
        "(line 293,col 9)-(line 293,col 22)",
        "(line 296,col 9)-(line 296,col 78)",
        "(line 297,col 9)-(line 297,col 49)",
        "(line 299,col 9)-(line 299,col 46)",
        "(line 302,col 9)-(line 313,col 10)",
        "(line 316,col 9)-(line 316,col 18)",
        "(line 317,col 9)-(line 323,col 9)",
        "(line 329,col 9)-(line 329,col 55)",
        "(line 330,col 9)-(line 330,col 64)",
        "(line 331,col 9)-(line 331,col 79)",
        "(line 332,col 9)-(line 332,col 64)"
      ]
    }
  ]
}