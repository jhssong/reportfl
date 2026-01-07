{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/DisplaySetting.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DisplaySetting",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 162,
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
      "comment": "\n     * A Set guaranteed to contain all possible DisplaySetting values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * A Set guaranteed to contain no DisplaySetting values\n     "
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
        "DISPLAY_OPTIONAL_CHILD_GROUP"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n     * Indicates that optional child groups should be displayed in square\n     * brackets.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_PROPERTY_OPTION"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": "\n     * Indicates that property options should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_SWITCH_ENABLED"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": "\n     * Indicates that switches should be included enabled\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_SWITCH_DISABLED"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": "\n     * Indicates that switches should be included disabled\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_NAME"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": "\n     * Indicates that group names should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_EXPANDED"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * Indicates that groups should be included expanded\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_ARGUMENT"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": "\n     * Indicates that group arguments should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_GROUP_OUTER"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n     * Indicates that group outer brackets should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_ARGUMENT_NUMBERED"
      ],
      "begin_line": 107,
      "end_line": 108,
      "comment": "\n     * Indicates that arguments should be included numbered\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_ARGUMENT_BRACKETED"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": "\n     * Indicates that arguments should be included bracketed\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_PARENT_ARGUMENT"
      ],
      "begin_line": 119,
      "end_line": 120,
      "comment": "\n     * Indicates that arguments of Parents should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_PARENT_CHILDREN"
      ],
      "begin_line": 125,
      "end_line": 126,
      "comment": "\n     * Indicates that children of Parents should be included\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * The name of the setting\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * The hashCode of the setting\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.DisplaySetting.DisplaySetting(java.lang.String)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Creates a new DisplaySetting with the specified name\n     * @param name the name of the setting\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 25)",
        "(line 144,col 9)-(line 144,col 40)",
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.DisplaySetting.hashCode()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.DisplaySetting.equals(java.lang.Object)",
      "begin_line": 152,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.DisplaySetting.toString()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 20)"
      ]
    }
  ]
}