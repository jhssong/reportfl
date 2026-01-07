{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/analysis/function/Sinc.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sinc",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 35,
      "end_line": 117,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Sinc_function\"\u003eSinc\u003c/a\u003e function,\n * defined by\n * \u003cpre\u003e\u003ccode\u003e\n *   sinc(x) \u003d 1            if x \u003d 0,\n *             sin(x) / x   otherwise.\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHORTCUT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Value below which the result of the computation will not change\n     * anymore due to the finite precision of the \"double\" representation\n     * of real numbers.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " For normalized sinc function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Sinc.Sinc()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * The sinc function, {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.function.Sinc.Sinc(boolean)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Instantiates the sinc function.\n     *\n     * @param normalized If {@code true}, the function is\n     * \u003ccode\u003e sin(\u0026pi;x) / \u0026pi;x\u003c/code\u003e, otherwise {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.value(double)",
      "begin_line": 63,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.derivative()",
      "begin_line": 73,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.Anonymous-870d1396-0b3d-4f43-83ea-bdef19f0d6eb.value(double)",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 21)-(line 86,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.Anonymous-5ba58cee-88f8-4b1c-8cbf-9b748c944609.value(double)",
      "begin_line": 77,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 21)-(line 78,col 56)",
        "(line 79,col 21)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.sinc(double)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * @param x Argument.\n     * @return {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 102,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.function.Sinc.sincDerivative(double)",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\n     * @param x Argument.\n     * @return {@code (cos(x) - sin(x) / x) / x}.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 115,col 56)"
      ]
    }
  ]
}