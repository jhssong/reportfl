{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/optimization/fitting/ParametricGaussianFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParametricGaussianFunctionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 158,
      "comment": "\n * Tests {@link ParametricGaussianFunction}.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET1"
      ],
      "begin_line": 38,
      "end_line": 69,
      "comment": " Dataset 1 used by some test cases. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunctionTest.testFit01()",
      "begin_line": 77,
      "end_line": 88,
      "comment": "\n     * Using not-so-good initial parameters.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws MathUserException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 80)",
        "(line 81,col 9)-(line 81,col 50)",
        "(line 82,col 9)-(line 83,col 101)",
        "(line 84,col 9)-(line 84,col 61)",
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 86,col 61)",
        "(line 87,col 9)-(line 87,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunctionTest.testFit02()",
      "begin_line": 96,
      "end_line": 107,
      "comment": "\n     * Using eye-balled guesses for initial parameters.\n     *\n     * @throws OptimizationException in the event of a test case error\n     * @throws MathUserException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 80)",
        "(line 100,col 9)-(line 100,col 50)",
        "(line 101,col 9)-(line 102,col 97)",
        "(line 103,col 9)-(line 103,col 61)",
        "(line 104,col 9)-(line 104,col 61)",
        "(line 105,col 9)-(line 105,col 61)",
        "(line 106,col 9)-(line 106,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunctionTest.testValue01()",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * The parameters array is null.\n     *\n     * @throws MathUserException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 72)",
        "(line 117,col 9)-(line 117,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunctionTest.testValue02()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * The parameters array length is not 4.\n     *\n     * @throws MathUserException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 72)",
        "(line 128,col 9)-(line 128,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunctionTest.testValue03()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\n     * The parameters d is 0.\n     *\n     * @throws MathUserException in the event of a test case error\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 72)",
        "(line 139,col 9)-(line 139,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunctionTest.addDatasetToCurveFitter(double[][], org.apache.commons.math.optimization.fitting.CurveFitter)",
      "begin_line": 152,
      "end_line": 157,
      "comment": "\n     * Adds the specified points to specified \u003ccode\u003eCurveFitter\u003c/code\u003e instance.\n     *\n     * @param points data points where first dimension is a point index and\n     *        second dimension is an array of length two representing the point\n     *        with the first value corresponding to X and the second value\n     *        corresponding to Y\n     * @param fitter fitter to which the points in \u003ccode\u003epoints\u003c/code\u003e should be\n     *        added as observed points\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)"
      ]
    }
  ]
}