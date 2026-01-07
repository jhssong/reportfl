{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 335,
      "comment": "\n * A collection of static methods to create inference test instances or to\n * perform inference tests.\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "T_TEST"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Singleton TTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "CHI_SQUARE_TEST"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_DISTRIBUTION_CHI_SQUARE_TEST"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_WAY_ANANOVA"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Singleton OneWayAnova instance using default implementation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.TestUtils()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Prevent instantiation.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(double[], double[])",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 149,
      "end_line": 153,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 174,
      "end_line": 178,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 241,
      "end_line": 245,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 297,
      "end_line": 301,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 308,
      "end_line": 311,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaFValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaPValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaTest(Collection,double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 62)"
      ]
    }
  ]
}