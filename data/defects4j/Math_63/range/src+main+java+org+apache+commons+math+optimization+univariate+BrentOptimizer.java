{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer"
      ],
      "begin_line": 46,
      "end_line": 292,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions. This implementation is an adaptation partly\n * based on the Python code from SciPy (module \"optimize.py\" v0.5).\n * If the function is defined on some interval {@code (lo, hi)}, then\n * this method finds an approximation {@code x} to the point at which\n * the function attains its minimum.\n * \u003cbr/\u003e\n * The user is responsible for calling {@link\n * #setConvergenceChecker(ConvergenceChecker) ConvergenceChecker}\n * prior to using the optimizer.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOLDEN_SECTION"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "class_interface",
      "name": "BrentConvergenceChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.AbstractConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e"
      ],
      "begin_line": 63,
      "end_line": 119,
      "comment": "\n     * Convergence checker that implements the original stopping criterion\n     * of Brent\u0027s algorithm.\n     * {@code abs} and {@code rel} define a tolerance\n     * {@code tol \u003d rel |x| + abs}. {@code rel} should be no smaller than\n     * \u003cem\u003e2 macheps\u003c/em\u003e and preferably not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e,\n     * where \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code abs} must\n     * be positive.\n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n         * Minimum relative tolerance.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentConvergenceChecker.BrentConvergenceChecker(double, double)",
      "begin_line": 76,
      "end_line": 86,
      "comment": "\n         * Build an instance with specified thresholds.\n         *\n         * @param rel Relative tolerance threshold\n         * @param abs Absolute tolerance threshold\n         ",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 28)",
        "(line 80,col 13)-(line 82,col 13)",
        "(line 83,col 13)-(line 85,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentConvergenceChecker.converged(int, org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair...)",
      "begin_line": 103,
      "end_line": 118,
      "comment": "\n         * Convergence criterion.\n         *\n         * @param iteration Current iteration.\n         * @param points Points used for checking the stopping criterion. The list\n         * must contain 3 points (in the following order):\n         * \u003cul\u003e\n         *  \u003cli\u003ethe lower end of the current interval\u003c/li\u003e\n         *  \u003cli\u003ethe current best point\u003c/li\u003e\n         *  \u003cli\u003ethe higher end of the current interval\u003c/li\u003e\n         * \u003c/ul\u003e\n         * @return {@code true} if the stopping criterion is satisfied.\n         * @throws DimensionMismatchException if the length of the {@code points}\n         * list is not equal to 3.\n         ",
      "child_ranges": [
        "(line 105,col 13)-(line 107,col 13)",
        "(line 109,col 13)-(line 109,col 50)",
        "(line 110,col 13)-(line 110,col 50)",
        "(line 111,col 13)-(line 111,col 50)",
        "(line 113,col 13)-(line 113,col 98)",
        "(line 114,col 13)-(line 114,col 41)",
        "(line 116,col 13)-(line 116,col 43)",
        "(line 117,col 13)-(line 117,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e)",
      "begin_line": 130,
      "end_line": 137,
      "comment": "\n     * Set the convergence checker.\n     * Since this algorithm requires a specific checker, this method will throw\n     * an {@code UnsupportedOperationexception} if the argument type is not\n     * {@link BrentConvergenceChecker}.\n     *\n     * @throws MathUnsupportedOperationexception if the checker is not an\n     * instance of {@link BrentConvergenceChecker}.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize()",
      "begin_line": 140,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 69)",
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 145,col 35)",
        "(line 147,col 9)-(line 148,col 38)",
        "(line 149,col 9)-(line 149,col 58)",
        "(line 150,col 9)-(line 150,col 56)",
        "(line 152,col 9)-(line 152,col 17)",
        "(line 153,col 9)-(line 153,col 17)",
        "(line 154,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 23)",
        "(line 163,col 9)-(line 163,col 21)",
        "(line 164,col 9)-(line 164,col 21)",
        "(line 165,col 9)-(line 165,col 21)",
        "(line 166,col 9)-(line 166,col 21)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 23)",
        "(line 172,col 9)-(line 172,col 23)",
        "(line 174,col 9)-(line 174,col 21)",
        "(line 175,col 9)-(line 290,col 9)"
      ]
    }
  ]
}