{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 299,
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
      "end_line": 74,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     * @deprecated as of 3.1 replaced by {@link #CurveFitter(MultivariateDifferentiableVectorOptimizer)}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 33)",
        "(line 73,col 9)-(line 73,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer)",
      "begin_line": 80,
      "end_line": 84,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 33)",
        "(line 82,col 9)-(line 82,col 38)",
        "(line 83,col 9)-(line 83,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 96,
      "end_line": 98,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 119,
      "end_line": 121,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.clearObservations()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(T, double[])",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(int, T, double[])",
      "begin_line": 174,
      "end_line": 199,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 178,col 59)",
        "(line 179,col 9)-(line 179,col 18)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 195,col 9)",
        "(line 198,col 9)-(line 198,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OldTheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 202,
      "end_line": 242,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.OldTheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 211,
      "end_line": 213,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.jacobian()",
      "begin_line": 216,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 13)-(line 228,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.Anonymous-5aea2e5b-e215-4de1-8efc-bfacccc2846e.value(double[])",
      "begin_line": 218,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 219,col 21)-(line 219,col 82)",
        "(line 221,col 21)-(line 221,col 30)",
        "(line 222,col 21)-(line 224,col 21)",
        "(line 226,col 21)-(line 226,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.value(double[])",
      "begin_line": 232,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 68)",
        "(line 235,col 13)-(line 235,col 22)",
        "(line 236,col 13)-(line 238,col 13)",
        "(line 240,col 13)-(line 240,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction"
      ],
      "begin_line": 245,
      "end_line": 297,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 253,
      "end_line": 255,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 258,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 68)",
        "(line 261,col 13)-(line 261,col 22)",
        "(line 262,col 13)-(line 264,col 13)",
        "(line 266,col 13)-(line 266,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 270,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 65)",
        "(line 274,col 13)-(line 276,col 13)",
        "(line 279,col 13)-(line 279,col 94)",
        "(line 280,col 13)-(line 280,col 22)",
        "(line 281,col 13)-(line 292,col 13)",
        "(line 294,col 13)-(line 294,col 26)"
      ]
    }
  ]
}