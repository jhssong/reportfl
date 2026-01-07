{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/optimization/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Fitter for the coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "degree"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Polynomial degree. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.PolynomialFitter(int, org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Simple constructor.\n     *\n     * \u003cp\u003eThe polynomial fitter built this way are complete polynomials,\n     * ie. a n-degree polynomial has n+1 coefficients.\u003c/p\u003e\n     * @param degree maximal degree of the polynomial\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 49)",
        "(line 48,col 9)-(line 48,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.addObservedPoint(double, double, double)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Add an observed weighted (x,y) point to the sample.\n     *\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have P(x) as close as possible to this value\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.clearObservations()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Remove all observations.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.fit()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Get the polynomial fitting the weighted (x, y) points.\n     *\n     * @return polynomial function best fitting the observed points\n     * @throws org.apache.commons.math.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 102)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParametricPolynomial",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.ParametricUnivariateRealFunction"
      ],
      "begin_line": 85,
      "end_line": 106,
      "comment": "\n     * Dedicated parametric polynomial class.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial.gradient(double, double[])",
      "begin_line": 88,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 68)",
        "(line 90,col 13)-(line 90,col 28)",
        "(line 91,col 13)-(line 94,col 13)",
        "(line 95,col 13)-(line 95,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial.value(double, double[])",
      "begin_line": 99,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 25)",
        "(line 101,col 13)-(line 103,col 13)",
        "(line 104,col 13)-(line 104,col 21)"
      ]
    }
  ]
}