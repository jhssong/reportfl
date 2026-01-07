{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/optimization/Weight.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Weight",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 33,
      "end_line": 73,
      "comment": "\n * Weight matrix of the residuals between model and observations.\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrix"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Weight matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.Weight.Weight(double[])",
      "begin_line": 43,
      "end_line": 49,
      "comment": "\n     * Creates a diagonal weight matrix.\n     *\n     * @param weight List of the values of the diagonal.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 38)",
        "(line 45,col 9)-(line 45,col 58)",
        "(line 46,col 9)-(line 48,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.Weight.Weight(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 56,
      "end_line": 63,
      "comment": "\n     * @param weight Weight matrix.\n     * @throws NonSquareMatrixException if the argument is not\n     * a square matrix.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 62,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.Weight.getWeight()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 35)"
      ]
    }
  ]
}