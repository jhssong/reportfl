{
  "filepath": "/tmp/Math-6b/src/main/java/org/apache/commons/math3/ode/events/EventFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventFilter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.events.EventHandler"
      ],
      "begin_line": 58,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HISTORY_SIZE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of past transformers updates stored. "
    },
    {
      "type": "field",
      "varNames": [
        "rawHandler"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Wrapped event handler. "
    },
    {
      "type": "field",
      "varNames": [
        "filter"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Filter to use. "
    },
    {
      "type": "field",
      "varNames": [
        "transformers"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Transformers of the g function. "
    },
    {
      "type": "field",
      "varNames": [
        "updates"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Update time of the transformers. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Indicator for forward integration. "
    },
    {
      "type": "field",
      "varNames": [
        "extremeT"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Extreme time encountered so far. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.EventFilter(org.apache.commons.math3.ode.events.EventHandler, org.apache.commons.math3.ode.events.FilterType)",
      "begin_line": 85,
      "end_line": 90,
      "comment": " Wrap an {@link EventHandler event handler}.\n     * @param rawHandler event handler to wrap\n     * @param filter filter to use\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 39)",
        "(line 87,col 9)-(line 87,col 35)",
        "(line 88,col 9)-(line 88,col 58)",
        "(line 89,col 9)-(line 89,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.init(double, double[], double)",
      "begin_line": 93,
      "end_line": 104,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 35)",
        "(line 99,col 9)-(line 99,col 27)",
        "(line 100,col 9)-(line 100,col 81)",
        "(line 101,col 9)-(line 101,col 61)",
        "(line 102,col 9)-(line 102,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.g(double, double[])",
      "begin_line": 107,
      "end_line": 193,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 47)",
        "(line 112,col 9)-(line 191,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.eventOccurred(double, double[], boolean)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventFilter.resetState(double, double[])",
      "begin_line": 202,
      "end_line": 205,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 36)"
      ]
    }
  ]
}