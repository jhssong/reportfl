{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Constant.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Constant",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 30,
      "end_line": 61,
      "comment": "\n * Constant function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Constant. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Constant.Constant(double)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * @param c Constant.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Constant.value(double)",
      "begin_line": 42,
      "end_line": 44,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Constant.derivative()",
      "begin_line": 49,
      "end_line": 52,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Constant.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 57,
      "end_line": 59,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 79)"
      ]
    }
  ]
}