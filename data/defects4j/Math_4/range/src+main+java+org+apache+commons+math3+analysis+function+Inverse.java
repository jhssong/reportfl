{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Inverse.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Inverse",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 32,
      "end_line": 53,
      "comment": "\n * Inverse function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Inverse.value(double)",
      "begin_line": 34,
      "end_line": 36,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Inverse.derivative()",
      "begin_line": 41,
      "end_line": 44,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Inverse.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 49,
      "end_line": 51,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 30)"
      ]
    }
  ]
}