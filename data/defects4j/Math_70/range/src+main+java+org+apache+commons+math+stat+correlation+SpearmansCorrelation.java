{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/correlation/SpearmansCorrelation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpearmansCorrelation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Input data "
    },
    {
      "type": "field",
      "varNames": [
        "rankingAlgorithm"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Ranking algorithm  "
    },
    {
      "type": "field",
      "varNames": [
        "rankCorrelation"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Rank correlation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.stat.ranking.RankingAlgorithm)",
      "begin_line": 58,
      "end_line": 63,
      "comment": "\n     * Create a SpearmansCorrelation with the given input data matrix\n     * and ranking algorithm.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     * @param rankingAlgorithm ranking algorithm\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 38)",
        "(line 60,col 9)-(line 60,col 49)",
        "(line 61,col 9)-(line 61,col 28)",
        "(line 62,col 9)-(line 62,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Create a SpearmansCorrelation from the given data matrix.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.SpearmansCorrelation()",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Create a SpearmansCorrelation without data.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)",
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 81,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.getCorrelationMatrix()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Calculate the Spearman Rank Correlation Matrix.\n     *\n     * @return Spearman Rank Correlation Matrix\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.getRankCorrelation()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Returns a {@link PearsonsCorrelation} instance constructed from the\n     * ranked input data. That is,\n     * \u003ccode\u003enew SpearmansCorrelation(matrix).getRankCorrelation()\u003c/code\u003e\n     * is equivalent to\n     * \u003ccode\u003enew PearsonsCorrelation(rankTransform(matrix))\u003c/code\u003e where\n     * \u003ccode\u003erankTransform(matrix)\u003c/code\u003e is the result of applying the\n     * configured \u003ccode\u003eRankingAlgorithm\u003c/code\u003e to each of the columns of\n     * \u003ccode\u003ematrix.\u003c/code\u003e\n     *\n     * @return PearsonsCorrelation among ranked column data\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input matrix.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 46)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 119,col 9)-(line 119,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(double[][])",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input rectangular array.  The columns of the array represent values\n     * of variables to be correlated.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 131,col 8)-(line 131,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.correlation(double[], double[])",
      "begin_line": 146,
      "end_line": 157,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation coefficient between the two arrays.\n     *\n     * \u003c/p\u003eThrows IllegalArgumentException if the arrays do not have the same length\n     * or their common length is less than 2\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return Returns Spearman\u0027s rank correlation coefficient for the two arrays\n     * @throws  IllegalArgumentException if the arrays lengths do not match or\n     * there is insufficient data\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.rankTransform(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "\n     * Applies rank transform to each of the columns of \u003ccode\u003ematrix\u003c/code\u003e\n     * using the current \u003ccode\u003erankingAlgorithm\u003c/code\u003e\n     *\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)"
      ]
    }
  ]
}