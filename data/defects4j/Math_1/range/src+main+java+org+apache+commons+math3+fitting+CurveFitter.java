{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 233,
      "comment": "\n * Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cbr/\u003e\n * When a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\n *\n * @param \u003cT\u003e Function to use for the fit.\n *\n * @version $Id: CurveFitter.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n * @deprecated As of 3.3. Please use {@link AbstractCurveFitter} and\n * {@link WeightedObservedPoints} instead.\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Simple constructor.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 68,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.addObservedPoint(org.apache.commons.math3.fitting.WeightedObservedPoint)",
      "begin_line": 104,
      "end_line": 106,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.getObservations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.clearObservations()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.fit(T, double[])",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.fit(int, T, double[])",
      "begin_line": 159,
      "end_line": 184,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 163,col 59)",
        "(line 164,col 9)-(line 164,col 18)",
        "(line 165,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 81)",
        "(line 175,col 9)-(line 181,col 65)",
        "(line 183,col 9)-(line 183,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 187,
      "end_line": 232,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.getModelFunction()",
      "begin_line": 201,
      "end_line": 215,
      "comment": "\n         * @return the model function values.\n         ",
      "child_ranges": [
        "(line 202,col 13)-(line 214,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-76b5683b-ae52-4f05-bfdc-0b31f794005f.value(double[])",
      "begin_line": 204,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 25)-(line 206,col 80)",
        "(line 207,col 25)-(line 207,col 34)",
        "(line 208,col 25)-(line 210,col 25)",
        "(line 212,col 25)-(line 212,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.getModelFunctionJacobian()",
      "begin_line": 220,
      "end_line": 231,
      "comment": "\n         * @return the model function Jacobian.\n         ",
      "child_ranges": [
        "(line 221,col 13)-(line 230,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.CurveFitter.TheoreticalValuesFunction.Anonymous-d1a91ee3-cd48-47e2-abe7-94ef530d9e76.value(double[])",
      "begin_line": 222,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 223,col 25)-(line 223,col 86)",
        "(line 224,col 25)-(line 224,col 34)",
        "(line 225,col 25)-(line 227,col 25)",
        "(line 228,col 25)-(line 228,col 40)"
      ]
    }
  ]
}