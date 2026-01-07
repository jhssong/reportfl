{
  "filepath": "/tmp/Math-75b/src/main/java/org/apache/commons/math/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 192,
      "comment": " Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cp\u003eWhen a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 54,
      "end_line": 57,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 35)",
        "(line 56,col 9)-(line 56,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 69,
      "end_line": 71,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * \u003ccode\u003eaddObservedPoint(1.0, x, y)\u003c/code\u003e.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 92,
      "end_line": 94,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.fit(org.apache.commons.math.optimization.fitting.ParametricRealFunction, double[])",
      "begin_line": 119,
      "end_line": 140,
      "comment": " Fit a curve.\n     * \u003cp\u003eThis method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\u003c/p\u003e\n     * @param f parametric function to fit\n     * @param initialGuess first guess of the function parameters\n     * @return fitted parameters\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 59)",
        "(line 125,col 9)-(line 125,col 59)",
        "(line 126,col 9)-(line 126,col 18)",
        "(line 127,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 135,col 96)",
        "(line 138,col 9)-(line 138,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction"
      ],
      "begin_line": 143,
      "end_line": 190,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math.optimization.fitting.ParametricRealFunction)",
      "begin_line": 152,
      "end_line": 154,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.jacobian()",
      "begin_line": 157,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 13)-(line 172,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-b19b5c60-3c23-4aa0-b337-0afd09b3bfdf.value(double[])",
      "begin_line": 159,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 162,col 21)-(line 162,col 82)",
        "(line 164,col 21)-(line 164,col 30)",
        "(line 165,col 21)-(line 167,col 21)",
        "(line 169,col 21)-(line 169,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 176,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 68)",
        "(line 181,col 13)-(line 181,col 22)",
        "(line 182,col 13)-(line 184,col 13)",
        "(line 186,col 13)-(line 186,col 26)"
      ]
    }
  ]
}