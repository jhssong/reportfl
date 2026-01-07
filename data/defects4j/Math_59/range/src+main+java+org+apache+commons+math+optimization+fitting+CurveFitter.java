{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 208,
      "comment": " Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cp\u003eWhen a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 50,
      "end_line": 53,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 35)",
        "(line 52,col 9)-(line 52,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 88,
      "end_line": 90,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.clearObservations()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.fit(org.apache.commons.math.optimization.fitting.ParametricRealFunction, double[])",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * parametric function throws one.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.fit(int, org.apache.commons.math.optimization.fitting.ParametricRealFunction, double[])",
      "begin_line": 146,
      "end_line": 165,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * parametric function throws one.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 59)",
        "(line 150,col 9)-(line 150,col 59)",
        "(line 151,col 9)-(line 151,col 18)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 159,col 9)-(line 161,col 62)",
        "(line 164,col 9)-(line 164,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction"
      ],
      "begin_line": 168,
      "end_line": 207,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math.optimization.fitting.ParametricRealFunction)",
      "begin_line": 176,
      "end_line": 178,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.jacobian()",
      "begin_line": 181,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 13)-(line 193,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-f2e1538d-fcb6-4255-8773-87a85044ac68.value(double[])",
      "begin_line": 183,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 184,col 21)-(line 184,col 82)",
        "(line 186,col 21)-(line 186,col 30)",
        "(line 187,col 21)-(line 189,col 21)",
        "(line 191,col 21)-(line 191,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 197,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 68)",
        "(line 200,col 13)-(line 200,col 22)",
        "(line 201,col 13)-(line 203,col 13)",
        "(line 205,col 13)-(line 205,col 26)"
      ]
    }
  ]
}