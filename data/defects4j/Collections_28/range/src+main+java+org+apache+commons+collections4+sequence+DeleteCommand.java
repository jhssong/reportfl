{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/sequence/DeleteCommand.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeleteCommand",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.sequence.EditCommand\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 55,
      "comment": "\n * Command representing the deletion of one object of the first sequence.\n * \u003cp\u003e\n * When one object of the first sequence has no corresponding object in the\n * second sequence at the right place, the {@link EditScript edit script}\n * transforming the first sequence into the second sequence uses an instance of\n * this class to represent the deletion of this object. The objects embedded in\n * these type of commands always come from the first sequence.\n *\n * @see SequencesComparator\n * @see EditScript\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.DeleteCommand.DeleteCommand(T)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Simple constructor. Creates a new instance of {@link DeleteCommand}.\n     *\n     * @param object  the object of the first sequence that should be deleted\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.DeleteCommand.accept(org.apache.commons.collections4.sequence.CommandVisitor\u003cT\u003e)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Accept a visitor. When a \u003ccode\u003eDeleteCommand\u003c/code\u003e accepts a visitor, it calls\n     * its {@link CommandVisitor#visitDeleteCommand visitDeleteCommand} method.\n     *\n     * @param visitor  the visitor to be accepted\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 48)"
      ]
    }
  ]
}