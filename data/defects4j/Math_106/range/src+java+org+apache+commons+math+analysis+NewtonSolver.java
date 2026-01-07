{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/analysis/NewtonSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NewtonSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 31,
      "end_line": 114,
      "comment": "\n * Implements \u003ca href\u003d\"http://mathworld.wolfram.com/NewtonsMethod.html\"\u003e\n * Newton\u0027s Method\u003c/a\u003e for finding zeros of real univariate functions. \n * \u003cp\u003e \n * The function should be continuous but not necessarily smooth.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "derivative"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The first derivative of the target function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.NewtonSolver.NewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 28)",
        "(line 45,col 9)-(line 45,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NewtonSolver.solve(double, double)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Find a zero near the midpoint of \u003ccode\u003emin\u003c/code\u003e and \u003ccode\u003emax\u003c/code\u003e.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NewtonSolver.solve(double, double, double)",
      "begin_line": 76,
      "end_line": 100,
      "comment": "\n     * Find a zero near the value \u003ccode\u003estartValue\u003c/code\u003e.\n     * \n     * @param min the lower bound for the interval (ignored).\n     * @param max the upper bound for the interval (ignored).\n     * @param startValue the start value to use.\n     * @return the value where the function is zero\n    * @throws ConvergenceException if the maximum iteration count is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if startValue is not between min and max\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)",
        "(line 80,col 9)-(line 80,col 45)",
        "(line 82,col 9)-(line 82,col 31)",
        "(line 83,col 9)-(line 83,col 18)",
        "(line 85,col 9)-(line 85,col 18)",
        "(line 86,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 99,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NewtonSolver.readObject(java.io.ObjectInputStream)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Custom deserialization to initialize transient deriviate field.\n     * \n     * @param in serialized object input stream\n     * @throws IOException if IO error occurs \n     * @throws ClassNotFoundException if instantiation error occurs\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)",
        "(line 112,col 9)-(line 112,col 77)"
      ]
    }
  ]
}