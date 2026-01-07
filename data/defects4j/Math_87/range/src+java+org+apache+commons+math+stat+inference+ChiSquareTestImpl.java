{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 30,
      "end_line": 427,
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
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * or length is less than 2\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 70,col 9)",
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
        "(line 90,col 9)-(line 90,col 26)",
        "(line 91,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 64)",
        "(line 118,col 9)-(line 119,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 136,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 151,
      "end_line": 180,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 27)",
        "(line 154,col 9)-(line 154,col 34)",
        "(line 155,col 9)-(line 155,col 37)",
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 159,col 44)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 161,col 9)-(line 167,col 9)",
        "(line 170,col 9)-(line 170,col 28)",
        "(line 171,col 9)-(line 171,col 31)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 188,
      "end_line": 194,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 27)",
        "(line 191,col 9)-(line 191,col 82)",
        "(line 192,col 9)-(line 192,col 45)",
        "(line 193,col 9)-(line 193,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 204,
      "end_line": 212,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 221,
      "end_line": 284,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 234,col 9)",
        "(line 237,col 9)-(line 237,col 36)",
        "(line 238,col 9)-(line 238,col 36)",
        "(line 241,col 9)-(line 241,col 27)",
        "(line 242,col 9)-(line 242,col 27)",
        "(line 243,col 9)-(line 243,col 38)",
        "(line 244,col 9)-(line 244,col 28)",
        "(line 245,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 28)",
        "(line 265,col 9)-(line 265,col 26)",
        "(line 266,col 9)-(line 266,col 27)",
        "(line 267,col 9)-(line 267,col 27)",
        "(line 268,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 294,
      "end_line": 299,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 72)",
        "(line 297,col 9)-(line 298,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 311,
      "end_line": 319,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 329,
      "end_line": 346,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     * \n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 341,col 9)",
        "(line 343,col 9)-(line 343,col 29)",
        "(line 344,col 9)-(line 344,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkRectangular(long[][])",
      "begin_line": 357,
      "end_line": 365,
      "comment": "\n     * Throws IllegalArgumentException if the input array is not rectangular.\n     * \n     * @param in array to be tested\n     * @throws NullPointerException if input array is null\n     * @throws IllegalArgumentException if input array is not rectangular\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkPositive(double[])",
      "begin_line": 373,
      "end_line": 381,
      "comment": "\n     * Check all entries of the input array are \u003e 0.\n     * \n     * @param in array to be tested\n     * @exception IllegalArgumentException if one entry is not positive\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[])",
      "begin_line": 389,
      "end_line": 397,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     * \n     * @param in array to be tested\n     * @exception IllegalArgumentException if one entry is negative\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[][])",
      "begin_line": 405,
      "end_line": 415,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     * \n     * @param in array to be tested\n     * @exception IllegalArgumentException if one entry is negative\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * \n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 29)"
      ]
    }
  ]
}