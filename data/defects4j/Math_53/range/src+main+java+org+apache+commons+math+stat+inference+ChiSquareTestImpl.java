{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 36,
      "end_line": 415,
      "comment": "\n * Implements Chi-Square test statistics defined in the\n * {@link UnknownDistributionChiSquareTest} interface.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Distribution used to compute inference statistics. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct a ChiSquareTestImpl\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Create a test instance using the given distribution for computing\n     * inference statistics.\n     * @param x distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 56,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(double[], long[])",
      "begin_line": 69,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws DimensionMismatchException if the arrays length is less than 2.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 77,col 35)",
        "(line 78,col 9)-(line 78,col 32)",
        "(line 79,col 9)-(line 79,col 32)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 28)",
        "(line 85,col 9)-(line 85,col 32)",
        "(line 86,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 28)",
        "(line 91,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 77)",
        "(line 118,col 9)-(line 119,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 136,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 151,
      "end_line": 179,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws MathIllegalArgumentException if preconditions are not met.\n     ",
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
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 82)",
        "(line 191,col 9)-(line 191,col 58)",
        "(line 192,col 9)-(line 192,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 203,
      "end_line": 210,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 219,
      "end_line": 273,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 229,col 9)-(line 229,col 36)",
        "(line 230,col 9)-(line 230,col 36)",
        "(line 233,col 9)-(line 233,col 27)",
        "(line 234,col 9)-(line 234,col 27)",
        "(line 235,col 9)-(line 235,col 38)",
        "(line 236,col 9)-(line 236,col 28)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 28)",
        "(line 255,col 9)-(line 255,col 26)",
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 27)",
        "(line 258,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 283,
      "end_line": 288,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 85)",
        "(line 286,col 9)-(line 287,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 300,
      "end_line": 309,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 319,
      "end_line": 333,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing MathIllegalArgumentException if any of these checks fail.\n     *\n     * @param in input 2-way table to check\n     * @throws MathIllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 330,col 29)",
        "(line 331,col 9)-(line 331,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkRectangular(long[][])",
      "begin_line": 344,
      "end_line": 353,
      "comment": "\n     * Throws MathIllegalArgumentException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullArgumentException if input array is null\n     * @throws MathIllegalArgumentException if input array is not rectangular\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 35)",
        "(line 347,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkPositive(double[])",
      "begin_line": 361,
      "end_line": 369,
      "comment": "\n     * Check all entries of the input array are strictly positive.\n     *\n     * @param in Array to be tested.\n     * @exception MathIllegalArgumentException if one entry is not positive.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[])",
      "begin_line": 377,
      "end_line": 385,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested.\n     * @exception MathIllegalArgumentException if one entry is negative.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[][])",
      "begin_line": 393,
      "end_line": 403,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested.\n     * @exception MathIllegalArgumentException if one entry is negative.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     *\n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 29)"
      ]
    }
  ]
}