{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolver",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 340,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAbsoluteAccuracy"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFunctionValueAccuracy"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Default maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Default maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The last iteration count. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int, double)",
      "begin_line": 81,
      "end_line": 101,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 19)",
        "(line 93,col 9)-(line 93,col 63)",
        "(line 94,col 9)-(line 94,col 45)",
        "(line 95,col 9)-(line 95,col 50)",
        "(line 96,col 9)-(line 96,col 56)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 98,col 9)-(line 98,col 66)",
        "(line 99,col 9)-(line 99,col 73)",
        "(line 100,col 9)-(line 100,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getResult()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Access the last computed root.\n     * \n     * @return the last computed root\n     * @throws IllegalStateException if no root has been computed\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getIterationCount()",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\n     * Access the last iteration count.\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if no root has been computed\n     *  \n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 141,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setAbsoluteAccuracy(double)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Set the absolute accuracy.\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getAbsoluteAccuracy()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Get the actual absolute accuracy.\n     * \n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetAbsoluteAccuracy()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Reset the absolute accuracy to the default.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setMaximalIterationCount(int)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \n     * @param count maximum number of iterations\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getMaximalIterationCount()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetMaximalIterationCount()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setRelativeAccuracy(double)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Set the relative accuracy.\n     * \n     * @param accuracy the relative accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getRelativeAccuracy()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Get the actual relative accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetRelativeAccuracy()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Reset the relative accuracy to the default.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Set the function value accuracy.\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Get the actual function value accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Reset the actual function accuracy to the default.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 266,
      "end_line": 271,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     * \n     * @param lower  the lower endpoint \n     * @param upper  the upper endpoint\n     * @param f the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 35)",
        "(line 269,col 9)-(line 269,col 35)",
        "(line 270,col 9)-(line 270,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 293,
      "end_line": 299,
      "comment": "\n     * Verifies that the endpoints specify an interval, \n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 310,
      "end_line": 316,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 329,
      "end_line": 339,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the enpoints, throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param f function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 37)",
        "(line 333,col 9)-(line 338,col 9)"
      ]
    }
  ]
}