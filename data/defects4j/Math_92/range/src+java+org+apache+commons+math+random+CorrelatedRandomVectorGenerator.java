{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/random/CorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 61,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(double[], org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 80,
      "end_line": 96,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a correlated random vector generator from its mean\n     * vector and covariance matrix.\u003c/p\u003e\n     * @param mean expected mean values for all components\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception IllegalArgumentException if there is a dimension\n     * mismatch between the mean vector and the covariance matrix\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     * @exception DimensionMismatchException if the mean and covariance\n     * arrays dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 49)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 44)",
        "(line 91,col 9)-(line 91,col 37)",
        "(line 93,col 9)-(line 93,col 35)",
        "(line 94,col 9)-(line 94,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 109,
      "end_line": 124,
      "comment": " Simple constructor.\n     * \u003cp\u003eBuild a null mean random correlated vector generator from its\n     * covariance matrix.\u003c/p\u003e\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getGenerator()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " Get the underlying normalized components generator.\n     * @return underlying uncorrelated components generator\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRootMatrix()",
      "begin_line": 139,
      "end_line": 141,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRank()",
      "begin_line": 150,
      "end_line": 152,
      "comment": " Get the rank of the covariance matrix.\n     * The rank is the number of independent rows in the covariance\n     * matrix, it is also the number of columns of the rectangular\n     * matrix of the decomposition.\n     * @return rank of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.decompose(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 171,
      "end_line": 261,
      "comment": " Decompose the original square matrix.\n     * \u003cp\u003eThe decomposition is based on a Choleski decomposition\n     * where additional transforms are performed:\n     * \u003cul\u003e\n     *   \u003cli\u003ethe rows of the decomposed matrix are permuted\u003c/li\u003e\n     *   \u003cli\u003ecolumns with the too small diagonal element are discarded\u003c/li\u003e\n     *   \u003cli\u003ethe matrix is permuted\u003c/li\u003e\n     * \u003c/ul\u003e\n     * This means that rather than computing M \u003d U\u003csup\u003eT\u003c/sup\u003e.U where U\n     * is an upper triangular matrix, this method computed M\u003dB.B\u003csup\u003eT\u003c/sup\u003e\n     * where B is a rectangular matrix.\n     * @param covariance covariance matrix\n     * @param small diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @exception NotPositiveDefiniteMatrixException if the\n     * covariance matrix is not strictly positive definite\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 49)",
        "(line 175,col 9)-(line 175,col 44)",
        "(line 176,col 9)-(line 176,col 48)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 37)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 17)",
        "(line 185,col 9)-(line 251,col 9)",
        "(line 254,col 9)-(line 254,col 57)",
        "(line 255,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 267,
      "end_line": 285,
      "comment": " Generate a correlated random vector.\n     * @return a random vector as an array of double. The returned array\n     * is created at each call, the caller can do what it wants with it.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 275,col 9)-(line 275,col 54)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": " Permutated Cholesky root of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": " Rank of the covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Storage for the normalized vector. "
    }
  ]
}