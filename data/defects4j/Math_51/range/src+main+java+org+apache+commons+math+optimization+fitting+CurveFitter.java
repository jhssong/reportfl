{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 209,
      "comment": " Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cp\u003eWhen a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 51,
      "end_line": 54,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 35)",
        "(line 53,col 9)-(line 53,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.clearObservations()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.fit(org.apache.commons.math.analysis.ParametricUnivariateRealFunction, double[])",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * parametric function throws one.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.fit(int, org.apache.commons.math.analysis.ParametricUnivariateRealFunction, double[])",
      "begin_line": 147,
      "end_line": 166,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * parametric function throws one.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 59)",
        "(line 151,col 9)-(line 151,col 59)",
        "(line 152,col 9)-(line 152,col 18)",
        "(line 153,col 9)-(line 157,col 9)",
        "(line 160,col 9)-(line 162,col 62)",
        "(line 165,col 9)-(line 165,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction"
      ],
      "begin_line": 169,
      "end_line": 208,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math.analysis.ParametricUnivariateRealFunction)",
      "begin_line": 177,
      "end_line": 179,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.jacobian()",
      "begin_line": 182,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 13)-(line 194,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-5985b03a-3f33-430f-a550-e8e9f389c313.value(double[])",
      "begin_line": 184,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 185,col 21)-(line 185,col 82)",
        "(line 187,col 21)-(line 187,col 30)",
        "(line 188,col 21)-(line 190,col 21)",
        "(line 192,col 21)-(line 192,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 198,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 68)",
        "(line 201,col 13)-(line 201,col 22)",
        "(line 202,col 13)-(line 204,col 13)",
        "(line 206,col 13)-(line 206,col 26)"
      ]
    }
  ]
}