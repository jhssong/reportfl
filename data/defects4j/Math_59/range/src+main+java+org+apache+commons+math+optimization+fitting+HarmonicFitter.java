{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/optimization/fitting/HarmonicFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFitter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 128,
      "comment": " This class implements a curve fitting specialized for sinusoids.\n * \u003cp\u003eHarmonic fitting is a very simple case of curve fitting. The\n * estimated coefficients are the amplitude a, the pulsation \u0026omega; and\n * the phase \u0026phi;: \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e. They are\n * searched by a least square estimator initialized with a rough guess\n * based on integrals.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "fitter"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Fitter for the coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Values for amplitude, pulsation \u0026omega; and phase \u0026phi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 46,
      "end_line": 49,
      "comment": " Simple constructor.\n     * @param optimizer optimizer to use for the fitting\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 49)",
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer, double[])",
      "begin_line": 58,
      "end_line": 62,
      "comment": " Simple constructor.\n     * \u003cp\u003eThis constructor can be used when a first guess of the\n     * coefficients is already known.\u003c/p\u003e\n     * @param optimizer optimizer to use for the fitting\n     * @param initialGuess guessed values for amplitude (index 0),\n     * pulsation \u0026omega; (index 1) and phase \u0026phi; (index 2)\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 53)",
        "(line 61,col 9)-(line 61,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.addObservedPoint(double, double, double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": " Add an observed weighted (x,y) point to the sample.\n     * @param weight weight of the observed point in the fit\n     * @param x abscissa of the point\n     * @param y observed value of the point at x, after fitting we should\n     * have P(x) as close as possible to this value\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.fit()",
      "begin_line": 82,
      "end_line": 102,
      "comment": "\n     * Fit an harmonic function to the observed points.\n     *\n     * @return harmonic Function that best fits the observed points.\n     * @throws NumberIsTooSmallException if the sample is too short or if\n     * the first guess cannot be computed.\n     * @throws OptimizationException\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 83)",
        "(line 101,col 9)-(line 101,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParametricHarmonicFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction"
      ],
      "begin_line": 105,
      "end_line": 126,
      "comment": " Parametric harmonic function. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.ParametricHarmonicFunction.value(double, double[])",
      "begin_line": 108,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 47)",
        "(line 110,col 13)-(line 110,col 47)",
        "(line 111,col 13)-(line 111,col 47)",
        "(line 112,col 13)-(line 112,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFitter.ParametricHarmonicFunction.gradient(double, double[])",
      "begin_line": 116,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 47)",
        "(line 118,col 13)-(line 118,col 47)",
        "(line 119,col 13)-(line 119,col 47)",
        "(line 120,col 13)-(line 120,col 49)",
        "(line 121,col 13)-(line 121,col 56)",
        "(line 122,col 13)-(line 122,col 56)",
        "(line 123,col 13)-(line 123,col 79)"
      ]
    }
  ]
}