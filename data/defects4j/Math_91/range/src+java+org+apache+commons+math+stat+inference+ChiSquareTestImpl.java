{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 29,
      "end_line": 413,
      "comment": "\n * Implements Chi-Square test statistics defined in the\n * {@link UnknownDistributionChiSquareTest} interface.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Distribution used to compute inference statistics. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Construct a ChiSquareTestImpl \n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Create a test instance using the given distribution for computing\n     * inference statistics.\n     * @param x distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)",
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(double[], long[])",
      "begin_line": 63,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * or length is less than 2\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 32)",
        "(line 74,col 9)-(line 74,col 32)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 28)",
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 28)",
        "(line 86,col 9)-(line 86,col 26)",
        "(line 87,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 64)",
        "(line 114,col 9)-(line 115,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 132,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 146,
      "end_line": 175,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 149,col 34)",
        "(line 150,col 9)-(line 150,col 37)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 44)",
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 28)",
        "(line 166,col 9)-(line 166,col 31)",
        "(line 167,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 82)",
        "(line 187,col 9)-(line 187,col 45)",
        "(line 188,col 9)-(line 188,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 199,
      "end_line": 205,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 214,
      "end_line": 267,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 27)",
        "(line 229,col 9)-(line 229,col 27)",
        "(line 230,col 9)-(line 230,col 38)",
        "(line 231,col 9)-(line 231,col 28)",
        "(line 232,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 49)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 248,col 9)-(line 248,col 26)",
        "(line 249,col 9)-(line 249,col 27)",
        "(line 250,col 9)-(line 250,col 27)",
        "(line 251,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 72)",
        "(line 280,col 9)-(line 281,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 294,
      "end_line": 301,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 311,
      "end_line": 329,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     * \n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(long[][])",
      "begin_line": 341,
      "end_line": 348,
      "comment": "\n     * Returns true iff input array is rectangular.\n     * \n     * @param in array to be tested\n     * @return true if the array is rectangular\n     * @throws NullPointerException if input array is null\n     * @throws ArrayIndexOutOfBoundsException if input array is empty\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive(double[])",
      "begin_line": 358,
      "end_line": 365,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are positive\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[])",
      "begin_line": 375,
      "end_line": 382,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[][])",
      "begin_line": 392,
      "end_line": 401,
      "comment": "\n     * Returns true iff all entries of (all subarrays of) the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * \n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 29)"
      ]
    }
  ]
}