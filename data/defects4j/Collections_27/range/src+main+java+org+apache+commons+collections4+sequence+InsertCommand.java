{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/sequence/InsertCommand.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InsertCommand",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.sequence.EditCommand\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 57,
      "comment": "\n * Command representing the insertion of one object of the second sequence.\n * \u003cp\u003e\n * When one object of the second sequence has no corresponding object in the\n * first sequence at the right place, the {@link EditScript edit script}\n * transforming the first sequence into the second sequence uses an instance of\n * this class to represent the insertion of this object. The objects embedded in\n * these type of commands always come from the second sequence.\n *\n * @see SequencesComparator\n * @see EditScript\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.InsertCommand.InsertCommand(T)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Simple constructor. Creates a new instance of InsertCommand\n     *\n     * @param object  the object of the second sequence that should be inserted\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.InsertCommand.accept(org.apache.commons.collections4.sequence.CommandVisitor\u003cT\u003e)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Accept a visitor. When an \u003ccode\u003eInsertCommand\u003c/code\u003e accepts a visitor,\n     * it calls its {@link CommandVisitor#visitInsertCommand visitInsertCommand}\n     * method.\n     *\n     * @param visitor  the visitor to be accepted\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 48)"
      ]
    }
  ]
}