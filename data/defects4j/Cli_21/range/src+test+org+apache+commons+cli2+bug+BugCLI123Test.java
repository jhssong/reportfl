{
  "filepath": "/tmp/Cli-21b/src/test/org/apache/commons/cli2/bug/BugCLI123Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BugCLI123Test",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 37,
      "end_line": 126,
      "comment": "\n * Group options are not added to the command line when child elements are\n * detected. This causes the validation of maximum and minimum to fail.\n *\n * @author Oliver Heger\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parentOption"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " An option of the parent group. "
    },
    {
      "type": "field",
      "varNames": [
        "childOption1"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " An option of the child group. "
    },
    {
      "type": "field",
      "varNames": [
        "childOption2"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Another option of the child group. "
    },
    {
      "type": "field",
      "varNames": [
        "parentGroup"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The parent group. "
    },
    {
      "type": "field",
      "varNames": [
        "childGroup"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The child group. "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The parser. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI123Test.setUp()",
      "begin_line": 56,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)",
        "(line 58,col 9)-(line 58,col 73)",
        "(line 59,col 9)-(line 59,col 63)",
        "(line 60,col 9)-(line 60,col 57)",
        "(line 61,col 9)-(line 62,col 75)",
        "(line 63,col 9)-(line 64,col 72)",
        "(line 65,col 9)-(line 66,col 72)",
        "(line 67,col 9)-(line 69,col 47)",
        "(line 70,col 9)-(line 72,col 26)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI123Test.testSingleChildOption()",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\n     * A single option of the child group is specified.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 74)",
        "(line 82,col 9)-(line 82,col 73)",
        "(line 83,col 9)-(line 84,col 41)",
        "(line 85,col 9)-(line 85,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI123Test.testMultipleChildOptions()",
      "begin_line": 91,
      "end_line": 101,
      "comment": "\n     * Two options of the child group are specified.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 93,col 42)",
        "(line 94,col 9)-(line 94,col 73)",
        "(line 95,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 71)",
        "(line 98,col 9)-(line 99,col 41)",
        "(line 100,col 9)-(line 100,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI123Test.testSingleParentOption()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * The option defined for the parent group is specified.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 74)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 109,col 81)",
        "(line 110,col 9)-(line 110,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI123Test.testParentOptionAndChildOption()",
      "begin_line": 117,
      "end_line": 125,
      "comment": "\n     * The parent option and an option of the child group is specified. This\n     * should cause an exception.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 124,col 9)"
      ]
    }
  ]
}