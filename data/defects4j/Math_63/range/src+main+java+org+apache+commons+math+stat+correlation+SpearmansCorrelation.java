{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/stat/correlation/SpearmansCorrelation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpearmansCorrelation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Input data "
    },
    {
      "type": "field",
      "varNames": [
        "rankingAlgorithm"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Ranking algorithm  "
    },
    {
      "type": "field",
      "varNames": [
        "rankCorrelation"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Rank correlation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.stat.ranking.RankingAlgorithm)",
      "begin_line": 59,
      "end_line": 64,
      "comment": "\n     * Create a SpearmansCorrelation with the given input data matrix\n     * and ranking algorithm.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     * @param rankingAlgorithm ranking algorithm\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 38)",
        "(line 61,col 9)-(line 61,col 49)",
        "(line 62,col 9)-(line 62,col 28)",
        "(line 63,col 9)-(line 63,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Create a SpearmansCorrelation from the given data matrix.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.SpearmansCorrelation()",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Create a SpearmansCorrelation without data.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 20)",
        "(line 81,col 9)-(line 81,col 53)",
        "(line 82,col 9)-(line 82,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.getCorrelationMatrix()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Calculate the Spearman Rank Correlation Matrix.\n     *\n     * @return Spearman Rank Correlation Matrix\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.getRankCorrelation()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Returns a {@link PearsonsCorrelation} instance constructed from the\n     * ranked input data. That is,\n     * \u003ccode\u003enew SpearmansCorrelation(matrix).getRankCorrelation()\u003c/code\u003e\n     * is equivalent to\n     * \u003ccode\u003enew PearsonsCorrelation(rankTransform(matrix))\u003c/code\u003e where\n     * \u003ccode\u003erankTransform(matrix)\u003c/code\u003e is the result of applying the\n     * configured \u003ccode\u003eRankingAlgorithm\u003c/code\u003e to each of the columns of\n     * \u003ccode\u003ematrix.\u003c/code\u003e\n     *\n     * @return PearsonsCorrelation among ranked column data\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input matrix.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 46)",
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(double[][])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input rectangular array.  The columns of the array represent values\n     * of variables to be correlated.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 132,col 8)-(line 132,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.correlation(double[], double[])",
      "begin_line": 147,
      "end_line": 159,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation coefficient between the two arrays.\n     *\n     * \u003c/p\u003eThrows IllegalArgumentException if the arrays do not have the same length\n     * or their common length is less than 2\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return Returns Spearman\u0027s rank correlation coefficient for the two arrays\n     * @throws  IllegalArgumentException if the arrays lengths do not match or\n     * there is insufficient data\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.SpearmansCorrelation.rankTransform(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * Applies rank transform to each of the columns of \u003ccode\u003ematrix\u003c/code\u003e\n     * using the current \u003ccode\u003erankingAlgorithm\u003c/code\u003e\n     *\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)"
      ]
    }
  ]
}