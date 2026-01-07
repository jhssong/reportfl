{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/estimation/EstimatedParameter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EstimatedParameter",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 126,
      "comment": " This class represents the estimated parameters of an estimation problem.\n *\n * \u003cp\u003eThe parameters of an estimation problem have a name, a value and\n * a bound flag. The value of bound parameters is considered trusted\n * and the solvers should not adjust them. On the other hand, the\n * solvers should adjust the value of unbounds parameters until they\n * satisfy convergence criterions specific to each solver.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(java.lang.String, double)",
      "begin_line": 46,
      "end_line": 50,
      "comment": " Simple constructor.\n   * Build an instance from a first estimate of the parameter,\n   * initially considered unbound.\n   * @param name name of the parameter\n   * @param firstEstimate first estimate of the parameter\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 21)",
        "(line 48,col 5)-(line 48,col 30)",
        "(line 49,col 5)-(line 49,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(java.lang.String, double, boolean)",
      "begin_line": 59,
      "end_line": 65,
      "comment": " Simple constructor.\n   * Build an instance from a first estimate of the parameter and a\n   * bound flag\n   * @param name name of the parameter\n   * @param firstEstimate first estimate of the parameter\n   * @param bound flag, should be true if the parameter is bound\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 22)",
        "(line 63,col 5)-(line 63,col 31)",
        "(line 64,col 5)-(line 64,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 71,
      "end_line": 75,
      "comment": " Copy constructor.\n   * Build a copy of a parameter\n   * @param parameter instance to copy\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 30)",
        "(line 73,col 5)-(line 73,col 34)",
        "(line 74,col 5)-(line 74,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.setEstimate(double)",
      "begin_line": 80,
      "end_line": 82,
      "comment": " Set a new estimated value for the parameter.\n   * @param estimate new estimate for the parameter\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.getEstimate()",
      "begin_line": 87,
      "end_line": 89,
      "comment": " Get the current estimate of the parameter\n   * @return current estimate\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.getName()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " get the name of the parameter\n   * @return parameter name\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.setBound(boolean)",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Set the bound flag of the parameter\n   * @param bound this flag should be set to true if the parameter is\n   * bound (i.e. if it should not be adjusted by the solver).\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.isBound()",
      "begin_line": 108,
      "end_line": 110,
      "comment": " Check if the parameter is bound\n   * @return true if the parameter is bound ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Name of the parameter "
    },
    {
      "type": "field",
      "varNames": [
        "estimate"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Current value of the parameter "
    },
    {
      "type": "field",
      "varNames": [
        "bound"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Indicator for bound parameters\n   * (ie parameters that should not be estimated)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Serializable version identifier "
    }
  ]
}