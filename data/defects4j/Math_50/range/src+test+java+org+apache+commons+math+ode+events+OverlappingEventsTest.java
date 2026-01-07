{
  "filepath": "/tmp/Math-50b/src/test/java/org/apache/commons/math/ode/events/OverlappingEventsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OverlappingEventsTest",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 35,
      "end_line": 165,
      "comment": " Tests for overlapping state events. Also tests an event function that does\n * not converge to zero, but does have values of opposite sign around its root.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES1"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": " Expected event times for first event. "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES2"
      ],
      "begin_line": 42,
      "end_line": 45,
      "comment": " Expected event times for second event. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.testOverlappingEvents0()",
      "begin_line": 55,
      "end_line": 58,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 0. See\n     * {@link org.apache.commons.math.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     * @throws EventException in case of event evaluation failure\n     * @throws IntegratorException in case of integration failure\n     * @throws MathUserException in case of derivative evaluation failure\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.testOverlappingEvents1()",
      "begin_line": 68,
      "end_line": 71,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 1. See\n     * {@link org.apache.commons.math.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     * @throws EventException in case of event evaluation failure\n     * @throws IntegratorException in case of integration failure\n     * @throws MathUserException in case of derivative evaluation failure\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.test(int)",
      "begin_line": 82,
      "end_line": 119,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead.\n     * @param eventType the type of events to use. See\n     * {@link org.apache.commons.math.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     * @throws EventException in case of event evaluation failure\n     * @throws IntegratorException in case of integration failure\n     * @throws MathUserException in case of derivative evaluation failure\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 25)",
        "(line 84,col 9)-(line 84,col 95)",
        "(line 85,col 9)-(line 85,col 62)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 52)",
        "(line 88,col 9)-(line 88,col 66)",
        "(line 89,col 9)-(line 89,col 66)",
        "(line 90,col 9)-(line 90,col 23)",
        "(line 91,col 9)-(line 91,col 27)",
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 55)",
        "(line 94,col 9)-(line 94,col 55)",
        "(line 95,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 65)",
        "(line 111,col 9)-(line 111,col 65)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.getDimension()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.computeDerivatives(double, double[], double[])",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 22)",
        "(line 129,col 9)-(line 129,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Event",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 133,
      "end_line": 164,
      "comment": " State events for this unit test. "
    },
    {
      "type": "field",
      "varNames": [
        "idx"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The index of the continuous variable to use. "
    },
    {
      "type": "field",
      "varNames": [
        "eventType"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The event type to use. See {@link #g}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.Event(int, int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": " Constructor for the {@link Event} class.\n         * @param idx the index of the continuous variable to use\n         * @param eventType the type of event to use. See {@link #g}\n         ",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 27)",
        "(line 146,col 13)-(line 146,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.g(double, double[])",
      "begin_line": 150,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 13)-(line 152,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.eventOccurred(double, double[], boolean)",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.resetState(double, double[])",
      "begin_line": 161,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}