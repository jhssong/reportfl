{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 30,
      "end_line": 424,
      "comment": "\n * Implements Chi-Square test statistics defined in the\n * {@link UnknownDistributionChiSquareTest} interface.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Distribution used to compute inference statistics. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Construct a ChiSquareTestImpl \n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Create a test instance using the given distribution for computing\n     * inference statistics.\n     * @param x distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)",
        "(line 50,col 9)-(line 50,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(double[], long[])",
      "begin_line": 64,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * or length is less than 2\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 32)",
        "(line 75,col 9)-(line 75,col 32)",
        "(line 76,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 32)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 28)",
        "(line 87,col 9)-(line 87,col 26)",
        "(line 88,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 64)",
        "(line 115,col 9)-(line 116,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 133,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 147,
      "end_line": 176,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 27)",
        "(line 150,col 9)-(line 150,col 34)",
        "(line 151,col 9)-(line 151,col 37)",
        "(line 154,col 9)-(line 154,col 44)",
        "(line 155,col 9)-(line 155,col 44)",
        "(line 156,col 9)-(line 156,col 28)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 167,col 31)",
        "(line 168,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 184,
      "end_line": 190,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 27)",
        "(line 187,col 9)-(line 187,col 82)",
        "(line 188,col 9)-(line 188,col 45)",
        "(line 189,col 9)-(line 189,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 215,
      "end_line": 268,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 27)",
        "(line 230,col 9)-(line 230,col 27)",
        "(line 231,col 9)-(line 231,col 38)",
        "(line 232,col 9)-(line 232,col 28)",
        "(line 233,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 49)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 28)",
        "(line 249,col 9)-(line 249,col 26)",
        "(line 250,col 9)-(line 250,col 27)",
        "(line 251,col 9)-(line 251,col 27)",
        "(line 252,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 72)",
        "(line 281,col 9)-(line 282,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 295,
      "end_line": 302,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 312,
      "end_line": 330,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     * \n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.getDistributionFactory()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Gets a DistributionFactory to use in creating ChiSquaredDistribution instances.\n     * @deprecated inject ChiSquaredDistribution instances directly instead of\n     *             using a factory.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(long[][])",
      "begin_line": 352,
      "end_line": 359,
      "comment": "\n     * Returns true iff input array is rectangular.\n     * \n     * @param in array to be tested\n     * @return true if the array is rectangular\n     * @throws NullPointerException if input array is null\n     * @throws ArrayIndexOutOfBoundsException if input array is empty\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive(double[])",
      "begin_line": 369,
      "end_line": 376,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are positive\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[])",
      "begin_line": 386,
      "end_line": 393,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[][])",
      "begin_line": 403,
      "end_line": 412,
      "comment": "\n     * Returns true iff all entries of (all subarrays of) the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * \n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 29)"
      ]
    }
  ]
}