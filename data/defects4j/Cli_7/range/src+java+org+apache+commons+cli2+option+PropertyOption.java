{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/option/PropertyOption.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.OptionImpl"
      ],
      "begin_line": 34,
      "end_line": 167,
      "comment": "\n * Handles the java style \"-Dprop\u003dvalue\" opions\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPTION_STRING"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESCRIPTION"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * A default PropertyOption instance\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optionString"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.PropertyOption.PropertyOption()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Creates a new PropertyOption using the default settings of a \"-D\" trigger\n     * and an id of \u0027D\u0027\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.PropertyOption.PropertyOption(java.lang.String, java.lang.String, int)",
      "begin_line": 62,
      "end_line": 69,
      "comment": "\n     * Creates a new PropertyOption using the specified parameters\n     * @param optionString the trigger for the Option\n     * @param description the description of the Option\n     * @param id the id of the Option\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 25)",
        "(line 66,col 9)-(line 66,col 41)",
        "(line 67,col 9)-(line 67,col 39)",
        "(line 68,col 9)-(line 68,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.getPrefixes()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 81,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 53)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 56)",
        "(line 91,col 9)-(line 91,col 64)",
        "(line 92,col 9)-(line 92,col 30)",
        "(line 93,col 9)-(line 93,col 27)",
        "(line 95,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.getTriggers()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 114,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 94)",
        "(line 119,col 9)-(line 119,col 99)",
        "(line 121,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.getPreferredName()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.getDescription()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.PropertyOption.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 156,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 165,col 9)"
      ]
    }
  ]
}