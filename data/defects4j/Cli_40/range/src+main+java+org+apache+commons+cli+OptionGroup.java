{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/OptionGroup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionGroup",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 177,
      "comment": "\n * A group of mutually exclusive options.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "optionMap"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " hold the options "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " the name of the selected option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " specified whether this group is required "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.addOption(org.apache.commons.cli.Option)",
      "begin_line": 49,
      "end_line": 56,
      "comment": "\n     * Add the specified \u003ccode\u003eOption\u003c/code\u003e to this group.\n     *\n     * @param option the option to add to this group\n     * @return this option group with the option added\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 47)",
        "(line 55,col 9)-(line 55,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getNames()",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * @return the names of the options in this group as a \n     * \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getOptions()",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * @return the options in this group as a \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setSelected(org.apache.commons.cli.Option)",
      "begin_line": 84,
      "end_line": 104,
      "comment": "\n     * Set the selected option of this group to \u003ccode\u003ename\u003c/code\u003e.\n     *\n     * @param option the option that is selected\n     * @throws AlreadySelectedException if an option from this group has \n     * already been selected.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 91,col 9)",
        "(line 96,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getSelected()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * @return the selected option name\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setRequired(boolean)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * @param required specifies if this group is required\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.isRequired()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Returns whether this option group is required.\n     *\n     * @return whether this option group is required\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.toString()",
      "begin_line": 137,
      "end_line": 176,
      "comment": "\n     * Returns the stringified version of this OptionGroup.\n     * \n     * @return the stringified representation of this group\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 55)",
        "(line 142,col 9)-(line 142,col 62)",
        "(line 144,col 9)-(line 144,col 25)",
        "(line 146,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 25)",
        "(line 175,col 9)-(line 175,col 31)"
      ]
    }
  ]
}