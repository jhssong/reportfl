{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Fitter for the coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "degree"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Polynomial degree. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.PolynomialFitter(int, org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Simple constructor.\n     *\n     * \u003cp\u003eThe polynomial fitter built this way are complete polynomials,\n     * ie. a n-degree polynomial has n+1 coefficients.\u003c/p\u003e\n     * @param degree maximal degree of the polynomial\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 49)",
        "(line 49,col 9)-(line 49,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.addObservedPoint(double, double, double)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Add an observed weighted (x,y) point to the sample.\n     *\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have P(x) as close as possible to this value\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.clearObservations()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.fit()",
      "begin_line": 78,
      "end_line": 85,
      "comment": "\n     * Get the polynomial fitting the weighted (x, y) points.\n     *\n     * @return polynomial function best fitting the observed points\n     * @throws org.apache.commons.math.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParametricPolynomial",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction"
      ],
      "begin_line": 90,
      "end_line": 112,
      "comment": "\n     * Dedicated parametric polynomial class.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial.gradient(double, double[])",
      "begin_line": 93,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 68)",
        "(line 96,col 13)-(line 96,col 28)",
        "(line 97,col 13)-(line 100,col 13)",
        "(line 101,col 13)-(line 101,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial.value(double, double[])",
      "begin_line": 105,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 25)",
        "(line 107,col 13)-(line 109,col 13)",
        "(line 110,col 13)-(line 110,col 21)"
      ]
    }
  ]
}