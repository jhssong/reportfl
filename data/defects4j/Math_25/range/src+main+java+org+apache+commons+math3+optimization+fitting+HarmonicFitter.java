{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/optimization/fitting/HarmonicFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric\u003e"
      ],
      "begin_line": 40,
      "end_line": 359,
      "comment": "\n * Class that implements a curve fitting specialized for sinusoids.\n *\n * Harmonic fitting is a very simple case of curve fitting. The\n * estimated coefficients are the amplitude a, the pulsation \u0026omega; and\n * the phase \u0026phi;: \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e. They are\n * searched by a least square estimator initialized with a rough guess\n * based on integrals.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Simple constructor.\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(double[])",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Fit an harmonic function to the observed points.\n     *\n     * @param initialGuess First guess values in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003eAmplitude\u003c/li\u003e\n     *  \u003cli\u003eAngular frequency\u003c/li\u003e\n     *  \u003cli\u003ePhase\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the parameters of the harmonic function that best fits the\n     * observed points (in the same order as above).\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Fit an harmonic function to the observed points.\n     * An initial guess will be automatically computed.\n     *\n     * @return the parameters of the harmonic function that best fits the\n     * observed points (see the other {@link #fit(double[]) fit} method.\n     * @throws NumberIsTooSmallException if the sample is too short for the\n     * the first guess to be computed.\n     * @throws ZeroException if the first guess cannot be computed because\n     * the abscissa range is zero.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 179,
      "end_line": 358,
      "comment": "\n     * This class guesses harmonic coefficients from a sample.\n     * \u003cp\u003eThe algorithm used to guess the coefficients is as follows:\u003c/p\u003e\n     *\n     * \u003cp\u003eWe know f (t) at some sampling points t\u003csub\u003ei\u003c/sub\u003e and want to find a,\n     * \u0026omega; and \u0026phi; such that f (t) \u003d a cos (\u0026omega; t + \u0026phi;).\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFrom the analytical expression, we can compute two primitives :\n     * \u003cpre\u003e\n     *     If2  (t) \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e  \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026times; [t + S (t)] / 2\n     *     If\u00272 (t) \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e \u0026times; [t - S (t)] / 2\n     *     where S (t) \u003d sin (2 (\u0026omega; t + \u0026phi;)) / (2 \u0026omega;)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eWe can remove S between these expressions :\n     * \u003cpre\u003e\n     *     If\u00272 (t) \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e t - \u0026omega;\u003csup\u003e2\u003c/sup\u003e If2 (t)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThe preceding expression shows that If\u00272 (t) is a linear\n     * combination of both t and If2 (t): If\u00272 (t) \u003d A \u0026times; t + B \u0026times; If2 (t)\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFrom the primitive, we can deduce the same form for definite\n     * integrals between t\u003csub\u003e1\u003c/sub\u003e and t\u003csub\u003ei\u003c/sub\u003e for each t\u003csub\u003ei\u003c/sub\u003e :\n     * \u003cpre\u003e\n     *   If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e) \u003d A \u0026times; (t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e) + B \u0026times; (If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e))\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eWe can find the coefficients A and B that best fit the sample\n     * to this linear expression by computing the definite integrals for\n     * each sample points.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFor a bilinear expression z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e) \u003d A \u0026times; x\u003csub\u003ei\u003c/sub\u003e + B \u0026times; y\u003csub\u003ei\u003c/sub\u003e, the\n     * coefficients A and B that minimize a least square criterion\n     * \u0026sum; (z\u003csub\u003ei\u003c/sub\u003e - z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e are given by these expressions:\u003c/p\u003e\n     * \u003cpre\u003e\n     *\n     *         \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *     A \u003d ------------------------\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     *\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *     B \u003d ------------------------\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     *\n     * \u003cp\u003eIn fact, we can assume both a and \u0026omega; are positive and\n     * compute them directly, knowing that A \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e and that\n     * B \u003d - \u0026omega;\u003csup\u003e2\u003c/sup\u003e. The complete algorithm is therefore:\u003c/p\u003e\n     * \u003cpre\u003e\n     *\n     * for each t\u003csub\u003ei\u003c/sub\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003en-1\u003c/sub\u003e, compute:\n     *   f  (t\u003csub\u003ei\u003c/sub\u003e)\n     *   f\u0027 (t\u003csub\u003ei\u003c/sub\u003e) \u003d (f (t\u003csub\u003ei+1\u003c/sub\u003e) - f(t\u003csub\u003ei-1\u003c/sub\u003e)) / (t\u003csub\u003ei+1\u003c/sub\u003e - t\u003csub\u003ei-1\u003c/sub\u003e)\n     *   x\u003csub\u003ei\u003c/sub\u003e \u003d t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e\n     *   y\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n     *   z\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n     *   update the sums \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e, \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e and \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * end for\n     *\n     *            |--------------------------\n     *         \\  | \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * a     \u003d  \\ | ------------------------\n     *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *\n     *\n     *            |--------------------------\n     *         \\  | \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * \u0026omega;     \u003d  \\ | ------------------------\n     *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     *\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eOnce we know \u0026omega;, we can compute:\n     * \u003cpre\u003e\n     *    fc \u003d \u0026omega; f (t) cos (\u0026omega; t) - f\u0027 (t) sin (\u0026omega; t)\n     *    fs \u003d \u0026omega; f (t) sin (\u0026omega; t) + f\u0027 (t) cos (\u0026omega; t)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eIt appears that \u003ccode\u003efc \u003d a \u0026omega; cos (\u0026phi;)\u003c/code\u003e and\n     * \u003ccode\u003efs \u003d -a \u0026omega; sin (\u0026phi;)\u003c/code\u003e, so we can use these\n     * expressions to compute \u0026phi;. The best estimate over the sample is\n     * given by averaging these expressions.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSince integrals and means are involved in the preceding\n     * estimations, these operations run in O(n) time, where n is the\n     * number of measurements.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Sampled observations. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Amplitude. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " Angular frequency. "
    },
    {
      "type": "field",
      "varNames": [
        "phi"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Phase. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.ParameterGuesser(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 195,
      "end_line": 202,
      "comment": "\n         * Simple constructor.\n         * @param observations sampled observations\n         * @throws NumberIsTooSmallException if the sample is too short or if\n         * the first guess cannot be computed.\n         ",
      "child_ranges": [
        "(line 196,col 13)-(line 199,col 13)",
        "(line 201,col 13)-(line 201,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.guess()",
      "begin_line": 214,
      "end_line": 219,
      "comment": "\n         * Estimate a first guess of the coefficients.\n         *\n         * @return the guessed coefficients, in the following order:\n         * \u003cul\u003e\n         *  \u003cli\u003eAmplitude\u003c/li\u003e\n         *  \u003cli\u003eAngular frequency\u003c/li\u003e\n         *  \u003cli\u003ePhase\u003c/li\u003e\n         * \u003c/ul\u003e\n         ",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 31)",
        "(line 216,col 13)-(line 216,col 26)",
        "(line 217,col 13)-(line 217,col 23)",
        "(line 218,col 13)-(line 218,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.sortObservations()",
      "begin_line": 224,
      "end_line": 246,
      "comment": "\n         * Sort the observations with respect to the abscissa.\n         ",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 57)",
        "(line 229,col 13)-(line 245,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.guessAOmega()",
      "begin_line": 257,
      "end_line": 329,
      "comment": "\n         * Estimate a first guess of the amplitude and angular frequency.\n         * This method assumes that the {@link #sortObservations()} method\n         * has been called previously.\n         *\n         * @throws ZeroException if the abscissa range is zero.\n         * @throws MathIllegalStateException when the guessing procedure cannot\n         * produce sensible results.\n         ",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 27)",
        "(line 260,col 13)-(line 260,col 27)",
        "(line 261,col 13)-(line 261,col 27)",
        "(line 262,col 13)-(line 262,col 27)",
        "(line 263,col 13)-(line 263,col 27)",
        "(line 265,col 13)-(line 265,col 53)",
        "(line 266,col 13)-(line 266,col 53)",
        "(line 267,col 13)-(line 267,col 34)",
        "(line 268,col 13)-(line 268,col 39)",
        "(line 269,col 13)-(line 269,col 43)",
        "(line 270,col 13)-(line 294,col 13)",
        "(line 297,col 13)-(line 297,col 46)",
        "(line 298,col 13)-(line 298,col 46)",
        "(line 299,col 13)-(line 299,col 46)",
        "(line 300,col 13)-(line 328,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.guessPhi()",
      "begin_line": 334,
      "end_line": 357,
      "comment": "\n         * Estimate a first guess of the phase.\n         ",
      "child_ranges": [
        "(line 336,col 13)-(line 336,col 30)",
        "(line 337,col 13)-(line 337,col 30)",
        "(line 339,col 13)-(line 339,col 53)",
        "(line 340,col 13)-(line 340,col 53)",
        "(line 341,col 13)-(line 354,col 13)",
        "(line 356,col 13)-(line 356,col 50)"
      ]
    }
  ]
}