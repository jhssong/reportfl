{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/fitting/HarmonicFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 132,
      "comment": " This class implements a curve fitting specialized for sinusoids.\n * \u003cp\u003eHarmonic fitting is a very simple case of curve fitting. The\n * estimated coefficients are the amplitude a, the pulsation \u0026omega; and\n * the phase \u0026phi;: \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e. They are\n * searched by a least square estimator initialized with a rough guess\n * based on integrals.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Fitter for the coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Values for amplitude, pulsation \u0026omega; and phase \u0026phi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 45,
      "end_line": 48,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 49)",
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer, double[])",
      "begin_line": 57,
      "end_line": 61,
      "comment": " Simple constructor.\n     * \u003cp\u003eThis constructor can be used when a first guess of the\n     * coefficients is already known.\u003c/p\u003e\n     * @param optimizer optimizer to use for the fitting\n     * @param initialGuess guessed values for amplitude (index 0),\n     * pulsation \u0026omega; (index 1) and phase \u0026phi; (index 2)\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 53)",
        "(line 60,col 9)-(line 60,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.addObservedPoint(double, double, double)",
      "begin_line": 69,
      "end_line": 71,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have P(x) as close as possible to this value\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.fit()",
      "begin_line": 78,
      "end_line": 106,
      "comment": " Fit an harmonic function to the observed points.\n     * @return harmonic function best fitting the observed points\n     * @throws OptimizationException if the sample is too short or if\n     * the first guess cannot be computed\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParametricHarmonicFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction"
      ],
      "begin_line": 109,
      "end_line": 130,
      "comment": " Parametric harmonic function. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.ParametricHarmonicFunction.value(double, double[])",
      "begin_line": 112,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 47)",
        "(line 114,col 13)-(line 114,col 47)",
        "(line 115,col 13)-(line 115,col 47)",
        "(line 116,col 13)-(line 116,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.ParametricHarmonicFunction.gradient(double, double[])",
      "begin_line": 120,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 47)",
        "(line 122,col 13)-(line 122,col 47)",
        "(line 123,col 13)-(line 123,col 47)",
        "(line 124,col 13)-(line 124,col 49)",
        "(line 125,col 13)-(line 125,col 52)",
        "(line 126,col 13)-(line 126,col 52)",
        "(line 127,col 13)-(line 127,col 79)"
      ]
    }
  ]
}