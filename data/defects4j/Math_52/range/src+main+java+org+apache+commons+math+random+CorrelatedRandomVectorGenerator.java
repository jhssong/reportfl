{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/random/CorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 62,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Storage for the normalized vector. "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Root of the covariance matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(double[], org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 88,
      "end_line": 104,
      "comment": "\n     * Builds a correlated random vector generator from its mean\n     * vector and covariance matrix.\n     *\n     * @param mean Expected mean values for all components.\n     * @param covariance Covariance matrix.\n     * @param small Diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components.\n     * @throws org.apache.commons.math.linear.NonPositiveDefiniteMatrixException\n     * if the covariance matrix is not strictly positive definite.\n     * @throws DimensionMismatchException if the mean and covariance\n     * arrays dimensions do not match.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 33)",
        "(line 97,col 9)-(line 98,col 72)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(org.apache.commons.math.linear.RealMatrix, double, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 118,
      "end_line": 133,
      "comment": "\n     * Builds a null mean random correlated vector generator from its\n     * covariance matrix.\n     *\n     * @param covariance Covariance matrix.\n     * @param small Diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded.\n     * @param generator Underlying generator for uncorrelated normalized\n     * components.\n     * @throws org.apache.commons.math.linear.NonPositiveDefiniteMatrixException\n     * if the covariance matrix is not strictly positive definite.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 49)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 127,col 72)",
        "(line 128,col 9)-(line 128,col 45)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getGenerator()",
      "begin_line": 138,
      "end_line": 140,
      "comment": " Get the underlying normalized components generator.\n     * @return underlying uncorrelated components generator\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRank()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " Get the rank of the covariance matrix.\n     * The rank is the number of independent rows in the covariance\n     * matrix, it is also the number of columns of the root matrix.\n     * @return rank of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.getRootMatrix()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.CorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 166,
      "end_line": 184,
      "comment": " Generate a correlated random vector.\n     * @return a random vector as an array of double. The returned array\n     * is created at each call, the caller can do what it wants with it.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 174,col 9)-(line 174,col 54)",
        "(line 175,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 26)"
      ]
    }
  ]
}