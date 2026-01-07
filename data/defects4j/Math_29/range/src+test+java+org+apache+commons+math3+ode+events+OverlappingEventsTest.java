{
  "filepath": "/tmp/Math-29b/src/test/java/org/apache/commons/math3/ode/events/OverlappingEventsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OverlappingEventsTest",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 33,
      "end_line": 158,
      "comment": " Tests for overlapping state events. Also tests an event function that does\n * not converge to zero, but does have values of opposite sign around its root.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES1"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": " Expected event times for first event. "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES2"
      ],
      "begin_line": 40,
      "end_line": 43,
      "comment": " Expected event times for second event. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.testOverlappingEvents0()",
      "begin_line": 50,
      "end_line": 53,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 0. See\n     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.testOverlappingEvents1()",
      "begin_line": 60,
      "end_line": 63,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 1. See\n     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.test(int)",
      "begin_line": 71,
      "end_line": 108,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead.\n     * @param eventType the type of events to use. See\n     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 73,col 95)",
        "(line 74,col 9)-(line 74,col 62)",
        "(line 75,col 9)-(line 75,col 52)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 66)",
        "(line 78,col 9)-(line 78,col 66)",
        "(line 79,col 9)-(line 79,col 23)",
        "(line 80,col 9)-(line 80,col 27)",
        "(line 81,col 9)-(line 81,col 32)",
        "(line 82,col 9)-(line 82,col 55)",
        "(line 83,col 9)-(line 83,col 55)",
        "(line 84,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 65)",
        "(line 100,col 9)-(line 100,col 65)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.getDimension()",
      "begin_line": 111,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.computeDerivatives(double, double[], double[])",
      "begin_line": 116,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 22)",
        "(line 118,col 9)-(line 118,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Event",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.events.EventHandler"
      ],
      "begin_line": 122,
      "end_line": 157,
      "comment": " State events for this unit test. "
    },
    {
      "type": "field",
      "varNames": [
        "idx"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The index of the continuous variable to use. "
    },
    {
      "type": "field",
      "varNames": [
        "eventType"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The event type to use. See {@link #g}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.Event(int, int)",
      "begin_line": 133,
      "end_line": 136,
      "comment": " Constructor for the {@link Event} class.\n         * @param idx the index of the continuous variable to use\n         * @param eventType the type of event to use. See {@link #g}\n         ",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 27)",
        "(line 135,col 13)-(line 135,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.init(double, double[], double)",
      "begin_line": 139,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.g(double, double[])",
      "begin_line": 143,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 13)-(line 145,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.eventOccurred(double, double[], boolean)",
      "begin_line": 149,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.resetState(double, double[])",
      "begin_line": 154,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}