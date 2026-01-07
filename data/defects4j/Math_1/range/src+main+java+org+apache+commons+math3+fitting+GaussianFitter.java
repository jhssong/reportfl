{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/GaussianFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.function.Gaussian.Parametric\u003e"
      ],
      "begin_line": 59,
      "end_line": 365,
      "comment": "\n * Fits points to a {@link\n * org.apache.commons.math3.analysis.function.Gaussian.Parametric Gaussian} function.\n * \u003cp\u003e\n * Usage example:\n * \u003cpre\u003e\n *   GaussianFitter fitter \u003d new GaussianFitter(\n *     new LevenbergMarquardtOptimizer());\n *   fitter.addObservedPoint(4.0254623,  531026.0);\n *   fitter.addObservedPoint(4.03128248, 984167.0);\n *   fitter.addObservedPoint(4.03839603, 1887233.0);\n *   fitter.addObservedPoint(4.04421621, 2687152.0);\n *   fitter.addObservedPoint(4.05132976, 3461228.0);\n *   fitter.addObservedPoint(4.05326982, 3580526.0);\n *   fitter.addObservedPoint(4.05779662, 3439750.0);\n *   fitter.addObservedPoint(4.0636168,  2877648.0);\n *   fitter.addObservedPoint(4.06943698, 2175960.0);\n *   fitter.addObservedPoint(4.07525716, 1447024.0);\n *   fitter.addObservedPoint(4.08237071, 717104.0);\n *   fitter.addObservedPoint(4.08366408, 620014.0);\n *   double[] parameters \u003d fitter.fit();\n * \u003c/pre\u003e\n *\n * @since 2.2\n * @version $Id: GaussianFitter.java 1416643 2012-12-03 19:37:14Z tn $\n * @deprecated As of 3.3. Please use {@link GaussianCurveFitter} and\n * {@link WeightedObservedPoints} instead.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.GaussianFitter(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Constructs an instance using the specified optimizer.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.fit(double[])",
      "begin_line": 83,
      "end_line": 111,
      "comment": "\n     * Fits a Gaussian function to the observed points.\n     *\n     * @param initialGuess First guess values in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003eNorm\u003c/li\u003e\n     *  \u003cli\u003eMean\u003c/li\u003e\n     *  \u003cli\u003eSigma\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the parameters of the Gaussian function that best fits the\n     * observed points (in the same order as above).\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 108,col 14)",
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.Anonymous-7e6315bb-f883-4978-a45c-3ba41c6277da.value(double, double...)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 21)-(line 87,col 56)",
        "(line 88,col 21)-(line 92,col 21)",
        "(line 93,col 21)-(line 93,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.Anonymous-cb1c7d0e-eb41-469b-89cb-a0bfc0e46ea3.gradient(double, double...)",
      "begin_line": 96,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 98,col 21)-(line 100,col 62)",
        "(line 101,col 21)-(line 105,col 21)",
        "(line 106,col 21)-(line 106,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.fit()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Fits a Gaussian function to the observed points.\n     *\n     * @return the parameters of the Gaussian function that best fits the\n     * observed points (in the same order as above).\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 81)",
        "(line 121,col 9)-(line 121,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 129,
      "end_line": 364,
      "comment": "\n     * Guesses the parameters {@code norm}, {@code mean}, and {@code sigma}\n     * of a {@link org.apache.commons.math3.analysis.function.Gaussian.Parametric}\n     * based on the specified observed points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "norm"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Normalization factor. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Mean. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Standard deviation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.ParameterGuesser(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 147,
      "end_line": 161,
      "comment": "\n         * Constructs instance with the specified observed points.\n         *\n         * @param observations Observed points from which to guess the\n         * parameters of the Gaussian.\n         * @throws NullArgumentException if {@code observations} is\n         * {@code null}.\n         * @throws NumberIsTooSmallException if there are less than 3\n         * observations.\n         ",
      "child_ranges": [
        "(line 148,col 13)-(line 150,col 13)",
        "(line 151,col 13)-(line 153,col 13)",
        "(line 155,col 13)-(line 155,col 82)",
        "(line 156,col 13)-(line 156,col 55)",
        "(line 158,col 13)-(line 158,col 29)",
        "(line 159,col 13)-(line 159,col 29)",
        "(line 160,col 13)-(line 160,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.guess()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n         * Gets an estimation of the parameters.\n         *\n         * @return the guessed parameters, in the following order:\n         * \u003cul\u003e\n         *  \u003cli\u003eNormalization factor\u003c/li\u003e\n         *  \u003cli\u003eMean\u003c/li\u003e\n         *  \u003cli\u003eStandard deviation\u003c/li\u003e\n         * \u003c/ul\u003e\n         ",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.sortObservations(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 183,
      "end_line": 222,
      "comment": "\n         * Sort the observations.\n         *\n         * @param unsorted Input observations.\n         * @return the input observations, sorted.\n         ",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 74)",
        "(line 185,col 13)-(line 218,col 14)",
        "(line 220,col 13)-(line 220,col 43)",
        "(line 221,col 13)-(line 221,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.Anonymous-e70b02f3-8aeb-4079-9d41-92908749aeb0.compare(org.apache.commons.math3.fitting.WeightedObservedPoint, org.apache.commons.math3.fitting.WeightedObservedPoint)",
      "begin_line": 187,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 189,col 21)-(line 191,col 21)",
        "(line 192,col 21)-(line 194,col 21)",
        "(line 195,col 21)-(line 197,col 21)",
        "(line 198,col 21)-(line 200,col 21)",
        "(line 201,col 21)-(line 203,col 21)",
        "(line 204,col 21)-(line 206,col 21)",
        "(line 207,col 21)-(line 209,col 21)",
        "(line 210,col 21)-(line 212,col 21)",
        "(line 213,col 21)-(line 215,col 21)",
        "(line 216,col 21)-(line 216,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.basicGuess(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 231,
      "end_line": 249,
      "comment": "\n         * Guesses the parameters based on the specified observed points.\n         *\n         * @param points Observed points, sorted.\n         * @return the guessed parameters (normalization factor, mean and\n         * sigma).\n         ",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 49)",
        "(line 233,col 13)-(line 233,col 52)",
        "(line 234,col 13)-(line 234,col 52)",
        "(line 236,col 13)-(line 236,col 30)",
        "(line 237,col 13)-(line 245,col 13)",
        "(line 246,col 13)-(line 246,col 83)",
        "(line 248,col 13)-(line 248,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.findMaxY(org.apache.commons.math3.fitting.WeightedObservedPoint[])",
      "begin_line": 257,
      "end_line": 265,
      "comment": "\n         * Finds index of point in specified points with the largest Y.\n         *\n         * @param points Points to search.\n         * @return the index in specified points array.\n         ",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 28)",
        "(line 259,col 13)-(line 263,col 13)",
        "(line 264,col 13)-(line 264,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.interpolateXAtY(org.apache.commons.math3.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 281,
      "end_line": 301,
      "comment": "\n         * Interpolates using the specified points to determine X at the\n         * specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start the search for\n         * interpolation bounds points.\n         * @param idxStep Index step for searching interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the value of X for the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 286,col 13)-(line 288,col 13)",
        "(line 289,col 13)-(line 290,col 75)",
        "(line 291,col 13)-(line 291,col 58)",
        "(line 292,col 13)-(line 292,col 58)",
        "(line 293,col 13)-(line 295,col 13)",
        "(line 296,col 13)-(line 298,col 13)",
        "(line 299,col 13)-(line 300,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.getInterpolationPointsForY(org.apache.commons.math3.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 318,
      "end_line": 346,
      "comment": "\n         * Gets the two bounding interpolation points from the specified points\n         * suitable for determining X at the specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start search for\n         * interpolation bounds points.\n         * @param idxStep Index step for search for interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the array containing two points suitable for determining X at\n         * the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 323,col 13)-(line 325,col 13)",
        "(line 326,col 13)-(line 338,col 13)",
        "(line 343,col 13)-(line 345,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.GaussianFitter.ParameterGuesser.isBetween(double, double, double)",
      "begin_line": 358,
      "end_line": 363,
      "comment": "\n         * Determines whether a value is between two other values.\n         *\n         * @param value Value to test whether it is between {@code boundary1}\n         * and {@code boundary2}.\n         * @param boundary1 One end of the range.\n         * @param boundary2 Other end of the range.\n         * @return {@code true} if {@code value} is between {@code boundary1} and\n         * {@code boundary2} (inclusive), {@code false} otherwise.\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 362,col 59)"
      ]
    }
  ]
}