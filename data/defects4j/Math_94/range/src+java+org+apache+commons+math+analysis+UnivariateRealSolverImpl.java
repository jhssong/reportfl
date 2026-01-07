{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolver",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 371,
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
        "absoluteAccuracy"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAbsoluteAccuracy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFunctionValueAccuracy"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Default maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Default maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The last iteration count. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 76,
      "end_line": 77,
      "comment": " The function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int, double)",
      "begin_line": 92,
      "end_line": 112,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 19)",
        "(line 104,col 9)-(line 104,col 63)",
        "(line 105,col 9)-(line 105,col 45)",
        "(line 106,col 9)-(line 106,col 50)",
        "(line 107,col 9)-(line 107,col 56)",
        "(line 108,col 9)-(line 108,col 56)",
        "(line 109,col 9)-(line 109,col 66)",
        "(line 110,col 9)-(line 110,col 73)",
        "(line 111,col 9)-(line 111,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.UnivariateRealSolverImpl(int, double)",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 63)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 50)",
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 129,col 66)",
        "(line 130,col 9)-(line 130,col 73)",
        "(line 131,col 9)-(line 131,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getResult()",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\n     * Access the last computed root.\n     * \n     * @return the last computed root\n     * @throws IllegalStateException if no root has been computed\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getIterationCount()",
      "begin_line": 155,
      "end_line": 161,
      "comment": "\n     * Access the last iteration count.\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if no root has been computed\n     *  \n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 169,
      "end_line": 173,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 29)",
        "(line 171,col 9)-(line 171,col 45)",
        "(line 172,col 9)-(line 172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setAbsoluteAccuracy(double)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Set the absolute accuracy.\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getAbsoluteAccuracy()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Get the actual absolute accuracy.\n     * \n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetAbsoluteAccuracy()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Reset the absolute accuracy to the default.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setMaximalIterationCount(int)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \n     * @param count maximum number of iterations\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getMaximalIterationCount()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetMaximalIterationCount()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setRelativeAccuracy(double)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Set the relative accuracy.\n     * \n     * @param accuracy the relative accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getRelativeAccuracy()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Get the actual relative accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetRelativeAccuracy()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Reset the relative accuracy to the default.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Set the function value accuracy.\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Get the actual function value accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Reset the actual function accuracy to the default.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 297,
      "end_line": 302,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     * \n     * @param lower  the lower endpoint \n     * @param upper  the upper endpoint\n     * @param f the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 35)",
        "(line 300,col 9)-(line 300,col 35)",
        "(line 301,col 9)-(line 301,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\n     * Verifies that the endpoints specify an interval, \n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 341,
      "end_line": 347,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 360,
      "end_line": 370,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the enpoints, throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param f function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 37)",
        "(line 364,col 9)-(line 369,col 9)"
      ]
    }
  ]
}