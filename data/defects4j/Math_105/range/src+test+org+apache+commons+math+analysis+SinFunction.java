{
  "filepath": "/tmp/Math-105b/src/test/org/apache/commons/math/analysis/SinFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SinFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 30,
      "end_line": 49,
      "comment": "\n * Auxillary class for testing solvers.\n *\n * The function is extraordinarily well behaved around zero roots: it\n * has an inflection point there (second order derivative is zero),\n * which means linear approximation (Regula Falsi) will converge\n * quadratically.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.value(double)",
      "begin_line": 35,
      "end_line": 37,
      "comment": " Evaluate sinus fuction.\n     * @see org.apache.commons.math.UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.derivative()",
      "begin_line": 41,
      "end_line": 47,
      "comment": " First derivative of sinus function\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 46,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.Anonymous-0b308557-2ee0-49c0-a636-72bc304c215b.value(double)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 17)-(line 44,col 35)"
      ]
    }
  ]
}