{
  "filepath": "/tmp/Cli-8b/src/java/org/apache/commons/cli/OptionGroup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionGroup",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 166,
      "comment": "\n * A group of mutually exclusive options.\n * @author John Keyes ( john at integralsource.com )\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "optionMap"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " hold the options "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " the name of the selected option "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " specified whether this group is required "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.addOption(org.apache.commons.cli.Option)",
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * add \u003ccode\u003eopt\u003c/code\u003e to this group\n     *\n     * @param opt the option to add to this group\n     * @return this option group with opt added\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 41)",
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getNames()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * @return the names of the options in this group as a \n     * \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getOptions()",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * @return the options in this group as a \u003ccode\u003eCollection\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setSelected(org.apache.commons.cli.Option)",
      "begin_line": 82,
      "end_line": 98,
      "comment": "\n     * set the selected option of this group to \u003ccode\u003ename\u003c/code\u003e.\n     * @param opt the option that is selected\n     * @throws AlreadySelectedException if an option from this group has \n     * already been selected.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.getSelected()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * @return the selected option name\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.setRequired(boolean)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * @param required specifies if this group is required\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.isRequired()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Returns whether this option group is required.\n     *\n     * @return whether this option group is required\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionGroup.toString()",
      "begin_line": 130,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eReturns the stringified version of this OptionGroup.\u003c/p\u003e\n     * @return the stringified representation of this group\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 47)",
        "(line 134,col 9)-(line 134,col 48)",
        "(line 136,col 9)-(line 136,col 25)",
        "(line 138,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 25)",
        "(line 164,col 9)-(line 164,col 31)"
      ]
    }
  ]
}