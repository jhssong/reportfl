{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 415,
      "comment": "\n * A collection of static methods to create inference test instances or to\n * perform inference tests.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "tTest"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Singleton TTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "chiSquareTest"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "unknownDistributionChiSquareTest"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": " Singleton ChiSquareTest instance using default implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "oneWayAnova"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": " Singleton OneWayAnova instance using default implementation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.TestUtils()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Prevent instantiation.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setChiSquareTest(org.apache.commons.math.stat.inference.TTest)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Set the (singleton) TTest instance.\n     *\n     * @param chiSquareTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getTTest()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Return a (singleton) TTest instance.  Does not create a new instance.\n     *\n     * @return a TTest instance\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setChiSquareTest(org.apache.commons.math.stat.inference.ChiSquareTest)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Set the (singleton) ChiSquareTest instance.\n     *\n     * @param chiSquareTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getChiSquareTest()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Return a (singleton) ChiSquareTest instance.  Does not create a new instance.\n     *\n     * @return a ChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setUnknownDistributionChiSquareTest(org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Set the (singleton) UnknownDistributionChiSquareTest instance.\n     *\n     * @param unknownDistributionChiSquareTest the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getUnknownDistributionChiSquareTest()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Return a (singleton) UnknownDistributionChiSquareTest instance.  Does not create a new instance.\n     *\n     * @return a UnknownDistributionChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.setOneWayAnova(org.apache.commons.math.stat.inference.OneWayAnova)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Set the (singleton) OneWayAnova instance\n     *\n     * @param oneWayAnova the new instance to use\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getOneWayAnova()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Return a (singleton) OneWayAnova instance.  Does not create a new instance.\n     *\n     * @return a OneWayAnova instance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(double[], double[])",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 145,
      "end_line": 149,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 171,
      "end_line": 175,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 229,
      "end_line": 233,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 254,
      "end_line": 258,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 263,
      "end_line": 266,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 287,
      "end_line": 291,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 296,
      "end_line": 300,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 321,
      "end_line": 325,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 330,
      "end_line": 333,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 346,
      "end_line": 349,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 366,
      "end_line": 369,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 377,
      "end_line": 381,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 388,
      "end_line": 391,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaFValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 398,
      "end_line": 401,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaPValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 408,
      "end_line": 411,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaTest(Collection,double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 58)"
      ]
    }
  ]
}