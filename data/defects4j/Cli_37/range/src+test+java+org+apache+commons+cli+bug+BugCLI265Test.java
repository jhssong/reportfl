{
  "filepath": "/tmp/Cli-37b/src/test/java/org/apache/commons/cli/bug/BugCLI265Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BugCLI265Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 20,
      "end_line": 56,
      "comment": "\n * Test for CLI-265.\n * \u003cp\u003e\n * The issue is that a short option with an optional value will use whatever comes next as value.\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.bug.BugCLI265Test.setUp()",
      "begin_line": 25,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 37)",
        "(line 29,col 9)-(line 29,col 114)",
        "(line 30,col 9)-(line 30,col 67)",
        "(line 32,col 9)-(line 32,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithValue()",
      "begin_line": 35,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 77)",
        "(line 39,col 9)-(line 39,col 84)",
        "(line 41,col 9)-(line 41,col 72)",
        "(line 42,col 9)-(line 42,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithoutValue()",
      "begin_line": 45,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 64)",
        "(line 49,col 9)-(line 49,col 79)",
        "(line 51,col 9)-(line 51,col 48)",
        "(line 52,col 9)-(line 52,col 124)",
        "(line 53,col 9)-(line 53,col 89)"
      ]
    }
  ]
}