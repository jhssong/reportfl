{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Log1p.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Log1p",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 33,
      "end_line": 54,
      "comment": "\n * \u003ccode\u003elog(1 + p)\u003c/code\u003e function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Log1p.value(double)",
      "begin_line": 35,
      "end_line": 37,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Log1p.derivative()",
      "begin_line": 42,
      "end_line": 45,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Log1p.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 50,
      "end_line": 52,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 25)"
      ]
    }
  ]
}