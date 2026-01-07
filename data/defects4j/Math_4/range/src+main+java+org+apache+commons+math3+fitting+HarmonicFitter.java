{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fitting/HarmonicFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric\u003e"
      ],
      "begin_line": 39,
      "end_line": 382,
      "comment": "\n * Class that implements a curve fitting specialized for sinusoids.\n *\n * Harmonic fitting is a very simple case of curve fitting. The\n * estimated coefficients are the amplitude a, the pulsation \u0026omega; and\n * the phase \u0026phi;: \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e. They are\n * searched by a least square estimator initialized with a rough guess\n * based on integrals.\n *\n * @version $Id: HarmonicFitter.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.HarmonicFitter(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Simple constructor.\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.fit(double[])",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Fit an harmonic function to the observed points.\n     *\n     * @param initialGuess First guess values in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003eAmplitude\u003c/li\u003e\n     *  \u003cli\u003eAngular frequency\u003c/li\u003e\n     *  \u003cli\u003ePhase\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the parameters of the harmonic function that best fits the\n     * observed points (in the same order as above).\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.fit()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Fit an harmonic function to the observed points.\n     * An initial guess will be automatically computed.\n     *\n     * @return the parameters of the harmonic function that best fits the\n     * observed points (see the other {@link #fit(double[]) fit} method.\n     * @throws NumberIsTooSmallException if the sample is too short for the\n     * the first guess to be computed.\n     * @throws ZeroException if the first guess cannot be computed because\n     * the abscissa range is zero.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 178,
      "end_line": 381,
      "comment": "\n     * This class guesses harmonic coefficients from a sample.\n     * \u003cp\u003eThe algorithm used to guess the coefficients is as follows:\u003c/p\u003e\n     *\n     * \u003cp\u003eWe know f (t) at some sampling points t\u003csub\u003ei\u003c/sub\u003e and want to find a,\n     * \u0026omega; and \u0026phi; such that f (t) \u003d a cos (\u0026omega; t + \u0026phi;).\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFrom the analytical expression, we can compute two primitives :\n     * \u003cpre\u003e\n     *     If2  (t) \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e  \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026times; [t + S (t)] / 2\n     *     If\u00272 (t) \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e \u0026times; [t - S (t)] / 2\n     *     where S (t) \u003d sin (2 (\u0026omega; t + \u0026phi;)) / (2 \u0026omega;)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eWe can remove S between these expressions :\n     * \u003cpre\u003e\n     *     If\u00272 (t) \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e t - \u0026omega;\u003csup\u003e2\u003c/sup\u003e If2 (t)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThe preceding expression shows that If\u00272 (t) is a linear\n     * combination of both t and If2 (t): If\u00272 (t) \u003d A \u0026times; t + B \u0026times; If2 (t)\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFrom the primitive, we can deduce the same form for definite\n     * integrals between t\u003csub\u003e1\u003c/sub\u003e and t\u003csub\u003ei\u003c/sub\u003e for each t\u003csub\u003ei\u003c/sub\u003e :\n     * \u003cpre\u003e\n     *   If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e) \u003d A \u0026times; (t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e) + B \u0026times; (If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e))\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eWe can find the coefficients A and B that best fit the sample\n     * to this linear expression by computing the definite integrals for\n     * each sample points.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eFor a bilinear expression z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e) \u003d A \u0026times; x\u003csub\u003ei\u003c/sub\u003e + B \u0026times; y\u003csub\u003ei\u003c/sub\u003e, the\n     * coefficients A and B that minimize a least square criterion\n     * \u0026sum; (z\u003csub\u003ei\u003c/sub\u003e - z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e are given by these expressions:\u003c/p\u003e\n     * \u003cpre\u003e\n     *\n     *         \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *     A \u003d ------------------------\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     *\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *     B \u003d ------------------------\n     *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     *\n     * \u003cp\u003eIn fact, we can assume both a and \u0026omega; are positive and\n     * compute them directly, knowing that A \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e and that\n     * B \u003d - \u0026omega;\u003csup\u003e2\u003c/sup\u003e. The complete algorithm is therefore:\u003c/p\u003e\n     * \u003cpre\u003e\n     *\n     * for each t\u003csub\u003ei\u003c/sub\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003en-1\u003c/sub\u003e, compute:\n     *   f  (t\u003csub\u003ei\u003c/sub\u003e)\n     *   f\u0027 (t\u003csub\u003ei\u003c/sub\u003e) \u003d (f (t\u003csub\u003ei+1\u003c/sub\u003e) - f(t\u003csub\u003ei-1\u003c/sub\u003e)) / (t\u003csub\u003ei+1\u003c/sub\u003e - t\u003csub\u003ei-1\u003c/sub\u003e)\n     *   x\u003csub\u003ei\u003c/sub\u003e \u003d t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e\n     *   y\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n     *   z\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n     *   update the sums \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e, \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e and \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * end for\n     *\n     *            |--------------------------\n     *         \\  | \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * a     \u003d  \\ | ------------------------\n     *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     *\n     *\n     *            |--------------------------\n     *         \\  | \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n     * \u0026omega;     \u003d  \\ | ------------------------\n     *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n     *\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eOnce we know \u0026omega;, we can compute:\n     * \u003cpre\u003e\n     *    fc \u003d \u0026omega; f (t) cos (\u0026omega; t) - f\u0027 (t) sin (\u0026omega; t)\n     *    fs \u003d \u0026omega; f (t) sin (\u0026omega; t) + f\u0027 (t) cos (\u0026omega; t)\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eIt appears that \u003ccode\u003efc \u003d a \u0026omega; cos (\u0026phi;)\u003c/code\u003e and\n     * \u003ccode\u003efs \u003d -a \u0026omega; sin (\u0026phi;)\u003c/code\u003e, so we can use these\n     * expressions to compute \u0026phi;. The best estimate over the sample is\n     * given by averaging these expressions.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSince integrals and means are involved in the preceding\n     * estimations, these operations run in O(n) time, where n is the\n     * number of measurements.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Amplitude. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Angular frequency. "
    },
    {
      "type": "field",
      "varNames": [
        "phi"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Phase. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.ParameterGuesser.ParameterGuesser(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 195,
      "end_line": 208,
      "comment": "\n         * Simple constructor.\n         *\n         * @param observations Sampled observations.\n         * @throws NumberIsTooSmallException if the sample is too short.\n         * @throws ZeroException if the abscissa range is zero.\n         * @throws MathIllegalStateException when the guessing procedure cannot\n         * produce sensible results.\n         ",
      "child_ranges": [
        "(line 196,col 13)-(line 199,col 13)",
        "(line 201,col 13)-(line 201,col 82)",
        "(line 203,col 13)-(line 203,col 56)",
        "(line 204,col 13)-(line 204,col 26)",
        "(line 205,col 13)-(line 205,col 30)",
        "(line 207,col 13)-(line 207,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.ParameterGuesser.guess()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n         * Gets an estimation of the parameters.\n         *\n         * @return the guessed parameters, in the following order:\n         * \u003cul\u003e\n         *  \u003cli\u003eAmplitude\u003c/li\u003e\n         *  \u003cli\u003eAngular frequency\u003c/li\u003e\n         *  \u003cli\u003ePhase\u003c/li\u003e\n         * \u003c/ul\u003e\n         ",
      "child_ranges": [
        "(line 221,col 13)-(line 221,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.ParameterGuesser.sortObservations(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 230,
      "end_line": 256,
      "comment": "\n         * Sort the observations with respect to the abscissa.\n         *\n         * @param unsorted Input observations.\n         * @return the input observations, sorted.\n         ",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 74)",
        "(line 236,col 13)-(line 236,col 57)",
        "(line 237,col 13)-(line 253,col 13)",
        "(line 255,col 13)-(line 255,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.ParameterGuesser.guessAOmega(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 270,
      "end_line": 349,
      "comment": "\n         * Estimate a first guess of the amplitude and angular frequency.\n         * This method assumes that the {@link #sortObservations()} method\n         * has been called previously.\n         *\n         * @param observations Observations, sorted w.r.t. abscissa.\n         * @throws ZeroException if the abscissa range is zero.\n         * @throws MathIllegalStateException when the guessing procedure cannot\n         * produce sensible results.\n         * @return the guessed amplitude (at index 0) and circular frequency\n         * (at index 1).\n         ",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 50)",
        "(line 274,col 13)-(line 274,col 27)",
        "(line 275,col 13)-(line 275,col 27)",
        "(line 276,col 13)-(line 276,col 27)",
        "(line 277,col 13)-(line 277,col 27)",
        "(line 278,col 13)-(line 278,col 27)",
        "(line 280,col 13)-(line 280,col 53)",
        "(line 281,col 13)-(line 281,col 53)",
        "(line 282,col 13)-(line 282,col 34)",
        "(line 283,col 13)-(line 283,col 39)",
        "(line 284,col 13)-(line 284,col 43)",
        "(line 285,col 13)-(line 309,col 13)",
        "(line 312,col 13)-(line 312,col 46)",
        "(line 313,col 13)-(line 313,col 46)",
        "(line 314,col 13)-(line 314,col 46)",
        "(line 315,col 13)-(line 346,col 13)",
        "(line 348,col 13)-(line 348,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.HarmonicFitter.ParameterGuesser.guessPhi(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 357,
      "end_line": 380,
      "comment": "\n         * Estimate a first guess of the phase.\n         *\n         * @param observations Observations, sorted w.r.t. abscissa.\n         * @return the guessed phase.\n         ",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 30)",
        "(line 360,col 13)-(line 360,col 30)",
        "(line 362,col 13)-(line 362,col 53)",
        "(line 363,col 13)-(line 363,col 53)",
        "(line 364,col 13)-(line 377,col 13)",
        "(line 379,col 13)-(line 379,col 51)"
      ]
    }
  ]
}