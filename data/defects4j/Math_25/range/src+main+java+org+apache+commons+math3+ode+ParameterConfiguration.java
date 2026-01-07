{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/ode/ParameterConfiguration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterConfiguration",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 67,
      "comment": " Simple container pairing a parameter name with a step in order to compute\n *  the associated Jacobian matrix by finite difference.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "parameterName"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Parameter name. "
    },
    {
      "type": "field",
      "varNames": [
        "hP"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Parameter step for finite difference computation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ParameterConfiguration.ParameterConfiguration(java.lang.String, double)",
      "begin_line": 41,
      "end_line": 44,
      "comment": " Parameter name and step pair constructor.\n     * @param parameterName parameter name\n     * @param hP parameter step ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 43)",
        "(line 43,col 9)-(line 43,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterConfiguration.getParameterName()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Get parameter name.\n     * @return parameterName parameter name\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterConfiguration.getHP()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Get parameter step.\n     * @return hP parameter step\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterConfiguration.setHP(double)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Set parameter step.\n     * @param hParam parameter step\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 25)"
      ]
    }
  ]
}