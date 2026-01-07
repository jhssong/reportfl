{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/correlation/StorelessCovariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessCovariance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.correlation.Covariance"
      ],
      "begin_line": 43,
      "end_line": 229,
      "comment": "\n * Covariance implementation that does not require input data to be\n * stored in memory. The size of the covariance matrix is specified in the\n * constructor. Specific elements of the matrix are incrementally updated with\n * calls to incrementRow() or increment Covariance().\n *\n * \u003cp\u003eThis class is based on a paper written by Philippe P\u0026eacute;bay:\n * \u003ca href\u003d\"http://prod.sandia.gov/techlib/access-control.cgi/2008/086212.pdf\"\u003e\n * Formulas for Robust, One-Pass Parallel Computation of Covariances and\n * Arbitrary-Order Statistical Moments\u003c/a\u003e, 2008, Technical Report SAND2008-6212,\n * Sandia National Laboratories.\u003c/p\u003e\n *\n * \u003cp\u003eNote: the underlying covariance matrix is symmetric, thus only the\n * upper triangular part of the matrix is stored and updated each increment.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "covMatrix"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " the square covariance matrix (upper triangular part) "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " dimension of the square covariance matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.StorelessCovariance(int)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Create a bias corrected covariance matrix with a given dimension.\n     *\n     * @param dim the dimension of the square covariance matrix\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.StorelessCovariance(int, boolean)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Create a covariance matrix with a given number of rows and columns and the\n     * indicated bias correction.\n     *\n     * @param dim the dimension of the covariance matrix\n     * @param biasCorrected if \u003ccode\u003etrue\u003c/code\u003e the covariance estimate is corrected\n     * for bias, i.e. n-1 in the denominator, otherwise there is no bias correction,\n     * i.e. n in the denominator.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 24)",
        "(line 71,col 9)-(line 71,col 86)",
        "(line 72,col 9)-(line 72,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.initializeMatrix(boolean)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n     * Initialize the internal two-dimensional array of\n     * {@link StorelessBivariateCovariance} instances.\n     *\n     * @param biasCorrected if the covariance estimate shall be corrected for bias\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.indexOf(int, int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the index (i, j) translated into the one-dimensional\n     * array used to store the upper triangular part of the symmetric\n     * covariance matrix.\n     *\n     * @param i the row index\n     * @param j the column index\n     * @return the corresponding index in the matrix array\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.getElement(int, int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Gets the element at index (i, j) from the covariance matrix\n     * @param i the row index\n     * @param j the column index\n     * @return the {@link StorelessBivariateCovariance} element at the given index\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.setElement(int, int, org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Sets the covariance element at index (i, j) in the covariance matrix\n     * @param i the row index\n     * @param j the column index\n     * @param cov the {@link StorelessBivariateCovariance} element to be set\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.getCovariance(int, int)",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Get the covariance for an individual element of the covariance matrix.\n     *\n     * @param xIndex row index in the covariance matrix\n     * @param yIndex column index in the covariance matrix\n     * @return the covariance of the given element\n     * @throws NumberIsTooSmallException if the number of observations\n     * in the cell is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.increment(double[])",
      "begin_line": 147,
      "end_line": 163,
      "comment": "\n     * Increment the covariance matrix with one row of data.\n     *\n     * @param data array representing one row of data.\n     * @throws DimensionMismatchException if the length of \u003ccode\u003erowData\u003c/code\u003e\n     * does not match with the covariance matrix\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 33)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 157,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.append(org.apache.commons.math3.stat.correlation.StorelessCovariance)",
      "begin_line": 174,
      "end_line": 186,
      "comment": "\n     * Appends {@code sc} to this, effectively aggregating the computations in {@code sc}\n     * with this.  After invoking this method, covariances returned should be close\n     * to what would have been obtained by performing all of the {@link #increment(double[])}\n     * operations in {@code sc} directly on this.\n     *\n     * @param sc externally computed StorelessCovariance to add to this\n     * @throws DimensionMismatchException if the dimension of sc does not match this\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 181,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.getCovarianceMatrix()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     * @throws NumberIsTooSmallException if the number of observations\n     * in a cell is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.getData()",
      "begin_line": 205,
      "end_line": 213,
      "comment": "\n     * Return the covariance matrix as two-dimensional array.\n     *\n     * @return a two-dimensional double array of covariance values\n     * @throws NumberIsTooSmallException if the number of observations\n     * for a cell is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 65)",
        "(line 207,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovariance.getN()",
      "begin_line": 224,
      "end_line": 228,
      "comment": "\n     * This {@link Covariance} method is not supported by a {@link StorelessCovariance},\n     * since the number of bivariate observations does not have to be the same for different\n     * pairs of covariates - i.e., N as defined in {@link Covariance#getN()} is undefined.\n     *\n     * @return nothing as this implementation always throws a\n     * {@link MathUnsupportedOperationException}\n     * @throws MathUnsupportedOperationException in all cases\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 54)"
      ]
    }
  ]
}