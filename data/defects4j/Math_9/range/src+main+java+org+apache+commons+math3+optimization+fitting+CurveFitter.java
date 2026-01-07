{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 298,
      "comment": " Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cbr/\u003e\n * When a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\n *\n * @param \u003cT\u003e Function to use for the fit.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "oldOptimizer"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": " Optimizer to use for the fitting.\n     * @deprecated as of 3.1 replaced by {@link #optimizer}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 69,
      "end_line": 73,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     * @deprecated as of 3.1 replaced by {@link #CurveFitter(MultivariateDifferentiableVectorOptimizer)}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 38)",
        "(line 71,col 9)-(line 71,col 33)",
        "(line 72,col 9)-(line 72,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer)",
      "begin_line": 79,
      "end_line": 83,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 33)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 95,
      "end_line": 97,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 108,
      "end_line": 110,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 118,
      "end_line": 120,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 128,
      "end_line": 130,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.clearObservations()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(T, double[])",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(int, T, double[])",
      "begin_line": 173,
      "end_line": 198,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 59)",
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 178,col 18)",
        "(line 179,col 9)-(line 183,col 9)",
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OldTheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 201,
      "end_line": 241,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.OldTheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 210,
      "end_line": 212,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.jacobian()",
      "begin_line": 215,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 13)-(line 227,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.Anonymous-7443d710-7139-427e-b0b2-c6ef7d8f269a.value(double[])",
      "begin_line": 217,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 218,col 21)-(line 218,col 82)",
        "(line 220,col 21)-(line 220,col 30)",
        "(line 221,col 21)-(line 223,col 21)",
        "(line 225,col 21)-(line 225,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.value(double[])",
      "begin_line": 231,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 68)",
        "(line 234,col 13)-(line 234,col 22)",
        "(line 235,col 13)-(line 237,col 13)",
        "(line 239,col 13)-(line 239,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction"
      ],
      "begin_line": 244,
      "end_line": 296,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 252,
      "end_line": 254,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 257,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 68)",
        "(line 260,col 13)-(line 260,col 22)",
        "(line 261,col 13)-(line 263,col 13)",
        "(line 265,col 13)-(line 265,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 269,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 65)",
        "(line 273,col 13)-(line 275,col 13)",
        "(line 278,col 13)-(line 278,col 94)",
        "(line 279,col 13)-(line 279,col 22)",
        "(line 280,col 13)-(line 291,col 13)",
        "(line 293,col 13)-(line 293,col 26)"
      ]
    }
  ]
}