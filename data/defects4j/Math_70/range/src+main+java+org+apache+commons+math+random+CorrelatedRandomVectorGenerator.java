{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/CorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 62,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Storage for the normalized vector. "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Permutated Cholesky root of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Rank of the covariance matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(double[], org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 96,
      "end_line": 112,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a correlated random vector generator from its mean\n     * vector and covariance matrix.\u003c/p\u003e\n     * @param mean expected mean values for all components\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception IllegalArgumentException if there is a dimension\n     * mismatch between the mean vector and the covariance matrix\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     * @exception DimensionMismatchException if the mean and covariance\n     * arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 49)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 33)",
        "(line 107,col 9)-(line 107,col 37)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 110,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 125,
      "end_line": 140,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a null mean random correlated vector generator from its\n     * covariance matrix.\u003c/p\u003e\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 49)",
        "(line 130,col 9)-(line 130,col 33)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 37)",
        "(line 137,col 9)-(line 137,col 35)",
        "(line 138,col 9)-(line 138,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getGenerator()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " Get the underlying normalized components generator.\n     * @return underlying uncorrelated components generator\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRootMatrix()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRank()",
      "begin_line": 166,
      "end_line": 168,
      "comment": " Get the rank of the covariance matrix.\n     * The rank is the number of independent rows in the covariance\n     * matrix, it is also the number of columns of the rectangular\n     * matrix of the decomposition.\n     * @return rank of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.decompose(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 187,
      "end_line": 277,
      "comment": " Decompose the original square matrix.\n     * \u003cp\u003eThe decomposition is based on a Choleski decomposition\n     * where additional transforms are performed:\n     * \u003cul\u003e\n     *   \u003cli\u003ethe rows of the decomposed matrix are permuted\u003c/li\u003e\n     *   \u003cli\u003ecolumns with the too small diagonal element are discarded\u003c/li\u003e\n     *   \u003cli\u003ethe matrix is permuted\u003c/li\u003e\n     * \u003c/ul\u003e\n     * This means that rather than computing M \u003d U\u003csup\u003eT\u003c/sup\u003e.U where U\n     * is an upper triangular matrix, this method computed M\u003dB.B\u003csup\u003eT\u003c/sup\u003e\n     * where B is a rectangular matrix.\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 49)",
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 192,col 48)",
        "(line 194,col 9)-(line 194,col 37)",
        "(line 195,col 9)-(line 195,col 37)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 17)",
        "(line 201,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 270,col 57)",
        "(line 271,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 283,
      "end_line": 301,
      "comment": " Generate a correlated random vector.\n     * @return a random vector as an array of double. The returned array\n     * is created at each call, the caller can do what it wants with it.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 291,col 9)-(line 291,col 54)",
        "(line 292,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 26)"
      ]
    }
  ]
}