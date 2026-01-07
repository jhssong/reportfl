{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/direct/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 51,
      "end_line": 287,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define custom convergence criteria by calling a {@link\n * #setConvergenceChecker(ConvergenceChecker) setConvergenceChecker}\n * prior to using the optimizer.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 80,
      "end_line": 97,
      "comment": "\n     * The arguments control the behaviour of the default convergence\n     * checking procedure.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 32)",
        "(line 89,col 9)-(line 89,col 32)",
        "(line 93,col 9)-(line 93,col 35)",
        "(line 94,col 9)-(line 94,col 80)",
        "(line 95,col 9)-(line 95,col 80)",
        "(line 96,col 9)-(line 96,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.setMaxEvaluations(int)",
      "begin_line": 100,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 48)",
        "(line 108,col 9)-(line 108,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.doOptimize()",
      "begin_line": 112,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 44)",
        "(line 116,col 9)-(line 116,col 47)",
        "(line 117,col 9)-(line 117,col 35)",
        "(line 119,col 9)-(line 119,col 50)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 125,col 38)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 128,col 9)-(line 128,col 47)",
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 21)",
        "(line 131,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 220,
      "end_line": 232,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 31)",
        "(line 224,col 9)-(line 224,col 51)",
        "(line 225,col 9)-(line 225,col 38)",
        "(line 226,col 9)-(line 226,col 38)",
        "(line 227,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BrentOptimizer"
      ],
      "begin_line": 238,
      "end_line": 286,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 264,
      "end_line": 285,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws FunctionEvaluationException if the function evaluation\n         * fails.\n         * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         ",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 35)",
        "(line 269,col 13)-(line 279,col 18)",
        "(line 281,col 13)-(line 281,col 69)",
        "(line 282,col 13)-(line 282,col 42)",
        "(line 283,col 13)-(line 284,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.Anonymous-4ade0c77-b35e-4e97-b1f0-22fc9002adfe.value(double)",
      "begin_line": 270,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 272,col 25)-(line 272,col 57)",
        "(line 273,col 25)-(line 275,col 25)",
        "(line 276,col 25)-(line 276,col 89)",
        "(line 277,col 25)-(line 277,col 35)"
      ]
    }
  ]
}