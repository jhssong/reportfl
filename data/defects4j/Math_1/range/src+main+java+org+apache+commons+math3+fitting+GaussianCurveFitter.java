{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/GaussianCurveFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianCurveFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.AbstractCurveFitter\u003corg.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithStartPoint\u003corg.apache.commons.math3.fitting.GaussianCurveFitter\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithMaxIterations\u003corg.apache.commons.math3.fitting.GaussianCurveFitter\u003e"
      ],
      "begin_line": 73,
      "end_line": 424,
      "comment": "\n * Fits points to a {@link\n * org.apache.commons.math3.analysis.function.Gaussian.Parametric Gaussian}\n * function.\n * \u003cbr/\u003e\n * The {@link #withStartPoint(double[]) initial guess values} must be passed\n * in the following order:\n * \u003cul\u003e\n *  \u003cli\u003eNormalization\u003c/li\u003e\n *  \u003cli\u003eMean\u003c/li\u003e\n *  \u003cli\u003eSigma\u003c/li\u003e\n * \u003c/ul\u003e\n * The optimal values will be returned in the same order.\n *\n * \u003cp\u003e\n * Usage example:\n * \u003cpre\u003e\n *   WeightedObservedPoints obs \u003d new WeightedObservedPoints();\n *   obs.add(4.0254623,  531026.0);\n *   obs.add(4.03128248, 984167.0);\n *   obs.add(4.03839603, 1887233.0);\n *   obs.add(4.04421621, 2687152.0);\n *   obs.add(4.05132976, 3461228.0);\n *   obs.add(4.05326982, 3580526.0);\n *   obs.add(4.05779662, 3439750.0);\n *   obs.add(4.0636168,  2877648.0);\n *   obs.add(4.06943698, 2175960.0);\n *   obs.add(4.07525716, 1447024.0);\n *   obs.add(4.08237071, 717104.0);\n *   obs.add(4.08366408, 620014.0);\n *   double[] parameters \u003d GaussianCurveFitter.create().fit(obs);\n * \u003c/pre\u003e\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION"
      ],
      "begin_line": 77,
      "end_line": 101,
      "comment": " Parametric function to be fitted. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.Anonymous-078f9aae-dfac-4807-8582-1a0b85b5b7c7.value(double, double...)",
      "begin_line": 78,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 80,col 17)-(line 80,col 52)",
        "(line 81,col 17)-(line 85,col 17)",
        "(line 86,col 17)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.Anonymous-16310acc-082c-4316-b67e-22a6c6847450.gradient(double, double...)",
      "begin_line": 89,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 91,col 17)-(line 93,col 58)",
        "(line 94,col 17)-(line 98,col 17)",
        "(line 99,col 17)-(line 99,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "initialGuess"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Maximum number of iterations of the optimization algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.GaussianCurveFitter(double[], int)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * Contructor used by the factory methods.\n     *\n     * @param initialGuess Initial guess. If set to {@code null}, the initial guess\n     * will be estimated using the {@link ParameterGuesser}.\n     * @param maxIter Maximum number of iterations of the optimization algorithm.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 117,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.create()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Creates a default curve fitter.\n     * The initial guess for the parameters will be {@link ParameterGuesser}\n     * computed automatically, and the maximum number of iterations of the\n     * optimization algorithm is set to {@link Integer#MAX_VALUE}.\n     *\n     * @return a curve fitter.\n     *\n     * @see #withStartPoint(double[])\n     * @see #withMaxIterations(int)\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.withStartPoint(double[])",
      "begin_line": 136,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 138,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.withMaxIterations(int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 144,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.getOptimizer(java.util.Collection\u003corg.apache.commons.math3.fitting.WeightedObservedPoint\u003e)",
      "begin_line": 148,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 49)",
        "(line 153,col 9)-(line 153,col 49)",
        "(line 155,col 9)-(line 155,col 18)",
        "(line 156,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 164,col 78)",
        "(line 166,col 9)-(line 169,col 55)",
        "(line 173,col 9)-(line 180,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 188,
      "end_line": 423,
      "comment": "\n     * Guesses the parameters {@code norm}, {@code mean}, and {@code sigma}\n     * of a {@link org.apache.commons.math3.analysis.function.Gaussian.Parametric}\n     * based on the specified observed points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "norm"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Normalization factor. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Mean. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Standard deviation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.ParameterGuesser(java.util.Collection\u003corg.apache.commons.math3.fitting.WeightedObservedPoint\u003e)",
      "begin_line": 206,
      "end_line": 220,
      "comment": "\n         * Constructs instance with the specified observed points.\n         *\n         * @param observations Observed points from which to guess the\n         * parameters of the Gaussian.\n         * @throws NullArgumentException if {@code observations} is\n         * {@code null}.\n         * @throws NumberIsTooSmallException if there are less than 3\n         * observations.\n         ",
      "child_ranges": [
        "(line 207,col 13)-(line 209,col 13)",
        "(line 210,col 13)-(line 212,col 13)",
        "(line 214,col 13)-(line 214,col 86)",
        "(line 215,col 13)-(line 215,col 93)",
        "(line 217,col 13)-(line 217,col 29)",
        "(line 218,col 13)-(line 218,col 29)",
        "(line 219,col 13)-(line 219,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.guess()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n         * Gets an estimation of the parameters.\n         *\n         * @return the guessed parameters, in the following order:\n         * \u003cul\u003e\n         *  \u003cli\u003eNormalization factor\u003c/li\u003e\n         *  \u003cli\u003eMean\u003c/li\u003e\n         *  \u003cli\u003eStandard deviation\u003c/li\u003e\n         * \u003c/ul\u003e\n         ",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.sortObservations(java.util.Collection\u003corg.apache.commons.math3.fitting.WeightedObservedPoint\u003e)",
      "begin_line": 242,
      "end_line": 281,
      "comment": "\n         * Sort the observations.\n         *\n         * @param unsorted Input observations.\n         * @return the input observations, sorted.\n         ",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 108)",
        "(line 245,col 13)-(line 277,col 14)",
        "(line 279,col 13)-(line 279,col 48)",
        "(line 280,col 13)-(line 280,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.Anonymous-e34236c1-7cfc-4c72-a1e8-b58390d79b54.compare(org.apache.commons.math3.fitting.WeightedObservedPoint, org.apache.commons.math3.fitting.WeightedObservedPoint)",
      "begin_line": 246,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 248,col 21)-(line 250,col 21)",
        "(line 251,col 21)-(line 253,col 21)",
        "(line 254,col 21)-(line 256,col 21)",
        "(line 257,col 21)-(line 259,col 21)",
        "(line 260,col 21)-(line 262,col 21)",
        "(line 263,col 21)-(line 265,col 21)",
        "(line 266,col 21)-(line 268,col 21)",
        "(line 269,col 21)-(line 271,col 21)",
        "(line 272,col 21)-(line 274,col 21)",
        "(line 275,col 21)-(line 275,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.basicGuess(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 290,
      "end_line": 308,
      "comment": "\n         * Guesses the parameters based on the specified observed points.\n         *\n         * @param points Observed points, sorted.\n         * @return the guessed parameters (normalization factor, mean and\n         * sigma).\n         ",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 49)",
        "(line 292,col 13)-(line 292,col 52)",
        "(line 293,col 13)-(line 293,col 52)",
        "(line 295,col 13)-(line 295,col 30)",
        "(line 296,col 13)-(line 304,col 13)",
        "(line 305,col 13)-(line 305,col 83)",
        "(line 307,col 13)-(line 307,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.findMaxY(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 316,
      "end_line": 324,
      "comment": "\n         * Finds index of point in specified points with the largest Y.\n         *\n         * @param points Points to search.\n         * @return the index in specified points array.\n         ",
      "child_ranges": [
        "(line 317,col 13)-(line 317,col 28)",
        "(line 318,col 13)-(line 322,col 13)",
        "(line 323,col 13)-(line 323,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.interpolateXAtY(org.apache.commons.math3.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 340,
      "end_line": 360,
      "comment": "\n         * Interpolates using the specified points to determine X at the\n         * specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start the search for\n         * interpolation bounds points.\n         * @param idxStep Index step for searching interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the value of X for the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 345,col 13)-(line 347,col 13)",
        "(line 348,col 13)-(line 349,col 75)",
        "(line 350,col 13)-(line 350,col 58)",
        "(line 351,col 13)-(line 351,col 58)",
        "(line 352,col 13)-(line 354,col 13)",
        "(line 355,col 13)-(line 357,col 13)",
        "(line 358,col 13)-(line 359,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.getInterpolationPointsForY(org.apache.commons.math3.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 377,
      "end_line": 405,
      "comment": "\n         * Gets the two bounding interpolation points from the specified points\n         * suitable for determining X at the specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start search for\n         * interpolation bounds points.\n         * @param idxStep Index step for search for interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the array containing two points suitable for determining X at\n         * the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 382,col 13)-(line 384,col 13)",
        "(line 385,col 13)-(line 397,col 13)",
        "(line 402,col 13)-(line 404,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianCurveFitter.ParameterGuesser.isBetween(double, double, double)",
      "begin_line": 417,
      "end_line": 422,
      "comment": "\n         * Determines whether a value is between two other values.\n         *\n         * @param value Value to test whether it is between {@code boundary1}\n         * and {@code boundary2}.\n         * @param boundary1 One end of the range.\n         * @param boundary2 Other end of the range.\n         * @return {@code true} if {@code value} is between {@code boundary1} and\n         * {@code boundary2} (inclusive), {@code false} otherwise.\n         ",
      "child_ranges": [
        "(line 420,col 13)-(line 421,col 59)"
      ]
    }
  ]
}