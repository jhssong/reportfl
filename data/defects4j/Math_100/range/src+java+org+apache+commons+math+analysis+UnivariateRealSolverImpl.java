{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolver",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 341,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *  \n * @version $Revision$ $Date$\n "
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
        "absoluteAccuracy"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAbsoluteAccuracy"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFunctionValueAccuracy"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Default maximum error of function. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Default maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The last iteration count. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.UnivariateRealSolverImpl(org.apache.commons.math.analysis.UnivariateRealFunction, int, double)",
      "begin_line": 82,
      "end_line": 102,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * \n     * @param f the function to solve.\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 16)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 19)",
        "(line 94,col 9)-(line 94,col 63)",
        "(line 95,col 9)-(line 95,col 45)",
        "(line 96,col 9)-(line 96,col 50)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 98,col 9)-(line 98,col 56)",
        "(line 99,col 9)-(line 99,col 66)",
        "(line 100,col 9)-(line 100,col 73)",
        "(line 101,col 9)-(line 101,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getResult()",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\n     * Access the last computed root.\n     * \n     * @return the last computed root\n     * @throws IllegalStateException if no root has been computed\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getIterationCount()",
      "begin_line": 125,
      "end_line": 131,
      "comment": "\n     * Access the last iteration count.\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if no root has been computed\n     *  \n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setResult(double, int)",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 29)",
        "(line 141,col 9)-(line 141,col 45)",
        "(line 142,col 9)-(line 142,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.clearResult()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setAbsoluteAccuracy(double)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Set the absolute accuracy.\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getAbsoluteAccuracy()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Get the actual absolute accuracy.\n     * \n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetAbsoluteAccuracy()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Reset the absolute accuracy to the default.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setMaximalIterationCount(int)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \n     * @param count maximum number of iterations\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getMaximalIterationCount()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetMaximalIterationCount()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setRelativeAccuracy(double)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Set the relative accuracy.\n     * \n     * @param accuracy the relative accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getRelativeAccuracy()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Get the actual relative accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetRelativeAccuracy()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Reset the relative accuracy to the default.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.setFunctionValueAccuracy(double)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Set the function value accuracy.\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.getFunctionValueAccuracy()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Get the actual function value accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.resetFunctionValueAccuracy()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Reset the actual function accuracy to the default.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.isBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\n     * Returns true iff the function takes opposite signs at the endpoints.\n     * \n     * @param lower  the lower endpoint \n     * @param upper  the upper endpoint\n     * @param f the function\n     * @return true if f(lower) * f(upper) \u003c 0\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 35)",
        "(line 270,col 9)-(line 270,col 35)",
        "(line 271,col 9)-(line 271,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.isSequence(double, double, double)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Returns true if the arguments form a (strictly) increasing sequence\n     * \n     * @param start  first number\n     * @param mid   second number\n     * @param end  third number\n     * @return true if the arguments form an increasing sequence\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifyInterval(double, double)",
      "begin_line": 294,
      "end_line": 300,
      "comment": "\n     * Verifies that the endpoints specify an interval, \n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifySequence(double, double, double)",
      "begin_line": 311,
      "end_line": 317,
      "comment": "\n     * Verifies that \u003ccode\u003elower \u003c initial \u003c upper\u003c/code\u003e\n     * throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param initial initial value\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverImpl.verifyBracketing(double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 330,
      "end_line": 340,
      "comment": "\n     * Verifies that the endpoints specify an interval and the function takes\n     * opposite signs at the enpoints, throws IllegalArgumentException if not\n     * \n     * @param lower  lower endpoint\n     * @param upper upper endpoint\n     * @param f function\n     * @throws IllegalArgumentException\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function at the endpoints\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 37)",
        "(line 334,col 9)-(line 339,col 9)"
      ]
    }
  ]
}