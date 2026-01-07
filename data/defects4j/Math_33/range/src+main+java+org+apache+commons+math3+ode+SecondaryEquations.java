{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/ode/SecondaryEquations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondaryEquations",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 56,
      "comment": "\n * This interface allows users to add secondary differential equations to a primary\n * set of differential equations.\n * \u003cp\u003e\n * In some cases users may need to integrate some problem-specific equations along\n * with a primary set of differential equations. One example is optimal control where\n * adjoined parameters linked to the minimized hamiltonian must be integrated.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This interface allows users to add such equations to a primary set of {@link\n * FirstOrderDifferentialEquations first order differential equations}\n * thanks to the {@link\n * ExpandableStatefulODE#addSecondaryEquations(SecondaryEquations)}\n * method.\n * \u003c/p\u003e\n * @see ExpandableStatefulODE\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.SecondaryEquations.getDimension()",
      "begin_line": 44,
      "end_line": 44,
      "comment": " Get the dimension of the secondary state parameters.\n     * @return dimension of the secondary state parameters\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.SecondaryEquations.computeDerivatives(double, double[], double[], double[], double[])",
      "begin_line": 53,
      "end_line": 54,
      "comment": " Compute the derivatives related to the secondary state parameters.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param primary array containing the current value of the primary state vector\n     * @param primaryDot array containing the derivative of the primary state vector\n     * @param secondary array containing the current value of the secondary state vector\n     * @param secondaryDot placeholder array where to put the derivative of the secondary state vector\n     ",
      "child_ranges": []
    }
  ]
}