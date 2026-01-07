{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/fitting/HarmonicFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 134,
      "comment": " This class implements a curve fitting specialized for sinusoids.\n * \u003cp\u003eHarmonic fitting is a very simple case of curve fitting. The\n * estimated coefficients are the amplitude a, the pulsation \u0026omega; and\n * the phase \u0026phi;: \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e. They are\n * searched by a least square estimator initialized with a rough guess\n * based on integrals.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Fitter for the coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Values for amplitude, pulsation \u0026omega; and phase \u0026phi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 47,
      "end_line": 50,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 49)",
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer, double[])",
      "begin_line": 59,
      "end_line": 63,
      "comment": " Simple constructor.\n     * \u003cp\u003eThis constructor can be used when a first guess of the\n     * coefficients is already known.\u003c/p\u003e\n     * @param optimizer optimizer to use for the fitting\n     * @param initialGuess guessed values for amplitude (index 0),\n     * pulsation \u0026omega; (index 1) and phase \u0026phi; (index 2)\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 53)",
        "(line 62,col 9)-(line 62,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.addObservedPoint(double, double, double)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have P(x) as close as possible to this value\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.fit()",
      "begin_line": 80,
      "end_line": 108,
      "comment": " Fit an harmonic function to the observed points.\n     * @return harmonic function best fitting the observed points\n     * @throws OptimizationException if the sample is too short or if\n     * the first guess cannot be computed\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParametricHarmonicFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction"
      ],
      "begin_line": 111,
      "end_line": 132,
      "comment": " Parametric harmonic function. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.ParametricHarmonicFunction.value(double, double[])",
      "begin_line": 114,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 47)",
        "(line 116,col 13)-(line 116,col 47)",
        "(line 117,col 13)-(line 117,col 47)",
        "(line 118,col 13)-(line 118,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.ParametricHarmonicFunction.gradient(double, double[])",
      "begin_line": 122,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 47)",
        "(line 124,col 13)-(line 124,col 47)",
        "(line 125,col 13)-(line 125,col 47)",
        "(line 126,col 13)-(line 126,col 49)",
        "(line 127,col 13)-(line 127,col 56)",
        "(line 128,col 13)-(line 128,col 56)",
        "(line 129,col 13)-(line 129,col 79)"
      ]
    }
  ]
}