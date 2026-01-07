{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/sequence/KeepCommand.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeepCommand",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.sequence.EditCommand\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 57,
      "comment": "\n * Command representing the keeping of one object present in both sequences.\n * \u003cp\u003e\n * When one object of the first sequence \u003ccode\u003eequals\u003c/code\u003e another objects in\n * the second sequence at the right place, the {@link EditScript edit script}\n * transforming the first sequence into the second sequence uses an instance of\n * this class to represent the keeping of this object. The objects embedded in\n * these type of commands always come from the first sequence.\n *\n * @see SequencesComparator\n * @see EditScript\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.KeepCommand.KeepCommand(T)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Simple constructor. Creates a new instance of KeepCommand\n     *\n     * @param object  the object belonging to both sequences (the object is a\n     *   reference to the instance in the first sequence which is known\n     *   to be equal to an instance in the second sequence)\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.KeepCommand.accept(org.apache.commons.collections4.sequence.CommandVisitor\u003cT\u003e)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Accept a visitor. When a \u003ccode\u003eKeepCommand\u003c/code\u003e accepts a visitor, it\n     * calls its {@link CommandVisitor#visitKeepCommand visitKeepCommand} method.\n     *\n     * @param visitor  the visitor to be accepted\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 46)"
      ]
    }
  ]
}