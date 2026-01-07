{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianParametersGuesser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianParametersGuesser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 271,
      "comment": "\n * Guesses the parameters ({@code a}, {@code b}, {@code c}, and {@code d})\n * of a {@link ParametricGaussianFunction} based on the specified observed\n * points.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Observed points. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Resulting guessed parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.GaussianParametersGuesser(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 50,
      "end_line": 58,
      "comment": "\n     * Constructs instance with the specified observed points.\n     *\n     * @param observations observed points upon which should base guess\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.guess()",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Guesses the parameters based on the observed points.\n     *\n     * @return guessed parameters array \u003ccode\u003e{a, b, c, d}\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.basicGuess(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 79,
      "end_line": 102,
      "comment": "\n     * Guesses the parameters based on the specified observed points.\n     *\n     * @param points observed points upon which should base guess\n     *\n     * @return guessed parameters array \u003ccode\u003e{a, b, c, d}\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 69)",
        "(line 81,col 9)-(line 81,col 40)",
        "(line 83,col 9)-(line 83,col 39)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 86,col 9)-(line 86,col 39)",
        "(line 87,col 9)-(line 87,col 43)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 90,col 9)-(line 90,col 26)",
        "(line 91,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 72)",
        "(line 101,col 9)-(line 101,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.findMinY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Finds index of point in specified points with the smallest Y.\n     *\n     * @param points points to search\n     *\n     * @return index in specified points array\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 24)",
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.findMaxY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[])",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\n     * Finds index of point in specified points with the largest Y.\n     *\n     * @param points points to search\n     *\n     * @return index in specified points array\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)",
        "(line 130,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.interpolateXAtY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 154,
      "end_line": 170,
      "comment": "\n     * Interpolates using the specified points to determine X at the specified\n     * Y.\n     *\n     * @param points points to use for interpolation\n     * @param startIdx index within points from which to start search for\n     *        interpolation bounds points\n     * @param idxStep index step for search for interpolation bounds points\n     * @param y Y value for which X should be determined\n     *\n     * @return value of X at the specified Y\n     *\n     * @throws IllegalArgumentException if idxStep is 0\n     * @throws OutOfRangeException if specified \u003ccode\u003ey\u003c/code\u003e is not within the\n     *         range of the specified \u003ccode\u003epoints\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 101)",
        "(line 160,col 9)-(line 160,col 52)",
        "(line 161,col 9)-(line 161,col 52)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 169,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.getInterpolationPointsForY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[], int, int, double)",
      "begin_line": 189,
      "end_line": 213,
      "comment": "\n     * Gets the two bounding interpolation points from the specified points\n     * suitable for determining X at the specified Y.\n     *\n     * @param points points to use for interpolation\n     * @param startIdx index within points from which to start search for\n     *        interpolation bounds points\n     * @param idxStep index step for search for interpolation bounds points\n     * @param y Y value for which X should be determined\n     *\n     * @return array containing two points suitable for determining X at the\n     *         specified Y\n     *\n     * @throws IllegalArgumentException if idxStep is 0\n     * @throws OutOfRangeException if specified \u003ccode\u003ey\u003c/code\u003e is not within the\n     *         range of the specified \u003ccode\u003epoints\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 47)",
        "(line 206,col 9)-(line 206,col 47)",
        "(line 207,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.isBetween(double, double, double)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Determines whether a value is between two other values.\n     *\n     * @param value value to determine whether is between \u003ccode\u003eboundary1\u003c/code\u003e\n     *        and \u003ccode\u003eboundary2\u003c/code\u003e\n     * @param boundary1 one end of the range\n     * @param boundary2 other end of the range\n     *\n     * @return true if \u003ccode\u003evalue\u003c/code\u003e is between \u003ccode\u003eboundary1\u003c/code\u003e and\n     *         \u003ccode\u003eboundary2\u003c/code\u003e (inclusive); false otherwise\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 228,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.createWeightedObservedPointComparator()",
      "begin_line": 237,
      "end_line": 270,
      "comment": "\n     * Factory method creating \u003ccode\u003eComparator\u003c/code\u003e for comparing\n     * \u003ccode\u003eWeightedObservedPoint\u003c/code\u003e instances.\n     *\n     * @return new \u003ccode\u003eComparator\u003c/code\u003e instance\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 269,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianParametersGuesser.Anonymous-6c90b142-559c-4cc0-ab05-fa15ee290410.compare(org.apache.commons.math.optimization.fitting.WeightedObservedPoint, org.apache.commons.math.optimization.fitting.WeightedObservedPoint)",
      "begin_line": 239,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 240,col 17)-(line 242,col 17)",
        "(line 243,col 17)-(line 245,col 17)",
        "(line 246,col 17)-(line 248,col 17)",
        "(line 249,col 17)-(line 251,col 17)",
        "(line 252,col 17)-(line 254,col 17)",
        "(line 255,col 17)-(line 257,col 17)",
        "(line 258,col 17)-(line 260,col 17)",
        "(line 261,col 17)-(line 263,col 17)",
        "(line 264,col 17)-(line 266,col 17)",
        "(line 267,col 17)-(line 267,col 25)"
      ]
    }
  ]
}