{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"
      ],
      "begin_line": 32,
      "end_line": 255,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFunctionValueAccuracy"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " The function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int, double)",
      "begin_line": 71,
      "end_line": 82,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     *\n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 69)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 19)",
        "(line 80,col 9)-(line 80,col 52)",
        "(line 81,col 9)-(line 81,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.UnivariateRealSolverImpl(int, double)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     *\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 69)",
        "(line 95,col 9)-(line 95,col 52)",
        "(line 96,col 9)-(line 96,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.checkResultComputed()",
      "begin_line": 102,
      "end_line": 106,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getResult()",
      "begin_line": 109,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 30)",
        "(line 111,col 9)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValue()",
      "begin_line": 115,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 30)",
        "(line 117,col 9)-(line 117,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param newResult the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 40)",
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.setResult(double, double, int)",
      "begin_line": 154,
      "end_line": 160,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 32)",
        "(line 157,col 9)-(line 157,col 33)",
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 32)",
        "(line 167,col 9)-(line 167,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     *\n     * @param lower  the lower endpoint\n     * @param upper  the upper endpoint\n     * @param function the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 48)",
        "(line 184,col 9)-(line 184,col 48)",
        "(line 185,col 9)-(line 185,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     *\n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\n     * Verifies that the endpoints specify an interval,\n     * throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 225,
      "end_line": 231,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 244,
      "end_line": 254,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the endpoints, throws IllegalArgumentException if not\n     *\n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param function function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 253,col 9)"
      ]
    }
  ]
}