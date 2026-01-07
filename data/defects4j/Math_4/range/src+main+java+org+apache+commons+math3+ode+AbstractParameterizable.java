{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/AbstractParameterizable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractParameterizable",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.Parameterizable"
      ],
      "begin_line": 28,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parametersNames"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " List of the parameters names. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.AbstractParameterizable.AbstractParameterizable(java.lang.String...)",
      "begin_line": 36,
      "end_line": 41,
      "comment": " Simple constructor.\n     * @param names names of the supported parameters\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 50)",
        "(line 38,col 9)-(line 40,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.AbstractParameterizable.AbstractParameterizable(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 46,
      "end_line": 49,
      "comment": " Simple constructor.\n     * @param names names of the supported parameters\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 50)",
        "(line 48,col 9)-(line 48,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractParameterizable.getParametersNames()",
      "begin_line": 52,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractParameterizable.isSupported(java.lang.String)",
      "begin_line": 57,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractParameterizable.complainIfNotSupported(java.lang.String)",
      "begin_line": 71,
      "end_line": 76,
      "comment": " Check if a parameter is supported and throw an IllegalArgumentException if not.\n     * @param name name of the parameter to check\n     * @exception UnknownParameterException if the parameter is not supported\n     * @see #isSupported(String)\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)"
      ]
    }
  ]
}