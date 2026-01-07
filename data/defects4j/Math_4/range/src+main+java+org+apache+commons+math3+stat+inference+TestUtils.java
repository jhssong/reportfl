{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 454,
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
      "type": "field",
      "varNames": [
        "G_TEST"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Singleton G-Test instance. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.TestUtils()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Prevent instantiation.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticT(double[], double[])",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.t(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#t(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 188,
      "end_line": 193,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 217,
      "end_line": 221,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.TTest#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 256,
      "end_line": 260,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 265,
      "end_line": 270,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 275,
      "end_line": 279,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 284,
      "end_line": 288,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 293,
      "end_line": 297,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 304,
      "end_line": 308,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 327,
      "end_line": 333,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaFValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 350,
      "end_line": 354,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaPValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 361,
      "end_line": 366,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaTest(Collection,double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.g(double[], long[])",
      "begin_line": 372,
      "end_line": 376,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#g(double[], long[])\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.gTest(double[], long[])",
      "begin_line": 382,
      "end_line": 386,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#gTest( double[],  long[] )\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.gTestIntrinsic(double[], long[])",
      "begin_line": 392,
      "end_line": 396,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#gTestIntrinsic(double[], long[] )\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.gTest(double[], long[], double)",
      "begin_line": 402,
      "end_line": 407,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#gTest( double[],long[],double)\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.gDataSetsComparison(long[], long[])",
      "begin_line": 413,
      "end_line": 417,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#gDataSetsComparison(long[], long[])\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.rootLogLikelihoodRatio(long, long, long, long)",
      "begin_line": 423,
      "end_line": 426,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#rootLogLikelihoodRatio(long, long, long, long)\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.gTestDataSetsComparison(long[], long[])",
      "begin_line": 433,
      "end_line": 438,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#gTestDataSetsComparison(long[], long[])\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.inference.TestUtils.gTestDataSetsComparison(long[], long[], double)",
      "begin_line": 444,
      "end_line": 450,
      "comment": "\n     * @see org.apache.commons.math3.stat.inference.GTest#gTestDataSetsComparison(long[],long[],double)\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 75)"
      ]
    }
  ]
}