{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/events/EventFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventFilter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.events.EventHandler"
      ],
      "begin_line": 56,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HISTORY_SIZE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of past transformers updates stored. "
    },
    {
      "type": "field",
      "varNames": [
        "rawHandler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Wrapped event handler. "
    },
    {
      "type": "field",
      "varNames": [
        "filter"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Filter to use. "
    },
    {
      "type": "field",
      "varNames": [
        "transformers"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Transformers of the g function. "
    },
    {
      "type": "field",
      "varNames": [
        "updates"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Update time of the transformers. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Indicator for forward integration. "
    },
    {
      "type": "field",
      "varNames": [
        "extremeT"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Extreme time encountered so far. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.EventFilter(org.apache.commons.math3.ode.events.EventHandler, org.apache.commons.math3.ode.events.FilterType)",
      "begin_line": 83,
      "end_line": 88,
      "comment": " Wrap an {@link EventHandler event handler}.\n     * @param rawHandler event handler to wrap\n     * @param filter filter to use\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 39)",
        "(line 85,col 9)-(line 85,col 35)",
        "(line 86,col 9)-(line 86,col 58)",
        "(line 87,col 9)-(line 87,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.init(double, double[], double)",
      "begin_line": 91,
      "end_line": 102,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 35)",
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 81)",
        "(line 99,col 9)-(line 99,col 61)",
        "(line 100,col 9)-(line 100,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.g(double, double[])",
      "begin_line": 105,
      "end_line": 191,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 47)",
        "(line 110,col 9)-(line 189,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.eventOccurred(double, double[], boolean)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.resetState(double, double[])",
      "begin_line": 200,
      "end_line": 203,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 36)"
      ]
    }
  ]
}