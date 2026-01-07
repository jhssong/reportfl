{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Expm1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Expm1",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 33,
      "end_line": 54,
      "comment": "\n * \u003ccode\u003ee\u003csup\u003ex\u003c/sup\u003e-1\u003c/code\u003e function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Expm1.value(double)",
      "begin_line": 35,
      "end_line": 37,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Expm1.derivative()",
      "begin_line": 42,
      "end_line": 45,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Expm1.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 50,
      "end_line": 52,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 25)"
      ]
    }
  ]
}