{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fitting/PolynomialFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric\u003e"
      ],
      "begin_line": 30,
      "end_line": 70,
      "comment": "\n * Polynomial fitting is a very simple case of {@link CurveFitter curve fitting}.\n * The estimated coefficients are the polynomial coefficients (see the\n * {@link #fit(double[]) fit} method).\n *\n * @version $Id: PolynomialFitter.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitter.PolynomialFitter(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Simple constructor.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitter.fit(int, double[])",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Get the coefficients of the polynomial fitting the weighted data points.\n     * The degree of the fitting polynomial is {@code guess.length - 1}.\n     *\n     * @param guess First guess for the coefficients. They must be sorted in\n     * increasing order of the polynomial\u0027s degree.\n     * @param maxEval Maximum number of evaluations of the polynomial.\n     * @return the coefficients of the polynomial that best fits the observed points.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if\n     * the number of evaluations exceeds {@code maxEval}.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitter.fit(double[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Get the coefficients of the polynomial fitting the weighted data points.\n     * The degree of the fitting polynomial is {@code guess.length - 1}.\n     *\n     * @param guess First guess for the coefficients. They must be sorted in\n     * increasing order of the polynomial\u0027s degree.\n     * @return the coefficients of the polynomial that best fits the observed points.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 63)"
      ]
    }
  ]
}