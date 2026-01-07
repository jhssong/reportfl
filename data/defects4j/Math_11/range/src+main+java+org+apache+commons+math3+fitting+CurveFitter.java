{
  "filepath": "/tmp/Math-11b/src/main/java/org/apache/commons/math3/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 230,
      "comment": "\n * Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cbr/\u003e\n * When a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\n *\n * @param \u003cT\u003e Function to use for the fit.\n *\n * @version $Id: CurveFitter.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Simple constructor.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 35)",
        "(line 65,col 9)-(line 65,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.addObservedPoint(org.apache.commons.math3.fitting.WeightedObservedPoint)",
      "begin_line": 101,
      "end_line": 103,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.getObservations()",
      "begin_line": 111,
      "end_line": 113,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.clearObservations()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.fit(T, double[])",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.fit(int, T, double[])",
      "begin_line": 156,
      "end_line": 181,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 59)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 161,col 9)-(line 161,col 18)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 81)",
        "(line 172,col 9)-(line 178,col 65)",
        "(line 180,col 9)-(line 180,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 184,
      "end_line": 229,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.getModelFunction()",
      "begin_line": 198,
      "end_line": 212,
      "comment": "\n         * @return the model function values.\n         ",
      "child_ranges": [
        "(line 199,col 13)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-7ec41fd4-49d6-4366-b9a5-889a3262dca3.value(double[])",
      "begin_line": 201,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 25)-(line 203,col 80)",
        "(line 204,col 25)-(line 204,col 34)",
        "(line 205,col 25)-(line 207,col 25)",
        "(line 209,col 25)-(line 209,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.getModelFunctionJacobian()",
      "begin_line": 217,
      "end_line": 228,
      "comment": "\n         * @return the model function Jacobian.\n         ",
      "child_ranges": [
        "(line 218,col 13)-(line 227,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-3feeb732-3b09-4423-9b77-80ccbb9fd706.value(double[])",
      "begin_line": 219,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 220,col 25)-(line 220,col 86)",
        "(line 221,col 25)-(line 221,col 34)",
        "(line 222,col 25)-(line 224,col 25)",
        "(line 225,col 25)-(line 225,col 40)"
      ]
    }
  ]
}