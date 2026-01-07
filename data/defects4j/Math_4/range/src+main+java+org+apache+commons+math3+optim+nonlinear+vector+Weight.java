{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/Weight.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Weight",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 32,
      "end_line": 67,
      "comment": "\n * Weight matrix of the residuals between model and observations.\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrix"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Weight matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Weight.Weight(double[])",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Creates a diagonal weight matrix.\n     *\n     * @param weight List of the values of the diagonal.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Weight.Weight(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 50,
      "end_line": 57,
      "comment": "\n     * @param weight Weight matrix.\n     * @throws NonSquareMatrixException if the argument is not\n     * a square matrix.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 54,col 9)",
        "(line 56,col 9)-(line 56,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 35)"
      ]
    }
  ]
}