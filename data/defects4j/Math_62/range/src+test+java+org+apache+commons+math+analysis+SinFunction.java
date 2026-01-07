{
  "filepath": "/tmp/Math-62b/src/test/java/org/apache/commons/math/analysis/SinFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SinFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 32,
      "end_line": 51,
      "comment": "\n * Auxillary class for testing solvers.\n *\n * The function is extraordinarily well behaved around zero roots: it\n * has an inflection point there (second order derivative is zero),\n * which means linear approximation (Regula Falsi) will converge\n * quadratically.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.value(double)",
      "begin_line": 37,
      "end_line": 39,
      "comment": " Evaluate sinus fuction.\n     * @see org.apache.commons.math.UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.derivative()",
      "begin_line": 43,
      "end_line": 49,
      "comment": " First derivative of sinus function\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 48,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.Anonymous-79e27f26-2e60-41bd-912c-34030699a3eb.value(double)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 17)-(line 46,col 39)"
      ]
    }
  ]
}