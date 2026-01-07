{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.ChiSquareTest"
      ],
      "begin_line": 27,
      "end_line": 279,
      "comment": "\n * Implements Chi-Square test statistics defined in the {@link ChiSquareTest} interface.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "distributionFactory"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Cached DistributionFactory used to create ChiSquaredDistribution instances "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl()",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Construct a ChiSquareTestImpl \n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(double[], long[])",
      "begin_line": 46,
      "end_line": 63,
      "comment": "\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     * or length is less than 2\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 28)",
        "(line 49,col 9)-(line 49,col 26)",
        "(line 50,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 72,
      "end_line": 79,
      "comment": "\n     * @param observed array of observed frequency counts\n     * @param expected array of exptected frequency counts\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 50)",
        "(line 77,col 9)-(line 78,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * @param observed array of observed frequency counts\n     * @param expected array of exptected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 104,
      "end_line": 133,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 27)",
        "(line 107,col 9)-(line 107,col 34)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 28)",
        "(line 114,col 9)-(line 120,col 9)",
        "(line 123,col 9)-(line 123,col 28)",
        "(line 124,col 9)-(line 124,col 31)",
        "(line 125,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 27)",
        "(line 144,col 9)-(line 144,col 82)",
        "(line 145,col 9)-(line 146,col 69)",
        "(line 147,col 9)-(line 147,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 174,
      "end_line": 192,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing IllegalArgumentException if any of these checks fail.\n     * \n     * @param in input 2-way table to check\n     * @throws IllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.getDistributionFactory()",
      "begin_line": 200,
      "end_line": 205,
      "comment": "\n     * Gets a DistributionFactory to use in creating ChiSquaredDistribution instances.\n     * \n     * @return a DistributionFactory\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(long[][])",
      "begin_line": 217,
      "end_line": 224,
      "comment": "\n     * Returns true iff input array is rectangular.\n     * \n     * @param in array to be tested\n     * @return true if the array is rectangular\n     * @throws NullPointerException if input array is null\n     * @throws ArrayIndexOutOfBoundsException if input array is empty\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive(double[])",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are positive\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[])",
      "begin_line": 251,
      "end_line": 258,
      "comment": "\n     * Returns true iff all entries of the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(long[][])",
      "begin_line": 268,
      "end_line": 277,
      "comment": "\n     * Returns true iff all entries of (all subarrays of) the input array are \u003e\u003d 0.\n     * Returns true if the array is non-null, but empty\n     * \n     * @param in array to be tested\n     * @return true if all entries of the array are non-negative\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 20)"
      ]
    }
  ]
}