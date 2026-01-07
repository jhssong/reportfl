{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/optimization/fitting/GaussianFitter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFitter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.fitting.CurveFitter\u003corg.apache.commons.math3.analysis.function.Gaussian.Parametric\u003e"
      ],
      "begin_line": 60,
      "end_line": 334,
      "comment": "\n * Fits points to a {@link\n * org.apache.commons.math3.analysis.function.Gaussian.Parametric Gaussian} function.\n * \u003cp\u003e\n * Usage example:\n * \u003cpre\u003e\n *   GaussianFitter fitter \u003d new GaussianFitter(\n *     new LevenbergMarquardtOptimizer());\n *   fitter.addObservedPoint(4.0254623,  531026.0);\n *   fitter.addObservedPoint(4.03128248, 984167.0);\n *   fitter.addObservedPoint(4.03839603, 1887233.0);\n *   fitter.addObservedPoint(4.04421621, 2687152.0);\n *   fitter.addObservedPoint(4.05132976, 3461228.0);\n *   fitter.addObservedPoint(4.05326982, 3580526.0);\n *   fitter.addObservedPoint(4.05779662, 3439750.0);\n *   fitter.addObservedPoint(4.0636168,  2877648.0);\n *   fitter.addObservedPoint(4.06943698, 2175960.0);\n *   fitter.addObservedPoint(4.07525716, 1447024.0);\n *   fitter.addObservedPoint(4.08237071, 717104.0);\n *   fitter.addObservedPoint(4.08366408, 620014.0);\n *   double[] parameters \u003d fitter.fit();\n * \u003c/pre\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.GaussianFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Constructs an instance using the specified optimizer.\n     *\n     * @param optimizer Optimizer to use for the fitting.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.fit(double[])",
      "begin_line": 83,
      "end_line": 109,
      "comment": "\n     * Fits a Gaussian function to the observed points.\n     *\n     * @param initialGuess First guess values in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003eNorm\u003c/li\u003e\n     *  \u003cli\u003eMean\u003c/li\u003e\n     *  \u003cli\u003eSigma\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the parameters of the Gaussian function that best fits the\n     * observed points (in the same order as above).\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 106,col 14)",
        "(line 108,col 9)-(line 108,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.Anonymous-45b7faa9-53cd-4c69-8985-b89634613d5a.value(double, double...)",
      "begin_line": 85,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 86,col 21)-(line 86,col 56)",
        "(line 87,col 21)-(line 91,col 21)",
        "(line 92,col 21)-(line 92,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.Anonymous-c4f1e347-01b9-4a25-9db3-76445ce532a3.gradient(double, double...)",
      "begin_line": 95,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 96,col 21)-(line 98,col 62)",
        "(line 99,col 21)-(line 103,col 21)",
        "(line 104,col 21)-(line 104,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.fit()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Fits a Gaussian function to the observed points.\n     *\n     * @return the parameters of the Gaussian function that best fits the\n     * observed points (in the same order as above).\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 81)",
        "(line 119,col 9)-(line 119,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 127,
      "end_line": 333,
      "comment": "\n     * Guesses the parameters {@code norm}, {@code mean}, and {@code sigma}\n     * of a {@link org.apache.commons.math3.analysis.function.Gaussian.Parametric}\n     * based on the specified observed points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Observed points. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Resulting guessed parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.ParameterGuesser(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 138,
      "end_line": 146,
      "comment": "\n         * Constructs instance with the specified observed points.\n         *\n         * @param observations observed points upon which should base guess\n         ",
      "child_ranges": [
        "(line 139,col 13)-(line 141,col 13)",
        "(line 142,col 13)-(line 144,col 13)",
        "(line 145,col 13)-(line 145,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.guess()",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n         * Guesses the parameters based on the observed points.\n         *\n         * @return the guessed parameters: norm, mean and sigma.\n         ",
      "child_ranges": [
        "(line 154,col 13)-(line 156,col 13)",
        "(line 157,col 13)-(line 157,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.basicGuess(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 166,
      "end_line": 186,
      "comment": "\n         * Guesses the parameters based on the specified observed points.\n         *\n         * @param points Observed points upon which should base guess.\n         * @return the guessed parameters: norm, mean and sigma.\n         ",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 73)",
        "(line 168,col 13)-(line 168,col 44)",
        "(line 170,col 13)-(line 170,col 43)",
        "(line 171,col 13)-(line 171,col 47)",
        "(line 172,col 13)-(line 172,col 47)",
        "(line 174,col 13)-(line 174,col 30)",
        "(line 175,col 13)-(line 182,col 13)",
        "(line 183,col 13)-(line 183,col 76)",
        "(line 185,col 13)-(line 185,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.findMaxY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 194,
      "end_line": 202,
      "comment": "\n         * Finds index of point in specified points with the largest Y.\n         *\n         * @param points Points to search.\n         * @return the index in specified points array.\n         ",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 28)",
        "(line 196,col 13)-(line 200,col 13)",
        "(line 201,col 13)-(line 201,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.interpolateXAtY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 218,
      "end_line": 236,
      "comment": "\n         * Interpolates using the specified points to determine X at the\n         * specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start search for\n         *  interpolation bounds points.\n         * @param idxStep Index step for search for interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the value of X at the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 221,col 13)-(line 223,col 13)",
        "(line 224,col 13)-(line 224,col 105)",
        "(line 225,col 13)-(line 225,col 56)",
        "(line 226,col 13)-(line 226,col 56)",
        "(line 227,col 13)-(line 229,col 13)",
        "(line 230,col 13)-(line 232,col 13)",
        "(line 233,col 13)-(line 235,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.getInterpolationPointsForY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 253,
      "end_line": 276,
      "comment": "\n         * Gets the two bounding interpolation points from the specified points\n         * suitable for determining X at the specified Y.\n         *\n         * @param points Points to use for interpolation.\n         * @param startIdx Index within points from which to start search for\n         * interpolation bounds points.\n         * @param idxStep Index step for search for interpolation bounds points.\n         * @param y Y value for which X should be determined.\n         * @return the array containing two points suitable for determining X at\n         * the specified Y.\n         * @throws ZeroException if {@code idxStep} is 0.\n         * @throws OutOfRangeException if specified {@code y} is not within the\n         * range of the specified {@code points}.\n         ",
      "child_ranges": [
        "(line 256,col 13)-(line 258,col 13)",
        "(line 259,col 13)-(line 267,col 13)",
        "(line 269,col 13)-(line 269,col 51)",
        "(line 270,col 13)-(line 270,col 51)",
        "(line 271,col 13)-(line 274,col 13)",
        "(line 275,col 13)-(line 275,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.isBetween(double, double, double)",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n         * Determines whether a value is between two other values.\n         *\n         * @param value Value to determine whether is between {@code boundary1}\n         * and {@code boundary2}.\n         * @param boundary1 One end of the range.\n         * @param boundary2 Other end of the range.\n         * @return {@code true} if {@code value} is between {@code boundary1} and\n         * {@code boundary2} (inclusive), {@code false} otherwise.\n         ",
      "child_ranges": [
        "(line 289,col 13)-(line 290,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.createWeightedObservedPointComparator()",
      "begin_line": 299,
      "end_line": 332,
      "comment": "\n         * Factory method creating {@code Comparator} for comparing\n         * {@code WeightedObservedPoint} instances.\n         *\n         * @return the new {@code Comparator} instance.\n         ",
      "child_ranges": [
        "(line 300,col 13)-(line 331,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser.Anonymous-edb9100e-69aa-49cb-bd43-079683ced514.compare(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint, org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 301,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 302,col 21)-(line 304,col 21)",
        "(line 305,col 21)-(line 307,col 21)",
        "(line 308,col 21)-(line 310,col 21)",
        "(line 311,col 21)-(line 313,col 21)",
        "(line 314,col 21)-(line 316,col 21)",
        "(line 317,col 21)-(line 319,col 21)",
        "(line 320,col 21)-(line 322,col 21)",
        "(line 323,col 21)-(line 325,col 21)",
        "(line 326,col 21)-(line 328,col 21)",
        "(line 329,col 21)-(line 329,col 29)"
      ]
    }
  ]
}