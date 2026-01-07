{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 238,
      "comment": "\n * Utility routines for {@link UnivariateRealSolver} objects.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverUtils.UnivariateRealSolverUtils()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Cached solver factory "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverUtils.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used. \n     * \n     * @param f the function.\n     * @param x0 the lower bound for the interval.\n     * @param x1 the upper bound for the interval.\n     * @return a value where the function is zero.\n     * @throws ConvergenceException if the iteration count was exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function\n     * @throws IllegalArgumentException if f is null or the endpoints do not\n     * specify a valid interval\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 17)",
        "(line 55,col 9)-(line 55,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverUtils.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 74,
      "end_line": 82,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used. \n     * \n     * @param f the function\n     * @param x0 the lower bound for the interval\n     * @param x1 the upper bound for the interval\n     * @param absoluteAccuracy the accuracy to be used by the solver\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if f is null, the endpoints do not \n     * specify a valid interval, or the absoluteAccuracy is not valid for the\n     * default solver\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 17)",
        "(line 79,col 9)-(line 79,col 66)",
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 81,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverUtils.bracket(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n    * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting \n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates \n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e \n     * -- ConvergenceException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e Integer.MAX_VALUE\u003c/code\u003e iterations elapse \n     * -- ConvergenceException \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote: \u003c/strong\u003e this method can take \n     * \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e iterations to throw a \n     * \u003ccode\u003eConvergenceException.\u003c/code\u003e  Unless you are confident that there\n     * is a root between \u003ccode\u003elowerBound\u003c/code\u003e and \u003ccode\u003eupperBound\u003c/code\u003e\n     * near \u003ccode\u003einitial,\u003c/code\u003e it is better to use \n     * {@link #bracket(UnivariateRealFunction, double, double, double, int)}, \n     * explicitly specifying the maximum number of iterations.\u003c/p\u003e\n     *\n     * @param function the function\n     * @param initial initial midpoint of interval being expanded to\n     * bracket a root\n     * @param lowerBound lower bound (a is never lower than this value)\n     * @param upperBound upper bound (b never is greater than this\n     * value)\n     * @return a two element array holding {a, b}\n     * @throws ConvergenceException if a root can not be bracketted\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if function is null, maximumIterations\n     * is not positive, or initial is not between lowerBound and upperBound\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 129,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverUtils.bracket(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, int)",
      "begin_line": 166,
      "end_line": 208,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e \u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting \n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates \n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e \n     * -- ConvergenceException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e maximumIterations\u003c/code\u003e iterations elapse \n     * -- ConvergenceException \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param function the function\n     * @param initial initial midpoint of interval being expanded to\n     * bracket a root\n     * @param lowerBound lower bound (a is never lower than this value)\n     * @param upperBound upper bound (b never is greater than this\n     * value)\n     * @param maximumIterations maximum number of iterations to perform\n     * @return a two element array holding {a, b}.\n     * @throws ConvergenceException if the algorithm fails to find a and b\n     * satisfying the desired conditions\n     * @throws FunctionEvaluationException if an error occurs evaluating the \n     * function\n     * @throws IllegalArgumentException if function is null, maximumIterations\n     * is not positive, or initial is not between lowerBound and upperBound\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 27)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 185,col 9)-(line 185,col 18)",
        "(line 186,col 9)-(line 186,col 18)",
        "(line 187,col 9)-(line 187,col 31)",
        "(line 189,col 9)-(line 197,col 56)",
        "(line 199,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverUtils.midpoint(double, double)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Compute the midpoint of two values.\n     * \n     * @param a first value.\n     * @param b second value.\n     * @return the midpoint. \n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverUtils.setup(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 228,
      "end_line": 237,
      "comment": "\n     * Checks to see if f is null, throwing IllegalArgumentException if so.\n     * Also initializes factory if factory is null.\n     * \n     * @param f  input function\n     * @throws IllegalArgumentException if f is null\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 236,col 9)"
      ]
    }
  ]
}