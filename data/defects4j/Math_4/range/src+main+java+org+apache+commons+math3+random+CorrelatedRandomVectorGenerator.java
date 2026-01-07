{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/CorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomVectorGenerator"
      ],
      "begin_line": 61,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Underlying generator. "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Storage for the normalized vector. "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Root of the covariance matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(double[], org.apache.commons.math3.linear.RealMatrix, double, org.apache.commons.math3.random.NormalizedRandomGenerator)",
      "begin_line": 87,
      "end_line": 103,
      "comment": "\n     * Builds a correlated random vector generator from its mean\n     * vector and covariance matrix.\n     *\n     * @param mean Expected mean values for all components.\n     * @param covariance Covariance matrix.\n     * @param small Diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded\n     * @param generator underlying generator for uncorrelated normalized\n     * components.\n     * @throws org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException\n     * if the covariance matrix is not strictly positive definite.\n     * @throws DimensionMismatchException if the mean and covariance\n     * arrays dimensions do not match.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 49)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 33)",
        "(line 96,col 9)-(line 97,col 68)",
        "(line 98,col 9)-(line 98,col 45)",
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator.CorrelatedRandomVectorGenerator(org.apache.commons.math3.linear.RealMatrix, double, org.apache.commons.math3.random.NormalizedRandomGenerator)",
      "begin_line": 117,
      "end_line": 132,
      "comment": "\n     * Builds a null mean random correlated vector generator from its\n     * covariance matrix.\n     *\n     * @param covariance Covariance matrix.\n     * @param small Diagonal elements threshold under which  column are\n     * considered to be dependent on previous ones and are discarded.\n     * @param generator Underlying generator for uncorrelated normalized\n     * components.\n     * @throws org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException\n     * if the covariance matrix is not strictly positive definite.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 49)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 126,col 68)",
        "(line 127,col 9)-(line 127,col 45)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator.getGenerator()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Get the underlying normalized components generator.\n     * @return underlying uncorrelated components generator\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator.getRank()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " Get the rank of the covariance matrix.\n     * The rank is the number of independent rows in the covariance\n     * matrix, it is also the number of columns of the root matrix.\n     * @return rank of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator.getRootMatrix()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.CorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 165,
      "end_line": 183,
      "comment": " Generate a correlated random vector.\n     * @return a random vector as an array of double. The returned array\n     * is created at each call, the caller can do what it wants with it.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 173,col 9)-(line 173,col 54)",
        "(line 174,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 26)"
      ]
    }
  ]
}