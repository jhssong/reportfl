{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/correlation/SpearmansCorrelation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpearmansCorrelation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 260,
      "comment": "\n * Spearman\u0027s rank correlation. This implementation performs a rank\n * transformation on the input data and then computes {@link PearsonsCorrelation}\n * on the ranked data.\n * \u003cp\u003e\n * By default, ranks are computed using {@link NaturalRanking} with default\n * strategies for handling NaNs and ties in the data (NaNs maximal, ties averaged).\n * The ranking algorithm can be set using a constructor argument.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Input data "
    },
    {
      "type": "field",
      "varNames": [
        "rankingAlgorithm"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Ranking algorithm  "
    },
    {
      "type": "field",
      "varNames": [
        "rankCorrelation"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Rank correlation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Create a SpearmansCorrelation without data.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math3.stat.ranking.RankingAlgorithm)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Create a SpearmansCorrelation with the given ranking algorithm.\n     * \u003cp\u003e\n     * From version 4.0 onwards this constructor will throw an exception\n     * if the provided {@link NaturalRanking} uses a {@link NaNStrategy#REMOVED} strategy.\n     *\n     * @param rankingAlgorithm ranking algorithm\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 20)",
        "(line 75,col 9)-(line 75,col 49)",
        "(line 76,col 9)-(line 76,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Create a SpearmansCorrelation from the given data matrix.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.stat.ranking.RankingAlgorithm)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Create a SpearmansCorrelation with the given input data matrix\n     * and ranking algorithm.\n     * \u003cp\u003e\n     * From version 4.0 onwards this constructor will throw an exception\n     * if the provided {@link NaturalRanking} uses a {@link NaNStrategy#REMOVED} strategy.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     * @param rankingAlgorithm ranking algorithm\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 49)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 103,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.getCorrelationMatrix()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Calculate the Spearman Rank Correlation Matrix.\n     *\n     * @return Spearman Rank Correlation Matrix\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.getRankCorrelation()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns a {@link PearsonsCorrelation} instance constructed from the\n     * ranked input data. That is,\n     * \u003ccode\u003enew SpearmansCorrelation(matrix).getRankCorrelation()\u003c/code\u003e\n     * is equivalent to\n     * \u003ccode\u003enew PearsonsCorrelation(rankTransform(matrix))\u003c/code\u003e where\n     * \u003ccode\u003erankTransform(matrix)\u003c/code\u003e is the result of applying the\n     * configured \u003ccode\u003eRankingAlgorithm\u003c/code\u003e to each of the columns of\n     * \u003ccode\u003ematrix.\u003c/code\u003e\n     *\n     * @return PearsonsCorrelation among ranked column data\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input matrix.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 60)",
        "(line 140,col 9)-(line 140,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(double[][])",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input rectangular array.  The columns of the array represent values\n     * of variables to be correlated.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 152,col 8)-(line 152,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.correlation(double[], double[])",
      "begin_line": 164,
      "end_line": 185,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation coefficient between the two arrays.\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return Returns Spearman\u0027s rank correlation coefficient for the two arrays\n     * @throws DimensionMismatchException if the arrays lengths do not match\n     * @throws MathIllegalArgumentException if the array length is less than 2\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.rankTransform(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 194,
      "end_line": 223,
      "comment": "\n     * Applies rank transform to each of the columns of \u003ccode\u003ematrix\u003c/code\u003e\n     * using the current \u003ccode\u003erankingAlgorithm\u003c/code\u003e.\n     *\n     * @param matrix matrix to transform\n     * @return a rank-transformed matrix\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 38)",
        "(line 197,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.getNaNPositions(double[])",
      "begin_line": 231,
      "end_line": 239,
      "comment": "\n     * Returns a list containing the indices of NaN values in the input array.\n     *\n     * @param input the input array\n     * @return a list of NaN positions in the input array\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 65)",
        "(line 233,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.removeValues(double[], java.util.Set\u003cjava.lang.Integer\u003e)",
      "begin_line": 248,
      "end_line": 259,
      "comment": "\n     * Removes all values from the input array at the specified indices.\n     *\n     * @param input the input array\n     * @param indices a set containing the indices to be removed\n     * @return the input array without the values at the specified indices\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 74)",
        "(line 253,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 22)"
      ]
    }
  ]
}