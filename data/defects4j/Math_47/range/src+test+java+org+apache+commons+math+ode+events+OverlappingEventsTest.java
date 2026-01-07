{
  "filepath": "/tmp/Math-47b/src/test/java/org/apache/commons/math/ode/events/OverlappingEventsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OverlappingEventsTest",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 34,
      "end_line": 155,
      "comment": " Tests for overlapping state events. Also tests an event function that does\n * not converge to zero, but does have values of opposite sign around its root.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES1"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Expected event times for first event. "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES2"
      ],
      "begin_line": 41,
      "end_line": 44,
      "comment": " Expected event times for second event. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.testOverlappingEvents0()",
      "begin_line": 51,
      "end_line": 54,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 0. See\n     * {@link org.apache.commons.math.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.testOverlappingEvents1()",
      "begin_line": 61,
      "end_line": 64,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 1. See\n     * {@link org.apache.commons.math.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.test(int)",
      "begin_line": 72,
      "end_line": 109,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead.\n     * @param eventType the type of events to use. See\n     * {@link org.apache.commons.math.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 95)",
        "(line 75,col 9)-(line 75,col 62)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 66)",
        "(line 79,col 9)-(line 79,col 66)",
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 81,col 27)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 83,col 55)",
        "(line 84,col 9)-(line 84,col 55)",
        "(line 85,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 65)",
        "(line 101,col 9)-(line 101,col 65)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.getDimension()",
      "begin_line": 112,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.computeDerivatives(double, double[], double[])",
      "begin_line": 117,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 22)",
        "(line 119,col 9)-(line 119,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Event",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 123,
      "end_line": 154,
      "comment": " State events for this unit test. "
    },
    {
      "type": "field",
      "varNames": [
        "idx"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " The index of the continuous variable to use. "
    },
    {
      "type": "field",
      "varNames": [
        "eventType"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " The event type to use. See {@link #g}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.Event(int, int)",
      "begin_line": 134,
      "end_line": 137,
      "comment": " Constructor for the {@link Event} class.\n         * @param idx the index of the continuous variable to use\n         * @param eventType the type of event to use. See {@link #g}\n         ",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 27)",
        "(line 136,col 13)-(line 136,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.g(double, double[])",
      "begin_line": 140,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 13)-(line 142,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.eventOccurred(double, double[], boolean)",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.OverlappingEventsTest.Event.resetState(double, double[])",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}