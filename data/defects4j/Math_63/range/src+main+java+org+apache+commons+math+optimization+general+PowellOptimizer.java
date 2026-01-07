{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarOptimizer"
      ],
      "begin_line": 45,
      "end_line": 241,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The user is responsible for calling {@link\n * #setConvergenceChecker(ConvergenceChecker) ConvergenceChecker}\n * prior to using the optimizer.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 59,
      "end_line": 68,
      "comment": "\n     * Set the convergence checker.\n     * It also indirectly sets the line search tolerances to the square-root\n     * of the correponding tolerances in the checker.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 45)",
        "(line 64,col 9)-(line 64,col 35)",
        "(line 65,col 9)-(line 65,col 87)",
        "(line 66,col 9)-(line 66,col 87)",
        "(line 67,col 9)-(line 67,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.setMaxEvaluations(int)",
      "begin_line": 71,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 48)",
        "(line 79,col 9)-(line 79,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.doOptimize()",
      "begin_line": 83,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 44)",
        "(line 87,col 9)-(line 87,col 47)",
        "(line 88,col 9)-(line 88,col 35)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 27)",
        "(line 96,col 9)-(line 96,col 47)",
        "(line 97,col 9)-(line 97,col 32)",
        "(line 98,col 9)-(line 98,col 21)",
        "(line 99,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 178,
      "end_line": 190,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 31)",
        "(line 182,col 9)-(line 182,col 51)",
        "(line 183,col 9)-(line 183,col 38)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BrentOptimizer"
      ],
      "begin_line": 196,
      "end_line": 240,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "optimum"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n         * Value of the optimum.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 217,
      "end_line": 239,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws FunctionEvaluationException if the function evaluation\n         * fails.\n         * @throws TooManyEvaluationsException if the number of evaluations is\n         * exceeded.\n         ",
      "child_ranges": [
        "(line 221,col 13)-(line 221,col 35)",
        "(line 222,col 13)-(line 233,col 18)",
        "(line 235,col 13)-(line 235,col 69)",
        "(line 236,col 13)-(line 236,col 42)",
        "(line 237,col 13)-(line 238,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.Anonymous-070d0610-abf7-4817-ada6-ca08d90532af.value(double)",
      "begin_line": 223,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 226,col 25)-(line 226,col 57)",
        "(line 227,col 25)-(line 229,col 25)",
        "(line 230,col 25)-(line 230,col 89)",
        "(line 231,col 25)-(line 231,col 35)"
      ]
    }
  ]
}