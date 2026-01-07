{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 31,
      "end_line": 423,
      "comment": "\n * Implements Chi-Square test statistics defined in the\n * {@link UnknownDistributionChiSquareTest} interface.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Distribution used to compute inference statistics. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Construct a ChiSquareTestImpl\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Create a test instance using the given distribution for computing\n     * inference statistics.\n     * @param x distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)",
        "(line 51,col 9)-(line 51,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(double[], long[])",
      "begin_line": 65,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * or length is less than 2\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 32)",
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 77,col 32)",
        "(line 78,col 9)-(line 78,col 32)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 28)",
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 64)",
        "(line 117,col 9)-(line 118,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 135,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 150,
      "end_line": 179,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 27)",
        "(line 153,col 9)-(line 153,col 34)",
        "(line 154,col 9)-(line 154,col 37)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 159,col 28)",
        "(line 160,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 170,col 31)",
        "(line 171,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 82)",
        "(line 191,col 9)-(line 191,col 45)",
        "(line 192,col 9)-(line 192,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 203,
      "end_line": 211,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 220,
      "end_line": 282,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 232,col 9)",
        "(line 235,col 9)-(line 235,col 36)",
        "(line 236,col 9)-(line 236,col 36)",
        "(line 239,col 9)-(line 239,col 27)",
        "(line 240,col 9)-(line 240,col 27)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 28)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 47)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 28)",
        "(line 263,col 9)-(line 263,col 26)",
        "(line 264,col 9)-(line 264,col 27)",
        "(line 265,col 9)-(line 265,col 27)",
        "(line 266,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 292,
      "end_line": 297,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 72)",
        "(line 295,col 9)-(line 296,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 309,
      "end_line": 317,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 327,
      "end_line": 342,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     *\n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 29)",
        "(line 340,col 9)-(line 340,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkRectangular(long[][])",
      "begin_line": 353,
      "end_line": 361,
      "comment": "\n     * Throws IllegalArgumentException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullPointerException if input array is null\n     * @throws IllegalArgumentException if input array is not rectangular\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkPositive(double[])",
      "begin_line": 369,
      "end_line": 377,
      "comment": "\n     * Check all entries of the input array are \u003e 0.\n     *\n     * @param in array to be tested\n     * @exception IllegalArgumentException if one entry is not positive\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[])",
      "begin_line": 385,
      "end_line": 393,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in array to be tested\n     * @exception IllegalArgumentException if one entry is negative\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[][])",
      "begin_line": 401,
      "end_line": 411,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in array to be tested\n     * @exception IllegalArgumentException if one entry is negative\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     *\n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 29)"
      ]
    }
  ]
}