{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 199,
      "comment": " Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cp\u003eWhen a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 53,
      "end_line": 56,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 35)",
        "(line 55,col 9)-(line 55,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * \u003ccode\u003eaddObservedPoint(1.0, x, y)\u003c/code\u003e.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 91,
      "end_line": 93,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.clearObservations()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.fit(org.apache.commons.math.optimization.fitting.ParametricRealFunction, double[])",
      "begin_line": 127,
      "end_line": 147,
      "comment": " Fit a curve.\n     * \u003cp\u003eThis method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\u003c/p\u003e\n     * @param f parametric function to fit\n     * @param initialGuess first guess of the function parameters\n     * @return fitted parameters\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception org.apache.commons.math.exception.ConvergenceException\n     * if the algorithm failed to converge.\n     * @exception org.apache.commons.math.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 59)",
        "(line 133,col 9)-(line 133,col 59)",
        "(line 134,col 9)-(line 134,col 18)",
        "(line 135,col 9)-(line 139,col 9)",
        "(line 142,col 9)-(line 143,col 96)",
        "(line 146,col 9)-(line 146,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction"
      ],
      "begin_line": 150,
      "end_line": 197,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math.optimization.fitting.ParametricRealFunction)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.jacobian()",
      "begin_line": 164,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 13)-(line 179,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-8841d0fb-78f8-46a0-a493-dcb84a5e4a9a.value(double[])",
      "begin_line": 166,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 169,col 21)-(line 169,col 82)",
        "(line 171,col 21)-(line 171,col 30)",
        "(line 172,col 21)-(line 174,col 21)",
        "(line 176,col 21)-(line 176,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 183,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 68)",
        "(line 188,col 13)-(line 188,col 22)",
        "(line 189,col 13)-(line 191,col 13)",
        "(line 193,col 13)-(line 193,col 26)"
      ]
    }
  ]
}