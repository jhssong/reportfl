{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 242,
      "comment": "\n * Utility routines for {@link UnivariateRealSolver} objects.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.UnivariateRealSolverUtils()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used.\n     *\n     * @param f the function.\n     * @param x0 the lower bound for the interval.\n     * @param x1 the upper bound for the interval.\n     * @return a value where the function is zero.\n     * @throws ConvergenceException if the iteration count was exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function\n     * @throws IllegalArgumentException if f is null or the endpoints do not\n     * specify a valid interval\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 17)",
        "(line 54,col 9)-(line 54,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 73,
      "end_line": 81,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used.\n     *\n     * @param f the function\n     * @param x0 the lower bound for the interval\n     * @param x1 the upper bound for the interval\n     * @param absoluteAccuracy the accuracy to be used by the solver\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if f is null, the endpoints do not\n     * specify a valid interval, or the absoluteAccuracy is not valid for the\n     * default solver\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 17)",
        "(line 78,col 9)-(line 78,col 76)",
        "(line 79,col 9)-(line 79,col 53)",
        "(line 80,col 9)-(line 80,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n    * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting\n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates\n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e\n     * -- ConvergenceException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e Integer.MAX_VALUE\u003c/code\u003e iterations elapse\n     * -- ConvergenceException \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote: \u003c/strong\u003e this method can take\n     * \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e iterations to throw a\n     * \u003ccode\u003eConvergenceException.\u003c/code\u003e  Unless you are confident that there\n     * is a root between \u003ccode\u003elowerBound\u003c/code\u003e and \u003ccode\u003eupperBound\u003c/code\u003e\n     * near \u003ccode\u003einitial,\u003c/code\u003e it is better to use\n     * {@link #bracket(UnivariateRealFunction, double, double, double, int)},\n     * explicitly specifying the maximum number of iterations.\u003c/p\u003e\n     *\n     * @param function the function\n     * @param initial initial midpoint of interval being expanded to\n     * bracket a root\n     * @param lowerBound lower bound (a is never lower than this value)\n     * @param upperBound upper bound (b never is greater than this\n     * value)\n     * @return a two element array holding {a, b}\n     * @throws ConvergenceException if a root can not be bracketted\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if function is null, maximumIterations\n     * is not positive, or initial is not between lowerBound and upperBound\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, int)",
      "begin_line": 165,
      "end_line": 208,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c\u003d 0 \u003c/code\u003e \u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting\n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates\n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c\u003d 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e\n     * -- ConvergenceException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e maximumIterations\u003c/code\u003e iterations elapse\n     * -- ConvergenceException \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param function the function\n     * @param initial initial midpoint of interval being expanded to\n     * bracket a root\n     * @param lowerBound lower bound (a is never lower than this value)\n     * @param upperBound upper bound (b never is greater than this\n     * value)\n     * @param maximumIterations maximum number of iterations to perform\n     * @return a two element array holding {a, b}.\n     * @throws ConvergenceException if the algorithm fails to find a and b\n     * satisfying the desired conditions\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if function is null, maximumIterations\n     * is not positive, or initial is not between lowerBound and upperBound\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 27)",
        "(line 183,col 9)-(line 183,col 27)",
        "(line 184,col 9)-(line 184,col 18)",
        "(line 185,col 9)-(line 185,col 18)",
        "(line 186,col 9)-(line 186,col 31)",
        "(line 188,col 9)-(line 196,col 56)",
        "(line 198,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(double, double)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Compute the midpoint of two values.\n     *\n     * @param a first value.\n     * @param b second value.\n     * @return the midpoint.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.setup(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * Checks to see if f is null, throwing IllegalArgumentException if so.\n     * @param f  input function\n     * @throws IllegalArgumentException if f is null\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 236,
      "end_line": 239,
      "comment": " Holder for the factory.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " Cached solver factory "
    }
  ]
}