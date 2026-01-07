{
  "filepath": "/tmp/Math-29b/src/test/java/org/apache/commons/math3/analysis/SinFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SinFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 31,
      "end_line": 50,
      "comment": "\n * Auxillary class for testing solvers.\n *\n * The function is extraordinarily well behaved around zero roots: it\n * has an inflection point there (second order derivative is zero),\n * which means linear approximation (Regula Falsi) will converge\n * quadratically.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SinFunction.value(double)",
      "begin_line": 36,
      "end_line": 38,
      "comment": " Evaluate sinus fuction.\n     * @see org.apache.commons.math3.UnivariateFunction#value(double)\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SinFunction.derivative()",
      "begin_line": 42,
      "end_line": 48,
      "comment": " First derivative of sinus function\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 47,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SinFunction.Anonymous-e8c3af73-6f6c-4ebe-ac8c-5f6cfadeb272.value(double)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 17)-(line 45,col 39)"
      ]
    }
  ]
}