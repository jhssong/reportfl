{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/sequence/EditScript.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EditScript",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 133,
      "comment": "\n * This class gathers all the {@link EditCommand commands} needed to transform\n * one objects sequence into another objects sequence.\n * \u003cp\u003e\n * An edit script is the most general view of the differences between two\n * sequences. It is built as the result of the comparison between two sequences\n * by the {@link SequencesComparator SequencesComparator} class. The user can\n * walk through it using the \u003cem\u003evisitor\u003c/em\u003e design pattern.\n * \u003cp\u003e\n * It is guaranteed that the objects embedded in the {@link InsertCommand insert\n * commands} come from the second sequence and that the objects embedded in\n * either the {@link DeleteCommand delete commands} or {@link KeepCommand keep\n * commands} come from the first sequence. This can be important if subclassing\n * is used for some elements in the first sequence and the \u003ccode\u003eequals\u003c/code\u003e\n * method is specialized.\n *\n * @see SequencesComparator\n * @see EditCommand\n * @see CommandVisitor\n * @see ReplacementsHandler\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "commands"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Container for the commands. "
    },
    {
      "type": "field",
      "varNames": [
        "lcsLength"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Length of the longest common subsequence. "
    },
    {
      "type": "field",
      "varNames": [
        "modifications"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Number of modifications. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.EditScript.EditScript()",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Simple constructor. Creates a new empty script.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 51)",
        "(line 62,col 9)-(line 62,col 22)",
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditScript.append(org.apache.commons.collections4.sequence.KeepCommand\u003cT\u003e)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Add a keep command to the script.\n     *\n     * @param command  command to add\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 30)",
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditScript.append(org.apache.commons.collections4.sequence.InsertCommand\u003cT\u003e)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Add an insert command to the script.\n     *\n     * @param command  command to add\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditScript.append(org.apache.commons.collections4.sequence.DeleteCommand\u003cT\u003e)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Add a delete command to the script.\n     *\n     * @param command  command to add\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 30)",
        "(line 93,col 9)-(line 93,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditScript.visit(org.apache.commons.collections4.sequence.CommandVisitor\u003cT\u003e)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\n     * Visit the script. The script implements the \u003cem\u003evisitor\u003c/em\u003e design\n     * pattern, this method is the entry point to which the user supplies its\n     * own visitor, the script will be responsible to drive it through the\n     * commands in order and call the appropriate method as each command is\n     * encountered.\n     *\n     * @param visitor  the visitor that will visit all commands in turn\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditScript.getLCSLength()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Get the length of the Longest Common Subsequence (LCS). The length of the\n     * longest common subsequence is the number of {@link KeepCommand keep\n     * commands} in the script.\n     *\n     * @return length of the Longest Common Subsequence\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditScript.getModifications()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Get the number of effective modifications. The number of effective\n     * modification is the number of {@link DeleteCommand delete} and\n     * {@link InsertCommand insert} commands in the script.\n     *\n     * @return number of effective modifications\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    }
  ]
}