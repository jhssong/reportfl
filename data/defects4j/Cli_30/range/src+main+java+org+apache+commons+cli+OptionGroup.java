{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/OptionGroup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionGroup",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 176,
      "comment": "\n * A group of mutually exclusive options.\n *\n * @author John Keyes ( john at integralsource.com )\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "optionMap"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " hold the options "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " the name of the selected option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " specified whether this group is required "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.addOption(org.apache.commons.cli.Option)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "\n     * Add the specified \u003ccode\u003eOption\u003c/code\u003e to this group.\n     *\n     * @param option the option to add to this group\n     * @return this option group with the option added\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 47)",
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getNames()",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * @return the names of the options in this group as a \n     * \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getOptions()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * @return the options in this group as a \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setSelected(org.apache.commons.cli.Option)",
      "begin_line": 87,
      "end_line": 107,
      "comment": "\n     * Set the selected option of this group to \u003ccode\u003ename\u003c/code\u003e.\n     *\n     * @param option the option that is selected\n     * @throws AlreadySelectedException if an option from this group has \n     * already been selected.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 94,col 9)",
        "(line 99,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getSelected()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * @return the selected option name\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setRequired(boolean)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * @param required specifies if this group is required\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.isRequired()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Returns whether this option group is required.\n     *\n     * @return whether this option group is required\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.toString()",
      "begin_line": 140,
      "end_line": 175,
      "comment": "\n     * Returns the stringified version of this OptionGroup.\n     * \n     * @return the stringified representation of this group\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 47)",
        "(line 144,col 9)-(line 144,col 48)",
        "(line 146,col 9)-(line 146,col 25)",
        "(line 148,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 25)",
        "(line 174,col 9)-(line 174,col 31)"
      ]
    }
  ]
}