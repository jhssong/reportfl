{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/optimization/general/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarOptimizer"
      ],
      "begin_line": 42,
      "end_line": 250,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LINE_SEARCH_TOLERANCE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Defautl line search tolerance ({@value}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.PowellOptimizer()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Constructor using the default line search tolerance (see the\n     * {@link #PowellOptimizer(double) other constructor}).\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.PowellOptimizer(double)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @param lineSearchTolerance Relative error tolerance for the line search\n     * algorithm ({@link BrentOptimizer}).\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.doOptimize()",
      "begin_line": 70,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 44)",
        "(line 75,col 9)-(line 75,col 47)",
        "(line 76,col 9)-(line 76,col 35)",
        "(line 78,col 9)-(line 78,col 50)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 83,col 27)",
        "(line 84,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 85,col 32)",
        "(line 86,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.setNewPointAndDirection(double[], double[], double)",
      "begin_line": 162,
      "end_line": 170,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 31)",
        "(line 166,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 176,
      "end_line": 249,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optim"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n         * Optimizer.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "optimum"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n         * Value of the optimum.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "valueAtOptimum"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": "\n         * Value of the objective function at the optimum.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.LineSearch(double)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n         * @param tolerance Relative tolerance.\n         ",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 49)",
        "(line 199,col 13)-(line 199,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 208,
      "end_line": 235,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         ",
      "child_ranges": [
        "(line 211,col 13)-(line 234,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.Anonymous-9312f2fb-edf2-4606-95e9-4b073e007a54.value(double)",
      "begin_line": 214,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 29)-(line 217,col 61)",
        "(line 218,col 29)-(line 220,col 29)",
        "(line 221,col 29)-(line 221,col 60)"
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