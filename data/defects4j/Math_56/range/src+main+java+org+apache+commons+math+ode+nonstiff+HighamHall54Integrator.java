{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/ode/nonstiff/HighamHall54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 37,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_C"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_A"
      ],
      "begin_line": 48,
      "end_line": 55,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_B"
      ],
      "begin_line": 58,
      "end_line": 60,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_E"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": " Error weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.HighamHall54Integrator(double, double, double, double)",
      "begin_line": 76,
      "end_line": 81,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 80,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.HighamHall54Integrator(double, double, double[], double[])",
      "begin_line": 92,
      "end_line": 97,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 96,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.getOrder()",
      "begin_line": 100,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 106,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 21)",
        "(line 113,col 5)-(line 126,col 5)",
        "(line 128,col 5)-(line 128,col 51)"
      ]
    }
  ]
}