{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/optimization/fitting/GaussianFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 314,
      "comment": "\n * Tests {@link GaussianFitter}.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET1"
      ],
      "begin_line": 36,
      "end_line": 67,
      "comment": " Good data. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET2"
      ],
      "begin_line": 69,
      "end_line": 101,
      "comment": " Poor data: right of peak not symmetric with left of peak. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET3"
      ],
      "begin_line": 103,
      "end_line": 150,
      "comment": " Poor data: long tails. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET4"
      ],
      "begin_line": 152,
      "end_line": 167,
      "comment": " Poor data: right of peak is missing. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET5"
      ],
      "begin_line": 169,
      "end_line": 182,
      "comment": " Good data, but few points. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit01()",
      "begin_line": 189,
      "end_line": 199,
      "comment": "\n     * Basic.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 86)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 194,col 52)",
        "(line 195,col 9)-(line 195,col 66)",
        "(line 196,col 9)-(line 196,col 66)",
        "(line 197,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 198,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit02()",
      "begin_line": 206,
      "end_line": 211,
      "comment": "\n     * Zero points is not enough observed points.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 86)",
        "(line 210,col 9)-(line 210,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit03()",
      "begin_line": 218,
      "end_line": 227,
      "comment": "\n     * Two points is not enough observed points.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 86)",
        "(line 222,col 9)-(line 225,col 20)",
        "(line 226,col 9)-(line 226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit04()",
      "begin_line": 234,
      "end_line": 244,
      "comment": "\n     * Poor data: right of peak not symmetric with left of peak.\n     *\n     * @throws OptimizationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 86)",
        "(line 238,col 9)-(line 238,col 53)",
        "(line 239,col 9)-(line 239,col 52)",
        "(line 240,col 9)-(line 240,col 66)",
        "(line 241,col 9)-(line 241,col 66)",
        "(line 242,col 9)-(line 242,col 66)",
        "(line 243,col 9)-(line 243,col 66)"
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
        "(line 256,col 9)-(line 256,col 52)",
        "(line 257,col 9)-(line 257,col 66)",
        "(line 258,col 9)-(line 258,col 66)",
        "(line 259,col 9)-(line 259,col 66)",
        "(line 260,col 9)-(line 260,col 66)"
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
        "(line 273,col 9)-(line 273,col 52)",
        "(line 274,col 9)-(line 274,col 66)",
        "(line 275,col 9)-(line 275,col 66)",
        "(line 276,col 9)-(line 276,col 66)",
        "(line 277,col 9)-(line 277,col 66)"
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
        "(line 290,col 9)-(line 290,col 52)",
        "(line 291,col 9)-(line 291,col 66)",
        "(line 292,col 9)-(line 292,col 66)",
        "(line 293,col 9)-(line 293,col 66)",
        "(line 294,col 9)-(line 294,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.addDatasetToGaussianFitter(double[][], org.apache.commons.math.optimization.fitting.GaussianFitter)",
      "begin_line": 308,
      "end_line": 313,
      "comment": "\n     * Adds the specified points to specified \u003ccode\u003eGaussianFitter\u003c/code\u003e\n     * instance.\n     *\n     * @param points data points where first dimension is a point index and\n     *        second dimension is an array of length two representing the point\n     *        with the first value corresponding to X and the second value\n     *        corresponding to Y\n     * @param fitter fitter to which the points in \u003ccode\u003epoints\u003c/code\u003e should be\n     *        added as observed points\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)"
      ]
    }
  ]
}