{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/estimation/EstimatedParameter.java",
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
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "estimate"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Current value of the parameter "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Name of the parameter "
    },
    {
      "type": "field",
      "varNames": [
        "bound"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Indicator for bound parameters\n     * (ie parameters that should not be estimated)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(java.lang.String, double)",
      "begin_line": 60,
      "end_line": 64,
      "comment": " Simple constructor.\n     * Build an instance from a first estimate of the parameter,\n     * initially considered unbound.\n     * @param name name of the parameter\n     * @param firstEstimate first estimate of the parameter\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 34)",
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(java.lang.String, double, boolean)",
      "begin_line": 73,
      "end_line": 79,
      "comment": " Simple constructor.\n     * Build an instance from a first estimate of the parameter and a\n     * bound flag\n     * @param name name of the parameter\n     * @param firstEstimate first estimate of the parameter\n     * @param bound flag, should be true if the parameter is bound\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 26)",
        "(line 77,col 9)-(line 77,col 35)",
        "(line 78,col 9)-(line 78,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.EstimatedParameter(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 85,
      "end_line": 89,
      "comment": " Copy constructor.\n     * Build a copy of a parameter\n     * @param parameter instance to copy\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 87,col 38)",
        "(line 88,col 9)-(line 88,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.setEstimate(double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": " Set a new estimated value for the parameter.\n     * @param estimate new estimate for the parameter\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.getEstimate()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " Get the current estimate of the parameter\n     * @return current estimate\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.getName()",
      "begin_line": 108,
      "end_line": 110,
      "comment": " get the name of the parameter\n     * @return parameter name\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.setBound(boolean)",
      "begin_line": 116,
      "end_line": 118,
      "comment": " Set the bound flag of the parameter\n     * @param bound this flag should be set to true if the parameter is\n     * bound (i.e. if it should not be adjusted by the solver).\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.EstimatedParameter.isBound()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " Check if the parameter is bound\n     * @return true if the parameter is bound ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 21)"
      ]
    }
  ]
}