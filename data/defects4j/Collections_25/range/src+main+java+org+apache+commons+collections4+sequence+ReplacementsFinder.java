{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/sequence/ReplacementsFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplacementsFinder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.sequence.CommandVisitor\u003cT\u003e"
      ],
      "begin_line": 51,
      "end_line": 109,
      "comment": "\n * This class handles sequences of replacements resulting from a comparison.\n * \u003cp\u003e\n * The comparison of two objects sequences leads to the identification of common\n * parts and parts which only belong to the first or to the second sequence. The\n * common parts appear in the edit script in the form of \u003cem\u003ekeep\u003c/em\u003e commands,\n * they can be considered as synchronization objects between the two sequences.\n * These synchronization objects split the two sequences in synchronized\n * sub-sequences. The first sequence can be transformed into the second one by\n * replacing each synchronized sub-sequence of the first sequence by the\n * corresponding sub-sequence of the second sequence. This is a synthetic way to\n * see an {@link EditScript edit script}, replacing individual\n * {@link DeleteCommand delete}, {@link KeepCommand keep} and\n * {@link InsertCommand insert} commands by fewer replacements acting on\n * complete sub-sequences.\n * \u003cp\u003e\n * This class is devoted to perform this interpretation. It visits an\n * {@link EditScript edit script} (because it implements the\n * {@link CommandVisitor CommandVisitor} interface) and calls a user-supplied\n * handler implementing the {@link ReplacementsHandler ReplacementsHandler}\n * interface to process the sub-sequences.\n *\n * @see ReplacementsHandler\n * @see EditScript\n * @see SequencesComparator\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "pendingInsertions"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pendingDeletions"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "skipped"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Handler to call when synchronized sequences are found. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.ReplacementsFinder.ReplacementsFinder(org.apache.commons.collections4.sequence.ReplacementsHandler\u003cT\u003e)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Simple constructor. Creates a new instance of {@link ReplacementsFinder}.\n     *\n     * @param handler  handler to call when synchronized sequences are found\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 47)",
        "(line 68,col 9)-(line 68,col 30)",
        "(line 69,col 9)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.ReplacementsFinder.visitInsertCommand(T)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Add an object to the pending insertions set.\n     *\n     * @param object  object to insert\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.ReplacementsFinder.visitKeepCommand(T)",
      "begin_line": 89,
      "end_line": 98,
      "comment": "\n     * Handle a synchronization object.\n     * \u003cp\u003e\n     * When a synchronization object is identified, the pending insertions and\n     * pending deletions sets are provided to the user handler as subsequences.\n     *\n     * @param object  synchronization object detected\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.ReplacementsFinder.visitDeleteCommand(T)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Add an object to the pending deletions set.\n     *\n     * @param object  object to delete\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 37)"
      ]
    }
  ]
}