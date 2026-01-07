{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/analysis/function/HarmonicOscillator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicOscillator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 34,
      "end_line": 154,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Harmonic_oscillator\"\u003e\n *  simple harmonic oscillator\u003c/a\u003e function.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "amplitude"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Amplitude. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Angular frequency. "
    },
    {
      "type": "field",
      "varNames": [
        "phase"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Phase. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.HarmonicOscillator(double, double, double)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "\n     * Harmonic oscillator function.\n     *\n     * @param amplitude Amplitude.\n     * @param omega Angular frequency.\n     * @param phase Phase.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 35)",
        "(line 53,col 9)-(line 53,col 27)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.value(double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.derivative()",
      "begin_line": 63,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 69,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.Anonymous-7a1ec3c3-eba7-42f4-b948-623d89e60602.value(double)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 17)-(line 67,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 81,
      "end_line": 143,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the harmonic oscillator function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eAmplitude\u003c/li\u003e\n     *  \u003cli\u003eAngular frequency\u003c/li\u003e\n     *  \u003cli\u003ePhase\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric.value(double, double...)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n         * Computes the value of the harmonic oscillator at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of norm, mean and standard deviation.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         ",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 38)",
        "(line 94,col 13)-(line 94,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric.gradient(double, double...)",
      "begin_line": 110,
      "end_line": 123,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (amplitude, angular frequency and phase).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values of amplitude, angular frequency and phase.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         ",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 38)",
        "(line 113,col 13)-(line 113,col 46)",
        "(line 114,col 13)-(line 114,col 42)",
        "(line 115,col 13)-(line 115,col 42)",
        "(line 117,col 13)-(line 117,col 66)",
        "(line 118,col 13)-(line 118,col 79)",
        "(line 119,col 13)-(line 119,col 77)",
        "(line 120,col 13)-(line 120,col 35)",
        "(line 122,col 13)-(line 122,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric.validateParameters(double[])",
      "begin_line": 135,
      "end_line": 142,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values of norm, mean and standard deviation.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         ",
      "child_ranges": [
        "(line 136,col 13)-(line 138,col 13)",
        "(line 139,col 13)-(line 141,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.value(double, double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * @param xTimesOmegaPlusPhase {@code omega * x + phase}.\n     * @param amplitude Amplitude.\n     * @return the value of the harmonic oscillator function at {@code x}.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 62)"
      ]
    }
  ]
}