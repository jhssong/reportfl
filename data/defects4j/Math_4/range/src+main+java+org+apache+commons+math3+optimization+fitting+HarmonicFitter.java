{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/fitting/HarmonicFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric\u003e"
      ],
      "begin_line": 41,
      "end_line": 385,
      "comment": "\n * Class that implements a curve fitting specialized for sinusoids.\n *\n * Harmonic fitting is a very simple case of curve fitting. The\n * estimated coefficients are the amplitude a, the pulsation \u0026omega; and\n * the phase \u0026phi;: \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e. They are\n * searched by a least square estimator initialized with a rough guess\n * based on integrals.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Simple constructor.\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(double[])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Fit an harmonic function to the observed points.\n     *\n     * @param initialGuess First guess values in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003eAmplitude\u003c/li\u003e\n     *  \u003cli\u003eAngular frequency\u003c/li\u003e\n     *  \u003cli\u003ePhase\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the parameters of the harmonic function that best fits the\n     * observed points (in the same order as above).\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Fit an harmonic function to the observed points.\n     * An initial guess will be automatically computed.\n     *\n     * @return the parameters of the harmonic function that best fits the\n     * observed points (see the other {@link #fit(double[]) fit} method.\n     * @throws NumberIsTooSmallException if the sample is too short for the\n     * the first guess to be computed.\n     * @throws ZeroException if the first guess cannot be computed because\n     * the abscissa range is zero.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 181,
      "end_line": 384,
      "comment": "\n     * This class guesses harmonic coefficients from a sample.\n     * \u003cp\u003eThe algorithm used to guess the coefficients is as follows:\u003c/p\u003e\n     *\n     * \u003cp\u003eWe know f (t) at some sampling points t\u003csub\u003ei\u003c/sub\u003e and want to find a,\n     * \u0026omega; and \u0026phi; such that f (t) \u003d a cos (\u0026omega; t + \u0026phi;).\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFrom the analytical expression, we can compute two primitives :\n     * \u003cpre\u003e\n     *     If2  (t) \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e  \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026times; [t + S (t)] / 2\n     *     If\u00272 (t) \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e \u0026times; [t - S (t)] / 2\n     *     where S (t) \u003d sin (2 (\u0026omega; t + \u0026phi;)) / (2 \u0026omega;)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eWe can remove S between these expressions :\n     * \u003cpre\u003e\n     *     If\u00272 (t) \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e t - \u0026omega;\u003csup\u003e2\u003c/sup\u003e If2 (t)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThe preceding expression shows that If\u00272 (t) is a linear\n     * combination of both t and If2 (t): If\u00272 (t) \u003d A \u0026times; t + B \u0026times; If2 (t)\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFrom the primitive, we can deduce the same form for definite\n     * integrals between t\u003csub\u003e1\u003c/sub\u003e and t\u003csub\u003ei\u003c/sub\u003e for each t\u003csub\u003ei\u003c/sub\u003e :\n     * \u003cpre\u003e\n     *   If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e) \u003d A \u0026times; (t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e) + B \u0026times; (If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e))\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eWe can find the coefficients A and B that best fit the sample\n     * to this linear expression by computing the definite integrals for\n     * each sample points.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFor a bilinear expression z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e) \u003d A \u0026times; x\u003csub\u003ei\u003c/sub\u003e + B \u0026times; y\u003csub\u003ei\u003c/sub\u003e, the\n     * coefficients A and B that minimize a least square criterion\n     * \u0026sum; (z\u003csub\u003ei\u003c/sub\u003e - z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e are given by these expressions:\u003c/p\u003e\n     * \u003cpre\u003e\n     *\n     *         \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *     A \u003d ------------------------\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     *\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *     B \u003d ------------------------\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     *\n     * \u003cp\u003eIn fact, we can assume both a and \u0026omega; are positive and\n     * compute them directly, knowing that A \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e and that\n     * B \u003d - \u0026omega;\u003csup\u003e2\u003c/sup\u003e. The complete algorithm is therefore:\u003c/p\u003e\n     * \u003cpre\u003e\n     *\n     * for each t\u003csub\u003ei\u003c/sub\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003en-1\u003c/sub\u003e, compute:\n     *   f  (t\u003csub\u003ei\u003c/sub\u003e)\n     *   f\u0027 (t\u003csub\u003ei\u003c/sub\u003e) \u003d (f (t\u003csub\u003ei+1\u003c/sub\u003e) - f(t\u003csub\u003ei-1\u003c/sub\u003e)) / (t\u003csub\u003ei+1\u003c/sub\u003e - t\u003csub\u003ei-1\u003c/sub\u003e)\n     *   x\u003csub\u003ei\u003c/sub\u003e \u003d t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e\n     *   y\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n     *   z\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n     *   update the sums \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e, \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e and \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * end for\n     *\n     *            |--------------------------\n     *         \\  | \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * a     \u003d  \\ | ------------------------\n     *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *\n     *\n     *            |--------------------------\n     *         \\  | \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * \u0026omega;     \u003d  \\ | ------------------------\n     *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     *\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eOnce we know \u0026omega;, we can compute:\n     * \u003cpre\u003e\n     *    fc \u003d \u0026omega; f (t) cos (\u0026omega; t) - f\u0027 (t) sin (\u0026omega; t)\n     *    fs \u003d \u0026omega; f (t) sin (\u0026omega; t) + f\u0027 (t) cos (\u0026omega; t)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eIt appears that \u003ccode\u003efc \u003d a \u0026omega; cos (\u0026phi;)\u003c/code\u003e and\n     * \u003ccode\u003efs \u003d -a \u0026omega; sin (\u0026phi;)\u003c/code\u003e, so we can use these\n     * expressions to compute \u0026phi;. The best estimate over the sample is\n     * given by averaging these expressions.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSince integrals and means are involved in the preceding\n     * estimations, these operations run in O(n) time, where n is the\n     * number of measurements.\u003c/p\u003e\n     "
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
      "begin_line": 198,
      "end_line": 211,
      "comment": "\n         * Simple constructor.\n         *\n         * @param observations Sampled observations.\n         * @throws NumberIsTooSmallException if the sample is too short.\n         * @throws ZeroException if the abscissa range is zero.\n         * @throws MathIllegalStateException when the guessing procedure cannot\n         * produce sensible results.\n         ",
      "child_ranges": [
        "(line 199,col 13)-(line 202,col 13)",
        "(line 204,col 13)-(line 204,col 82)",
        "(line 206,col 13)-(line 206,col 56)",
        "(line 207,col 13)-(line 207,col 26)",
        "(line 208,col 13)-(line 208,col 30)",
        "(line 210,col 13)-(line 210,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.guess()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n         * Gets an estimation of the parameters.\n         *\n         * @return the guessed parameters, in the following order:\n         * \u003cul\u003e\n         *  \u003cli\u003eAmplitude\u003c/li\u003e\n         *  \u003cli\u003eAngular frequency\u003c/li\u003e\n         *  \u003cli\u003ePhase\u003c/li\u003e\n         * \u003c/ul\u003e\n         ",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.sortObservations(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 233,
      "end_line": 259,
      "comment": "\n         * Sort the observations with respect to the abscissa.\n         *\n         * @param unsorted Input observations.\n         * @return the input observations, sorted.\n         ",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 74)",
        "(line 239,col 13)-(line 239,col 57)",
        "(line 240,col 13)-(line 256,col 13)",
        "(line 258,col 13)-(line 258,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.guessAOmega(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 273,
      "end_line": 352,
      "comment": "\n         * Estimate a first guess of the amplitude and angular frequency.\n         * This method assumes that the {@link #sortObservations()} method\n         * has been called previously.\n         *\n         * @param observations Observations, sorted w.r.t. abscissa.\n         * @throws ZeroException if the abscissa range is zero.\n         * @throws MathIllegalStateException when the guessing procedure cannot\n         * produce sensible results.\n         * @return the guessed amplitude (at index 0) and circular frequency\n         * (at index 1).\n         ",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 50)",
        "(line 277,col 13)-(line 277,col 27)",
        "(line 278,col 13)-(line 278,col 27)",
        "(line 279,col 13)-(line 279,col 27)",
        "(line 280,col 13)-(line 280,col 27)",
        "(line 281,col 13)-(line 281,col 27)",
        "(line 283,col 13)-(line 283,col 53)",
        "(line 284,col 13)-(line 284,col 53)",
        "(line 285,col 13)-(line 285,col 34)",
        "(line 286,col 13)-(line 286,col 39)",
        "(line 287,col 13)-(line 287,col 43)",
        "(line 288,col 13)-(line 312,col 13)",
        "(line 315,col 13)-(line 315,col 46)",
        "(line 316,col 13)-(line 316,col 46)",
        "(line 317,col 13)-(line 317,col 46)",
        "(line 318,col 13)-(line 349,col 13)",
        "(line 351,col 13)-(line 351,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser.guessPhi(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 360,
      "end_line": 383,
      "comment": "\n         * Estimate a first guess of the phase.\n         *\n         * @param observations Observations, sorted w.r.t. abscissa.\n         * @return the guessed phase.\n         ",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 30)",
        "(line 363,col 13)-(line 363,col 30)",
        "(line 365,col 13)-(line 365,col 53)",
        "(line 366,col 13)-(line 366,col 53)",
        "(line 367,col 13)-(line 380,col 13)",
        "(line 382,col 13)-(line 382,col 51)"
      ]
    }
  ]
}