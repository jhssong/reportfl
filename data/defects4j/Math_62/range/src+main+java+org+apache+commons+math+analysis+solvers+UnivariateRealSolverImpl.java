{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"
      ],
      "begin_line": 33,
      "end_line": 256,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFunctionValueAccuracy"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": " The function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int, double)",
      "begin_line": 72,
      "end_line": 83,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     *\n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 69)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 19)",
        "(line 81,col 9)-(line 81,col 52)",
        "(line 82,col 9)-(line 82,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(int, double)",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     *\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 69)",
        "(line 96,col 9)-(line 96,col 52)",
        "(line 97,col 9)-(line 97,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.checkResultComputed()",
      "begin_line": 103,
      "end_line": 107,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getResult()",
      "begin_line": 110,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 112,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValue()",
      "begin_line": 116,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 30)",
        "(line 118,col 9)-(line 118,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 127,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 132,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 40)",
        "(line 144,col 9)-(line 144,col 45)",
        "(line 145,col 9)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, double, int)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 32)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 45)",
        "(line 160,col 9)-(line 160,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 32)",
        "(line 168,col 9)-(line 168,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 181,
      "end_line": 187,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     *\n     * @param lower  the lower endpoint\n     * @param upper  the upper endpoint\n     * @param function the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 48)",
        "(line 185,col 9)-(line 185,col 48)",
        "(line 186,col 9)-(line 186,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     *\n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 209,
      "end_line": 215,
      "comment": "\n     * Verifies that the endpoints specify an interval,\n     * throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 245,
      "end_line": 255,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the endpoints, throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param function function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 254,col 9)"
      ]
    }
  ]
}