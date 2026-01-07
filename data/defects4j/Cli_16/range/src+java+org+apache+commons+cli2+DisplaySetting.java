{
  "filepath": "/tmp/Cli-16b/src/java/org/apache/commons/cli2/DisplaySetting.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DisplaySetting",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 155,
      "comment": "\n * An enum of possible display settings. These settings are used to control the\n * presence of various features in the String representations of options,\n * CommandLines and usage strings.  Usually a Set of DisplaySetting instances\n * will be passed to a method that will lookup the presence of the values.\n "
    },
    {
      "type": "field",
      "varNames": [
        "all"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * A Set guarenteed to contain all possible DisplaySetting values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * A Set guarenteed to contain no DisplaySetting values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_ALIASES"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": "\n     * Indicates that aliases should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_OPTIONAL"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": "\n     * Indicates that optionality should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_PROPERTY_OPTION"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * Indicates that property options should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_SWITCH_ENABLED"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": "\n     * Indicates that switches should be included enabled\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_SWITCH_DISABLED"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": "\n     * Indicates that switches should be included disabled\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_NAME"
      ],
      "begin_line": 76,
      "end_line": 77,
      "comment": "\n     * Indicates that group names should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_EXPANDED"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": "\n     * Indicates that groups should be included expanded\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_ARGUMENT"
      ],
      "begin_line": 88,
      "end_line": 89,
      "comment": "\n     * Indicates that group arguments should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_OUTER"
      ],
      "begin_line": 94,
      "end_line": 95,
      "comment": "\n     * Indicates that group outer brackets should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_ARGUMENT_NUMBERED"
      ],
      "begin_line": 100,
      "end_line": 101,
      "comment": "\n     * Indicates that arguments should be included numbered\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_ARGUMENT_BRACKETED"
      ],
      "begin_line": 106,
      "end_line": 107,
      "comment": "\n     * Indicates that arguments should be included bracketed\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_PARENT_ARGUMENT"
      ],
      "begin_line": 112,
      "end_line": 113,
      "comment": "\n     * Indicates that arguments of Parents should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_PARENT_CHILDREN"
      ],
      "begin_line": 118,
      "end_line": 119,
      "comment": "\n     * Indicates that children of Parents should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The name of the setting\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The hashCode of the setting\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.DisplaySetting.DisplaySetting(java.lang.String)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n     * Creates a new DisplaySetting with the specified name\n     * @param name the name of the setting\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)",
        "(line 137,col 9)-(line 137,col 40)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.DisplaySetting.hashCode()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.DisplaySetting.equals(java.lang.Object)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.DisplaySetting.toString()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 20)"
      ]
    }
  ]
}