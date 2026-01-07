{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Power.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Power",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 33,
      "end_line": 64,
      "comment": "\n * Power function.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Power. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Power.Power(double)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * @param p Power.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Power.value(double)",
      "begin_line": 45,
      "end_line": 47,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Power.derivative()",
      "begin_line": 52,
      "end_line": 55,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Power.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 24)"
      ]
    }
  ]
}