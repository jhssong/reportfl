{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/HarmonicOscillator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicOscillator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 37,
      "end_line": 184,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Harmonic_oscillator\"\u003e\n *  simple harmonic oscillator\u003c/a\u003e function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "amplitude"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Amplitude. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Angular frequency. "
    },
    {
      "type": "field",
      "varNames": [
        "phase"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Phase. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.HarmonicOscillator(double, double, double)",
      "begin_line": 52,
      "end_line": 58,
      "comment": "\n     * Harmonic oscillator function.\n     *\n     * @param amplitude Amplitude.\n     * @param omega Angular frequency.\n     * @param phase Phase.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 35)",
        "(line 56,col 9)-(line 56,col 27)",
        "(line 57,col 9)-(line 57,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.value(double)",
      "begin_line": 61,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.derivative()",
      "begin_line": 68,
      "end_line": 71,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 82,
      "end_line": 150,
      "comment": "\n     * Parametric function where the input array contains the parameters of\n     * the harmonic oscillator function, ordered as follows:\n     * \u003cul\u003e\n     *  \u003cli\u003eAmplitude\u003c/li\u003e\n     *  \u003cli\u003eAngular frequency\u003c/li\u003e\n     *  \u003cli\u003ePhase\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric.value(double, double...)",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n         * Computes the value of the harmonic oscillator at {@code x}.\n         *\n         * @param x Value for which the function must be computed.\n         * @param param Values of norm, mean and standard deviation.\n         * @return the value of the function.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         ",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 38)",
        "(line 97,col 13)-(line 97,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric.gradient(double, double...)",
      "begin_line": 113,
      "end_line": 128,
      "comment": "\n         * Computes the value of the gradient at {@code x}.\n         * The components of the gradient vector are the partial\n         * derivatives of the function with respect to each of the\n         * \u003cem\u003eparameters\u003c/em\u003e (amplitude, angular frequency and phase).\n         *\n         * @param x Value at which the gradient must be computed.\n         * @param param Values of amplitude, angular frequency and phase.\n         * @return the gradient vector at {@code x}.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         ",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 38)",
        "(line 118,col 13)-(line 118,col 46)",
        "(line 119,col 13)-(line 119,col 42)",
        "(line 120,col 13)-(line 120,col 42)",
        "(line 122,col 13)-(line 122,col 66)",
        "(line 123,col 13)-(line 123,col 79)",
        "(line 124,col 13)-(line 124,col 77)",
        "(line 125,col 13)-(line 125,col 35)",
        "(line 127,col 13)-(line 127,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric.validateParameters(double[])",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n         * Validates parameters to ensure they are appropriate for the evaluation of\n         * the {@link #value(double,double[])} and {@link #gradient(double,double[])}\n         * methods.\n         *\n         * @param param Values of norm, mean and standard deviation.\n         * @throws NullArgumentException if {@code param} is {@code null}.\n         * @throws DimensionMismatchException if the size of {@code param} is\n         * not 3.\n         ",
      "child_ranges": [
        "(line 143,col 13)-(line 145,col 13)",
        "(line 146,col 13)-(line 148,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.value(double, double)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * @param xTimesOmegaPlusPhase {@code omega * x + phase}.\n     * @param amplitude Amplitude.\n     * @return the value of the harmonic oscillator function at {@code x}.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.HarmonicOscillator.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 165,
      "end_line": 182,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 170,col 9)-(line 170,col 47)",
        "(line 171,col 9)-(line 171,col 47)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 28)"
      ]
    }
  ]
}