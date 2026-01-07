{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/HighamHall54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 35,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_C"
      ],
      "begin_line": 41,
      "end_line": 43,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_A"
      ],
      "begin_line": 46,
      "end_line": 53,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_B"
      ],
      "begin_line": 56,
      "end_line": 58,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_E"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": " Error weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.HighamHall54Integrator(double, double, double, double)",
      "begin_line": 74,
      "end_line": 79,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 78,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.HighamHall54Integrator(double, double, double[], double[])",
      "begin_line": 90,
      "end_line": 95,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 94,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.getOrder()",
      "begin_line": 98,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 104,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 21)",
        "(line 111,col 5)-(line 124,col 5)",
        "(line 126,col 5)-(line 126,col 40)"
      ]
    }
  ]
}