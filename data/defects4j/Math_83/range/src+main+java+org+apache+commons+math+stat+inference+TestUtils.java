{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 414,
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
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 204,
      "end_line": 207,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 228,
      "end_line": 232,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 253,
      "end_line": 257,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 270,
      "end_line": 273,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 295,
      "end_line": 299,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 320,
      "end_line": 324,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 376,
      "end_line": 380,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaFValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 387,
      "end_line": 390,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaFValue(Collection)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaPValue(java.util.Collection\u003cdouble[]\u003e)",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaPValue(Collection)\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection\u003cdouble[]\u003e, double)",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.OneWayAnova#anovaTest(Collection,double)\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 58)"
      ]
    }
  ]
}