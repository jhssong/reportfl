{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/inference/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 278,
      "comment": "\n * A collection of static methods to create inference test instances or to\n * perform inference tests.\n *\n * @since 1.1\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.TestUtils()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Prevent instantiation.\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tTest"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Singleton TTest instance initialized using configured factory "
    },
    {
      "type": "field",
      "varNames": [
        "chiSquareTest"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": " Singleton ChiSquareTest instance initialized using configured factory "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getTTest()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Return a (singleton) TTest instance.  Does not create a new instance.\n     * \n     * @return a TTest instance\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.getChiSquareTest()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Return a (singleton) ChiSquareTest instance.  Does not create a new instance.\n     * \n     * @return a ChiSquareTest instance\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(double[], double[])",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(double[], double[])\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[], double)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(double[], double[])",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedT(double[], double[])",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedT(double[], double[])\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[], double)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.pairedTTest(double[], double[])",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#pairedTTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, double[])",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, double[])\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(double[], double[])",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(double[], double[])\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 156,
      "end_line": 160,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#t(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[], double)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[], double)\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, double[])",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, double[])\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[], double)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[], double)\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(double[], double[])",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(double[], double[])\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)",
      "begin_line": 223,
      "end_line": 227,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.TTest#tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary)\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(double[], long[])",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(double[], long[])\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquare(long[][])",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquare(long[][])\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[], double)",
      "begin_line": 248,
      "end_line": 252,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(double[], long[])",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][], double)",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.TestUtils.chiSquareTest(long[][])",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * @see org.apache.commons.math.stat.inference.ChiSquareTest#chiSquareTest(long[][])\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 52)"
      ]
    }
  ]
}