{
  "filepath": "/tmp/Cli-3b/src/java/org/apache/commons/cli/OptionGroup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionGroup",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 162,
      "comment": "\n * A group of mutually exclusive options.\n * @author John Keyes ( john at integralsource.com )\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "optionMap"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " hold the options "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " the name of the selected option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " specified whether this group is required "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.addOption(org.apache.commons.cli.Option)",
      "begin_line": 44,
      "end_line": 51,
      "comment": "\n     * add \u003ccode\u003eopt\u003c/code\u003e to this group\n     *\n     * @param opt the option to add to this group\n     * @return this option group with opt added\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 41)",
        "(line 50,col 9)-(line 50,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getNames()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * @return the names of the options in this group as a \n     * \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getOptions()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * @return the options in this group as a \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setSelected(org.apache.commons.cli.Option)",
      "begin_line": 78,
      "end_line": 94,
      "comment": "\n     * set the selected option of this group to \u003ccode\u003ename\u003c/code\u003e.\n     * @param opt the option that is selected\n     * @throws AlreadySelectedException if an option from this group has \n     * already been selected.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getSelected()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * @return the selected option name\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setRequired(boolean)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * @param required specifies if this group is required\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.isRequired()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Returns whether this option group is required.\n     *\n     * @return whether this option group is required\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.toString()",
      "begin_line": 126,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eReturns the stringified version of this OptionGroup.\u003c/p\u003e\n     * @return the stringified representation of this group\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 47)",
        "(line 130,col 9)-(line 130,col 48)",
        "(line 132,col 9)-(line 132,col 25)",
        "(line 134,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 25)",
        "(line 160,col 9)-(line 160,col 31)"
      ]
    }
  ]
}