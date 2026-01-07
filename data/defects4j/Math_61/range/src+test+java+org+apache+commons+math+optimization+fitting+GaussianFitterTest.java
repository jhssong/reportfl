{
  "filepath": "/tmp/Math-61b/src/test/java/org/apache/commons/math/optimization/fitting/GaussianFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 321,
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
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n     * Basic.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws FunctionEvaluationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 86)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 52)",
        "(line 196,col 9)-(line 196,col 66)",
        "(line 197,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 198,col 66)",
        "(line 199,col 9)-(line 199,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit02()",
      "begin_line": 208,
      "end_line": 213,
      "comment": "\n     * Zero points is not enough observed points.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws FunctionEvaluationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 86)",
        "(line 212,col 9)-(line 212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit03()",
      "begin_line": 221,
      "end_line": 230,
      "comment": "\n     * Two points is not enough observed points.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws FunctionEvaluationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 86)",
        "(line 225,col 9)-(line 228,col 20)",
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit04()",
      "begin_line": 238,
      "end_line": 248,
      "comment": "\n     * Poor data: right of peak not symmetric with left of peak.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws FunctionEvaluationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 86)",
        "(line 242,col 9)-(line 242,col 53)",
        "(line 243,col 9)-(line 243,col 52)",
        "(line 244,col 9)-(line 244,col 66)",
        "(line 245,col 9)-(line 245,col 66)",
        "(line 246,col 9)-(line 246,col 66)",
        "(line 247,col 9)-(line 247,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit05()",
      "begin_line": 256,
      "end_line": 266,
      "comment": "\n     * Poor data: long tails.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws FunctionEvaluationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 86)",
        "(line 260,col 9)-(line 260,col 53)",
        "(line 261,col 9)-(line 261,col 52)",
        "(line 262,col 9)-(line 262,col 66)",
        "(line 263,col 9)-(line 263,col 66)",
        "(line 264,col 9)-(line 264,col 66)",
        "(line 265,col 9)-(line 265,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit06()",
      "begin_line": 274,
      "end_line": 284,
      "comment": "\n     * Poor data: right of peak is missing.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws FunctionEvaluationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 86)",
        "(line 278,col 9)-(line 278,col 53)",
        "(line 279,col 9)-(line 279,col 52)",
        "(line 280,col 9)-(line 280,col 66)",
        "(line 281,col 9)-(line 281,col 66)",
        "(line 282,col 9)-(line 282,col 66)",
        "(line 283,col 9)-(line 283,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.testFit07()",
      "begin_line": 292,
      "end_line": 302,
      "comment": "\n     * Basic with smaller dataset.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws FunctionEvaluationException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 86)",
        "(line 296,col 9)-(line 296,col 53)",
        "(line 297,col 9)-(line 297,col 52)",
        "(line 298,col 9)-(line 298,col 66)",
        "(line 299,col 9)-(line 299,col 66)",
        "(line 300,col 9)-(line 300,col 66)",
        "(line 301,col 9)-(line 301,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitterTest.addDatasetToGaussianFitter(double[][], org.apache.commons.math.optimization.fitting.GaussianFitter)",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n     * Adds the specified points to specified \u003ccode\u003eGaussianFitter\u003c/code\u003e\n     * instance.\n     *\n     * @param points data points where first dimension is a point index and\n     *        second dimension is an array of length two representing the point\n     *        with the first value corresponding to X and the second value\n     *        corresponding to Y\n     * @param fitter fitter to which the points in \u003ccode\u003epoints\u003c/code\u003e should be\n     *        added as observed points\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)"
      ]
    }
  ]
}