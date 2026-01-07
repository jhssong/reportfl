{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 30,
      "end_line": 404,
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
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * or length is less than 2\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 28)",
        "(line 75,col 9)-(line 75,col 26)",
        "(line 76,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of exptected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 64)",
        "(line 98,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the \n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     * \n     * @param observed array of observed frequency counts\n     * @param expected array of exptected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 130,
      "end_line": 159,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 27)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 37)",
        "(line 137,col 9)-(line 137,col 44)",
        "(line 138,col 9)-(line 138,col 44)",
        "(line 139,col 9)-(line 139,col 28)",
        "(line 140,col 9)-(line 146,col 9)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 150,col 9)-(line 150,col 31)",
        "(line 151,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 27)",
        "(line 170,col 9)-(line 170,col 82)",
        "(line 171,col 9)-(line 171,col 45)",
        "(line 172,col 9)-(line 172,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 197,
      "end_line": 250,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 27)",
        "(line 212,col 9)-(line 212,col 27)",
        "(line 213,col 9)-(line 213,col 38)",
        "(line 214,col 9)-(line 214,col 28)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 49)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 28)",
        "(line 231,col 9)-(line 231,col 26)",
        "(line 232,col 9)-(line 232,col 27)",
        "(line 233,col 9)-(line 233,col 27)",
        "(line 234,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 259,
      "end_line": 264,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 72)",
        "(line 262,col 9)-(line 263,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 275,
      "end_line": 282,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 292,
      "end_line": 310,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     * \n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.getDistributionFactory()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Gets a DistributionFactory to use in creating ChiSquaredDistribution instances.\n     * @deprecated inject ChiSquaredDistribution instances directly instead of\n     *             using a factory.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(long[][])",
      "begin_line": 332,
      "end_line": 339,
      "comment": "\n     * Returns true iff input array is rectangular.\n     * \n     * @param in array to be tested\n     * @return true if the array is rectangular\n     * @throws NullPointerException if input array is null\n     * @throws ArrayIndexOutOfBoundsException if input array is empty\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive(double[])",
      "begin_line": 349,
      "end_line": 356,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are positive\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[])",
      "begin_line": 366,
      "end_line": 373,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[][])",
      "begin_line": 383,
      "end_line": 392,
      "comment": "\n     * Returns true iff all entries of (all subarrays of) the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * \n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 29)"
      ]
    }
  ]
}