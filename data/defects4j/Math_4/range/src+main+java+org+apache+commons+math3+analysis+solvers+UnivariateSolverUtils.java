{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/UnivariateSolverUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateSolverUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 402,
      "comment": "\n * Utility routines for {@link UnivariateSolver} objects.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.UnivariateSolverUtils()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.solve(org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 50,
      "end_line": 58,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used.\n     *\n     * @param function Function.\n     * @param x0 Lower bound for the interval.\n     * @param x1 Upper bound for the interval.\n     * @return a value where the function is zero.\n     * @throws NoBracketingException if the function has the same sign at the\n     * endpoints.\n     * @throws NullArgumentException if {@code function} is {@code null}.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 58)",
        "(line 57,col 9)-(line 57,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.solve(org.apache.commons.math3.analysis.UnivariateFunction, double, double, double)",
      "begin_line": 73,
      "end_line": 83,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used.\n     *\n     * @param function Function.\n     * @param x0 Lower bound for the interval.\n     * @param x1 Upper bound for the interval.\n     * @param absoluteAccuracy Accuracy to be used by the solver.\n     * @return a value where the function is zero.\n     * @throws NoBracketingException if the function has the same sign at the\n     * endpoints.\n     * @throws NullArgumentException if {@code function} is {@code null}.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 74)",
        "(line 82,col 9)-(line 82,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.forceSide(int, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver\u003corg.apache.commons.math3.analysis.UnivariateFunction\u003e, double, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 101,
      "end_line": 171,
      "comment": " Force a root found by a non-bracketing solver to lie on a specified side,\n     * as if the solver was a bracketing one.\n     * @param maxEval maximal number of new evaluations of the function\n     * (evaluations already done for finding the root should have already been subtracted\n     * from this number)\n     * @param f function to solve\n     * @param bracketing bracketing solver to use for shifting the root\n     * @param baseRoot original root found by a previous non-bracketing solver\n     * @param min minimal bound of the search interval\n     * @param max maximal bound of the search interval\n     * @param allowedSolution the kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return a root approximation, on the specified side of the exact root\n     * @throws NoBracketingException if the function has the same sign at the\n     * endpoints.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 114,col 100)",
        "(line 115,col 9)-(line 115,col 63)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 117,col 63)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 40)",
        "(line 120,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 169,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(org.apache.commons.math3.analysis.UnivariateFunction, double, double, double)",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting\n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates\n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e\n     * -- NoBracketingException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e Integer.MAX_VALUE\u003c/code\u003e iterations elapse\n     * -- NoBracketingException \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote: \u003c/strong\u003e this method can take\n     * \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e iterations to throw a\n     * \u003ccode\u003eConvergenceException.\u003c/code\u003e  Unless you are confident that there\n     * is a root between \u003ccode\u003elowerBound\u003c/code\u003e and \u003ccode\u003eupperBound\u003c/code\u003e\n     * near \u003ccode\u003einitial,\u003c/code\u003e it is better to use\n     * {@link #bracket(UnivariateFunction, double, double, double, int)},\n     * explicitly specifying the maximum number of iterations.\u003c/p\u003e\n     *\n     * @param function Function.\n     * @param initial Initial midpoint of interval being expanded to\n     * bracket a root.\n     * @param lowerBound Lower bound (a is never lower than this value)\n     * @param upperBound Upper bound (b never is greater than this\n     * value).\n     * @return a two-element array holding a and b.\n     * @throws NoBracketingException if a root cannot be bracketted.\n     * @throws NotStrictlyPositiveException if {@code maximumIterations \u003c\u003d 0}.\n     * @throws NullArgumentException if {@code function} is {@code null}.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.bracket(org.apache.commons.math3.analysis.UnivariateFunction, double, double, double, int)",
      "begin_line": 253,
      "end_line": 292,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c\u003d 0 \u003c/code\u003e \u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting\n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates\n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c\u003d 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e\n     * -- NoBracketingException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e maximumIterations\u003c/code\u003e iterations elapse\n     * -- NoBracketingException \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param function Function.\n     * @param initial Initial midpoint of interval being expanded to\n     * bracket a root.\n     * @param lowerBound Lower bound (a is never lower than this value).\n     * @param upperBound Upper bound (b never is greater than this\n     * value).\n     * @param maximumIterations Maximum number of iterations to perform\n     * @return a two element array holding a and b.\n     * @throws NoBracketingException if the algorithm fails to find a and b\n     * satisfying the desired conditions.\n     * @throws NotStrictlyPositiveException if {@code maximumIterations \u003c\u003d 0}.\n     * @throws NullArgumentException if {@code function} is {@code null}.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 56)",
        "(line 268,col 9)-(line 268,col 27)",
        "(line 269,col 9)-(line 269,col 27)",
        "(line 270,col 9)-(line 270,col 18)",
        "(line 271,col 9)-(line 271,col 18)",
        "(line 272,col 9)-(line 272,col 30)",
        "(line 274,col 9)-(line 282,col 56)",
        "(line 284,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.midpoint(double, double)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * Compute the midpoint of two values.\n     *\n     * @param a first value.\n     * @param b second value.\n     * @return the midpoint.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 317,
      "end_line": 327,
      "comment": "\n     * Check whether the interval bounds bracket a root. That is, if the\n     * values at the endpoints are not equal to zero, then the function takes\n     * opposite signs at the endpoints.\n     *\n     * @param function Function.\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @return {@code true} if the function values have opposite signs at the\n     * given points.\n     * @throws NullArgumentException if {@code function} is {@code null}.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 49)",
        "(line 325,col 9)-(line 325,col 49)",
        "(line 326,col 9)-(line 326,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isSequence(double, double, double)",
      "begin_line": 337,
      "end_line": 341,
      "comment": "\n     * Check whether the arguments form a (strictly) increasing sequence.\n     *\n     * @param start First number.\n     * @param mid Second number.\n     * @param end Third number.\n     * @return {@code true} if the arguments form an increasing sequence.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifyInterval(double, double)",
      "begin_line": 350,
      "end_line": 357,
      "comment": "\n     * Check that the endpoints specify an interval.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifySequence(double, double, double)",
      "begin_line": 368,
      "end_line": 374,
      "comment": "\n     * Check that {@code lower \u003c initial \u003c upper}.\n     *\n     * @param lower Lower endpoint.\n     * @param initial Initial value.\n     * @param upper Upper endpoint.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d initial} or\n     * {@code initial \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 39)",
        "(line 373,col 9)-(line 373,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifyBracketing(org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 387,
      "end_line": 401,
      "comment": "\n     * Check that the endpoints specify an interval and the end points\n     * bracket a root.\n     *\n     * @param function Function.\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws NoBracketingException if the function has the same sign at the\n     * endpoints.\n     * @throws NullArgumentException if {@code function} is {@code null}.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 37)",
        "(line 396,col 9)-(line 400,col 9)"
      ]
    }
  ]
}