{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/sequence/EditCommand.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EditCommand",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 82,
      "comment": "\n * Abstract base class for all commands used to transform an objects sequence\n * into another one.\n * \u003cp\u003e\n * When two objects sequences are compared through the\n * {@link SequencesComparator#getScript SequencesComparator.getScript} method,\n * the result is provided has a {@link EditScript script} containing the commands\n * that progressively transform the first sequence into the second one.\n * \u003cp\u003e\n * There are only three types of commands, all of which are subclasses of this\n * abstract class. Each command is associated with one object belonging to at\n * least one of the sequences. These commands are {@link InsertCommand\n * InsertCommand} which correspond to an object of the second sequence being\n * inserted into the first sequence, {@link DeleteCommand DeleteCommand} which\n * correspond to an object of the first sequence being removed and\n * {@link KeepCommand KeepCommand} which correspond to an object of the first\n * sequence which \u003ccode\u003eequals\u003c/code\u003e an object in the second sequence. It is\n * guaranteed that comparison is always performed this way (i.e. the\n * \u003ccode\u003eequals\u003c/code\u003e method of the object from the first sequence is used and\n * the object passed as an argument comes from the second sequence) ; this can\n * be important if subclassing is used for some elements in the first sequence\n * and the \u003ccode\u003eequals\u003c/code\u003e method is specialized.\n *\n * @see SequencesComparator\n * @see EditScript\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Object on which the command should be applied. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.EditCommand.EditCommand(T)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Simple constructor. Creates a new instance of EditCommand\n     *\n     * @param object  reference to the object associated with this command, this\n     *   refers to an element of one of the sequences being compared\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditCommand.getObject()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns the object associated with this command.\n     *\n     * @return the object on which the command is applied\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.EditCommand.accept(org.apache.commons.collections4.sequence.CommandVisitor\u003cT\u003e)",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Accept a visitor.\n     * \u003cp\u003e\n     * This method is invoked for each commands belonging to\n     * an {@link EditScript EditScript}, in order to implement the visitor design pattern\n     *\n     * @param visitor  the visitor to be accepted\n     ",
      "child_ranges": []
    }
  ]
}