{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/optimization/fitting/GaussianFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.function.Gaussian.Parametric\u003e"
      ],
      "begin_line": 61,
      "end_line": 366,
      "comment": "\n * Fits points to a {@link\n * org.apache.commons.math3.analysis.function.Gaussian.Parametric Gaussian} function.\n * \u003cp\u003e\n * Usage example:\n * \u003cpre\u003e\n *   GaussianFitter fitter \u003d new GaussianFitter(\n *     new LevenbergMarquardtOptimizer());\n *   fitter.addObservedPoint(4.0254623,  531026.0);\n *   fitter.addObservedPoint(4.03128248, 984167.0);\n *   fitter.addObservedPoint(4.03839603, 1887233.0);\n *   fitter.addObservedPoint(4.04421621, 2687152.0);\n *   fitter.addObservedPoint(4.05132976, 3461228.0);\n *   fitter.addObservedPoint(4.05326982, 3580526.0);\n *   fitter.addObservedPoint(4.05779662, 3439750.0);\n *   fitter.addObservedPoint(4.0636168,  2877648.0);\n *   fitter.addObservedPoint(4.06943698, 2175960.0);\n *   fitter.addObservedPoint(4.07525716, 1447024.0);\n *   fitter.addObservedPoint(4.08237071, 717104.0);\n *   fitter.addObservedPoint(4.08366408, 620014.0);\n *   double[] parameters \u003d fitter.fit();\n * \u003c/pre\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.GaussianFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Constructs an instance using the specified optimizer.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.fit(double[])",
      "begin_line": 84,
      "end_line": 112,
      "comment": "\n     * Fits a Gaussian function to the observed points.\n     *\n     * @param initialGuess First guess values in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003eNorm\u003c/li\u003e\n     *  \u003cli\u003eMean\u003c/li\u003e\n     *  \u003cli\u003eSigma\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the parameters of the Gaussian function that best fits the\n     * observed points (in the same order as above).\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 109,col 14)",
        "(line 111,col 9)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.Anonymous-af264461-783e-40b5-b891-65cde8ed878c.value(double, double...)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 21)-(line 88,col 56)",
        "(line 89,col 21)-(line 93,col 21)",
        "(line 94,col 21)-(line 94,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.Anonymous-b2c7b9e7-e927-4c24-9eca-dca495acca8c.gradient(double, double...)",
      "begin_line": 97,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 99,col 21)-(line 101,col 62)",
        "(line 102,col 21)-(line 106,col 21)",
        "(line 107,col 21)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.fit()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Fits a Gaussian function to the observed points.\n     *\n     * @return the parameters of the Gaussian function that best fits the\n     * observed points (in the same order as above).\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 81)",
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 130,
      "end_line": 365,
      "comment": "\n     * Guesses the parameters {@code norm}, {@code mean}, and {@code sigma}\n     * of a {@link org.apache.commons.math3.analysis.function.Gaussian.Parametric}\n     * based on the specified observed points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "norm"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Normalization factor. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Mean. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Standard deviation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.ParameterGuesser(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n         * Constructs instance with the specified observed points.\n         *\n         * @param observations Observed points from which to guess the\n         * parameters of the Gaussian.\n         * @throws NullArgumentException if {@code observations} is\n         * {@code null}.\n         * @throws NumberIsTooSmallException if there are less than 3\n         * observations.\n         ",
      "child_ranges": [
        "(line 149,col 13)-(line 151,col 13)",
        "(line 152,col 13)-(line 154,col 13)",
        "(line 156,col 13)-(line 156,col 82)",
        "(line 157,col 13)-(line 157,col 55)",
        "(line 159,col 13)-(line 159,col 29)",
        "(line 160,col 13)-(line 160,col 29)",
        "(line 161,col 13)-(line 161,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.guess()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n         * Gets an estimation of the parameters.\n         *\n         * @return the guessed parameters, in the following order:\n         * \u003cul\u003e\n         *  \u003cli\u003eNormalization factor\u003c/li\u003e\n         *  \u003cli\u003eMean\u003c/li\u003e\n         *  \u003cli\u003eStandard deviation\u003c/li\u003e\n         * \u003c/ul\u003e\n         ",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.sortObservations(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 184,
      "end_line": 223,
      "comment": "\n         * Sort the observations.\n         *\n         * @param unsorted Input observations.\n         * @return the input observations, sorted.\n         ",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 74)",
        "(line 186,col 13)-(line 219,col 14)",
        "(line 221,col 13)-(line 221,col 43)",
        "(line 222,col 13)-(line 222,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.Anonymous-85033b76-800d-4b85-acde-c6147b6e83c9.compare(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint, org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 188,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 190,col 21)-(line 192,col 21)",
        "(line 193,col 21)-(line 195,col 21)",
        "(line 196,col 21)-(line 198,col 21)",
        "(line 199,col 21)-(line 201,col 21)",
        "(line 202,col 21)-(line 204,col 21)",
        "(line 205,col 21)-(line 207,col 21)",
        "(line 208,col 21)-(line 210,col 21)",
        "(line 211,col 21)-(line 213,col 21)",
        "(line 214,col 21)-(line 216,col 21)",
        "(line 217,col 21)-(line 217,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.basicGuess(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 232,
      "end_line": 250,
      "comment": "\n         * Guesses the parameters based on the specified observed points.\n         *\n         * @param points Observed points, sorted.\n         * @return the guessed parameters (normalization factor, mean and\n         * sigma).\n         ",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 49)",
        "(line 234,col 13)-(line 234,col 52)",
        "(line 235,col 13)-(line 235,col 52)",
        "(line 237,col 13)-(line 237,col 30)",
        "(line 238,col 13)-(line 246,col 13)",
        "(line 247,col 13)-(line 247,col 83)",
        "(line 249,col 13)-(line 249,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.findMaxY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 258,
      "end_line": 266,
      "comment": "\n         * Finds index of point in specified points with the largest Y.\n         *\n         * @param points Points to search.\n         * @return the index in specified points array.\n         ",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 28)",
        "(line 260,col 13)-(line 264,col 13)",
        "(line 265,col 13)-(line 265,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.interpolateXAtY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 282,
      "end_line": 302,
      "comment": "\n         * Interpolates using the specified points to determine X at the\n         * specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start the search for\n         * interpolation bounds points.\n         * @param idxStep Index step for searching interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the value of X for the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 287,col 13)-(line 289,col 13)",
        "(line 290,col 13)-(line 291,col 75)",
        "(line 292,col 13)-(line 292,col 58)",
        "(line 293,col 13)-(line 293,col 58)",
        "(line 294,col 13)-(line 296,col 13)",
        "(line 297,col 13)-(line 299,col 13)",
        "(line 300,col 13)-(line 301,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.getInterpolationPointsForY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 319,
      "end_line": 347,
      "comment": "\n         * Gets the two bounding interpolation points from the specified points\n         * suitable for determining X at the specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start search for\n         * interpolation bounds points.\n         * @param idxStep Index step for search for interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the array containing two points suitable for determining X at\n         * the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 324,col 13)-(line 326,col 13)",
        "(line 327,col 13)-(line 339,col 13)",
        "(line 344,col 13)-(line 346,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.isBetween(double, double, double)",
      "begin_line": 359,
      "end_line": 364,
      "comment": "\n         * Determines whether a value is between two other values.\n         *\n         * @param value Value to test whether it is between {@code boundary1}\n         * and {@code boundary2}.\n         * @param boundary1 One end of the range.\n         * @param boundary2 Other end of the range.\n         * @return {@code true} if {@code value} is between {@code boundary1} and\n         * {@code boundary2} (inclusive), {@code false} otherwise.\n         ",
      "child_ranges": [
        "(line 362,col 13)-(line 363,col 59)"
      ]
    }
  ]
}