{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/optimization/general/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarOptimizer"
      ],
      "begin_line": 39,
      "end_line": 250,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LINE_SEARCH_TOLERANCE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Defautl line search tolerance ({@value}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.PowellOptimizer()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructor using the default line search tolerance (see the\n     * {@link #PowellOptimizer(double) other constructor}).\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.PowellOptimizer(double)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @param lineSearchTolerance Relative error tolerance for the line search\n     * algorithm ({@link BrentOptimizer}).\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.doOptimize()",
      "begin_line": 67,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 44)",
        "(line 72,col 9)-(line 72,col 47)",
        "(line 73,col 9)-(line 73,col 35)",
        "(line 75,col 9)-(line 75,col 50)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 27)",
        "(line 81,col 9)-(line 81,col 47)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.setNewPointAndDirection(double[], double[], double)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 31)",
        "(line 162,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 172,
      "end_line": 249,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optim"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n         * Optimizer.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "optimum"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n         * Value of the optimum.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "valueAtOptimum"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n         * Value of the objective function at the optimum.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.LineSearch(double)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n         * @param tolerance Relative tolerance.\n         ",
      "child_ranges": [
        "(line 194,col 13)-(line 194,col 49)",
        "(line 195,col 13)-(line 195,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 206,
      "end_line": 235,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @throws OptimizationException if function cannot be evaluated at some test point\n         * or algorithm fails to converge\n         ",
      "child_ranges": [
        "(line 209,col 13)-(line 234,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.Anonymous-7f3c1827-30c3-41df-bcc7-a9f8bee7c5cd.value(double)",
      "begin_line": 212,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 215,col 29)-(line 215,col 61)",
        "(line 216,col 29)-(line 218,col 29)",
        "(line 219,col 29)-(line 219,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.getOptimum()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n         * @return the optimum.\n         ",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.getValueAtOptimum()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n         * @return the value of the function at the optimum.\n         ",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 34)"
      ]
    }
  ]
}