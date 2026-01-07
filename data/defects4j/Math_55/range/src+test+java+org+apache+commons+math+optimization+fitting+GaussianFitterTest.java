{
  "filepath": "/tmp/Math-55b/src/test/java/org/apache/commons/math/optimization/fitting/GaussianFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 359,
      "comment": "\n * Tests {@link GaussianFitter}.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET1"
      ],
      "begin_line": 35,
      "end_line": 66,
      "comment": " Good data. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET2"
      ],
      "begin_line": 68,
      "end_line": 100,
      "comment": " Poor data: right of peak not symmetric with left of peak. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET3"
      ],
      "begin_line": 102,
      "end_line": 149,
      "comment": " Poor data: long tails. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET4"
      ],
      "begin_line": 151,
      "end_line": 166,
      "comment": " Poor data: right of peak is missing. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET5"
      ],
      "begin_line": 168,
      "end_line": 181,
      "comment": " Good data, but few points. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit01()",
      "begin_line": 188,
      "end_line": 198,
      "comment": "\n     * Basic.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 86)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 195,col 9)-(line 195,col 69)",
        "(line 196,col 9)-(line 196,col 68)",
        "(line 197,col 9)-(line 197,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit02()",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * Zero points is not enough observed points.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 86)",
        "(line 209,col 9)-(line 209,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit03()",
      "begin_line": 217,
      "end_line": 226,
      "comment": "\n     * Two points is not enough observed points.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 86)",
        "(line 221,col 9)-(line 224,col 20)",
        "(line 225,col 9)-(line 225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit04()",
      "begin_line": 233,
      "end_line": 244,
      "comment": "\n     * Poor data: right of peak not symmetric with left of peak.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 86)",
        "(line 238,col 9)-(line 238,col 53)",
        "(line 239,col 9)-(line 239,col 43)",
        "(line 241,col 9)-(line 241,col 68)",
        "(line 242,col 9)-(line 242,col 70)",
        "(line 243,col 9)-(line 243,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit05()",
      "begin_line": 251,
      "end_line": 261,
      "comment": "\n     * Poor data: long tails.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 86)",
        "(line 255,col 9)-(line 255,col 53)",
        "(line 256,col 9)-(line 256,col 43)",
        "(line 258,col 9)-(line 258,col 69)",
        "(line 259,col 9)-(line 259,col 69)",
        "(line 260,col 9)-(line 260,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit06()",
      "begin_line": 268,
      "end_line": 278,
      "comment": "\n     * Poor data: right of peak is missing.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 86)",
        "(line 272,col 9)-(line 272,col 53)",
        "(line 273,col 9)-(line 273,col 43)",
        "(line 275,col 9)-(line 275,col 69)",
        "(line 276,col 9)-(line 276,col 70)",
        "(line 277,col 9)-(line 277,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit07()",
      "begin_line": 285,
      "end_line": 295,
      "comment": "\n     * Basic with smaller dataset.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 86)",
        "(line 289,col 9)-(line 289,col 53)",
        "(line 290,col 9)-(line 290,col 43)",
        "(line 292,col 9)-(line 292,col 68)",
        "(line 293,col 9)-(line 293,col 68)",
        "(line 294,col 9)-(line 294,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testMath519()",
      "begin_line": 297,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 330,col 10)",
        "(line 332,col 9)-(line 332,col 86)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 338,col 9)-(line 338,col 52)",
        "(line 339,col 9)-(line 339,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.addDatasetToGaussianFitter(double[][], org.apache.commons.math.optimization.fitting.GaussianFitter)",
      "begin_line": 353,
      "end_line": 358,
      "comment": "\n     * Adds the specified points to specified \u003ccode\u003eGaussianFitter\u003c/code\u003e\n     * instance.\n     *\n     * @param points data points where first dimension is a point index and\n     *        second dimension is an array of length two representing the point\n     *        with the first value corresponding to X and the second value\n     *        corresponding to Y\n     * @param fitter fitter to which the points in \u003ccode\u003epoints\u003c/code\u003e should be\n     *        added as observed points\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)"
      ]
    }
  ]
}