{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/analysis/function/Constant.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Constant",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 32,
      "end_line": 63,
      "comment": "\n * Constant function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Constant. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Constant.Constant(double)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * @param c Constant.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Constant.value(double)",
      "begin_line": 44,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Constant.derivative()",
      "begin_line": 51,
      "end_line": 54,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Constant.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 79)"
      ]
    }
  ]
}