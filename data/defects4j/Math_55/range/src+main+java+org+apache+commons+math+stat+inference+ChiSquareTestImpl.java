{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 37,
      "end_line": 406,
      "comment": "\n * Implements Chi-Square test statistics defined in the\n * {@link UnknownDistributionChiSquareTest} interface.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Distribution used to compute inference statistics. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a ChiSquareTestImpl\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Create a test instance using the given distribution for computing\n     * inference statistics.\n     * @param x distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)",
        "(line 57,col 9)-(line 57,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(double[], long[])",
      "begin_line": 70,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws DimensionMismatchException if the arrays length is less than 2.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 32)",
        "(line 78,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 79,col 32)",
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 28)",
        "(line 86,col 9)-(line 86,col 32)",
        "(line 87,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 28)",
        "(line 92,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 77)",
        "(line 119,col 9)-(line 120,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 137,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 152,
      "end_line": 180,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws MathIllegalArgumentException if preconditions are not met.\n     ",
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
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 27)",
        "(line 191,col 9)-(line 191,col 82)",
        "(line 192,col 9)-(line 192,col 58)",
        "(line 193,col 9)-(line 193,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 204,
      "end_line": 211,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 220,
      "end_line": 274,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 230,col 36)",
        "(line 231,col 9)-(line 231,col 36)",
        "(line 234,col 9)-(line 234,col 27)",
        "(line 235,col 9)-(line 235,col 27)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 237,col 9)-(line 237,col 28)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 47)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 28)",
        "(line 256,col 9)-(line 256,col 26)",
        "(line 257,col 9)-(line 257,col 27)",
        "(line 258,col 9)-(line 258,col 27)",
        "(line 259,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 284,
      "end_line": 289,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 85)",
        "(line 287,col 9)-(line 288,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 301,
      "end_line": 310,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 320,
      "end_line": 332,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing MathIllegalArgumentException if any of these checks fail.\n     *\n     * @param in input 2-way table to check\n     * @throws MathIllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 29)",
        "(line 330,col 9)-(line 330,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkRectangular(long[][])",
      "begin_line": 343,
      "end_line": 350,
      "comment": "\n     * Throws MathIllegalArgumentException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullPointerException if input array is null\n     * @throws MathIllegalArgumentException if input array is not rectangular\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkPositive(double[])",
      "begin_line": 358,
      "end_line": 364,
      "comment": "\n     * Check all entries of the input array are strictly postive.\n     *\n     * @param in Array to be tested.\n     * @exception NotStrictlyPositiveException if one entry is not positive.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[])",
      "begin_line": 372,
      "end_line": 378,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested.\n     * @exception NotPositiveException if one entry is negative.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[][])",
      "begin_line": 386,
      "end_line": 394,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested.\n     * @exception NotPositiveException if one entry is negative.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     *\n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 29)"
      ]
    }
  ]
}