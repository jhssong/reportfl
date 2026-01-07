{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/OptionGroup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionGroup",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 163,
      "comment": "\n * A group of mutually exclusive options.\n * @author John Keyes ( john at integralsource.com )\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "optionMap"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " hold the options "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " the name of the selected option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " specified whether this group is required "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.addOption(org.apache.commons.cli.Option)",
      "begin_line": 45,
      "end_line": 52,
      "comment": "\n     * add \u003ccode\u003eopt\u003c/code\u003e to this group\n     *\n     * @param opt the option to add to this group\n     * @return this option group with opt added\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 41)",
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getNames()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * @return the names of the options in this group as a \n     * \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getOptions()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * @return the options in this group as a \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setSelected(org.apache.commons.cli.Option)",
      "begin_line": 79,
      "end_line": 95,
      "comment": "\n     * set the selected option of this group to \u003ccode\u003ename\u003c/code\u003e.\n     * @param opt the option that is selected\n     * @throws AlreadySelectedException if an option from this group has \n     * already been selected.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getSelected()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * @return the selected option name\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setRequired(boolean)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * @param required specifies if this group is required\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.isRequired()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Returns whether this option group is required.\n     *\n     * @return whether this option group is required\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.toString()",
      "begin_line": 127,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eReturns the stringified version of this OptionGroup.\u003c/p\u003e\n     * @return the stringified representation of this group\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 47)",
        "(line 131,col 9)-(line 131,col 48)",
        "(line 133,col 9)-(line 133,col 25)",
        "(line 135,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 25)",
        "(line 161,col 9)-(line 161,col 31)"
      ]
    }
  ]
}