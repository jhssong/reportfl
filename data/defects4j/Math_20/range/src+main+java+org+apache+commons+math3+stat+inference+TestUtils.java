{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 367,
      "comment": "\n * A collection of static methods to create inference test instances or to\n * perform inference tests.\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "T_TEST"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Singleton TTest instance. "
    },
    {
      "type": "field",
      "varNames": [
        "CHI_SQUARE_TEST"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Singleton ChiSquareTest instance. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_WAY_ANANOVA"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Singleton OneWayAnova instance. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.TestUtils()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Prevent instantiation.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticT(double[], double[])",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 185,
      "end_line": 190,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 253,
      "end_line": 257,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 281,
      "end_line": 285,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 301,
      "end_line": 305,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 312,
      "end_line": 317,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaFValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 347,
      "end_line": 351,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaPValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 358,
      "end_line": 363,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaTest(Collection,double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 62)"
      ]
    }
  ]
}