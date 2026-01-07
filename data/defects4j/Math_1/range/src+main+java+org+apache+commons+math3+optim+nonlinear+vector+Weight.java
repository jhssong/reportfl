{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/Weight.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Weight",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 36,
      "end_line": 72,
      "comment": "\n * Weight matrix of the residuals between model and observations.\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @since 3.1\n * @deprecated All classes and interfaces in this package are deprecated.\n * The optimizers that were provided here were moved to the\n * {@link org.apache.commons.math3.fitting.leastsquares} package\n * (cf. MATH-1008).\n "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrix"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Weight matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Weight.Weight(double[])",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Creates a diagonal weight matrix.\n     *\n     * @param weight List of the values of the diagonal.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Weight.Weight(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 55,
      "end_line": 62,
      "comment": "\n     * @param weight Weight matrix.\n     * @throws NonSquareMatrixException if the argument is not\n     * a square matrix.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 59,col 9)",
        "(line 61,col 9)-(line 61,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 35)"
      ]
    }
  ]
}