{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Identity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Identity",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 30,
      "end_line": 51,
      "comment": "\n * Identity function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Identity.value(double)",
      "begin_line": 32,
      "end_line": 34,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Identity.derivative()",
      "begin_line": 39,
      "end_line": 42,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Identity.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 47,
      "end_line": 49,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 17)"
      ]
    }
  ]
}