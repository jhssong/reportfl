{
  "filepath": "/tmp/Cli-40b/src/test/java/org/apache/commons/cli/bug/BugCLI265Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BugCLI265Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 88,
      "comment": "\n * Test for CLI-265.\n * \u003cp\u003e\n * The issue is that a short option with an optional value will use whatever comes next as value.\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.bug.BugCLI265Test.setUp()",
      "begin_line": 43,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 37)",
        "(line 47,col 9)-(line 47,col 123)",
        "(line 48,col 9)-(line 48,col 73)",
        "(line 49,col 9)-(line 49,col 73)",
        "(line 50,col 9)-(line 50,col 79)",
        "(line 52,col 9)-(line 52,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithValue()",
      "begin_line": 55,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 83)",
        "(line 59,col 9)-(line 59,col 84)",
        "(line 61,col 9)-(line 61,col 72)",
        "(line 62,col 9)-(line 62,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithoutValue()",
      "begin_line": 65,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 70)",
        "(line 69,col 9)-(line 69,col 79)",
        "(line 71,col 9)-(line 71,col 48)",
        "(line 72,col 9)-(line 72,col 124)",
        "(line 73,col 9)-(line 73,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.bug.BugCLI265Test.shouldParseConcatenatedShortOptions()",
      "begin_line": 76,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 80)",
        "(line 80,col 9)-(line 80,col 88)",
        "(line 82,col 9)-(line 82,col 48)",
        "(line 83,col 9)-(line 83,col 53)",
        "(line 84,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 85,col 47)",
        "(line 86,col 9)-(line 86,col 51)"
      ]
    }
  ]
}