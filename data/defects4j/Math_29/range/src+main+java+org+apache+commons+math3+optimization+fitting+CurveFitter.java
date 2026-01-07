{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 210,
      "comment": " Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cbr/\u003e\n * When a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\n *\n * @param \u003cT\u003e Function to use for the fit.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 55,
      "end_line": 58,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 35)",
        "(line 57,col 9)-(line 57,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 103,
      "end_line": 105,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.clearObservations()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(T, double[])",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(int, T, double[])",
      "begin_line": 148,
      "end_line": 167,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 59)",
        "(line 152,col 9)-(line 152,col 59)",
        "(line 153,col 9)-(line 153,col 18)",
        "(line 154,col 9)-(line 158,col 9)",
        "(line 161,col 9)-(line 163,col 62)",
        "(line 166,col 9)-(line 166,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 170,
      "end_line": 209,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 178,
      "end_line": 180,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.jacobian()",
      "begin_line": 183,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 13)-(line 195,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-f23cbe84-7f5d-4fcb-9179-43f9d27c8904.value(double[])",
      "begin_line": 185,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 186,col 21)-(line 186,col 82)",
        "(line 188,col 21)-(line 188,col 30)",
        "(line 189,col 21)-(line 191,col 21)",
        "(line 193,col 21)-(line 193,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 199,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 13)-(line 201,col 68)",
        "(line 202,col 13)-(line 202,col 22)",
        "(line 203,col 13)-(line 205,col 13)",
        "(line 207,col 13)-(line 207,col 26)"
      ]
    }
  ]
}