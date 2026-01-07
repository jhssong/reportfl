{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/random/CorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 63,
      "end_line": 287,
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
      "begin_line": 68,
      "end_line": 68,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Storage for the normalized vector. "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Permutated Cholesky root of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Rank of the covariance matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(double[], org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 91,
      "end_line": 104,
      "comment": "\n     * Builds a correlated random vector generator from its mean\n     * vector and covariance matrix.\n     *\n     * @param mean Expected mean values for all components.\n     * @param covariance Covariance matrix.\n     * @param small Diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components.\n     * @throws org.apache.commons.math.linear.NonPositiveDefiniteMatrixException\n     * if the covariance matrix is not strictly positive definite.\n     * @throws DimensionMismatchException if the mean and covariance\n     * arrays dimensions do not match.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 49)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 33)",
        "(line 100,col 9)-(line 100,col 37)",
        "(line 102,col 9)-(line 102,col 35)",
        "(line 103,col 9)-(line 103,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 118,
      "end_line": 130,
      "comment": "\n     * Builds a null mean random correlated vector generator from its\n     * covariance matrix.\n     *\n     * @param covariance Covariance matrix.\n     * @param small Diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded.\n     * @param generator Underlying generator for uncorrelated normalized\n     * components.\n     * @throws org.apache.commons.math.linear.NonPositiveDefiniteMatrixException\n     * if the covariance matrix is not strictly positive definite.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 49)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 37)",
        "(line 128,col 9)-(line 128,col 35)",
        "(line 129,col 9)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getGenerator()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " Get the underlying normalized components generator.\n     * @return underlying uncorrelated components generator\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRootMatrix()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRank()",
      "begin_line": 156,
      "end_line": 158,
      "comment": " Get the rank of the covariance matrix.\n     * The rank is the number of independent rows in the covariance\n     * matrix, it is also the number of columns of the rectangular\n     * matrix of the decomposition.\n     * @return rank of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.decompose(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 177,
      "end_line": 263,
      "comment": " Decompose the original square matrix.\n     * \u003cp\u003eThe decomposition is based on a Choleski decomposition\n     * where additional transforms are performed:\n     * \u003cul\u003e\n     *   \u003cli\u003ethe rows of the decomposed matrix are permuted\u003c/li\u003e\n     *   \u003cli\u003ecolumns with the too small diagonal element are discarded\u003c/li\u003e\n     *   \u003cli\u003ethe matrix is permuted\u003c/li\u003e\n     * \u003c/ul\u003e\n     * This means that rather than computing M \u003d U\u003csup\u003eT\u003c/sup\u003e.U where U\n     * is an upper triangular matrix, this method computed M\u003dB.B\u003csup\u003eT\u003c/sup\u003e\n     * where B is a rectangular matrix.\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @throws org.apache.commons.math.linear.NonPositiveDefiniteMatrixException\n     * if the covariance matrix is not strictly positive definite.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 49)",
        "(line 179,col 9)-(line 179,col 44)",
        "(line 180,col 9)-(line 180,col 48)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 17)",
        "(line 189,col 9)-(line 253,col 9)",
        "(line 256,col 9)-(line 256,col 57)",
        "(line 257,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 269,
      "end_line": 286,
      "comment": " Generate a correlated random vector.\n     * @return a random vector as an array of double. The returned array\n     * is created at each call, the caller can do what it wants with it.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 277,col 9)-(line 277,col 54)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 26)"
      ]
    }
  ]
}