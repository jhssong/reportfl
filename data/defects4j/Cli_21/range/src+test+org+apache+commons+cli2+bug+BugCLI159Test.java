{
  "filepath": "/tmp/Cli-21b/src/test/org/apache/commons/cli2/bug/BugCLI159Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BugCLI159Test",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 36,
      "end_line": 169,
      "comment": "\n * Inconsistent handling of minimum and maximum constraints for groups and their\n * child groups.\n *\n * @author Oliver Heger\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The parent group. "
    },
    {
      "type": "field",
      "varNames": [
        "child"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The child group. "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The parser. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI159Test.setUpOptions(boolean)",
      "begin_line": 52,
      "end_line": 71,
      "comment": "\n     * Creates some test options, including a group with a child group.\n     *\n     * @param childGroupRequired a flag whether the child group is required\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 73)",
        "(line 55,col 9)-(line 55,col 57)",
        "(line 56,col 9)-(line 57,col 26)",
        "(line 58,col 9)-(line 59,col 26)",
        "(line 60,col 9)-(line 61,col 26)",
        "(line 62,col 9)-(line 63,col 26)",
        "(line 64,col 9)-(line 66,col 59)",
        "(line 67,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 30)",
        "(line 70,col 9)-(line 70,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI159Test.testNoChildGroup()",
      "begin_line": 76,
      "end_line": 84,
      "comment": "\n     * Tests whether the child group can be omitted.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 28)",
        "(line 79,col 9)-(line 81,col 11)",
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 83,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI159Test.testNoChildGroupRequired()",
      "begin_line": 89,
      "end_line": 103,
      "comment": "\n     * Tests whether a required child groupd can be omitted.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 27)",
        "(line 92,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI159Test.testNoOptions()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Tests parsing an empty command line. Because the parent group is optional\n     * this should be possible.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 28)",
        "(line 112,col 9)-(line 112,col 53)",
        "(line 113,col 9)-(line 113,col 69)",
        "(line 114,col 9)-(line 114,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI159Test.testWithChildOptions()",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n     * Tests parsing a command line with options of the child group.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 28)",
        "(line 123,col 9)-(line 125,col 11)",
        "(line 126,col 9)-(line 126,col 70)",
        "(line 127,col 9)-(line 127,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI159Test.testWithChildOptionsMissing()",
      "begin_line": 134,
      "end_line": 148,
      "comment": "\n     * Tests a command line containing options of the child group, but the\n     * minimum constraint is violated.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugCLI159Test.testRequiredRootGroup()",
      "begin_line": 153,
      "end_line": 168,
      "comment": "\n     * Tests whether the root group is always validated.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 156,col 31)",
        "(line 157,col 9)-(line 167,col 9)"
      ]
    }
  ]
}