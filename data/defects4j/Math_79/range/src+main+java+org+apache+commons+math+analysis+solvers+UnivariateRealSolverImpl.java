{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"
      ],
      "begin_line": 31,
      "end_line": 255,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFunctionValueAccuracy"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": " The function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int, double)",
      "begin_line": 70,
      "end_line": 81,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     *\n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 69)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 19)",
        "(line 79,col 9)-(line 79,col 52)",
        "(line 80,col 9)-(line 80,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(int, double)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     *\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 69)",
        "(line 94,col 9)-(line 94,col 52)",
        "(line 95,col 9)-(line 95,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.checkResultComputed()",
      "begin_line": 101,
      "end_line": 105,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getResult()",
      "begin_line": 108,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValue()",
      "begin_line": 114,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 30)",
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 120,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 125,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 40)",
        "(line 142,col 9)-(line 142,col 45)",
        "(line 143,col 9)-(line 143,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, double, int)",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 32)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 45)",
        "(line 158,col 9)-(line 158,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 32)",
        "(line 166,col 9)-(line 166,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 179,
      "end_line": 185,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     *\n     * @param lower  the lower endpoint\n     * @param upper  the upper endpoint\n     * @param function the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 48)",
        "(line 183,col 9)-(line 183,col 48)",
        "(line 184,col 9)-(line 184,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     *\n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\n     * Verifies that the endpoints specify an interval,\n     * throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 243,
      "end_line": 254,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the enpoints, throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param function function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 37)",
        "(line 248,col 9)-(line 253,col 9)"
      ]
    }
  ]
}