{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverImpl.java",
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
      "end_line": 258,
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
      "end_line": 84,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 69)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 19)",
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 83,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(int, double)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 69)",
        "(line 97,col 9)-(line 97,col 52)",
        "(line 98,col 9)-(line 98,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.checkResultComputed()",
      "begin_line": 104,
      "end_line": 108,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getResult()",
      "begin_line": 111,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 30)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValue()",
      "begin_line": 117,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 30)",
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 123,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 128,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 37)",
        "(line 145,col 9)-(line 145,col 45)",
        "(line 146,col 9)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, double, int)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 32)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 161,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 32)",
        "(line 169,col 9)-(line 169,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 182,
      "end_line": 188,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     * \n     * @param lower  the lower endpoint \n     * @param upper  the upper endpoint\n     * @param f the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 41)",
        "(line 186,col 9)-(line 186,col 41)",
        "(line 187,col 9)-(line 187,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 210,
      "end_line": 216,
      "comment": "\n     * Verifies that the endpoints specify an interval, \n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 227,
      "end_line": 233,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 246,
      "end_line": 257,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the enpoints, throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param f function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 37)",
        "(line 251,col 9)-(line 256,col 9)"
      ]
    }
  ]
}