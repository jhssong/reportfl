{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/MockTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 65,
      "comment": "\n * Provides utilities for making mock-based tests.  Most notable is the generic \"type-safe\"\n * {@link #createMock(Class)} method, and {@link #replay()} and {@link #verify()} methods\n * that call the respective methods on all created mock objects.\n "
    },
    {
      "type": "field",
      "varNames": [
        "mockObjects"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MockTestCase.createMock(java.lang.Class\u003c?\u003e)",
      "begin_line": 34,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 53)",
        "(line 37,col 9)-(line 37,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MockTestCase.registerMock(T)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 30)",
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MockTestCase.expect(T)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MockTestCase.replay()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MockTestCase.verify()",
      "begin_line": 55,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 63,col 9)"
      ]
    }
  ]
}