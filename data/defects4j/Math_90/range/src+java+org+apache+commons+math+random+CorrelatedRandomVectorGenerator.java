{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/random/CorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 62,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(double[], org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 84,
      "end_line": 100,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a correlated random vector generator from its mean\n     * vector and covariance matrix.\u003c/p\u003e\n     * @param mean expected mean values for all components\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception IllegalArgumentException if there is a dimension\n     * mismatch between the mean vector and the covariance matrix\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     * @exception DimensionMismatchException if the mean and covariance\n     * arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 49)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 95,col 9)-(line 95,col 37)",
        "(line 97,col 9)-(line 97,col 35)",
        "(line 98,col 9)-(line 98,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 113,
      "end_line": 128,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a null mean random correlated vector generator from its\n     * covariance matrix.\u003c/p\u003e\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 49)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getGenerator()",
      "begin_line": 133,
      "end_line": 135,
      "comment": " Get the underlying normalized components generator.\n     * @return underlying uncorrelated components generator\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRootMatrix()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRank()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " Get the rank of the covariance matrix.\n     * The rank is the number of independent rows in the covariance\n     * matrix, it is also the number of columns of the rectangular\n     * matrix of the decomposition.\n     * @return rank of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.decompose(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 175,
      "end_line": 265,
      "comment": " Decompose the original square matrix.\n     * \u003cp\u003eThe decomposition is based on a Choleski decomposition\n     * where additional transforms are performed:\n     * \u003cul\u003e\n     *   \u003cli\u003ethe rows of the decomposed matrix are permuted\u003c/li\u003e\n     *   \u003cli\u003ecolumns with the too small diagonal element are discarded\u003c/li\u003e\n     *   \u003cli\u003ethe matrix is permuted\u003c/li\u003e\n     * \u003c/ul\u003e\n     * This means that rather than computing M \u003d U\u003csup\u003eT\u003c/sup\u003e.U where U\n     * is an upper triangular matrix, this method computed M\u003dB.B\u003csup\u003eT\u003c/sup\u003e\n     * where B is a rectangular matrix.\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 49)",
        "(line 179,col 9)-(line 179,col 44)",
        "(line 180,col 9)-(line 180,col 48)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 17)",
        "(line 189,col 9)-(line 255,col 9)",
        "(line 258,col 9)-(line 258,col 57)",
        "(line 259,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 271,
      "end_line": 289,
      "comment": " Generate a correlated random vector.\n     * @return a random vector as an array of double. The returned array\n     * is created at each call, the caller can do what it wants with it.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 279,col 9)-(line 279,col 54)",
        "(line 280,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Permutated Cholesky root of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " Rank of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Storage for the normalized vector. "
    }
  ]
}