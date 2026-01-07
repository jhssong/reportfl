{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/random/CorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 63,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Storage for the normalized vector. "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Permutated Cholesky root of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Rank of the covariance matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(double[], org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 97,
      "end_line": 113,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a correlated random vector generator from its mean\n     * vector and covariance matrix.\u003c/p\u003e\n     * @param mean expected mean values for all components\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception IllegalArgumentException if there is a dimension\n     * mismatch between the mean vector and the covariance matrix\n     * @exception NonPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     * @exception DimensionMismatchException if the mean and covariance\n     * arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 49)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 110,col 9)-(line 110,col 35)",
        "(line 111,col 9)-(line 111,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 126,
      "end_line": 139,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a null mean random correlated vector generator from its\n     * covariance matrix.\u003c/p\u003e\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception NonPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 49)",
        "(line 129,col 9)-(line 129,col 33)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 37)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getGenerator()",
      "begin_line": 144,
      "end_line": 146,
      "comment": " Get the underlying normalized components generator.\n     * @return underlying uncorrelated components generator\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRootMatrix()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRank()",
      "begin_line": 165,
      "end_line": 167,
      "comment": " Get the rank of the covariance matrix.\n     * The rank is the number of independent rows in the covariance\n     * matrix, it is also the number of columns of the rectangular\n     * matrix of the decomposition.\n     * @return rank of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.decompose(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 186,
      "end_line": 274,
      "comment": " Decompose the original square matrix.\n     * \u003cp\u003eThe decomposition is based on a Choleski decomposition\n     * where additional transforms are performed:\n     * \u003cul\u003e\n     *   \u003cli\u003ethe rows of the decomposed matrix are permuted\u003c/li\u003e\n     *   \u003cli\u003ecolumns with the too small diagonal element are discarded\u003c/li\u003e\n     *   \u003cli\u003ethe matrix is permuted\u003c/li\u003e\n     * \u003c/ul\u003e\n     * This means that rather than computing M \u003d U\u003csup\u003eT\u003c/sup\u003e.U where U\n     * is an upper triangular matrix, this method computed M\u003dB.B\u003csup\u003eT\u003c/sup\u003e\n     * where B is a rectangular matrix.\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @exception NonPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 49)",
        "(line 188,col 9)-(line 188,col 44)",
        "(line 189,col 9)-(line 189,col 48)",
        "(line 191,col 9)-(line 191,col 37)",
        "(line 192,col 9)-(line 192,col 37)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 17)",
        "(line 198,col 9)-(line 264,col 9)",
        "(line 267,col 9)-(line 267,col 57)",
        "(line 268,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 280,
      "end_line": 298,
      "comment": " Generate a correlated random vector.\n     * @return a random vector as an array of double. The returned array\n     * is created at each call, the caller can do what it wants with it.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 9)",
        "(line 288,col 9)-(line 288,col 54)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 296,col 26)"
      ]
    }
  ]
}