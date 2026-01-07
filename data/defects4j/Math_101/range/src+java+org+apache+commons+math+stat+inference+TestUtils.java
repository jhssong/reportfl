{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 410,
      "comment": "\n * A collection of static methods to create inference test instances or to\n * perform inference tests.\n *\n * @since 1.1\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.TestUtils()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Prevent instantiation.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tTest"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Singleton TTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "chiSquareTest"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "unknownDistributionChiSquareTest"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "oneWayAnova"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": " Singleton OneWayAnova instance using default implementation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setChiSquareTest(org.apache.commons.math.stat.inference.TTest)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Set the (singleton) TTest instance.\n     * \n     * @param tTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getTTest()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Return a (singleton) TTest instance.  Does not create a new instance.\n     * \n     * @return a TTest instance\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setChiSquareTest(org.apache.commons.math.stat.inference.ChiSquareTest)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Set the (singleton) ChiSquareTest instance.\n     * \n     * @param chiSquareTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getChiSquareTest()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Return a (singleton) ChiSquareTest instance.  Does not create a new instance.\n     * \n     * @return a ChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setUnknownDistributionChiSquareTest(org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Set the (singleton) UnknownDistributionChiSquareTest instance.\n     * \n     * @param unknownDistributionChiSquareTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getUnknownDistributionChiSquareTest()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Return a (singleton) UnknownDistributionChiSquareTest instance.  Does not create a new instance.\n     * \n     * @return a UnknownDistributionChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setOneWayAnova(org.apache.commons.math.stat.inference.OneWayAnova)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Set the (singleton) OneWayAnova instance\n     * \n     * @param oneWayAnova the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getOneWayAnova()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Return a (singleton) OneWayAnova instance.  Does not create a new instance.\n     * \n     * @return a OneWayAnova instance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(double[], double[])",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 185,
      "end_line": 189,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 251,
      "end_line": 255,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 284,
      "end_line": 288,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 293,
      "end_line": 297,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 318,
      "end_line": 322,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 343,
      "end_line": 346,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 353,
      "end_line": 356,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 363,
      "end_line": 366,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 374,
      "end_line": 378,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaFValue(java.util.Collection)",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaFValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaPValue(java.util.Collection)",
      "begin_line": 395,
      "end_line": 398,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaPValue(Collection)\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection, double)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaTest(Collection,double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 58)"
      ]
    }
  ]
}