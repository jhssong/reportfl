{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/stat/inference/ChiSquareTestImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquareTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest"
      ],
      "begin_line": 35,
      "end_line": 393,
      "comment": "\n * Implements Chi-Square test statistics defined in the\n * {@link UnknownDistributionChiSquareTest} interface.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.ChiSquareTestImpl()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct a ChiSquareTestImpl\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(double[], long[])",
      "begin_line": 55,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return chi-square test statistic\n     * @throws DimensionMismatchException if the arrays length is less than 2.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 32)",
        "(line 63,col 9)-(line 63,col 35)",
        "(line 64,col 9)-(line 64,col 32)",
        "(line 65,col 9)-(line 65,col 32)",
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 32)",
        "(line 72,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 28)",
        "(line 77,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[])",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 104,col 62)",
        "(line 105,col 9)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(double[], long[], double)",
      "begin_line": 123,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\u003cstrong\u003eNote: \u003c/strong\u003eThis implementation rescales the\n     * \u003ccode\u003eexpected\u003c/code\u003e array if necessary to ensure that the sum of the\n     * expected and observed counts are equal.\u003c/p\u003e\n     *\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(long[][])",
      "begin_line": 138,
      "end_line": 166,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return chi-square test statistic\n     * @throws MathIllegalArgumentException if preconditions are not met.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 27)",
        "(line 140,col 9)-(line 140,col 34)",
        "(line 141,col 9)-(line 141,col 37)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 145,col 44)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 153,col 9)",
        "(line 156,col 9)-(line 156,col 28)",
        "(line 157,col 9)-(line 157,col 31)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][])",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 27)",
        "(line 177,col 9)-(line 177,col 82)",
        "(line 178,col 9)-(line 178,col 44)",
        "(line 179,col 9)-(line 179,col 54)",
        "(line 180,col 9)-(line 180,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(long[][], double)",
      "begin_line": 191,
      "end_line": 198,
      "comment": "\n     * @param counts array representation of 2-way table\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 207,
      "end_line": 261,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chi-square test statistic\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 217,col 36)",
        "(line 218,col 9)-(line 218,col 36)",
        "(line 221,col 9)-(line 221,col 27)",
        "(line 222,col 9)-(line 222,col 27)",
        "(line 223,col 9)-(line 223,col 38)",
        "(line 224,col 9)-(line 224,col 28)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 47)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 28)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 244,col 9)-(line 244,col 27)",
        "(line 245,col 9)-(line 245,col 27)",
        "(line 246,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 271,
      "end_line": 277,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 44)",
        "(line 274,col 9)-(line 274,col 81)",
        "(line 275,col 9)-(line 276,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 289,
      "end_line": 298,
      "comment": "\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws MathIllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(long[][])",
      "begin_line": 308,
      "end_line": 322,
      "comment": "\n     * Checks to make sure that the input long[][] array is rectangular,\n     * has at least 2 rows and 2 columns, and has all non-negative entries,\n     * throwing MathIllegalArgumentException if any of these checks fail.\n     *\n     * @param in input 2-way table to check\n     * @throws MathIllegalArgumentException if the array is not valid\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 29)",
        "(line 320,col 9)-(line 320,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkRectangular(long[][])",
      "begin_line": 333,
      "end_line": 342,
      "comment": "\n     * Throws MathIllegalArgumentException if the input array is not rectangular.\n     *\n     * @param in array to be tested\n     * @throws NullArgumentException if input array is null\n     * @throws MathIllegalArgumentException if input array is not rectangular\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 35)",
        "(line 336,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkPositive(double[])",
      "begin_line": 350,
      "end_line": 358,
      "comment": "\n     * Check all entries of the input array are strictly positive.\n     *\n     * @param in Array to be tested.\n     * @exception MathIllegalArgumentException if one entry is not positive.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[])",
      "begin_line": 366,
      "end_line": 374,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested.\n     * @exception MathIllegalArgumentException if one entry is negative.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkNonNegative(long[][])",
      "begin_line": 382,
      "end_line": 392,
      "comment": "\n     * Check all entries of the input array are \u003e\u003d 0.\n     *\n     * @param in Array to be tested.\n     * @exception MathIllegalArgumentException if one entry is negative.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 391,col 9)"
      ]
    }
  ]
}