{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.ChiSquareTest"
      ],
      "begin_line": 29,
      "end_line": 388,
      "comment": "\n * Implements Chi-Square test statistics defined in the {@link ChiSquareTest} interface.\n *\n * @version $Revision$ $Date$\n "
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
      "begin_line": 58,
      "end_line": 75,
      "comment": "\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * or length is less than 2\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 28)",
        "(line 61,col 9)-(line 61,col 26)",
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 84,
      "end_line": 89,
      "comment": "\n     * @param observed array of observed frequency counts\n     * @param expected array of exptected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 64)",
        "(line 87,col 9)-(line 88,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 100,
      "end_line": 107,
      "comment": "\n     * @param observed array of observed frequency counts\n     * @param expected array of exptected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 114,
      "end_line": 143,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 27)",
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 28)",
        "(line 124,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 27)",
        "(line 154,col 9)-(line 154,col 82)",
        "(line 155,col 9)-(line 155,col 45)",
        "(line 156,col 9)-(line 156,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 181,
      "end_line": 234,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 27)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 197,col 9)-(line 197,col 38)",
        "(line 198,col 9)-(line 198,col 28)",
        "(line 199,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 49)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 28)",
        "(line 215,col 9)-(line 215,col 26)",
        "(line 216,col 9)-(line 216,col 27)",
        "(line 217,col 9)-(line 217,col 27)",
        "(line 218,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 243,
      "end_line": 248,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 72)",
        "(line 246,col 9)-(line 247,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 259,
      "end_line": 266,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 276,
      "end_line": 294,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     * \n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.getDistributionFactory()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Gets a DistributionFactory to use in creating ChiSquaredDistribution instances.\n     * @deprecated inject ChiSquaredDistribution instances directly instead of\n     *             using a factory.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(long[][])",
      "begin_line": 316,
      "end_line": 323,
      "comment": "\n     * Returns true iff input array is rectangular.\n     * \n     * @param in array to be tested\n     * @return true if the array is rectangular\n     * @throws NullPointerException if input array is null\n     * @throws ArrayIndexOutOfBoundsException if input array is empty\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive(double[])",
      "begin_line": 333,
      "end_line": 340,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are positive\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[])",
      "begin_line": 350,
      "end_line": 357,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[][])",
      "begin_line": 367,
      "end_line": 376,
      "comment": "\n     * Returns true iff all entries of (all subarrays of) the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * \n     * @param value\n     *            the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 29)"
      ]
    }
  ]
}