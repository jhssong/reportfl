{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/stat/correlation/PearsonsCorrelation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PearsonsCorrelation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 283,
      "comment": "\n * Computes Pearson\u0027s product-moment correlation coefficients for pairs of arrays\n * or columns of a matrix.\n *\n * \u003cp\u003eThe constructors that take \u003ccode\u003eRealMatrix\u003c/code\u003e or\n * \u003ccode\u003edouble[][]\u003c/code\u003e arguments generate correlation matrices.  The\n * columns of the input matrices are assumed to represent variable values.\n * Correlations are given by the formula\u003c/p\u003e\n * \u003ccode\u003ecor(X, Y) \u003d \u0026Sigma;[(x\u003csub\u003ei\u003c/sub\u003e - E(X))(y\u003csub\u003ei\u003c/sub\u003e - E(Y))] / [(n - 1)s(X)s(Y)]\u003c/code\u003e\n * where \u003ccode\u003eE(X)\u003c/code\u003e is the mean of \u003ccode\u003eX\u003c/code\u003e, \u003ccode\u003eE(Y)\u003c/code\u003e\n * is the mean of the \u003ccode\u003eY\u003c/code\u003e values and s(X), s(Y) are standard deviations.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "correlationMatrix"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " correlation matrix "
    },
    {
      "type": "field",
      "varNames": [
        "nObs"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " number of observations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.PearsonsCorrelation()",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Create a PearsonsCorrelation instance without data\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 56,col 33)",
        "(line 57,col 9)-(line 57,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(double[][])",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Create a PearsonsCorrelation from a rectangular array\n     * whose columns represent values of variables to be correlated.\n     *\n     * @param data rectangular array with columns representing variables\n     * @throws IllegalArgumentException if the input data array is not\n     * rectangular with at least two rows and two columns.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Create a PearsonsCorrelation from a RealMatrix whose columns\n     * represent variables to be correlated.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 36)",
        "(line 80,col 9)-(line 80,col 40)",
        "(line 81,col 9)-(line 81,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(org.apache.commons.math.stat.correlation.Covariance)",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\n     * Create a PearsonsCorrelation from a {@link Covariance}.  The correlation\n     * matrix is computed by scaling the Covariance\u0027s covariance matrix.\n     * The Covariance instance must have been created from a data matrix with\n     * columns representing variable values.\n     *\n     * @param covariance Covariance instance\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 71)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Create a PearsonsCorrelation from a covariance matrix.  The correlation\n     * matrix is computed by scaling the covariance matrix.\n     *\n     * @param covarianceMatrix covariance matrix\n     * @param numberOfObservations the number of observations in the dataset used to compute\n     * the covariance matrix\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 36)",
        "(line 111,col 9)-(line 111,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationMatrix()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Returns the correlation matrix\n     *\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors()",
      "begin_line": 136,
      "end_line": 146,
      "comment": "\n     * Returns a matrix of standard errors associated with the estimates\n     * in the correlation matrix.\u003cbr/\u003e\n     * \u003ccode\u003egetCorrelationStandardErrors().getEntry(i,j)\u003c/code\u003e is the standard\n     * error associated with \u003ccode\u003egetCorrelationMatrix.getEntry(i,j)\u003c/code\u003e\n     * \u003cp\u003eThe formula used to compute the standard error is \u003cbr/\u003e\n     * \u003ccode\u003eSE\u003csub\u003er\u003c/sub\u003e \u003d ((1 - r\u003csup\u003e2\u003c/sup\u003e) / (n - 2))\u003csup\u003e1/2\u003c/sup\u003e\u003c/code\u003e\n     * where \u003ccode\u003er\u003c/code\u003e is the estimated correlation coefficient and\n     * \u003ccode\u003en\u003c/code\u003e is the number of observations in the source dataset.\u003c/p\u003e\n     *\n     * @return matrix of correlation standard errors\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 59)",
        "(line 138,col 9)-(line 138,col 50)",
        "(line 139,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues()",
      "begin_line": 161,
      "end_line": 177,
      "comment": "\n     * Returns a matrix of p-values associated with the (two-sided) null\n     * hypothesis that the corresponding correlation coefficient is zero.\n     * \u003cp\u003e\u003ccode\u003egetCorrelationPValues().getEntry(i,j)\u003c/code\u003e is the probability\n     * that a random variable distributed as \u003ccode\u003et\u003csub\u003en-2\u003c/sub\u003e\u003c/code\u003e takes\n     * a value with absolute value greater than or equal to \u003cbr\u003e\n     * \u003ccode\u003e|r|((n - 2) / (1 - r\u003csup\u003e2\u003c/sup\u003e))\u003csup\u003e1/2\u003c/sup\u003e\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003eThe values in the matrix are sometimes referred to as the\n     * \u003ci\u003esignificance\u003c/i\u003e of the corresponding correlation coefficients.\u003c/p\u003e\n     *\n     * @return matrix of p-values\n     * @throws MathException if an error occurs estimating probabilities\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 70)",
        "(line 163,col 9)-(line 163,col 59)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 187,
      "end_line": 199,
      "comment": "\n     * Computes the correlation matrix for the columns of the\n     * input matrix.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 48)",
        "(line 189,col 9)-(line 189,col 65)",
        "(line 190,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(double[][])",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Computes the correlation matrix for the columns of the\n     * input rectangular array.  The colums of the array represent values\n     * of variables to be correlated.\n     *\n     * @param data matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 210,col 8)-(line 210,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.correlation(double[], double[])",
      "begin_line": 225,
      "end_line": 239,
      "comment": "\n     * Computes the Pearson\u0027s product-moment correlation coefficient between the two arrays.\n     *\n     * \u003c/p\u003eThrows IllegalArgumentException if the arrays do not have the same length\n     * or their common length is less than 2\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return Returns Pearson\u0027s correlation coefficient for the two arrays\n     * @throws  IllegalArgumentException if the arrays lengths do not match or\n     * there is insufficient data\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 61)",
        "(line 227,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 252,
      "end_line": 266,
      "comment": "\n     * Derives a correlation matrix from a covariance matrix.\n     *\n     * \u003cp\u003eUses the formula \u003cbr/\u003e\n     * \u003ccode\u003er(X,Y) \u003d cov(X,Y)/s(X)s(Y)\u003c/code\u003e where\n     * \u003ccode\u003er(\u0026middot,\u0026middot;)\u003c/code\u003e is the correlation coefficient and\n     * \u003ccode\u003es(\u0026middot;)\u003c/code\u003e means standard deviation.\u003c/p\u003e\n     *\n     * @param covarianceMatrix the covariance matrix\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 58)",
        "(line 254,col 9)-(line 254,col 65)",
        "(line 255,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 274,
      "end_line": 282,
      "comment": "\n     * Throws IllegalArgumentException of the matrix does not have at least\n     * two columns and two rows\n     *\n     * @param matrix matrix to check for sufficiency\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 45)",
        "(line 276,col 9)-(line 276,col 48)",
        "(line 277,col 9)-(line 281,col 9)"
      ]
    }
  ]
}