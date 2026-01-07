{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/option/Command.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Command",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.ParentImpl"
      ],
      "begin_line": 42,
      "end_line": 175,
      "comment": "\n * Represents a cvs \"update\" style command line option.\n *\n * Like all Parents, Commands can have child options and can be part of\n * Arguments\n "
    },
    {
      "type": "field",
      "varNames": [
        "preferredName"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The display name for the command "
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The aliases for this command "
    },
    {
      "type": "field",
      "varNames": [
        "triggers"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " All the names for this command "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.Command.Command(java.lang.String, java.lang.String, java.util.Set, boolean, org.apache.commons.cli2.Argument, org.apache.commons.cli2.Group, int)",
      "begin_line": 73,
      "end_line": 99,
      "comment": "\n     * Creates a new Command instance.\n     *\n     * @param preferredName\n     *            The name normally used to refer to the Command\n     * @param description\n     *            A description of the Command\n     * @param aliases\n     *            Alternative names for the Command\n     * @param required\n     *            Whether the Command is required\n     * @param argument\n     *            An Argument that the command takes\n     * @param children\n     *            The Group of child options for this Command\n     * @param id\n     *            A unique id for the Command\n     *\n     * @see ParentImpl#ParentImpl(Argument, Group, String, int, boolean)\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 61)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 43)",
        "(line 90,col 9)-(line 92,col 82)",
        "(line 95,col 9)-(line 95,col 46)",
        "(line 96,col 9)-(line 96,col 39)",
        "(line 97,col 9)-(line 97,col 41)",
        "(line 98,col 9)-(line 98,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Command.processParent(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 101,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 53)",
        "(line 108,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Command.getTriggers()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Command.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 123,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Command.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 133,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 138,col 84)",
        "(line 139,col 9)-(line 139,col 93)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 37)",
        "(line 147,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 54)",
        "(line 167,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.Command.getPreferredName()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 29)"
      ]
    }
  ]
}