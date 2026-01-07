{
  "filepath": "/tmp/Math-86b/src/test/org/apache/commons/math/analysis/SinFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SinFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 55,
      "comment": "\n * Auxillary class for testing solvers.\n *\n * The function is extraordinarily well behaved around zero roots: it\n * has an inflection point there (second order derivative is zero),\n * which means linear approximation (Regula Falsi) will converge\n * quadratically.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.value(double)",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Evaluate sinus fuction.\n     * @see org.apache.commons.math.UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.derivative()",
      "begin_line": 46,
      "end_line": 53,
      "comment": " First derivative of sinus function\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 52,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SinFunction.Anonymous-5c6aadfa-4a3f-4b7e-aa6e-5453e05ab802.value(double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 17)-(line 50,col 35)"
      ]
    }
  ]
}