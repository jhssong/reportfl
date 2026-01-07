{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverImpl.java",
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
      "end_line": 259,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *  \n * @version $Revision$ $Date$\n "
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
        "functionValueAccuracy"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFunctionValueAccuracy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " The function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int, double)",
      "begin_line": 73,
      "end_line": 85,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 69)",
        "(line 78,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 19)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(int, double)",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 69)",
        "(line 98,col 9)-(line 98,col 52)",
        "(line 99,col 9)-(line 99,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.checkResultComputed()",
      "begin_line": 105,
      "end_line": 109,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getResult()",
      "begin_line": 112,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 30)",
        "(line 114,col 9)-(line 114,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValue()",
      "begin_line": 118,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 30)",
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 124,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 134,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 146,col 45)",
        "(line 147,col 9)-(line 147,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, double, int)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 32)",
        "(line 160,col 9)-(line 160,col 33)",
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 32)",
        "(line 170,col 9)-(line 170,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     * \n     * @param lower  the lower endpoint \n     * @param upper  the upper endpoint\n     * @param f the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 41)",
        "(line 187,col 9)-(line 187,col 41)",
        "(line 188,col 9)-(line 188,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "\n     * Verifies that the endpoints specify an interval, \n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 228,
      "end_line": 234,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 247,
      "end_line": 258,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the enpoints, throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param f function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 37)",
        "(line 252,col 9)-(line 257,col 9)"
      ]
    }
  ]
}