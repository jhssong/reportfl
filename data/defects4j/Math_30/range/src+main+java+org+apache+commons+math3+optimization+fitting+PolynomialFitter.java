{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/optimization/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.fitting.CurveFitter"
      ],
      "begin_line": 37,
      "end_line": 64,
      "comment": " This class implements a curve fitting specialized for polynomials.\n * \u003cp\u003ePolynomial fitting is a very simple case of curve fitting. The\n * estimated coefficients are the polynomial coefficients. They are\n * searched by a least square estimator.\u003c/p\u003e\n * @version $Id$\n * @since 2.0\n *\n * @deprecated Since 3.1 (to be removed in 4.0, see \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-800\"\u003eMATH-800\u003c/a\u003e).\n * Please use {@link CurveFitter} directly, by passing an instance of\n * {@link org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric PolynomialFunction.Parametric}\n * as an argument to the\n * {@link CurveFitter#fit(int,org.apache.commons.math3.analysis.ParametricUnivariateFunction,double[]) fit}\n * method.\n "
    },
    {
      "type": "field",
      "varNames": [
        "degree"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Polynomial degree. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.PolynomialFitter(int, org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Simple constructor.\n     * \u003cp\u003eThe polynomial fitter built this way are complete polynomials,\n     * ie. a n-degree polynomial has n+1 coefficients.\u003c/p\u003e\n     *\n     * @param degree Maximal degree of the polynomial.\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 25)",
        "(line 51,col 9)-(line 51,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.fit()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Get the polynomial fitting the weighted (x, y) points.\n     *\n     * @return the coefficients of the polynomial that best fits the observed points.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 80)"
      ]
    }
  ]
}