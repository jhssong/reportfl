{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.ChiSquareTest"
      ],
      "begin_line": 29,
      "end_line": 293,
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
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 183,
      "end_line": 201,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     * \n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.getDistributionFactory()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Gets a DistributionFactory to use in creating ChiSquaredDistribution instances.\n     * @deprecated inject ChiSquaredDistribution instances directly instead of\n     *             using a factory.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(long[][])",
      "begin_line": 223,
      "end_line": 230,
      "comment": "\n     * Returns true iff input array is rectangular.\n     * \n     * @param in array to be tested\n     * @return true if the array is rectangular\n     * @throws NullPointerException if input array is null\n     * @throws ArrayIndexOutOfBoundsException if input array is empty\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive(double[])",
      "begin_line": 240,
      "end_line": 247,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are positive\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[])",
      "begin_line": 257,
      "end_line": 264,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[][])",
      "begin_line": 274,
      "end_line": 283,
      "comment": "\n     * Returns true iff all entries of (all subarrays of) the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * @param value the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 29)"
      ]
    }
  ]
}