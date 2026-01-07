{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/fitting/HarmonicCoefficientsGuesser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicCoefficientsGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 127,
      "end_line": 302,
      "comment": " This class guesses harmonic coefficients from a sample.\n\n * \u003cp\u003eThe algorithm used to guess the coefficients is as follows:\u003c/p\u003e\n\n * \u003cp\u003eWe know f (t) at some sampling points t\u003csub\u003ei\u003c/sub\u003e and want to find a,\n * \u0026omega; and \u0026phi; such that f (t) \u003d a cos (\u0026omega; t + \u0026phi;).\n * \u003c/p\u003e\n *\n * \u003cp\u003eFrom the analytical expression, we can compute two primitives :\n * \u003cpre\u003e\n *     If2  (t) \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e  \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026times; [t + S (t)] / 2\n *     If\u00272 (t) \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e \u0026times; [t - S (t)] / 2\n *     where S (t) \u003d sin (2 (\u0026omega; t + \u0026phi;)) / (2 \u0026omega;)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003eWe can remove S between these expressions :\n * \u003cpre\u003e\n *     If\u00272 (t) \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e t - \u0026omega;\u003csup\u003e2\u003c/sup\u003e If2 (t)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003eThe preceding expression shows that If\u00272 (t) is a linear\n * combination of both t and If2 (t): If\u00272 (t) \u003d A \u0026times; t + B \u0026times; If2 (t)\n * \u003c/p\u003e\n *\n * \u003cp\u003eFrom the primitive, we can deduce the same form for definite\n * integrals between t\u003csub\u003e1\u003c/sub\u003e and t\u003csub\u003ei\u003c/sub\u003e for each t\u003csub\u003ei\u003c/sub\u003e :\n * \u003cpre\u003e\n *   If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e) \u003d A \u0026times; (t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e) + B \u0026times; (If2 (t\u003csub\u003ei\u003c/sub\u003e) - If2 (t\u003csub\u003e1\u003c/sub\u003e))\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003eWe can find the coefficients A and B that best fit the sample\n * to this linear expression by computing the definite integrals for\n * each sample points.\n * \u003c/p\u003e\n *\n * \u003cp\u003eFor a bilinear expression z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e) \u003d A \u0026times; x\u003csub\u003ei\u003c/sub\u003e + B \u0026times; y\u003csub\u003ei\u003c/sub\u003e, the\n * coefficients A and B that minimize a least square criterion\n * \u0026sum; (z\u003csub\u003ei\u003c/sub\u003e - z (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e))\u003csup\u003e2\u003c/sup\u003e are given by these expressions:\u003c/p\u003e\n * \u003cpre\u003e\n *\n *         \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n *     A \u003d ------------------------\n *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n *\n *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n *     B \u003d ------------------------\n *         \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n *\n * \u003cp\u003eIn fact, we can assume both a and \u0026omega; are positive and\n * compute them directly, knowing that A \u003d a\u003csup\u003e2\u003c/sup\u003e \u0026omega;\u003csup\u003e2\u003c/sup\u003e and that\n * B \u003d - \u0026omega;\u003csup\u003e2\u003c/sup\u003e. The complete algorithm is therefore:\u003c/p\u003e\n * \u003cpre\u003e\n *\n * for each t\u003csub\u003ei\u003c/sub\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003en-1\u003c/sub\u003e, compute:\n *   f  (t\u003csub\u003ei\u003c/sub\u003e)\n *   f\u0027 (t\u003csub\u003ei\u003c/sub\u003e) \u003d (f (t\u003csub\u003ei+1\u003c/sub\u003e) - f(t\u003csub\u003ei-1\u003c/sub\u003e)) / (t\u003csub\u003ei+1\u003c/sub\u003e - t\u003csub\u003ei-1\u003c/sub\u003e)\n *   x\u003csub\u003ei\u003c/sub\u003e \u003d t\u003csub\u003ei\u003c/sub\u003e - t\u003csub\u003e1\u003c/sub\u003e\n *   y\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n *   z\u003csub\u003ei\u003c/sub\u003e \u003d \u0026int; f\u0027\u003csup\u003e2\u003c/sup\u003e from t\u003csub\u003e1\u003c/sub\u003e to t\u003csub\u003ei\u003c/sub\u003e\n *   update the sums \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e, \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e, \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e and \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n * end for\n *\n *            |--------------------------\n *         \\  | \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n * a     \u003d  \\ | ------------------------\n *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n *\n *\n *            |--------------------------\n *         \\  | \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ez\u003csub\u003ei\u003c/sub\u003e\n * \u0026omega;     \u003d  \\ | ------------------------\n *           \\| \u0026sum;x\u003csub\u003ei\u003c/sub\u003ex\u003csub\u003ei\u003c/sub\u003e \u0026sum;y\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e - \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e \u0026sum;x\u003csub\u003ei\u003c/sub\u003ey\u003csub\u003ei\u003c/sub\u003e\n *\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n * \u003cp\u003eOnce we know \u0026omega;, we can compute:\n * \u003cpre\u003e\n *    fc \u003d \u0026omega; f (t) cos (\u0026omega; t) - f\u0027 (t) sin (\u0026omega; t)\n *    fs \u003d \u0026omega; f (t) sin (\u0026omega; t) + f\u0027 (t) cos (\u0026omega; t)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n * \u003cp\u003eIt appears that \u003ccode\u003efc \u003d a \u0026omega; cos (\u0026phi;)\u003c/code\u003e and\n * \u003ccode\u003efs \u003d -a \u0026omega; sin (\u0026phi;)\u003c/code\u003e, so we can use these\n * expressions to compute \u0026phi;. The best estimate over the sample is\n * given by averaging these expressions.\n * \u003c/p\u003e\n\n * \u003cp\u003eSince integrals and means are involved in the preceding\n * estimations, these operations run in O(n) time, where n is the\n * number of measurements.\u003c/p\u003e\n\n * @version $Revision$ $Date$\n * @since 2.0\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Sampled observations. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Guessed amplitude. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Guessed pulsation \u0026omega;. "
    },
    {
      "type": "field",
      "varNames": [
        "phi"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Guessed phase \u0026phi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.HarmonicCoefficientsGuesser(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 144,
      "end_line": 148,
      "comment": " Simple constructor.\n     * @param observations sampled observations\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 146,col 39)",
        "(line 147,col 9)-(line 147,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.guess()",
      "begin_line": 155,
      "end_line": 159,
      "comment": " Estimate a first guess of the coefficients.\n     * @exception OptimizationException if the sample is too short or if\n     * the first guess cannot be computed (when the elements under the\n     * square roots are negative).\n     * ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 157,col 22)",
        "(line 158,col 9)-(line 158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.sortObservations()",
      "begin_line": 163,
      "end_line": 189,
      "comment": " Sort the observations with respect to the abscissa.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 53)",
        "(line 169,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.guessAOmega()",
      "begin_line": 196,
      "end_line": 248,
      "comment": " Estimate a first guess of the a and \u0026omega; coefficients.\n     * @exception OptimizationException if the sample is too short or if\n     * the first guess cannot be computed (when the elements under the\n     * square roots are negative).\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 25)",
        "(line 200,col 9)-(line 200,col 25)",
        "(line 201,col 9)-(line 201,col 25)",
        "(line 202,col 9)-(line 202,col 25)",
        "(line 203,col 9)-(line 203,col 25)",
        "(line 205,col 9)-(line 205,col 56)",
        "(line 206,col 9)-(line 206,col 56)",
        "(line 207,col 9)-(line 207,col 35)",
        "(line 208,col 9)-(line 208,col 35)",
        "(line 209,col 9)-(line 209,col 39)",
        "(line 210,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 239,col 42)",
        "(line 240,col 9)-(line 240,col 42)",
        "(line 241,col 9)-(line 241,col 42)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 39)",
        "(line 246,col 9)-(line 246,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.guessPhi()",
      "begin_line": 252,
      "end_line": 279,
      "comment": " Estimate a first guess of the \u0026phi; coefficient.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 28)",
        "(line 256,col 9)-(line 256,col 28)",
        "(line 258,col 9)-(line 258,col 49)",
        "(line 259,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.getGuessedAmplitude()",
      "begin_line": 284,
      "end_line": 286,
      "comment": " Get the guessed amplitude a.\n     * @return guessed amplitude a;\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.getGuessedPulsation()",
      "begin_line": 291,
      "end_line": 293,
      "comment": " Get the guessed pulsation \u0026omega;.\n     * @return guessed pulsation \u0026omega;\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicCoefficientsGuesser.getGuessedPhase()",
      "begin_line": 298,
      "end_line": 300,
      "comment": " Get the guessed phase \u0026phi;.\n     * @return guessed phase \u0026phi;\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 19)"
      ]
    }
  ]
}