{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/events/OverlappingEventsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OverlappingEventsTest",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 37,
      "end_line": 168,
      "comment": " Tests for overlapping state events. Also tests an event function that does\n * not converge to zero, but does have values of opposite sign around its root.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES1"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": " Expected event times for first event. "
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_TIMES2"
      ],
      "begin_line": 44,
      "end_line": 47,
      "comment": " Expected event times for second event. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.testOverlappingEvents0()",
      "begin_line": 54,
      "end_line": 59,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 0. See\n     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.testOverlappingEvents1()",
      "begin_line": 66,
      "end_line": 71,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead. Uses event type 1. See\n     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.test(int)",
      "begin_line": 79,
      "end_line": 118,
      "comment": " Test for events that occur at the exact same time, but due to numerical\n     * calculations occur very close together instead.\n     * @param eventType the type of events to use. See\n     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])\n     * EventHandler.g(double, double[])}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 95)",
        "(line 84,col 9)-(line 84,col 62)",
        "(line 85,col 9)-(line 85,col 52)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 66)",
        "(line 88,col 9)-(line 88,col 66)",
        "(line 89,col 9)-(line 89,col 23)",
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 32)",
        "(line 92,col 9)-(line 92,col 55)",
        "(line 93,col 9)-(line 93,col 55)",
        "(line 94,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 65)",
        "(line 110,col 9)-(line 110,col 65)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.getDimension()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.computeDerivatives(double, double[], double[])",
      "begin_line": 126,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 22)",
        "(line 128,col 9)-(line 128,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Event",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.events.EventHandler"
      ],
      "begin_line": 132,
      "end_line": 167,
      "comment": " State events for this unit test. "
    },
    {
      "type": "field",
      "varNames": [
        "idx"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The index of the continuous variable to use. "
    },
    {
      "type": "field",
      "varNames": [
        "eventType"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " The event type to use. See {@link #g}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.Event(int, int)",
      "begin_line": 143,
      "end_line": 146,
      "comment": " Constructor for the {@link Event} class.\n         * @param idx the index of the continuous variable to use\n         * @param eventType the type of event to use. See {@link #g}\n         ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 27)",
        "(line 145,col 13)-(line 145,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.init(double, double[], double)",
      "begin_line": 149,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.g(double, double[])",
      "begin_line": 153,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 13)-(line 155,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.eventOccurred(double, double[], boolean)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.OverlappingEventsTest.Event.resetState(double, double[])",
      "begin_line": 164,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}