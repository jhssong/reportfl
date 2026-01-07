{
  "filepath": "/tmp/Math-104b/src/test/org/apache/commons/math/analysis/SinFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SinFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 31,
      "end_line": 50,
      "comment": "\n * Auxillary class for testing solvers.\n *\n * The function is extraordinarily well behaved around zero roots: it\n * has an inflection point there (second order derivative is zero),\n * which means linear approximation (Regula Falsi) will converge\n * quadratically.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.value(double)",
      "begin_line": 36,
      "end_line": 38,
      "comment": " Evaluate sinus fuction.\n     * @see org.apache.commons.math.UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.derivative()",
      "begin_line": 42,
      "end_line": 48,
      "comment": " First derivative of sinus function\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 47,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.Anonymous-bd2745bc-d79d-4648-b13f-4e1f4af41f8a.value(double)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 17)-(line 45,col 35)"
      ]
    }
  ]
}