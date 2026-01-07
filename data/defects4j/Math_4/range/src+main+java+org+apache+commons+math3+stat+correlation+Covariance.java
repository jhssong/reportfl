{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/correlation/Covariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Covariance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 296,
      "comment": "\n * Computes covariances for pairs of arrays or columns of a matrix.\n *\n * \u003cp\u003eThe constructors that take \u003ccode\u003eRealMatrix\u003c/code\u003e or\n * \u003ccode\u003edouble[][]\u003c/code\u003e arguments generate covariance matrices.  The\n * columns of the input matrices are assumed to represent variable values.\u003c/p\u003e\n *\n * \u003cp\u003eThe constructor argument \u003ccode\u003ebiasCorrected\u003c/code\u003e determines whether or\n * not computed covariances are bias-corrected.\u003c/p\u003e\n *\n * \u003cp\u003eUnbiased covariances are given by the formula\u003c/p\u003e\n * \u003ccode\u003ecov(X, Y) \u003d \u0026Sigma;[(x\u003csub\u003ei\u003c/sub\u003e - E(X))(y\u003csub\u003ei\u003c/sub\u003e - E(Y))] / (n - 1)\u003c/code\u003e\n * where \u003ccode\u003eE(X)\u003c/code\u003e is the mean of \u003ccode\u003eX\u003c/code\u003e and \u003ccode\u003eE(Y)\u003c/code\u003e\n * is the mean of the \u003ccode\u003eY\u003c/code\u003e values.\n *\n * \u003cp\u003eNon-bias-corrected estimates use \u003ccode\u003en\u003c/code\u003e in place of \u003ccode\u003en - 1\u003c/code\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceMatrix"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " covariance matrix "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of observations (length of covariate vectors) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.Covariance()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Create a Covariance with no data\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 32)",
        "(line 64,col 9)-(line 64,col 14)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.Covariance(double[][], boolean)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Create a Covariance matrix from a rectangular array\n     * whose columns represent covariates.\n     *\n     * \u003cp\u003eThe \u003ccode\u003ebiasCorrected\u003c/code\u003e parameter determines whether or not\n     * covariance estimates are bias-corrected.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe input array must be rectangular with at least one column\n     * and two rows.\u003c/p\u003e\n     *\n     * @param data rectangular array with columns representing covariates\n     * @param biasCorrected true means covariances are bias-corrected\n     * @throws MathIllegalArgumentException if the input data array is not\n     * rectangular with at least two rows and one column.\n     * @throws NotStrictlyPositiveException if the input data array is not\n     * rectangular with at least one row and one column.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.Covariance(double[][])",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Create a Covariance matrix from a rectangular array\n     * whose columns represent covariates.\n     *\n     * \u003cp\u003eThe input array must be rectangular with at least one column\n     * and two rows\u003c/p\u003e\n     *\n     * @param data rectangular array with columns representing covariates\n     * @throws MathIllegalArgumentException if the input data array is not\n     * rectangular with at least two rows and one column.\n     * @throws NotStrictlyPositiveException if the input data array is not\n     * rectangular with at least one row and one column.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.Covariance(org.apache.commons.math3.linear.RealMatrix, boolean)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * Create a covariance matrix from a matrix whose columns\n     * represent covariates.\n     *\n     * \u003cp\u003eThe \u003ccode\u003ebiasCorrected\u003c/code\u003e parameter determines whether or not\n     * covariance estimates are bias-corrected.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe matrix must have at least one column and two rows\u003c/p\u003e\n     *\n     * @param matrix matrix with columns representing covariates\n     * @param biasCorrected true means covariances are bias-corrected\n     * @throws MathIllegalArgumentException if the input matrix does not have\n     * at least two rows and one column\n     ",
      "child_ranges": [
        "(line 123,col 8)-(line 123,col 35)",
        "(line 124,col 8)-(line 124,col 36)",
        "(line 125,col 8)-(line 125,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.Covariance(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Create a covariance matrix from a matrix whose columns\n     * represent covariates.\n     *\n     * \u003cp\u003eThe matrix must have at least one column and two rows\u003c/p\u003e\n     *\n     * @param matrix matrix with columns representing covariates\n     * @throws MathIllegalArgumentException if the input matrix does not have\n     * at least two rows and one column\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.getCovarianceMatrix()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Returns the covariance matrix\n     *\n     * @return covariance matrix\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.getN()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Returns the number of observations (length of covariate vectors)\n     *\n     * @return number of observations\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.computeCovarianceMatrix(org.apache.commons.math3.linear.RealMatrix, boolean)",
      "begin_line": 168,
      "end_line": 182,
      "comment": "\n     * Compute a covariance matrix from a matrix whose columns represent\n     * covariates.\n     * @param matrix input matrix (must have at least one column and two rows)\n     * @param biasCorrected determines whether or not covariance estimates are bias-corrected\n     * @return covariance matrix\n     * @throws MathIllegalArgumentException if the matrix does not contain sufficient data\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 52)",
        "(line 171,col 9)-(line 171,col 56)",
        "(line 172,col 9)-(line 172,col 73)",
        "(line 173,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.computeCovarianceMatrix(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Create a covariance matrix from a matrix whose columns represent\n     * covariates. Covariances are computed using the bias-corrected formula.\n     * @param matrix input matrix (must have at least one column and two rows)\n     * @return covariance matrix\n     * @throws MathIllegalArgumentException if matrix does not contain sufficient data\n     * @see #Covariance\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.computeCovarianceMatrix(double[][], boolean)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Compute a covariance matrix from a rectangular array whose columns represent\n     * covariates.\n     * @param data input array (must have at least one column and two rows)\n     * @param biasCorrected determines whether or not covariance estimates are bias-corrected\n     * @return covariance matrix\n     * @throws MathIllegalArgumentException if the data array does not contain sufficient\n     * data\n     * @throws NotStrictlyPositiveException if the input data array is not\n     * rectangular with at least one row and one column.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.computeCovarianceMatrix(double[][])",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Create a covariance matrix from a rectangular array whose columns represent\n     * covariates. Covariances are computed using the bias-corrected formula.\n     * @param data input array (must have at least one column and two rows)\n     * @return covariance matrix\n     * @throws MathIllegalArgumentException if the data array does not contain sufficient data\n     * @throws NotStrictlyPositiveException if the input data array is not\n     * rectangular with at least one row and one column.\n     * @see #Covariance\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.covariance(double[], double[], boolean)",
      "begin_line": 240,
      "end_line": 261,
      "comment": "\n     * Computes the covariance between the two arrays.\n     *\n     * \u003cp\u003eArray lengths must match and the common length must be at least 2.\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @param biasCorrected if true, returned value will be bias-corrected\n     * @return returns the covariance for the two arrays\n     * @throws  MathIllegalArgumentException if the arrays lengths do not match or\n     * there is insufficient data\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 31)",
        "(line 243,col 9)-(line 243,col 27)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.covariance(double[], double[])",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Computes the covariance between the two arrays, using the bias-corrected\n     * formula.\n     *\n     * \u003cp\u003eArray lengths must match and the common length must be at least 2.\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return returns the covariance for the two arrays\n     * @throws  MathIllegalArgumentException if the arrays lengths do not match or\n     * there is insufficient data\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.Covariance.checkSufficientData(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 287,
      "end_line": 295,
      "comment": "\n     * Throws MathIllegalArgumentException if the matrix does not have at least\n     * one column and two rows.\n     * @param matrix matrix to check\n     * @throws MathIllegalArgumentException if the matrix does not contain sufficient data\n     * to compute covariance\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 45)",
        "(line 289,col 9)-(line 289,col 48)",
        "(line 290,col 9)-(line 294,col 9)"
      ]
    }
  ]
}