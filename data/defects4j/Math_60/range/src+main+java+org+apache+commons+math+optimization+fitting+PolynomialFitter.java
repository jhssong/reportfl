{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/optimization/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Fitter for the coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "degree"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Polynomial degree. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.PolynomialFitter(int, org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Simple constructor.\n     *\n     * \u003cp\u003eThe polynomial fitter built this way are complete polynomials,\n     * ie. a n-degree polynomial has n+1 coefficients.\u003c/p\u003e\n     * @param degree maximal degree of the polynomial\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 49)",
        "(line 47,col 9)-(line 47,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.addObservedPoint(double, double, double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Add an observed weighted (x,y) point to the sample.\n     *\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have P(x) as close as possible to this value\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.clearObservations()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.fit()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Get the polynomial fitting the weighted (x, y) points.\n     *\n     * @return polynomial function best fitting the observed points\n     * @throws org.apache.commons.math.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 102)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParametricPolynomial",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction"
      ],
      "begin_line": 83,
      "end_line": 104,
      "comment": "\n     * Dedicated parametric polynomial class.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial.gradient(double, double[])",
      "begin_line": 86,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 68)",
        "(line 88,col 13)-(line 88,col 28)",
        "(line 89,col 13)-(line 92,col 13)",
        "(line 93,col 13)-(line 93,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial.value(double, double[])",
      "begin_line": 97,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 25)",
        "(line 99,col 13)-(line 101,col 13)",
        "(line 102,col 13)-(line 102,col 21)"
      ]
    }
  ]
}