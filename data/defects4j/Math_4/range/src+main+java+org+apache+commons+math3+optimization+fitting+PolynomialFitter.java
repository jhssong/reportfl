{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric\u003e"
      ],
      "begin_line": 32,
      "end_line": 112,
      "comment": "\n * Polynomial fitting is a very simple case of {@link CurveFitter curve fitting}.\n * The estimated coefficients are the polynomial coefficients (see the\n * {@link #fit(double[]) fit} method).\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "degree"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Polynomial degree.\n     * @deprecated\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.PolynomialFitter(int, org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Simple constructor.\n     * \u003cp\u003eThe polynomial fitter built this way are complete polynomials,\n     * ie. a n-degree polynomial has n+1 coefficients.\u003c/p\u003e\n     *\n     * @param degree Maximal degree of the polynomial.\n     * @param optimizer Optimizer to use for the fitting.\n     * @deprecated Since 3.1 (to be removed in 4.0). Please use\n     * {@link #PolynomialFitter(DifferentiableMultivariateVectorOptimizer)} instead.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 25)",
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.PolynomialFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Simple constructor.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.fit()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Get the polynomial fitting the weighted (x, y) points.\n     *\n     * @return the coefficients of the polynomial that best fits the observed points.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     * @deprecated Since 3.1 (to be removed in 4.0). Please use {@link #fit(double[])} instead.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.fit(int, double[])",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Get the coefficients of the polynomial fitting the weighted data points.\n     * The degree of the fitting polynomial is {@code guess.length - 1}.\n     *\n     * @param guess First guess for the coefficients. They must be sorted in\n     * increasing order of the polynomial\u0027s degree.\n     * @param maxEval Maximum number of evaluations of the polynomial.\n     * @return the coefficients of the polynomial that best fits the observed points.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if\n     * the number of evaluations exceeds {@code maxEval}.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitter.fit(double[])",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Get the coefficients of the polynomial fitting the weighted data points.\n     * The degree of the fitting polynomial is {@code guess.length - 1}.\n     *\n     * @param guess First guess for the coefficients. They must be sorted in\n     * increasing order of the polynomial\u0027s degree.\n     * @return the coefficients of the polynomial that best fits the observed points.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 63)"
      ]
    }
  ]
}