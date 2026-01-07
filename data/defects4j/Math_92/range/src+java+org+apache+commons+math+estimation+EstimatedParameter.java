{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/estimation/EstimatedParameter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EstimatedParameter",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(java.lang.String, double)",
      "begin_line": 44,
      "end_line": 48,
      "comment": " Simple constructor.\n   * Build an instance from a first estimate of the parameter,\n   * initially considered unbound.\n   * @param name name of the parameter\n   * @param firstEstimate first estimate of the parameter\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 21)",
        "(line 46,col 5)-(line 46,col 30)",
        "(line 47,col 5)-(line 47,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(java.lang.String, double, boolean)",
      "begin_line": 57,
      "end_line": 63,
      "comment": " Simple constructor.\n   * Build an instance from a first estimate of the parameter and a\n   * bound flag\n   * @param name name of the parameter\n   * @param firstEstimate first estimate of the parameter\n   * @param bound flag, should be true if the parameter is bound\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 22)",
        "(line 61,col 5)-(line 61,col 31)",
        "(line 62,col 5)-(line 62,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 69,
      "end_line": 73,
      "comment": " Copy constructor.\n   * Build a copy of a parameter\n   * @param parameter instance to copy\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 30)",
        "(line 71,col 5)-(line 71,col 34)",
        "(line 72,col 5)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.setEstimate(double)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Set a new estimated value for the parameter.\n   * @param estimate new estimate for the parameter\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.getEstimate()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " Get the current estimate of the parameter\n   * @return current estimate\n   ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.getName()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " get the name of the parameter\n   * @return parameter name\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.setBound(boolean)",
      "begin_line": 100,
      "end_line": 102,
      "comment": " Set the bound flag of the parameter\n   * @param bound this flag should be set to true if the parameter is\n   * bound (i.e. if it should not be adjusted by the solver).\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.isBound()",
      "begin_line": 106,
      "end_line": 108,
      "comment": " Check if the parameter is bound\n   * @return true if the parameter is bound ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Name of the parameter "
    },
    {
      "type": "field",
      "varNames": [
        "estimate"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Current value of the parameter "
    },
    {
      "type": "field",
      "varNames": [
        "bound"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Indicator for bound parameters\n   * (ie parameters that should not be estimated)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Serializable version identifier "
    }
  ]
}