{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Fitter for the coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "degree"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Polynomial degree. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.PolynomialFitter(int, org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 48,
      "end_line": 51,
      "comment": " Simple constructor.\n     * \u003cp\u003eThe polynomial fitter built this way are complete polynomials,\n     * ie. a n-degree polynomial has n+1 coefficients.\u003c/p\u003e\n     * @param degree maximal degree of the polynomial\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 49)",
        "(line 50,col 9)-(line 50,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.addObservedPoint(double, double, double)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have P(x) as close as possible to this value\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.clearObservations()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.fit()",
      "begin_line": 74,
      "end_line": 81,
      "comment": " Get the polynomial fitting the weighted (x, y) points.\n     * @return polynomial function best fitting the observed points\n     * @exception ConvergenceException if the algorithm failed to converge\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParametricPolynomial",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction"
      ],
      "begin_line": 84,
      "end_line": 107,
      "comment": " Dedicated parametric polynomial class. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial.gradient(double, double[])",
      "begin_line": 87,
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