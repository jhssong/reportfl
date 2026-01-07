{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/ode/AbstractParameterizable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractParameterizable",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.Parameterizable"
      ],
      "begin_line": 31,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parametersNames"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " List of the parameters names. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractParameterizable.AbstractParameterizable(java.lang.String...)",
      "begin_line": 39,
      "end_line": 44,
      "comment": " Simple constructor.\n     * @param names names of the supported parameters\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 50)",
        "(line 41,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractParameterizable.AbstractParameterizable(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 49,
      "end_line": 52,
      "comment": " Simple constructor.\n     * @param names names of the supported parameters\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 50)",
        "(line 51,col 9)-(line 51,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractParameterizable.getParametersNames()",
      "begin_line": 55,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractParameterizable.isSupported(java.lang.String)",
      "begin_line": 60,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractParameterizable.complainIfNotSupported(java.lang.String)",
      "begin_line": 74,
      "end_line": 79,
      "comment": " Check if a parameter is supported and throw an IllegalArgumentException if not.\n     * @param name name of the parameter to check\n     * @exception MathIllegalArgumentException if the parameter is not supported\n     * @see #isSupported(String)\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)"
      ]
    }
  ]
}