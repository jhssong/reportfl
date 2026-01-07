{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 381,
      "comment": "\n * Utility routines for {@link UnivariateRealSolver} objects.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.UnivariateRealSolverUtils()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used.\n     *\n     * @param function Function.\n     * @param x0 Lower bound for the interval.\n     * @param x1 Upper bound for the interval.\n     * @return a value where the function is zero.\n     * @throws IllegalArgumentException if f is null or the endpoints do not\n     * specify a valid interval.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 62)",
        "(line 54,col 9)-(line 54,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "\n     * Convenience method to find a zero of a univariate real function.  A default\n     * solver is used.\n     *\n     * @param function Function.\n     * @param x0 Lower bound for the interval.\n     * @param x1 Upper bound for the interval.\n     * @param absoluteAccuracy Accuracy to be used by the solver.\n     * @return a value where the function is zero.\n     * @throws IllegalArgumentException if {@code function} is {@code null},\n     * the endpoints do not specify a valid interval, or the absolute accuracy\n     * is not valid for the default solver.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 78)",
        "(line 77,col 9)-(line 77,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(int, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver\u003corg.apache.commons.math.analysis.UnivariateRealFunction\u003e, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolutions)",
      "begin_line": 94,
      "end_line": 163,
      "comment": " Force a root found by a non-bracketing solver to lie on a specified side,\n     * as if the solver was a bracketing one.\n     * @param maxEval maximal number of new evaluations of the function\n     * (evaluations already done for finding the root should have already been subtracted\n     * from this number)\n     * @param f function to solve\n     * @param bracketing bracketing solver to use for shifting the root\n     * @param baseRoot original root found by a previous non-bracketing solver\n     * @param min minimal bound of the search interval\n     * @param max maximal bound of the search interval\n     * @param allowedSolutions the kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return a root approximation, on the specified side of the exact root\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 106,col 100)",
        "(line 107,col 9)-(line 107,col 63)",
        "(line 108,col 9)-(line 108,col 41)",
        "(line 109,col 9)-(line 109,col 63)",
        "(line 110,col 9)-(line 110,col 41)",
        "(line 111,col 9)-(line 111,col 40)",
        "(line 112,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 161,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting\n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates\n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e\n     * -- ConvergenceException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e Integer.MAX_VALUE\u003c/code\u003e iterations elapse\n     * -- ConvergenceException \u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote: \u003c/strong\u003e this method can take\n     * \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e iterations to throw a\n     * \u003ccode\u003eConvergenceException.\u003c/code\u003e  Unless you are confident that there\n     * is a root between \u003ccode\u003elowerBound\u003c/code\u003e and \u003ccode\u003eupperBound\u003c/code\u003e\n     * near \u003ccode\u003einitial,\u003c/code\u003e it is better to use\n     * {@link #bracket(UnivariateRealFunction, double, double, double, int)},\n     * explicitly specifying the maximum number of iterations.\u003c/p\u003e\n     *\n     * @param function Function.\n     * @param initial Initial midpoint of interval being expanded to\n     * bracket a root.\n     * @param lowerBound Lower bound (a is never lower than this value)\n     * @param upperBound Upper bound (b never is greater than this\n     * value).\n     * @return a two-element array holding a and b.\n     * @throws NoBracketingException if a root cannot be bracketted.\n     * @throws IllegalArgumentException if function is null, maximumIterations\n     * is not positive, or initial is not between lowerBound and upperBound.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, int)",
      "begin_line": 242,
      "end_line": 278,
      "comment": "\n     * This method attempts to find two values a and b satisfying \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e lowerBound \u003c\u003d a \u003c initial \u003c b \u003c\u003d upperBound\u003c/code\u003e \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c\u003d 0 \u003c/code\u003e \u003c/li\u003e\n     * \u003c/ul\u003e\n     * If f is continuous on \u003ccode\u003e[a,b],\u003c/code\u003e this means that \u003ccode\u003ea\u003c/code\u003e\n     * and \u003ccode\u003eb\u003c/code\u003e bracket a root of f.\n     * \u003cp\u003e\n     * The algorithm starts by setting\n     * \u003ccode\u003ea :\u003d initial -1; b :\u003d initial +1,\u003c/code\u003e examines the value of the\n     * function at \u003ccode\u003ea\u003c/code\u003e and \u003ccode\u003eb\u003c/code\u003e and keeps moving\n     * the endpoints out by one unit each time through a loop that terminates\n     * when one of the following happens: \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003e f(a) * f(b) \u003c\u003d 0 \u003c/code\u003e --  success!\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e a \u003d lower \u003c/code\u003e and \u003ccode\u003e b \u003d upper\u003c/code\u003e\n     * -- ConvergenceException \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e maximumIterations\u003c/code\u003e iterations elapse\n     * -- ConvergenceException \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param function Function.\n     * @param initial Initial midpoint of interval being expanded to\n     * bracket a root.\n     * @param lowerBound Lower bound (a is never lower than this value).\n     * @param upperBound Upper bound (b never is greater than this\n     * value).\n     * @param maximumIterations Maximum number of iterations to perform\n     * @return a two element array holding a and b.\n     * @throws NoBracketingException if the algorithm fails to find a and b\n     * satisfying the desired conditions.\n     * @throws IllegalArgumentException if function is null, maximumIterations\n     * is not positive, or initial is not between lowerBound and upperBound.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 56)",
        "(line 254,col 9)-(line 254,col 27)",
        "(line 255,col 9)-(line 255,col 27)",
        "(line 256,col 9)-(line 256,col 18)",
        "(line 257,col 9)-(line 257,col 18)",
        "(line 258,col 9)-(line 258,col 30)",
        "(line 260,col 9)-(line 268,col 56)",
        "(line 270,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(double, double)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Compute the midpoint of two values.\n     *\n     * @param a first value.\n     * @param b second value.\n     * @return the midpoint.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 302,
      "end_line": 311,
      "comment": "\n     * Check whether the interval bounds bracket a root. That is, if the\n     * values at the endpoints are not equal to zero, then the function takes\n     * opposite signs at the endpoints.\n     *\n     * @param function Function.\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @return {@code true} if the function values have opposite signs at the\n     * given points.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 49)",
        "(line 309,col 9)-(line 309,col 49)",
        "(line 310,col 9)-(line 310,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(double, double, double)",
      "begin_line": 321,
      "end_line": 325,
      "comment": "\n     * Check whether the arguments form a (strictly) increasing sequence.\n     *\n     * @param start First number.\n     * @param mid Second number.\n     * @param end Third number.\n     * @return {@code true} if the arguments form an increasing sequence.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(double, double)",
      "begin_line": 334,
      "end_line": 340,
      "comment": "\n     * Check that the endpoints specify an interval.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(double, double, double)",
      "begin_line": 351,
      "end_line": 356,
      "comment": "\n     * Check that {@code lower \u003c initial \u003c upper}.\n     *\n     * @param lower Lower endpoint.\n     * @param initial Initial value.\n     * @param upper Upper endpoint.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d initial} or\n     * {@code initial \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 39)",
        "(line 355,col 9)-(line 355,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 368,
      "end_line": 380,
      "comment": "\n     * Check that the endpoints specify an interval and the end points\n     * bracket a root.\n     *\n     * @param function Function.\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws NoBracketingException if function has the same sign at the\n     * endpoints.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 37)",
        "(line 375,col 9)-(line 379,col 9)"
      ]
    }
  ]
}