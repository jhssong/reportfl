{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/analysis/NewtonSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NewtonSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 32,
      "end_line": 114,
      "comment": "\n * Implements \u003ca href\u003d\"http://mathworld.wolfram.com/NewtonsMethod.html\"\u003e\n * Newton\u0027s Method\u003c/a\u003e for finding zeros of real univariate functions. \n * \u003cp\u003e \n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "derivative"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The first derivative of the target function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.NewtonSolver.NewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 28)",
        "(line 46,col 9)-(line 46,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NewtonSolver.solve(double, double)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Find a zero near the midpoint of \u003ccode\u003emin\u003c/code\u003e and \u003ccode\u003emax\u003c/code\u003e.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NewtonSolver.solve(double, double, double)",
      "begin_line": 77,
      "end_line": 100,
      "comment": "\n     * Find a zero near the value \u003ccode\u003estartValue\u003c/code\u003e.\n     * \n     * @param min the lower bound for the interval (ignored).\n     * @param max the upper bound for the interval (ignored).\n     * @param startValue the start value to use.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if startValue is not between min and max\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 22)",
        "(line 81,col 9)-(line 81,col 45)",
        "(line 83,col 9)-(line 83,col 31)",
        "(line 84,col 9)-(line 84,col 18)",
        "(line 86,col 9)-(line 86,col 18)",
        "(line 87,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 72)"
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