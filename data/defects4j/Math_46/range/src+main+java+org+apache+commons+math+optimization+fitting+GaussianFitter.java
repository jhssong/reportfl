{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.CurveFitter"
      ],
      "begin_line": 61,
      "end_line": 336,
      "comment": "\n * Fits points to a {@link\n * org.apache.commons.math.analysis.function.Gaussian.Parametric Gaussian} function.\n * \u003cp\u003e\n * Usage example:\n * \u003cpre\u003e\n *   GaussianFitter fitter \u003d new GaussianFitter(\n *     new LevenbergMarquardtOptimizer());\n *   fitter.addObservedPoint(4.0254623,  531026.0);\n *   fitter.addObservedPoint(4.03128248, 984167.0);\n *   fitter.addObservedPoint(4.03839603, 1887233.0);\n *   fitter.addObservedPoint(4.04421621, 2687152.0);\n *   fitter.addObservedPoint(4.05132976, 3461228.0);\n *   fitter.addObservedPoint(4.05326982, 3580526.0);\n *   fitter.addObservedPoint(4.05779662, 3439750.0);\n *   fitter.addObservedPoint(4.0636168,  2877648.0);\n *   fitter.addObservedPoint(4.06943698, 2175960.0);\n *   fitter.addObservedPoint(4.07525716, 1447024.0);\n *   fitter.addObservedPoint(4.08237071, 717104.0);\n *   fitter.addObservedPoint(4.08366408, 620014.0);\n *   double[] parameters \u003d fitter.fit();\n * \u003c/pre\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.GaussianFitter(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Constructs an instance using the specified optimizer.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.fit(double[])",
      "begin_line": 83,
      "end_line": 111,
      "comment": "\n     * Fits a Gaussian function to the observed points.\n     *\n     * @param initialGuess First guess values in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003eNorm\u003c/li\u003e\n     *  \u003cli\u003eMean\u003c/li\u003e\n     *  \u003cli\u003eSigma\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the parameters of the Gaussian function that best fits the\n     * observed points (in the same order as above).\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 108,col 14)",
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "g"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.Anonymous-9d97625c-81b4-43a1-8d75-bab483c80e76.value(double, double...)",
      "begin_line": 87,
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
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.Anonymous-08688c3d-1c0e-4862-960a-89cb25bc28a5.gradient(double, double...)",
      "begin_line": 97,
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
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.fit()",
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
      "end_line": 335,
      "comment": "\n     * Guesses the parameters {@code norm}, {@code mean}, and {@code sigma}\n     * of a {@link org.apache.commons.math.analysis.function.Gaussian.Parametric}\n     * based on the specified observed points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Observed points. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Resulting guessed parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.ParameterGuesser(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 140,
      "end_line": 148,
      "comment": "\n         * Constructs instance with the specified observed points.\n         *\n         * @param observations observed points upon which should base guess\n         ",
      "child_ranges": [
        "(line 141,col 13)-(line 143,col 13)",
        "(line 144,col 13)-(line 146,col 13)",
        "(line 147,col 13)-(line 147,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.guess()",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n         * Guesses the parameters based on the observed points.\n         *\n         * @return the guessed parameters: norm, mean and sigma.\n         ",
      "child_ranges": [
        "(line 156,col 13)-(line 158,col 13)",
        "(line 159,col 13)-(line 159,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.basicGuess(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 168,
      "end_line": 188,
      "comment": "\n         * Guesses the parameters based on the specified observed points.\n         *\n         * @param points Observed points upon which should base guess.\n         * @return the guessed parameters: norm, mean and sigma.\n         ",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 73)",
        "(line 170,col 13)-(line 170,col 44)",
        "(line 172,col 13)-(line 172,col 43)",
        "(line 173,col 13)-(line 173,col 47)",
        "(line 174,col 13)-(line 174,col 47)",
        "(line 176,col 13)-(line 176,col 30)",
        "(line 177,col 13)-(line 184,col 13)",
        "(line 185,col 13)-(line 185,col 76)",
        "(line 187,col 13)-(line 187,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.findMaxY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 196,
      "end_line": 204,
      "comment": "\n         * Finds index of point in specified points with the largest Y.\n         *\n         * @param points Points to search.\n         * @return the index in specified points array.\n         ",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 28)",
        "(line 198,col 13)-(line 202,col 13)",
        "(line 203,col 13)-(line 203,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.interpolateXAtY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 220,
      "end_line": 238,
      "comment": "\n         * Interpolates using the specified points to determine X at the\n         * specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start search for\n         *  interpolation bounds points.\n         * @param idxStep Index step for search for interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the value of X at the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 223,col 13)-(line 225,col 13)",
        "(line 226,col 13)-(line 226,col 105)",
        "(line 227,col 13)-(line 227,col 56)",
        "(line 228,col 13)-(line 228,col 56)",
        "(line 229,col 13)-(line 231,col 13)",
        "(line 232,col 13)-(line 234,col 13)",
        "(line 235,col 13)-(line 237,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.getInterpolationPointsForY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 255,
      "end_line": 278,
      "comment": "\n         * Gets the two bounding interpolation points from the specified points\n         * suitable for determining X at the specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start search for\n         * interpolation bounds points.\n         * @param idxStep Index step for search for interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the array containing two points suitable for determining X at\n         * the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 258,col 13)-(line 260,col 13)",
        "(line 261,col 13)-(line 269,col 13)",
        "(line 271,col 13)-(line 271,col 51)",
        "(line 272,col 13)-(line 272,col 51)",
        "(line 273,col 13)-(line 276,col 13)",
        "(line 277,col 13)-(line 277,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.isBetween(double, double, double)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n         * Determines whether a value is between two other values.\n         *\n         * @param value Value to determine whether is between {@code boundary1}\n         * and {@code boundary2}.\n         * @param boundary1 One end of the range.\n         * @param boundary2 Other end of the range.\n         * @return {@code true} if {@code value} is between {@code boundary1} and\n         * {@code boundary2} (inclusive), {@code false} otherwise.\n         ",
      "child_ranges": [
        "(line 291,col 13)-(line 292,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.createWeightedObservedPointComparator()",
      "begin_line": 301,
      "end_line": 334,
      "comment": "\n         * Factory method creating {@code Comparator} for comparing\n         * {@code WeightedObservedPoint} instances.\n         *\n         * @return the new {@code Comparator} instance.\n         ",
      "child_ranges": [
        "(line 302,col 13)-(line 333,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser.Anonymous-50d8fde8-43e2-49b8-9f3d-44ae1caf035b.compare(org.apache.commons.math.optimization.fitting.WeightedObservedPoint, org.apache.commons.math.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 303,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 304,col 21)-(line 306,col 21)",
        "(line 307,col 21)-(line 309,col 21)",
        "(line 310,col 21)-(line 312,col 21)",
        "(line 313,col 21)-(line 315,col 21)",
        "(line 316,col 21)-(line 318,col 21)",
        "(line 319,col 21)-(line 321,col 21)",
        "(line 322,col 21)-(line 324,col 21)",
        "(line 325,col 21)-(line 327,col 21)",
        "(line 328,col 21)-(line 330,col 21)",
        "(line 331,col 21)-(line 331,col 29)"
      ]
    }
  ]
}