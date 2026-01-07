{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/optimization/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.fitting.CurveFitter"
      ],
      "begin_line": 31,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "degree"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Polynomial degree. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.PolynomialFitter(int, org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Simple constructor.\n     * \u003cp\u003eThe polynomial fitter built this way are complete polynomials,\n     * ie. a n-degree polynomial has n+1 coefficients.\u003c/p\u003e\n     *\n     * @param degree Maximal degree of the polynomial.\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 25)",
        "(line 45,col 9)-(line 45,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.fit()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Get the polynomial fitting the weighted (x, y) points.\n     *\n     * @return the coefficients of the polynomial that best fits the observed points.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 80)"
      ]
    }
  ]
}