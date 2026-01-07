{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/general/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarOptimizer"
      ],
      "begin_line": 41,
      "end_line": 289,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LS_RELATIVE_TOLERANCE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Default relative tolerance for line search ({@value}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LS_ABSOLUTE_TOLERANCE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Default absolute tolerance for line search ({@value}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.PowellOptimizer()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructor with default line search tolerances (see the\n     * {@link #PowellOptimizer(double,double) other constructor}).\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 62,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.PowellOptimizer(double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructor with default absolute line search tolerances (see\n     * the {@link #PowellOptimizer(double,double) other constructor}).\n     *\n     * @param lsRelativeTolerance Relative error tolerance for\n     * the line search algorithm ({@link BrentOptimizer}).\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * @param lsRelativeTolerance Relative error tolerance for\n     * the line search algorithm ({@link BrentOptimizer}).\n     * @param lsAbsoluteTolerance Relative error tolerance for\n     * the line search algorithm ({@link BrentOptimizer}).\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.doOptimize()",
      "begin_line": 90,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 95,col 47)",
        "(line 96,col 9)-(line 96,col 35)",
        "(line 98,col 9)-(line 98,col 50)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 47)",
        "(line 105,col 9)-(line 105,col 32)",
        "(line 106,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 185,
      "end_line": 197,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 31)",
        "(line 189,col 9)-(line 189,col 51)",
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 203,
      "end_line": 288,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optim"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": "\n         * Optimizer.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "optimum"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": "\n         * Value of the optimum.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "valueAtOptimum"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": "\n         * Value of the objective function at the optimum.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 225,
      "end_line": 229,
      "comment": "\n         * @param relativeTolerance Relative tolerance.\n         * @param absoluteTolerance Absolute tolerance.\n         ",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 57)",
        "(line 228,col 13)-(line 228,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 239,
      "end_line": 274,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @throws OptimizationException if function cannot be evaluated at some test point\n         * or algorithm fails to converge\n         ",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 33)",
        "(line 245,col 13)-(line 245,col 40)",
        "(line 247,col 13)-(line 273,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.Anonymous-bb9ba132-98fe-4fcf-abfc-cacb57f72f7c.value(double)",
      "begin_line": 250,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 253,col 29)-(line 253,col 61)",
        "(line 254,col 29)-(line 256,col 29)",
        "(line 257,col 29)-(line 257,col 72)",
        "(line 258,col 29)-(line 258,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.getOptimum()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n         * @return the optimum.\n         ",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch.getValueAtOptimum()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n         * @return the value of the function at the optimum.\n         ",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 34)"
      ]
    }
  ]
}