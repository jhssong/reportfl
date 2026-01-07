{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/optimization/fitting/CurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CurveFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 296,
      "comment": " Fitter for parametric univariate real functions y \u003d f(x).\n * \u003cbr/\u003e\n * When a univariate real function y \u003d f(x) does depend on some\n * unknown parameters p\u003csub\u003e0\u003c/sub\u003e, p\u003csub\u003e1\u003c/sub\u003e ... p\u003csub\u003en-1\u003c/sub\u003e,\n * this class can be used to find these parameters. It does this\n * by \u003cem\u003efitting\u003c/em\u003e the curve so it remains very close to a set of\n * observed points (x\u003csub\u003e0\u003c/sub\u003e, y\u003csub\u003e0\u003c/sub\u003e), (x\u003csub\u003e1\u003c/sub\u003e,\n * y\u003csub\u003e1\u003c/sub\u003e) ... (x\u003csub\u003ek-1\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e). This fitting\n * is done by finding the parameters values that minimizes the objective\n * function \u0026sum;(y\u003csub\u003ei\u003c/sub\u003e-f(x\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e. This is\n * really a least squares problem.\n *\n * @param \u003cT\u003e Function to use for the fit.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "oldOptimizer"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": " Optimizer to use for the fitting.\n     * @deprecated as of 3.1 replaced by {@link #optimizer}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Optimizer to use for the fitting. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Observed points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 67,
      "end_line": 71,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     * @deprecated as of 3.1 replaced by {@link #CurveFitter(MultivariateDifferentiableVectorOptimizer)}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 38)",
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 70,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.CurveFitter(org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer)",
      "begin_line": 77,
      "end_line": 81,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)",
        "(line 79,col 9)-(line 79,col 38)",
        "(line 80,col 9)-(line 80,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double)",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Add an observed (x,y) point to the sample with unit weight.\n     * \u003cp\u003eCalling this method is equivalent to call\n     * {@code addObservedPoint(1.0, x, y)}.\u003c/p\u003e\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(double, double, double)",
      "begin_line": 106,
      "end_line": 108,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have f(x) as close as possible to this value\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.addObservedPoint(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 116,
      "end_line": 118,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param observed observed point to add\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #getObservations()\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.getObservations()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " Get the observed points.\n     * @return observed points\n     * @see #addObservedPoint(double, double)\n     * @see #addObservedPoint(double, double, double)\n     * @see #addObservedPoint(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.clearObservations()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Remove all observations.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(T, double[])",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.fit(int, T, double[])",
      "begin_line": 171,
      "end_line": 196,
      "comment": "\n     * Fit a curve.\n     * This method compute the coefficients of the curve that best\n     * fit the sample of observed points previously given through calls\n     * to the {@link #addObservedPoint(WeightedObservedPoint)\n     * addObservedPoint} method.\n     *\n     * @param f parametric function to fit.\n     * @param initialGuess first guess of the function parameters.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the fitted parameters.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the number of allowed evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 59)",
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 176,col 18)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 184,col 9)-(line 184,col 43)",
        "(line 185,col 9)-(line 192,col 9)",
        "(line 195,col 9)-(line 195,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OldTheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 199,
      "end_line": 239,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.OldTheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 208,
      "end_line": 210,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 209,col 13)-(line 209,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.jacobian()",
      "begin_line": 213,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 13)-(line 225,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.Anonymous-0be74b36-f547-4564-a4ab-67fc976edc2e.value(double[])",
      "begin_line": 215,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 216,col 21)-(line 216,col 82)",
        "(line 218,col 21)-(line 218,col 30)",
        "(line 219,col 21)-(line 221,col 21)",
        "(line 223,col 21)-(line 223,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.OldTheoreticalValuesFunction.value(double[])",
      "begin_line": 229,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 68)",
        "(line 232,col 13)-(line 232,col 22)",
        "(line 233,col 13)-(line 235,col 13)",
        "(line 237,col 13)-(line 237,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TheoreticalValuesFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction"
      ],
      "begin_line": 242,
      "end_line": 294,
      "comment": " Vectorial function computing function theoretical values. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Function to fit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.TheoreticalValuesFunction(org.apache.commons.math3.analysis.ParametricUnivariateFunction)",
      "begin_line": 250,
      "end_line": 252,
      "comment": " Simple constructor.\n         * @param f function to fit.\n         ",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(double[])",
      "begin_line": 255,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 68)",
        "(line 258,col 13)-(line 258,col 22)",
        "(line 259,col 13)-(line 261,col 13)",
        "(line 263,col 13)-(line 263,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.CurveFitter.TheoreticalValuesFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 267,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 65)",
        "(line 271,col 13)-(line 273,col 13)",
        "(line 276,col 13)-(line 276,col 94)",
        "(line 277,col 13)-(line 277,col 22)",
        "(line 278,col 13)-(line 289,col 13)",
        "(line 291,col 13)-(line 291,col 26)"
      ]
    }
  ]
}