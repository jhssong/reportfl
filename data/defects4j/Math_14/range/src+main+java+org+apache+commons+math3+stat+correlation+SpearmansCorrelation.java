{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/stat/correlation/SpearmansCorrelation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpearmansCorrelation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Input data "
    },
    {
      "type": "field",
      "varNames": [
        "rankingAlgorithm"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Ranking algorithm  "
    },
    {
      "type": "field",
      "varNames": [
        "rankCorrelation"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Rank correlation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create a SpearmansCorrelation without data.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math3.stat.ranking.RankingAlgorithm)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Create a SpearmansCorrelation with the given ranking algorithm.\n     *\n     * @param rankingAlgorithm ranking algorithm\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 20)",
        "(line 67,col 9)-(line 67,col 49)",
        "(line 68,col 9)-(line 68,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Create a SpearmansCorrelation from the given data matrix.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.SpearmansCorrelation(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.stat.ranking.RankingAlgorithm)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * Create a SpearmansCorrelation with the given input data matrix\n     * and ranking algorithm.\n     *\n     * @param dataMatrix matrix of data with columns representing\n     * variables to correlate\n     * @param rankingAlgorithm ranking algorithm\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 38)",
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 92,col 28)",
        "(line 93,col 9)-(line 93,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.getCorrelationMatrix()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Calculate the Spearman Rank Correlation Matrix.\n     *\n     * @return Spearman Rank Correlation Matrix\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.getRankCorrelation()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Returns a {@link PearsonsCorrelation} instance constructed from the\n     * ranked input data. That is,\n     * \u003ccode\u003enew SpearmansCorrelation(matrix).getRankCorrelation()\u003c/code\u003e\n     * is equivalent to\n     * \u003ccode\u003enew PearsonsCorrelation(rankTransform(matrix))\u003c/code\u003e where\n     * \u003ccode\u003erankTransform(matrix)\u003c/code\u003e is the result of applying the\n     * configured \u003ccode\u003eRankingAlgorithm\u003c/code\u003e to each of the columns of\n     * \u003ccode\u003ematrix.\u003c/code\u003e\n     *\n     * @return PearsonsCorrelation among ranked column data\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input matrix.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 46)",
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 131,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.computeCorrelationMatrix(double[][])",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation matrix for the columns of the\n     * input rectangular array.  The columns of the array represent values\n     * of variables to be correlated.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 143,col 8)-(line 143,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.correlation(double[], double[])",
      "begin_line": 155,
      "end_line": 165,
      "comment": "\n     * Computes the Spearman\u0027s rank correlation coefficient between the two arrays.\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return Returns Spearman\u0027s rank correlation coefficient for the two arrays\n     * @throws DimensionMismatchException if the arrays lengths do not match\n     * @throws MathIllegalArgumentException if the array length is less than 2\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.SpearmansCorrelation.rankTransform(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 173,
      "end_line": 177,
      "comment": "\n     * Applies rank transform to each of the columns of \u003ccode\u003ematrix\u003c/code\u003e\n     * using the current \u003ccode\u003erankingAlgorithm\u003c/code\u003e\n     *\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)"
      ]
    }
  ]
}