{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/correlation/Covariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Covariance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 273,
      "comment": "\n * Computes covariances for pairs of arrays or columns of a matrix.\n *\n * \u003cp\u003eThe constructors that take \u003ccode\u003eRealMatrix\u003c/code\u003e or\n * \u003ccode\u003edouble[][]\u003c/code\u003e arguments generate covariance matrices.  The\n * columns of the input matrices are assumed to represent variable values.\u003c/p\u003e\n *\n * \u003cp\u003eThe constructor argument \u003ccode\u003ebiasCorrected\u003c/code\u003e determines whether or\n * not computed covariances are bias-corrected.\u003c/p\u003e\n *\n * \u003cp\u003eUnbiased covariances are given by the formula\u003c/p\u003e\n * \u003ccode\u003ecov(X, Y) \u003d \u0026Sigma;[(x\u003csub\u003ei\u003c/sub\u003e - E(X))(y\u003csub\u003ei\u003c/sub\u003e - E(Y))] / (n - 1)\u003c/code\u003e\n * where \u003ccode\u003eE(X)\u003c/code\u003e is the mean of \u003ccode\u003eX\u003c/code\u003e and \u003ccode\u003eE(Y)\u003c/code\u003e\n * is the mean of the \u003ccode\u003eY\u003c/code\u003e values.\n *\n * \u003cp\u003eNon-bias-corrected estimates use \u003ccode\u003en\u003c/code\u003e in place of \u003ccode\u003en - 1\u003c/code\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceMatrix"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " covariance matrix "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of observations (length of covariate vectors) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.Covariance()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Create a Covariance with no data\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)",
        "(line 61,col 9)-(line 61,col 32)",
        "(line 62,col 9)-(line 62,col 14)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.Covariance(double[][], boolean)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Create a Covariance matrix from a rectangular array\n     * whose columns represent covariates.\n     *\n     * \u003cp\u003eThe \u003ccode\u003ebiasCorrected\u003c/code\u003e parameter determines whether or not\n     * covariance estimates are bias-corrected.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe input array must be rectangular with at least two columns\n     * and two rows.\u003c/p\u003e\n     *\n     * @param data rectangular array with columns representing covariates\n     * @param biasCorrected true means covariances are bias-corrected\n     * @throws IllegalArgumentException if the input data array is not\n     * rectangular with at least two rows and two columns.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.Covariance(double[][])",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Create a Covariance matrix from a rectangular array\n     * whose columns represent covariates.\n     *\n     * \u003cp\u003eThe input array must be rectangular with at least two columns\n     * and two rows\u003c/p\u003e\n     *\n     * @param data rectangular array with columns representing covariates\n     * @throws IllegalArgumentException if the input data array is not\n     * rectangular with at least two rows and two columns.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.Covariance(org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Create a covariance matrix from a matrix whose columns\n     * represent covariates.\n     *\n     * \u003cp\u003eThe \u003ccode\u003ebiasCorrected\u003c/code\u003e parameter determines whether or not\n     * covariance estimates are bias-corrected.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe matrix must have at least two columns and two rows\u003c/p\u003e\n     *\n     * @param matrix matrix with columns representing covariates\n     * @param biasCorrected true means covariances are bias-corrected\n     * @throws IllegalArgumentException if the input matrix does not have\n     * at least two rows and two columns\n     ",
      "child_ranges": [
        "(line 114,col 8)-(line 114,col 35)",
        "(line 115,col 8)-(line 115,col 36)",
        "(line 116,col 8)-(line 116,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.Covariance(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Create a covariance matrix from a matrix whose columns\n     * represent covariates.\n     *\n     * \u003cp\u003eThe matrix must have at least two columns and two rows\u003c/p\u003e\n     *\n     * @param matrix matrix with columns representing covariates\n     * @throws IllegalArgumentException if the input matrix does not have\n     * at least two rows and two columns\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.getCovarianceMatrix()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns the covariance matrix\n     *\n     * @return covariance matrix\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.getN()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.computeCovarianceMatrix(org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 159,
      "end_line": 172,
      "comment": "\n     * Compute a covariance matrix from a matrix whose columns represent\n     * covariates.\n     * @param matrix input matrix (must have at least two columns and two rows)\n     * @param biasCorrected determines whether or not covariance estimates are bias-corrected\n     * @return covariance matrix\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 52)",
        "(line 161,col 9)-(line 161,col 56)",
        "(line 162,col 9)-(line 162,col 73)",
        "(line 163,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.computeCovarianceMatrix(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Create a covariance matrix from a matrix whose columns represent\n     * covariates. Covariances are computed using the bias-corrected formula.\n     * @param matrix input matrix (must have at least two columns and two rows)\n     * @return covariance matrix\n     * @see #Covariance\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.computeCovarianceMatrix(double[][], boolean)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Compute a covariance matrix from a rectangular array whose columns represent\n     * covariates.\n     * @param data input array (must have at least two columns and two rows)\n     * @param biasCorrected determines whether or not covariance estimates are bias-corrected\n     * @return covariance matrix\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.computeCovarianceMatrix(double[][])",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Create a covariance matrix from a rectangual array whose columns represent\n     * covariates. Covariances are computed using the bias-corrected formula.\n     * @param data input array (must have at least two columns and two rows)\n     * @return covariance matrix\n     * @see #Covariance\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.covariance(double[], double[], boolean)",
      "begin_line": 219,
      "end_line": 240,
      "comment": "\n     * Computes the covariance between the two arrays.\n     *\n     * \u003cp\u003eArray lengths must match and the common length must be at least 2.\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @param biasCorrected if true, returned value will be bias-corrected\n     * @return returns the covariance for the two arrays\n     * @throws  IllegalArgumentException if the arrays lengths do not match or\n     * there is insufficient data\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 31)",
        "(line 222,col 9)-(line 222,col 27)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 224,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.covariance(double[], double[])",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Computes the covariance between the two arrays, using the bias-corrected\n     * formula.\n     *\n     * \u003cp\u003eArray lengths must match and the common length must be at least 2.\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return returns the covariance for the two arrays\n     * @throws  IllegalArgumentException if the arrays lengths do not match or\n     * there is insufficient data\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.Covariance.checkSufficientData(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "\n     * Throws IllegalArgumentException of the matrix does not have at least\n     * two columns and two rows\n     * @param matrix matrix to check\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 45)",
        "(line 266,col 9)-(line 266,col 48)",
        "(line 267,col 9)-(line 271,col 9)"
      ]
    }
  ]
}