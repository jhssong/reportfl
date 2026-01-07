{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 349,
      "comment": "\n * A collection of static methods to create inference test instances or to\n * perform inference tests.\n *\n * @since 1.1\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.TestUtils()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Prevent instantiation.\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tTest"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Singleton TTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "chiSquareTest"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "unknownDistributionChiSquareTest"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setChiSquareTest(org.apache.commons.math.stat.inference.TTest)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Set the (singleton) TTest instance.\n     * \n     * @param tTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getTTest()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Return a (singleton) TTest instance.  Does not create a new instance.\n     * \n     * @return a TTest instance\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setChiSquareTest(org.apache.commons.math.stat.inference.ChiSquareTest)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Set the (singleton) ChiSquareTest instance.\n     * \n     * @param chiSquareTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getChiSquareTest()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Return a (singleton) ChiSquareTest instance.  Does not create a new instance.\n     * \n     * @return a ChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setUnknownDistributionChiSquareTest(org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Set the (singleton) UnknownDistributionChiSquareTest instance.\n     * \n     * @param unknownDistributionChiSquareTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getUnknownDistributionChiSquareTest()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Return a (singleton) UnknownDistributionChiSquareTest instance.  Does not create a new instance.\n     * \n     * @return a UnknownDistributionChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(double[], double[])",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 159,
      "end_line": 163,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 225,
      "end_line": 229,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 258,
      "end_line": 262,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 267,
      "end_line": 271,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 325,
      "end_line": 328,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareDataSetsComparison(long[], long[])\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 342,
      "end_line": 346,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 109)"
      ]
    }
  ]
}